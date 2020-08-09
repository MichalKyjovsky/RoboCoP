package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Purpose of this class is to provide a registration of the ConfigurationFactory
 * which is based on ConfigurationType of the implemented language. This class
 * instantiates the particular configurations.
 */
public class RobotFrameworkConfigurationFactory extends ConfigurationFactory {
  /**
   * Static String variable (tag) storing the unique name of the Configuration Factory.
   */
  public static final String FACTORY_NAME = "Robot Framework Configuration Factory";

  /**
   * Public constructor method to instantiate the Configuration Type for Factory to
   * be able to run configuration instances.
   *
   * @param robotFrameworkConfigurationType instance required
   *                                        by the ConfigurationFactory constructor.
   */
  public RobotFrameworkConfigurationFactory(RobotFrameworkConfigurationType
                                                    robotFrameworkConfigurationType) {
    super(robotFrameworkConfigurationType);
  }

  /**
   * Creates a new run configuration with the specified name by cloning the specified template.
   *
   * @param project instance of the Project to which is configuration dedicated.
   * @return new instance of run configuration.
   */
  @Override
  public @NotNull RunConfiguration createTemplateConfiguration(@NotNull Project project) {
    return new RobotFrameworkRunConfiguration(project, this, "Robot Framework");
  }

  /**
   * Getter method for obtaining run configuration id.
   * @return Returns the id of the run configuration that is used for serialization.
   */
  @Override
  public @NotNull String getId() {
    return getName();
  }

  /**
   * Getter method for obtaining run configuration name created by the
   * Configuration Factory.
   * @return The name of the run configuration variant created by this factory.
   */
  @Override
  public @NotNull String getName() {
    return FACTORY_NAME;
  }

  /**
   * Getter method for obtaining Class<\?> instance of Robot Framework extension
   * of RunConfigurationOptions class.
   * @return Class implementing the Run Configuration options.
   */
  @Override
  public @Nullable Class<? extends BaseState> getOptionsClass() {
    return RobotFrameworkRunConfigurationOptions.class;
  }
}
