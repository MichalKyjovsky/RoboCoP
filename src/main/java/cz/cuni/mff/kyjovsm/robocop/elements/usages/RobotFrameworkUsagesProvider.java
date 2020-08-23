package cz.cuni.mff.kyjovsm.robocop.elements.usages;

import com.intellij.find.impl.HelpID;
import com.intellij.lang.cacheBuilder.WordsScanner;
import com.intellij.lang.findUsages.FindUsagesProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLexerAdapter;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkPsiFile;
import cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkUsagesProvider implements FindUsagesProvider {


  public static final TokenSet IDENTIFIERS = TokenSet.create(RobotFrameworkTypes.ROBOT_KEYWORD_TOKEN, RobotFrameworkTypes.ROBOT_KEYWORD_NAME_TOKEN);

  public static final TokenSet COMMENTS = TokenSet.EMPTY;

  public static final TokenSet LITERALS = TokenSet.create(RobotFrameworkTypes.BRACKET_TAGS_TOKEN, RobotFrameworkTypes.FORCE_TAGS_SETTING_KEYWORD_TOKEN, RobotFrameworkTypes.ROBOT_KEYWORD_ARGUMENT_TOKEN);


  @Override
  public @Nullable WordsScanner getWordsScanner() {
    return new RobotFrameworkWordsScanner(new RobotFrameworkLexerAdapter(), IDENTIFIERS, COMMENTS, LITERALS);
  }

  @Override
  public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
    return psiElement instanceof RobotFrameworkPsiFile;
  }

  @Override
  public @Nullable String getHelpId(@NotNull PsiElement psiElement) {
    return HelpID.FIND_CLASS_USAGES;
  }

  @Override
  public @Nls @NotNull String getType(@NotNull PsiElement psiElement) {
    if (psiElement instanceof RobotFrameworkReferencedFile) {
      return "Robot Resource Setting";
    } else if (psiElement instanceof RobotFrameworkPsiFile) {
      return "Robot File";
    }
    return "";
  }

  @Override
  public @Nls @NotNull String getDescriptiveName(@NotNull PsiElement psiElement) {
    if (psiElement instanceof RobotFrameworkPsiFile) {
      return ((RobotFrameworkPsiFile) psiElement).getName();
    }
    return psiElement.getText();
  }

  @Override
  public @Nls @NotNull String getNodeText(@NotNull PsiElement psiElement, boolean b) {
    return psiElement.getText();
  }
}
