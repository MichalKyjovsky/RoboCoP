package cz.cuni.mff.kyjovsm.robocop.parser;


import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkKeywordNameImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStubImpl;

import java.io.IOException;


public class RobotFrameworkKeywordNameElementType extends IStubElementType<RobotFrameworkKeywordNameStub, RobotFrameworkKeywordName> {
  public RobotFrameworkKeywordNameElementType(@NotNull String name) {
    super(name, RobotFrameworkLanguage.INSTANCE);
  }

  @Override
  public RobotFrameworkKeywordName createPsi(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub) {
    return new RobotFrameworkKeywordNameImpl(robotFrameworkKeywordNameStub, this);
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordNameStub createStub(@NotNull RobotFrameworkKeywordName robotFrameworkKeywordName, StubElement parentStub) {
    return new RobotFrameworkKeywordNameStubImpl(parentStub, this, StringRef.fromString(robotFrameworkKeywordName.getName()));
  }

  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword: ", super.toString());
  }

  @Override
  public void serialize(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkKeywordNameStub.getName());
  }

  @NotNull
  @Override
  public RobotFrameworkKeywordNameStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkKeywordNameStubImpl(parentStub, this, stubInputStream.readName());
  }

  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
