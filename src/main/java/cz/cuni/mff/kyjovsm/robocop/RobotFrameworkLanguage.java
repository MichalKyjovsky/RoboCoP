package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.lang.Language;

public class RobotFrameworkLanguage extends Language {
    public static final RobotFrameworkLanguage INSTANCE = new RobotFrameworkLanguage();

    private RobotFrameworkLanguage() {
        super("RobotFramework");
    }
}