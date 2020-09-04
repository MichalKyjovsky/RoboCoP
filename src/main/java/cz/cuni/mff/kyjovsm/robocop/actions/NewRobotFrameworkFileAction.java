package cz.cuni.mff.kyjovsm.robocop.actions;

import com.intellij.ide.actions.CreateFileFromTemplateAction;
import com.intellij.ide.actions.CreateFileFromTemplateDialog;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;

/**
 * Purpose of this class is to secure the Action event invoked by IDE
 * for creation of the new file with .robot extension.
 */
public class NewRobotFrameworkFileAction extends CreateFileFromTemplateAction {


  /**
   * A reimplementation of parameterless constructor method providing
   * the basic initialization of the action within the IDE.
   */
  public NewRobotFrameworkFileAction() {
    super("New Robot File",
            "Creates either a new Robot Framework "
                    + "Test Suite file or Keywords definition file.",
            RobotFrameworkIcons.ICON_MAIN);
  }

  /**
   * A reimplementation of the constructor method rewriting the textual
   * description and icon representation.
   * @param text Short text describing the action.
   * @param description Further description of the action.
   * @param icon Icon under which the action is visualized.
   */
  public NewRobotFrameworkFileAction(String text, String description, Icon icon) {
    super(text, description, icon);
  }

  /**
   * An implementation of the method for action dialog invocation when action
   * is selected.
   * @param project Project to which the action is dedicated.
   * @param directory Virtual directory of the current project.
   * @param builder CreateFileFromTemplateDialog instance builder.
   */
  @Override
  protected void buildDialog(@NotNull Project project,
                             @NotNull PsiDirectory directory,
                             CreateFileFromTemplateDialog.@NotNull Builder builder) {
    builder
            .setTitle("New Robot Framework File")
            .addKind("Robot framework test case file",
                    RobotFrameworkIcons.ICON_MAIN,
                    "RobotFrameworkTestCasesFile")
            .addKind("Robot framework keywords definition file",
                    RobotFrameworkIcons.ICON_MAIN,
                    "RobotFrameworkKeywordsDefinitionFile");
  }

  /**
   * A getter method for getting the action's name.
   * @param directory Virtual directory of the current project.
   * @param newName Name given to the creating file.
   * @param templateName Name of the template used when action
   *                     is triggered. Templates are in common
   *                     directory resource/fileTemplates/internal.
   * @return Action name, showed when searched in the IDE for an actions.
   */
  @Override
  protected String getActionName(PsiDirectory directory,
                                 @NotNull String newName,
                                 String templateName) {
    return String.format("Create Robot file %s", newName);
  }
}
