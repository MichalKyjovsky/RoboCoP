// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkElementType;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTokenType;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.*;

public interface RobotFrameworkTypes {

  IElementType ARGUMENTS_SETTING = new RobotFrameworkElementType("ARGUMENTS_SETTING");
  IElementType ARGUMENT_DEFINITION = new RobotFrameworkElementType("ARGUMENT_DEFINITION");
  IElementType ARRAY_ASSIGNABLE_IN_VARIABLES_TBL = new RobotFrameworkElementType("ARRAY_ASSIGNABLE_IN_VARIABLES_TBL");
  IElementType ARRAY_ASSIGNMENT = new RobotFrameworkElementType("ARRAY_ASSIGNMENT");
  IElementType ARRAY_ASSIGNMENT_LHS = new RobotFrameworkElementType("ARRAY_ASSIGNMENT_LHS");
  IElementType ARRAY_VARIABLE = new RobotFrameworkElementType("ARRAY_VARIABLE");
  IElementType ASSIGNABLE_IN_VARIABLES_TBL = new RobotFrameworkElementType("ASSIGNABLE_IN_VARIABLES_TBL");
  IElementType ASSIGNMENT = new RobotFrameworkElementType("ASSIGNMENT");
  IElementType BRACKET_DOCUMENTATION = new RobotFrameworkElementType("BRACKET_DOCUMENTATION");
  IElementType BRACKET_TAGS = new RobotFrameworkElementType("BRACKET_TAGS");
  IElementType DOCUMENTATION_SETTING = new RobotFrameworkElementType("DOCUMENTATION_SETTING");
  IElementType DOUBLE_BOUND_FOR_LOOP = new RobotFrameworkElementType("DOUBLE_BOUND_FOR_LOOP");
  IElementType DOUBLE_BOUND_FOR_LOOP_WITH_STEP = new RobotFrameworkElementType("DOUBLE_BOUND_FOR_LOOP_WITH_STEP");
  IElementType ELLIPSES = new RobotFrameworkElementType("ELLIPSES");
  IElementType ELLIPSES_LINE_TEST = new RobotFrameworkElementType("ELLIPSES_LINE_TEST");
  IElementType EMPTY_LINE = new RobotFrameworkElementType("EMPTY_LINE");
  IElementType ERROR = new RobotFrameworkElementType("ERROR");
  IElementType EXECUTION_LINE = new RobotFrameworkElementType("EXECUTION_LINE");
  IElementType FORCE_TAGS_SETTING = new RobotFrameworkElementType("FORCE_TAGS_SETTING");
  IElementType FOR_LOOP_IN = new RobotFrameworkElementType("FOR_LOOP_IN");
  IElementType FOR_LOOP_IN_RANGE = new RobotFrameworkElementType("FOR_LOOP_IN_RANGE");
  IElementType FOR_LOOP_VALUE_LIST = new RobotFrameworkElementType("FOR_LOOP_VALUE_LIST");
  IElementType FOR_VAR_IN = new RobotFrameworkElementType("FOR_VAR_IN");
  IElementType FOR_VAR_IN_RANGE = new RobotFrameworkElementType("FOR_VAR_IN_RANGE");
  IElementType GENERIC_SETTING = new RobotFrameworkElementType("GENERIC_SETTING");
  IElementType GENERIC_SETTING_NAME = new RobotFrameworkElementType("GENERIC_SETTING_NAME");
  IElementType INDENTED_KEYWORD_INVOCATION_TEST = new RobotFrameworkElementType("INDENTED_KEYWORD_INVOCATION_TEST");
  IElementType INDENTED_VARIABLE_ASSIGN_TO_KEYWORD = new RobotFrameworkElementType("INDENTED_VARIABLE_ASSIGN_TO_KEYWORD");
  IElementType KEYWORD = new RobotFrameworkKeywordElementType("KEYWORD");
  IElementType KEYWORDS_TABLE = new RobotFrameworkElementType("KEYWORDS_TABLE");
  IElementType KEYWORDS_TABLE_HEADER = new RobotFrameworkElementType("KEYWORDS_TABLE_HEADER");
  IElementType KEYWORD_ARGUMENT = new RobotFrameworkKeywordArgumentElementType("KEYWORD_ARGUMENT");
  IElementType KEYWORD_ARG_LIST = new RobotFrameworkElementType("KEYWORD_ARG_LIST");
  IElementType KEYWORD_CALLING_TEST = new RobotFrameworkElementType("KEYWORD_CALLING_TEST");
  IElementType KEYWORD_DEFINITION = new RobotFrameworkElementType("KEYWORD_DEFINITION");
  IElementType KEYWORD_INVOCATION_SETTINGS = new RobotFrameworkElementType("KEYWORD_INVOCATION_SETTINGS");
  IElementType KEYWORD_LINE = new RobotFrameworkElementType("KEYWORD_LINE");
  IElementType KEYWORD_NAME = new RobotFrameworkKeywordNameElementType("KEYWORD_NAME");
  IElementType KEYWORD_SETTING = new RobotFrameworkElementType("KEYWORD_SETTING");
  IElementType KEYWORD_SETTING_LINE = new RobotFrameworkElementType("KEYWORD_SETTING_LINE");
  IElementType LIBRARY_REFERENCE = new RobotFrameworkElementType("LIBRARY_REFERENCE");
  IElementType LIBRARY_SETTING = new RobotFrameworkElementType("LIBRARY_SETTING");
  IElementType METADATA_SETTING = new RobotFrameworkElementType("METADATA_SETTING");
  IElementType MULTI_ASSIGNMENT_LHS = new RobotFrameworkElementType("MULTI_ASSIGNMENT_LHS");
  IElementType REFERENCED_FILE = new RobotFrameworkElementType("REFERENCED_FILE");
  IElementType RESOURCE_SETTING = new RobotFrameworkElementType("RESOURCE_SETTING");
  IElementType RETURN_LINE = new RobotFrameworkElementType("RETURN_LINE");
  IElementType RETURN_SETTING = new RobotFrameworkElementType("RETURN_SETTING");
  IElementType SCALAR_ASSIGNMENT = new RobotFrameworkScalarAssignmentElementType("SCALAR_ASSIGNMENT");
  IElementType SCALAR_ASSIGNMENT_LHS = new RobotFrameworkElementType("SCALAR_ASSIGNMENT_LHS");
  IElementType SCALAR_DEFAULT_ARG_VALUE = new RobotFrameworkElementType("SCALAR_DEFAULT_ARG_VALUE");
  IElementType SCALAR_VARIABLE = new RobotFrameworkScalarVariableElementType("SCALAR_VARIABLE");
  IElementType SETTING = new RobotFrameworkElementType("SETTING");
  IElementType SETTINGS_LINE = new RobotFrameworkElementType("SETTINGS_LINE");
  IElementType SETTINGS_TABLE = new RobotFrameworkElementType("SETTINGS_TABLE");
  IElementType SETTINGS_TABLE_HEADER = new RobotFrameworkElementType("SETTINGS_TABLE_HEADER");
  IElementType SETTING_LIST = new RobotFrameworkElementType("SETTING_LIST");
  IElementType SINGLE_ASSIGNMENT_LHS = new RobotFrameworkElementType("SINGLE_ASSIGNMENT_LHS");
  IElementType SINGLE_BOUND_FOR_LOOP = new RobotFrameworkElementType("SINGLE_BOUND_FOR_LOOP");
  IElementType SINGLE_VARIABLE_LIST = new RobotFrameworkElementType("SINGLE_VARIABLE_LIST");
  IElementType TABLE = new RobotFrameworkElementType("TABLE");
  IElementType TAG = new RobotFrameworkElementType("TAG");
  IElementType TEST_CASE = new RobotFrameworkTestCaseElementType("TEST_CASE");
  IElementType TEST_CASES_TABLE = new RobotFrameworkElementType("TEST_CASES_TABLE");
  IElementType TEST_CASES_TABLE_HEADER = new RobotFrameworkElementType("TEST_CASES_TABLE_HEADER");
  IElementType TEST_CASE_BRACKET_SETUP = new RobotFrameworkElementType("TEST_CASE_BRACKET_SETUP");
  IElementType TEST_CASE_BRACKET_TEARDOWN = new RobotFrameworkElementType("TEST_CASE_BRACKET_TEARDOWN");
  IElementType TEST_CASE_BRACKET_TEMPLATE = new RobotFrameworkElementType("TEST_CASE_BRACKET_TEMPLATE");
  IElementType TEST_CASE_BRACKET_TIMEOUT = new RobotFrameworkElementType("TEST_CASE_BRACKET_TIMEOUT");
  IElementType TEST_CASE_LINE = new RobotFrameworkElementType("TEST_CASE_LINE");
  IElementType TEST_CASE_NAME = new RobotFrameworkElementType("TEST_CASE_NAME");
  IElementType TEST_SETTING = new RobotFrameworkElementType("TEST_SETTING");
  IElementType TEST_SETTING_LINE = new RobotFrameworkElementType("TEST_SETTING_LINE");
  IElementType TEST_SETUP_SETTING = new RobotFrameworkElementType("TEST_SETUP_SETTING");
  IElementType TEST_SETUP_TOKEN = new RobotFrameworkElementType("TEST_SETUP_TOKEN");
  IElementType TEST_TEMPLATE_SETTING = new RobotFrameworkElementType("TEST_TEMPLATE_SETTING");
  IElementType TEST_TIMEOUT_SETTING = new RobotFrameworkElementType("TEST_TIMEOUT_SETTING");
  IElementType VARIABLE = new RobotFrameworkElementType("VARIABLE");
  IElementType VARIABLES_LINE = new RobotFrameworkElementType("VARIABLES_LINE");
  IElementType VARIABLES_TABLE = new RobotFrameworkElementType("VARIABLES_TABLE");
  IElementType VARIABLES_TABLE_HEADER = new RobotFrameworkElementType("VARIABLES_TABLE_HEADER");
  IElementType VARIABLE_ASSIGN_TO_KEYWORD = new RobotFrameworkElementType("VARIABLE_ASSIGN_TO_KEYWORD");
  IElementType VARIABLE_SETTING = new RobotFrameworkElementType("VARIABLE_SETTING");

  IElementType ARGUMENTS_SETTING_TOKEN = new RobotFrameworkTokenType("ARGUMENTS_SETTING_TOKEN");
  IElementType ARRAY_ASSIGNMENT_TOKEN = new RobotFrameworkTokenType("ARRAY_ASSIGNMENT_TOKEN");
  IElementType ARRAY_VARIABLE_ACCESS_TOKEN = new RobotFrameworkTokenType("ARRAY_VARIABLE_ACCESS_TOKEN");
  IElementType ARRAY_VARIABLE_TOKEN = new RobotFrameworkTokenType("ARRAY_VARIABLE_TOKEN");
  IElementType ASSIGNMENT_TOKEN = new RobotFrameworkTokenType("ASSIGNMENT_TOKEN");
  IElementType BRACKET_DOCUMENTATION_TOKEN = new RobotFrameworkTokenType("BRACKET_DOCUMENTATION_TOKEN");
  IElementType BRACKET_SETUP_TOKEN = new RobotFrameworkTokenType("BRACKET_SETUP_TOKEN");
  IElementType BRACKET_TAGS_TOKEN = new RobotFrameworkTokenType("BRACKET_TAGS_TOKEN");
  IElementType BRACKET_TEARDOWN_TOKEN = new RobotFrameworkTokenType("BRACKET_TEARDOWN_TOKEN");
  IElementType BRACKET_TIMEOUT_TOKEN = new RobotFrameworkTokenType("BRACKET_TIMEOUT_TOKEN");
  IElementType COLUMN_SEPARATOR_TOKEN = new RobotFrameworkTokenType("COLUMN_SEPARATOR_TOKEN");
  IElementType COMMENT_TOKEN = new RobotFrameworkTokenType("COMMENT_TOKEN");
  IElementType DOCUMENTATION_SETTING_TOKEN = new RobotFrameworkTokenType("DOCUMENTATION_SETTING_TOKEN");
  IElementType DOCUMENTATION_TOKEN = new RobotFrameworkTokenType("DOCUMENTATION_TOKEN");
  IElementType ELLIPSES_TOKEN = new RobotFrameworkTokenType("ELLIPSES_TOKEN");
  IElementType EMPTY_CELL_TOKEN = new RobotFrameworkTokenType("EMPTY_CELL_TOKEN");
  IElementType FORCE_TAGS_SETTING_KEYWORD_TOKEN = new RobotFrameworkTokenType("FORCE_TAGS_SETTING_KEYWORD_TOKEN");
  IElementType FOR_LOOP_START_TOKEN = new RobotFrameworkTokenType("FOR_LOOP_START_TOKEN");
  IElementType GENERIC_SETTING_TOKEN = new RobotFrameworkTokenType("GENERIC_SETTING_TOKEN");
  IElementType INTEGER_TOKEN = new RobotFrameworkTokenType("INTEGER_TOKEN");
  IElementType INVALID_SYNTAX_TOKEN = new RobotFrameworkTokenType("INVALID_SYNTAX_TOKEN");
  IElementType IN_RANGE_TOKEN = new RobotFrameworkTokenType("IN_RANGE_TOKEN");
  IElementType IN_TOKEN = new RobotFrameworkTokenType("IN_TOKEN");
  IElementType KEYWORDS_TABLE_HEADER_TOKEN = new RobotFrameworkTokenType("KEYWORDS_TABLE_HEADER_TOKEN");
  IElementType LIBRARY_REFERENCE_TOKEN = new RobotFrameworkTokenType("LIBRARY_REFERENCE_TOKEN");
  IElementType LIBRARY_SETTING_TOKEN = new RobotFrameworkTokenType("LIBRARY_SETTING_TOKEN");
  IElementType METADATA_SETTING_TOKEN = new RobotFrameworkTokenType("METADATA_SETTING_TOKEN");
  IElementType NEWLINE_TOKEN = new RobotFrameworkTokenType("NEWLINE_TOKEN");
  IElementType RESOURCE_SETTING_TOKEN = new RobotFrameworkTokenType("RESOURCE_SETTING_TOKEN");
  IElementType RETURN_SETTING_TOKEN = new RobotFrameworkTokenType("RETURN_SETTING_TOKEN");
  IElementType ROBOT_FILE_TOKEN = new RobotFrameworkTokenType("ROBOT_FILE_TOKEN");
  IElementType ROBOT_KEYWORD_ARGUMENT_TOKEN = new RobotFrameworkTokenType("ROBOT_KEYWORD_ARGUMENT_TOKEN");
  IElementType ROBOT_KEYWORD_NAME_TOKEN = new RobotFrameworkTokenType("ROBOT_KEYWORD_NAME_TOKEN");
  IElementType ROBOT_KEYWORD_TOKEN = new RobotFrameworkTokenType("ROBOT_KEYWORD_TOKEN");
  IElementType SCALAR_DEFAULT_ARG_VALUE_TOKEN = new RobotFrameworkTokenType("SCALAR_DEFAULT_ARG_VALUE_TOKEN");
  IElementType SETTINGS_TABLE_HEADER_TOKEN = new RobotFrameworkTokenType("SETTINGS_TABLE_HEADER_TOKEN");
  IElementType SUITE_SETUP_SETTING_TOKEN = new RobotFrameworkTokenType("SUITE_SETUP_SETTING_TOKEN");
  IElementType SUITE_TEARDOWN_SETTING_TOKEN = new RobotFrameworkTokenType("SUITE_TEARDOWN_SETTING_TOKEN");
  IElementType TAG_TOKEN = new RobotFrameworkTokenType("TAG_TOKEN");
  IElementType TEMPLATE_SETTING_TOKEN = new RobotFrameworkTokenType("TEMPLATE_SETTING_TOKEN");
  IElementType TEST_CASES_TABLE_HEADER_TOKEN = new RobotFrameworkTokenType("TEST_CASES_TABLE_HEADER_TOKEN");
  IElementType TEST_CASE_NAME_TOKEN = new RobotFrameworkTokenType("TEST_CASE_NAME_TOKEN");
  IElementType TEST_SETUP_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_SETUP_SETTING_TOKEN");
  IElementType TEST_TEARDOWN_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TEARDOWN_SETTING_TOKEN");
  IElementType TEST_TEMPLATE_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TEMPLATE_SETTING_TOKEN");
  IElementType TEST_TIMEOUT_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TIMEOUT_SETTING_TOKEN");
  IElementType TIMEOUT_VALUE_TOKEN = new RobotFrameworkTokenType("TIMEOUT_VALUE_TOKEN");
  IElementType VARIABLES_TABLE_HEADER_TOKEN = new RobotFrameworkTokenType("VARIABLES_TABLE_HEADER_TOKEN");
  IElementType VARIABLE_SETTING_TOKEN = new RobotFrameworkTokenType("VARIABLE_SETTING_TOKEN");
  IElementType VARIABLE_TOKEN = new RobotFrameworkTokenType("VARIABLE_TOKEN");
  IElementType WHITESPACE_TOKEN = new RobotFrameworkTokenType("WHITESPACE_TOKEN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENTS_SETTING) {
        return new RobotFrameworkArgumentsSettingImpl(node);
      }
      else if (type == ARGUMENT_DEFINITION) {
        return new RobotFrameworkArgumentDefinitionImpl(node);
      }
      else if (type == ARRAY_ASSIGNABLE_IN_VARIABLES_TBL) {
        return new RobotFrameworkArrayAssignableInVariablesTblImpl(node);
      }
      else if (type == ARRAY_ASSIGNMENT) {
        return new RobotFrameworkArrayAssignmentImpl(node);
      }
      else if (type == ARRAY_ASSIGNMENT_LHS) {
        return new RobotFrameworkArrayAssignmentLhsImpl(node);
      }
      else if (type == ARRAY_VARIABLE) {
        return new RobotFrameworkArrayVariableImpl(node);
      }
      else if (type == ASSIGNABLE_IN_VARIABLES_TBL) {
        return new RobotFrameworkAssignableInVariablesTblImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new RobotFrameworkAssignmentImpl(node);
      }
      else if (type == BRACKET_DOCUMENTATION) {
        return new RobotFrameworkBracketDocumentationImpl(node);
      }
      else if (type == BRACKET_TAGS) {
        return new RobotFrameworkBracketTagsImpl(node);
      }
      else if (type == DOCUMENTATION_SETTING) {
        return new RobotFrameworkDocumentationSettingImpl(node);
      }
      else if (type == DOUBLE_BOUND_FOR_LOOP) {
        return new RobotFrameworkDoubleBoundForLoopImpl(node);
      }
      else if (type == DOUBLE_BOUND_FOR_LOOP_WITH_STEP) {
        return new RobotFrameworkDoubleBoundForLoopWithStepImpl(node);
      }
      else if (type == ELLIPSES) {
        return new RobotFrameworkEllipsesImpl(node);
      }
      else if (type == ELLIPSES_LINE_TEST) {
        return new RobotFrameworkEllipsesLineTestImpl(node);
      }
      else if (type == EMPTY_LINE) {
        return new RobotFrameworkEmptyLineImpl(node);
      }
      else if (type == ERROR) {
        return new RobotFrameworkErrorImpl(node);
      }
      else if (type == EXECUTION_LINE) {
        return new RobotFrameworkExecutionLineImpl(node);
      }
      else if (type == FORCE_TAGS_SETTING) {
        return new RobotFrameworkForceTagsSettingImpl(node);
      }
      else if (type == FOR_LOOP_IN) {
        return new RobotFrameworkForLoopInImpl(node);
      }
      else if (type == FOR_LOOP_IN_RANGE) {
        return new RobotFrameworkForLoopInRangeImpl(node);
      }
      else if (type == FOR_LOOP_VALUE_LIST) {
        return new RobotFrameworkForLoopValueListImpl(node);
      }
      else if (type == FOR_VAR_IN) {
        return new RobotFrameworkForVarInImpl(node);
      }
      else if (type == FOR_VAR_IN_RANGE) {
        return new RobotFrameworkForVarInRangeImpl(node);
      }
      else if (type == GENERIC_SETTING) {
        return new RobotFrameworkGenericSettingImpl(node);
      }
      else if (type == GENERIC_SETTING_NAME) {
        return new RobotFrameworkGenericSettingNameImpl(node);
      }
      else if (type == INDENTED_KEYWORD_INVOCATION_TEST) {
        return new RobotFrameworkIndentedKeywordInvocationTestImpl(node);
      }
      else if (type == INDENTED_VARIABLE_ASSIGN_TO_KEYWORD) {
        return new RobotFrameworkIndentedVariableAssignToKeywordImpl(node);
      }
      else if (type == KEYWORD) {
        return new RobotFrameworkKeywordImpl(node);
      }
      else if (type == KEYWORDS_TABLE) {
        return new RobotFrameworkKeywordsTableImpl(node);
      }
      else if (type == KEYWORDS_TABLE_HEADER) {
        return new RobotFrameworkKeywordsTableHeaderImpl(node);
      }
      else if (type == KEYWORD_ARGUMENT) {
        return new RobotFrameworkKeywordArgumentImpl(node);
      }
      else if (type == KEYWORD_ARG_LIST) {
        return new RobotFrameworkKeywordArgListImpl(node);
      }
      else if (type == KEYWORD_CALLING_TEST) {
        return new RobotFrameworkKeywordCallingTestImpl(node);
      }
      else if (type == KEYWORD_DEFINITION) {
        return new RobotFrameworkKeywordDefinitionImpl(node);
      }
      else if (type == KEYWORD_INVOCATION_SETTINGS) {
        return new RobotFrameworkKeywordInvocationSettingsImpl(node);
      }
      else if (type == KEYWORD_LINE) {
        return new RobotFrameworkKeywordLineImpl(node);
      }
      else if (type == KEYWORD_NAME) {
        return new RobotFrameworkKeywordNameImpl(node);
      }
      else if (type == KEYWORD_SETTING) {
        return new RobotFrameworkKeywordSettingImpl(node);
      }
      else if (type == KEYWORD_SETTING_LINE) {
        return new RobotFrameworkKeywordSettingLineImpl(node);
      }
      else if (type == LIBRARY_REFERENCE) {
        return new RobotFrameworkLibraryReferenceImpl(node);
      }
      else if (type == LIBRARY_SETTING) {
        return new RobotFrameworkLibrarySettingImpl(node);
      }
      else if (type == METADATA_SETTING) {
        return new RobotFrameworkMetadataSettingImpl(node);
      }
      else if (type == MULTI_ASSIGNMENT_LHS) {
        return new RobotFrameworkMultiAssignmentLhsImpl(node);
      }
      else if (type == REFERENCED_FILE) {
        return new RobotFrameworkReferencedFileImpl(node);
      }
      else if (type == RESOURCE_SETTING) {
        return new RobotFrameworkResourceSettingImpl(node);
      }
      else if (type == RETURN_LINE) {
        return new RobotFrameworkReturnLineImpl(node);
      }
      else if (type == RETURN_SETTING) {
        return new RobotFrameworkReturnSettingImpl(node);
      }
      else if (type == SCALAR_ASSIGNMENT) {
        return new RobotFrameworkScalarAssignmentImpl(node);
      }
      else if (type == SCALAR_ASSIGNMENT_LHS) {
        return new RobotFrameworkScalarAssignmentLhsImpl(node);
      }
      else if (type == SCALAR_DEFAULT_ARG_VALUE) {
        return new RobotFrameworkScalarDefaultArgValueImpl(node);
      }
      else if (type == SCALAR_VARIABLE) {
        return new RobotFrameworkScalarVariableImpl(node);
      }
      else if (type == SETTING) {
        return new RobotFrameworkSettingImpl(node);
      }
      else if (type == SETTINGS_LINE) {
        return new RobotFrameworkSettingsLineImpl(node);
      }
      else if (type == SETTINGS_TABLE) {
        return new RobotFrameworkSettingsTableImpl(node);
      }
      else if (type == SETTINGS_TABLE_HEADER) {
        return new RobotFrameworkSettingsTableHeaderImpl(node);
      }
      else if (type == SETTING_LIST) {
        return new RobotFrameworkSettingListImpl(node);
      }
      else if (type == SINGLE_ASSIGNMENT_LHS) {
        return new RobotFrameworkSingleAssignmentLhsImpl(node);
      }
      else if (type == SINGLE_BOUND_FOR_LOOP) {
        return new RobotFrameworkSingleBoundForLoopImpl(node);
      }
      else if (type == SINGLE_VARIABLE_LIST) {
        return new RobotFrameworkSingleVariableListImpl(node);
      }
      else if (type == TABLE) {
        return new RobotFrameworkTableImpl(node);
      }
      else if (type == TAG) {
        return new RobotFrameworkTagImpl(node);
      }
      else if (type == TEST_CASE) {
        return new RobotFrameworkTestCaseImpl(node);
      }
      else if (type == TEST_CASES_TABLE) {
        return new RobotFrameworkTestCasesTableImpl(node);
      }
      else if (type == TEST_CASES_TABLE_HEADER) {
        return new RobotFrameworkTestCasesTableHeaderImpl(node);
      }
      else if (type == TEST_CASE_BRACKET_SETUP) {
        return new RobotFrameworkTestCaseBracketSetupImpl(node);
      }
      else if (type == TEST_CASE_BRACKET_TEARDOWN) {
        return new RobotFrameworkTestCaseBracketTeardownImpl(node);
      }
      else if (type == TEST_CASE_BRACKET_TEMPLATE) {
        return new RobotFrameworkTestCaseBracketTemplateImpl(node);
      }
      else if (type == TEST_CASE_BRACKET_TIMEOUT) {
        return new RobotFrameworkTestCaseBracketTimeoutImpl(node);
      }
      else if (type == TEST_CASE_LINE) {
        return new RobotFrameworkTestCaseLineImpl(node);
      }
      else if (type == TEST_CASE_NAME) {
        return new RobotFrameworkTestCaseNameImpl(node);
      }
      else if (type == TEST_SETTING) {
        return new RobotFrameworkTestSettingImpl(node);
      }
      else if (type == TEST_SETTING_LINE) {
        return new RobotFrameworkTestSettingLineImpl(node);
      }
      else if (type == TEST_SETUP_SETTING) {
        return new RobotFrameworkTestSetupSettingImpl(node);
      }
      else if (type == TEST_SETUP_TOKEN) {
        return new RobotFrameworkTestSetupTokenImpl(node);
      }
      else if (type == TEST_TEMPLATE_SETTING) {
        return new RobotFrameworkTestTemplateSettingImpl(node);
      }
      else if (type == TEST_TIMEOUT_SETTING) {
        return new RobotFrameworkTestTimeoutSettingImpl(node);
      }
      else if (type == VARIABLE) {
        return new RobotFrameworkVariableImpl(node);
      }
      else if (type == VARIABLES_LINE) {
        return new RobotFrameworkVariablesLineImpl(node);
      }
      else if (type == VARIABLES_TABLE) {
        return new RobotFrameworkVariablesTableImpl(node);
      }
      else if (type == VARIABLES_TABLE_HEADER) {
        return new RobotFrameworkVariablesTableHeaderImpl(node);
      }
      else if (type == VARIABLE_ASSIGN_TO_KEYWORD) {
        return new RobotFrameworkVariableAssignToKeywordImpl(node);
      }
      else if (type == VARIABLE_SETTING) {
        return new RobotFrameworkVariableSettingImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
