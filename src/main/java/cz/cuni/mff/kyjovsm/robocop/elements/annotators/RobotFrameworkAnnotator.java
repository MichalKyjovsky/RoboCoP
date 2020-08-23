package cz.cuni.mff.kyjovsm.robocop.elements.annotators;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveResult;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkKeywordReference;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeyword;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkAnnotator implements Annotator {
  @Override
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {

  }
}
