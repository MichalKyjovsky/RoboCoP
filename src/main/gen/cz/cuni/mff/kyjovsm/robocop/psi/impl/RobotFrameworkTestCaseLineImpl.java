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

public class RobotFrameworkTestCaseLineImpl extends ASTWrapperPsiElement implements RobotFrameworkTestCaseLine {

  public RobotFrameworkTestCaseLineImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RobotFrameworkVisitor visitor) {
    visitor.visitTestCaseLine(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RobotFrameworkVisitor) accept((RobotFrameworkVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public RobotFrameworkEllipsesLineTest getEllipsesLineTest() {
    return findChildByClass(RobotFrameworkEllipsesLineTest.class);
  }

  @Override
  @Nullable
  public RobotFrameworkExecutionLine getExecutionLine() {
    return findChildByClass(RobotFrameworkExecutionLine.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForLoopIn getForLoopIn() {
    return findChildByClass(RobotFrameworkForLoopIn.class);
  }

  @Override
  @Nullable
  public RobotFrameworkForLoopInRange getForLoopInRange() {
    return findChildByClass(RobotFrameworkForLoopInRange.class);
  }

  @Override
  @Nullable
  public RobotFrameworkKeywordArgList getKeywordArgList() {
    return findChildByClass(RobotFrameworkKeywordArgList.class);
  }

  @Override
  @Nullable
  public RobotFrameworkTestSettingLine getTestSettingLine() {
    return findChildByClass(RobotFrameworkTestSettingLine.class);
  }

}
