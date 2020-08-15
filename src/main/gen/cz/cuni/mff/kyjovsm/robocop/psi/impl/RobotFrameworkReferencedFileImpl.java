// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;

public class RobotFrameworkReferencedFileImpl extends ASTWrapperPsiElement implements RobotFrameworkReferencedFile {

  public RobotFrameworkReferencedFileImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitReferencedFile(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiReference getReference() {
    return RobotFrameworkImplUtil.getReference(this);
  }

  @Override
  @NotNull
  public PsiReference[] getReferences() {
    return RobotFrameworkImplUtil.getReferences(this);
  }

  @Override
  @Nullable
  @NonNls
  public String getName() {
    return RobotFrameworkImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(@NonNls @NotNull String newName) throws IncorrectOperationException {
    return RobotFrameworkImplUtil.setName(this, newName);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return RobotFrameworkImplUtil.getNameIdentifier(this);
  }

  @Override
  public PsiElement handleElementRename(String name) {
    return RobotFrameworkImplUtil.handleElementRename(this, name);
  }

  @Override
  public ItemPresentation getPresentation() {
    return RobotFrameworkImplUtil.getPresentation(this);
  }

  @Override
  public String toString() {
    return RobotFrameworkImplUtil.toString(this);
  }

}
