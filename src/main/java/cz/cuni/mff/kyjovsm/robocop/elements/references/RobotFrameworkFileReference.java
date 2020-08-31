package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkUtil;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkFileReference extends PsiReferenceBase<PsiElement> {

  private final String elementName;

  /**
   * @param robotFrameworkReferencedFile
   */
  public RobotFrameworkFileReference(@NotNull RobotFrameworkReferencedFile robotFrameworkReferencedFile) {
    super(robotFrameworkReferencedFile);
    elementName = robotFrameworkReferencedFile.getNameIdentifier() != null ? robotFrameworkReferencedFile.getNameIdentifier().getText() : "ELEMENT WITHOUT NAME";
  }

  /**
   * @return
   */
  @Override
  public @Nullable PsiElement resolve() {
    Project project = myElement.getProject();
    return RobotFrameworkUtil.findResourceFiles(project, elementName);
  }

  /**
   * @return
   */
  @NotNull
  @Override
  public String getCanonicalText() {
    return myElement.getText();
  }

  /**
   * @return
   */
  @Override
  public TextRange calculateDefaultRangeInElement() {
    return new TextRange(0, myElement.getText().length());
  }

  /**
   * @return
   */
  @NotNull
  @Override
  public Object[] getVariants() {
    return new Object[0];
  }
}
