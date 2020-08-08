package cz.cuni.mff.kyjovsm.robocop.runConfiguration;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.BaseState;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RobotFrameworkConfigurationFactory extends ConfigurationFactory {
  public static final String FACTORY_NAME = "Robot Framework Configuration Factory";

  public RobotFrameworkConfigurationFactory(RobotFrameworkConfigurationType robotFrameworkConfigurationType) {
    super(robotFrameworkConfigurationType);
  }

  @Override
  public @NotNull RunConfiguration createTemplateConfiguration(@NotNull Project project) {
    return new RobotFrameworkRunConfiguration(project, this,"Robot Framework");
  }

  @Override
  public @NotNull String getName() {
    return FACTORY_NAME;
  }

  @Override
  public @Nullable Class<? extends BaseState> getOptionsClass() {
    return RobotFrameworkRunConfigurationOptions.class;
  }
}
