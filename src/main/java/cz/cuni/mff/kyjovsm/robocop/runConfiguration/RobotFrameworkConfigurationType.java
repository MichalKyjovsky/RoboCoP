package cz.cuni.mff.kyjovsm.robocop.runConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.icons.AllIcons;
import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RobotFrameworkConfigurationType implements ConfigurationType {
  @Override
  public @NotNull String getDisplayName() {
    return "Robot Framework Test Case.";
  }

  @Override
  public String getConfigurationTypeDescription() {
    return "Creates configuration for execution of Robot Framework Test Suite.";
  }

  @Override
  public Icon getIcon() {
    return RobotFrameworkIcons.FILE;
  }

  @Override
  public @NotNull String getId() {
    return "RF_CONFIGURATION";
  }

  @Override
  public ConfigurationFactory[] getConfigurationFactories() {
    return new ConfigurationFactory[]{new RobotFrameworkConfigurationFactory(this)};
  }
}
