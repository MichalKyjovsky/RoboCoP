package cz.cuni.mff.kyjovsm.robocop.highlighter;

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
 * Purpose of this class is to create a palette in the Setting section of IDE
 * for Color Setting of the Robot Framework language.
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
   * @return Default icon representing Robot Framework language.
   */
  @Override
  public @Nullable Icon getIcon() {
    return RobotFrameworkIcons.ICON_MAIN;
  }

  /**
   * @return Instance of RobotFrameworkSyntaxHighlighter responsible for
   * assigning Token defined in grammar and keys defined by
   * DefaultLanguageHighlighterColors class.
   */
  @Override
  public @NotNull SyntaxHighlighter getHighlighter() {
    return new RobotFrameworkSyntaxHighlighter();
  }

  /**
   * @return Text, which is being displayed in setting section and which
   * serves as a presentation how the Syntax Highlighting works.
   */
  @Override
  public @NotNull String getDemoText() {
    return "*** Settings ***\n" +
            "Documentation  Here comes the documentation.\n" +
            "...  ${\\n}Purpose of this template is to create a\n" +
            "...  ${\\n}basis for Robot Framework Test Suite.\n" +
            "Library  Selenium2Library\n" +
            "Resource  ../Keywords/Utils/helper.robot \n" +
            "Variable  ../Keywords/Utils/variables.robot \n" +
            "\n" +
            "*** Variables ***\n" +
            "${msg}=  Two white spaces are fair enough!\n" +
            "@{arr}  1  2  3  4\n" +
            "\n" +
            "*** Test Case ***\n" +
            "My Test One\n" +
            "    [Documentation]  Example test.\n" +
            "    Log  Hello  console=${True}\n" +
            "    # My second keyword" +
            "    My Keyword  \n" +
            "\n" +
            "My Test Two\n" +
            "    Should Be Equal As Strings  ${msg}  Two white spaces are fair enough!\n" +
            "    Should Be Equal As Integers  1  1\n" +
            "\n" +
            "*** Keywords ***\n" +
            "My Keyword\n" +
            "    [Arguments]  ${dir}  \n" +
            "    Directory Should Exist  ${dir}";
  }

  @Override
  public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
    return null;
  }

  /**
   * @return Descriptors defined over the tags from grammar,
   * which assigns particular color to the tag.
   */
  @Override
  public @NotNull AttributesDescriptor[] getAttributeDescriptors() {
    return DESCRIPTORS;
  }

  /**
   * @return New instance of ColorDescriptor[0].
   */
  @Override
  public @NotNull ColorDescriptor[] getColorDescriptors() {
    return ColorDescriptor.EMPTY_ARRAY;
  }

  /**
   * @return Name of the  Robot Framework language
   * to be displayed in Color Settings menu.
   */
  @Override
  public @NotNull String getDisplayName() {
    return "Robot Framework";
  }
}
