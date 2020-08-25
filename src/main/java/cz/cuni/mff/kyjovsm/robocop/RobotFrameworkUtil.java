package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.jetbrains.python.PythonFileType;
import com.jetbrains.python.psi.PyFile;
import cz.cuni.mff.kyjovsm.robocop.psi.LibraryFile;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;

import java.util.*;

public class RobotFrameworkUtil {
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

