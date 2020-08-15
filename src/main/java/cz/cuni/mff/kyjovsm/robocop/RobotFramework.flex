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
    private int initial_state = YYINITIAL;
    int yyline;
    int yycolumn;
    int yychar;
    private boolean firstCell = false;
    private boolean lineBeginning = false;
    private boolean documentationSettingLine = false;
    private boolean tagsSettingLine = false;
    private boolean librarySettingLine = false;
    private boolean resourceSettingLine = false;
    private boolean timeoutSettingLine = false;
    private boolean returnBracketLine = false;
    private boolean argumentsBracketLine = false;
    private boolean forLoopLine = false;
    private boolean keywordLine = false;


    private IElementType newLine() {
      lineBeginning = true;
      firstCell = true;
      return NEW_LINE_TOKEN;
    }

    private IElementType next(IElementType tokenToReturn) {
      if (tokenToReturn != WHITESPACE_TOKEN) {
          lineBeginning = false;
      }

      if (firstCell && tokenToReturn != WHITESPACE_TOKEN && tokenToReturn != COLUMN_SEPARATOR_TOKEN && tokenToReturn != EMPTY_CELL_TOKEN) {
        if (tokenToReturn == ELLIPSES_TOKEN && documentationSettingLine) {
          yybegin(DOCUMENTAION_SETTING_TABLE);
        } else if (tokenToReturn != ELLIPSES_TOKEN) {
            keywordLine = false;
            tagsSettingLine = false;
            timeoutSettingLine = false;
            documentationSettingLine = false;
            returnBracketLine = false;
            argumentsBracketLine = false;
            forLoopLine = false;
            resourceSettingLine = false;
            librarySettingLine = false;
        }
        firstCell = false;
      }

      if (tokenToReturn == INVALID_SYNTAX_TOKEN) {
        System.out.println(String.format("Invalid syntax \"$s\" at line: $d, column: $d", yytext(), yyline, yycolumn));
      } else if (tokenToReturn == RF_KEYWORD_TOKEN) {
        if (keywordLine || returnBracketLine || forLoopLine) {
             return RF_KEYWORD_ARGUMENT_TOKEN;
        } else if (tagsSettingLine) {
             return TAG_TOKEN;
        } else if (documentationSettingLine) {
             return DOCUMENTATION_TOKEN;
        } else if (resourceSettingLine) {
             return RF_FILE_TOKEN;
        } else if (librarySettingLine) {
             librarySettingLine = false;
             return LIBRARY_TOKEN;
        } else {
             keywordLine = true;
             return RF_KEYWORD_TOKEN;
        }
    } else if (tokenToReturn == RF_KEYWORD_ARGUMENT_TOKEN) {
        if (keywordLine) {
             return RF_KEYWORD_ARGUMENT_TOKEN;
        } else if (tagsSettingLine) {
             return TAG_TOKEN;
        } else if (documentationSettingLine) {
             return DOCUMENTATION_TOKEN;
        } else if (resourceSettingLine) {
             return RF_FILE_TOKEN;
        } else if (librarySettingLine) {
             librarySettingLine = false;
             return LIBRARY_TOKEN;
        } else {
             return RF_KEYWORD_ARGUMENT_TOKEN;
        }
    } else if (tokenToReturn == BRACKET_TAGS_TOKEN || tokenToReturn == FORCE_TAGS_SETTING_TOKEN) {
        tagsSettingLine = true;
    } else if (tokenToReturn == FOR_KEYWORD_TOKEN) {
        forLoopLine = true;
        return FOR_KEYWORD_TOKEN;
    } else if (tokenToReturn == TEST_TIMEOUT_SETTING_TOKEN || tokenToReturn == BRACKET_TIMEOUT_TOKEN) {
        timeoutSettingLine = true;
    } else if (tokenToReturn == BRACKET_RETURN_TOKEN) {
        returnBracketLine = true;
    } else if (tokenToReturn == DOCUMENTATION_SETTING_TOKEN || tokenToReturn == BRACKET_DOCUMENTATION_TOKEN) {
        documentationSettingLine = true;
    } else if (tokenToReturn == BRACKET_ARGUMENTS_TOKEN) {
        argumentsBracketLine = true;
    } else if (tokenToReturn == RESOURCE_SETTING_TOKEN || tokenToReturn == VARIABLES_SETTING_TOKEN) {
        /*Resource and Variables act same, both reference the .robot file*/
        resourceSettingLine = true;
    } else if (tokenToReturn == LIBRARY_SETTING_TOKEN) {
        librarySettingLine = true;
    }

    return tokenToReturn;
    }
%}

/* General tokens coverage*/
LineSeparators= \r|\n|\r\n
RegularCharacter = [^\r\n] //Everything but LineSeparators
WhiteSpace=[\ \n\r\t]
WhiteSpaceSupplement = [^ \n\r\t]
EndOfLine = {WhiteSpace}* {LineSeparators}
Space = " "
ColumnSeparator = {Space} {Space}+ | [ \t]* "\t" [ \t]* | [ \t]+

KeywordArgumentChar = [^\r\n\#] | \\# //Everything but LineSeparators and Comments
TestCaseTitleChar = {KeywordArgumentChar}
VariableNameChar = [^\#\{\}\ \n\r\t]
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
               ("-")? {Space}? {TimeUnitsMillisecond} |
               ("-")? {Space}? {TimeUnitsSecond} ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {Space}? {TimeUnitsMinutes} ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {Space}? {TimeUnitsHour} ({Space}? {TimeUnitsMinutes})? ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})? |
               ("-")? {Space}? {TimeUnitsDay} ({Space}? {TimeUnitsHour})? ({Space}? {TimeUnitsMinutes})? ({Space}? {TimeUnitsSecond})? ({Space}? {TimeUnitsMillisecond})?



VariableName = {VariableNameChar}+ ({Space} {VariableNameChar})*
RegularWord = {RegularCharacter}*
SimpleVariable = "${" {Space}? {VariableName} {Space}? "}"
VariableAssignment = {SimpleVariable} {Space}? "="

ArrayVariable = "@{" {Space}? {VariableName} "}"
ArrayVariableAccess = {ArrayVariable} "[" {Space}? ({PositiveIntegerLiteral} | {SimpleVariable} ) {Space}? "]"
ArrayAssignment = {ArrayVariable} {Space}? "="

RobotWord = [a-zA-Z0-9\.\*\(\)\[\]\"\'\-_\$\{\}\\#&@%=\|\\]+
RobotKeyword = {RobotWord} ({Space} {RobotWord})*

TestCaseTitleWord = {TestCaseTitleChar}+
TestCaseTitle = {TestCaseTitleWord} ({Space} {TestCaseTitleWord})*

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
LibraryWord = l {Space}? i {Space}? b {Space}? r {Space}? a {Space}? r {Space}? y
DefaultWord = default
MetadataWord = metadata
ResourceWord = resource
TemplateWord = template
VariablesWord = variables
ArgumentsWord = arguments
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
DocumentationArguments = {WhiteSpaceSupplement} {RegularWord}
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
%state DOCUMENTAION_SETTING_TABLE
%state VARIABLES
%state TEST_CASES
%state KEYWORDS
%state INVALID_SYNTAX

%%

<YYINITIAL> {
    {EndOfLine}                      { return newLine(); }
    {RegularWord}                    { return next(COMMENT_TOKEN); }
    {SettingsTableHeader}            { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
    {VariablesTableHeader}           { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
    {TestCasesTableHeader}           { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
    {KeywordsTableHeader}            { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
}

<SETTINGS> {
    {EndOfLine}                      { return newLine(); }
    {Comments}                       { return next(COMMENT_TOKEN); }
    {SimpleVariable}                 { return next(VARIABLE_TOKEN);}
    {Ellipses}                       { return next(ELLIPSES_TOKEN); }
    {WhiteSpace}                     { return next(WHITESPACE_TOKEN); }
    {ArrayVariable}                  { return next(ARRAY_VARIABLE_TOKEN); }
    {ColumnSeparator}                { return next(COLUMN_SEPARATOR_TOKEN); }
    {KeywordArgument}                { return next(RF_KEYWORD_ARGUMENT_TOKEN); }
    {ArrayVariableAccess}            { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
    {SettingsTableHeader}            { yybegin(SETTINGS); return next(INVALID_SYNTAX_TOKEN); }
    {KeywordsTableHeader}            { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
    {VariablesTableHeader}           { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
    {TestCasesTableHeader}           { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
    {TimeoutValue}                   { if (onTimeOutLine ) { return next(TIMEOUT_UNITS_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {LibrarySetting}                 { if (lineBeginning) { return next(LIBRARY_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {RobotKeyword}                   { if (lineBeginning) { return next(GENERIC_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {MetadataSetting}                { if (lineBeginning) { return next(METADATA_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {ResourceSetting}                { if (lineBeginning) { return next(RESOURCE_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {VariableSetting}                { if (lineBeginning) { return next(VARIABLES_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestSetupSetting}               { if (lineBeginning) { return next(TEST_SETUP_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {ForceTags}                      { if (lineBeginning) { return next(FORCE_TAGS_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {SuiteSetupSetting}              { if (lineBeginning) { return next(SUITE_SETUP_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTimeoutSetting}             { if (lineBeginning) { return next(TEST_TIMEOUT_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {DocumentationSetting}           { if (lineBeginning) { return next(DOCUMENTATION_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTearDownSetting}            { if (lineBeginning) { return next(TEST_TEARDOWN_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {TestTemplateSetting}            { if (lineBeginning) { return next(TEST_TEMPLATE_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
    {SuiteTeardownSetting}           { if (lineBeginning) { return next(SUITE_TEARDOWN_SETTING_TOKEN); } return next(RF_KEYWORD_TOKEN); }
}


<DOCUMENTAION_SETTING_TABLE> {
    {DocumentationArguments}         { return next(DOCUMENTATION_TOKEN);}
    {ColumnSeparator}                { return next(COLUMN_SEPARATOR_TOKEN); }
    {LineSeparators}                 { yybegin(initial_state); return newLine(); }
}

<VARIABLES> {
     {EndOfLine}                     { return newLine(); }
     {Comments}                      { return next(COMMENT_TOKEN); }
     {SimpleVariable}                { return next(VARIABLE_TOKEN);}
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {VariableAssignment}            { return next(ASSIGNMENT_TOKEN);}
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {ArrayAssignment}               { return next(ARRAY_ASSIGNMENT_TOKEN); }
     {ColumnSeparator}               { return next(COLUMN_SEPARATOR_TOKEN); }
     {KeywordArgument}               { return next(RF_KEYWORD_ARGUMENT_TOKEN); }
     {VariablesTableHeader}          { return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {SettingsTableHeader}           { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { yybegin(TEST_CASES); return next(TEST_CASES_TABLE_HEADER_TOKEN); }
}

<TEST_CASES> {
     {TestCaseTitle}                 { if (lineBeginning) { return next(TEST_CASE_NAME_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
     {EndOfLine}                     { return newLine(); }
     {Comments}                      { return next(COMMENT_TOKEN); }
     {SettingsTableHeader}           { yybegin(SETTINGS); return next(SETTINGS_TABLE_HEADER_TOKEN); }
     {VariablesTableHeader}          { yybegin(VARIABLES); return next(VARIABLES_TABLE_HEADER_TOKEN); }
     {TestCasesTableHeader}          { return next(TEST_CASES_TABLE_HEADER_TOKEN); }
     {KeywordsTableHeader}           { yybegin(KEYWORDS); return next(KEYWORDS_TABLE_HEADER_TOKEN); }
     {Ellipses}                      { return next(ELLIPSES_TOKEN); }
     {SetupSettingBracket}           { return next(BRACKET_SETUP_TOKEN); }
     {TagsBracket}                   { return next(BRACKET_TAGS_TOKEN); }
     {TearDownSettingBracket}        { return next(BRACKET_TEARDOWN_TOKEN); }
     {TemplateBracket}               { return next(BRACKET_TEMPLATE_TOKEN); }
     {TimeoutBracket}                { return next(BRACKET_TIMEOUT_TOKEN); }
     {DocumentationBracket}          { initial_state = yystate(); yybegin(DOCUMENTATION_SETTING); return next(BRACKET_DOCUMENTATION_TOKEN); }
     {EmptyCell}                     { return next(EMPTY_CELL_TOKEN); }
     {ForLoopPrefix}                 { return next(FOR_KEYWORD_TOKEN); }
     {ForLoopInRangeInifix}          { return next(IN_RANGE_TOKEN); }
     {ForLoopInInfix}                { return next(IN_TOKEN); }
     {SimpleVariable}                { return next(VARIABLE_TOKEN);}
     {ArrayVariable}                 { return next(ARRAY_VARIABLE_TOKEN); }
     {TimeoutValue}                  { if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); } }
     {IntegerLiteral}                { if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); }
                                      else if (firstCell) { return next(RF_KEYWORD_TOKEN); }
                                      else if (forLoopLine) { return next(INTEGER_TOKEN); }
                                      else if (keywordLine) { return next(INTEGER_TOKEN); }
                                      else { return next(RF_KEYWORD_TOKEN); }}
     {ColumnSeparator}               { return next(COLUMN_SEPARATOR_TOKEN); }
     {WhiteSpace}                    { return next(WHITESPACE_TOKEN); }
     {KeywordArgument}               { if (lineBeginning) { return next(INVALID_SYNTAX_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
     {RobotKeyword}                  { if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); } return next(RF_KEYWORD_TOKEN); }
     {ArrayVariableAccess}           { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
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
       {DocumentationBracket}        { initial_state = yystate(); yybegin(DOCUMENTAION_SETTING_TABLE); return next(BRACKET_DOCUMENTATION_TOKEN); }
       {EmptyCell}                   { return next(EMPTY_CELL_TOKEN); }
       {ForLoopPrefix}               { return next(FOR_KEYWORD_TOKEN); }
       {ForLoopInRangeInifix}        { return next(IN_RANGE_TOKEN); }
       {ForLoopInInfix}              { return next(IN_TOKEN); }
       {SimpleVariable}              { return next(VARIABLE_TOKEN);}
       {ArrayVariable}               { return next(ARRAY_VARIABLE_TOKEN); }
       {TimeoutValue}                {if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); }
                                      if (timeoutSettingLine) { return next(TIMEOUT_UNITS_TOKEN); }
                                      return next(RF_KEYWORD_TOKEN);}
       {ScalarDefaultArgumentValue}  { if (argumentsBracketLine) { return next(SCALAR_DEFAULT_ARG_VALUE_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
       {VariableAssignment}          { return next(ASSIGNMENT_TOKEN);}
       {ArrayAssignment}             { return next(ARRAY_ASSIGNMENT_TOKEN); }
       {ColumnSeparator}             { return next(COLUMN_SEPARATOR_TOKEN); }
       {WhiteSpace}                  { return next(WHITESPACE_TOKEN); }
       {KeywordArgument}             { if (lineBeginning) { return next(INVALID_SYNTAX_TOKEN); } return next(RF_KEYWORD_ARGUMENT_TOKEN); }
       {RobotKeyword}                { if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); } return next(RF_KEYWORD_TOKEN); }
       {ArrayVariableAccess}         { return next(ARRAY_VARIABLE_ACCESS_TOKEN); }
       {IntegerLiteral}              { if (lineBeginning) { return next(RF_KEYWORD_NAME_TOKEN); }
                                       else if (firstCell) { return next(RF_KEYWORD_TOKEN); }
                                       else if (forLoopLine) { return next(INTEGER_TOKEN); }
                                       else if (keywordLine) { return next(INTEGER_TOKEN); }
                                       else { return next(RF_KEYWORD_TOKEN); }}
}


<INVALID_SYNTAX> {
     .+                              { return next(INVALID_SYNTAX_TOKEN); }
}

/* error fallback */

[^]                                  { return next(INVALID_SYNTAX_TOKEN); }

