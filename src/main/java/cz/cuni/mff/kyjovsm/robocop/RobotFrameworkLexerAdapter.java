package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.FlexAdapter;


/**
 * An implementation of the adapter for the IntelliJ Platform Lexer API.
 */
public class RobotFrameworkLexerAdapter extends FlexAdapter {
  /**
   * A constructor method. Directly initializing the origin Adapter.
   */
  public RobotFrameworkLexerAdapter() {
    super (new RobotFrameworkLexer(null));
  }
}
