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
   * A setter method for setting the parameters for test execution.
   * @param params Parameters for test execution. For all options
   *               please refer to: https://robotframework.org/robotframework/latest/RobotFrameworkUserGuide.html#all-command-line-options
   */
  public void setTestParams(String params) {
    testParams.setValue(this, params);
  }

  /**
   * A getter method for obtaining the user set test execution parameter.
   * @return User defined parameters intended for test execution.
   */
  public String getTestParams() {
    return testParams.getValue(this);
  }

  /**
   * A getter method for obtaining the user defined external listener options.
   * @return User defined parameters intended as an argument for --listener
   * option. This argument may be complicated and may have precise grammar
   * or rules to be followed or wildcard characters.
   */
  public String getExternalListener() {
    return externalListener.getValue(this);
  }

  /**
   * A setter method for setting up the external listener arguments.
   * @param listenersArguments A String variable storing arguments
   *                           dedicated for particular listener.
   */
  public void setExternalListener(String listenersArguments) {
    externalListener.setValue(this, listenersArguments);
  }

  /**
   * A setter method for setting check box value for either adding or removing
   * the dry run mode option of Robot Framework test execution.
   * @param dryRunEnabled A boolean variable setting the dry-run mode.
   */
  public void setDryRunModeCheckBox(boolean dryRunEnabled) {
    dryRunModeCheckBox.setValue(this, dryRunEnabled);
  }

  /**
   * A getter method for obtaining dry run mode setup.
   * @return Boolean value representing user choice of dry run mode.
   */
  public boolean getDryRunModeCheckBox() {
    return dryRunModeCheckBox.getValue(this);
  }

  /**
   * A setter method for setting check box value for either adding or removing
   * the add external listener option of Robot Framework test execution.
   * @param listenerIsAdded A boolean variable setting the "Add external listener" option.
   *                        If the variable is set to True value, the TextField instance for
   *                        setting the external listener arguments will be ENABLED.
   */
  public void setAddListenerCheckBox(boolean listenerIsAdded) {
    addListenerCheckBox.setValue(this, listenerIsAdded);
  }

  /**
   * A getter method for obtaining dry run mode setup.
   * @return Boolean value representing user choice of
   * "Add external listener option.".
   */
  public boolean getAddListenerCheckBox() {
    return addListenerCheckBox.getValue(this);
  }
}
