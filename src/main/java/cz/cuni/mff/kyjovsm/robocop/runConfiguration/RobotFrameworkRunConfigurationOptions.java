package cz.cuni.mff.kyjovsm.robocop.runConfiguration;

import com.intellij.execution.configurations.RunConfigurationOptions;
import com.intellij.openapi.components.StoredProperty;

public class RobotFrameworkRunConfigurationOptions extends RunConfigurationOptions {
  private final StoredProperty<String> myScriptName = string("").provideDelegate(this, "scriptName");
  private final StoredProperty<String> testParams = string("").provideDelegate(this, "testParams");
  private final StoredProperty<String> externalListener = string("").provideDelegate(this, "externalListener");
  private final StoredProperty<Boolean> dryRunModeCheckBox = property(false).provideDelegate(this, "dryRunMode");
  private final StoredProperty<Boolean> addListenerCheckBox = property(false).provideDelegate(this, "addListener");

  public String getScriptName() {
    return myScriptName.getValue(this);
  }

  public void setScriptName(String scriptName) {
    myScriptName.setValue(this, scriptName);
  }

  public void setTestParams(String params) {
    testParams.setValue(this, params);
  }

  public String getTestParams() {
    return testParams.getValue(this);
  }

  public String getExternalListener() {
    return externalListener.getValue(this);
  }

  public void setExternalListener(String listeners) {
    externalListener.setValue(this, listeners);
  }

  public void setDryRunModeCheckBox(boolean dryRunEnabled) {
    dryRunModeCheckBox.setValue(this, dryRunEnabled);
  }

  public boolean getDryRunModeCheckBox() {
    return dryRunModeCheckBox.getValue(this);
  }

  public void setAddListenerCheckBox(boolean listenerIsAdded) {
    addListenerCheckBox.setValue(this, listenerIsAdded);
  }

  public boolean getAddListenerCheckBox() {
    return addListenerCheckBox.getValue(this);
  }
}
