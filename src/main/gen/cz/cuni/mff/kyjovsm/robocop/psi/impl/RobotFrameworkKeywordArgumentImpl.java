// This is a generated file. Not intended for manual editing.
package cz.cuni.mff.kyjovsm.robocop.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static cz.cuni.mff.kyjovsm.robocop.parser.RobotFrameworkTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStub;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;
import com.intellij.psi.PsiReference;
import com.intellij.util.IncorrectOperationException;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class RobotFrameworkKeywordArgumentImpl extends StubBasedPsiElementBase<RobotFrameworkKeywordArgumentStub> implements RobotFrameworkKeywordArgument {

  public RobotFrameworkKeywordArgumentImpl(@NotNull RobotFrameworkKeywordArgumentStub stub, @NotNull IStubElementType type) {
    super(stub, type);
  }

  public RobotFrameworkKeywordArgumentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public RobotFrameworkKeywordArgumentImpl(RobotFrameworkKeywordArgumentStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitKeywordArgument(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkVariable getVariable() {
    return findChildByClass(RobotFrameworkVariable.class);
  }

  @Override
  public PsiReference getReference() {
    return RobotFrameworkImplUtil.getReference(this);
  }

  @Override
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
  public PsiElement handleElementRename(String name) {
    return RobotFrameworkImplUtil.handleElementRename(this, name);
  }

  @Override
  @Nullable
  public PsiElement getNameIdentifier() {
    return RobotFrameworkImplUtil.getNameIdentifier(this);
  }

}
