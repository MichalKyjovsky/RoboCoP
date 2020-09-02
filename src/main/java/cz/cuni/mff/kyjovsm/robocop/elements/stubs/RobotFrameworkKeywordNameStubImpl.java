package cz.cuni.mff.kyjovsm.robocop.elements.stubs;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.stubs.StubBase;
import com.intellij.psi.stubs.StubElement;
import com.intellij.util.io.StringRef;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordName;
import org.jetbrains.annotations.Nullable;

/**
 *
 */
public class RobotFrameworkKeywordNameStubImpl extends StubBase<RobotFrameworkKeywordName> implements RobotFrameworkKeywordNameStub {
  private StringRef name;

  /**
   * @param parent
   * @param elementType
   * @param name
   */
  public RobotFrameworkKeywordNameStubImpl(final StubElement parent, final IStubElementType elementType, StringRef name) {
    super(parent, elementType);
    this.name = name;
  }

  /**
   * @return
   */
  @Override
  public @Nullable String getName() {
    return name.getString();
  }
}
