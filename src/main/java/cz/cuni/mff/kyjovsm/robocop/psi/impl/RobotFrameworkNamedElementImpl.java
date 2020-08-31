package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public abstract class RobotFrameworkNamedElementImpl extends ASTWrapperPsiElement implements RobotFrameworkNamedElement {
  public RobotFrameworkNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }
}
