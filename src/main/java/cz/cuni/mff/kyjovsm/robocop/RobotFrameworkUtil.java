package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkLibraryReference;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RobotFrameworkUtil {
  public static List<RobotFrameworkLibraryReference> findVariables(Project project, String key) {
    List<RobotFrameworkLibraryReference> result = new ArrayList<>();
    Collection<VirtualFile> virtualFiles =
            FileTypeIndex.getFiles(RobotFrameworkFileType.INSTANCE, GlobalSearchScope.allScope(project));
    for (VirtualFile virtualFile : virtualFiles) {
      RobotFrameworkFile robotFrameworkFile = (RobotFrameworkFile) PsiManager.getInstance(project).findFile(virtualFile);
      if (robotFrameworkFile != null) {
        RobotFrameworkLibraryReference[] references = PsiTreeUtil.getChildrenOfType(robotFrameworkFile, RobotFrameworkLibraryReference.class);
        if (references != null) {
          for (RobotFrameworkLibraryReference reference : references) {
            if (key.equals(reference.getReference())) {
              result.add(reference);
            }
          }
        }
      }
    }
    return result;
  }

//  public static List<SimpleProperty> findProperties(Project project) {
//    List<SimpleProperty> result = new ArrayList<>();
//    Collection<VirtualFile> virtualFiles =
//            FileTypeIndex.getFiles(SimpleFileType.INSTANCE, GlobalSearchScope.allScope(project));
//    for (VirtualFile virtualFile : virtualFiles) {
//      SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(virtualFile);
//      if (simpleFile != null) {
//        SimpleProperty[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, SimpleProperty.class);
//        if (properties != null) {
//          Collections.addAll(result, properties);
//        }
//      }
//    }
//    return result;
//  }
}
