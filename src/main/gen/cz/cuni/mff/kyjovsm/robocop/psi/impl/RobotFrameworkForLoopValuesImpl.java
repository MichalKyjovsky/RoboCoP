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
import null.null;

public class RobotFrameworkForLoopValuesImpl extends ASTWrapperPsiElement implements RobotFrameworkForLoopValues {

  public RobotFrameworkForLoopValuesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitForLoopValues(this);
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
  public List<null> getEmptyLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, null.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkKeywordArgList> getKeywordArgListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkKeywordArgList.class);
  }

}
