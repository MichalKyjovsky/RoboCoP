// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;

public interface RobotFrameworkArgumentDefinition extends RobotFrameworkNamedElement {

  @Nullable
  RobotFrameworkScalarDefaultArgValue getScalarDefaultArgValue();

  @Nullable
  RobotFrameworkVariable getVariable();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException;

  @Nullable
  PsiElement getNameIdentifier();

  @Nullable
  PsiReference getReference();

  @NotNull
  PsiReference[] getReferences();

  PsiElement handleElementRename(String name);

}
