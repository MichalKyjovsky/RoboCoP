package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkParser;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkParserDefinition implements ParserDefinition {

  public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
  public static final TokenSet COMMENTS = TokenSet.create(RobotFrameworkTypes.COMMENT_TOKEN);

  public static final IFileElementType FILE = new IFileElementType(RobotFrameworkLanguage.INSTANCE);

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new RobotFrameworkLexerAdapter();
  }

  @Override
  public PsiParser createParser(final Project project) {
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
    return TokenSet.EMPTY;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode astNode) {
    return RobotFrameworkTypes.Factory.createElement(astNode);
  }

  @Override
  public PsiFile createFile(FileViewProvider fileViewProvider) {
    return new RobotFrameworkFile(fileViewProvider);
  }

  @Override
  public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return SpaceRequirements.MAY;
  }
}
