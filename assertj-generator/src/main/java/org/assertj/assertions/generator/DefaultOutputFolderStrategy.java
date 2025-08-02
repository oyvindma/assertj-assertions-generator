/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2025 the original author or authors.
 */
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
