package cz.cuni.mff.kyjovsm.robocop.runConfiguration;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextBrowseFolderListener;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RobotFrameworkSettingsEditor extends SettingsEditor<RobotFrameworkRunConfiguration> {
  private JPanel myPanel;
  private static TextFieldWithBrowseButton textFieldWithBrowseButton = new TextFieldWithBrowseButton();
  private LabeledComponent<TextFieldWithBrowseButton> myScriptName;
  private JLabel paramsLabel;
  private JTextField testParams;

  @Override
  protected void resetEditorFrom(RobotFrameworkRunConfiguration robotFrameworkRunConfiguration) {
    myScriptName.getComponent().setText(robotFrameworkRunConfiguration.getScriptName());
  }

  @Override
  protected void applyEditorTo(@NotNull RobotFrameworkRunConfiguration robotFrameworkRunConfiguration) {
    robotFrameworkRunConfiguration.setScriptName(myScriptName.getComponent().getText());
  }

  @NotNull
  @Override
  protected JComponent createEditor() {
    return myPanel;
  }

  private void createUIComponents() {
    myScriptName = new LabeledComponent<>();
//    testParams = new JTextField();
    FileChooserDescriptor descriptor = new FileChooserDescriptor(
            true,
            false,
            false,
            false,
            false,
            false).withShowHiddenFiles(false);
    descriptor.withFileFilter(virtualFile -> {
      if (virtualFile.getExtension() == null) {
        return false;
      }
      return virtualFile.getExtension().toLowerCase().equals("robot");
    });

    textFieldWithBrowseButton.addBrowseFolderListener(new TextBrowseFolderListener(descriptor));
    myScriptName.setComponent(textFieldWithBrowseButton);
  }
}
