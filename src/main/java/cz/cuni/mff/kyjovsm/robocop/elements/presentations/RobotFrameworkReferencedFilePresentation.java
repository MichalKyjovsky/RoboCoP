package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * Purpose of this class is to specify how the PSI element - RobotFrameworkReferencedFilePresentation
 * will look like in the Go To Symbol pop-up window, Structure tool window, or other components.
 */
public class RobotFrameworkReferencedFilePresentation implements ItemPresentation {

  private final RobotFrameworkReferencedFile robotFrameworkReferencedFile;

  /**
   * @param robotFrameworkReferencedFile instance of the RobotFrameworkReferencedFilePresentation
   *                                       PSI element, to which the presentation is meant.
   */
  public RobotFrameworkReferencedFilePresentation(RobotFrameworkReferencedFile robotFrameworkReferencedFile) {
    this.robotFrameworkReferencedFile = robotFrameworkReferencedFile;
  }

  /**
   * When for instance Go To Symbol pop-up window, Structure tool window, or other components
   * are invoked, the RobotFrameworkReferencedFilePresentation instance is represented by text
   * below.
   * @return Presentable form of the PSI element.
   */
  @Override
  public @Nullable String getPresentableText() {
    return String.format("Robot Resource file: %s", robotFrameworkReferencedFile.getText());
  }

  /**
   * When Go To Symbol action is invoked, method will return related String
   * of this PSI element in the another file in dialog window.
   * @return File and name of the PSI element.
   */
  @Override
  public @Nullable String getLocationString() {
    PsiFile containingFile = robotFrameworkReferencedFile.getContainingFile();
    return containingFile == null ? null : containingFile.getName();
  }

  /**
   * @param unused Parameter determining whether the icon representation will be used or not.
   * @return Loaded instance of icon representing Robot Framework.
   */
  @Override
  public @Nullable Icon getIcon(boolean unused) {
    return RobotFrameworkIcons.ICON_MAIN;
  }
}
