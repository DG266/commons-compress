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
package org.apache.commons.compress.archivers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;

public class ListerEvoTest {
    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "'*&_FxAvv8C3tM^";
        // Undeclared exception!
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: InvalidPathException");

        } catch(InvalidPathException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Undeclared exception!
        try {
            Lister.main((String[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.Lister", e);
        }
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "B:";
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: IOException");

        } catch(IOException e) {
        }
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "zipfile";
        stringArray0[1] = "zipfile";
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: NoSuchFileException");

        } catch(NoSuchFileException e) {
        }
    }

    @Test(timeout = 4000)
    public void test4()  throws Throwable  {
        String[] stringArray0 = new String[5];
        stringArray0[0] = "7z";
        stringArray0[1] = "7z";
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: NoSuchFileException");

        } catch(NoSuchFileException e) {
        }
    }

    @Test(timeout = 4000)
    public void test5()  throws Throwable  {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "";
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: AccessDeniedException");

        } catch(AccessDeniedException e) {
        }
    }

    @Test(timeout = 4000)
    public void test6()  throws Throwable  {
        Lister lister0 = new Lister();
    }

    @Test(timeout = 4000)
    public void test7()  throws Throwable  {
        String[] stringArray0 = new String[0];
        Lister.main(stringArray0);
        assertEquals(0, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        String[] stringArray0 = new String[20];
        stringArray0[0] = "tarfile";
        stringArray0[1] = "tarfile";
        try {
            Lister.main(stringArray0);
            fail("Expecting exception: NoSuchFileException");

        } catch(NoSuchFileException e) {
        }
    }


}
