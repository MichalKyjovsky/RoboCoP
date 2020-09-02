package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Class for defining types of tokens for lexer.
 */
public class RobotFrameworkElementType extends IElementType {
  /**
   * Public constructor method called upon to super class.
   * Creates and registers a new element type for the specified language.
   * @param debugName the name of the element type, used for debugging purposes.
   */
  public RobotFrameworkElementType(@NotNull @NonNls String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }
}
