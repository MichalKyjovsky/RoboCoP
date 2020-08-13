// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RobotFrameworkForLoopInRange extends PsiElement {

  @Nullable
  RobotFrameworkForInRangeDoubleArgument getForInRangeDoubleArgument();

  @Nullable
  RobotFrameworkForInRangeSingleArgument getForInRangeSingleArgument();

  @Nullable
  RobotFrameworkForInRangeTripleArgument getForInRangeTripleArgument();

  @NotNull
  List<RobotFrameworkForLoopExecutionLine> getForLoopExecutionLineList();

}
