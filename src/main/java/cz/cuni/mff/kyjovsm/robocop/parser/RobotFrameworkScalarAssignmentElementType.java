package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStubImpl;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarAssignmentStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkScalarAssignmentStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkScalarAssignment;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkScalarAssignmentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

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
    return String.format("Robot Framework Keyword: ", super.toString());
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
