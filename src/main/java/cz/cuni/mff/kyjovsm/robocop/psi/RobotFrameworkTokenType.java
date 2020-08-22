package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Implementation of IElementType type defining type of token later used
 * for lexer, and defining association within developed custom language
 * support.
 */
public class RobotFrameworkTokenType extends IElementType {

  /**
   * Public constructor method called upon to super class.
   * Creates and registers a new element type for the specified language.
   *
   * @param debugName the name of the element type, used for debugging purposes.
   */
  public RobotFrameworkTokenType(@NotNull @NonNls String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * Overridden toString() method of RobotFrameworkTokenType.
   *
   * @return String representation of RobotFrameworkTokenType and IElementType's myDebugName.
   */
  @Override
  public String toString() {
    return "RobotFrameworkTokenType" + super.toString();
  }
}
