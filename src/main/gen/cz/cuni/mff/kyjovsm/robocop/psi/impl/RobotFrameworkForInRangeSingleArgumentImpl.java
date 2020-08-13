// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cz.cuni.mff.kyjovsm.robocop.psi.*;

public class RobotFrameworkForInRangeSingleArgumentImpl extends ASTWrapperPsiElement implements RobotFrameworkForInRangeSingleArgument {

  public RobotFrameworkForInRangeSingleArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitForInRangeSingleArgument(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RobotFrameworkEllipses> getEllipsesList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkEllipses.class);
  }

  @Override
  @NotNull
  public RobotFrameworkForLoopInRangePrefix getForLoopInRangePrefix() {
    return findNotNullChildByClass(RobotFrameworkForLoopInRangePrefix.class);
  }

  @Override
  @NotNull
  public RobotFrameworkKeywordArg getKeywordArg() {
    return findNotNullChildByClass(RobotFrameworkKeywordArg.class);
  }

}
