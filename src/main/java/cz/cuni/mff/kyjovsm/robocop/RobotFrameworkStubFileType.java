package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IStubFileElementType;

public class RobotFrameworkStubFileType extends IStubFileElementType<RobotFrameworkPsiFileStub> {
  public RobotFrameworkStubFileType(Language lang) {
    super(lang);
  }
}
