/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations")
@TestDataPath("$PROJECT_ROOT")
public class ScriptLazyDeclarationResolveForTypeAnnotationsTestGenerated extends AbstractScriptLazyDeclarationResolveForTypeAnnotationsTest {
    @Test
    public void testAllFilesPresentInLazyResolveTypeAnnotations() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class")
    @TestDataPath("$PROJECT_ROOT")
    public class Class {
        @Test
        public void testAllFilesPresentInClass() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("classAnnotationsInLocalClassScript.kts")
        public void testClassAnnotationsInLocalClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/classAnnotationsInLocalClassScript.kts");
        }

        @Test
        @TestMetadata("delegateFieldWithAnnotationClashScript.kts")
        public void testDelegateFieldWithAnnotationClashScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegateFieldWithAnnotationClashScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotationsScript.kts")
        public void testDelegatedFieldNestedNameClashAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegatedFieldNestedNameClashAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript.kts")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("parameterTypeCollisionAndAnnotationsScript.kts")
        public void testParameterTypeCollisionAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/parameterTypeCollisionAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationImplicitConstructorScript.kts")
        public void testSuperTypeCallNameClashWithAnnotationImplicitConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNameClashWithAnnotationImplicitConstructorScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationScript.kts")
        public void testSuperTypeCallNameClashWithAnnotationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNameClashWithAnnotationScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationImplicitConstructorScript.kts")
        public void testSuperTypeCallNestedNameClashWithAnnotationImplicitConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNestedNameClashWithAnnotationImplicitConstructorScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationScript.kts")
        public void testSuperTypeCallNestedNameClashWithAnnotationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/class/superTypeCallNestedNameClashWithAnnotationScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor")
    @TestDataPath("$PROJECT_ROOT")
    public class Constructor {
        @Test
        public void testAllFilesPresentInConstructor() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("callScript.kts")
        public void testCallScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/callScript.kts");
        }

        @Test
        @TestMetadata("callWithConstructorScript.kts")
        public void testCallWithConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/callWithConstructorScript.kts");
        }

        @Test
        @TestMetadata("parameterWithAnnotationsScript.kts")
        public void testParameterWithAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/parameterWithAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("parameterWithAnnotationsScriptBodyResolve.kts")
        public void testParameterWithAnnotationsScriptBodyResolve() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/parameterWithAnnotationsScriptBodyResolve.kts");
        }

        @Test
        @TestMetadata("propagationToLocalMemberFunctionScript.kts")
        public void testPropagationToLocalMemberFunctionScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/propagationToLocalMemberFunctionScript.kts");
        }

        @Test
        @TestMetadata("referenceScript.kts")
        public void testReferenceScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/referenceScript.kts");
        }

        @Test
        @TestMetadata("referenceWithConstructorScript.kts")
        public void testReferenceWithConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/referenceWithConstructorScript.kts");
        }

        @Test
        @TestMetadata("secondaryConstructorScript.kts")
        public void testSecondaryConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/constructor/secondaryConstructorScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate")
    @TestDataPath("$PROJECT_ROOT")
    public class Delegate {
        @Test
        public void testAllFilesPresentInDelegate() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("delegateFieldWithAnnotationClashScript.kts")
        public void testDelegateFieldWithAnnotationClashScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateFieldWithAnnotationClashScript.kts");
        }

        @Test
        @TestMetadata("delegateWithExplicitTypeScript.kts")
        public void testDelegateWithExplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithExplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("delegateWithExplicitTypeUnavailableScript.kts")
        public void testDelegateWithExplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithExplicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("delegateWithImplicitTypeScript.kts")
        public void testDelegateWithImplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithImplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("delegateWithImplicitTypeUnavailableScript.kts")
        public void testDelegateWithImplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegateWithImplicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotationsScript.kts")
        public void testDelegatedFieldNestedNameClashAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedNameClashAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript.kts")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameScript.kts")
        public void testDelegatedFieldNestedNameScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/delegatedFieldNestedNameScript.kts");
        }

        @Test
        @TestMetadata("fieldScript.kts")
        public void testFieldScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/fieldScript.kts");
        }

        @Test
        @TestMetadata("propertyWithExplicitTypeScript.kts")
        public void testPropertyWithExplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithExplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("propertyWithExplicitTypeUnavailableScript.kts")
        public void testPropertyWithExplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithExplicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("propertyWithImplicitTypeScript.kts")
        public void testPropertyWithImplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithImplicitTypeScript.kts");
        }

        @Test
        @TestMetadata("propertyWithImplicitTypeUnavailableScript.kts")
        public void testPropertyWithImplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/delegate/propertyWithImplicitTypeUnavailableScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/destructuringDeclaration")
    @TestDataPath("$PROJECT_ROOT")
    public class DestructuringDeclaration {
        @Test
        public void testAllFilesPresentInDestructuringDeclaration() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/destructuringDeclaration"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("scriptClassLevel.kts")
        public void testScriptClassLevel() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/destructuringDeclaration/scriptClassLevel.kts");
        }

        @Test
        @TestMetadata("scriptStatementLevel.kts")
        public void testScriptStatementLevel() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/destructuringDeclaration/scriptStatementLevel.kts");
        }

        @Test
        @TestMetadata("scriptStatementLevelAsLastStatement.kts")
        public void testScriptStatementLevelAsLastStatement() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/destructuringDeclaration/scriptStatementLevelAsLastStatement.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType")
    @TestDataPath("$PROJECT_ROOT")
    public class ErrorType {
        @Test
        public void testAllFilesPresentInErrorType() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("errorTypeScript.kts")
        public void testErrorTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType/errorTypeScript.kts");
        }

        @Test
        @TestMetadata("nestedErrorReturnTypeScript.kts")
        public void testNestedErrorReturnTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/errorType/nestedErrorReturnTypeScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function")
    @TestDataPath("$PROJECT_ROOT")
    public class Function {
        @Test
        public void testAllFilesPresentInFunction() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("component1TypeCollisionAndAnnotationsScript.kts")
        public void testComponent1TypeCollisionAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/component1TypeCollisionAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("copyTypeCollisionAndAnnotationsScript.kts")
        public void testCopyTypeCollisionAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/copyTypeCollisionAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashAndAnnotationsAsConstructorScript.kts")
        public void testDelegatedFieldNestedNameClashAndAnnotationsAsConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/delegatedFieldNestedNameClashAndAnnotationsAsConstructorScript.kts");
        }

        @Test
        @TestMetadata("delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructorScript.kts")
        public void testDelegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/delegatedFieldNestedNameClashWithNestedTypesAndAnnotationsAsConstructorScript.kts");
        }

        @Test
        @TestMetadata("explicitTypeScript.kts")
        public void testExplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/explicitTypeScript.kts");
        }

        @Test
        @TestMetadata("generatedComponentNScript.kts")
        public void testGeneratedComponentNScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/generatedComponentNScript.kts");
        }

        @Test
        @TestMetadata("generatedCopyScript.kts")
        public void testGeneratedCopyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/generatedCopyScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeScript.kts")
        public void testImplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/implicitTypeScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeUnavailableScript.kts")
        public void testImplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/implicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("localImplicitTypeUnavailableInImplicitBodyScript.kts")
        public void testLocalImplicitTypeUnavailableInImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/localImplicitTypeUnavailableInImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("localImplicitTypeUnavailableScript.kts")
        public void testLocalImplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/localImplicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("multiDeclarationScript.kts")
        public void testMultiDeclarationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/multiDeclarationScript.kts");
        }

        @Test
        @TestMetadata("parameterAsImplicitReturnTypePropagationScript.kts")
        public void testParameterAsImplicitReturnTypePropagationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/parameterAsImplicitReturnTypePropagationScript.kts");
        }

        @Test
        @TestMetadata("parameterAsImplicitReturnTypeScript.kts")
        public void testParameterAsImplicitReturnTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/parameterAsImplicitReturnTypeScript.kts");
        }

        @Test
        @TestMetadata("parameterAsImplicitReturnTypeScriptBodyResolve.kts")
        public void testParameterAsImplicitReturnTypeScriptBodyResolve() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/parameterAsImplicitReturnTypeScriptBodyResolve.kts");
        }

        @Test
        @TestMetadata("propagationBetweenLocalMemberFunctionsImplicitBodyScript.kts")
        public void testPropagationBetweenLocalMemberFunctionsImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/propagationBetweenLocalMemberFunctionsImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("propagationBetweenLocalMemberFunctionsScript.kts")
        public void testPropagationBetweenLocalMemberFunctionsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/propagationBetweenLocalMemberFunctionsScript.kts");
        }

        @Test
        @TestMetadata("propagationToLocalMemberFunctionImplicitBodyScript.kts")
        public void testPropagationToLocalMemberFunctionImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/propagationToLocalMemberFunctionImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("propagationToLocalMemberFunctionScript.kts")
        public void testPropagationToLocalMemberFunctionScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/propagationToLocalMemberFunctionScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationImplicitConstructorScript.kts")
        public void testSuperTypeCallNameClashWithAnnotationImplicitConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNameClashWithAnnotationImplicitConstructorScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNameClashWithAnnotationScript.kts")
        public void testSuperTypeCallNameClashWithAnnotationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNameClashWithAnnotationScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationImplicitConstructorScript.kts")
        public void testSuperTypeCallNestedNameClashWithAnnotationImplicitConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNestedNameClashWithAnnotationImplicitConstructorScript.kts");
        }

        @Test
        @TestMetadata("superTypeCallNestedNameClashWithAnnotationScript.kts")
        public void testSuperTypeCallNestedNameClashWithAnnotationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/superTypeCallNestedNameClashWithAnnotationScript.kts");
        }

        @Test
        @TestMetadata("typeParameterAnnotationsInLocalClassScript.kts")
        public void testTypeParameterAnnotationsInLocalClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/function/typeParameterAnnotationsInLocalClassScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/initializer")
    @TestDataPath("$PROJECT_ROOT")
    public class Initializer {
        @Test
        public void testAllFilesPresentInInitializer() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/initializer"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("classInitializerScript.kts")
        public void testClassInitializerScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/initializer/classInitializerScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property")
    @TestDataPath("$PROJECT_ROOT")
    public class Property {
        @Test
        public void testAllFilesPresentInProperty() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("constructorParameterScript.kts")
        public void testConstructorParameterScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/constructorParameterScript.kts");
        }

        @Test
        @TestMetadata("explicitTypeScript.kts")
        public void testExplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/explicitTypeScript.kts");
        }

        @Test
        @TestMetadata("generatedPropertyFromConstructorScript.kts")
        public void testGeneratedPropertyFromConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/generatedPropertyFromConstructorScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeFromIncorrectAccessorsPropagationScript.kts")
        public void testImplicitTypeFromIncorrectAccessorsPropagationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeFromIncorrectAccessorsPropagationScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeFromIncorrectAccessorsScript.kts")
        public void testImplicitTypeFromIncorrectAccessorsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeFromIncorrectAccessorsScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeFromIncorrectSetterPropagationScript.kts")
        public void testImplicitTypeFromIncorrectSetterPropagationScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeFromIncorrectSetterPropagationScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeFromIncorrectSetterScript.kts")
        public void testImplicitTypeFromIncorrectSetterScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeFromIncorrectSetterScript.kts");
        }

        @Test
        @TestMetadata("implicitTypeScript.kts")
        public void testImplicitTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/implicitTypeScript.kts");
        }

        @Test
        @TestMetadata("localDelegatedPropertyWithPropagatedTypeScript.kts")
        public void testLocalDelegatedPropertyWithPropagatedTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localDelegatedPropertyWithPropagatedTypeScript.kts");
        }

        @Test
        @TestMetadata("localDelegatedPropertyWithPropagatedTypeUnavailableScript.kts")
        public void testLocalDelegatedPropertyWithPropagatedTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localDelegatedPropertyWithPropagatedTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("localImplicitTypeUnavailableInImplicitBodyScript.kts")
        public void testLocalImplicitTypeUnavailableInImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localImplicitTypeUnavailableInImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("localImplicitTypeUnavailableScript.kts")
        public void testLocalImplicitTypeUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localImplicitTypeUnavailableScript.kts");
        }

        @Test
        @TestMetadata("localPropertyWithPropagatedTypeScript.kts")
        public void testLocalPropertyWithPropagatedTypeScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/localPropertyWithPropagatedTypeScript.kts");
        }

        @Test
        @TestMetadata("propagationBetweenLocalMemberPropertiesImplicitBodyScript.kts")
        public void testPropagationBetweenLocalMemberPropertiesImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propagationBetweenLocalMemberPropertiesImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("propagationBetweenLocalMemberPropertiesScript.kts")
        public void testPropagationBetweenLocalMemberPropertiesScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propagationBetweenLocalMemberPropertiesScript.kts");
        }

        @Test
        @TestMetadata("propagationToLocalMemberPropertyImplicitBodyScript.kts")
        public void testPropagationToLocalMemberPropertyImplicitBodyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propagationToLocalMemberPropertyImplicitBodyScript.kts");
        }

        @Test
        @TestMetadata("propagationToLocalMemberPropertyScript.kts")
        public void testPropagationToLocalMemberPropertyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propagationToLocalMemberPropertyScript.kts");
        }

        @Test
        @TestMetadata("propertyTypeCollisionAndAnnotationsScript.kts")
        public void testPropertyTypeCollisionAndAnnotationsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/propertyTypeCollisionAndAnnotationsScript.kts");
        }

        @Test
        @TestMetadata("resultWithPropagatedType.kts")
        public void testResultWithPropagatedType() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/resultWithPropagatedType.kts");
        }

        @Test
        @TestMetadata("resultWithPropagatedTypeUnavailable.kts")
        public void testResultWithPropagatedTypeUnavailable() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/resultWithPropagatedTypeUnavailable.kts");
        }

        @Test
        @TestMetadata("typeParameterAnnotationsInLocalClassScript.kts")
        public void testTypeParameterAnnotationsInLocalClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/property/typeParameterAnnotationsInLocalClassScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride")
    @TestDataPath("$PROJECT_ROOT")
    public class SubstitutionOverride {
        @Test
        public void testAllFilesPresentInSubstitutionOverride() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("constructorCallSiteScript.kts")
        public void testConstructorCallSiteScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/constructorCallSiteScript.kts");
        }

        @Test
        @TestMetadata("constructorScript.kts")
        public void testConstructorScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/constructorScript.kts");
        }

        @Test
        @TestMetadata("functionScript.kts")
        public void testFunctionScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/functionScript.kts");
        }

        @Test
        @TestMetadata("functionUnavailableScript.kts")
        public void testFunctionUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/functionUnavailableScript.kts");
        }

        @Test
        @TestMetadata("implicitFunctionScript.kts")
        public void testImplicitFunctionScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitFunctionScript.kts");
        }

        @Test
        @TestMetadata("implicitFunctionUnavailableScript.kts")
        public void testImplicitFunctionUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitFunctionUnavailableScript.kts");
        }

        @Test
        @TestMetadata("implicitPropertyAndReceiverScript.kts")
        public void testImplicitPropertyAndReceiverScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitPropertyAndReceiverScript.kts");
        }

        @Test
        @TestMetadata("implicitPropertyScript.kts")
        public void testImplicitPropertyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitPropertyScript.kts");
        }

        @Test
        @TestMetadata("implicitPropertyUnavailableScript.kts")
        public void testImplicitPropertyUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/implicitPropertyUnavailableScript.kts");
        }

        @Test
        @TestMetadata("propertyScript.kts")
        public void testPropertyScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/propertyScript.kts");
        }

        @Test
        @TestMetadata("propertyUnavailableScript.kts")
        public void testPropertyUnavailableScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/substitutionOverride/propertyUnavailableScript.kts");
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty")
    @TestDataPath("$PROJECT_ROOT")
    public class SyntheticProperty {
        @Test
        public void testAllFilesPresentInSyntheticProperty() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/syntheticProperty"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias")
    @TestDataPath("$PROJECT_ROOT")
    public class TypeAlias {
        @Test
        public void testAllFilesPresentInTypeAlias() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias"), Pattern.compile("^(.+)\\.(kts)$"), null, true);
        }

        @Test
        @TestMetadata("insideFunctionComplexScript.kts")
        public void testInsideFunctionComplexScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/insideFunctionComplexScript.kts");
        }

        @Test
        @TestMetadata("insideFunctionScript.kts")
        public void testInsideFunctionScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/insideFunctionScript.kts");
        }

        @Test
        @TestMetadata("nestedAliasWithNestedAnnotationInLocalClassScript.kts")
        public void testNestedAliasWithNestedAnnotationInLocalClassScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/nestedAliasWithNestedAnnotationInLocalClassScript.kts");
        }

        @Test
        @TestMetadata("simpleScript.kts")
        public void testSimpleScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/simpleScript.kts");
        }

        @Test
        @TestMetadata("withMissedArgumentsScript.kts")
        public void testWithMissedArgumentsScript() throws Exception {
            runTest("analysis/low-level-api-fir/testData/lazyResolveTypeAnnotations/typeAlias/withMissedArgumentsScript.kts");
        }
    }
}
