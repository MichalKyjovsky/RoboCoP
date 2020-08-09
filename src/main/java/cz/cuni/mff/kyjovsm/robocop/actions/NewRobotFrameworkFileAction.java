package cz.cuni.mff.kyjovsm.robocop.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.psi.PsiDirectory;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;

public class NewRobotFrameworkFileAction extends CreateFileFromTemplateAction {

  /**
   * TODO: Add class description
   */
  public NewRobotFrameworkFileAction() {
    super("New Robot File",
            "Creates either a new Robot Framework "
                    + "Test Suite file or Keywords definition file.",
            RobotFrameworkIcons.ICON_MAIN);
  }

  /**
   * @param text
   * @param description
   * @param icon
   */
  public NewRobotFrameworkFileAction(String text, String description, Icon icon) {
    super(text, description, icon);
  }

  /**
   * @param project
   * @param directory
   * @param builder
   */
  @Override
  protected void buildDialog(@NotNull Project project,
                             @NotNull PsiDirectory directory,
                             CreateFileFromTemplateDialog.@NotNull Builder builder) {
    builder
            .setTitle("New Robot Framework File")
            .addKind("Robot Framework Test Case File",
                    RobotFrameworkIcons.ICON_MAIN,
                    "RobotFrameworkTestCasesFile")
            .addKind("Robot Framework Keywords Definition File",
                    RobotFrameworkIcons.ICON_MAIN,
                    "RobotFrameworkKeywordsDefinitionFile");
  }

  /**
   * @param directory
   * @param newName
   * @param templateName
   * @return
   */
  @Override
  protected @NlsContexts.Command String getActionName(PsiDirectory directory,
                                                      @NotNull String newName,
                                                      String templateName) {
    return String.format("Create Robot file %s", newName);
  }
}
