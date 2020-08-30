package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

/**
 * Class providing methods for handling and soring the user settings from
 * configuration dialog.
 */
public class RobotFrameworkRunConfigurationOptions extends RunConfigurationOptions {
  /**
   * A variable storing path to the .robot script for which the configuration is dedicated.
   */
  private final StoredProperty<String> myScriptName = string("").provideDelegate(this, "scriptName");
  /**
   * A variable storing parameters dedicated for test execution, i.e. options when "robot" is called .
   */
  private final StoredProperty<String> testParams = string("").provideDelegate(this, "testParams");
  /**
   * A variable storing arguments when external listener is setup.
   */
  private final StoredProperty<String> externalListener = string("").provideDelegate(this, "externalListener");
  /**
   * A variable storing information about the check box selection dedicated for dry run mode
   * test execution.
   */
  private final StoredProperty<Boolean> dryRunModeCheckBox = property(false).provideDelegate(this, "dryRunMode");
  /**
   * A variable storing information about the check box selection dedicated for enabling external
   * listeners parameters section.
   */
  private final StoredProperty<Boolean> addListenerCheckBox = property(false).provideDelegate(this, "addListener");

  /**
   * A getter method for obtaining a path to the executed script.
   * @return String variable storing the path to the script intended for execution.
   */
  public String getScriptName() {
    return myScriptName.getValue(this);
  }

  /**
   * A setter method for setting a path to the executed script.
   * @param scriptName Path to the script to be executed.
   */
  public void setScriptName(String scriptName) {
    myScriptName.setValue(this, scriptName);
  }

  /**
   * @param params
   */
  public void setTestParams(String params) {
    testParams.setValue(this, params);
  }

  /**
   * @return
   */
  public String getTestParams() {
    return testParams.getValue(this);
  }

  /**
   * @return
   */
  public String getExternalListener() {
    return externalListener.getValue(this);
  }

  /**
   * @param listeners
   */
  public void setExternalListener(String listeners) {
    externalListener.setValue(this, listeners);
  }

  /**
   * @param dryRunEnabled
   */
  public void setDryRunModeCheckBox(boolean dryRunEnabled) {
    dryRunModeCheckBox.setValue(this, dryRunEnabled);
  }

  /**
   * @return
   */
  public boolean getDryRunModeCheckBox() {
    return dryRunModeCheckBox.getValue(this);
  }

  /**
   * @param listenerIsAdded
   */
  public void setAddListenerCheckBox(boolean listenerIsAdded) {
    addListenerCheckBox.setValue(this, listenerIsAdded);
  }

  /**
   * @return
   */
  public boolean getAddListenerCheckBox() {
    return addListenerCheckBox.getValue(this);
  }
}
