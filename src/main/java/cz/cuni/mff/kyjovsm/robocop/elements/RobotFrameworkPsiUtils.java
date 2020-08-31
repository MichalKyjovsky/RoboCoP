package cz.cuni.mff.kyjovsm.robocop.elements;

/**
 *
 */
public class RobotFrameworkPsiUtils {
  /**
   * @param keywordOrMethod
   * @return
   */
  public static String normalizeKeywordForIndex(String keywordOrMethod) {
    return keywordOrMethod.replace(" ", "")
            .replace("_", "")
            .toLowerCase();
  }
}
