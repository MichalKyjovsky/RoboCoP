package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkReferencedFilePresentation implements ItemPresentation {

  private final RobotFrameworkReferencedFile robotFrameworkReferencedFile;

  public RobotFrameworkReferencedFilePresentation(RobotFrameworkReferencedFile robotFrameworkReferencedFile) {
    this.robotFrameworkReferencedFile = robotFrameworkReferencedFile;
  }

  @Override
  public @Nullable String getPresentableText() {
    return String.format("Robot Resource file: %s", robotFrameworkReferencedFile.getText());
  }

  @Override
  public @Nullable String getLocationString() {
    if (robotFrameworkReferencedFile.getContainingFile() == null) {
      return null;
    }
    return robotFrameworkReferencedFile.getContainingFile().getName();
  }

  @Override
  public @Nullable Icon getIcon(boolean b) {
    return RobotFrameworkIcons.ICON_MAIN;
  }
}
