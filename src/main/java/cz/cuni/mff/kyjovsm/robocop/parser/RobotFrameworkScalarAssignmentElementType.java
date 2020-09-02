package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarAssignmentStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarAssignmentStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkScalarAssignment;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkScalarAssignmentImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Class for defining type and methods of SCALAR_ASSIGNMENT for the lexer.
 */
public class RobotFrameworkScalarAssignmentElementType extends IStubElementType<RobotFrameworkScalarAssignmentStub, RobotFrameworkScalarAssignment> {

  public RobotFrameworkScalarAssignmentElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  @Override
  public RobotFrameworkScalarAssignment createPsi(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub) {
    return new RobotFrameworkScalarAssignmentImpl(robotFrameworkScalarAssignmentStub, this);
  }

  @NotNull
  @Override
  public RobotFrameworkScalarAssignmentStub createStub(@NotNull RobotFrameworkScalarAssignment robotFrameworkScalarAssignment, StubElement parentStub) {
    return new RobotFrameworkScalarAssignmentStubImpl(parentStub, this, StringRef.fromString(robotFrameworkScalarAssignment.getName()));
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword Assignment: ", super.toString());
  }

  @Override
  public void serialize(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkScalarAssignmentStub.getName());
  }

  @NotNull
  @Override
  public RobotFrameworkScalarAssignmentStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkScalarAssignmentStubImpl(parentStub, this, stubInputStream.readName());
  }

  @Override
  public void indexStub(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }

}
