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

public class RobotFrameworkVariablesLineImpl extends ASTWrapperPsiElement implements RobotFrameworkVariablesLine {

  public RobotFrameworkVariablesLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitVariablesLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkArrayAssignableInVariablesTbl getArrayAssignableInVariablesTbl() {
    return findChildByClass(RobotFrameworkArrayAssignableInVariablesTbl.class);
  }

  @Override
  @Nullable
  public RobotFrameworkArrayAssignmentLhs getArrayAssignmentLhs() {
    return findChildByClass(RobotFrameworkArrayAssignmentLhs.class);
  }

  @Override
  @Nullable
  public RobotFrameworkAssignableInVariablesTbl getAssignableInVariablesTbl() {
    return findChildByClass(RobotFrameworkAssignableInVariablesTbl.class);
  }

  @Override
  @Nullable
  public RobotFrameworkEllipses getEllipses() {
    return findChildByClass(RobotFrameworkEllipses.class);
  }

  @Override
  @Nullable
  public RobotFrameworkScalarAssignmentLhs getScalarAssignmentLhs() {
    return findChildByClass(RobotFrameworkScalarAssignmentLhs.class);
  }

}
