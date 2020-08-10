package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.fileTypes.LanguageFileType;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 *
 */
public class RobotFrameworkFileType extends LanguageFileType {
    /**
     *
     */
    public static final RobotFrameworkFileType INSTANCE = new RobotFrameworkFileType();

    /**
     *
     */
    private RobotFrameworkFileType() {
        super(RobotFrameworkLanguage.INSTANCE);
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getName() {
        return "Robot Framework File";
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getDescription() {
        return "Robot Framework file.";
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "robot";
    }

    /**
     * @return
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return RobotFrameworkIcons.ICON_MAIN;
    }
}
