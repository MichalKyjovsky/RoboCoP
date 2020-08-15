package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkPsiFile extends PsiFileBase {
  protected RobotFrameworkPsiFile(@NotNull FileViewProvider viewProvider, @NotNull Language language) {
    super(viewProvider, language);
  }

  @Override
  public @NotNull FileType getFileType() {
    return RobotFrameworkFileType.INSTANCE;
  }
  
}
