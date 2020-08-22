// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.references.RobotFrameworkNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import com.intellij.navigation.ItemPresentation;
import com.intellij.util.IncorrectOperationException;

public interface RobotFrameworkKeywordName extends RobotFrameworkNamedElement, StubBasedPsiElement<RobotFrameworkKeywordNameStub> {

  @Nullable
  @NonNls
  String getName();

  PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException;

  @Nullable
  PsiElement getNameIdentifier();

  ItemPresentation getPresentation();

  //WARNING: getRegex(...) is skipped
  //matching getRegex(RobotFrameworkKeywordName, ...)
  //methods are not found in RobotFrameworkImplUtil

}
