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

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.openjdk.jmh.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SevenZFileBenchmark {

    @State(Scope.Benchmark)
    public static class FileState {

        @Param({
                "./src/test/resources/COMPRESS-592.7z",
                "./src/test/resources/COMPRESS-592_half.7z",
                "./src/test/resources/COMPRESS-348.7z"
        })
        String path;
        SevenZFile file;

        public FileState() {
            //empty constructor
        }

        @Setup(Level.Trial)
        public void doSetup() throws IOException {
            file = new SevenZFile(new File(path));
        }

        @TearDown(Level.Trial)
        public void doTearDown() throws IOException {
            // System.out.println("*** CLOSING THE FILE ***");
            file.close();
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Fork(value = 5, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public SevenZFile SevenZipFileBaselineBench(FileState fs) {
        return fs.file;
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Fork(value = 5, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void readSevenZipFileBench(FileState fs) throws IOException {
        // The file is already open...
        SevenZFile sevenZFile = fs.file;

        // ...you just have to read all the entries
        SevenZArchiveEntry entry = sevenZFile.getNextEntry();
        while (entry != null) {
            if (entry.hasStream()) {
                final byte[] content = new byte[(int) entry.getSize()];
                sevenZFile.read(content);
            }
            entry = sevenZFile.getNextEntry();
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.SingleShotTime)
    @Fork(value = 5, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void readSevenZipFileWithGetFileBench(FileState fs) throws IOException {
        // You have to open the file AND read the entries (obviously this should take more time)
        try (SevenZFile sevenZFile = new SevenZFile(new File(fs.path))) {
            SevenZArchiveEntry entry = sevenZFile.getNextEntry();
            while (entry != null) {
                if (entry.hasStream()) {
                    final byte[] content = new byte[(int) entry.getSize()];
                    sevenZFile.read(content);
                }
                entry = sevenZFile.getNextEntry();
            }
        }
    }
}
