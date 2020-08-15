package cz.cuni.mff.kyjovsm.robocop.elements;

import com.google.common.base.Optional;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RobotFrameworkVariableUtils {
  public static final Pattern VARIABLE_PATTERN = Pattern.compile("\\$\\{ ?([^\\{\\}]+) ?\\}");

  public static Optional<String> getVariableName(@NotNull PsiElement element) {
    String text = element.getText();
    return getVariableName(text);
  }

  public static Optional<String> getVariableName(@NotNull PsiElement element, TextRange rangeInElement) {
    if (rangeInElement == null) {
      return getVariableName(element);
    }
    String text = element.getText().substring(rangeInElement.getStartOffset(), rangeInElement.getEndOffset());
    return getVariableName(text);
  }

  public static Optional<String> getVariableName(String codeText) {
    Matcher matcher = VARIABLE_PATTERN.matcher(codeText);
    if (matcher.find()) {
      return Optional.of(matcher.group(1));
    }
    return Optional.absent();
  }
}
