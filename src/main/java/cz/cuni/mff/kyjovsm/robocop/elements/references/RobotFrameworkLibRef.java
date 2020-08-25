package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkUtil;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkLibraryReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkLibRef extends PsiReferenceBase<PsiElement> {

  private final String libraryName;

  public RobotFrameworkLibRef(@NotNull RobotFrameworkLibraryReference robotFrameworkLibraryReference) {
    super(robotFrameworkLibraryReference);
    libraryName = robotFrameworkLibraryReference.getName();
  }

  @Override
  public @Nullable PsiElement resolve() {
    Project project = myElement.getProject();
    return RobotFrameworkUtil.findLibraryReference(project, libraryName);
  }

  @NotNull
  @Override
  public String getCanonicalText() {
    return myElement.getText();
  }

  @Override
  public TextRange calculateDefaultRangeInElement() {
    return new TextRange(0, myElement.getText().length());
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    return new Object[0];
  }
}
