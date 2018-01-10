/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.allopen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class BytecodeListingTestForAllOpenGenerated extends AbstractBytecodeListingTestForAllOpen {
    public void testAllFilesPresentInBytecodeListing() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/allopen/allopen-cli/testData/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("allOpenOnNotClasses.kt")
    public void testAllOpenOnNotClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/allOpenOnNotClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("alreadyOpen.kt")
    public void testAlreadyOpen() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/alreadyOpen.kt");
        doTest(fileName);
    }

    @TestMetadata("anonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/anonymousObject.kt");
        doTest(fileName);
    }

    @TestMetadata("explicitFinal.kt")
    public void testExplicitFinal() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/explicitFinal.kt");
        doTest(fileName);
    }

    @TestMetadata("metaAnnotation.kt")
    public void testMetaAnnotation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/metaAnnotation.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedInner.kt")
    public void testNestedInner() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/nestedInner.kt");
        doTest(fileName);
    }

    @TestMetadata("noAllOpen.kt")
    public void testNoAllOpen() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/noAllOpen.kt");
        doTest(fileName);
    }

    @TestMetadata("privateMembers.kt")
    public void testPrivateMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/privateMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("sealed.kt")
    public void testSealed() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/sealed.kt");
        doTest(fileName);
    }

    @TestMetadata("severalAllOpen.kt")
    public void testSeveralAllOpen() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/severalAllOpen.kt");
        doTest(fileName);
    }

    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/simple.kt");
        doTest(fileName);
    }

    @TestMetadata("springAnnotations.kt")
    public void testSpringAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/springAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("superClassAnnotation.kt")
    public void testSuperClassAnnotation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/allopen/allopen-cli/testData/bytecodeListing/superClassAnnotation.kt");
        doTest(fileName);
    }
}
