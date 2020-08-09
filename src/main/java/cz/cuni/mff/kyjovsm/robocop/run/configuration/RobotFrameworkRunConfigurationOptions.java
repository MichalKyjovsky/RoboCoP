package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

/**
 *
 */
public class RobotFrameworkRunConfigurationOptions extends RunConfigurationOptions {
  /**
   *
   */
  private final StoredProperty<String> myScriptName = string("").provideDelegate(this, "scriptName");
  /**
   *
   */
  private final StoredProperty<String> testParams = string("").provideDelegate(this, "testParams");
  /**
   *
   */
  private final StoredProperty<String> externalListener = string("").provideDelegate(this, "externalListener");
  /**
   *
   */
  private final StoredProperty<Boolean> dryRunModeCheckBox = property(false).provideDelegate(this, "dryRunMode");
  /**
   *
   */
  private final StoredProperty<Boolean> addListenerCheckBox = property(false).provideDelegate(this, "addListener");

  /**
   * @return
   */
  public String getScriptName() {
    return myScriptName.getValue(this);
  }

  /**
   * @param scriptName
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
