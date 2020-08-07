package cz.cuni.mff.kyjovsm.robocop.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class NewRobotFrameworkFileAction extends CreateFileFromTemplateAction {
    public NewRobotFrameworkFileAction() {
        super("NewRobotFrameworkFile.robot", "Create a new robot test case file.", RobotFrameworkIcons.FILE);
    }

    public NewRobotFrameworkFileAction(String text, String description, Icon icon) {
        super(text, description, icon);
    }

    @Override
    protected void buildDialog(@NotNull Project project, @NotNull PsiDirectory directory, CreateFileFromTemplateDialog.@NotNull Builder builder) {
        builder
                .setTitle("New Robot Framework File")
                .addKind("Robot Test Case File", RobotFrameworkIcons.FILE, "RobotFrameworkTestCaseFile")
                .addKind("Robot Framework Keywords File", RobotFrameworkIcons.FILE, "RobotFrameworkKeywordsFile");
    }

    @Override
    protected @NlsContexts.Command String getActionName(PsiDirectory directory, @NotNull String newName, String templateName) {
        return String.format("Create Robot file %s", newName);
    }
}
