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
 *
 */
public class RobotFrameworkScalarAssignmentElementType extends IStubElementType<RobotFrameworkScalarAssignmentStub, RobotFrameworkScalarAssignment> {

  /**
   * @param debugName
   */
  public RobotFrameworkScalarAssignmentElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @param robotFrameworkScalarAssignmentStub
   * @return
   */
  @Override
  public RobotFrameworkScalarAssignment createPsi(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub) {
    return new RobotFrameworkScalarAssignmentImpl(robotFrameworkScalarAssignmentStub, this);
  }

  /**
   * @param robotFrameworkScalarAssignment
   * @param parentStub
   * @return
   */
  @NotNull
  @Override
  public RobotFrameworkScalarAssignmentStub createStub(@NotNull RobotFrameworkScalarAssignment robotFrameworkScalarAssignment, StubElement parentStub) {
    return new RobotFrameworkScalarAssignmentStubImpl(parentStub, this, StringRef.fromString(robotFrameworkScalarAssignment.getName()));
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword Assignment: ", super.toString());
  }

  /**
   * @param robotFrameworkScalarAssignmentStub
   * @param stubOutputStream
   * @throws IOException
   */
  @Override
  public void serialize(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkScalarAssignmentStub.getName());
  }

  /**
   * @param stubInputStream
   * @param parentStub
   * @return
   * @throws IOException
   */
  @NotNull
  @Override
  public RobotFrameworkScalarAssignmentStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkScalarAssignmentStubImpl(parentStub, this, stubInputStream.readName());
  }

  /**
   * @param robotFrameworkScalarAssignmentStub
   * @param indexSink
   */
  @Override
  public void indexStub(@NotNull RobotFrameworkScalarAssignmentStub robotFrameworkScalarAssignmentStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }

}
