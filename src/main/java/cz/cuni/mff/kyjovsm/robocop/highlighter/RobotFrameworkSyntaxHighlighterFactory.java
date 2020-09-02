package cz.cuni.mff.kyjovsm.robocop.highlighter;

import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Purpose of this class is to provide a standard way for the IntelliJ Platform
 * to instantiate the syntax highlighter for Robot Framework Language.
 */
public class RobotFrameworkSyntaxHighlighterFactory extends SyntaxHighlighterFactory {
  /**
   * @param project Currently opened project instance.
   * @param virtualFile VirtualFile instance to be higlighted.
   * @return instance of RobotFrameworkSyntaxHighlighter.
   */
  @Override
  public @NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
    return new RobotFrameworkSyntaxHighlighter();
  }
}
