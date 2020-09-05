package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLexerAdapter;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkPsiFile;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkStubFileType;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkParserDefinition implements ParserDefinition {

  public static final TokenSet COMMENTS = TokenSet.create(RobotFrameworkTypes.COMMENT_TOKEN);
  public static final TokenSet STRING_LITERALS = TokenSet.create(RobotFrameworkTypes.ROBOT_KEYWORD_ARGUMENT_TOKEN);

  public static final IFileElementType FILE = new RobotFrameworkStubFileType(Language.findInstance(RobotFrameworkLanguage.class));


  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new RobotFrameworkLexerAdapter();
  }

  @Override
  public PsiParser createParser(Project project) {
    return new RobotFrameworkParser();
  }

  @Override
  public IFileElementType getFileNodeType() {
    return FILE;
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return COMMENTS;
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return STRING_LITERALS;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode astNode) {
    return RobotFrameworkTypes.Factory.createElement(astNode);
  }

  @Override
  public PsiFile createFile(FileViewProvider fileViewProvider) {
    return new RobotFrameworkPsiFile(fileViewProvider);
  }
}
