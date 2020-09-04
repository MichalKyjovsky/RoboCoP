package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;

import com.intellij.psi.PsiFile;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTestCase;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * Purpose of this class is to specify how the PSI element - RobotFrameworkTestCasePresentation
 * will look like in the Go To Symbol pop-up window, Structure tool window, or other components.
 */
public class RobotFrameworkTestCasePresentation implements ItemPresentation {
  private final RobotFrameworkTestCase rfTestCase;

  /**
   * @param rfTestCase instance of the RobotFrameworkLibraryReference
   *                                       PSI element, to which the presentation is meant.
   */
  public RobotFrameworkTestCasePresentation(RobotFrameworkTestCase rfTestCase) {
    this.rfTestCase = rfTestCase;
  }

  /**
   * When for instance Go To Symbol pop-up window, Structure tool window, or other components
   * are invoked, the RobotFrameworkTestCasePresentation instance is represented by text below.
   * @return Presentable form of the PSI element.
   */
  @Nullable
  @Override
  public String getPresentableText() {
    return String.format("Robot Test Case: %s", rfTestCase.getName());
  }


  /**
   * When Go To Symbol action is invoked, method will return related String
   * of this PSI element in the another file in dialog window.
   * @return File and name of the PSI element.
   */
  @Nullable
  @Override
  public String getLocationString() {
    PsiFile containingFile = rfTestCase.getContainingFile();
    return containingFile == null ? null : containingFile.getName();
  }

  /**
   * @param unused Parameter determining whether the icon representation will be used or not.
   * @return Loaded instance of icon representing Robot Framework.
   */
  @Nullable
  @Override
  public Icon getIcon(boolean unused) {
    return RobotFrameworkIcons.ICON_MAIN;
  }

}
