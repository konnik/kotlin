/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.intentions.declarations;

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
@TestMetadata("idea/testData/joinLines")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JoinLinesTestGenerated extends AbstractJoinLinesTest {
    public void testAllFilesPresentInJoinLines() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("idea/testData/joinLines/addSemicolon")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class AddSemicolon extends AbstractJoinLinesTest {
        public void testAllFilesPresentInAddSemicolon() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines/addSemicolon"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ClassDeclarations.kt")
        public void testClassDeclarations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/ClassDeclarations.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionCalls.kt")
        public void testFunctionCalls() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionCalls.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionCallsAndAComment.kt")
        public void testFunctionCallsAndAComment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionCallsAndAComment.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionCallsAndAMultilineComment.kt")
        public void testFunctionCallsAndAMultilineComment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionCallsAndAMultilineComment.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionCallsAndSeveralComments.kt")
        public void testFunctionCallsAndSeveralComments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionCallsAndSeveralComments.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionCallsWithMutlineSeparator.kt")
        public void testFunctionCallsWithMutlineSeparator() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionCallsWithMutlineSeparator.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionDeclarations.kt")
        public void testFunctionDeclarations() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/FunctionDeclarations.kt");
            doTest(fileName);
        }

        @TestMetadata("InsideBraces.kt")
        public void testInsideBraces() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/InsideBraces.kt");
            doTest(fileName);
        }

        @TestMetadata("InsideIfBlock.kt")
        public void testInsideIfBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/InsideIfBlock.kt");
            doTest(fileName);
        }

        @TestMetadata("LocalAssingments.kt")
        public void testLocalAssingments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/LocalAssingments.kt");
            doTest(fileName);
        }

        @TestMetadata("LocalAssingmentsWithSemicolon.kt")
        public void testLocalAssingmentsWithSemicolon() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/LocalAssingmentsWithSemicolon.kt");
            doTest(fileName);
        }

        @TestMetadata("LocalClasses.kt")
        public void testLocalClasses() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/LocalClasses.kt");
            doTest(fileName);
        }

        @TestMetadata("LocalFunctions.kt")
        public void testLocalFunctions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/LocalFunctions.kt");
            doTest(fileName);
        }

        @TestMetadata("MemberFunctions.kt")
        public void testMemberFunctions() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/MemberFunctions.kt");
            doTest(fileName);
        }

        @TestMetadata("WhileAndACall.kt")
        public void testWhileAndACall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/WhileAndACall.kt");
            doTest(fileName);
        }

        @TestMetadata("WhileBlockAndACall.kt")
        public void testWhileBlockAndACall() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/WhileBlockAndACall.kt");
            doTest(fileName);
        }

        @TestMetadata("WhileBlockAndACall2.kt")
        public void testWhileBlockAndACall2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/addSemicolon/WhileBlockAndACall2.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/joinLines/declarationAndAssignment")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DeclarationAndAssignment extends AbstractJoinLinesTest {
        public void testAllFilesPresentInDeclarationAndAssignment() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines/declarationAndAssignment"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("blankLineBetween.kt")
        public void testBlankLineBetween() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/blankLineBetween.kt");
            doTest(fileName);
        }

        @TestMetadata("commentBetween.kt")
        public void testCommentBetween() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/commentBetween.kt");
            doTest(fileName);
        }

        @TestMetadata("longInit.kt")
        public void testLongInit() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/longInit.kt");
            doTest(fileName);
        }

        @TestMetadata("longInit2.kt")
        public void testLongInit2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/longInit2.kt");
            doTest(fileName);
        }

        @TestMetadata("propertyWithAnnotation.kt")
        public void testPropertyWithAnnotation() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/propertyWithAnnotation.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInit.kt")
        public void testSimpleInit() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInit.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInit2.kt")
        public void testSimpleInit2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInit2.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithBackticks.kt")
        public void testSimpleInitWithBackticks() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithBackticks.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithBackticks2.kt")
        public void testSimpleInitWithBackticks2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithBackticks2.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithBackticks3.kt")
        public void testSimpleInitWithBackticks3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithBackticks3.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithComments.kt")
        public void testSimpleInitWithComments() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithComments.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithComments2.kt")
        public void testSimpleInitWithComments2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithComments2.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithSemicolons.kt")
        public void testSimpleInitWithSemicolons() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithSemicolons.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithSemicolons2.kt")
        public void testSimpleInitWithSemicolons2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithSemicolons2.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithSemicolons3.kt")
        public void testSimpleInitWithSemicolons3() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithSemicolons3.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithType.kt")
        public void testSimpleInitWithType() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithType.kt");
            doTest(fileName);
        }

        @TestMetadata("simpleInitWithType2.kt")
        public void testSimpleInitWithType2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/declarationAndAssignment/simpleInitWithType2.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/joinLines/nestedIfs")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NestedIfs extends AbstractJoinLinesTest {
        public void testAllFilesPresentInNestedIfs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines/nestedIfs"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("BlockBody.kt")
        public void testBlockBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/BlockBody.kt");
            doTest(fileName);
        }

        @TestMetadata("ComplexCondition1.kt")
        public void testComplexCondition1() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/ComplexCondition1.kt");
            doTest(fileName);
        }

        @TestMetadata("ComplexCondition2.kt")
        public void testComplexCondition2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/ComplexCondition2.kt");
            doTest(fileName);
        }

        @TestMetadata("InnerWithElse.kt")
        public void testInnerWithElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/InnerWithElse.kt");
            doTest(fileName);
        }

        @TestMetadata("OuterWithElse.kt")
        public void testOuterWithElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/OuterWithElse.kt");
            doTest(fileName);
        }

        @TestMetadata("Simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/nestedIfs/Simple.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/joinLines/removeBraces")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class RemoveBraces extends AbstractJoinLinesTest {
        public void testAllFilesPresentInRemoveBraces() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines/removeBraces"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("CommentAfterStatement.kt")
        public void testCommentAfterStatement() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/CommentAfterStatement.kt");
            doTest(fileName);
        }

        @TestMetadata("CommentAfterStatement2.kt")
        public void testCommentAfterStatement2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/CommentAfterStatement2.kt");
            doTest(fileName);
        }

        @TestMetadata("CommentBeforeStatement.kt")
        public void testCommentBeforeStatement() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/CommentBeforeStatement.kt");
            doTest(fileName);
        }

        @TestMetadata("CommentBeforeStatement2.kt")
        public void testCommentBeforeStatement2() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/CommentBeforeStatement2.kt");
            doTest(fileName);
        }

        @TestMetadata("DoWhile.kt")
        public void testDoWhile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/DoWhile.kt");
            doTest(fileName);
        }

        @TestMetadata("Else.kt")
        public void testElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/Else.kt");
            doTest(fileName);
        }

        @TestMetadata("For.kt")
        public void testFor() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/For.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionBody.kt")
        public void testFunctionBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/FunctionBody.kt");
            doTest(fileName);
        }

        @TestMetadata("FunctionWithOneLineReturn.kt")
        public void testFunctionWithOneLineReturn() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/FunctionWithOneLineReturn.kt");
            doTest(fileName);
        }

        @TestMetadata("If.kt")
        public void testIf() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/If.kt");
            doTest(fileName);
        }

        @TestMetadata("IfWithElse.kt")
        public void testIfWithElse() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/IfWithElse.kt");
            doTest(fileName);
        }

        @TestMetadata("IfWithElseBlockInAssignment.kt")
        public void testIfWithElseBlockInAssignment() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/IfWithElseBlockInAssignment.kt");
            doTest(fileName);
        }

        @TestMetadata("IfWithPostfixAfterElseBlock.kt")
        public void testIfWithPostfixAfterElseBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/IfWithPostfixAfterElseBlock.kt");
            doTest(fileName);
        }

        @TestMetadata("IfWithQualifiedAfterElseBlock.kt")
        public void testIfWithQualifiedAfterElseBlock() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/IfWithQualifiedAfterElseBlock.kt");
            doTest(fileName);
        }

        @TestMetadata("LambdaBody.kt")
        public void testLambdaBody() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/LambdaBody.kt");
            doTest(fileName);
        }

        @TestMetadata("NotSingleLineStatement.kt")
        public void testNotSingleLineStatement() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/NotSingleLineStatement.kt");
            doTest(fileName);
        }

        @TestMetadata("TwoStatements.kt")
        public void testTwoStatements() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/TwoStatements.kt");
            doTest(fileName);
        }

        @TestMetadata("WhenEntry.kt")
        public void testWhenEntry() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/WhenEntry.kt");
            doTest(fileName);
        }

        @TestMetadata("While.kt")
        public void testWhile() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/removeBraces/While.kt");
            doTest(fileName);
        }
    }

    @TestMetadata("idea/testData/joinLines/stringTemplate")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class StringTemplate extends AbstractJoinLinesTest {
        public void testAllFilesPresentInStringTemplate() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/joinLines/stringTemplate"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("firstLineVariable.kt")
        public void testFirstLineVariable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/stringTemplate/firstLineVariable.kt");
            doTest(fileName);
        }

        @TestMetadata("secondLineVariable.kt")
        public void testSecondLineVariable() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/stringTemplate/secondLineVariable.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/stringTemplate/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("threeLines.kt")
        public void testThreeLines() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("idea/testData/joinLines/stringTemplate/threeLines.kt");
            doTest(fileName);
        }
    }
}
