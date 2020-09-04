package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeyword;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkKeywordImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;


/**
 * Class for defining type and methods of KEYWORD_NAME for the lexer.
 */
public class RobotFrameworkKeywordElementType extends IStubElementType<RobotFrameworkKeywordStub, RobotFrameworkKeyword> {
  public RobotFrameworkKeywordElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  @Override
  public RobotFrameworkKeyword createPsi(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub) {
    return new RobotFrameworkKeywordImpl(robotFrameworkKeywordStub, this);
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordStub createStub(@NotNull RobotFrameworkKeyword robotFrameworkKeyword, StubElement parentStub) {
    return new RobotFrameworkKeywordStubImpl(parentStub, this, StringRef.fromString(robotFrameworkKeyword.getName()));
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword: %s", super.toString());
  }

  @Override
  public void serialize(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkKeywordStub.getName());
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkKeywordStubImpl(parentStub, this, stubInputStream.readName());
  }

  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
