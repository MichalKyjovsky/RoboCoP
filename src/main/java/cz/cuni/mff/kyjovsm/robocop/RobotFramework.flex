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

KeywordArgumentsChar = [^\r\n\#] | \\# //Everything but LineSeparators and Comments
KeywordsTitleChar = {KeywordArgumentsChar}
TestCaseTitleChar = {KeywordArgumentsChar}
VariableNameChar = [^\#\{\}{WhiteSpace}]
Comments = "#" {RegularCharacter}*

Ellipses = \.\.\.
EmptyCell = "\\"


/*Numeric values */
IntegerLiteral = 0 | "-"? [1-9][0-9]*
FloatNumberLiteral= [0-9]+ \.? [0-9]* | [0-9]* \.? [0-9]+
PositiveIntegerLiteral = 0 | [1-9][0-9]*

VariableName = {VariableNameChar}+




%%