package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * Purpose of this class is to specify how the PSI element - RobotFrameworkKeywordNamePresentation
 * will look like in the Go To Symbol pop-up window, Structure tool window, or other components.
 */
public class RobotFrameworkKeywordNamePresentation implements ItemPresentation {
  private final RobotFrameworkKeywordName robotKeywordTitle;

  /**
   * @param robotKeywordTitle instance of the RobotFrameworkKeywordName
   *                          PSI element, to which the presentation is meant.
   */
  public RobotFrameworkKeywordNamePresentation(@NotNull RobotFrameworkKeywordName robotKeywordTitle) {
    this.robotKeywordTitle = robotKeywordTitle;
  }

  /**
   * When for instance Go To Symbol pop-up window, Structure tool window, or other components
   * are invoked, the RobotFrameworkKeywordNamePresentation instance is represented by text below.
   * @return Presentable form of the PSI element.
   */
  @Nullable
  @Override
  public String getPresentableText() {
    return String.format("Robot Keyword: %s", robotKeywordTitle.getText());
  }

  /**
   * When Go To Symbol action is invoked, method will return related String
   * of this PSI element in the another file in dialog window.
   * @return File and name of the PSI element.
   */
  @Nullable
  @Override
  public String getLocationString() {
    PsiFile containingFile = robotKeywordTitle.getContainingFile();
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
