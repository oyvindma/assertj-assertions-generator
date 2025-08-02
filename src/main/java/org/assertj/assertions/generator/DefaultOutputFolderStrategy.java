package org.assertj.assertions.generator;

import java.io.File;
import java.nio.file.Paths;

public class DefaultOutputFolderStrategy {

    // assertions classes are generated in their package directory starting from targetBaseDirectory.
    // ex : com.nba.Player -> targetBaseDirectory/com/nba/PlayerAssert.java
    private File targetBaseDirectory = Paths.get(".").toFile();

    /**
     * Returns the target directory path where the assertions file for given classDescription will be created.
     *
     * @param packageName package name
     * @return the target directory path corresponding to the given package.
     */
    public String getDirectoryPathCorrespondingToPackage(final String packageName) {
        return targetBaseDirectory + File.separator + packageName.replace('.', File.separatorChar);
    }

    public void setTargetBaseDirectory(File targetBaseDirectory) {
        this.targetBaseDirectory = targetBaseDirectory;
    }

}
