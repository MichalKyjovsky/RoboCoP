package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.psi.PsiNameIdentifierOwner;

/**
 * An interface to support each element, which suppose to be either renamed
 * or referenced. Such element must implement this interface in order to
 * cooperate with all elements defined by Robot Framework Language.
 */
public interface RobotFrameworkNamedElement extends PsiNameIdentifierOwner {
}
