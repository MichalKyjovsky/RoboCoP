package cz.cuni.mff.kyjovsm.robocop.parser;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordArgumentStubImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordArgument;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkKeywordArgumentImpl;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Class for defining type and methods of KEYWORD_ARGUMENT for the lexer.
 */
public class RobotFrameworkKeywordArgumentElementType extends IStubElementType<RobotFrameworkKeywordArgumentStub, RobotFrameworkKeywordArgument> {

  public RobotFrameworkKeywordArgumentElementType(@NotNull String debugName) {
    super(debugName, RobotFrameworkLanguage.INSTANCE);
  }
  @Override
  public RobotFrameworkKeywordArgument createPsi(@NotNull RobotFrameworkKeywordArgumentStub stubElement) {
    return new RobotFrameworkKeywordArgumentImpl(stubElement, this);
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordArgumentStub createStub(@NotNull RobotFrameworkKeywordArgument psiElement, StubElement parentStub) {
    return new RobotFrameworkKeywordArgumentStubImpl(parentStub, this, StringRef.fromString(psiElement.getName())) {
    };
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("robot:%s", super.toString());
  }

  @Override
  public void serialize(@NotNull RobotFrameworkKeywordArgumentStub stub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(stub.getName());
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordArgumentStub deserialize(@NotNull StubInputStream stubInputStream, StubElement stubElement) throws IOException {
    return null;
  }

  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordArgumentStub robotFrameworkKeywordArgumentStub, @NotNull IndexSink indexSink) {

  }
}
