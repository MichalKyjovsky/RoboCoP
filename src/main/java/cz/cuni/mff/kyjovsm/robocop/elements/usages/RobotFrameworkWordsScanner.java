package cz.cuni.mff.kyjovsm.robocop.elements.usages;

import com.intellij.lang.cacheBuilder.WordOccurrence;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lexer.Lexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.Processor;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkWordsScanner implements WordsScanner {

  private Lexer myLexer;
  private TokenSet myIdentifierTokenSet;
  private TokenSet myCommentTokenSet;
  private TokenSet myLiteralTokenSet;

  /**
   * Creates a new instance of the words scanner.
   *
   * @param lexer              the lexer used for breaking the text into tokens.
   * @param identifierTokenSet the set of token types which represent identifiers.
   * @param commentTokenSet    the set of token types which represent comments.
   * @param literalTokenSet    the set of token types which represent literals.
   */
  public RobotFrameworkWordsScanner(final Lexer lexer, final TokenSet identifierTokenSet, final TokenSet commentTokenSet,
                           final TokenSet literalTokenSet) {
    this.myLexer = lexer;
    this.myIdentifierTokenSet = identifierTokenSet;
    this.myCommentTokenSet = commentTokenSet;
    this.myLiteralTokenSet = literalTokenSet;
  }

  @Override
  public void processWords(@NotNull CharSequence charSequence, @NotNull Processor<? super WordOccurrence> processor) {
    myLexer.start(charSequence);
    WordOccurrence occurrence = new WordOccurrence(charSequence, 0, 0, null); // shared occurrence

    IElementType type;
    while ((type = myLexer.getTokenType()) != null) {
      if (myIdentifierTokenSet.contains(type)) {
        if (!stripWordsSimple((Processor<WordOccurrence>) processor, charSequence, myLexer.getTokenStart(), myLexer.getTokenEnd(), WordOccurrence.Kind.CODE, occurrence))
          return;
      } else if (myCommentTokenSet.contains(type)) {
        if (!stripWordsSimple((Processor<WordOccurrence>) processor, charSequence, myLexer.getTokenStart(), myLexer.getTokenEnd(), WordOccurrence.Kind.COMMENTS, occurrence))
          return;
      } else if (myLiteralTokenSet.contains(type)) {
        if (!stripWordsSimple((Processor<WordOccurrence>) processor, charSequence, myLexer.getTokenStart(), myLexer.getTokenEnd(), WordOccurrence.Kind.LITERALS, occurrence))
          return;
      }
      myLexer.advance();
    }
  }

  protected static boolean stripWordsSimple(final Processor<WordOccurrence> processor,
                                            final CharSequence tokenText,
                                            int from,
                                            int to,
                                            final WordOccurrence.Kind kind,
                                            @NotNull WordOccurrence occurrence
  ) {
    // Simply grab everything in a token to use for the Word Index

    occurrence.init(tokenText, from, to, kind);

    return processor.process(occurrence);
  }

}
