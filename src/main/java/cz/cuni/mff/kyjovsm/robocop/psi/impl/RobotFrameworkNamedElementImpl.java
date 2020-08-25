package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class RobotFrameworkNamedElementImpl extends ASTWrapperPsiElement implements RobotFrameworkNamedElement {
  public RobotFrameworkNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }
}
