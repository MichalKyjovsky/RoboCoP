// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkTestCasesTable extends PsiElement {

  @NotNull
  List<RobotFrameworkEmptyLine> getEmptyLineList();

  @NotNull
  List<RobotFrameworkTestCase> getTestCaseList();

  @NotNull
  RobotFrameworkTestCasesTableHeader getTestCasesTableHeader();

  //WARNING: getNameIdentifier(...) is skipped
  //matching getNameIdentifier(RobotFrameworkTestCasesTable, ...)
  //methods are not found in RobotFrameworkImplUtil

  //WARNING: getPresentation(...) is skipped
  //matching getPresentation(RobotFrameworkTestCasesTable, ...)
  //methods are not found in RobotFrameworkImplUtil

}
