/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DefaultFileManager implements FileManager {
    private final File directory;

    public DefaultFileManager(final File rootDirectory) {
        directory = rootDirectory;
    }

    @Override
    public File createDirectory(final String directoryPath) {
        final File dir = new File(directory, directoryPath);
        if (!dir.exists()) {
            if (!dir.mkdirs()) {
                return null;
            }
        }
        return dir;
    }

    @Override
    public File getDirectory(final String directoryPath) {
        final File dir = new File(directory, directoryPath);
        return dir;
    }

    @Override
    public Set<File> listFilesInDirectory(final String directoryPath) {
        final File dir = new File(directory, directoryPath);
        return listFilesInDirectory(dir);
    }

    @Override
    public Set<File> listFilesInDirectory(final File directory) {
        final Set<File> filesSet = new HashSet<File>();
        if (directory.exists()) {
            final File[] files = directory.listFiles();
            for (File file : files) {
                filesSet.add(file);
            }
        }
        return Collections.unmodifiableSet(filesSet);
    }

    @Override
    public File createFile(final String filepath) throws IOException {
        final File file = new File(directory, filepath);
        return createFile(file);
    }

    @Override
    public File createFile(final File file) throws IOException {
        if (!file.exists()) {
            if (!file.createNewFile()) {
                return null;
            }
        }
        return file;
    }

    @Override
    public boolean deleteFile(final String filepath) {
        final File file = new File(directory, filepath);
        return deleteFile(file);
    }

    @Override
    public boolean deleteFile(final File file) {
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }

    @Override
    public InputStream newInputStream(final String filepath) throws FileNotFoundException {
        final File file = new File(directory, filepath);
        return newInputStream(file);
    }

    @Override
    public InputStream newInputStream(final File file) throws FileNotFoundException {
        final InputStream stream = new FileInputStream(file);
        return stream;
    }

    @Override
    public OutputStream newOutputStream(final String filepath, final boolean append)
            throws FileNotFoundException {
        final File file = new File(directory, filepath);
        return newOutputStream(file, append);
    }

    @Override
    public OutputStream newOutputStream(final File file, final boolean append)
            throws FileNotFoundException {
        final OutputStream stream = new FileOutputStream(file, append);
        return stream;
    }
}
