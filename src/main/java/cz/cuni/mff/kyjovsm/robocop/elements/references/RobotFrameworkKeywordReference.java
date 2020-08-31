package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReferenceBase;
import com.intellij.psi.ResolveResult;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkKeywordReference extends PsiPolyVariantReferenceBase<PsiElement> {

  /**
   * @param psiElement
   */
  public RobotFrameworkKeywordReference(@NotNull PsiElement psiElement) {
    super(psiElement);
  }

  /**
   * @param b
   * @return
   */
  @Override
  public @NotNull ResolveResult[] multiResolve(boolean b) {
    return new ResolveResult[0];
  }
}
