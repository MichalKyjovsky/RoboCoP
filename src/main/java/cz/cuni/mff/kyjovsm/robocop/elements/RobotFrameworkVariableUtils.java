package cz.cuni.mff.kyjovsm.robocop.elements;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkPsiFile;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkReference;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import org.jetbrains.annotations.NotNull;
import cz.cuni.mff.kyjovsm.robocop.elements.search.VariableInfo;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
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

//  public static Map<String, VariableInfo> getVariableEnvironment(@NotNull RobotFrameworkPsiFile file) {
//    return getVariableEnvironment(file, Maps.<String, VariableInfo>newHashMap(), Sets.<String>newHashSet());
//  }


//  private static Map<String, VariableInfo> getVariableEnvironment(@NotNull RobotFrameworkPsiFile file, Map<String, VariableInfo> env, Set<String> searchedFiles) {
//    final VirtualFile currentVirtualFile = file.getVirtualFile();
//    final String currentCanonicalPath = currentVirtualFile != null ? currentVirtualFile.getCanonicalPath() : null;
//    // To avoid infinite loops if the Robot file includes itself, or there's a loop in Resource file inclusions
//    if (currentCanonicalPath != null && searchedFiles.contains(currentCanonicalPath)) {
//      return env;
//    }
//    searchedFiles.add(currentCanonicalPath);
//    env = getVariableEnvironmentCurrentFile(file, env);
//
//    RobotFrameworkTable[] tables = file.findChildrenByClass(RobotFrameworkTable.class);
//    for (RobotFrameworkTable table: tables) {
//      if (table.getSettingsTable() == null) {
//        continue;
//      }
//      RobotFrameworkSettingsTable settingsTable = table.getSettingsTable();
//      Collection<RobotFrameworkResourceSetting> resourceSettings = PsiTreeUtil.findChildrenOfType(settingsTable, RobotFrameworkResourceSetting.class);
//      for (RobotFrameworkResourceSetting resourceSetting : resourceSettings) {
//        RobotFrameworkReferencedFile robotResourceFile = resourceSetting.getReferencedFile();
//        RobotFrameworkReference robotFileReference = new RobotFrameworkReference(robotResourceFile);
//        PsiElement resourceFile = robotFileReference.resolve(env);
//        if (resourceFile instanceof RobotFrameworkPsiFile) {
//          RobotFrameworkPsiFile robotPsiFile = (RobotFrameworkPsiFile) resourceFile;
//          Map<String, VariableInfo> resourceFileEnv = getVariableEnvironment(robotPsiFile, Maps.<String, VariableInfo>newHashMap(), searchedFiles);
//          env = combineMaps(env, resourceFileEnv);
//        }
//      }
//    }
//    return env;
//  }

  private static Map<String, VariableInfo> getVariableEnvironmentCurrentFile(@NotNull RobotFrameworkPsiFile file, Map<String, VariableInfo> env) {
    RobotFrameworkTable[] tables = file.findChildrenByClass(RobotFrameworkTable.class);
    for (RobotFrameworkTable table: tables) {
      if (table.getVariablesTable() == null) {
        continue;
      }
      RobotFrameworkVariablesTable RobotFrameworkVariablesTable = table.getVariablesTable();
      for (RobotFrameworkVariablesLine line: RobotFrameworkVariablesTable.getVariablesLineList()) {
        if (line.getScalarAssignmentLhs() == null) {
          continue;
        }
        RobotFrameworkScalarAssignmentLhs lhs = line.getScalarAssignmentLhs();
        Optional<String> varNameOpt = getVariableName(lhs);
        if (!varNameOpt.isPresent()) {
          continue;
        }

        String varName = varNameOpt.get();
        String normalVarName = RobotFrameworkPsiUtils.normalizeKeywordForIndex(varName);

        String varValue = line.getAssignableInVariablesTbl() == null ? "" : line.getAssignableInVariablesTbl().getKeywordArgument().getText();
        String actualValue = substitute(varValue, env);

        PsiElement varDefinition = lhs.getScalarAssignment() != null ? lhs.getScalarAssignment() : lhs.getScalarVariable();
        env.put(normalVarName, new VariableInfo(actualValue, varDefinition));
      }
    }
    return env;
  }

  public static String substitute(String rawStringValue, Map<String, VariableInfo> env) {
    String subValue = rawStringValue;
    Matcher matcher = VARIABLE_PATTERN.matcher(rawStringValue);
    while (matcher.find()) {
      String varName = matcher.group(1);
      String normalizedName = RobotFrameworkPsiUtils.normalizeKeywordForIndex(varName);
      VariableInfo envValue = env.get(normalizedName);
      if (envValue != null) {
        subValue = subValue.replace(matcher.group(0), envValue.getValue());
      } else {
        // Special case for Robot -- ${EMPTY} is the empty string.
        if (normalizedName.equals("empty")) {
          subValue = subValue.replace(matcher.group(0), "");
        }
      }
    }
    return subValue;
  }

  private static <T, V> Map<T, V> combineMaps(Map<T, V> primary, Map<T, V> secondary) {
    Map<T, V> combined = Maps.newHashMap(primary);
    for (T key: secondary.keySet()) {
      if (combined.get(key) == null) {
        combined.put(key, secondary.get(key));
      }
    }
    return combined;
  }

}
