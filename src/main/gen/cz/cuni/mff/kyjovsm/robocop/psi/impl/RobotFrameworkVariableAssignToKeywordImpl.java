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

public class RobotFrameworkVariableAssignToKeywordImpl extends ASTWrapperPsiElement implements RobotFrameworkVariableAssignToKeyword {

  public RobotFrameworkVariableAssignToKeywordImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitVariableAssignToKeyword(this);
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
  public RobotFrameworkKeywordCallingTest getKeywordCallingTest() {
    return findNotNullChildByClass(RobotFrameworkKeywordCallingTest.class);
  }

  @Override
  @Nullable
  public RobotFrameworkMultiAssignmentLhs getMultiAssignmentLhs() {
    return findChildByClass(RobotFrameworkMultiAssignmentLhs.class);
  }

  @Override
  @Nullable
  public RobotFrameworkSingleAssignmentLhs getSingleAssignmentLhs() {
    return findChildByClass(RobotFrameworkSingleAssignmentLhs.class);
  }

}
