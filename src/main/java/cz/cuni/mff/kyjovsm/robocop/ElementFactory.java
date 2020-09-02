package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.util.PsiTreeUtil;
import cz.cuni.mff.kyjovsm.robocop.psi.*;

import java.util.Collection;

import static java.lang.String.format;

/**
 * Class providing methods for creation of RobotFrameworkFile.
 */
public class ElementFactory {
  public static RobotFrameworkKeywordName createKeywordTitle(Project project, String keywordDefName) {
    String template = "*** Keywords ***\n" +
            "%s\n" +
            "  Log to console  Testing functionality";
    RobotFrameworkPsiFile file = createFile(project, format(template, keywordDefName));
    RobotFrameworkTable table = file.findChildByClass(RobotFrameworkTable.class);
    if (table == null || table.getKeywordsTable() == null) {
      return null;
    }
    RobotFrameworkKeywordsTable keywordsTable = table.getKeywordsTable();
    for (RobotFrameworkKeywordDefinition robotKeywordDefinition : keywordsTable.getKeywordDefinitionList()) {
      return robotKeywordDefinition.getKeywordName();
    }
    return null;
  }

  public static RobotFrameworkPsiFile createFile(Project project, String text) {
    String name = "TestCase_N.robot";
    return (RobotFrameworkPsiFile) PsiFileFactory.getInstance(project)
            .createFileFromText(name, RobotFrameworkFileType.INSTANCE, text);
  }

  public static RobotFrameworkScalarDefaultArgValue createScalarDefaultArgValue(Project project, String scalarVarName) {
    String template = "*** Keywords ***\n" +
            "My CustomKeyword\n" +
            "  [Arguments]  ${Var}=A value\n" +
            "  Log  ${Var}\n";
    RobotFrameworkPsiFile file = createFile(project, format(template, scalarVarName));
    return PsiTreeUtil.findChildOfType(file, RobotFrameworkScalarDefaultArgValue.class);
  }

  public static RobotFrameworkKeywordArgument createKeywordArg(Project project, String text) {
    String template = "*** Test Cases ***\n Test Case A\n  Keywords  %s\n";
    RobotFrameworkPsiFile file = createFile(project, format(template, text));
    Collection<RobotFrameworkKeywordArgument> results = PsiTreeUtil.findChildrenOfType(file, RobotFrameworkKeywordArgument.class);
    return results.isEmpty() ? null : results.iterator().next();
  }

  public static RobotFrameworkKeyword createKeyword(Project project, String text) {
    String template = "*** Test Cases ***\nSome Test Case\n    %s\n";
    RobotFrameworkPsiFile file = createFile(project, format(template, text));
    RobotFrameworkTable table = file.findChildByClass(RobotFrameworkTable.class);
    if (table == null || table.getTestCasesTable() == null) {
      return null;
    }
    RobotFrameworkTestCasesTable testCasesTable = table.getTestCasesTable();
    for (RobotFrameworkTestCase robotTestCase : testCasesTable.getTestCaseList()) {
      for (RobotFrameworkTestCaseLine robotTestcaseLine : robotTestCase.getTestCaseLineList()) {
        if (robotTestcaseLine.getExecutionLine() == null || robotTestcaseLine.getExecutionLine().getKeywordCallingTest() == null) {
          continue;
        }
        RobotFrameworkKeywordCallingTest invocation = robotTestcaseLine.getExecutionLine().getKeywordCallingTest();
        return invocation.getKeyword();
      }
    }
    return null;
  }

  public static RobotFrameworkScalarAssignment createScalarAssignment(Project project, String scalarVarName) {
    String template = "*** Test Cases ***\n" +
            "My Test Case\n" +
            "   ${s}   Evaluate   '1 + 1'";
    RobotFrameworkPsiFile file = createFile(project, format(template, scalarVarName));
    return PsiTreeUtil.findChildOfType(file, RobotFrameworkScalarAssignment.class);
  }

  public static RobotFrameworkScalarVariable createScalarVariable(Project project, String scalarVarName) {
    String template = "*** Test Case ***\n" +
            "Test Case\n" +
            "  Log  ${s}";
    RobotFrameworkPsiFile file = createFile(project, format(template, scalarVarName));
    return PsiTreeUtil.findChildOfType(file, RobotFrameworkScalarVariable.class);
  }

  public static RobotFrameworkArgumentDefinition createArgumentDef(Project project, String scalarVarName) {
    String template = "*** Keywords ***\n" +
            "My Keyword\n" +
            "  [Arguments]  ${Var}\n" +
            "  Log  ${Var}  Console=True\n";
    RobotFrameworkPsiFile file = createFile(project, format(template, scalarVarName));
    return PsiTreeUtil.findChildOfType(file, RobotFrameworkArgumentDefinition.class);
  }

  public static RobotFrameworkReferencedFile createReferencedFile(Project project, String name) {
    final RobotFrameworkFile rfFile = createFileR(project, name);
    return (RobotFrameworkReferencedFile) rfFile.getFirstChild();
  }

  public static RobotFrameworkFile createFileR(Project project, String text) {
    String name = "test_plugin.robot";
    return (RobotFrameworkFile) PsiFileFactory.getInstance(project).createFileFromText(name, RobotFrameworkFileType.INSTANCE, text);
  }

  public static RobotFrameworkScalarAssignmentLhs createScalarAssignmentLhs(Project project, String newName) {
    String template = "*** Test Cases ***\n" +
            "Test Case\n" +
            "  ${s}=   Evaluate   '1 - 1'";
    RobotFrameworkPsiFile file = createFile(project, format(template, newName));
    return PsiTreeUtil.findChildOfType(file, RobotFrameworkScalarAssignmentLhs.class);
  }
}
