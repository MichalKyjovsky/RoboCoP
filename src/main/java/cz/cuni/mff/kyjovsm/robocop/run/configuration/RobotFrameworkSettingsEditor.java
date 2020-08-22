package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.TextBrowseFolderListener;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.ui.components.fields.ExpandableTextField;
import org.jetbrains.annotations.NotNull;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.event.ItemEvent;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 */
public class RobotFrameworkSettingsEditor extends SettingsEditor<RobotFrameworkRunConfiguration> {

  /**
   *
   */
  private static final Logger logger = Logger.getLogger(RobotFrameworkSettingsEditor.class.getName());
  /**
   *
   */
  private JPanel myPanel;
  /**
   *
   */
  private static final TextFieldWithBrowseButton textFieldWithBrowseButton = new TextFieldWithBrowseButton();
  /**
   *
   */
  private LabeledComponent<TextFieldWithBrowseButton> myScriptName;
  /**
   *
   */
  private LabeledComponent<ExpandableTextField> testParams;
  /**
   *
   */
  private LabeledComponent<ExpandableTextField> externalListener;
  /**
   *
   */
  private JCheckBox dryRunModeCheckBox;
  /**
   *
   */
  private JCheckBox addListenerCheckBox;
  /**
   *
   */
  private static boolean dryRunMode = false;


  /**
   * @return
   */
  public static boolean isDryRunMode() {
    return dryRunMode;
  }

  /**
   * @param isEnabled
   */
  private static void setDryRunMode(boolean isEnabled) {
    dryRunMode = isEnabled;
  }

  /**
   * @param robotFrameworkRunConfiguration
   */
  @Override
  protected void resetEditorFrom(RobotFrameworkRunConfiguration robotFrameworkRunConfiguration) {
    myScriptName.getComponent().setText(robotFrameworkRunConfiguration.getScriptName());
    testParams.getComponent().setText(robotFrameworkRunConfiguration.getExecutionParameters());
    externalListener.getComponent().setText(robotFrameworkRunConfiguration.getExternalListener());
    dryRunModeCheckBox.setSelected(robotFrameworkRunConfiguration.getDryRunMode());
    addListenerCheckBox.setSelected(robotFrameworkRunConfiguration.getExternalListenersCheckBox());
  }

  /**
   * @param robotFrameworkRunConfiguration
   */
  @Override
  protected void applyEditorTo(@NotNull RobotFrameworkRunConfiguration robotFrameworkRunConfiguration) {
    robotFrameworkRunConfiguration.setScriptName(myScriptName.getComponent().getText());
    robotFrameworkRunConfiguration.setExecutionParameters(testParams.getComponent().getText());
    robotFrameworkRunConfiguration.setExternalListener(externalListener.getComponent().getText());
    robotFrameworkRunConfiguration.setDryRunMode(dryRunModeCheckBox.isSelected());
    robotFrameworkRunConfiguration.setExternalListenersCheckBox(addListenerCheckBox.isSelected());
  }

  /**
   * @return
   */
  @NotNull
  @Override
  protected JComponent createEditor() {
    return this.myPanel;
  }

  /**
   *
   */
  private void setDryRunBinding() {
    this.dryRunModeCheckBox.addItemListener(e -> setDryRunMode(e.getStateChange() == ItemEvent.SELECTED));
  }

  /**
   *
   */
  private void setExternalListenerBinding() {
    this.addListenerCheckBox.addItemListener(e -> this.externalListener.setEnabled(e.getStateChange() == ItemEvent.SELECTED));
  }

  /**
   *
   */
  private void setUpExternalListener() {
    this.externalListener.setComponent(new ExpandableTextField());
    this.externalListener.setEnabled(false);
  }

  /**
   *
   */
  private void setUpTestParams() {
    this.testParams.setComponent(new ExpandableTextField());
  }

  /**
   *
   */
  private void createUIComponents() {
    this.myScriptName = new LabeledComponent<>();
    this.testParams = new LabeledComponent<>();
    this.dryRunModeCheckBox = new JCheckBox();
    this.addListenerCheckBox = new JCheckBox();
    this.dryRunModeCheckBox.addActionListener(e -> logger.log(Level.INFO, String.format("Dry run mode is enabled: %b.", dryRunMode)));
    this.externalListener = new LabeledComponent<>();

    setUpExternalListener();
    setUpTestParams();
    setDryRunBinding();
    setExternalListenerBinding();


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
    this.myScriptName.setComponent(textFieldWithBrowseButton);
  }
}
