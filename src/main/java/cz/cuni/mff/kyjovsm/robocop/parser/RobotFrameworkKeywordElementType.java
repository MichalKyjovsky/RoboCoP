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
 *
 */
public class RobotFrameworkKeywordElementType extends IStubElementType<RobotFrameworkKeywordStub, RobotFrameworkKeyword> {
  public RobotFrameworkKeywordElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @param robotFrameworkKeywordStub
   * @return
   */
  @Override
  public RobotFrameworkKeyword createPsi(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub) {
    return new RobotFrameworkKeywordImpl(robotFrameworkKeywordStub, this);
  }

  /**
   * @param robotFrameworkKeyword
   * @param parentStub
   * @return
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordStub createStub(@NotNull RobotFrameworkKeyword robotFrameworkKeyword, StubElement parentStub) {
    return new RobotFrameworkKeywordStubImpl(parentStub, this, StringRef.fromString(robotFrameworkKeyword.getName()));
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword: %s", super.toString());
  }

  /**
   * @param robotFrameworkKeywordStub
   * @param stubOutputStream
   * @throws IOException
   */
  @Override
  public void serialize(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkKeywordStub.getName());
  }

  /**
   * @param stubInputStream
   * @param parentStub
   * @return
   * @throws IOException
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkKeywordStubImpl(parentStub, this, stubInputStream.readName());
  }

  /**
   * @param robotFrameworkKeywordStub
   * @param indexSink
   */
  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordStub robotFrameworkKeywordStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
