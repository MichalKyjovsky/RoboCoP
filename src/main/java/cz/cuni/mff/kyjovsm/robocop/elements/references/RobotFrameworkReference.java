package cz.cuni.mff.kyjovsm.robocop.elements.references;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import com.sun.jna.platform.win32.OaIdl;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkPsiFile;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkUtil;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkVariableUtils;
import cz.cuni.mff.kyjovsm.robocop.elements.search.VariableInfo;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkReferencedFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RobotFrameworkReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

  private final String elementName;

  public RobotFrameworkReference(@NotNull RobotFrameworkReferencedFile robotFrameworkReferencedFile) {
    super(robotFrameworkReferencedFile);
    elementName = robotFrameworkReferencedFile.getNameIdentifier().getText() != null ? robotFrameworkReferencedFile.getNameIdentifier().getText() : "ELEMENT WITHOUT NAME";
  }

//  @Override
//  public @Nullable PsiElement resolve() {
//    final PsiFile file = myElement.getContainingFile();
//    if (!(file instanceof RobotFrameworkPsiFile)) {
//      return null;
//    }
//    RobotFrameworkPsiFile robotFrameworkPsiFile = (RobotFrameworkPsiFile) file;
//    Map<String, VariableInfo> env = RobotFrameworkVariableUtils.getVariableEnvironment(robotFrameworkPsiFile);
//    return resolve(env);
//  }
//
//  @Nullable
//  public PsiElement resolve(Map<String, VariableInfo> environment) {
//    final String fileName = RobotFrameworkVariableUtils.substitute(myElement.getText(), environment);
//    System.err.println(fileName);
//    final Project project = myElement.getProject();
//    final File file = new File(fileName);
//
//    if (!file.isAbsolute()) {
//      PsiFile currentPsiFile = myElement.getContainingFile();
//      VirtualFile currentVirtualFile = currentPsiFile.getVirtualFile();
//      if (currentVirtualFile != null) {
//        VirtualFile containingDir = currentVirtualFile.getParent();
//
//        VirtualFile virtualResourceFile = containingDir.findFileByRelativePath(fileName);
//
//        if (virtualResourceFile != null) {
//          return PsiManager.getInstance(project).findFile(virtualResourceFile);
//        }
//      }
//    }
//
//    VirtualFile virtualResourceFile = LocalFileSystem.getInstance().findFileByIoFile(file);
//    if (virtualResourceFile != null) {
//      return PsiManager.getInstance(project).findFile(virtualResourceFile);
//    }
//    return null;
//  }

  @NotNull
  @Override
  public ResolveResult[] multiResolve(boolean incompleteCode) {
    Project project = myElement.getProject();
    // HERE IT IS BROKEN
    final RobotFrameworkFile reference = RobotFrameworkUtil.findResourceFiles(project, elementName);
    System.out.println("Element NAME: " + elementName);
    System.out.println("REFERENCE NAME: " + reference.getName());
    List<ResolveResult> results = new ArrayList<>();
    results.add(new PsiElementResolveResult(reference));
    return results.toArray(new ResolveResult[0]);
  }


  @Override
  public @Nullable PsiElement resolve() {
    ResolveResult[] resolveResults = multiResolve(false);
    return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
  }

  @NotNull
  @Override
  public String getCanonicalText() {
    return myElement.getText();
  }

  @Override
  public TextRange calculateDefaultRangeInElement() {
    return new TextRange(0, myElement.getText().length());
  }

  @NotNull
  @Override
  public Object[] getVariants() {
    return new Object[0];
  }
}
