package cz.cuni.mff.kyjovsm.robocop.elements.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.NamedStub;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTestCase;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkTestCaseStubImpl extends StubBase<RobotFrameworkTestCase> implements RobotFrameworkTestCaseStub {

  private StringRef name;

  public RobotFrameworkTestCaseStubImpl(StubElement parent, IStubElementType elementType, StringRef name) {
    super(parent, elementType);
    this.name = name;
  }

  @Override
  public @Nullable String getName() {
    return name.getString();
  }
}
