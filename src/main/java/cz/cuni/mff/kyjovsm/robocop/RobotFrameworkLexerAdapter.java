package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.FlexAdapter;


public class RobotFrameworkLexerAdapter extends FlexAdapter {
  public RobotFrameworkLexerAdapter() {
    super (new RobotFrameworkLexer(null));
  }
}
