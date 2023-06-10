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

import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class GzipCompressionBenchmark {

    @State(Scope.Benchmark)
    public static class CompressionState {
        @Param({"./src/test/resources/bla.tar", "./src/test/resources/COMPRESS-592.7z"})
        public String filePath;

        public byte[] dataToCompress;

        @Param({"1024", "4096", "8192"})
        public int bufferSize;

        @Setup(Level.Trial)
        public void doSetup() throws IOException {
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
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public byte[] compressFileWithBufferBench(CompressionState cs) throws IOException {
        byte[] result;

        // In this case, we are actually reading the file from disk with the help of a buffer (look at the while loop
        // down below). This slows down A LOT the method (compare it with compressFileWithByteArrayOnlyBench).
        // However, we're not considering the fact that the compressed result should also be written on disk, and that
        // would make the method even slower (furthermore, it would destroy my SSD :P ).
        // If you want to write the result on disk, use
        //
        // OutputStream out = Files.newOutputStream(Paths.get("<DESTINATION-OF-RESULT>"))
        //
        // instead of ByteArrayOutputStream.
        try(InputStream in = Files.newInputStream(Paths.get(cs.filePath));
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();    // <--------
            BufferedOutputStream bufferOut = new BufferedOutputStream(byteOut);
            GzipCompressorOutputStream gzOut = new GzipCompressorOutputStream(bufferOut)) {

            final byte[] buffer = new byte[cs.bufferSize];
            int numBytes = 0;

            while (-1 != (numBytes = in.read(buffer))) {
                gzOut.write(buffer, 0, numBytes);
            }

            result = byteOut.toByteArray();
        }

        return result;
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Fork(value = 1, warmups = 1)
    @OutputTimeUnit(TimeUnit.SECONDS)
    public byte[] compressFileWithByteArrayOnlyBench(CompressionState cs) throws IOException {
        byte[] result;

        // In this case, we just need to compress the file. No reads or writes are required, we already have the bytes
        // of the file (look at the doSetup method of CompressionState) and we don't want to write the result on our
        // beloved disk.
        //
        // Maybe this is the best way to "stress" the compression code.
        try(ByteArrayInputStream in = new ByteArrayInputStream(cs.dataToCompress);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            GzipCompressorOutputStream gzOut = new GzipCompressorOutputStream(out)) {
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
