package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.openapi.util.TextRange;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeyword;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkReferenceContributor extends PsiReferenceContributor {

  @Override
  public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
    registrar.registerReferenceProvider(PlatformPatterns.psiElement(RobotFrameworkReferencedFile.class),
            new PsiReferenceProvider() {
              @NotNull
              @Override
              public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                if (element instanceof RobotFrameworkReferencedFile) {
                  return new PsiReference[]{new RobotFrameworkReference((RobotFrameworkReferencedFile)element)};
                }
                return PsiReference.EMPTY_ARRAY;
              }
            },
            PsiReferenceRegistrar.HIGHER_PRIORITY);
  }
}
