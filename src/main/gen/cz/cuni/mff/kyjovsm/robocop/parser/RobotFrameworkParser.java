// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkParserUtil.*;
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
    return robotFile(b, l + 1);
  }

  /* ********************************************************** */
  // ARGUMENTS_SETTING_TOKEN (COLUMN_SEPARATOR_TOKEN ARGUMENT_DEFINITION)*
  public static boolean ARGUMENTS_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGUMENTS_SETTING")) return false;
    if (!nextTokenIs(b, ARGUMENTS_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARGUMENTS_SETTING_TOKEN);
    r = r && ARGUMENTS_SETTING_1(b, l + 1);
    exit_section_(b, m, ARGUMENTS_SETTING, r);
    return r;
  }

  // (COLUMN_SEPARATOR_TOKEN ARGUMENT_DEFINITION)*
  private static boolean ARGUMENTS_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGUMENTS_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ARGUMENTS_SETTING_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ARGUMENTS_SETTING_1", c)) break;
    }
    return true;
  }

  // COLUMN_SEPARATOR_TOKEN ARGUMENT_DEFINITION
  private static boolean ARGUMENTS_SETTING_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGUMENTS_SETTING_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && ARGUMENT_DEFINITION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE | SCALAR_DEFAULT_ARG_VALUE
  public static boolean ARGUMENT_DEFINITION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARGUMENT_DEFINITION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_DEFINITION, "<argument definition>");
    r = VARIABLE(b, l + 1);
    if (!r) r = SCALAR_DEFAULT_ARG_VALUE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE )*
  public static boolean ARRAY_ASSIGNABLE_IN_VARIABLES_TBL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_ASSIGNABLE_IN_VARIABLES_TBL")) return false;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ASSIGNABLE_IN_VARIABLES_TBL, "<array assignable in variables tbl>");
    while (true) {
      int c = current_position_(b);
      if (!ARRAY_ASSIGNABLE_IN_VARIABLES_TBL_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ARRAY_ASSIGNABLE_IN_VARIABLES_TBL", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE
  private static boolean ARRAY_ASSIGNABLE_IN_VARIABLES_TBL_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_ASSIGNABLE_IN_VARIABLES_TBL_0")) return false;
    boolean r;
    r = KEYWORD_ARG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ARRAY_ASSIGNMENT_TOKEN
  public static boolean ARRAY_ASSIGNMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_ASSIGNMENT")) return false;
    if (!nextTokenIs(b, ARRAY_ASSIGNMENT_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY_ASSIGNMENT_TOKEN);
    exit_section_(b, m, ARRAY_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // ARRAY_VARIABLE | ARRAY_ASSIGNMENT
  public static boolean ARRAY_ASSIGNMENT_LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_ASSIGNMENT_LHS")) return false;
    if (!nextTokenIs(b, "<array assignment lhs>", ARRAY_ASSIGNMENT_TOKEN, ARRAY_VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_ASSIGNMENT_LHS, "<array assignment lhs>");
    r = ARRAY_VARIABLE(b, l + 1);
    if (!r) r = ARRAY_ASSIGNMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ARRAY_VARIABLE_TOKEN
  public static boolean ARRAY_VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_VARIABLE")) return false;
    if (!nextTokenIs(b, ARRAY_VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARRAY_VARIABLE_TOKEN);
    exit_section_(b, m, ARRAY_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  public static boolean ASSIGNABLE_IN_VARIABLES_TBL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGNABLE_IN_VARIABLES_TBL")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, ASSIGNABLE_IN_VARIABLES_TBL, r);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_ASSIGNMENT | ARRAY_ASSIGNMENT
  public static boolean ASSIGNMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGNMENT")) return false;
    if (!nextTokenIs(b, "<assignment>", ARRAY_ASSIGNMENT_TOKEN, ASSIGNMENT_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = SCALAR_ASSIGNMENT(b, l + 1);
    if (!r) r = ARRAY_ASSIGNMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_DOCUMENTATION_TOKEN  (ELLIPSES_FOR_TEST_TABLE? COLUMN_SEPARATOR_TOKEN  DOCUMENTATION_TOKEN)*
  public static boolean BRACKET_DOCUMENTATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_DOCUMENTATION")) return false;
    if (!nextTokenIs(b, BRACKET_DOCUMENTATION_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BRACKET_DOCUMENTATION, null);
    r = consumeToken(b, BRACKET_DOCUMENTATION_TOKEN);
    p = r; // pin = 1
    r = r && BRACKET_DOCUMENTATION_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (ELLIPSES_FOR_TEST_TABLE? COLUMN_SEPARATOR_TOKEN  DOCUMENTATION_TOKEN)*
  private static boolean BRACKET_DOCUMENTATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_DOCUMENTATION_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!BRACKET_DOCUMENTATION_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BRACKET_DOCUMENTATION_1", c)) break;
    }
    return true;
  }

  // ELLIPSES_FOR_TEST_TABLE? COLUMN_SEPARATOR_TOKEN  DOCUMENTATION_TOKEN
  private static boolean BRACKET_DOCUMENTATION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_DOCUMENTATION_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BRACKET_DOCUMENTATION_1_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEPARATOR_TOKEN, DOCUMENTATION_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ELLIPSES_FOR_TEST_TABLE?
  private static boolean BRACKET_DOCUMENTATION_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_DOCUMENTATION_1_0_0")) return false;
    ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // BRACKET_TAGS_TOKEN TAG_LIST_OR_ELLIPSES*
  public static boolean BRACKET_TAGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_TAGS")) return false;
    if (!nextTokenIs(b, BRACKET_TAGS_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, BRACKET_TAGS, null);
    r = consumeToken(b, BRACKET_TAGS_TOKEN);
    p = r; // pin = 1
    r = r && BRACKET_TAGS_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TAG_LIST_OR_ELLIPSES*
  private static boolean BRACKET_TAGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BRACKET_TAGS_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TAG_LIST_OR_ELLIPSES(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "BRACKET_TAGS_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (COLUMN_SEPARATOR_TOKEN DOCUMENTATION_TOKEN) | ELLIPSES_FOR_SETTINGS_TABLE
  static boolean DOCUMENTATION_OR_ELLIPSES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_OR_ELLIPSES")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DOCUMENTATION_OR_ELLIPSES_0(b, l + 1);
    if (!r) r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN DOCUMENTATION_TOKEN
  private static boolean DOCUMENTATION_OR_ELLIPSES_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_OR_ELLIPSES_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLUMN_SEPARATOR_TOKEN, DOCUMENTATION_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCUMENTATION_SETTING_TOKEN  DOCUMENTATION_OR_ELLIPSES*
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

  // DOCUMENTATION_OR_ELLIPSES*
  private static boolean DOCUMENTATION_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOCUMENTATION_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!DOCUMENTATION_OR_ELLIPSES(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOCUMENTATION_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FOR_VAR_IN_RANGE INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  //                                            INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  public static boolean DOUBLE_BOUND_FOR_LOOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP")) return false;
    if (!nextTokenIs(b, FOR_LOOP_START_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_VAR_IN_RANGE(b, l + 1);
    r = r && DOUBLE_BOUND_FOR_LOOP_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    r = r && DOUBLE_BOUND_FOR_LOOP_4(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, DOUBLE_BOUND_FOR_LOOP, r);
    return r;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean DOUBLE_BOUND_FOR_LOOP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOUBLE_BOUND_FOR_LOOP_1", c)) break;
    }
    return true;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean DOUBLE_BOUND_FOR_LOOP_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOUBLE_BOUND_FOR_LOOP_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FOR_VAR_IN_RANGE INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  //                                                      INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  //                                                      INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  public static boolean DOUBLE_BOUND_FOR_LOOP_WITH_STEP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP")) return false;
    if (!nextTokenIs(b, FOR_LOOP_START_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_VAR_IN_RANGE(b, l + 1);
    r = r && DOUBLE_BOUND_FOR_LOOP_WITH_STEP_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    r = r && DOUBLE_BOUND_FOR_LOOP_WITH_STEP_4(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    r = r && DOUBLE_BOUND_FOR_LOOP_WITH_STEP_7(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, DOUBLE_BOUND_FOR_LOOP_WITH_STEP, r);
    return r;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean DOUBLE_BOUND_FOR_LOOP_WITH_STEP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_1", c)) break;
    }
    return true;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean DOUBLE_BOUND_FOR_LOOP_WITH_STEP_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_4", c)) break;
    }
    return true;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean DOUBLE_BOUND_FOR_LOOP_WITH_STEP_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_7")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DOUBLE_BOUND_FOR_LOOP_WITH_STEP_7", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ELLIPSES_TOKEN
  public static boolean ELLIPSES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES")) return false;
    if (!nextTokenIs(b, ELLIPSES_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELLIPSES_TOKEN);
    exit_section_(b, m, ELLIPSES, r);
    return r;
  }

  /* ********************************************************** */
  // EMPTY_LINE WHITESPACE_TOKEN? COLUMN_SEPARATOR_TOKEN? ELLIPSES
  static boolean ELLIPSES_FOR_SETTINGS_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_FOR_SETTINGS_TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EMPTY_LINE(b, l + 1);
    r = r && ELLIPSES_FOR_SETTINGS_TABLE_1(b, l + 1);
    r = r && ELLIPSES_FOR_SETTINGS_TABLE_2(b, l + 1);
    r = r && ELLIPSES(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE_TOKEN?
  private static boolean ELLIPSES_FOR_SETTINGS_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_FOR_SETTINGS_TABLE_1")) return false;
    consumeToken(b, WHITESPACE_TOKEN);
    return true;
  }

  // COLUMN_SEPARATOR_TOKEN?
  private static boolean ELLIPSES_FOR_SETTINGS_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_FOR_SETTINGS_TABLE_2")) return false;
    consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    return true;
  }

  /* ********************************************************** */
  // EMPTY_LINE COLUMN_SEPARATOR_TOKEN ELLIPSES
  static boolean ELLIPSES_FOR_TEST_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_FOR_TEST_TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EMPTY_LINE(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && ELLIPSES(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN? WHITESPACE_TOKEN? ELLIPSES
  static boolean ELLIPSES_LINE_SETTINGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_LINE_SETTINGS")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_LINE_SETTINGS_0(b, l + 1);
    r = r && ELLIPSES_LINE_SETTINGS_1(b, l + 1);
    r = r && ELLIPSES(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN?
  private static boolean ELLIPSES_LINE_SETTINGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_LINE_SETTINGS_0")) return false;
    consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    return true;
  }

  // WHITESPACE_TOKEN?
  private static boolean ELLIPSES_LINE_SETTINGS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_LINE_SETTINGS_1")) return false;
    consumeToken(b, WHITESPACE_TOKEN);
    return true;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN  ELLIPSES
  public static boolean ELLIPSES_LINE_TEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELLIPSES_LINE_TEST")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && ELLIPSES(b, l + 1);
    exit_section_(b, m, ELLIPSES_LINE_TEST, r);
    return r;
  }

  /* ********************************************************** */
  // NEWLINE_TOKEN END_OF_LINE* & NEWLINE_TOKEN
  static boolean EMPTY_FOR_LOOP_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_FOR_LOOP_LINE")) return false;
    if (!nextTokenIs(b, NEWLINE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE_TOKEN);
    r = r && EMPTY_FOR_LOOP_LINE_1(b, l + 1);
    r = r && EMPTY_FOR_LOOP_LINE_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean EMPTY_FOR_LOOP_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_FOR_LOOP_LINE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EMPTY_FOR_LOOP_LINE_1", c)) break;
    }
    return true;
  }

  // & NEWLINE_TOKEN
  private static boolean EMPTY_FOR_LOOP_LINE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_FOR_LOOP_LINE_2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _AND_);
    r = consumeToken(b, NEWLINE_TOKEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // END_OF_LINE* NEWLINE_TOKEN
  public static boolean EMPTY_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EMPTY_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EMPTY_LINE, "<empty line>");
    r = EMPTY_LINE_0(b, l + 1);
    r = r && consumeToken(b, NEWLINE_TOKEN);
    exit_section_(b, l, m, r, false, null);
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
  // COLUMN_SEPARATOR_TOKEN | WHITESPACE_TOKEN | COMMENT_TOKEN
  static boolean END_OF_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "END_OF_LINE")) return false;
    boolean r;
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    if (!r) r = consumeToken(b, WHITESPACE_TOKEN);
    if (!r) r = consumeToken(b, COMMENT_TOKEN);
    return r;
  }

  /* ********************************************************** */
  // INVALID_SYNTAX_TOKEN
  public static boolean ERROR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ERROR")) return false;
    if (!nextTokenIs(b, INVALID_SYNTAX_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INVALID_SYNTAX_TOKEN);
    exit_section_(b, m, ERROR, r);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN ( KEYWORD_CALLING_TEST | VARIABLE_ASSIGN_TO_KEYWORD )
  public static boolean EXECUTION_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXECUTION_LINE")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && EXECUTION_LINE_1(b, l + 1);
    exit_section_(b, m, EXECUTION_LINE, r);
    return r;
  }

  // KEYWORD_CALLING_TEST | VARIABLE_ASSIGN_TO_KEYWORD
  private static boolean EXECUTION_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EXECUTION_LINE_1")) return false;
    boolean r;
    r = KEYWORD_CALLING_TEST(b, l + 1);
    if (!r) r = VARIABLE_ASSIGN_TO_KEYWORD(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FORCE_TAGS_SETTING_KEYWORD_TOKEN TAG_LIST_OR_ELLIPSES_NO_COL*
  public static boolean FORCE_TAGS_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FORCE_TAGS_SETTING")) return false;
    if (!nextTokenIs(b, FORCE_TAGS_SETTING_KEYWORD_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FORCE_TAGS_SETTING, null);
    r = consumeToken(b, FORCE_TAGS_SETTING_KEYWORD_TOKEN);
    p = r; // pin = 1
    r = r && FORCE_TAGS_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // TAG_LIST_OR_ELLIPSES_NO_COL*
  private static boolean FORCE_TAGS_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FORCE_TAGS_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TAG_LIST_OR_ELLIPSES_NO_COL(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FORCE_TAGS_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // EMPTY_FOR_LOOP_LINE* NON_EMPTY_FOR_LOOP_LINE
  static boolean FOR_LOOP_EXECUTION_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_EXECUTION_LINE")) return false;
    if (!nextTokenIs(b, NEWLINE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_EXECUTION_LINE_0(b, l + 1);
    r = r && NON_EMPTY_FOR_LOOP_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EMPTY_FOR_LOOP_LINE*
  private static boolean FOR_LOOP_EXECUTION_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_EXECUTION_LINE_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EMPTY_FOR_LOOP_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_EXECUTION_LINE_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN  FOR_VAR_IN  FOR_LOOP_VALUE_LIST END_OF_LINE* FOR_LOOP_EXECUTION_LINE+
  public static boolean FOR_LOOP_IN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP_IN, null);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && FOR_VAR_IN(b, l + 1);
    r = r && FOR_LOOP_VALUE_LIST(b, l + 1);
    r = r && FOR_LOOP_IN_3(b, l + 1);
    p = r; // pin = 4
    r = r && FOR_LOOP_IN_4(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // END_OF_LINE*
  private static boolean FOR_LOOP_IN_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_IN_3", c)) break;
    }
    return true;
  }

  // FOR_LOOP_EXECUTION_LINE+
  private static boolean FOR_LOOP_IN_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_EXECUTION_LINE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FOR_LOOP_EXECUTION_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_IN_4", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN (DOUBLE_BOUND_FOR_LOOP_WITH_STEP | DOUBLE_BOUND_FOR_LOOP | SINGLE_BOUND_FOR_LOOP )
  //                       END_OF_LINE* FOR_LOOP_EXECUTION_LINE+
  public static boolean FOR_LOOP_IN_RANGE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_RANGE")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP_IN_RANGE, null);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && FOR_LOOP_IN_RANGE_1(b, l + 1);
    r = r && FOR_LOOP_IN_RANGE_2(b, l + 1);
    p = r; // pin = 3
    r = r && FOR_LOOP_IN_RANGE_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // DOUBLE_BOUND_FOR_LOOP_WITH_STEP | DOUBLE_BOUND_FOR_LOOP | SINGLE_BOUND_FOR_LOOP
  private static boolean FOR_LOOP_IN_RANGE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_RANGE_1")) return false;
    boolean r;
    r = DOUBLE_BOUND_FOR_LOOP_WITH_STEP(b, l + 1);
    if (!r) r = DOUBLE_BOUND_FOR_LOOP(b, l + 1);
    if (!r) r = SINGLE_BOUND_FOR_LOOP(b, l + 1);
    return r;
  }

  // END_OF_LINE*
  private static boolean FOR_LOOP_IN_RANGE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_RANGE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_IN_RANGE_2", c)) break;
    }
    return true;
  }

  // FOR_LOOP_EXECUTION_LINE+
  private static boolean FOR_LOOP_IN_RANGE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_IN_RANGE_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_EXECUTION_LINE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FOR_LOOP_EXECUTION_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_IN_RANGE_3", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (KEYWORD_ARG_LIST | ELLIPSES_FOR_TEST_TABLE)+
  public static boolean FOR_LOOP_VALUE_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_VALUE_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_LOOP_VALUE_LIST, "<for loop value list>");
    r = FOR_LOOP_VALUE_LIST_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!FOR_LOOP_VALUE_LIST_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_LOOP_VALUE_LIST", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEYWORD_ARG_LIST | ELLIPSES_FOR_TEST_TABLE
  private static boolean FOR_LOOP_VALUE_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_LOOP_VALUE_LIST_0")) return false;
    boolean r;
    r = KEYWORD_ARG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // FOR_LOOP_START_TOKEN  INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN SINGLE_VARIABLE_LIST  COLUMN_SEPARATOR_TOKEN  IN_TOKEN
  public static boolean FOR_VAR_IN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_VAR_IN")) return false;
    if (!nextTokenIs(b, FOR_LOOP_START_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR_LOOP_START_TOKEN);
    r = r && FOR_VAR_IN_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && SINGLE_VARIABLE_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEPARATOR_TOKEN, IN_TOKEN);
    exit_section_(b, m, FOR_VAR_IN, r);
    return r;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean FOR_VAR_IN_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_VAR_IN_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FOR_VAR_IN_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FOR_LOOP_START_TOKEN  COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE COLUMN_SEPARATOR_TOKEN IN_RANGE_TOKEN
  public static boolean FOR_VAR_IN_RANGE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FOR_VAR_IN_RANGE")) return false;
    if (!nextTokenIs(b, FOR_LOOP_START_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR_LOOP_START_TOKEN, COLUMN_SEPARATOR_TOKEN);
    r = r && SCALAR_VARIABLE(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEPARATOR_TOKEN, IN_RANGE_TOKEN);
    exit_section_(b, m, FOR_VAR_IN_RANGE, r);
    return r;
  }

  /* ********************************************************** */
  // GENERIC_SETTING_NAME SETTING_LIST_OR_ELLIPSES*
  public static boolean GENERIC_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GENERIC_SETTING")) return false;
    if (!nextTokenIs(b, GENERIC_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, GENERIC_SETTING, null);
    r = GENERIC_SETTING_NAME(b, l + 1);
    p = r; // pin = 1
    r = r && GENERIC_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SETTING_LIST_OR_ELLIPSES*
  private static boolean GENERIC_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GENERIC_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTING_LIST_OR_ELLIPSES(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GENERIC_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // GENERIC_SETTING_TOKEN
  public static boolean GENERIC_SETTING_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GENERIC_SETTING_NAME")) return false;
    if (!nextTokenIs(b, GENERIC_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GENERIC_SETTING_TOKEN);
    exit_section_(b, m, GENERIC_SETTING_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // END_OF_LINE* NEWLINE_TOKEN COLUMN_SEPARATOR_TOKEN EMPTY_CELL_TOKEN COLUMN_SEPARATOR_TOKEN ELLIPSES
  static boolean INDENTED_ELLIPSES_FOR_TEST_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_ELLIPSES_FOR_TEST_TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = INDENTED_ELLIPSES_FOR_TEST_TABLE_0(b, l + 1);
    r = r && consumeTokens(b, 0, NEWLINE_TOKEN, COLUMN_SEPARATOR_TOKEN, EMPTY_CELL_TOKEN, COLUMN_SEPARATOR_TOKEN);
    r = r && ELLIPSES(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean INDENTED_ELLIPSES_FOR_TEST_TABLE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_ELLIPSES_FOR_TEST_TABLE_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "INDENTED_ELLIPSES_FOR_TEST_TABLE_0", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD (KEYWORD_ARG_LIST | INDENTED_ELLIPSES_FOR_TEST_TABLE)+ | KEYWORD
  public static boolean INDENTED_KEYWORD_INVOCATION_TEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_KEYWORD_INVOCATION_TEST")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = INDENTED_KEYWORD_INVOCATION_TEST_0(b, l + 1);
    if (!r) r = KEYWORD(b, l + 1);
    exit_section_(b, m, INDENTED_KEYWORD_INVOCATION_TEST, r);
    return r;
  }

  // KEYWORD (KEYWORD_ARG_LIST | INDENTED_ELLIPSES_FOR_TEST_TABLE)+
  private static boolean INDENTED_KEYWORD_INVOCATION_TEST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_KEYWORD_INVOCATION_TEST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD(b, l + 1);
    r = r && INDENTED_KEYWORD_INVOCATION_TEST_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_ARG_LIST | INDENTED_ELLIPSES_FOR_TEST_TABLE)+
  private static boolean INDENTED_KEYWORD_INVOCATION_TEST_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_KEYWORD_INVOCATION_TEST_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = INDENTED_KEYWORD_INVOCATION_TEST_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!INDENTED_KEYWORD_INVOCATION_TEST_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "INDENTED_KEYWORD_INVOCATION_TEST_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYWORD_ARG_LIST | INDENTED_ELLIPSES_FOR_TEST_TABLE
  private static boolean INDENTED_KEYWORD_INVOCATION_TEST_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_KEYWORD_INVOCATION_TEST_0_1_0")) return false;
    boolean r;
    r = KEYWORD_ARG_LIST(b, l + 1);
    if (!r) r = INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // ( MULTI_ASSIGNMENT_LHS | SINGLE_ASSIGNMENT_LHS ) INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN  INDENTED_KEYWORD_INVOCATION_TEST
  public static boolean INDENTED_VARIABLE_ASSIGN_TO_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_VARIABLE_ASSIGN_TO_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INDENTED_VARIABLE_ASSIGN_TO_KEYWORD, "<indented variable assign to keyword>");
    r = INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_0(b, l + 1);
    r = r && INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && INDENTED_KEYWORD_INVOCATION_TEST(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MULTI_ASSIGNMENT_LHS | SINGLE_ASSIGNMENT_LHS
  private static boolean INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_0")) return false;
    boolean r;
    r = MULTI_ASSIGNMENT_LHS(b, l + 1);
    if (!r) r = SINGLE_ASSIGNMENT_LHS(b, l + 1);
    return r;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "INDENTED_VARIABLE_ASSIGN_TO_KEYWORD_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ROBOT_KEYWORD_TOKEN
  public static boolean KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROBOT_KEYWORD_TOKEN);
    exit_section_(b, m, KEYWORD, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORDS_TABLE_HEADER (EMPTY_LINE | KEYWORD_DEFINITION)*
  public static boolean KEYWORDS_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORDS_TABLE")) return false;
    if (!nextTokenIs(b, KEYWORDS_TABLE_HEADER_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, KEYWORDS_TABLE, null);
    r = KEYWORDS_TABLE_HEADER(b, l + 1);
    p = r; // pin = 1
    r = r && KEYWORDS_TABLE_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (EMPTY_LINE | KEYWORD_DEFINITION)*
  private static boolean KEYWORDS_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORDS_TABLE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!KEYWORDS_TABLE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORDS_TABLE_1", c)) break;
    }
    return true;
  }

  // EMPTY_LINE | KEYWORD_DEFINITION
  private static boolean KEYWORDS_TABLE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORDS_TABLE_1_0")) return false;
    boolean r;
    r = EMPTY_LINE(b, l + 1);
    if (!r) r = KEYWORD_DEFINITION(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORDS_TABLE_HEADER_TOKEN END_OF_LINE* NEWLINE_TOKEN
  public static boolean KEYWORDS_TABLE_HEADER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORDS_TABLE_HEADER")) return false;
    if (!nextTokenIs(b, KEYWORDS_TABLE_HEADER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEYWORDS_TABLE_HEADER_TOKEN);
    r = r && KEYWORDS_TABLE_HEADER_1(b, l + 1);
    r = r && consumeToken(b, NEWLINE_TOKEN);
    exit_section_(b, m, KEYWORDS_TABLE_HEADER, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORDS_TABLE_HEADER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORDS_TABLE_HEADER_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORDS_TABLE_HEADER_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VARIABLE | ROBOT_KEYWORD_ARGUMENT_TOKEN | EMPTY_CELL_TOKEN | INTEGER_TOKEN | ARRAY_VARIABLE_ACCESS_TOKEN | ROBOT_KEYWORD_TOKEN
  public static boolean KEYWORD_ARGUMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_ARGUMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_ARGUMENT, "<keyword argument>");
    r = VARIABLE(b, l + 1);
    if (!r) r = consumeToken(b, ROBOT_KEYWORD_ARGUMENT_TOKEN);
    if (!r) r = consumeToken(b, EMPTY_CELL_TOKEN);
    if (!r) r = consumeToken(b, INTEGER_TOKEN);
    if (!r) r = consumeToken(b, ARRAY_VARIABLE_ACCESS_TOKEN);
    if (!r) r = consumeToken(b, ROBOT_KEYWORD_TOKEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT)+
  public static boolean KEYWORD_ARG_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_ARG_LIST")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_ARG_LIST_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!KEYWORD_ARG_LIST_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_ARG_LIST", c)) break;
    }
    exit_section_(b, m, KEYWORD_ARG_LIST, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  private static boolean KEYWORD_ARG_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_ARG_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD (KEYWORD_ARG_LIST | ELLIPSES_FOR_TEST_TABLE)*
  public static boolean KEYWORD_CALLING_TEST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_CALLING_TEST")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD(b, l + 1);
    r = r && KEYWORD_CALLING_TEST_1(b, l + 1);
    exit_section_(b, m, KEYWORD_CALLING_TEST, r);
    return r;
  }

  // (KEYWORD_ARG_LIST | ELLIPSES_FOR_TEST_TABLE)*
  private static boolean KEYWORD_CALLING_TEST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_CALLING_TEST_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!KEYWORD_CALLING_TEST_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_CALLING_TEST_1", c)) break;
    }
    return true;
  }

  // KEYWORD_ARG_LIST | ELLIPSES_FOR_TEST_TABLE
  private static boolean KEYWORD_CALLING_TEST_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_CALLING_TEST_1_0")) return false;
    boolean r;
    r = KEYWORD_ARG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEYWORD_NAME  (KEYWORD_LINE EMPTY_LINE | EMPTY_LINE )* (KEYWORD_LINE END_OF_LINE* <<eof>>)?
  public static boolean KEYWORD_DEFINITION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_NAME_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_DEFINITION, null);
    r = KEYWORD_NAME(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, KEYWORD_DEFINITION_1(b, l + 1));
    r = p && KEYWORD_DEFINITION_2(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (KEYWORD_LINE EMPTY_LINE | EMPTY_LINE )*
  private static boolean KEYWORD_DEFINITION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!KEYWORD_DEFINITION_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_DEFINITION_1", c)) break;
    }
    return true;
  }

  // KEYWORD_LINE EMPTY_LINE | EMPTY_LINE
  private static boolean KEYWORD_DEFINITION_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_DEFINITION_1_0_0(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYWORD_LINE EMPTY_LINE
  private static boolean KEYWORD_DEFINITION_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_LINE(b, l + 1);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_LINE END_OF_LINE* <<eof>>)?
  private static boolean KEYWORD_DEFINITION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_2")) return false;
    KEYWORD_DEFINITION_2_0(b, l + 1);
    return true;
  }

  // KEYWORD_LINE END_OF_LINE* <<eof>>
  private static boolean KEYWORD_DEFINITION_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_LINE(b, l + 1);
    r = r && KEYWORD_DEFINITION_2_0_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_DEFINITION_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_DEFINITION_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_DEFINITION_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // KEYWORD (KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE)+ | KEYWORD
  public static boolean KEYWORD_INVOCATION_SETTINGS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_INVOCATION_SETTINGS")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_INVOCATION_SETTINGS_0(b, l + 1);
    if (!r) r = KEYWORD(b, l + 1);
    exit_section_(b, m, KEYWORD_INVOCATION_SETTINGS, r);
    return r;
  }

  // KEYWORD (KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE)+
  private static boolean KEYWORD_INVOCATION_SETTINGS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_INVOCATION_SETTINGS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD(b, l + 1);
    r = r && KEYWORD_INVOCATION_SETTINGS_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE)+
  private static boolean KEYWORD_INVOCATION_SETTINGS_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_INVOCATION_SETTINGS_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_INVOCATION_SETTINGS_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!KEYWORD_INVOCATION_SETTINGS_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_INVOCATION_SETTINGS_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // KEYWORD_ARG_LIST | ELLIPSES_FOR_SETTINGS_TABLE
  private static boolean KEYWORD_INVOCATION_SETTINGS_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_INVOCATION_SETTINGS_0_1_0")) return false;
    boolean r;
    r = KEYWORD_ARG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // EXECUTION_LINE        END_OF_LINE* |
  //                  KEYWORD_SETTING_LINE  END_OF_LINE* |
  //                  RETURN_LINE           END_OF_LINE* |
  //                  ELLIPSES_LINE_TEST    END_OF_LINE* |
  //                  FOR_LOOP_IN_RANGE     END_OF_LINE* |
  //                  FOR_LOOP_IN           END_OF_LINE* |
  //                  COLUMN_SEPARATOR_TOKEN
  public static boolean KEYWORD_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_LINE, "<keyword line>");
    r = KEYWORD_LINE_0(b, l + 1);
    if (!r) r = KEYWORD_LINE_1(b, l + 1);
    if (!r) r = KEYWORD_LINE_2(b, l + 1);
    if (!r) r = KEYWORD_LINE_3(b, l + 1);
    if (!r) r = KEYWORD_LINE_4(b, l + 1);
    if (!r) r = KEYWORD_LINE_5(b, l + 1);
    if (!r) r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    exit_section_(b, l, m, r, false, not_a_newline_token_parser_);
    return r;
  }

  // EXECUTION_LINE        END_OF_LINE*
  private static boolean KEYWORD_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXECUTION_LINE(b, l + 1);
    r = r && KEYWORD_LINE_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_0_1", c)) break;
    }
    return true;
  }

  // KEYWORD_SETTING_LINE  END_OF_LINE*
  private static boolean KEYWORD_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_SETTING_LINE(b, l + 1);
    r = r && KEYWORD_LINE_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_1_1", c)) break;
    }
    return true;
  }

  // RETURN_LINE           END_OF_LINE*
  private static boolean KEYWORD_LINE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RETURN_LINE(b, l + 1);
    r = r && KEYWORD_LINE_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_2_1", c)) break;
    }
    return true;
  }

  // ELLIPSES_LINE_TEST    END_OF_LINE*
  private static boolean KEYWORD_LINE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_LINE_TEST(b, l + 1);
    r = r && KEYWORD_LINE_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_3_1", c)) break;
    }
    return true;
  }

  // FOR_LOOP_IN_RANGE     END_OF_LINE*
  private static boolean KEYWORD_LINE_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_IN_RANGE(b, l + 1);
    r = r && KEYWORD_LINE_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_4_1", c)) break;
    }
    return true;
  }

  // FOR_LOOP_IN           END_OF_LINE*
  private static boolean KEYWORD_LINE_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_IN(b, l + 1);
    r = r && KEYWORD_LINE_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean KEYWORD_LINE_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_LINE_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "KEYWORD_LINE_5_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ROBOT_KEYWORD_NAME_TOKEN
  public static boolean KEYWORD_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_NAME")) return false;
    if (!nextTokenIs(b, ROBOT_KEYWORD_NAME_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROBOT_KEYWORD_NAME_TOKEN);
    exit_section_(b, m, KEYWORD_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ARGUMENTS_SETTING | BRACKET_DOCUMENTATION | TEST_CASE_BRACKET_TEARDOWN | TEST_CASE_BRACKET_TIMEOUT
  public static boolean KEYWORD_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_SETTING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD_SETTING, "<keyword setting>");
    r = ARGUMENTS_SETTING(b, l + 1);
    if (!r) r = BRACKET_DOCUMENTATION(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_TEARDOWN(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_TIMEOUT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN KEYWORD_SETTING
  public static boolean KEYWORD_SETTING_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYWORD_SETTING_LINE")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_SETTING(b, l + 1);
    exit_section_(b, m, KEYWORD_SETTING_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // LIBRARY_REFERENCE_TOKEN
  public static boolean LIBRARY_REFERENCE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_REFERENCE")) return false;
    if (!nextTokenIs(b, LIBRARY_REFERENCE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIBRARY_REFERENCE_TOKEN);
    exit_section_(b, m, LIBRARY_REFERENCE, r);
    return r;
  }

  /* ********************************************************** */
  // LIBRARY_SETTING_TOKEN  COLUMN_SEPARATOR_TOKEN  LIBRARY_REFERENCE   SETTING_LIST_OR_ELLIPSES*
  public static boolean LIBRARY_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_SETTING")) return false;
    if (!nextTokenIs(b, LIBRARY_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, LIBRARY_SETTING, null);
    r = consumeTokens(b, 0, LIBRARY_SETTING_TOKEN, COLUMN_SEPARATOR_TOKEN);
    r = r && LIBRARY_REFERENCE(b, l + 1);
    p = r; // pin = 3
    r = r && LIBRARY_SETTING_3(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // SETTING_LIST_OR_ELLIPSES*
  private static boolean LIBRARY_SETTING_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIBRARY_SETTING_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTING_LIST_OR_ELLIPSES(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "LIBRARY_SETTING_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // METADATA_SETTING_TOKEN  SETTING_LIST_OR_ELLIPSES*
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

  // SETTING_LIST_OR_ELLIPSES*
  private static boolean METADATA_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METADATA_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTING_LIST_OR_ELLIPSES(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "METADATA_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VARIABLE (COLUMN_SEPARATOR_TOKEN VARIABLE)*  COLUMN_SEPARATOR_TOKEN ASSIGNMENT
  //                        |  VARIABLE (COLUMN_SEPARATOR_TOKEN  VARIABLE)+
  public static boolean MULTI_ASSIGNMENT_LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS")) return false;
    if (!nextTokenIs(b, "<multi assignment lhs>", ARRAY_VARIABLE_TOKEN, VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULTI_ASSIGNMENT_LHS, "<multi assignment lhs>");
    r = MULTI_ASSIGNMENT_LHS_0(b, l + 1);
    if (!r) r = MULTI_ASSIGNMENT_LHS_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VARIABLE (COLUMN_SEPARATOR_TOKEN VARIABLE)*  COLUMN_SEPARATOR_TOKEN ASSIGNMENT
  private static boolean MULTI_ASSIGNMENT_LHS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VARIABLE(b, l + 1);
    r = r && MULTI_ASSIGNMENT_LHS_0_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && ASSIGNMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLUMN_SEPARATOR_TOKEN VARIABLE)*
  private static boolean MULTI_ASSIGNMENT_LHS_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!MULTI_ASSIGNMENT_LHS_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MULTI_ASSIGNMENT_LHS_0_1", c)) break;
    }
    return true;
  }

  // COLUMN_SEPARATOR_TOKEN VARIABLE
  private static boolean MULTI_ASSIGNMENT_LHS_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && VARIABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE (COLUMN_SEPARATOR_TOKEN  VARIABLE)+
  private static boolean MULTI_ASSIGNMENT_LHS_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VARIABLE(b, l + 1);
    r = r && MULTI_ASSIGNMENT_LHS_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLUMN_SEPARATOR_TOKEN  VARIABLE)+
  private static boolean MULTI_ASSIGNMENT_LHS_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = MULTI_ASSIGNMENT_LHS_1_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!MULTI_ASSIGNMENT_LHS_1_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "MULTI_ASSIGNMENT_LHS_1_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN  VARIABLE
  private static boolean MULTI_ASSIGNMENT_LHS_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MULTI_ASSIGNMENT_LHS_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && VARIABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NEWLINE_TOKEN COLUMN_SEPARATOR_TOKEN  EMPTY_CELL_TOKEN COLUMN_SEPARATOR_TOKEN ( INDENTED_KEYWORD_INVOCATION_TEST | INDENTED_VARIABLE_ASSIGN_TO_KEYWORD ) END_OF_LINE*
  static boolean NON_EMPTY_FOR_LOOP_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NON_EMPTY_FOR_LOOP_LINE")) return false;
    if (!nextTokenIs(b, NEWLINE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NEWLINE_TOKEN, COLUMN_SEPARATOR_TOKEN, EMPTY_CELL_TOKEN, COLUMN_SEPARATOR_TOKEN);
    r = r && NON_EMPTY_FOR_LOOP_LINE_4(b, l + 1);
    r = r && NON_EMPTY_FOR_LOOP_LINE_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INDENTED_KEYWORD_INVOCATION_TEST | INDENTED_VARIABLE_ASSIGN_TO_KEYWORD
  private static boolean NON_EMPTY_FOR_LOOP_LINE_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NON_EMPTY_FOR_LOOP_LINE_4")) return false;
    boolean r;
    r = INDENTED_KEYWORD_INVOCATION_TEST(b, l + 1);
    if (!r) r = INDENTED_VARIABLE_ASSIGN_TO_KEYWORD(b, l + 1);
    return r;
  }

  // END_OF_LINE*
  private static boolean NON_EMPTY_FOR_LOOP_LINE_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NON_EMPTY_FOR_LOOP_LINE_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "NON_EMPTY_FOR_LOOP_LINE_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ROBOT_FILE_TOKEN
  public static boolean REFERENCED_FILE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "REFERENCED_FILE")) return false;
    if (!nextTokenIs(b, ROBOT_FILE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ROBOT_FILE_TOKEN);
    exit_section_(b, m, REFERENCED_FILE, r);
    return r;
  }

  /* ********************************************************** */
  // RESOURCE_SETTING_TOKEN  ELLIPSES_FOR_SETTINGS_TABLE* COLUMN_SEPARATOR_TOKEN  REFERENCED_FILE
  public static boolean RESOURCE_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESOURCE_SETTING")) return false;
    if (!nextTokenIs(b, RESOURCE_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_SETTING, null);
    r = consumeToken(b, RESOURCE_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && report_error_(b, RESOURCE_SETTING_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLUMN_SEPARATOR_TOKEN)) && r;
    r = p && REFERENCED_FILE(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ELLIPSES_FOR_SETTINGS_TABLE*
  private static boolean RESOURCE_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RESOURCE_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RESOURCE_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN RETURN_SETTING
  public static boolean RETURN_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_LINE")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && RETURN_SETTING(b, l + 1);
    exit_section_(b, m, RETURN_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN_SETTING_TOKEN (COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT)+
  public static boolean RETURN_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_SETTING")) return false;
    if (!nextTokenIs(b, RETURN_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, RETURN_SETTING, null);
    r = consumeToken(b, RETURN_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && RETURN_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT)+
  private static boolean RETURN_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_SETTING_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = RETURN_SETTING_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!RETURN_SETTING_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "RETURN_SETTING_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  private static boolean RETURN_SETTING_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_SETTING_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASSIGNMENT_TOKEN
  public static boolean SCALAR_ASSIGNMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCALAR_ASSIGNMENT")) return false;
    if (!nextTokenIs(b, ASSIGNMENT_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGNMENT_TOKEN);
    exit_section_(b, m, SCALAR_ASSIGNMENT, r);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_VARIABLE | SCALAR_ASSIGNMENT
  public static boolean SCALAR_ASSIGNMENT_LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCALAR_ASSIGNMENT_LHS")) return false;
    if (!nextTokenIs(b, "<scalar assignment lhs>", ASSIGNMENT_TOKEN, VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCALAR_ASSIGNMENT_LHS, "<scalar assignment lhs>");
    r = SCALAR_VARIABLE(b, l + 1);
    if (!r) r = SCALAR_ASSIGNMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_DEFAULT_ARG_VALUE_TOKEN
  public static boolean SCALAR_DEFAULT_ARG_VALUE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCALAR_DEFAULT_ARG_VALUE")) return false;
    if (!nextTokenIs(b, SCALAR_DEFAULT_ARG_VALUE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SCALAR_DEFAULT_ARG_VALUE_TOKEN);
    exit_section_(b, m, SCALAR_DEFAULT_ARG_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // VARIABLE_TOKEN
  public static boolean SCALAR_VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCALAR_VARIABLE")) return false;
    if (!nextTokenIs(b, VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLE_TOKEN);
    exit_section_(b, m, SCALAR_VARIABLE, r);
    return r;
  }

  /* ********************************************************** */
  // FORCE_TAGS_SETTING |
  //             RESOURCE_SETTING |
  //             VARIABLE_SETTING |
  //             TEST_SETUP_SETTING |
  //             LIBRARY_SETTING |
  //             TEST_TIMEOUT_SETTING |
  //             DOCUMENTATION_SETTING |
  //             METADATA_SETTING |
  //             TEST_TEMPLATE_SETTING |
  //             GENERIC_SETTING
  public static boolean SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTING, "<setting>");
    r = FORCE_TAGS_SETTING(b, l + 1);
    if (!r) r = RESOURCE_SETTING(b, l + 1);
    if (!r) r = VARIABLE_SETTING(b, l + 1);
    if (!r) r = TEST_SETUP_SETTING(b, l + 1);
    if (!r) r = LIBRARY_SETTING(b, l + 1);
    if (!r) r = TEST_TIMEOUT_SETTING(b, l + 1);
    if (!r) r = DOCUMENTATION_SETTING(b, l + 1);
    if (!r) r = METADATA_SETTING(b, l + 1);
    if (!r) r = TEST_TEMPLATE_SETTING(b, l + 1);
    if (!r) r = GENERIC_SETTING(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // WHITESPACE_TOKEN? SETTING END_OF_LINE* |
  //                   ELLIPSES_LINE_SETTINGS    END_OF_LINE*
  public static boolean SETTINGS_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SETTINGS_LINE, "<settings line>");
    r = SETTINGS_LINE_0(b, l + 1);
    if (!r) r = SETTINGS_LINE_1(b, l + 1);
    exit_section_(b, l, m, r, false, not_a_newline_token_parser_);
    return r;
  }

  // WHITESPACE_TOKEN? SETTING END_OF_LINE*
  private static boolean SETTINGS_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_LINE_0_0(b, l + 1);
    r = r && SETTING(b, l + 1);
    r = r && SETTINGS_LINE_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITESPACE_TOKEN?
  private static boolean SETTINGS_LINE_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE_0_0")) return false;
    consumeToken(b, WHITESPACE_TOKEN);
    return true;
  }

  // END_OF_LINE*
  private static boolean SETTINGS_LINE_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_LINE_0_2", c)) break;
    }
    return true;
  }

  // ELLIPSES_LINE_SETTINGS    END_OF_LINE*
  private static boolean SETTINGS_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_LINE_SETTINGS(b, l + 1);
    r = r && SETTINGS_LINE_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean SETTINGS_LINE_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_LINE_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_LINE_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SETTINGS_TABLE_HEADER (SETTINGS_LINE EMPTY_LINE | EMPTY_LINE)* (SETTINGS_LINE END_OF_LINE* <<eof>>)?
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

  // (SETTINGS_LINE EMPTY_LINE | EMPTY_LINE)*
  private static boolean SETTINGS_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!SETTINGS_TABLE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SETTINGS_TABLE_1", c)) break;
    }
    return true;
  }

  // SETTINGS_LINE EMPTY_LINE | EMPTY_LINE
  private static boolean SETTINGS_TABLE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_TABLE_1_0_0(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // SETTINGS_LINE EMPTY_LINE
  private static boolean SETTINGS_TABLE_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_LINE(b, l + 1);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (SETTINGS_LINE END_OF_LINE* <<eof>>)?
  private static boolean SETTINGS_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_2")) return false;
    SETTINGS_TABLE_2_0(b, l + 1);
    return true;
  }

  // SETTINGS_LINE END_OF_LINE* <<eof>>
  private static boolean SETTINGS_TABLE_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTINGS_TABLE_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SETTINGS_LINE(b, l + 1);
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
  // (COLUMN_SEPARATOR_TOKEN  KEYWORD_ARGUMENT)+
  public static boolean SETTING_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
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

  // COLUMN_SEPARATOR_TOKEN  KEYWORD_ARGUMENT
  private static boolean SETTING_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETTING_LIST | ELLIPSES_FOR_SETTINGS_TABLE
  static boolean SETTING_LIST_OR_ELLIPSES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SETTING_LIST_OR_ELLIPSES")) return false;
    boolean r;
    r = SETTING_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_ASSIGNMENT_LHS | ARRAY_ASSIGNMENT_LHS
  public static boolean SINGLE_ASSIGNMENT_LHS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_ASSIGNMENT_LHS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SINGLE_ASSIGNMENT_LHS, "<single assignment lhs>");
    r = SCALAR_ASSIGNMENT_LHS(b, l + 1);
    if (!r) r = ARRAY_ASSIGNMENT_LHS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FOR_VAR_IN_RANGE INDENTED_ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD_ARGUMENT
  public static boolean SINGLE_BOUND_FOR_LOOP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_BOUND_FOR_LOOP")) return false;
    if (!nextTokenIs(b, FOR_LOOP_START_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_VAR_IN_RANGE(b, l + 1);
    r = r && SINGLE_BOUND_FOR_LOOP_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_ARGUMENT(b, l + 1);
    exit_section_(b, m, SINGLE_BOUND_FOR_LOOP, r);
    return r;
  }

  // INDENTED_ELLIPSES_FOR_TEST_TABLE*
  private static boolean SINGLE_BOUND_FOR_LOOP_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_BOUND_FOR_LOOP_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SINGLE_BOUND_FOR_LOOP_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SCALAR_VARIABLE ((COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE) | INDENTED_ELLIPSES_FOR_TEST_TABLE)+ | SCALAR_VARIABLE
  public static boolean SINGLE_VARIABLE_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_VARIABLE_LIST")) return false;
    if (!nextTokenIs(b, VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SINGLE_VARIABLE_LIST_0(b, l + 1);
    if (!r) r = SCALAR_VARIABLE(b, l + 1);
    exit_section_(b, m, SINGLE_VARIABLE_LIST, r);
    return r;
  }

  // SCALAR_VARIABLE ((COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE) | INDENTED_ELLIPSES_FOR_TEST_TABLE)+
  private static boolean SINGLE_VARIABLE_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_VARIABLE_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SCALAR_VARIABLE(b, l + 1);
    r = r && SINGLE_VARIABLE_LIST_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ((COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE) | INDENTED_ELLIPSES_FOR_TEST_TABLE)+
  private static boolean SINGLE_VARIABLE_LIST_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_VARIABLE_LIST_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SINGLE_VARIABLE_LIST_0_1_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!SINGLE_VARIABLE_LIST_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "SINGLE_VARIABLE_LIST_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE) | INDENTED_ELLIPSES_FOR_TEST_TABLE
  private static boolean SINGLE_VARIABLE_LIST_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_VARIABLE_LIST_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SINGLE_VARIABLE_LIST_0_1_0_0(b, l + 1);
    if (!r) r = INDENTED_ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLUMN_SEPARATOR_TOKEN SCALAR_VARIABLE
  private static boolean SINGLE_VARIABLE_LIST_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SINGLE_VARIABLE_LIST_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && SCALAR_VARIABLE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SETTINGS_TABLE|VARIABLES_TABLE|TEST_CASES_TABLE|KEYWORDS_TABLE
  public static boolean TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TABLE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE, "<table>");
    r = SETTINGS_TABLE(b, l + 1);
    if (!r) r = VARIABLES_TABLE(b, l + 1);
    if (!r) r = TEST_CASES_TABLE(b, l + 1);
    if (!r) r = KEYWORDS_TABLE(b, l + 1);
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
  // (COLUMN_SEPARATOR_TOKEN TAG)+
  static boolean TAG_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
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

  // COLUMN_SEPARATOR_TOKEN TAG
  private static boolean TAG_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && TAG(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TAG_LIST | ELLIPSES_FOR_TEST_TABLE
  static boolean TAG_LIST_OR_ELLIPSES(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST_OR_ELLIPSES")) return false;
    boolean r;
    r = TAG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_TEST_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TAG_LIST | ELLIPSES_FOR_SETTINGS_TABLE
  static boolean TAG_LIST_OR_ELLIPSES_NO_COL(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TAG_LIST_OR_ELLIPSES_NO_COL")) return false;
    boolean r;
    r = TAG_LIST(b, l + 1);
    if (!r) r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // TEST_CASE_NAME ( TEST_CASE_LINE EMPTY_LINE | EMPTY_LINE )* (TEST_CASE_LINE END_OF_LINE* <<eof>>)?
  public static boolean TEST_CASE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE")) return false;
    if (!nextTokenIs(b, TEST_CASE_NAME_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_CASE_NAME(b, l + 1);
    r = r && TEST_CASE_1(b, l + 1);
    r = r && TEST_CASE_2(b, l + 1);
    exit_section_(b, m, TEST_CASE, r);
    return r;
  }

  // ( TEST_CASE_LINE EMPTY_LINE | EMPTY_LINE )*
  private static boolean TEST_CASE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TEST_CASE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_1", c)) break;
    }
    return true;
  }

  // TEST_CASE_LINE EMPTY_LINE | EMPTY_LINE
  private static boolean TEST_CASE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_CASE_1_0_0(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // TEST_CASE_LINE EMPTY_LINE
  private static boolean TEST_CASE_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_CASE_LINE(b, l + 1);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TEST_CASE_LINE END_OF_LINE* <<eof>>)?
  private static boolean TEST_CASE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_2")) return false;
    TEST_CASE_2_0(b, l + 1);
    return true;
  }

  // TEST_CASE_LINE END_OF_LINE* <<eof>>
  private static boolean TEST_CASE_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_CASE_LINE(b, l + 1);
    r = r && TEST_CASE_2_0_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEST_CASES_TABLE_HEADER EMPTY_LINE* TEST_CASE*
  public static boolean TEST_CASES_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE")) return false;
    if (!nextTokenIs(b, TEST_CASES_TABLE_HEADER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_CASES_TABLE_HEADER(b, l + 1);
    r = r && TEST_CASES_TABLE_1(b, l + 1);
    r = r && TEST_CASES_TABLE_2(b, l + 1);
    exit_section_(b, m, TEST_CASES_TABLE, r);
    return r;
  }

  // EMPTY_LINE*
  private static boolean TEST_CASES_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EMPTY_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASES_TABLE_1", c)) break;
    }
    return true;
  }

  // TEST_CASE*
  private static boolean TEST_CASES_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TEST_CASE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASES_TABLE_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEST_CASES_TABLE_HEADER_TOKEN END_OF_LINE* (NEWLINE_TOKEN | <<eof>>)
  public static boolean TEST_CASES_TABLE_HEADER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE_HEADER")) return false;
    if (!nextTokenIs(b, TEST_CASES_TABLE_HEADER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_CASES_TABLE_HEADER_TOKEN);
    r = r && TEST_CASES_TABLE_HEADER_1(b, l + 1);
    r = r && TEST_CASES_TABLE_HEADER_2(b, l + 1);
    exit_section_(b, m, TEST_CASES_TABLE_HEADER, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASES_TABLE_HEADER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE_HEADER_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASES_TABLE_HEADER_1", c)) break;
    }
    return true;
  }

  // NEWLINE_TOKEN | <<eof>>
  private static boolean TEST_CASES_TABLE_HEADER_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASES_TABLE_HEADER_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NEWLINE_TOKEN);
    if (!r) r = eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_SETUP_TOKEN  COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean TEST_CASE_BRACKET_SETUP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_BRACKET_SETUP")) return false;
    if (!nextTokenIs(b, BRACKET_SETUP_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEST_CASE_BRACKET_SETUP, null);
    r = consumeTokens(b, 1, BRACKET_SETUP_TOKEN, COLUMN_SEPARATOR_TOKEN);
    p = r; // pin = 1
    r = r && KEYWORD_INVOCATION_SETTINGS(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACKET_TEARDOWN_TOKEN COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean TEST_CASE_BRACKET_TEARDOWN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_BRACKET_TEARDOWN")) return false;
    if (!nextTokenIs(b, BRACKET_TEARDOWN_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEST_CASE_BRACKET_TEARDOWN, null);
    r = consumeTokens(b, 1, BRACKET_TEARDOWN_TOKEN, COLUMN_SEPARATOR_TOKEN);
    p = r; // pin = 1
    r = r && KEYWORD_INVOCATION_SETTINGS(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEMPLATE_SETTING_TOKEN COLUMN_SEPARATOR_TOKEN KEYWORD
  public static boolean TEST_CASE_BRACKET_TEMPLATE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_BRACKET_TEMPLATE")) return false;
    if (!nextTokenIs(b, TEMPLATE_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEST_CASE_BRACKET_TEMPLATE, null);
    r = consumeTokens(b, 1, TEMPLATE_SETTING_TOKEN, COLUMN_SEPARATOR_TOKEN);
    p = r; // pin = 1
    r = r && KEYWORD(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // BRACKET_TIMEOUT_TOKEN COLUMN_SEPARATOR_TOKEN TIMEOUT_VALUE_TOKEN
  public static boolean TEST_CASE_BRACKET_TIMEOUT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_BRACKET_TIMEOUT")) return false;
    if (!nextTokenIs(b, BRACKET_TIMEOUT_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, TEST_CASE_BRACKET_TIMEOUT, null);
    r = consumeTokens(b, 1, BRACKET_TIMEOUT_TOKEN, COLUMN_SEPARATOR_TOKEN, TIMEOUT_VALUE_TOKEN);
    p = r; // pin = 1
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // TEST_SETTING_LINE  END_OF_LINE* |
  //                   EXECUTION_LINE     END_OF_LINE* |
  //                   ELLIPSES_LINE_TEST END_OF_LINE* |
  //                   FOR_LOOP_IN_RANGE  END_OF_LINE* |
  //                   FOR_LOOP_IN        END_OF_LINE* |
  //                   KEYWORD_ARG_LIST   END_OF_LINE* |
  //                   COLUMN_SEPARATOR_TOKEN
  public static boolean TEST_CASE_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_CASE_LINE, "<test case line>");
    r = TEST_CASE_LINE_0(b, l + 1);
    if (!r) r = TEST_CASE_LINE_1(b, l + 1);
    if (!r) r = TEST_CASE_LINE_2(b, l + 1);
    if (!r) r = TEST_CASE_LINE_3(b, l + 1);
    if (!r) r = TEST_CASE_LINE_4(b, l + 1);
    if (!r) r = TEST_CASE_LINE_5(b, l + 1);
    if (!r) r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    exit_section_(b, l, m, r, false, not_a_newline_token_parser_);
    return r;
  }

  // TEST_SETTING_LINE  END_OF_LINE*
  private static boolean TEST_CASE_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_SETTING_LINE(b, l + 1);
    r = r && TEST_CASE_LINE_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_0_1", c)) break;
    }
    return true;
  }

  // EXECUTION_LINE     END_OF_LINE*
  private static boolean TEST_CASE_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EXECUTION_LINE(b, l + 1);
    r = r && TEST_CASE_LINE_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_1_1", c)) break;
    }
    return true;
  }

  // ELLIPSES_LINE_TEST END_OF_LINE*
  private static boolean TEST_CASE_LINE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_LINE_TEST(b, l + 1);
    r = r && TEST_CASE_LINE_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_2_1", c)) break;
    }
    return true;
  }

  // FOR_LOOP_IN_RANGE  END_OF_LINE*
  private static boolean TEST_CASE_LINE_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_IN_RANGE(b, l + 1);
    r = r && TEST_CASE_LINE_3_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_3_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_3_1", c)) break;
    }
    return true;
  }

  // FOR_LOOP_IN        END_OF_LINE*
  private static boolean TEST_CASE_LINE_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = FOR_LOOP_IN(b, l + 1);
    r = r && TEST_CASE_LINE_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_4_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_4_1", c)) break;
    }
    return true;
  }

  // KEYWORD_ARG_LIST   END_OF_LINE*
  private static boolean TEST_CASE_LINE_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = KEYWORD_ARG_LIST(b, l + 1);
    r = r && TEST_CASE_LINE_5_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean TEST_CASE_LINE_5_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_LINE_5_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_CASE_LINE_5_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEST_CASE_NAME_TOKEN
  public static boolean TEST_CASE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_CASE_NAME")) return false;
    if (!nextTokenIs(b, TEST_CASE_NAME_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_CASE_NAME_TOKEN);
    exit_section_(b, m, TEST_CASE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // BRACKET_DOCUMENTATION|BRACKET_TAGS|TEST_CASE_BRACKET_SETUP|TEST_CASE_BRACKET_TEARDOWN|TEST_CASE_BRACKET_TEMPLATE|TEST_CASE_BRACKET_TIMEOUT
  public static boolean TEST_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETTING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_SETTING, "<test setting>");
    r = BRACKET_DOCUMENTATION(b, l + 1);
    if (!r) r = BRACKET_TAGS(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_SETUP(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_TEARDOWN(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_TEMPLATE(b, l + 1);
    if (!r) r = TEST_CASE_BRACKET_TIMEOUT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COLUMN_SEPARATOR_TOKEN  TEST_SETTING
  public static boolean TEST_SETTING_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETTING_LINE")) return false;
    if (!nextTokenIs(b, COLUMN_SEPARATOR_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && TEST_SETTING(b, l + 1);
    exit_section_(b, m, TEST_SETTING_LINE, r);
    return r;
  }

  /* ********************************************************** */
  // TEST_SETUP_TOKEN ELLIPSES_FOR_SETTINGS_TABLE+ COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS |
  //                        TEST_SETUP_TOKEN COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS
  public static boolean TEST_SETUP_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_SETUP_SETTING, "<test setup setting>");
    r = TEST_SETUP_SETTING_0(b, l + 1);
    if (!r) r = TEST_SETUP_SETTING_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TEST_SETUP_TOKEN ELLIPSES_FOR_SETTINGS_TABLE+ COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean TEST_SETUP_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_SETUP_TOKEN(b, l + 1);
    r = r && TEST_SETUP_SETTING_0_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_INVOCATION_SETTINGS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ELLIPSES_FOR_SETTINGS_TABLE+
  private static boolean TEST_SETUP_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_SETUP_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // TEST_SETUP_TOKEN COLUMN_SEPARATOR_TOKEN KEYWORD_INVOCATION_SETTINGS
  private static boolean TEST_SETUP_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_SETTING_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_SETUP_TOKEN(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_INVOCATION_SETTINGS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TEST_SETUP_SETTING_TOKEN | TEST_TEARDOWN_SETTING_TOKEN | SUITE_SETUP_SETTING_TOKEN | SUITE_TEARDOWN_SETTING_TOKEN
  public static boolean TEST_SETUP_TOKEN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_SETUP_TOKEN")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TEST_SETUP_TOKEN, "<test setup token>");
    r = consumeToken(b, TEST_SETUP_SETTING_TOKEN);
    if (!r) r = consumeToken(b, TEST_TEARDOWN_SETTING_TOKEN);
    if (!r) r = consumeToken(b, SUITE_SETUP_SETTING_TOKEN);
    if (!r) r = consumeToken(b, SUITE_TEARDOWN_SETTING_TOKEN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TEST_TEMPLATE_SETTING_TOKEN ELLIPSES_FOR_SETTINGS_TABLE* COLUMN_SEPARATOR_TOKEN KEYWORD
  public static boolean TEST_TEMPLATE_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEMPLATE_SETTING")) return false;
    if (!nextTokenIs(b, TEST_TEMPLATE_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_TEMPLATE_SETTING_TOKEN);
    r = r && TEST_TEMPLATE_SETTING_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD(b, l + 1);
    exit_section_(b, m, TEST_TEMPLATE_SETTING, r);
    return r;
  }

  // ELLIPSES_FOR_SETTINGS_TABLE*
  private static boolean TEST_TEMPLATE_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TEMPLATE_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_TEMPLATE_SETTING_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TEST_TIMEOUT_SETTING_TOKEN  ELLIPSES_FOR_SETTINGS_TABLE+ COLUMN_SEPARATOR_TOKEN TIMEOUT_VALUE_TOKEN |
  //                          TEST_TIMEOUT_SETTING_TOKEN  COLUMN_SEPARATOR_TOKEN  TIMEOUT_VALUE_TOKEN
  public static boolean TEST_TIMEOUT_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING")) return false;
    if (!nextTokenIs(b, TEST_TIMEOUT_SETTING_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TEST_TIMEOUT_SETTING_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, TEST_TIMEOUT_SETTING_TOKEN, COLUMN_SEPARATOR_TOKEN, TIMEOUT_VALUE_TOKEN);
    exit_section_(b, m, TEST_TIMEOUT_SETTING, r);
    return r;
  }

  // TEST_TIMEOUT_SETTING_TOKEN  ELLIPSES_FOR_SETTINGS_TABLE+ COLUMN_SEPARATOR_TOKEN TIMEOUT_VALUE_TOKEN
  private static boolean TEST_TIMEOUT_SETTING_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TEST_TIMEOUT_SETTING_TOKEN);
    r = r && TEST_TIMEOUT_SETTING_0_1(b, l + 1);
    r = r && consumeTokens(b, 0, COLUMN_SEPARATOR_TOKEN, TIMEOUT_VALUE_TOKEN);
    exit_section_(b, m, null, r);
    return r;
  }

  // ELLIPSES_FOR_SETTINGS_TABLE+
  private static boolean TEST_TIMEOUT_SETTING_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TEST_TIMEOUT_SETTING_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TEST_TIMEOUT_SETTING_0_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_VARIABLE | ARRAY_VARIABLE
  public static boolean VARIABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE")) return false;
    if (!nextTokenIs(b, "<variable>", ARRAY_VARIABLE_TOKEN, VARIABLE_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE, "<variable>");
    r = SCALAR_VARIABLE(b, l + 1);
    if (!r) r = ARRAY_VARIABLE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SCALAR_ASSIGNMENT_LHS (ASSIGNABLE_IN_VARIABLES_TBL)? END_OF_LINE*  |
  //                    ARRAY_ASSIGNMENT_LHS  (ARRAY_ASSIGNABLE_IN_VARIABLES_TBL)? END_OF_LINE*  |
  //                    ELLIPSES_LINE_SETTINGS END_OF_LINE*
  public static boolean VARIABLES_LINE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLES_LINE, "<variables line>");
    r = VARIABLES_LINE_0(b, l + 1);
    if (!r) r = VARIABLES_LINE_1(b, l + 1);
    if (!r) r = VARIABLES_LINE_2(b, l + 1);
    exit_section_(b, l, m, r, false, not_a_newline_token_parser_);
    return r;
  }

  // SCALAR_ASSIGNMENT_LHS (ASSIGNABLE_IN_VARIABLES_TBL)? END_OF_LINE*
  private static boolean VARIABLES_LINE_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = SCALAR_ASSIGNMENT_LHS(b, l + 1);
    r = r && VARIABLES_LINE_0_1(b, l + 1);
    r = r && VARIABLES_LINE_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ASSIGNABLE_IN_VARIABLES_TBL)?
  private static boolean VARIABLES_LINE_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_0_1")) return false;
    VARIABLES_LINE_0_1_0(b, l + 1);
    return true;
  }

  // (ASSIGNABLE_IN_VARIABLES_TBL)
  private static boolean VARIABLES_LINE_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ASSIGNABLE_IN_VARIABLES_TBL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean VARIABLES_LINE_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_LINE_0_2", c)) break;
    }
    return true;
  }

  // ARRAY_ASSIGNMENT_LHS  (ARRAY_ASSIGNABLE_IN_VARIABLES_TBL)? END_OF_LINE*
  private static boolean VARIABLES_LINE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ARRAY_ASSIGNMENT_LHS(b, l + 1);
    r = r && VARIABLES_LINE_1_1(b, l + 1);
    r = r && VARIABLES_LINE_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ARRAY_ASSIGNABLE_IN_VARIABLES_TBL)?
  private static boolean VARIABLES_LINE_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_1_1")) return false;
    VARIABLES_LINE_1_1_0(b, l + 1);
    return true;
  }

  // (ARRAY_ASSIGNABLE_IN_VARIABLES_TBL)
  private static boolean VARIABLES_LINE_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ARRAY_ASSIGNABLE_IN_VARIABLES_TBL(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean VARIABLES_LINE_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_1_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_LINE_1_2", c)) break;
    }
    return true;
  }

  // ELLIPSES_LINE_SETTINGS END_OF_LINE*
  private static boolean VARIABLES_LINE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELLIPSES_LINE_SETTINGS(b, l + 1);
    r = r && VARIABLES_LINE_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean VARIABLES_LINE_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_LINE_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_LINE_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VARIABLES_TABLE_HEADER (VARIABLES_LINE EMPTY_LINE | EMPTY_LINE)* (VARIABLES_LINE END_OF_LINE* <<eof>>)?
  public static boolean VARIABLES_TABLE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE")) return false;
    if (!nextTokenIs(b, VARIABLES_TABLE_HEADER_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLES_TABLE, null);
    r = VARIABLES_TABLE_HEADER(b, l + 1);
    r = r && VARIABLES_TABLE_1(b, l + 1);
    p = r; // pin = 2
    r = r && VARIABLES_TABLE_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (VARIABLES_LINE EMPTY_LINE | EMPTY_LINE)*
  private static boolean VARIABLES_TABLE_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!VARIABLES_TABLE_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_TABLE_1", c)) break;
    }
    return true;
  }

  // VARIABLES_LINE EMPTY_LINE | EMPTY_LINE
  private static boolean VARIABLES_TABLE_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VARIABLES_TABLE_1_0_0(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLES_LINE EMPTY_LINE
  private static boolean VARIABLES_TABLE_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VARIABLES_LINE(b, l + 1);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (VARIABLES_LINE END_OF_LINE* <<eof>>)?
  private static boolean VARIABLES_TABLE_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_2")) return false;
    VARIABLES_TABLE_2_0(b, l + 1);
    return true;
  }

  // VARIABLES_LINE END_OF_LINE* <<eof>>
  private static boolean VARIABLES_TABLE_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = VARIABLES_LINE(b, l + 1);
    r = r && VARIABLES_TABLE_2_0_1(b, l + 1);
    r = r && eof(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // END_OF_LINE*
  private static boolean VARIABLES_TABLE_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLES_TABLE_2_0_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VARIABLES_TABLE_HEADER_TOKEN EMPTY_LINE
  public static boolean VARIABLES_TABLE_HEADER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLES_TABLE_HEADER")) return false;
    if (!nextTokenIs(b, VARIABLES_TABLE_HEADER_TOKEN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VARIABLES_TABLE_HEADER_TOKEN);
    r = r && EMPTY_LINE(b, l + 1);
    exit_section_(b, m, VARIABLES_TABLE_HEADER, r);
    return r;
  }

  /* ********************************************************** */
  // ( MULTI_ASSIGNMENT_LHS | SINGLE_ASSIGNMENT_LHS ) ELLIPSES_FOR_TEST_TABLE* COLUMN_SEPARATOR_TOKEN  KEYWORD_CALLING_TEST
  public static boolean VARIABLE_ASSIGN_TO_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE_ASSIGN_TO_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_ASSIGN_TO_KEYWORD, "<variable assign to keyword>");
    r = VARIABLE_ASSIGN_TO_KEYWORD_0(b, l + 1);
    r = r && VARIABLE_ASSIGN_TO_KEYWORD_1(b, l + 1);
    r = r && consumeToken(b, COLUMN_SEPARATOR_TOKEN);
    r = r && KEYWORD_CALLING_TEST(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // MULTI_ASSIGNMENT_LHS | SINGLE_ASSIGNMENT_LHS
  private static boolean VARIABLE_ASSIGN_TO_KEYWORD_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE_ASSIGN_TO_KEYWORD_0")) return false;
    boolean r;
    r = MULTI_ASSIGNMENT_LHS(b, l + 1);
    if (!r) r = SINGLE_ASSIGNMENT_LHS(b, l + 1);
    return r;
  }

  // ELLIPSES_FOR_TEST_TABLE*
  private static boolean VARIABLE_ASSIGN_TO_KEYWORD_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE_ASSIGN_TO_KEYWORD_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_TEST_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLE_ASSIGN_TO_KEYWORD_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // VARIABLE_SETTING_TOKEN  ELLIPSES_FOR_SETTINGS_TABLE* COLUMN_SEPARATOR_TOKEN  REFERENCED_FILE
  public static boolean VARIABLE_SETTING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE_SETTING")) return false;
    if (!nextTokenIs(b, VARIABLE_SETTING_TOKEN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, VARIABLE_SETTING, null);
    r = consumeToken(b, VARIABLE_SETTING_TOKEN);
    p = r; // pin = 1
    r = r && report_error_(b, VARIABLE_SETTING_1(b, l + 1));
    r = p && report_error_(b, consumeToken(b, COLUMN_SEPARATOR_TOKEN)) && r;
    r = p && REFERENCED_FILE(b, l + 1) && r;
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // ELLIPSES_FOR_SETTINGS_TABLE*
  private static boolean VARIABLE_SETTING_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VARIABLE_SETTING_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ELLIPSES_FOR_SETTINGS_TABLE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "VARIABLE_SETTING_1", c)) break;
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
  // (TABLE | EMPTY_LINE )* END_OF_LINE*
  static boolean robotFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = robotFile_0(b, l + 1);
    r = r && robotFile_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (TABLE | EMPTY_LINE )*
  private static boolean robotFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!robotFile_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "robotFile_0", c)) break;
    }
    return true;
  }

  // TABLE | EMPTY_LINE
  private static boolean robotFile_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFile_0_0")) return false;
    boolean r;
    r = TABLE(b, l + 1);
    if (!r) r = EMPTY_LINE(b, l + 1);
    return r;
  }

  // END_OF_LINE*
  private static boolean robotFile_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "robotFile_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!END_OF_LINE(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "robotFile_1", c)) break;
    }
    return true;
  }

  static final Parser not_a_newline_token_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return not_a_newline_token(b, l + 1);
    }
  };
}
