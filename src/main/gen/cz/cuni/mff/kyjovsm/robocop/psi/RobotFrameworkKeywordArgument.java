// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStub;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;

public interface RobotFrameworkKeywordArgument extends RobotFrameworkNamedElement, StubBasedPsiElement<RobotFrameworkKeywordArgumentStub> {

  @Nullable
  RobotFrameworkVariable getVariable();

  PsiReference getReference();

  PsiReference[] getReferences();

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException;

  PsiElement handleElementRename(String name);

  @Nullable
  PsiElement getNameIdentifier();

}
