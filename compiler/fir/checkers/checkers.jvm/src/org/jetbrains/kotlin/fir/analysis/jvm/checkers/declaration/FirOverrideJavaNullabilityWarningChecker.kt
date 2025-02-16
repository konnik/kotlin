/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.analysis.jvm.checkers.declaration

import org.jetbrains.kotlin.diagnostics.DiagnosticReporter
import org.jetbrains.kotlin.diagnostics.reportOn
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.analysis.checkers.context.CheckerContext
import org.jetbrains.kotlin.fir.analysis.checkers.declaration.FirAbstractOverrideChecker
import org.jetbrains.kotlin.fir.analysis.checkers.unsubstitutedScope
import org.jetbrains.kotlin.fir.analysis.diagnostics.jvm.FirJvmErrors
import org.jetbrains.kotlin.fir.declarations.*
import org.jetbrains.kotlin.fir.java.enhancement.EnhancedForWarningConeSubstitutor
import org.jetbrains.kotlin.fir.scopes.firOverrideChecker
import org.jetbrains.kotlin.fir.scopes.getDirectOverriddenFunctions
import org.jetbrains.kotlin.fir.scopes.getDirectOverriddenProperties
import org.jetbrains.kotlin.fir.scopes.impl.FirFakeOverrideGenerator
import org.jetbrains.kotlin.fir.symbols.SymbolInternals
import org.jetbrains.kotlin.fir.symbols.lazyResolveToPhase
import org.jetbrains.kotlin.fir.types.coneType
import org.jetbrains.kotlin.fir.types.typeContext
import org.jetbrains.kotlin.utils.addToStdlib.runIf

object FirOverrideJavaNullabilityWarningChecker : FirAbstractOverrideChecker() {
    override fun check(declaration: FirClass, context: CheckerContext, reporter: DiagnosticReporter) {
        val substitutor = EnhancedForWarningConeSubstitutor(context.session.typeContext)
        val scope = declaration.unsubstitutedScope(context)
        val typeCheckerState = context.session.typeContext.newTypeCheckerState(
            errorTypesEqualToAnything = false,
            stubTypesEqualToAnything = false
        )

        for (member in declaration.declarations) {
            var anyBaseEnhanced = false
            var anyReported = false

            if (member is FirSimpleFunction) {
                val enhancedOverrides = scope
                    .getDirectOverriddenFunctions(member.symbol)
                    .map {
                        @OptIn(SymbolInternals::class)
                        val substitutedBase = it.fir.substituteOrNull(substitutor, context) ?: return@map it
                        anyBaseEnhanced = true

                        if (!anyReported && !context.session.firOverrideChecker.isOverriddenFunction(member, substitutedBase)) {
                            anyReported = true
                            reporter.reportOn(
                                member.source,
                                FirJvmErrors.WRONG_NULLABILITY_FOR_JAVA_OVERRIDE,
                                member.symbol,
                                substitutedBase.symbol,
                                context
                            )
                        }

                        substitutedBase.symbol
                    }

                if (anyBaseEnhanced && !anyReported) {
                    member.symbol.checkReturnType(enhancedOverrides, typeCheckerState, context)?.let {
                        reporter.reportOn(
                            member.source, FirJvmErrors.WRONG_NULLABILITY_FOR_JAVA_OVERRIDE, member.symbol, it, context
                        )
                    }
                }
            } else if (member is FirProperty) {
                val enhancedOverrides = scope
                    .getDirectOverriddenProperties(member.symbol)
                    .map {
                        @OptIn(SymbolInternals::class)
                        val substitutedBase = it.fir.substituteOrNull(substitutor, context) ?: return@map it
                        anyBaseEnhanced = true

                        if (!anyReported && !context.session.firOverrideChecker.isOverriddenProperty(member, substitutedBase)) {
                            anyReported = true
                            reporter.reportOn(
                                member.source,
                                FirJvmErrors.WRONG_NULLABILITY_FOR_JAVA_OVERRIDE,
                                member.symbol,
                                substitutedBase.symbol,
                                context
                            )
                        }

                        substitutedBase.symbol
                    }

                if (anyBaseEnhanced && !anyReported) {
                    member.symbol.checkReturnType(enhancedOverrides, typeCheckerState, context)?.let {
                        reporter.reportOn(
                            member.source, FirJvmErrors.WRONG_NULLABILITY_FOR_JAVA_OVERRIDE, member.symbol, it, context
                        )
                    }
                }
            }
        }
    }
}

/**
 * @see org.jetbrains.kotlin.fir.scopes.impl.FirClassSubstitutionScope.createSubstitutionOverrideFunction
 * @see org.jetbrains.kotlin.fir.scopes.impl.FirClassSubstitutionScope.createSubstitutedData
 */
private fun FirSimpleFunction.substituteOrNull(
    substitutor: EnhancedForWarningConeSubstitutor,
    context: CheckerContext,
): FirSimpleFunction? {
    symbol.lazyResolveToPhase(FirResolvePhase.TYPES)
    var isEnhanced = false

    val newParameterTypes = valueParameters.map { substitutor.substituteOrNull(it.returnTypeRef.coneType)?.also { isEnhanced = true } }
    val newContextReceiverTypes = contextReceivers.map { substitutor.substituteOrNull(it.typeRef.coneType)?.also { isEnhanced = true } }
    val newReturnType = substitutor.substituteOrNull(context.returnTypeCalculator.tryCalculateReturnType(this).coneType)?.also { isEnhanced = true }
    val newExtensionReceiverType =
        receiverParameter?.typeRef?.coneType?.let { substitutor.substituteOrNull(it) }?.also { isEnhanced = true }

    return runIf(isEnhanced) {
        FirFakeOverrideGenerator.createCopyForFirFunction(
            FirFakeOverrideGenerator.createSymbolForSubstitutionOverride(symbol),
            this,
            null,
            context.session,
            FirDeclarationOrigin.Enhancement,
            newDispatchReceiverType = null,
            newParameterTypes = newParameterTypes,
            newReturnType = newReturnType,
            newContextReceiverTypes = newContextReceiverTypes,
            newReceiverType = newExtensionReceiverType,
        )
    }
}

/**
 * @see org.jetbrains.kotlin.fir.scopes.impl.FirClassSubstitutionScope.createSubstitutionOverrideProperty
 * @see org.jetbrains.kotlin.fir.scopes.impl.FirClassSubstitutionScope.createSubstitutedData
 */
private fun FirProperty.substituteOrNull(
    substitutor: EnhancedForWarningConeSubstitutor,
    context: CheckerContext,
): FirProperty? {
    if (!isJavaOrEnhancement) return null
    symbol.lazyResolveToPhase(FirResolvePhase.TYPES)
    var isEnhanced = false

    val newContextReceiverTypes = contextReceivers.map { substitutor.substituteOrNull(it.typeRef.coneType)?.also { isEnhanced = true } }
    val newReturnType = substitutor.substituteOrNull(context.returnTypeCalculator.tryCalculateReturnType(this).coneType)?.also { isEnhanced = true }
    val newExtensionReceiverType =
        receiverParameter?.typeRef?.coneType?.let { substitutor.substituteOrNull(it) }?.also { isEnhanced = true }

    return runIf(isEnhanced) {
        FirFakeOverrideGenerator.createCopyForFirProperty(
            FirFakeOverrideGenerator.createSymbolForSubstitutionOverride(symbol),
            this,
            null,
            context.session,
            FirDeclarationOrigin.Enhancement,
            newDispatchReceiverType = null,
            newReturnType = newReturnType,
            newContextReceiverTypes = newContextReceiverTypes,
            newReceiverType = newExtensionReceiverType,
        )
    }
}