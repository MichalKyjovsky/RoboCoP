package cz.cuni.mff.kyjovsm.robocop.parser;


import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.IndexSink;
import com.intellij.psi.stubs.StubElement;
import com.intellij.psi.stubs.StubInputStream;
import com.intellij.psi.stubs.StubOutputStream;
import com.intellij.util.io.StringRef;
import org.jetbrains.annotations.NotNull;
import cz.cuni.mff.kyjovsm.robocop.psi.impl.RobotFrameworkKeywordNameImpl;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStub;
import cz.cuni.mff.kyjovsm.robocop.elements.stubs.RobotFrameworkKeywordNameStubImpl;

import java.io.IOException;


/**
 *
 */
public class RobotFrameworkKeywordNameElementType extends IStubElementType<RobotFrameworkKeywordNameStub, RobotFrameworkKeywordName> {
  /**
   * @param name
   */
  public RobotFrameworkKeywordNameElementType(@NotNull String name) {
    super(name, RobotFrameworkLanguage.INSTANCE);
  }

  /**
   * @param robotFrameworkKeywordNameStub
   * @return
   */
  @Override
  public RobotFrameworkKeywordName createPsi(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub) {
    return new RobotFrameworkKeywordNameImpl(robotFrameworkKeywordNameStub, this);
  }

  /**
   * @param robotFrameworkKeywordName
   * @param parentStub
   * @return
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordNameStub createStub(@NotNull RobotFrameworkKeywordName robotFrameworkKeywordName, StubElement parentStub) {
    return new RobotFrameworkKeywordNameStubImpl(parentStub, this, StringRef.fromString(robotFrameworkKeywordName.getName()));
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getExternalId() {
    return String.format("Robot Framework Keyword: ", super.toString());
  }

  /**
   * @param robotFrameworkKeywordNameStub
   * @param stubOutputStream
   * @throws IOException
   */
  @Override
  public void serialize(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub, @NotNull StubOutputStream stubOutputStream) throws IOException {
    stubOutputStream.writeName(robotFrameworkKeywordNameStub.getName());
  }

  /**
   * @param stubInputStream
   * @param parentStub
   * @return
   * @throws IOException
   */
  @NotNull
  @Override
  public RobotFrameworkKeywordNameStub deserialize(@NotNull StubInputStream stubInputStream, StubElement parentStub) throws IOException {
    return new RobotFrameworkKeywordNameStubImpl(parentStub, this, stubInputStream.readName());
  }

  /**
   * @param robotFrameworkKeywordNameStub
   * @param indexSink
   */
  @Override
  public void indexStub(@NotNull RobotFrameworkKeywordNameStub robotFrameworkKeywordNameStub, @NotNull IndexSink indexSink) {
    //TODO: Implement stub indexing
  }
}
