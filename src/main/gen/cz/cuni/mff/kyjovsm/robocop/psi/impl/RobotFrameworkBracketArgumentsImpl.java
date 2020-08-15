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

public class RobotFrameworkBracketArgumentsImpl extends ASTWrapperPsiElement implements RobotFrameworkBracketArguments {

  public RobotFrameworkBracketArgumentsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitBracketArguments(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RobotFrameworkArgumentDefinition> getArgumentDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkArgumentDefinition.class);
  }

}
