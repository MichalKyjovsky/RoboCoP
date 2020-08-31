package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordArgument;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkKeywordArgumentImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 *
 */
public class RobotFrameworkKeywordArgumentElementType extends IStubElementType<RobotFrameworkKeywordArgumentStub, RobotFrameworkKeywordArgument> {

  /**
   * @param debugName
   */
  public RobotFrameworkKeywordArgumentElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @param stubElement
   * @return
   */
  @Override
  public RobotFrameworkKeywordArgument createPsi(@NotNull RobotFrameworkKeywordArgumentStub stubElement) {
    return new RobotFrameworkKeywordArgumentImpl(stubElement, this);
  }

  /**
   * @param psiElement
   * @param parentStub
   * @return
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordArgumentStub createStub(@NotNull RobotFrameworkKeywordArgument psiElement, StubElement parentStub) {
    return new RobotFrameworkKeywordArgumentStubImpl(parentStub, this, StringRef.fromString(psiElement.getName())) {
    };
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getExternalId() {
    return String.format("robot:%s", super.toString());
  }

  /**
   * @param stub
   * @param stubOutputStream
   * @throws IOException
   */
  @Override
  public void serialize(@NotNull RobotFrameworkKeywordArgumentStub stub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(stub.getName());
  }

  /**
   * @param stubInputStream
   * @param stubElement
   * @return
   * @throws IOException
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordArgumentStub deserialize(@NotNull StubInputStream stubInputStream, StubElement stubElement) throws IOException {
    return null;
  }

  /**
   * @param robotFrameworkKeywordArgumentStub
   * @param indexSink
   */
  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordArgumentStub robotFrameworkKeywordArgumentStub, @NotNull IndexSink indexSink) {

  }
}
