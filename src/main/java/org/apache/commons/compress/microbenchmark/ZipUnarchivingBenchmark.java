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

import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.utils.IOUtils;
import org.openjdk.jmh.annotations.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

public class ZipUnarchivingBenchmark {
    @State(Scope.Benchmark)
    public static class UnarchiveState {
        public ArchiveStreamFactory factory = new ArchiveStreamFactory();
        public File toRead;
        @Param({"src/test/resources/moby-imploded.zip"})
        public String filePath;

        @Setup(Level.Trial)
        public void doSetup() {
            toRead = new File(filePath);
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
    public byte[] unarchiveFileBench(UnarchiveState us) throws IOException {
        byte[] result;

        try(ZipFile zipFile = new ZipFile(us.toRead);
            ByteArrayOutputStream bout = new ByteArrayOutputStream()) {
            Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
            ZipArchiveEntry entry;
            while(entries.hasMoreElements()) {
                entry = entries.nextElement();
                InputStream in = zipFile.getInputStream(entry);
                IOUtils.copy(in, bout);
            }
            result = bout.toByteArray();
        }
        return result;
    }
}
