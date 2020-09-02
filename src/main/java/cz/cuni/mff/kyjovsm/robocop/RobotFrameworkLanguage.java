package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import cz.cuni.mff.kyjovsm.robocop.highlighter.RobotFrameworkSyntaxHighlighter;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * The base class for Robot Framework language.
 */
public class RobotFrameworkLanguage extends Language {
    /**
     * Singleton instance of the Robot Framework language.
     */
    public static final RobotFrameworkLanguage INSTANCE = new RobotFrameworkLanguage();

    @NonNls
    private static final String ID = "RobotFramework";

    /**
     * A constructor method passing Robot Framework language ID to the parent
     * class and initializing SyntaxHighlighterFactory.
     */
    private RobotFrameworkLanguage() {
        super(ID);
        SyntaxHighlighterFactory.LANGUAGE_FACTORY.addExplicitExtension(this, new SingleLazyInstanceSyntaxHighlighterFactory() {
            @Override
            protected @NotNull SyntaxHighlighter createHighlighter() {
                return new RobotFrameworkSyntaxHighlighter();
            }
        });
    }

    /**
     * @return True if the language is case sensitive, else False.
     */
    @Override
    public boolean isCaseSensitive() {
        return true;
    }
}