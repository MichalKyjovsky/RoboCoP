package cz.cuni.mff.kyjovsm.robocop.run.configuration;

import java.nio.file.Path;

public class RobotFrameworkArgumentProcessor {
  public String[] prepareArguments(String rawArguments, String scriptPath, boolean listener, boolean dryrun, String externalListener) {
    if (dryrun && !rawArguments.contains("--dryrun")) {
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

  private String resolveParentDir(String scriptPath) {
    return Path.of(scriptPath).normalize().getParent().toString();
  }
}
