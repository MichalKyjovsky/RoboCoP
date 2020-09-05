package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.psi.stubs.PsiFileStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkFile;

public class RobotFrameworkPsiFileStub extends PsiFileStubImpl<RobotFrameworkFile> {
  public RobotFrameworkPsiFileStub(RobotFrameworkFile file) {
    super(file);
  }
}
