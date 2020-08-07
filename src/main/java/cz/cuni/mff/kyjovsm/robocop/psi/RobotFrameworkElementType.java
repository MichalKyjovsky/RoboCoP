package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class RobotFrameworkElementType extends IElementType {
    public RobotFrameworkElementType(@NotNull @NonNls String debugName) {
        super(debugName, RobotFrameworkLanguage.INSTANCE);
    }
}
