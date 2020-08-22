// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkForLoopInRange extends PsiElement {

  @Nullable
  RobotFrameworkDoubleBoundForLoop getDoubleBoundForLoop();

  @Nullable
  RobotFrameworkDoubleBoundForLoopWithStep getDoubleBoundForLoopWithStep();

  @NotNull
  List<RobotFrameworkIndentedKeywordInvocationTest> getIndentedKeywordInvocationTestList();

  @NotNull
  List<RobotFrameworkIndentedVariableAssignToKeyword> getIndentedVariableAssignToKeywordList();

  @Nullable
  RobotFrameworkSingleBoundForLoop getSingleBoundForLoop();

}
