package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessHandlerFactory;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ProjectRootManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;


/**
 * A class providing methods which are invoked once the
 * configuration is in the Run state, i.e. when the user
 * runs the configuration and changes are visible in the
 * IDE.
 */
public class RobotFrameworkRunConfiguration extends RunConfigurationBase {

  private static String PROJECT_SDK = "";

  /**
   * @param project Current project.
   * @param factory ConfigurationFactory instance which instantiates configurations.
   * @param name    Name of the configuration.
   */
  protected RobotFrameworkRunConfiguration(@NotNull Project project, @Nullable ConfigurationFactory factory, @Nullable String name) {
    super(project, factory, name);
    PROJECT_SDK = ProjectRootManager.getInstance(project).getProjectSdk().getName();
  }

  @NotNull
  @Override
  protected RobotFrameworkRunConfigurationOptions getOptions() {
    return (RobotFrameworkRunConfigurationOptions) super.getOptions();
  }

  /**
   * @return Path to the executed script.
   */
  public String getScriptName() {
    return getOptions().getScriptName();
  }

  /**
   * @return Parameters passed to the robot invocation.
   */
  public String getExecutionParameters() {
    return getOptions().getTestParams();
  }

  /**
   * @param parameters Parameters to be set as an options to robot.
   */
  public void setExecutionParameters(String parameters) {
    getOptions().setTestParams(parameters);
  }

  /**
   * @return External listener to be invoced in parallel with test execution
   * and its parameters.
   */
  public String getExternalListener() {
    return getOptions().getExternalListener();
  }

  /**
   * @param listeners An option to robot execution which adds external listener
   *                  program including its arguments.
   */
  public void setExternalListener(String listeners) {
    getOptions().setExternalListener(listeners);
  }

  /**
   * @return Boolean variable whether the execution will be taken
   * in dry-run mode, hence just the configuration check or the
   * proper execution.
   */
  public boolean getDryRunMode() {
    return getOptions().getDryRunModeCheckBox();
  }

  /**
   * @param dryRunIsEnabled Boolean value intended to set the dry-run mode.
   */
  public void setDryRunMode(boolean dryRunIsEnabled) {
    getOptions().setDryRunModeCheckBox(dryRunIsEnabled);
  }

  /**
   * @return Returns True if the external listener input field should be enabled,
   * else False.
   */
  public boolean getExternalListenersCheckBox() {
    return getOptions().getAddListenerCheckBox();
  }

  /**
   * @param externalListenersAreAdded Boolean value determining whether the
   *                                  input field for external listener should
   *                                  be enabled (True), or do not.
   */
  public void setExternalListenersCheckBox(boolean externalListenersAreAdded) {
    getOptions().setAddListenerCheckBox(externalListenersAreAdded);
  }

  /**
   * @param scriptName Full path to the script intended for the execution.
   */
  public void setScriptName(String scriptName) {
    getOptions().setScriptName(scriptName);
  }

  /**
   * @return Instance of the Configuration Editor enabling user to
   * setup the configuration via GUI.
   */
  @Override
  public @NotNull SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
    return new RobotFrameworkSettingsEditor();
  }

  @Override
  public void checkConfiguration() throws RuntimeConfigurationException {
    // TODO: Find usage and implement if needed.
  }

  /**
   * @param executor    Interface describing a specific way of executing
   *                    any possible run configuration.
   * @param environment Aggregates all the settings required to execute the process,
   *                    as well as the selected ProgramRunner.
   * @return
   */
  @Override
  public @Nullable RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) {
    return new CommandLineState(environment) {
      /**
       * @return Executed process and output in CMD.
       * @throws ExecutionException if path not specified.
       */
      @Override
      protected @NotNull ProcessHandler startProcess() throws ExecutionException {

        GeneralCommandLine commandLine = new GeneralCommandLine()
                .withExePath((ProjectRootManager.getInstance(getEnvironment()
                                        .getProject())
                                        .getProjectSdk())
                                .getHomePath());
        commandLine.addParameter("-m");
        commandLine.addParameter("robot");

        String[] processedArgs = new RobotFrameworkArgumentProcessor().prepareArguments(getOptions().getTestParams(),
                getOptions().getScriptName(),
                getOptions().getAddListenerCheckBox(),
                getOptions().getDryRunModeCheckBox(),
                getOptions().getExternalListener());

        for (String arg : processedArgs) {
          commandLine.addParameter(arg);
        }

        commandLine.addParameter(getOptions().getScriptName());
        OSProcessHandler processHandler = ProcessHandlerFactory.getInstance().createColoredProcessHandler(commandLine);
        ProcessTerminatedListener.attach(processHandler);
        return processHandler;
      }
    };
  }
}
