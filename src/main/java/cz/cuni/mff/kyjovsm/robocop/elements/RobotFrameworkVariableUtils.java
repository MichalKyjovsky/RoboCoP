package cz.cuni.mff.kyjovsm.robocop.elements;

import com.google.common.base.Optional;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class RobotFrameworkVariableUtils {
  public static final Pattern VARIABLE_PATTERN = Pattern.compile("\\$\\{ ?([^\\{\\}]+) ?\\}");

  /**
   * @param element
   * @return
   */
  public static Optional<String> getVariableName(@NotNull PsiElement element) {
    String text = element.getText();
    return getVariableName(text);
  }

  /**
   * @param codeText
   * @return
   */
  public static Optional<String> getVariableName(String codeText) {
    Matcher matcher = VARIABLE_PATTERN.matcher(codeText);
    if (matcher.find()) {
      return Optional.of(matcher.group(1));
    }
    return Optional.absent();
  }
}
