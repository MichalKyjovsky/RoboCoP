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

public class RobotFrameworkFileReference extends PsiReferenceBase<PsiElement> {

  private final String elementName;

  public RobotFrameworkFileReference(@NotNull RobotFrameworkReferencedFile robotFrameworkReferencedFile) {
    super(robotFrameworkReferencedFile);
    elementName = robotFrameworkReferencedFile.getNameIdentifier() != null ? robotFrameworkReferencedFile.getNameIdentifier().getText() : "ELEMENT WITHOUT NAME";
  }

  @Override
  public @Nullable PsiElement resolve() {
    Project project = myElement.getProject();
    return RobotFrameworkUtil.findResourceFiles(project, elementName);
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
