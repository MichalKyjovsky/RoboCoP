package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.jetbrains.python.PythonFileType;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;

import java.util.Collection;

/**
 * Purpose of this class is to provide functionality of traversing over
 * virtual file system and find the references defined in the Robot file.
 */
public class RobotFrameworkUtil {
  /**
   * @param project Reference to opened object.
   * @param fileName Name of the file from which the references
   *                 point to.
   * @return Instance of the RobotFrameworkFile obtained by
   * Go To Declaration action.
   */
  public static RobotFrameworkFile findResourceFiles(Project project, String fileName) {
    Collection<VirtualFile> virtualFiles = FileTypeIndex.getFiles(RobotFrameworkFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      RobotFrameworkFile rfFile = (RobotFrameworkFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (rfFile != null && rfFile.getName().equals(fileName)) {
        return rfFile;
      }
    }
    return null;
  }

  /**
   * @param project Reference to opened object.
   * @param fileName Name of the file from which the references
   *                 point to.
   * @return Instance of the PsiFile obtained by Go To Declaration action.
   */
  public static PsiFile findLibraryReference(Project project, String fileName) {
    Collection<VirtualFile> virtualFiles =  FileTypeIndex.getFiles(PythonFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
        PsiFile psiFile = PsiManager.getInstance(project).findFile(virtualFile);
      if (psiFile != null && psiFile.getName().equals(fileName)) {
        return psiFile;
      }
    }
    return null;
  }
}

