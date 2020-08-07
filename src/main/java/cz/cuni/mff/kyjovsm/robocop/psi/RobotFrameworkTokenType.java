package cz.cuni.mff.kyjovsm.robocop.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import cz.cuni.mff.kyjovsm.robocop.RobotFrameworkLanguage;
import org.jetbrains.annotations.*;

public class RobotFrameworkTokenType extends IElementType {

    protected RobotFrameworkTokenType(@NotNull @NonNls String debugName) {
        super(debugName, RobotFrameworkLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "RobotFrameworkTokenType" + super.toString();
    }
}
