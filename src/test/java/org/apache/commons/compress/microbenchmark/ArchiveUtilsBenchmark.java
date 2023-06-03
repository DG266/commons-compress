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

import org.apache.commons.compress.utils.ArchiveUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

public class ArchiveUtilsBenchmark {

    @Benchmark
    @BenchmarkMode(Mode.All)
    @Fork(value = 1, warmups = 0)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void sanitizeBench(Blackhole blackhole) throws Exception {
        final String input = "012345678901234567890123456789012345678901234567890123456789"
                + "012345678901234567890123456789012345678901234567890123456789"
                + "012345678901234567890123456789012345678901234567890123456789"
                + "012345678901234567890123456789012345678901234567890123456789"
                + "012345678901234567890123456789012345678901234567890123456789";
        String result = ArchiveUtils.sanitize(input);
        blackhole.consume(result);
    }

}
