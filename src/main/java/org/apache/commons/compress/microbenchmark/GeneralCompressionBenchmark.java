/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.commons.compress.microbenchmark;

import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

public class GeneralCompressionBenchmark {
    @State(Scope.Benchmark)
    public static class CompressionState {
        public CompressorStreamFactory factory;
        @Param({"./src/test/resources/bla.tar", "./src/test/resources/COMPRESS-592.7z"})
        public String filePath;

        //@Param({"1024", "4096", "8192"})
        @Param({"8192"})
        public int bufferSize;

        @Param({"gz", "bzip2", "xz", "lzma", "deflate", "snappy-framed", "lz4-block", "lz4-framed"})
        public String format;

        public byte[] dataToCompress;

        @Setup(Level.Trial)
        public void doSetup() throws IOException {
            factory = new CompressorStreamFactory();
            dataToCompress = Files.readAllBytes(new File(filePath).toPath());
        }

        @TearDown(Level.Trial)
        public void doTearDown() throws IOException {
            // do nothing
        }
    }

    /*** For more information, please consult: https://commons.apache.org/proper/commons-compress/examples.html ***/
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 0)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public byte[] compressFileBench(CompressionState cs) throws IOException, CompressorException {
        byte[] result;

        try(ByteArrayInputStream in = new ByteArrayInputStream(cs.dataToCompress);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            CompressorOutputStream gzOut = cs.factory.createCompressorOutputStream(cs.format, out)) {
            final byte[] buffer = new byte[cs.bufferSize];
            int numBytes = 0;

            while (-1 != (numBytes = in.read(buffer))) {
                gzOut.write(buffer, 0, numBytes);
            }
            result = out.toByteArray();
        }
        return result;
    }
}
