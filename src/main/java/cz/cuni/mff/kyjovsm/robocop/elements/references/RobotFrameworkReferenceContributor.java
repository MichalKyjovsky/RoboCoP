package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.*;
import com.intellij.util.ProcessingContext;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkLibraryReference;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.NotNull;

/**
 *
 */
public class RobotFrameworkReferenceContributor extends PsiReferenceContributor {

  /**
   * @param registrar
   */
  @Override
  public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
    registrar.registerReferenceProvider(PlatformPatterns.psiElement(RobotFrameworkReferencedFile.class),
            new PsiReferenceProvider() {
              @NotNull
              @Override
              public PsiReference[] getReferencesByElement(@NotNull PsiElement element, @NotNull ProcessingContext context) {
                if (element instanceof RobotFrameworkReferencedFile) {
                  return new PsiReference[]{new RobotFrameworkFileReference((RobotFrameworkReferencedFile)element)};
                }
                return PsiReference.EMPTY_ARRAY;
              }
            },
            PsiReferenceRegistrar.HIGHER_PRIORITY);
    registrar.registerReferenceProvider(PlatformPatterns.psiElement(RobotFrameworkLibraryReference.class),
            new PsiReferenceProvider() {
              @Override
              public @NotNull PsiReference[] getReferencesByElement(@NotNull PsiElement psiElement, @NotNull ProcessingContext processingContext) {
                if (psiElement instanceof RobotFrameworkLibraryReference) {
                  return new PsiReference[]{new RobotFrameworkLibRef((RobotFrameworkLibraryReference)psiElement)};
                }
                return PsiReference.EMPTY_ARRAY;
              }
            },
            PsiReferenceRegistrar.HIGHER_PRIORITY);
  }
}
