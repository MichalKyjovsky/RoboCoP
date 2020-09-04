package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkTestCaseStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkTestCaseStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkTestCase;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkTestCaseImpl;
import org.jetbrains.annotations.NotNull;


import java.io.IOException;

/**
 * Class for defining type and methods of TEST_CASE for the lexer.
 */
public class RobotFrameworkTestCaseElementType extends IStubElementType<RobotFrameworkTestCaseStub, RobotFrameworkTestCase> {
  public RobotFrameworkTestCaseElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  @Override
  public RobotFrameworkTestCase createPsi(@NotNull RobotFrameworkTestCaseStub robotFrameworkTestCaseStub) {
    return new RobotFrameworkTestCaseImpl(robotFrameworkTestCaseStub, this);
  }

  @NotNull
  @Override
  public RobotFrameworkTestCaseStub createStub(@NotNull RobotFrameworkTestCase robotFrameworkTestCase, StubElement parentStub) {
    return new RobotFrameworkTestCaseStubImpl(parentStub, this, StringRef.fromString(robotFrameworkTestCase.getName()));
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Test Case: %s", super.toString());
  }

  @Override
  public void serialize(@NotNull RobotFrameworkTestCaseStub robotFrameworkTestCaseStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkTestCaseStub.getName());
  }

  @NotNull
  @Override
  public RobotFrameworkTestCaseStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkTestCaseStubImpl(parentStub, this, stubInputStream.readName());
  }

  @Override
  public void indexStub(@NotNull RobotFrameworkTestCaseStub robotFrameworkTestCaseStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
