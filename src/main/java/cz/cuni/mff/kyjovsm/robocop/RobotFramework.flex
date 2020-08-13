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

VariableWord = {VariableNameChar}+
VariableName = {VariableNameChar}+ ({Space} {VariableNameChar})*
Word = {VariableName}
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

ForLoopPrefix = ":FOR"
ForLoopInInfix = "IN"
ForLoopInRangeInifix = "IN RANGE"

TablesHeadingAsteriskTriplet = "***"

SettingsTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (setting | settings) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
TestCasesTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (test case | test cases) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
KeywordsTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (keyword | keywords) {Space}? {TablesHeadingAsteriskTriplet} {Comments}
VariablesTableHeader = {Space}? {TablesHeadingAsteriskTriplet} {Space}? (variable | variables) {Space}? {TablesHeadingAsteriskTriplet} {Comments}

/*Setting table*/


%%