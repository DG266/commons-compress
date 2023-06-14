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
package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
public class ArchiveEvoTest {


    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Archive archive0 = new Archive();
        StreamMap streamMap0 = new StreamMap();
        archive0.streamMap = streamMap0;
        // Undeclared exception!
        try {
            archive0.toString();
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.sevenz.StreamMap", e);
        }
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Archive archive0 = new Archive();
        archive0.files = null;
        String string0 = archive0.toString();
        assertEquals("Archive with packed streams starting at offset 0, 0 pack sizes, (null) CRCs, 0 folders, (null) files and null", string0);
    }
}
