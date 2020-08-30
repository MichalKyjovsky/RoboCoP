package cz.cuni.mff.kyjovsm.robocop.elements.presentations;

import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiFile;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkLibraryReference;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkLibraryPresentation implements ItemPresentation {

  private final RobotFrameworkLibraryReference robotFrameworkLibraryReference;

  public RobotFrameworkLibraryPresentation(RobotFrameworkLibraryReference robotFrameworkLibraryReference) {
    this.robotFrameworkLibraryReference = robotFrameworkLibraryReference;
  }

  @Override
  public @Nullable String getPresentableText() {
    return String.format("Library file: %s", robotFrameworkLibraryReference.getText());
  }

  @Override
  public @Nullable String getLocationString() {
    PsiFile containingFile = robotFrameworkLibraryReference.getContainingFile();
    return containingFile == null ? null : containingFile.getName();
  }

  @Override
  public @Nullable Icon getIcon(boolean b) {
    return RobotFrameworkIcons.ICON_MAIN;
  }
}
