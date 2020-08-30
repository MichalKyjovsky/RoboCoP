package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkKeywordNamePresentation implements ItemPresentation {
  private final RobotFrameworkKeywordName robotKeywordTitle;

  public RobotFrameworkKeywordNamePresentation(@NotNull RobotFrameworkKeywordName robotKeywordTitle) {
    this.robotKeywordTitle = robotKeywordTitle;
  }

  @Nullable
  @Override
  public String getPresentableText() {
    return String.format("Robot Keyword: %s", robotKeywordTitle.getText());
  }

  @Nullable
  @Override
  public String getLocationString() {
    if (robotKeywordTitle.getContainingFile() == null) {
      return null;
    }
    return robotKeywordTitle.getContainingFile().getName();
  }

  @Nullable
  @Override
  public Icon getIcon(boolean b) {
    return RobotFrameworkIcons.ICON_MAIN;
  }
}
