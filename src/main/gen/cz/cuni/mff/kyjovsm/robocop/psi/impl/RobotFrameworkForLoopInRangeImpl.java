// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;

public class RobotFrameworkForLoopInRangeImpl extends ASTWrapperPsiElement implements RobotFrameworkForLoopInRange {

  public RobotFrameworkForLoopInRangeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitForLoopInRange(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkForInRangeDoubleArgument getForInRangeDoubleArgument() {
    return findChildByClass(RobotFrameworkForInRangeDoubleArgument.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForInRangeSingleArgument getForInRangeSingleArgument() {
    return findChildByClass(RobotFrameworkForInRangeSingleArgument.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForInRangeTripleArgument getForInRangeTripleArgument() {
    return findChildByClass(RobotFrameworkForInRangeTripleArgument.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkForLoopExecutionLine> getForLoopExecutionLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkForLoopExecutionLine.class);
  }

}
