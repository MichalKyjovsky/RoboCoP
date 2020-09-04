package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;

import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

/**
 * A class providing basic functionalities when user hit the "Add New Configuration"
 * button in the configuration setup dialog.
 */
public class RobotFrameworkConfigurationType implements ConfigurationType {
  /**
   * A getter method returning the name displayed for this configuration type.
   * @return Name displayed, when listing through available configuration types.
   */
  @Override
  public @NotNull String getDisplayName() {
    return "Robot Framework Test Suite";
  }

  /**
   * A getter method returning the description displayed for this configuration type.
   * @return The short description when this configuration type is used.
   */
  @Override
  public String getConfigurationTypeDescription() {
    return "Creates configuration for execution of robot framework test suite.";
  }

  /**
   * A getter method returning the Icon dedicate to Robot Framework language.
   * @return An instance of the loaded method describing the Robot Framework
   * language.
   */
  @Override
  public Icon getIcon() {
    return RobotFrameworkIcons.ICON_MAIN;
  }

  /**
   * A getter method returning the unique ID of this configuration type.
   * @return Unique ID describing this configuration type.
   */
  @Override
  public @NotNull String getId() {
    return "RF_CONFIGURATION";
  }

  /**
   * A getter method returning the Configuration Factory instance.
   * @return Configuration factory instance.
   */
  @Override
  public ConfigurationFactory[] getConfigurationFactories() {
    return new ConfigurationFactory[]{new RobotFrameworkConfigurationFactory(this)};
  }
}
