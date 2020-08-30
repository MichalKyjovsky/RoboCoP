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

public class RobotFrameworkSettingImpl extends ASTWrapperPsiElement implements RobotFrameworkSetting {

  public RobotFrameworkSettingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitSetting(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkDocumentationSetting getDocumentationSetting() {
    return findChildByClass(RobotFrameworkDocumentationSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForceTagsSetting getForceTagsSetting() {
    return findChildByClass(RobotFrameworkForceTagsSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkGenericSetting getGenericSetting() {
    return findChildByClass(RobotFrameworkGenericSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkLibrarySetting getLibrarySetting() {
    return findChildByClass(RobotFrameworkLibrarySetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkMetadataSetting getMetadataSetting() {
    return findChildByClass(RobotFrameworkMetadataSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkResourceSetting getResourceSetting() {
    return findChildByClass(RobotFrameworkResourceSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestSetupSetting getTestSetupSetting() {
    return findChildByClass(RobotFrameworkTestSetupSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestTemplateSetting getTestTemplateSetting() {
    return findChildByClass(RobotFrameworkTestTemplateSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestTimeoutSetting getTestTimeoutSetting() {
    return findChildByClass(RobotFrameworkTestTimeoutSetting.class);
  }

  @Override
  @Nullable
  public RobotFrameworkVariableSetting getVariableSetting() {
    return findChildByClass(RobotFrameworkVariableSetting.class);
  }

}
