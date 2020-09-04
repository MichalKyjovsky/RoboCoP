package cz.cuni.mff.kyjovsm.robocop.elements.stubs.stubindex;

import com.intellij.psi.stubs.StringStubIndexExtension;
import com.intellij.psi.stubs.StubIndexKey;
import cz.cuni.mff.kyjovsm.robocop.psi.RobotFrameworkKeywordArgument;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkKeywordArgumentIndex extends StringStubIndexExtension<RobotFrameworkKeywordArgument> {

  public static final StubIndexKey<String, RobotFrameworkKeywordArgument> KEY = StubIndexKey.createIndexKey("Robot.keywordArgument.name");

  @Override
  public @NotNull StubIndexKey<String, RobotFrameworkKeywordArgument> getKey() {
    return KEY;
  }
}
