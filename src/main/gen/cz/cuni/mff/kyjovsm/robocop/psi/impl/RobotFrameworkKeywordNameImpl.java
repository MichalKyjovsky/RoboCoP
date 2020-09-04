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
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;
import com.intellij.navigation.ItemPresentation;
import com.intellij.util.IncorrectOperationException;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class RobotFrameworkKeywordNameImpl extends StubBasedPsiElementBase<RobotFrameworkKeywordNameStub> implements RobotFrameworkKeywordName {

  public RobotFrameworkKeywordNameImpl(@NotNull RobotFrameworkKeywordNameStub stub, @NotNull IStubElementType type) {
    super(stub, type);
  }

  public RobotFrameworkKeywordNameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public RobotFrameworkKeywordNameImpl(RobotFrameworkKeywordNameStub stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitKeywordName(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
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
  public ItemPresentation getPresentation() {
    return RobotFrameworkImplUtil.getPresentation(this);
  }

  @Override
  public String toString() {
    return RobotFrameworkImplUtil.toString(this);
  }

}
