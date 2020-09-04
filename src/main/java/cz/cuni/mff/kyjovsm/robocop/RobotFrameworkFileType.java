package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.fileTypes.LanguageFileType;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 * Class providing functionality of connection between the file type and
 * the language passed to the constructor.
 */
public class RobotFrameworkFileType extends LanguageFileType {
    /**
     * Singleton instance of RobotFrameworkFileType.
     */
    public static final RobotFrameworkFileType INSTANCE = new RobotFrameworkFileType();

    /**
     * Override the default language instance by RobotFrameworkLanguage.
     */
    private RobotFrameworkFileType() {
        super(RobotFrameworkLanguage.INSTANCE);
    }

    /**
     * @return Name of the Robot Framework file type.
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
        return "Robot framework file, containing either variables, keywords or test suite.";
    }

    /**
     * @return Returns extension for Robot Framework file type.
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "robot";
    }

    /**
     * @return Returns icon representing Robot Framework language.
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return RobotFrameworkIcons.ICON_MAIN;
    }
}
