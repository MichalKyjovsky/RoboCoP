package cz.cuni.mff.kyjovsm.robocop.elements;

public class RobotFrameworkPsiUtils {
  public static String normalizeKeywordForIndex(String keywordOrMethod) {
    return keywordOrMethod.replace(" ", "")
            .replace("_", "")
            .toLowerCase();
  }

  public static String robotKeywordToUnderscoreStyleMethod(String keyword) {
    String withUnderscores = keyword.replace(" ", "_");
    return withUnderscores.toLowerCase();
  }

}
