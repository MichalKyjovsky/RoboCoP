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
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkTestCaseStub;
import cz.cuni.mff.kyjovsm.robocop.psi.*;
import cz.cuni.mff.kyjovsm.robocop.elements.RobotFrameworkImplUtil;
import com.intellij.navigation.ItemPresentation;
import com.intellij.util.IncorrectOperationException;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;

public class RobotFrameworkTestCaseImpl extends StubBasedPsiElementBase<RobotFrameworkTestCaseStub> implements RobotFrameworkTestCase {

  public RobotFrameworkTestCaseImpl(@NotNull T stub, @NotNull IStubElementType type) {
    super(stub, type);
  }

  public RobotFrameworkTestCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public RobotFrameworkTestCaseImpl(T stub, IElementType type, ASTNode node) {
    super(stub, type, node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitTestCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<RobotFrameworkEmptyLine> getEmptyLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkEmptyLine.class);
  }

  @Override
  @NotNull
  public List<RobotFrameworkTestCaseLine> getTestCaseLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, RobotFrameworkTestCaseLine.class);
  }

  @Override
  @NotNull
  public RobotFrameworkTestCaseName getTestCaseName() {
    return findNotNullChildByClass(RobotFrameworkTestCaseName.class);
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

}
