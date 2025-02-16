/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.transformers

import org.jetbrains.kotlin.analysis.low.level.api.fir.api.targets.LLFirResolveTarget
import org.jetbrains.kotlin.analysis.low.level.api.fir.file.builder.LLFirLockProvider
import org.jetbrains.kotlin.fir.FirElementWithResolveState
import org.jetbrains.kotlin.fir.declarations.FirRegularClass
import org.jetbrains.kotlin.fir.declarations.FirResolvePhase
import org.jetbrains.kotlin.fir.resolve.ScopeSession
import org.jetbrains.kotlin.fir.resolve.transformers.body.resolve.FirResolveContextCollector
import org.jetbrains.kotlin.fir.resolve.transformers.plugin.FirCompanionGenerationTransformer

internal object LLFirGeneratedCompanionObjectLazyResolver : LLFirLazyResolver(FirResolvePhase.COMPANION_GENERATION) {
    override fun resolve(
        target: LLFirResolveTarget,
        lockProvider: LLFirLockProvider,
        scopeSession: ScopeSession,
        towerDataContextCollector: FirResolveContextCollector?,
    ) {
        val resolver = LLFirCompanionGenerationTargetResolver(target, lockProvider)
        resolver.resolveDesignation()
    }
}

private class LLFirCompanionGenerationTargetResolver(
    target: LLFirResolveTarget,
    lockProvider: LLFirLockProvider,
) : LLFirTargetResolver(target, lockProvider, FirResolvePhase.COMPANION_GENERATION) {
    private val transformer: FirCompanionGenerationTransformer = FirCompanionGenerationTransformer(resolveTargetSession)

    override fun doLazyResolveUnderLock(target: FirElementWithResolveState) {
        if (target !is FirRegularClass) return
        transformer.generateAndUpdateCompanion(target)
    }
}
