package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarVariableStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarVariableStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkScalarVariable;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkScalarVariableImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 *
 */
public class RobotFrameworkScalarVariableElementType extends IStubElementType<RobotFrameworkScalarVariableStub, RobotFrameworkScalarVariable> {
  public RobotFrameworkScalarVariableElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @param robotFrameworkScalarVariableStub
   * @return
   */
  @Override
  public RobotFrameworkScalarVariable createPsi(@NotNull RobotFrameworkScalarVariableStub robotFrameworkScalarVariableStub) {
    return new RobotFrameworkScalarVariableImpl(robotFrameworkScalarVariableStub, this);
  }

  /**
   * @param robotFrameworkScalarVariable
   * @param parentStub
   * @return
   */
  @NotNull
  @Override
  public RobotFrameworkScalarVariableStub createStub(@NotNull RobotFrameworkScalarVariable robotFrameworkScalarVariable, StubElement parentStub) {
    return new RobotFrameworkScalarVariableStubImpl(parentStub, this, StringRef.fromString(robotFrameworkScalarVariable.getName()));
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Variable: %s", super.toString());
  }

  /**
   * @param robotFrameworkScalarVariableStub
   * @param stubOutputStream
   * @throws IOException
   */
  @Override
  public void serialize(@NotNull RobotFrameworkScalarVariableStub robotFrameworkScalarVariableStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkScalarVariableStub.getName());
  }

  /**
   * @param stubInputStream
   * @param parentStub
   * @return
   * @throws IOException
   */
  @NotNull
  @Override
  public RobotFrameworkScalarVariableStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkScalarVariableStubImpl(parentStub, this, stubInputStream.readName());
  }

  /**
   * @param robotFrameworkScalarVariableStub
   * @param indexSink
   */
  @Override
  public void indexStub(@NotNull RobotFrameworkScalarVariableStub robotFrameworkScalarVariableStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
