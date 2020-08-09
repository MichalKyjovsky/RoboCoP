package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;

import cz.cuni.mff.kyjovsm.robocop.icons.RobotFrameworkIcons;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

/**
 *
 */
public class RobotFrameworkConfigurationType implements ConfigurationType {
  /**
   * @return
   */
  @Override
  public @NotNull String getDisplayName() {
    return "Robot Framework TC";
  }

  /**
   * @return
   */
  @Override
  public String getConfigurationTypeDescription() {
    return "Creates configuration for execution of robot framework test suite.";
  }

  /**
   * @return
   */
  @Override
  public Icon getIcon() {
    return RobotFrameworkIcons.ICON_MAIN;
  }

  /**
   * @return
   */
  @Override
  public @NotNull String getId() {
    return "RF_CONFIGURATION";
  }

  /**
   * @return
   */
  @Override
  public ConfigurationFactory[] getConfigurationFactories() {
    return new ConfigurationFactory[]{new RobotFrameworkConfigurationFactory(this)};
  }
}
