package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkFileType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.NotNull;


public class RobotFrameworkFile extends PsiFileBase {
  public RobotFrameworkFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, RobotFrameworkLanguage.INSTANCE);
  }

  @NotNull
  @Override
  public FileType getFileType() {
    return RobotFrameworkFileType.INSTANCE;
  }

  @Override
  public String toString() {
    return getName();
  }
}
