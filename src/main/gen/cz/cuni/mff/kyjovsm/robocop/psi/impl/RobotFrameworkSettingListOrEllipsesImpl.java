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

public class RobotFrameworkSettingListOrEllipsesImpl extends ASTWrapperPsiElement implements RobotFrameworkSettingListOrEllipses {

  public RobotFrameworkSettingListOrEllipsesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitSettingListOrEllipses(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkEllipsesForSettingTable getEllipsesForSettingTable() {
    return findChildByClass(RobotFrameworkEllipsesForSettingTable.class);
  }

  @Override
  @Nullable
  public RobotFrameworkSettingList getSettingList() {
    return findChildByClass(RobotFrameworkSettingList.class);
  }

}
