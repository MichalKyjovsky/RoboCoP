// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RobotFrameworkParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return EMPTY_LINE(b, l + 1);
  }

  /* ********************************************************** */
  // COLON_TOKEN
  public static boolean COLON(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "COLON")) return false;
    if (!nextTokenIs(b, COLON_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON_TOKEN);
    exit_section_(b, m, COLON, r);
    return r;
  }

  /* ********************************************************** */
  // DEFAULT_TAGS_SETTING_TOKEN TAG_LIST_OR_RECURRENCE_NO_COL*
  public static boolean DEFAULT_TAGS_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEFAULT_TAGS_SETTING")) return false;
    if (!nextTokenIs(b, DEFAULT_TAGS_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DEFAULT_TAGS_SETTING, null);
    r = consumeToken(b, DEFAULT_TAGS_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && DEFAULT_TAGS_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TAG_LIST_OR_RECURRENCE_NO_COL*
  private static boolean DEFAULT_TAGS_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEFAULT_TAGS_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TAG_LIST_OR_RECURRENCE_NO_COL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DEFAULT_TAGS_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (COLUMN_SEP_TOKEN DOCUMENTATION_TOKEN) | RECURRENCE_FOR_SETTING_TABLE
  static boolean DOCUMENTATION_OR_RECURRENCE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_OR_RECURRENCE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DOCUMENTATION_OR_RECURRENCE_0(b, l + 1);
    if (!r) r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEP_TOKEN DOCUMENTATION_TOKEN
  private static boolean DOCUMENTATION_OR_RECURRENCE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_OR_RECURRENCE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLUMN_SEP_TOKEN, DOCUMENTATION_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCUMENTATION_SETTING_TOKEN DOCUMENTATION_OR_RECURRENCE*
  public static boolean DOCUMENTATION_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_SETTING")) return false;
    if (!nextTokenIs(b, DOCUMENTATION_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DOCUMENTATION_SETTING, null);
    r = consumeToken(b, DOCUMENTATION_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && DOCUMENTATION_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // DOCUMENTATION_OR_RECURRENCE*
  private static boolean DOCUMENTATION_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DOCUMENTATION_OR_RECURRENCE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOCUMENTATION_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // END_OF_LINE* NEW_LINE_TOKEN
  static boolean EMPTY_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EMPTY_LINE_0(b, l + 1);
    r = r && consumeToken(b, NEW_LINE_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean EMPTY_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_LINE_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EMPTY_LINE_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COLUMN_SEP_TOKEN | WHITESPACE_TOKEN | COMMENT_TOKEN
  static boolean END_OF_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "END_OF_LINE")) return false;
    boolean r;
    r = consumeToken(b, COLUMN_SEP_TOKEN);
    if (!r) r = consumeToken(b, WHITESPACE_TOKEN);
    if (!r) r = consumeToken(b, COMMENT_TOKEN);
    return r;
  }

  /* ********************************************************** */
  // FORCE_TAGS_SETTING_TOKEN TAG_LIST_OR_RECURRENCE_NO_COL*
  public static boolean FORCE_TAGS_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FORCE_TAGS_SETTING")) return false;
    if (!nextTokenIs(b, FORCE_TAGS_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FORCE_TAGS_SETTING, null);
    r = consumeToken(b, FORCE_TAGS_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && FORCE_TAGS_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TAG_LIST_OR_RECURRENCE_NO_COL*
  private static boolean FORCE_TAGS_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FORCE_TAGS_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TAG_LIST_OR_RECURRENCE_NO_COL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FORCE_TAGS_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LIBRARY_TOKEN
  public static boolean LIBRARY_REFERENCE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_REFERENCE")) return false;
    if (!nextTokenIs(b, LIBRARY_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY_TOKEN);
    exit_section_(b, m, LIBRARY_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // LIBRARY_SETTING_TOKEN COLUMN_SEP_TOKEN LIBRARY_REFERENCE SETTING_LIST_OR_RECURRENCE*
  public static boolean LIBRARY_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_SETTING")) return false;
    if (!nextTokenIs(b, LIBRARY_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_SETTING, null);
    r = consumeTokens(b, 0, LIBRARY_SETTING_TOKEN, COLUMN_SEP_TOKEN);
    r = r && LIBRARY_REFERENCE(b, l + 1);
    p = r; // pin = 3
    r = r && LIBRARY_SETTING_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SETTING_LIST_OR_RECURRENCE*
  private static boolean LIBRARY_SETTING_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_SETTING_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTING_LIST_OR_RECURRENCE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LIBRARY_SETTING_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // METADATA_SETTING_TOKEN SETTING_LIST_OR_RECURRENCE*
  public static boolean METADATA_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METADATA_SETTING")) return false;
    if (!nextTokenIs(b, METADATA_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, METADATA_SETTING, null);
    r = consumeToken(b, METADATA_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && METADATA_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SETTING_LIST_OR_RECURRENCE*
  private static boolean METADATA_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METADATA_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTING_LIST_OR_RECURRENCE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "METADATA_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RECURRENCE_TOKEN
  public static boolean RECURRENCE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE")) return false;
    if (!nextTokenIs(b, RECURRENCE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RECURRENCE_TOKEN);
    exit_section_(b, m, RECURRENCE, r);
    return r;
  }

  /* ********************************************************** */
  // EMPTY_LINE WHITESPACE_TOKEN? COLUMN_SEP_TOKEN? RECURRENCE
  public static boolean RECURRENCE_FOR_SETTING_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_FOR_SETTING_TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RECURRENCE_FOR_SETTING_TABLE, "<recurrence for setting table>");
    r = EMPTY_LINE(b, l + 1);
    r = r && RECURRENCE_FOR_SETTING_TABLE_1(b, l + 1);
    r = r && RECURRENCE_FOR_SETTING_TABLE_2(b, l + 1);
    r = r && RECURRENCE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // WHITESPACE_TOKEN?
  private static boolean RECURRENCE_FOR_SETTING_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_FOR_SETTING_TABLE_1")) return false;
    consumeToken(b, WHITESPACE_TOKEN);
    return true;
  }

  // COLUMN_SEP_TOKEN?
  private static boolean RECURRENCE_FOR_SETTING_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_FOR_SETTING_TABLE_2")) return false;
    consumeToken(b, COLUMN_SEP_TOKEN);
    return true;
  }

  /* ********************************************************** */
  // COLUMN_SEP_TOKEN? WHITESPACE_TOKEN? RECURRENCE
  static boolean RECURRENCE_PARAMETER_SETTINGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_PARAMETER_SETTINGS")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_PARAMETER_SETTINGS_0(b, l + 1);
    r = r && RECURRENCE_PARAMETER_SETTINGS_1(b, l + 1);
    r = r && RECURRENCE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEP_TOKEN?
  private static boolean RECURRENCE_PARAMETER_SETTINGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_PARAMETER_SETTINGS_0")) return false;
    consumeToken(b, COLUMN_SEP_TOKEN);
    return true;
  }

  // WHITESPACE_TOKEN?
  private static boolean RECURRENCE_PARAMETER_SETTINGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RECURRENCE_PARAMETER_SETTINGS_1")) return false;
    consumeToken(b, WHITESPACE_TOKEN);
    return true;
  }

  /* ********************************************************** */
  // RF_FILE_TOKEN
  public static boolean REFERENCED_FILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCED_FILE")) return false;
    if (!nextTokenIs(b, RF_FILE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RF_FILE_TOKEN);
    exit_section_(b, m, REFERENCED_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // RESOURCE_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE* COLUMN_SEP_TOKEN REFERENCED_FILE
  public static boolean RESOURCE_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESOURCE_SETTING")) return false;
    if (!nextTokenIs(b, RESOURCE_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_SETTING, null);
    r = consumeToken(b, RESOURCE_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && report_error_(b, RESOURCE_SETTING_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLUMN_SEP_TOKEN)) && r;
    r = p && REFERENCED_FILE(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RECURRENCE_FOR_SETTING_TABLE*
  private static boolean RESOURCE_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESOURCE_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RESOURCE_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LIBRARY_SETTING |
  //             VARIABLES_SETTING |
  //             RESOURCE_SETTING |
  //             DOCUMENTATION_SETTING |
  //             METADATA_SETTING |
  //             SUITE_SETUP_SETTING |
  //             SUITE_TEARDOWN_SETTING |
  //             FORCE_TAGS_SETTING |
  //             DEFAULT_TAGS_SETTING |
  //             TEST_SETUP_SETTING |
  //             TEST_TEARDOWN_SETTING |
  //             TEST_TEMPLATE_SETTING |
  //             TEST_TIMEOUT_SETTING
  public static boolean SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTING, "<setting>");
    r = LIBRARY_SETTING(b, l + 1);
    if (!r) r = VARIABLES_SETTING(b, l + 1);
    if (!r) r = RESOURCE_SETTING(b, l + 1);
    if (!r) r = DOCUMENTATION_SETTING(b, l + 1);
    if (!r) r = METADATA_SETTING(b, l + 1);
    if (!r) r = SUITE_SETUP_SETTING(b, l + 1);
    if (!r) r = SUITE_TEARDOWN_SETTING(b, l + 1);
    if (!r) r = FORCE_TAGS_SETTING(b, l + 1);
    if (!r) r = DEFAULT_TAGS_SETTING(b, l + 1);
    if (!r) r = TEST_SETUP_SETTING(b, l + 1);
    if (!r) r = TEST_TEARDOWN_SETTING(b, l + 1);
    if (!r) r = TEST_TEMPLATE_SETTING(b, l + 1);
    if (!r) r = TEST_TIMEOUT_SETTING(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHITESPACE_TOKEN SETTING END_OF_LINE* |
  //                    RECURRENCE_PARAMETER_SETTINGS END_OF_LINE*
  public static boolean SETTINGS_PARAMETER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_PARAMETER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTINGS_PARAMETER, "<settings parameter>");
    r = SETTINGS_PARAMETER_0(b, l + 1);
    if (!r) r = SETTINGS_PARAMETER_1(b, l + 1);
    exit_section_(b, l, m, r, false, not_a_newline_token_parser_);
    return r;
  }

  // WHITESPACE_TOKEN SETTING END_OF_LINE*
  private static boolean SETTINGS_PARAMETER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_PARAMETER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHITESPACE_TOKEN);
    r = r && SETTING(b, l + 1);
    r = r && SETTINGS_PARAMETER_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean SETTINGS_PARAMETER_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_PARAMETER_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_PARAMETER_0_2", c)) break;
    }
    return true;
  }

  // RECURRENCE_PARAMETER_SETTINGS END_OF_LINE*
  private static boolean SETTINGS_PARAMETER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_PARAMETER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_PARAMETER_SETTINGS(b, l + 1);
    r = r && SETTINGS_PARAMETER_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean SETTINGS_PARAMETER_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_PARAMETER_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_PARAMETER_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SETTINGS_TABLE_HEADER (SETTINGS_PARAMETER EMPTY_LINE | EMPTY_LINE)* (SETTINGS_PARAMETER END_OF_LINE* <<eof>>)?
  public static boolean SETTINGS_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE")) return false;
    if (!nextTokenIs(b, SETTINGS_TABLE_HEADER_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, SETTINGS_TABLE, null);
    r = SETTINGS_TABLE_HEADER(b, l + 1);
    r = r && SETTINGS_TABLE_1(b, l + 1);
    p = r; // pin = 2
    r = r && SETTINGS_TABLE_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (SETTINGS_PARAMETER EMPTY_LINE | EMPTY_LINE)*
  private static boolean SETTINGS_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTINGS_TABLE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_TABLE_1", c)) break;
    }
    return true;
  }

  // SETTINGS_PARAMETER EMPTY_LINE | EMPTY_LINE
  private static boolean SETTINGS_TABLE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_TABLE_1_0_0(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SETTINGS_PARAMETER EMPTY_LINE
  private static boolean SETTINGS_TABLE_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_PARAMETER(b, l + 1);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SETTINGS_PARAMETER END_OF_LINE* <<eof>>)?
  private static boolean SETTINGS_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_2")) return false;
    SETTINGS_TABLE_2_0(b, l + 1);
    return true;
  }

  // SETTINGS_PARAMETER END_OF_LINE* <<eof>>
  private static boolean SETTINGS_TABLE_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_PARAMETER(b, l + 1);
    r = r && SETTINGS_TABLE_2_0_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean SETTINGS_TABLE_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_TABLE_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SETTINGS_TABLE_HEADER_TOKEN EMPTY_LINE
  public static boolean SETTINGS_TABLE_HEADER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_HEADER")) return false;
    if (!nextTokenIs(b, SETTINGS_TABLE_HEADER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SETTINGS_TABLE_HEADER_TOKEN);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, SETTINGS_TABLE_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // (COLUMN_SEP_TOKEN KEYWORD_ARG)+
  public static boolean SETTING_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST")) return false;
    if (!nextTokenIs(b, COLUMN_SEP_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTING_LIST_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SETTING_LIST_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTING_LIST", c)) break;
    }
    exit_section_(b, m, SETTING_LIST, r);
    return r;
  }

  // COLUMN_SEP_TOKEN KEYWORD_ARG
  private static boolean SETTING_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD_ARG);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETTING_LIST | RECURRENCE_FOR_SETTING_TABLE
  public static boolean SETTING_LIST_OR_RECURRENCE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST_OR_RECURRENCE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTING_LIST_OR_RECURRENCE, "<setting list or recurrence>");
    r = SETTING_LIST(b, l + 1);
    if (!r) r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SUITE_SETUP_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS |
  //                         SUITE_SETUP_SETTING_TOKEN COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean SUITE_SETUP_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_SETUP_SETTING")) return false;
    if (!nextTokenIs(b, SUITE_SETUP_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SUITE_SETUP_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, SUITE_SETUP_SETTING_TOKEN, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, SUITE_SETUP_SETTING, r);
    return r;
  }

  // SUITE_SETUP_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean SUITE_SETUP_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_SETUP_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUITE_SETUP_SETTING_TOKEN);
    r = r && SUITE_SETUP_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE+
  private static boolean SUITE_SETUP_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_SETUP_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SUITE_SETUP_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SUITE_TEARDOWN_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS |
  //                         SUITE_TEARDOWN_SETTING_TOKEN COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean SUITE_TEARDOWN_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_TEARDOWN_SETTING")) return false;
    if (!nextTokenIs(b, SUITE_TEARDOWN_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SUITE_TEARDOWN_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, SUITE_TEARDOWN_SETTING_TOKEN, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, SUITE_TEARDOWN_SETTING, r);
    return r;
  }

  // SUITE_TEARDOWN_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean SUITE_TEARDOWN_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_TEARDOWN_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SUITE_TEARDOWN_SETTING_TOKEN);
    r = r && SUITE_TEARDOWN_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE+
  private static boolean SUITE_TEARDOWN_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SUITE_TEARDOWN_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SUITE_TEARDOWN_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETTINGS_TABLE | VARIABLES_TABLE | TEST_CASES_TABLE | KEYWORDS_TABLE
  public static boolean TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = SETTINGS_TABLE(b, l + 1);
    if (!r) r = consumeToken(b, VARIABLES_TABLE);
    if (!r) r = consumeToken(b, TEST_CASES_TABLE);
    if (!r) r = consumeToken(b, KEYWORDS_TABLE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TAG_TOKEN
  public static boolean TAG(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG")) return false;
    if (!nextTokenIs(b, TAG_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TAG_TOKEN);
    exit_section_(b, m, TAG, r);
    return r;
  }

  /* ********************************************************** */
  // (COLUMN_SEP_TOKEN TAG)+
  static boolean TAG_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST")) return false;
    if (!nextTokenIs(b, COLUMN_SEP_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TAG_LIST_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!TAG_LIST_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TAG_LIST", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEP_TOKEN TAG
  private static boolean TAG_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEP_TOKEN);
    r = r && TAG(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TAG_LIST | RECURRENCE_FOR_SETTING_TABLE
  static boolean TAG_LIST_OR_RECURRENCE_NO_COL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST_OR_RECURRENCE_NO_COL")) return false;
    boolean r;
    r = TAG_LIST(b, l + 1);
    if (!r) r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TEST_SETUP_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS |
  //                        TEST_SETUP_SETTING_TOKEN COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean TEST_SETUP_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING")) return false;
    if (!nextTokenIs(b, TEST_SETUP_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_SETUP_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, TEST_SETUP_SETTING_TOKEN, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, TEST_SETUP_SETTING, r);
    return r;
  }

  // TEST_SETUP_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean TEST_SETUP_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_SETUP_SETTING_TOKEN);
    r = r && TEST_SETUP_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE+
  private static boolean TEST_SETUP_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_SETUP_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEST_TEARDOWN_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS |
  //                         TEST_TEARDOWN_SETTING_TOKEN COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean TEST_TEARDOWN_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEARDOWN_SETTING")) return false;
    if (!nextTokenIs(b, TEST_TEARDOWN_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_TEARDOWN_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, TEST_TEARDOWN_SETTING_TOKEN, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, TEST_TEARDOWN_SETTING, r);
    return r;
  }

  // TEST_TEARDOWN_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean TEST_TEARDOWN_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEARDOWN_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_TEARDOWN_SETTING_TOKEN);
    r = r && TEST_TEARDOWN_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD_INVOCATION_SETTINGS);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE+
  private static boolean TEST_TEARDOWN_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEARDOWN_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_TEARDOWN_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEST_TEMPLATE_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE* COLUMN_SEP_TOKEN KEYWORD
  public static boolean TEST_TEMPLATE_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEMPLATE_SETTING")) return false;
    if (!nextTokenIs(b, TEST_TEMPLATE_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_TEMPLATE_SETTING_TOKEN);
    r = r && TEST_TEMPLATE_SETTING_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, KEYWORD);
    exit_section_(b, m, TEST_TEMPLATE_SETTING, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE*
  private static boolean TEST_TEMPLATE_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEMPLATE_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_TEMPLATE_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEST_TIMEOUT_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN TIMEOUT_UNITS_TOKEN |
  //                          TEST_TIMEOUT_SETTING_TOKEN  COLUMN_SEP_TOKEN TIMEOUT_UNITS_TOKEN
  public static boolean TEST_TIMEOUT_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING")) return false;
    if (!nextTokenIs(b, TEST_TIMEOUT_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_TIMEOUT_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, TEST_TIMEOUT_SETTING_TOKEN, COLUMN_SEP_TOKEN, TIMEOUT_UNITS_TOKEN);
    exit_section_(b, m, TEST_TIMEOUT_SETTING, r);
    return r;
  }

  // TEST_TIMEOUT_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE+ COLUMN_SEP_TOKEN TIMEOUT_UNITS_TOKEN
  private static boolean TEST_TIMEOUT_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_TIMEOUT_SETTING_TOKEN);
    r = r && TEST_TIMEOUT_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEP_TOKEN, TIMEOUT_UNITS_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // RECURRENCE_FOR_SETTING_TABLE+
  private static boolean TEST_TIMEOUT_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RECURRENCE_FOR_SETTING_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_TIMEOUT_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLES_SETTING_TOKEN RECURRENCE_FOR_SETTING_TABLE* COLUMN_SEP_TOKEN REFERENCED_FILE
  public static boolean VARIABLES_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_SETTING")) return false;
    if (!nextTokenIs(b, VARIABLES_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLES_SETTING, null);
    r = consumeToken(b, VARIABLES_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && report_error_(b, VARIABLES_SETTING_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLUMN_SEP_TOKEN)) && r;
    r = p && REFERENCED_FILE(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RECURRENCE_FOR_SETTING_TABLE*
  private static boolean VARIABLES_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!RECURRENCE_FOR_SETTING_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ! NEWLINE_TOKEN
  static boolean not_a_newline_token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "not_a_newline_token")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !consumeToken(b, NEWLINE_TOKEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (TABLE | EMPTY_LINE)* END_OF_LINE*
  public static boolean robotFrameworkFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFrameworkFile")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROBOT_FRAMEWORK_FILE, "<robot framework file>");
    r = robotFrameworkFile_0(b, l + 1);
    r = r && robotFrameworkFile_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (TABLE | EMPTY_LINE)*
  private static boolean robotFrameworkFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFrameworkFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!robotFrameworkFile_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "robotFrameworkFile_0", c)) break;
    }
    return true;
  }

  // TABLE | EMPTY_LINE
  private static boolean robotFrameworkFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFrameworkFile_0_0")) return false;
    boolean r;
    r = TABLE(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    return r;
  }

  // END_OF_LINE*
  private static boolean robotFrameworkFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFrameworkFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "robotFrameworkFile_1", c)) break;
    }
    return true;
  }

  static final Parser not_a_newline_token_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return not_a_newline_token(b, l + 1);
    }
  };
}
