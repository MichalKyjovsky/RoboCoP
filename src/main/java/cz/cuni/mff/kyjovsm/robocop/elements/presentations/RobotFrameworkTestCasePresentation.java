package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;

import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTestCase;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkTestCasePresentation implements ItemPresentation {
  private final RobotFrameworkTestCase rfTestCase;

  public RobotFrameworkTestCasePresentation(RobotFrameworkTestCase rfTestCase) {
    this.rfTestCase = rfTestCase;
  }

  @Nullable
  @Override
  public String getPresentableText() {
    return String.format("Robot Test Case: %s", rfTestCase.getName());
  }

  @Nullable
  @Override
  public String getLocationString() {
    if (rfTestCase.getContainingFile() == null) {
      return null;
    }
    return rfTestCase.getContainingFile().getName();
  }

  @Nullable
  @Override
  public Icon getIcon(boolean b) {
    return RobotFrameworkIcons.ICON_MAIN;
  }

}
