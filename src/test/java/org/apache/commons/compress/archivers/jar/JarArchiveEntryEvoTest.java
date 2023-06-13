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
package org.apache.commons.compress.archivers.jar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.cert.Certificate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class JarArchiveEntryEvoTest {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("urD|x(:hq,c.~c\"y");
        JarArchiveEntry jarArchiveEntry1 = null;
        try {
            jarArchiveEntry1 = new JarArchiveEntry((ZipArchiveEntry) jarArchiveEntry0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // ZIP compression method can not be negative: -1
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = null;
        try {
            jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // entry
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = null;
        try {
            jarArchiveEntry0 = new JarArchiveEntry((JarEntry) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // entry
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = null;
        try {
            jarArchiveEntry0 = new JarArchiveEntry((String) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // name
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        JarEntry jarEntry0 = new JarEntry("e8s%$:g7");
        jarEntry0.setMethod(0);
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry(jarEntry0);
        assertEquals(0, jarArchiveEntry0.getPlatform());
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("urD|x(:hq,c.~c\"y");
        jarArchiveEntry0.setMethod(3);
        JarArchiveEntry jarArchiveEntry1 = new JarArchiveEntry((ZipArchiveEntry) jarArchiveEntry0);
        assertEquals("urD|x(:hq,c.~c\"y", jarArchiveEntry1.getName());
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        JarEntry jarEntry0 = new JarEntry("e8s%$:g7");
        jarEntry0.setMethod(0);
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry((ZipEntry) jarEntry0);
        assertEquals("e8s%$:g7", jarArchiveEntry0.toString());
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("e8s%$:g7");
        Certificate[] certificateArray0 = jarArchiveEntry0.getCertificates();
        assertNull(certificateArray0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("`9'R9ID_1K'_7");
        Attributes attributes0 = jarArchiveEntry0.getManifestAttributes();
        assertNull(attributes0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("");
        JarEntry jarEntry0 = new JarEntry(jarArchiveEntry0);
        JarArchiveEntry jarArchiveEntry1 = null;
        try {
            jarArchiveEntry1 = new JarArchiveEntry(jarEntry0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // ZIP compression method can not be negative: -1
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = null;
        try {
            jarArchiveEntry0 = new JarArchiveEntry((ZipArchiveEntry) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // entry
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        JarArchiveEntry jarArchiveEntry0 = new JarArchiveEntry("Error parsing extra fields for entry: ");
        JarArchiveEntry jarArchiveEntry1 = null;
        try {
            jarArchiveEntry1 = new JarArchiveEntry((ZipEntry) jarArchiveEntry0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // ZIP compression method can not be negative: -1
            //
            verifyException("org.apache.commons.compress.archivers.zip.ZipArchiveEntry", e);
        }
    }
}
