package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class LibraryLanguage extends Language {

  public static final LibraryLanguage INSTANCE = new LibraryLanguage();

  @NonNls
  private static final String ID = "Python Library";

  protected LibraryLanguage() {
    super(ID);
    SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
      @Override
      protected @NotNull SyntaxHighlighter createHighlighter() {
        return new RobotFrameworkSyntaxHighlighter();
      }
    });
  }

  @Override
  public boolean isCaseSensitive() {
    return true;
  }
}
