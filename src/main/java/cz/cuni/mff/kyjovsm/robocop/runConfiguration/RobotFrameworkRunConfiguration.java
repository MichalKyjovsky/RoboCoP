package cz.cuni.mff.kyjovsm.robocop.runConfiguration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RobotFrameworkRunConfiguration implements RunConfiguration {
  public RobotFrameworkRunConfiguration(@NotNull Project project, RobotFrameworkConfigurationFactory robotFrameworkConfigurationFactory, String robot_framework) {
  }

  @Override
  public @Nullable ConfigurationFactory getFactory() {
    return null;
  }

  @Override
  public void setName(String name) {

  }

  @Override
  public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return null;
  }

  @Override
  public Project getProject() {
    return null;
  }

  @Override
  public RunConfiguration clone() {
    return null;
  }

  @Override
  public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
    return null;
  }

  @Override
  public @NotNull String getName() {
    return null;
  }

  @Override
  public @Nullable Icon getIcon() {
    return null;
  }
}
