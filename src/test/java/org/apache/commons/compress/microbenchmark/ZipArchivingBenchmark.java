/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.microbenchmark;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.utils.IOUtils;
import org.openjdk.jmh.annotations.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class ZipArchivingBenchmark {
    @State(Scope.Benchmark)
    public static class ArchiveState {
        public ArchiveStreamFactory factory = new ArchiveStreamFactory();
        public Collection<File> filesToArchive;
        @Param({"COMPRESS-348.7z", "COMPRESS-592.7z"})
        public String filePath;
        @Param({"1", "10", "100", "1000"})
        public int numOfFiles;

        @Setup(Level.Trial)
        public void doSetup() {
            File myFile = new File(filePath);
            filesToArchive = new LinkedList<>();
            for(int i = 0; i < numOfFiles; i++) {
                filesToArchive.add(myFile);
            }
        }

        @TearDown(Level.Trial)
        public void doTearDown() {
            // do nothing
        }
    }

    /*** For more information, please consult: https://commons.apache.org/proper/commons-compress/examples.html ***/
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public byte[] archiveFileBench(ArchiveState as) throws IOException, ArchiveException {
        ArchiveStreamFactory factory = as.factory;
        Collection<File> filesToArchive = as.filesToArchive;

        byte[] result;
        int num = 0;

        try (ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
             ArchiveOutputStream zipOutStream = factory.createArchiveOutputStream("zip", byteStream)) {
            for (File f : filesToArchive) {
                ArchiveEntry entry = zipOutStream.createArchiveEntry(f, f.getName() + num);
                zipOutStream.putArchiveEntry(entry);
                if (f.isFile()) {
                    try (InputStream in = Files.newInputStream(f.toPath())) {
                        IOUtils.copy(in, zipOutStream);
                    }
                }
                zipOutStream.closeArchiveEntry();
                num++;
            }

            zipOutStream.finish();
            result = byteStream.toByteArray();

            // Not needed when using try-with-resources. Despite that, I would still close it...
            // zipOutStream.close();
        }
        return result;
    }

}
