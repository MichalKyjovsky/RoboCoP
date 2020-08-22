package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;


public class RobotFrameworkSyntaxHighlighter extends SyntaxHighlighterBase {
  @Override
  public @NotNull Lexer getHighlightingLexer() {
    return new RobotFrameworkLexerAdapter();
  }


  public static final TextAttributesKey HEADER = createTextAttributesKey("RF_HEADER", DefaultLanguageHighlighterColors.CONSTANT);
  public static final TextAttributesKey SETTINGS = createTextAttributesKey("RF_BRACKET_SETTING", DefaultLanguageHighlighterColors.METADATA);
  public static final TextAttributesKey NAMES = createTextAttributesKey("RF_NAMES", DefaultLanguageHighlighterColors.KEYWORD);
  public static final TextAttributesKey DEFINITIONS = createTextAttributesKey("RF_DEFINITIONS", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
  public static final TextAttributesKey DOCUMENTATION = createTextAttributesKey("RF_DOCUMENTATION", DefaultLanguageHighlighterColors.DOC_COMMENT);
  public static final TextAttributesKey ARGUMENTS = createTextAttributesKey("RF_ARGUMENTS", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey TAGS = createTextAttributesKey("RF_TAGS", DefaultLanguageHighlighterColors.STRING);
  public static final TextAttributesKey ERROR = createTextAttributesKey("ERROR", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
  public static final TextAttributesKey COMMENT = createTextAttributesKey("COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
  public static final TextAttributesKey INTEGER = createTextAttributesKey("INTEGER", DefaultLanguageHighlighterColors.NUMBER);
  public static final TextAttributesKey ASSIGNMENT = createTextAttributesKey("ASSIGNMENT", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
  public static final TextAttributesKey COLUMN_SEPARATOR = createTextAttributesKey("COLUMN_SEPARATOR", DefaultLanguageHighlighterColors.COMMA);
  public static final TextAttributesKey VARIABLES = createTextAttributesKey("VARIABLES", DefaultLanguageHighlighterColors.INSTANCE_FIELD);


  private static final TextAttributesKey[] TABLES_HEADER_KEYS = new TextAttributesKey[]{HEADER};
  private static final TextAttributesKey[] SETTINGS_KEYS = new TextAttributesKey[]{SETTINGS};
  private static final TextAttributesKey[] KEYWORD_NAME_KEYS = new TextAttributesKey[]{NAMES};
  private static final TextAttributesKey[] DEFINITIONS_KEYS = new TextAttributesKey[]{DEFINITIONS};
  private static final TextAttributesKey[] DOCUMENTATION_KEYS = new TextAttributesKey[]{DOCUMENTATION};
  private static final TextAttributesKey[] ARGUMENT_KEYS = new TextAttributesKey[]{ARGUMENTS};
  private static final TextAttributesKey[] TAGS_KEYS = new TextAttributesKey[]{TAGS};
  private static final TextAttributesKey[] ERROR_KEYS = new TextAttributesKey[]{ERROR};
  private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
  private static final TextAttributesKey[] INTEGER_KEYS = new TextAttributesKey[]{INTEGER};
  private static final TextAttributesKey[] ASSIGNMENT_KEY = new TextAttributesKey[]{ASSIGNMENT};
  private static final TextAttributesKey[] COLUMN_SEPARATOR_KEYS = new TextAttributesKey[]{COLUMN_SEPARATOR};
  private static final TextAttributesKey[] VARIABLES_KEYS = new TextAttributesKey[]{VARIABLES};

  @Override
  public @NotNull TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
    if (tokenType.equals(RobotFrameworkTypes.KEYWORDS_TABLE_HEADER_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.TEST_CASES_TABLE_HEADER_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.VARIABLES_TABLE_HEADER_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.SETTINGS_TABLE_HEADER_TOKEN)) {
      return TABLES_HEADER_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.BRACKET_DOCUMENTATION_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.BRACKET_SETUP_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.BRACKET_TAGS_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.BRACKET_TEARDOWN_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.BRACKET_TIMEOUT_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.RETURN_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.ARGUMENTS_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.DOCUMENTATION_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.LIBRARY_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.VARIABLE_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.RESOURCE_SETTING_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.FORCE_TAGS_SETTING_KEYWORD_TOKEN)
    ) {
      return SETTINGS_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.ROBOT_KEYWORD_TOKEN)) {
      return KEYWORD_NAME_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.ROBOT_KEYWORD_NAME_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.TEST_CASE_NAME_TOKEN)) {
      return DEFINITIONS_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.DOCUMENTATION_TOKEN)) {
      return DOCUMENTATION_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.ROBOT_KEYWORD_ARGUMENT_TOKEN)) {
      return ARGUMENT_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.TAG_TOKEN)) {
      return TAGS_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.INVALID_SYNTAX_TOKEN)) {
      return ERROR_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.COMMENT_TOKEN)) {
      return COMMENT_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.INTEGER_TOKEN)) {
      return INTEGER_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.ASSIGNMENT_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.ARRAY_ASSIGNMENT_TOKEN)) {
      return ASSIGNMENT_KEY;
    } else if (tokenType.equals(RobotFrameworkTypes.COLUMN_SEPARATOR_TOKEN)) {
      return COLUMN_SEPARATOR_KEYS;
    } else if (tokenType.equals(RobotFrameworkTypes.VARIABLE_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.ARRAY_VARIABLE_TOKEN) ||
            tokenType.equals(RobotFrameworkTypes.ARRAY_VARIABLE_ACCESS_TOKEN)) {
      return VARIABLES_KEYS;
    }
    return new TextAttributesKey[0];
  }
}
