package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;

public class RobotFrameworkType extends IElementType {
  public RobotFrameworkType(String name) {
    super(name, RobotFrameworkLanguage.INSTANCE);
  }
}
