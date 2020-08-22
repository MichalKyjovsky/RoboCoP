package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes;

import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;

@SuppressWarnings({ "ALL" })

%%

%class RobotFrameworkLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
return;
%eof}

%line
%column
%char
%caseless

%{
  int yyline, yycolumn, yychar;
  private boolean documentationLine = false;
  private boolean tagsLine = false;
  private boolean timeoutLine = false;
  private boolean returnLine = false;
  private boolean keywordToLeft = false;
  private boolean lineBeginning = true;
  private boolean firstCell = true;
  private boolean argumentsLine = false;
  private boolean forLoopLine = false;
  private boolean resourceSettingLine = false;
  private boolean librarySettingLine = false;
  private int previous_state = YYINITIAL;

  private IElementType next(IElementType toReturn) {
    if (toReturn != WHITESPACE_TOKEN) {
        lineBeginning = false;
    }

    if (firstCell && toReturn != WHITESPACE_TOKEN && toReturn != COLUMN_SEPARATOR_TOKEN && toReturn != EMPTY_CELL_TOKEN) {
        // If we see an ellipses, then retain the state from the previous line so everything is tokenized properly
        if (toReturn == ELLIPSES_TOKEN && documentationLine) {
            yybegin(DOCUMENTATION_SETTING);
        } else if (toReturn != ELLIPSES_TOKEN) {
           keywordToLeft = false;
           tagsLine = false;
           timeoutLine = false;
           documentationLine = false;
           returnLine = false;
           argumentsLine =  false;
           forLoopLine = false;
           resourceSettingLine =  false;
           librarySettingLine = false;
        }
        firstCell = false;
    }

    if (toReturn == INVALID_SYNTAX_TOKEN) {
        System.out.println(String.format("Bad syntax \"%s\" at line %d col %d", yytext(), yyline, yycolumn));
    }
    else if (toReturn == ROBOT_KEYWORD_TOKEN) {
        if (keywordToLeft || returnLine || forLoopLine) {
            return ROBOT_KEYWORD_ARGUMENT_TOKEN;
        } else if (tagsLine) {
            return TAG_TOKEN;
        } else if (documentationLine) {
            return DOCUMENTATION_TOKEN;
        } else if (resourceSettingLine) {
            return ROBOT_FILE_TOKEN;
        } else if (librarySettingLine) {
            librarySettingLine = false;
            return LIBRARY_REFERENCE_TOKEN;
        } else {
        keywordToLeft = true;
        return ROBOT_KEYWORD_TOKEN;
        }
    }
    else if (toReturn == ROBOT_KEYWORD_ARGUMENT_TOKEN) {
         if (keywordToLeft) {
            return ROBOT_KEYWORD_ARGUMENT_TOKEN;
         } else if (tagsLine) {
            return TAG_TOKEN;
         } else if (documentationLine) {
            return DOCUMENTATION_TOKEN;
         } else if (resourceSettingLine) {
             return ROBOT_FILE_TOKEN;
         } else if (librarySettingLine) {
             librarySettingLine = false;
             return LIBRARY_REFERENCE_TOKEN;
         } else {
             return ROBOT_KEYWORD_ARGUMENT_TOKEN;
         }
    }
    else if (toReturn == FOR_LOOP_START_TOKEN) {
        forLoopLine = true;
        return FOR_LOOP_START_TOKEN;
    }
    else if (toReturn == BRACKET_TAGS_TOKEN || toReturn == FORCE_TAGS_SETTING_KEYWORD_TOKEN) {
        tagsLine = true;
    }
    else if (toReturn == BRACKET_TIMEOUT_TOKEN || toReturn == TEST_TIMEOUT_SETTING_TOKEN) {
        timeoutLine = true;
    }
    else if (toReturn == BRACKET_DOCUMENTATION_TOKEN || toReturn == DOCUMENTATION_SETTING_TOKEN) {
        documentationLine = true;
    }
    else if (toReturn == RETURN_SETTING_TOKEN) {
        returnLine = true;
    }
    else if (toReturn == ARGUMENTS_SETTING_TOKEN) {
        argumentsLine = true;
    }
    else if (toReturn == RESOURCE_SETTING_TOKEN || toReturn == VARIABLE_SETTING_TOKEN) {
        resourceSettingLine = true;
    }
    else if (toReturn == LIBRARY_SETTING_TOKEN) {
            librarySettingLine = true;
        }
    return toReturn;
  }

  private IElementType newLine() {
    lineBeginning = firstCell = true;
    return NEWLINE_TOKEN;
  }


%}


LineSeparator = \r|\n|\r\n
InputCharacter = [^\r\n]

KeywordArgumentChar = [^\r\n\t\# ] | \\#
TestCaseHeaderChar =  {KeywordArgumentChar}
VariableChar = [^\r\n\t\#\{\} ]

ColumnSep = {SingleSpace} {SingleSpace}+ | [ \t]* "\t" [ \t]* | [ \t]+ \| [ \t]+
SingleSpace = " "
WhiteSpace = [ \t]
NonWhiteSpace = [^ \t\r\n]

EndOfLine = {WhiteSpace}* {LineSeparator}
Ellipses = \.\.\.
EmptyCell = "\\"

/* integer literals */
DecIntegerLiteral = 0 | "-"? [1-9][0-9]*
FloatNumberLiteral= [0-9]+ \.? [0-9]* | [0-9]* \.? [0-9]+
NonNegativeIntegerLiteral = 0 | [1-9][0-9]*

Comment = "#" {InputCharacter}*


VariableWord = {VariableChar}+
VariableName = {VariableWord} ({SingleSpace} {VariableWord})*
Variable = "${" {SingleSpace}? {VariableName} {SingleSpace}? "}"
Assignment = {Variable} {SingleSpace}? "="
AssignmentNoSpace = {Variable} "="

ArrayVariable = "@{" {SingleSpace}? {VariableName} {SingleSpace}? "}"
ArrayVariableAccess = {ArrayVariable} \[ {SingleSpace}? ({NonNegativeIntegerLiteral} | {Variable}) {SingleSpace}? \]
ArrayAssignment = {ArrayVariable} {SingleSpace}? "="

RobotKeyword = {RobotWord} ({SingleSpace} {RobotWord})*
RobotWord = [a-zA-Z0-9\.\*\(\)\[\]\"\'\-_\$\{\}\\#&@%=\|\\]+

TestCaseHeaderWord = {TestCaseHeaderChar}+
TestCaseHeader = {TestCaseHeaderWord} ({SingleSpace} {TestCaseHeaderWord})*

KeywordArgumentWord = {KeywordArgumentChar}+
KeywordArgument = ({KeywordArgumentWord} ({SingleSpace} {KeywordArgumentWord})*) | {Variable} | {EmptyCell}

ScalarDefaultArgumentValue = {AssignmentNoSpace} {SingleSpace}? {KeywordArgument}

/* Common words */
Setup = setup
Teardown = teardown
Test = test
Suite = suite
Documentation = documentation
OptColon = ({SingleSpace}? ":")?

/* *** Settings *** */
TestSetupSetting = {Test} {SingleSpace}? {Setup} {OptColon}
TestTeardownSetting = {Test} {SingleSpace}? {Teardown}  {OptColon}
SuiteSetupSetting = {Suite} {SingleSpace}? {Setup} {OptColon}
SuiteTeardownSetting = {Suite} {SingleSpace}? {Teardown} {OptColon}
ForceTags = (force | default) tags {OptColon}
ResourceSetting = resource {OptColon}
VariableSetting = variables {OptColon}
LibrarySetting = library {OptColon}
TestTimeoutSetting = {Test} timeout {OptColon}
DocumentationSetting = {Documentation} {OptColon}
MetadataSetting = metadata {OptColon}
TestTemplateSetting = {Test} template {OptColon}

/* *** Test Cases *** */
BracketTags = "[" {WhiteSpace}* tags {WhiteSpace}* "]"
BracketDocumentation = "[" {WhiteSpace}* {Documentation} {WhiteSpace}* "]"
DocumentationArgument = {NonWhiteSpace} {InputCharacter}*

BracketSetup = ("[" {SingleSpace}? {Setup} {SingleSpace}? "]")
BracketTeardown = ("[" {SingleSpace}? {Teardown} {SingleSpace}? "]")
BracketTimeout = "[" {SingleSpace}? timeout {SingleSpace}? "]"
BracketTemplate = "[" {SingleSpace}? template {SingleSpace}? "]"

RobotDays = {FloatNumberLiteral} {SingleSpace}? ("days" | "day" | "d")
RobotHours =  {FloatNumberLiteral} {SingleSpace}? ("hours" | "hour" | "h")
RobotMinutes =  {FloatNumberLiteral} {SingleSpace}? ("minutes" | "minute" | "mins" | "min" | "m")
RobotSeconds =  {FloatNumberLiteral} {SingleSpace}? ("seconds" | "second" | "secs" | "sec" | "s")
RobotMillis = {FloatNumberLiteral} {SingleSpace}? ("milliseconds" | "millisecond" | "millis" | "ms")
RobotSecondsNumber = ("-" {SingleSpace}?)? {FloatNumberLiteral}

TimeoutValue = "none" |
               {RobotSecondsNumber} |
               ("-")? {SingleSpace}? {RobotDays} ({SingleSpace}? {RobotHours})? ({SingleSpace}? {RobotMinutes})? ({SingleSpace}? {RobotSeconds})? ({SingleSpace}? {RobotMillis})? |
               ("-")? {SingleSpace}? {RobotHours} ({SingleSpace}? {RobotMinutes})? ({SingleSpace}? {RobotSeconds})? ({SingleSpace}? {RobotMillis})? |
               ("-")? {SingleSpace}? {RobotMinutes} ({SingleSpace}? {RobotSeconds})? ({SingleSpace}? {RobotMillis})? |
               ("-")? {SingleSpace}? {RobotSeconds} ({SingleSpace}? {RobotMillis})? |
               ("-")? {SingleSpace}? {RobotMillis}

/* *** Keywords *** */
BracketArguments = "[" {SingleSpace}? arguments {SingleSpace}? "]"
BracketReturn = "[" {SingleSpace}? return {SingleSpace}? "]"

/* Tables headers */
AdditionalCharacters = {InputCharacter}*
SettingsTableHeader  = {SingleSpace}? "***" {SingleSpace}? ((setting s?)
                                 | (metadata)) {SingleSpace}? ("***") {AdditionalCharacters}
VariablesTableHeader = {SingleSpace}? "***" {SingleSpace}? (variable s?) {SingleSpace}? "***" {AdditionalCharacters}
TestCasesTableHeader = {SingleSpace}? "***" {SingleSpace}? test {SingleSpace}? case s? {SingleSpace}? "***" {AdditionalCharacters}
KeywordsTableHeader =  {SingleSpace}? "***" {SingleSpace}?  keyword s? {WhiteSpace}? "***" {AdditionalCharacters}

ForLoopStart = ":FOR"
InRange = "IN RANGE"
In = "IN"


%state SETTINGS
%state VARIABLES
%state TEST_CASES
%state KEYWORDS
%state DOCUMENTATION_SETTING
%state INVALID_SYNTAX
%%

<YYINITIAL> {
    {EndOfLine}                      { return newLine(); }
    {SettingsTableHeader}            { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
    {VariablesTableHeader}           { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
    {TestCasesTableHeader}           { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
    {KeywordsTableHeader}            { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
    {AdditionalCharacters}                           { return next(COMMENT_TOKEN); }
}

<SETTINGS> {
     {EndOfLine}                     { return newLine(); }
     {Comment}                       { return next(COMMENT_TOKEN); }
     {VariablesTableHeader}          { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           {  yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
     {SettingsTableHeader}           { yybegin(INVALID_SYNTAX); return next(INVALID_SYNTAX_TOKEN); }
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {Variable}                      { return next(VARIABLE_TOKEN); }
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {ArrayVariableAccess}           { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
     {TimeoutValue}                  { if (timeoutLine) { return next(TIMEOUT_VALUE_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {ForceTags}                     { if (lineBeginning) {return next(FORCE_TAGS_SETTING_KEYWORD_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {ResourceSetting}               { if (lineBeginning) {return next(RESOURCE_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {TestSetupSetting}              { if (lineBeginning) {return next(TEST_SETUP_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {TestTeardownSetting}           { if (lineBeginning) {return next(TEST_TEARDOWN_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {SuiteSetupSetting}             { if (lineBeginning) {return next(SUITE_SETUP_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {SuiteTeardownSetting}          { if (lineBeginning) {return next(SUITE_TEARDOWN_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {LibrarySetting}                { if (lineBeginning) {return next(LIBRARY_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {TestTimeoutSetting}            { if (lineBeginning) {return next(TEST_TIMEOUT_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {DocumentationSetting}          { if (lineBeginning) {previous_state = yystate(); yybegin(DOCUMENTATION_SETTING); return next(DOCUMENTATION_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {MetadataSetting}               { if (lineBeginning) {return next(METADATA_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {VariableSetting}               { if (lineBeginning) {return next(VARIABLE_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {TestTemplateSetting}           { if (lineBeginning) {return next(TEST_TEMPLATE_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {RobotKeyword}                  { if (lineBeginning) {return next(GENERIC_SETTING_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {KeywordArgument}               { return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {ColumnSep}                     { return next(COLUMN_SEPARATOR_TOKEN); }
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
}

<VARIABLES> {
     {EndOfLine}                     { return newLine(); }
     {Comment}                       { return next(COMMENT_TOKEN); }
     {VariablesTableHeader}          { return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
     {SettingsTableHeader}           { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {Assignment}                    { return next(ASSIGNMENT_TOKEN); }
     {ArrayAssignment}               { return next(ARRAY_ASSIGNMENT_TOKEN); }
     {Variable}                      { return next(VARIABLE_TOKEN); }
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {KeywordArgument}               { return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {ColumnSep}                     { return next(COLUMN_SEPARATOR_TOKEN); }
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
}


<TEST_CASES> {
     {EndOfLine}                     {  return newLine(); }
     {Comment}                       { return next(COMMENT_TOKEN); }
     {SettingsTableHeader}           { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {VariablesTableHeader}          { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { return next(TEST_CASES_TABLE_HEADER_TOKEN); }
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {BracketTags}                   { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(BRACKET_TAGS_TOKEN); }
     {BracketDocumentation}          { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } previous_state = yystate(); yybegin(DOCUMENTATION_SETTING); return next(BRACKET_DOCUMENTATION_TOKEN); }
     {BracketSetup}                  { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(BRACKET_SETUP_TOKEN); }
     {BracketTeardown}                  { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(BRACKET_TEARDOWN_TOKEN); }
     {BracketTimeout}                   { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(BRACKET_TIMEOUT_TOKEN); }
     {BracketTemplate}                  { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(TEMPLATE_SETTING_TOKEN); }
     {EmptyCell}                     { return next(EMPTY_CELL_TOKEN); }
     {ForLoopStart}                  { return next(FOR_LOOP_START_TOKEN); }
     {InRange}                       { return next(IN_RANGE_TOKEN); }
     {In}                            { return next(IN_TOKEN); }
     {Assignment}                    { return next(ASSIGNMENT_TOKEN); }
     {ArrayAssignment}               { return next(ARRAY_ASSIGNMENT_TOKEN); }
     {Variable}                      { return next(VARIABLE_TOKEN); }
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {ArrayVariableAccess}           { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
     {TimeoutValue}                  { if (timeoutLine) { return next(TIMEOUT_VALUE_TOKEN);} return next(ROBOT_KEYWORD_TOKEN); }
     {DecIntegerLiteral}             { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); }
                                       else if (firstCell) { return next(ROBOT_KEYWORD_TOKEN); }
                                       else if (forLoopLine) { return next(INTEGER_TOKEN); }
                                       else if (keywordToLeft) { return next(INTEGER_TOKEN); }
                                       return next(ROBOT_KEYWORD_TOKEN); }
     {RobotKeyword}                  { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {TestCaseHeader}                { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {KeywordArgument}               { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {ColumnSep}                     { return next(COLUMN_SEPARATOR_TOKEN); }
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
}

<DOCUMENTATION_SETTING> {
    {ColumnSep}                      { return next(COLUMN_SEPARATOR_TOKEN); }
    {DocumentationArgument}                   { return next(DOCUMENTATION_TOKEN); }
    {LineSeparator}                  { yybegin(previous_state); return newLine();}
}

<KEYWORDS> {
     {EndOfLine}                     { return newLine(); }
     {Comment}                       { return next(COMMENT_TOKEN); }
     {SettingsTableHeader}           { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {VariablesTableHeader}          { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           { yybegin(INVALID_SYNTAX); return next(INVALID_SYNTAX_TOKEN); }
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {BracketDocumentation}          { previous_state = yystate(); yybegin(DOCUMENTATION_SETTING); return next(BRACKET_DOCUMENTATION_TOKEN); }
     {BracketArguments}              { return next(ARGUMENTS_SETTING_TOKEN); }
     {BracketSetup}                  { return next(BRACKET_SETUP_TOKEN); }
     {BracketTeardown}               { return next(BRACKET_TEARDOWN_TOKEN); }
     {BracketTimeout}                { return next(BRACKET_TIMEOUT_TOKEN); }
     {BracketReturn}                 { return next(RETURN_SETTING_TOKEN); }
     {TimeoutValue}                  { if (lineBeginning) { return next(ROBOT_KEYWORD_NAME_TOKEN); }
                                       if (timeoutLine) { return next(TIMEOUT_VALUE_TOKEN); }
                                       return next(ROBOT_KEYWORD_TOKEN); }
     {EmptyCell}                     { return next(EMPTY_CELL_TOKEN); }
     {ForLoopStart}                  { return next(FOR_LOOP_START_TOKEN); }
     {InRange}                       { return next(IN_RANGE_TOKEN); }
     {In}                            { return next(IN_TOKEN); }
     {ScalarDefaultArgumentValue}    { if (argumentsLine) { return next(SCALAR_DEFAULT_ARG_VALUE_TOKEN); } return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {Assignment}                    { return next(ASSIGNMENT_TOKEN); }
     {ArrayAssignment}               { return next(ARRAY_ASSIGNMENT_TOKEN); }
     {Variable}                      { return next(VARIABLE_TOKEN); }
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {ArrayVariableAccess}           { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
     {DecIntegerLiteral}             { if (lineBeginning) { return next(ROBOT_KEYWORD_NAME_TOKEN); }
                                       else if (firstCell) { return next(ROBOT_KEYWORD_TOKEN); }
                                       else if (forLoopLine) { return next(INTEGER_TOKEN); }
                                       else if (keywordToLeft) { return next(INTEGER_TOKEN); }
                                       else { return next(ROBOT_KEYWORD_TOKEN); }}
     {RobotKeyword}                  { if (lineBeginning) { return next(ROBOT_KEYWORD_NAME_TOKEN); } return next(ROBOT_KEYWORD_TOKEN); }
     {KeywordArgument}               { if (lineBeginning) { return next(INVALID_SYNTAX_TOKEN); } return next(ROBOT_KEYWORD_ARGUMENT_TOKEN); }
     {ColumnSep}                     { return next(COLUMN_SEPARATOR_TOKEN); }
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
}

<INVALID_SYNTAX> {
    .+                               { return next(INVALID_SYNTAX_TOKEN);}
}

[^]                                  { return next(INVALID_SYNTAX_TOKEN);}