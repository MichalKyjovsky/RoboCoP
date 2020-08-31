package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;
import java.util.Map;

/**
 *
 */
public class RobotFrameworkColorSettingPage implements ColorSettingsPage {

  private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[] {
          new AttributesDescriptor("Table's Header", RobotFrameworkSyntaxHighlighter.HEADER),
          new AttributesDescriptor("Settings", RobotFrameworkSyntaxHighlighter.SETTINGS),
          new AttributesDescriptor("Keyword and Test Case Definitions", RobotFrameworkSyntaxHighlighter.DEFINITIONS),
          new AttributesDescriptor("Keywords Invocations", RobotFrameworkSyntaxHighlighter.NAMES),
          new AttributesDescriptor("Tags", RobotFrameworkSyntaxHighlighter.TAGS),
          new AttributesDescriptor("Documentation", RobotFrameworkSyntaxHighlighter.DOCUMENTATION),
          new AttributesDescriptor("Assignments", RobotFrameworkSyntaxHighlighter.ASSIGNMENT),
          new AttributesDescriptor("Keyword Arguments", RobotFrameworkSyntaxHighlighter.ARGUMENTS),
          new AttributesDescriptor("Comments", RobotFrameworkSyntaxHighlighter.COMMENT),
          new AttributesDescriptor("Error", RobotFrameworkSyntaxHighlighter.ERROR),
          new AttributesDescriptor("Numbers", RobotFrameworkSyntaxHighlighter.INTEGER),
          new AttributesDescriptor("Variables", RobotFrameworkSyntaxHighlighter.VARIABLES)
  };

  /**
   * @return
   */
  @Override
  public @Nullable Icon getIcon() {
    return RobotFrameworkIcons.ICON_MAIN;
  }

  /**
   * @return
   */
  @Override
  public @NotNull SyntaxHighlighter getHighlighter() {
    return new RobotFrameworkSyntaxHighlighter();
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getDemoText() {
    return "*** Settings ***\n" +
            "Documentation  Here comes the documentation.\n" +
            "...  ${\\n}Purpose of this template is to create a\n" +
            "...  ${\\n}basis for Robot Framework Test Suite.\n" +
            "Library  Some Library\n" +
            "\n" +
            "*** Variables ***\n" +
            "${msg}=  Two white spaces are fair enough!\n" +
            "@{arr}  1  2  3  4\n" +
            "\n" +
            "*** Test Case ***\n" +
            "My Test\n" +
            "    [Documentation]  Example test.\n" +
            "Log Hello\n" +
            "# My second keyword" +
            "    My Keyword  \n" +
            "\n" +
            "Another Test\n" +
            "    Should Be Equal    Two white spaces are fair enough!\n" +
            "    Should Be Equal As Integers  1  1\n" +
            "\n" +
            "*** Keywords ***\n" +
            "My Keyword\n" +
            "    [Arguments]  \n" +
            "    Directory Should Exist  ";
  }

  /**
   * @return
   */
  @Override
  public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  /**
   * @return
   */
  @Override
  public @NotNull AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  /**
   * @return
   */
  @Override
  public @NotNull ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getDisplayName() {
    return "Robot Framework";
  }
}
