package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import cz.cuni.mff.kyjovsm.robocop.LibraryFileType;
import cz.cuni.mff.kyjovsm.robocop.LibraryLanguage;
import org.jetbrains.annotations.NotNull;


/**
 *
 */
public class LibraryFile extends PsiFileBase {
  public LibraryFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, LibraryLanguage.INSTANCE);
  }

  /**
   * @return
   */
  @NotNull
  @Override
  public FileType getFileType() {
    return LibraryFileType.INSTANCE;
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return getName();
  }
}
