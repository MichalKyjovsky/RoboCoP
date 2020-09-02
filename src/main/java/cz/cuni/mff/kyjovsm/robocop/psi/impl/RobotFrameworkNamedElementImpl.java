package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import org.jetbrains.annotations.NotNull;

/**
 * Base class for referenced elements in Robot Framework language,
 * i.e. Library, Resource and Variable. These tokens must implement
 * this class in order to secure referencing functionality across the
 * project.
 */
public abstract class RobotFrameworkNamedElementImpl extends ASTWrapperPsiElement implements RobotFrameworkNamedElement {
  public RobotFrameworkNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }
}
