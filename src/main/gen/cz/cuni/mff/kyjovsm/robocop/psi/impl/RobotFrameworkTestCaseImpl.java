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

public class RobotFrameworkTestCaseImpl extends ASTWrapperPsiElement implements RobotFrameworkTestCase {

  public RobotFrameworkTestCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitTestCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<null> getEmptyLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, null.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkTestCaseLine> getTestCaseLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkTestCaseLine.class);
  }

  @Override
  @NotNull
  public RobotFrameworkTestCaseName getTestCaseName() {
    return findNotNullChildByClass(RobotFrameworkTestCaseName.class);
  }

}
