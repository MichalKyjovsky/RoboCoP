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

public class RobotFrameworkBracketTagsImpl extends ASTWrapperPsiElement implements RobotFrameworkBracketTags {

  public RobotFrameworkBracketTagsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitBracketTags(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkEllipses getEllipses() {
    return findChildByClass(RobotFrameworkEllipses.class);
  }

  @Override
  @Nullable
  public RobotFrameworkEmptyLine getEmptyLine() {
    return findChildByClass(RobotFrameworkEmptyLine.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkTag> getTagList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkTag.class);
  }

}
