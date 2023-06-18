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

import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class GzipDecompressionBenchmark {

    @State(Scope.Benchmark)
    public static class DecompressionState {
        @Param({"./src/test/resources/lorem-ipsum.txt.gz"})
        public String filePath;

        public byte[] dataToDecompress;

        @Param({"1024", "4096", "8192"})
        public int bufferSize;

        @Setup(Level.Trial)
        public void doSetup() throws IOException {
            dataToDecompress = Files.readAllBytes(new File(filePath).toPath());
        }

        @TearDown(Level.Trial)
        public void doTearDown() throws IOException {
            // do nothing
        }
    }

    /*** For more information, please consult: https://commons.apache.org/proper/commons-compress/examples.html ***/
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public byte[] uncompressFileBench(DecompressionState ds) throws IOException {
        byte[] result;

        try(ByteArrayInputStream in = new ByteArrayInputStream(ds.dataToDecompress);
            GzipCompressorInputStream gzIn = new GzipCompressorInputStream(in);
            ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            final byte[] buffer = new byte[ds.bufferSize];
            int numBytes = 0;

            while (-1 != (numBytes = gzIn.read(buffer))) {
                out.write(buffer, 0, numBytes);
            }
            result = out.toByteArray();
        }
        return result;
    }
}
