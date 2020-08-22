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

public class RobotFrameworkKeywordSettingImpl extends ASTWrapperPsiElement implements RobotFrameworkKeywordSetting {

  public RobotFrameworkKeywordSettingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitKeywordSetting(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkArgumentsSetting getArgumentsSetting() {
    return findChildByClass(RobotFrameworkArgumentsSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkBracketDocumentation getBracketDocumentation() {
    return findChildByClass(RobotFrameworkBracketDocumentation.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketTeardown getTestCaseBracketTeardown() {
    return findChildByClass(RobotFrameworkTestCaseBracketTeardown.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestCaseBracketTimeout getTestCaseBracketTimeout() {
    return findChildByClass(RobotFrameworkTestCaseBracketTimeout.class);
  }

}
