package cz.cuni.mff.kyjovsm.robocop.elements.stubs;


import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.NamedStub;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkScalarVariable;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkScalarVariableStubImpl extends StubBase<RobotFrameworkScalarVariable> implements RobotFrameworkScalarVariableStub {

  private StringRef name;

  public RobotFrameworkScalarVariableStubImpl(StubElement parent, IStubElementType elementType, StringRef name) {
    super(parent, elementType);
    this.name = name;
  }

  @Override
  public @Nullable String getName() {
    return name.getString();
  }
}
