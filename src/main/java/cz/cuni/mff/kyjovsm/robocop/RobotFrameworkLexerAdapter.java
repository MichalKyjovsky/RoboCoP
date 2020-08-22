package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class RobotFrameworkLexerAdapter extends FlexAdapter {
  public RobotFrameworkLexerAdapter() {
    super (new RobotFrameworkLexer(null));
  }
}
