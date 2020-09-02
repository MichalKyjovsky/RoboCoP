package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkParser;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class RobotFrameworkParserDefinition implements ParserDefinition {

  public static final TokenSet COMMENTS = TokenSet.create(RobotFrameworkTypes.COMMENT_TOKEN);

  public static final IFileElementType FILE = new IFileElementType(RobotFrameworkLanguage.INSTANCE);

  /**
   * @param project
   * @return
   */
  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new RobotFrameworkLexerAdapter();
  }

  /**
   * @param project
   * @return
   */
  @Override
  public PsiParser createParser(final Project project) {
    return new RobotFrameworkParser();
  }

  /**
   * @return
   */
  @Override
  public IFileElementType getFileNodeType() {
    return FILE;
  }

  /**
   * @return
   */
  @Override
  public @NotNull TokenSet getCommentTokens() {
    return COMMENTS;
  }

  /**
   * @return
   */
  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  /**
   * @param astNode
   * @return
   */
  @Override
  public @NotNull PsiElement createElement(ASTNode astNode) {
    return RobotFrameworkTypes.Factory.createElement(astNode);
  }

  /**
   * @param fileViewProvider
   * @return
   */
  @Override
  public PsiFile createFile(FileViewProvider fileViewProvider) {
    return new RobotFrameworkFile(fileViewProvider);
  }

  /**
   * @param left
   * @param right
   * @return
   */
  @Override
  public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
    return SpaceRequirements.MAY;
  }
}
