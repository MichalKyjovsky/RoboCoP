package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiPolyVariantReferenceBase;
import com.intellij.psi.ResolveResult;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkKeywordReference extends PsiPolyVariantReferenceBase<PsiElement> {

  public RobotFrameworkKeywordReference(@NotNull PsiElement psiElement) {
    super(psiElement);
  }

  @Override
  public @NotNull ResolveResult[] multiResolve(boolean b) {
    return new ResolveResult[0];
  }
}
