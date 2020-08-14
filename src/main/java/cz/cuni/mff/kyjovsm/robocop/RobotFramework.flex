package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.SimpleTypes;
import com.intellij.psi.TokenType;

@SuppressWarnings({ "ALL" })

%%

%class RobotFrameworkLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

%line
%column
%char
%caseless

%{
    private IElementType newLine() {
      startLine = firstRobotCell = true;
      return NEW_LINE_TOKEN;
    }

    private IElementType next() {
      if (toReturn != WHITE_SPACE_TOKEN) {
          startLine = false;
      }
    }
%}

/* General tokens coverage*/
LineSeparators= \r|\n|\r\n
RegularCharacter = [^\r\n] //Everything but LineSeparators
WhiteSpace=[\ \n\r\t\f]
EndOfLine = [ \t]* {LineSeparators}
Space = " "
ColumnSeparator = {Space} {Space}+ | [ \t]* "\t" [ \t]* | [ \t]+

KeywordArgumentChar = [^\r\n\#] | \\# //Everything but LineSeparators and Comments
KeywordsTitleChar = {KeywordArgumentChar}
TestCaseTitleChar = {KeywordArgumentChar}
VariableNameChar = [^\#\{\}{WhiteSpace}]
Comments = "#" {RegularCharacter}*

Ellipses = \.\.\.
EmptyCell = "\\"

/*Numeric values */
IntegerLiteral = 0 | "-"? [1-9][0-9]*
FloatNumberLiteral= [0-9]+ \.? [0-9]* | [0-9]* \.? [0-9]+
PositiveIntegerLiteral = 0 | [1-9][0-9]*

/*Robot time units*/
TimeUnitsDay = {FloatNumberLiteral} {Space}? ("days"|"day"|"d")
TimeUnitsHour = {FloatNumberLiteral} {Space}? ("hours"|"hour"|"h")
TimeUnitsMinutes = {FloatNumberLiteral} {Space}? ("minutes"|"minute"|"m")
TimeUnitsSecond = {FloatNumberLiteral} {Space}? ("seconds"|"second"|"s")
TimeUnitsMillisecond = {FloatNumberLiteral} {Space}? ("milliseconds"|"millisecond"|"millis"|"ms")


TimeoutValue = "none" | ("-" {Space}?)? {FloatNumberLiteral} |
               ("-")? {TimeUnitsMillisecond} |
               ("-")? {TimeUnitsSecond} ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {TimeUnitsMinutes} ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {TimeUnitsHour} ({Space}? {TimeUnitsMinutes})? ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {TimeUnitsDay} ({Space}? {TimeUnitsHour})? ({Space}? {TimeUnitsMinutes})? ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})?



VariableWord = {VariableNameChar}+
VariableName = {VariableNameChar}+ ({Space} {VariableNameChar})*
Word = {VariableName}
RegularWord = {RegularCharacter}*
SimpleVariable = "${" {Space}? {VariableName} {Space}? "}"
VariableAssignment = {SimpleVariable} {Space}? "="

ArrayVariable = "@{" {Space}? {VariableName} "}"
ArrayVariableAccess = {ArrayVariable} \[ {Space}? ({PositiveIntegerLiteral} | {SimpleVariable} | \'{Word}\' ) {Space}?\]
ArrayAssignment = {ArrayVariable} {Space}? "="

RobotWord = [a-zA-Z0-9\.\*\(\)\[\]\"\'\-_\$\{\}\\#&@%=\|\\]+
RobotKeyword = {RobotWord} ({Space} {RobotWord})*

TestCaseTitleWord = {TestCaseTitleChar}+
TestCaseTitle = {TestCaseTitleWord} ({Space}? {TestCaseTitleWord})*

KeywordArgumentWord = {KeywordArgumentChar}+
KeywordArgument = {KeywordArgumentWord} ({Space} {KeywordArgumentWord})* | {SimpleVariable} | {ArrayVariable} | {EmptyCell}

ScalarDefaultArgumentValue = {VariableAssignment} {KeywordArgument}


ForLoopInInfix = "IN"
ForLoopPrefix = ":FOR"
ForLoopInRangeInifix = "IN RANGE"

TablesHeadingAsteriskTriplet = "***"

SettingsTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (setting | settings) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
TestCasesTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (test case | test cases) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
KeywordsTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (keyword | keywords) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
VariablesTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (variable | variables) {Space}? {TablesHeadingAsteriskTriplet} {Comments}

/*Common words*/
TagsWord = tags
TestWord = test
TearDown = word
SuiteWord = suite
SetupWord = setup
ForceWord = force
ReturnWord = return
TimeoutWord = timeout
LibraryWord = library
DefaultWord = default
MetadataWord = metadata
ResourceWord = resource
TemplateWord = template
VariablesWord = variables
ArgumentsWord = arguments
PreconditionWord = precondition
DocumentationWord = documentation


/*Settings table*/
TestSetupSetting = {TestWord} {Space} {SetupWord}
TestTearDownSetting = {TestWord} {Space} {TearDown}
SuiteSetupSetting = {SuiteWord} {Space} {SetupWord}
SuiteTeardownSetting = {SuiteWord} {Space} {TearDown}
ForceTags = ({ForceWord} | {DefaultWord}) {Space} {TagsWord}
ResourceSetting = {ResourceWord}
VariableSetting = {VariablesWord}
LibrarySetting = {LibraryWord}
TestTimeoutSetting = {TestWord} {Space} {TimeoutWord}
MetadataSetting = {MetadataWord}
DocumentationSetting = {DocumentationWord}
TestTemplateSetting = {TestWord} {Space} {TemplateWord}

/*Test Cases table*/
SetupSettingBracket = "[" {Space}? {SetupWord} {Space}? "]"
TearDownSettingBracket = "[" {Space}? {TearDown} {Space}? "]"
TagsBracket = "[" {Space}? {TagsWord} {Space}? "]"
TimeoutBracket = "[" {Space}? {TimeoutWord} {Space}? "]"
TemplateBracket = "[" {Space}? {TemplateWord} {Space}? "]"
DocumentationBracket = "[" {Space}? {DocumentationWord} {Space}? "]"
ArgumentsBracket = "[" {Space}? {ArgumentsWord} {Space}? "]"
ReturnBracket = "[" {Space}? {ReturnWord} {Space}? "]"

%state SETTINGS
%state KEYWORDS
%state VARIABLES
%state BAD_SYNTAX
%state TEST_CASES
%state DOCS_SETTING

%%

<YYINITIAL> {
    {EndOfLine}             { return newLine(); }
    {RegularWord}           { return next(COMMENT_TOKEN); }
    {SettingsTableHeader}   { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
    {VariablesTableHeader}  { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
    {TestCasesTableHeader}  { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
    {KeywordsTableHeader}   { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
}

<SETTINGS> {
    {EndOfLine}             { return newLine(); }
    {Comments}              { return next(COMMENT_TOKEN); }
    {SimpleVariable}        { return next(VARIABLE_TOKEN);}
    {Ellipses}              { return next(ELLIPSES_TOKEN); }
    {WhiteSpace}            { return next(WHITESPACE_TOKEN); }
    {ArrayVariable}         { return next(ARRAY_VARIABLE_TOKEN); }
    {ColumnSeparator}       { return next(COLUMN_SEPARATOR_TOKEN); }
    {KeywordArgument}       { return next(RF_KEYWORD_ARGUMENT_TOKEN); }
    {ArrayVariableAccess}   { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
    {SettingsTableHeader}   { yybegin(SETTINGS); return next(INVALID_SYNTAX_TOKEN); }
    {KeywordsTableHeader}   { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
    {VariablesTableHeader}  { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
    {TestCasesTableHeader}  { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
    {DocumentationSetting}  { if (startLine) { return next(DOCUMENTATION_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {LibrarySetting}        { if (startLine) { return next(LIBRARY_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {RobotKeyword}          { if (startLine) { return next(GENERIC_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {MetadataSetting}       { if (startLine) { return next(METADATA_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {ResourceSetting}       { if (startLine) { return next(RESOURCE_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {VariableSetting}       { if (startLine) { return next(VARIABLES_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TimeoutValue}          { if (onTimeOutLine ) { return next(TIMEOUT_UNITS_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestSetupSetting}      { if (startLine) { return next(TEST_SETUP_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {ForceTags}             { if (startLine) { return next(FORCE_TAGS_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {SuiteSetupSetting}     { if (startLine) { return next(SUITE_SETUP_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTimeoutSetting}    { if (startLine) { return next(TEST_TIMEOUT_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTearDownSetting}   { if (startLine) { return next(TEST_TEARDOWN_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {SuiteTeardownSetting}  { if (startLine) { return next(SUITE_TEARDOWN_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTemplateSetting}   { if (startLine) { return next(TEST_TEMPLATE_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
}

<KEYWORDS> {
       {EndOfLine}                   { return newLine(); }
       {Comments}                    { return next(COMMENT_TOKEN); }
       {SettingsTableHeader}         { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
       {VariablesTableHeader}        { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
       {TestCasesTableHeader}        { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
       {KeywordsTableHeader}         { yybegin(KEYWORDS); return next(INVALID_SYNTAX_TOKEN); }
       {Ellipses}                    { return next(ELLIPSES_TOKEN); }
       {ArgumentsBracket}            { return next(BRACKET_ARGUMENTS_TOKEN); }
       {ReturnBracket}               { return next(BRACKET_RETURN_TOKEN); }
       {SetupSettingBracket}         { return next(BRACKET_SETUP_TOKEN); }
       {TagsBracket}                 { return next(BRACKET_TAGS_TOKEN); }
       {TearDownSettingBracket}      { return next(BRACKET_TEARDOWN_TOKEN); }
       {TemplateBracket}             { return next(BRACKET_TEMPLATE_TOKEN); }
       {TimeoutBracket}              { return next(BRACKET_TIMEOUT_TOKEN); }
       {DocumentationBracket}        { previous_state = yystate(); yybegin(DOCS_SETTING); return next(BRACKET_DOCUMENTATION_TOKEN); }
       {EmptyCell}                   { return next(EMPTY_CELL_TOKEN); }
       {ForLoopPrefix}               { return next(FOR_KEYWORD_TOKEN); }
       {ForLoopInRangeInifix}        { return next(IN_RANGE_TOKEN); }
       {ForLoopInInfix}              { return next(IN_TOKEN); }
       {SimpleVariable}              { return next(VARIABLE_TOKEN);}
       {ArrayVariable}               { return next(ARRAY_VARIABLE_TOKEN); }
       {TimeoutValue}                {if (startLine) { return next(RF_KEYWORD_NAME_TOKEN); }
                                      if (onTimeoutLine) { return next(TIMEOUT_UNITS_TOKEN); }
                                      return next(RF_KEYWORD_TOKEN);}
       {ScalarDefaultArgumentValue}  { if (onArgumentsLine) { return next(SCALAR_DEFAULT_ARG_VALUE_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
       {VariableAssignment}          { return next(ASSIGNMENT_TOKEN);}
       {ArrayAssignment}             { return next(ARRAY_ASSIGNMENT_TOKEN); }
       {ColumnSeparator}             { return next(COLUMN_SEPARATOR_TOKEN); }
       {WhiteSpace}                  { return next(WHITESPACE_TOKEN); }
       {KeywordArgument}             { if (startLine) { return next(INVALID_SYNTAX_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
       {RobotKeyword}                { if (startLine) { return next(RF_KEYWORD_NAME_TOKEN); } return next(RF_KEYWORD_TOKEN); }
       {ArrayVariableAccess}         { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
       {IntegerLiteral}              { if (startLine) { return next(RF_KEYWORD_NAME_TOKEN); }
                                       else if (firstRobotCell) { return next(RF_KEYWORD_TOKEN); }
                                       else if (onForLoopLine) { return next(INTEGER_TOKEN); }
                                       else if (keywordToLeft) { return next(INTEGER_TOKEN); }
                                       else { return next(RF_KEYWORD_TOKEN); }}

}

<VARIABLES> {
     {EndOfLine}             { return newLine(); }
     {Comments}              { return next(COMMENT_TOKEN); }
     {SimpleVariable}        { return next(VARIABLE_TOKEN);}
     {Ellipses}              { return next(ELLIPSES_TOKEN); }
     {VariableAssignment}    { return next(ASSIGNMENT_TOKEN);}
     {WhiteSpace}            { return next(WHITESPACE_TOKEN); }
     {ArrayVariable}         { return next(ARRAY_VARIABLE_TOKEN); }
     {ArrayAssignment}       { return next(ARRAY_ASSIGNMENT_TOKEN); }
     {ColumnSeparator}       { return next(COLUMN_SEPARATOR_TOKEN); }
     {KeywordArgument}       { return next(RF_KEYWORD_ARGUMENT_TOKEN); }
     {VariablesTableHeader}  { return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {SettingsTableHeader}   { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}   { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}  { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
}

