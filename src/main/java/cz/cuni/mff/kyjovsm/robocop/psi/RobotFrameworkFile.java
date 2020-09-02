package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkFileType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.NotNull;


/**
 * Class representing file with .robot extension across the
 * virtual file system.
 */
public class RobotFrameworkFile extends PsiFileBase {
  /**
   * @param viewProvider Instance of FileViewProvider, enabling
   *                     to search for a file in cooperation with
   *                     Go To Declaration action etc.
   */
  public RobotFrameworkFile(@NotNull FileViewProvider viewProvider) {
    super(viewProvider, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @return RobotFrameworkFileType instance defining the Robot
   * Framework file.
   */
  @NotNull
  @Override
  public FileType getFileType() {
    return RobotFrameworkFileType.INSTANCE;
  }

  /**
   * @return Name of the the .robot file.
   */
  @Override
  public String toString() {
    return getName();
  }
}
