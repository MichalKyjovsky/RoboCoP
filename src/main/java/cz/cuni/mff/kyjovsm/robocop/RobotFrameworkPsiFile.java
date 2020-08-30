package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkPsiFile extends PsiFileBase {
  protected RobotFrameworkPsiFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, RobotFrameworkLanguage.INSTANCE);
  }

  @Override
  public @NotNull FileType getFileType() {
    return RobotFrameworkFileType.INSTANCE;
  }


  @Override
  public @Nullable Icon getIcon(int flags) {
    return super.getIcon(flags);
  }
}
