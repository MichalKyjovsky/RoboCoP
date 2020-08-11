// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.*;

public interface RobotFrameworkTypes {

  IElementType COLON = new RobotFrameworkElementType("COLON");
  IElementType DEFAULT_TAGS_SETTING = new RobotFrameworkElementType("DEFAULT_TAGS_SETTING");
  IElementType DOCUMENTATION_SETTING = new RobotFrameworkElementType("DOCUMENTATION_SETTING");
  IElementType FORCE_TAGS_SETTING = new RobotFrameworkElementType("FORCE_TAGS_SETTING");
  IElementType LIBRARY_REFERENCE = new RobotFrameworkElementType("LIBRARY_REFERENCE");
  IElementType LIBRARY_SETTING = new RobotFrameworkElementType("LIBRARY_SETTING");
  IElementType METADATA_SETTING = new RobotFrameworkElementType("METADATA_SETTING");
  IElementType RECURRENCE = new RobotFrameworkElementType("RECURRENCE");
  IElementType RECURRENCE_FOR_SETTING_TABLE = new RobotFrameworkElementType("RECURRENCE_FOR_SETTING_TABLE");
  IElementType REFERENCED_FILE = new RobotFrameworkElementType("REFERENCED_FILE");
  IElementType RESOURCE_SETTING = new RobotFrameworkElementType("RESOURCE_SETTING");
  IElementType ROBOT_FRAMEWORK_FILE = new RobotFrameworkElementType("ROBOT_FRAMEWORK_FILE");
  IElementType SETTING = new RobotFrameworkElementType("SETTING");
  IElementType SETTINGS_PARAMETER = new RobotFrameworkElementType("SETTINGS_PARAMETER");
  IElementType SETTINGS_TABLE = new RobotFrameworkElementType("SETTINGS_TABLE");
  IElementType SETTINGS_TABLE_HEADER = new RobotFrameworkElementType("SETTINGS_TABLE_HEADER");
  IElementType SETTING_LIST = new RobotFrameworkElementType("SETTING_LIST");
  IElementType SETTING_LIST_OR_RECURRENCE = new RobotFrameworkElementType("SETTING_LIST_OR_RECURRENCE");
  IElementType SUITE_SETUP_SETTING = new RobotFrameworkElementType("SUITE_SETUP_SETTING");
  IElementType SUITE_TEARDOWN_SETTING = new RobotFrameworkElementType("SUITE_TEARDOWN_SETTING");
  IElementType TABLE = new RobotFrameworkElementType("TABLE");
  IElementType TAG = new RobotFrameworkElementType("TAG");
  IElementType TEST_SETUP_SETTING = new RobotFrameworkElementType("TEST_SETUP_SETTING");
  IElementType TEST_TEARDOWN_SETTING = new RobotFrameworkElementType("TEST_TEARDOWN_SETTING");
  IElementType TEST_TEMPLATE_SETTING = new RobotFrameworkElementType("TEST_TEMPLATE_SETTING");
  IElementType TEST_TIMEOUT_SETTING = new RobotFrameworkElementType("TEST_TIMEOUT_SETTING");
  IElementType VARIABLES_SETTING = new RobotFrameworkElementType("VARIABLES_SETTING");

  IElementType COLON_TOKEN = new RobotFrameworkTokenType("COLON_TOKEN");
  IElementType COLUMN_SEP_TOKEN = new RobotFrameworkTokenType("COLUMN_SEP_TOKEN");
  IElementType COMMENT_TOKEN = new RobotFrameworkTokenType("COMMENT_TOKEN");
  IElementType DEFAULT_TAGS_SETTING_TOKEN = new RobotFrameworkTokenType("DEFAULT_TAGS_SETTING_TOKEN");
  IElementType DOCUMENTATION_SETTING_TOKEN = new RobotFrameworkTokenType("DOCUMENTATION_SETTING_TOKEN");
  IElementType DOCUMENTATION_TOKEN = new RobotFrameworkTokenType("DOCUMENTATION_TOKEN");
  IElementType FORCE_TAGS_SETTING_TOKEN = new RobotFrameworkTokenType("FORCE_TAGS_SETTING_TOKEN");
  IElementType KEYWORD = new RobotFrameworkTokenType("KEYWORD");
  IElementType KEYWORDS_TABLE = new RobotFrameworkTokenType("KEYWORDS_TABLE");
  IElementType KEYWORD_ARG = new RobotFrameworkTokenType("KEYWORD_ARG");
  IElementType KEYWORD_INVOCATION_SETTINGS = new RobotFrameworkTokenType("KEYWORD_INVOCATION_SETTINGS");
  IElementType LIBRARY_SETTING_TOKEN = new RobotFrameworkTokenType("LIBRARY_SETTING_TOKEN");
  IElementType LIBRARY_TOKEN = new RobotFrameworkTokenType("LIBRARY_TOKEN");
  IElementType METADATA_SETTING_TOKEN = new RobotFrameworkTokenType("METADATA_SETTING_TOKEN");
  IElementType NEWLINE_TOKEN = new RobotFrameworkTokenType("NEWLINE_TOKEN");
  IElementType NEW_LINE_TOKEN = new RobotFrameworkTokenType("NEW_LINE_TOKEN");
  IElementType RECURRENCE_TOKEN = new RobotFrameworkTokenType("RECURRENCE_TOKEN");
  IElementType RESOURCE_SETTING_TOKEN = new RobotFrameworkTokenType("RESOURCE_SETTING_TOKEN");
  IElementType RF_FILE_TOKEN = new RobotFrameworkTokenType("RF_FILE_TOKEN");
  IElementType SETTINGS_TABLE_HEADER_TOKEN = new RobotFrameworkTokenType("SETTINGS_TABLE_HEADER_TOKEN");
  IElementType SUITE_SETUP_SETTING_TOKEN = new RobotFrameworkTokenType("SUITE_SETUP_SETTING_TOKEN");
  IElementType SUITE_TEARDOWN_SETTING_TOKEN = new RobotFrameworkTokenType("SUITE_TEARDOWN_SETTING_TOKEN");
  IElementType TAG_TOKEN = new RobotFrameworkTokenType("TAG_TOKEN");
  IElementType TEST_CASES_TABLE = new RobotFrameworkTokenType("TEST_CASES_TABLE");
  IElementType TEST_SETUP_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_SETUP_SETTING_TOKEN");
  IElementType TEST_TEARDOWN_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TEARDOWN_SETTING_TOKEN");
  IElementType TEST_TEMPLATE_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TEMPLATE_SETTING_TOKEN");
  IElementType TEST_TIMEOUT_SETTING_TOKEN = new RobotFrameworkTokenType("TEST_TIMEOUT_SETTING_TOKEN");
  IElementType TIMEOUT_UNITS_TOKEN = new RobotFrameworkTokenType("TIMEOUT_UNITS_TOKEN");
  IElementType VARIABLES_SETTING_TOKEN = new RobotFrameworkTokenType("VARIABLES_SETTING_TOKEN");
  IElementType VARIABLES_TABLE = new RobotFrameworkTokenType("VARIABLES_TABLE");
  IElementType WHITESPACE_TOKEN = new RobotFrameworkTokenType("WHITESPACE_TOKEN");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == COLON) {
        return new RobotFrameworkColonImpl(node);
      }
      else if (type == DEFAULT_TAGS_SETTING) {
        return new RobotFrameworkDefaultTagsSettingImpl(node);
      }
      else if (type == DOCUMENTATION_SETTING) {
        return new RobotFrameworkDocumentationSettingImpl(node);
      }
      else if (type == FORCE_TAGS_SETTING) {
        return new RobotFrameworkForceTagsSettingImpl(node);
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
      else if (type == RECURRENCE) {
        return new RobotFrameworkRecurrenceImpl(node);
      }
      else if (type == RECURRENCE_FOR_SETTING_TABLE) {
        return new RobotFrameworkRecurrenceForSettingTableImpl(node);
      }
      else if (type == REFERENCED_FILE) {
        return new RobotFrameworkReferencedFileImpl(node);
      }
      else if (type == RESOURCE_SETTING) {
        return new RobotFrameworkResourceSettingImpl(node);
      }
      else if (type == ROBOT_FRAMEWORK_FILE) {
        return new RobotFrameworkRobotFrameworkFileImpl(node);
      }
      else if (type == SETTING) {
        return new RobotFrameworkSettingImpl(node);
      }
      else if (type == SETTINGS_PARAMETER) {
        return new RobotFrameworkSettingsParameterImpl(node);
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
      else if (type == SETTING_LIST_OR_RECURRENCE) {
        return new RobotFrameworkSettingListOrRecurrenceImpl(node);
      }
      else if (type == SUITE_SETUP_SETTING) {
        return new RobotFrameworkSuiteSetupSettingImpl(node);
      }
      else if (type == SUITE_TEARDOWN_SETTING) {
        return new RobotFrameworkSuiteTeardownSettingImpl(node);
      }
      else if (type == TABLE) {
        return new RobotFrameworkTableImpl(node);
      }
      else if (type == TAG) {
        return new RobotFrameworkTagImpl(node);
      }
      else if (type == TEST_SETUP_SETTING) {
        return new RobotFrameworkTestSetupSettingImpl(node);
      }
      else if (type == TEST_TEARDOWN_SETTING) {
        return new RobotFrameworkTestTeardownSettingImpl(node);
      }
      else if (type == TEST_TEMPLATE_SETTING) {
        return new RobotFrameworkTestTemplateSettingImpl(node);
      }
      else if (type == TEST_TIMEOUT_SETTING) {
        return new RobotFrameworkTestTimeoutSettingImpl(node);
      }
      else if (type == VARIABLES_SETTING) {
        return new RobotFrameworkVariablesSettingImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
