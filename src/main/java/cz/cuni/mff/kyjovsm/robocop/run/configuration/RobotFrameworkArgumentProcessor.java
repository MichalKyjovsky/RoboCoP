package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import java.nio.file.Path;

/**
 * A class providing a functionalities of processing
 * and handling the configuration defined by user
 * for RobotFrameworkConfigurationType.
 */
public class RobotFrameworkArgumentProcessor {
  /**
   * @param rawArguments String variable containing unprocessed arguments.
   * @param scriptPath Path to the script intended for the execution.
   * @param listener Boolean value deciding whether the external listener needs to be processed.
   * @param dryRun Boolean value deciding whether the test is being executed in Dry Run mode.
   * @param externalListener String arguments containing the parameters for the external listener
   *                         program.
   * @return Processed and flatten arguments which can be redirected to the robot calling.
   */
  public String[] prepareArguments(String rawArguments, String scriptPath, boolean listener, boolean dryRun, String externalListener) {
    if (dryRun && !rawArguments.contains("--dryrun")) {
      rawArguments += " -dryrun ";
    }

    if (listener && externalListener.length() > 0) {
      rawArguments += " --listener " + externalListener;
    }

    if (!rawArguments.contains("--outputdir")) {
      rawArguments += " --outputdir " + resolveParentDir(scriptPath);
    }
    return rawArguments.split(" ");
  }

  /**
   * Method for resolving the parent directory of the executed script.
   * @param scriptPath Path to the executed script.
   * @return Absolute path to the parent directory of the executed script.
   */
  private String resolveParentDir(String scriptPath) {
    return Path.of(scriptPath).normalize().getParent().toString();
  }
}
