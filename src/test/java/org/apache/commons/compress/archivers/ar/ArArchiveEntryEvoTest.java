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
package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.evosuite.runtime.mock.java.io.MockFile;

public class ArArchiveEntryEvoTest {

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1429L, 0, 0, 3872, 0);
        int int0 = arArchiveEntry0.getUserId();
        assertEquals(0, int0);
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(3872, arArchiveEntry0.getMode());
        assertEquals(0L, arArchiveEntry0.getLastModified());
        assertEquals(1429L, arArchiveEntry0.getLength());
        assertEquals("", arArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("xoFd_^+f!<gdN@", 0L, 339, 0, 339, 1L);
        int int0 = arArchiveEntry0.getUserId();
        assertEquals("xoFd_^+f!<gdN@", arArchiveEntry0.getName());
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(1L, arArchiveEntry0.getLastModified());
        assertEquals(339, int0);
        assertEquals(0L, arArchiveEntry0.getSize());
        assertEquals(339, arArchiveEntry0.getMode());
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("xoFd_^+f!<gdN@", 0L, 339, 0, 339, 1L);
        long long0 = arArchiveEntry0.getSize();
        assertEquals(339, arArchiveEntry0.getMode());
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(1L, arArchiveEntry0.getLastModified());
        assertEquals(0L, long0);
        assertEquals(339, arArchiveEntry0.getUserId());
        assertEquals("xoFd_^+f!<gdN@", arArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        MockFile mockFile0 = new MockFile("YW+5@");
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, (String) null);
        String string0 = arArchiveEntry0.getName();
        assertEquals(33188, arArchiveEntry0.getMode());
        assertNull(string0);
        assertEquals(0L, arArchiveEntry0.getSize());
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(0L, arArchiveEntry0.getLastModified());
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1429L, 0, 0, 3872, 0);
        String string0 = arArchiveEntry0.getName();
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(1429L, arArchiveEntry0.getSize());
        assertEquals(3872, arArchiveEntry0.getMode());
        assertEquals("", string0);
        assertEquals(0L, arArchiveEntry0.getLastModified());
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 954L, 521, 521, 0, 954L);
        int int0 = arArchiveEntry0.getMode();
        assertEquals(521, arArchiveEntry0.getUserId());
        assertEquals(521, arArchiveEntry0.getGroupId());
        assertEquals(0, int0);
        assertEquals("", arArchiveEntry0.getName());
        assertEquals(954L, arArchiveEntry0.getLastModified());
        assertEquals(954L, arArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("xoFd_^+f!<gdN@", 0L, 339, 0, 339, 1L);
        int int0 = arArchiveEntry0.getMode();
        assertEquals(339, int0);
        assertEquals(0L, arArchiveEntry0.getSize());
        assertEquals("xoFd_^+f!<gdN@", arArchiveEntry0.getName());
        assertEquals(339, arArchiveEntry0.getUserId());
        assertEquals(1L, arArchiveEntry0.getLastModified());
        assertEquals(0, arArchiveEntry0.getGroupId());
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1429L, 0, 0, 3872, 0);
        long long0 = arArchiveEntry0.getLastModified();
        assertEquals(3872, arArchiveEntry0.getMode());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(0L, long0);
        assertEquals(1429L, arArchiveEntry0.getLength());
        assertEquals("", arArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, 0, 2103, 33188, (-2554L));
        long long0 = arArchiveEntry0.getLastModified();
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(2103, arArchiveEntry0.getGroupId());
        assertEquals(0L, arArchiveEntry0.getLength());
        assertEquals(33188, arArchiveEntry0.getMode());
        assertEquals((-2554L), long0);
        assertEquals("", arArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 1429L, 0, 0, 3872, 0);
        int int0 = arArchiveEntry0.getGroupId();
        assertEquals("", arArchiveEntry0.getName());
        assertEquals(0L, arArchiveEntry0.getLastModified());
        assertEquals(3872, arArchiveEntry0.getMode());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(0, int0);
        assertEquals(1429L, arArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 0L, 0, 2103, 33188, (-2554L));
        int int0 = arArchiveEntry0.getGroupId();
        assertEquals("", arArchiveEntry0.getName());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(33188, arArchiveEntry0.getMode());
        assertEquals(2103, int0);
        assertEquals((-2554L), arArchiveEntry0.getLastModified());
        assertEquals(0L, arArchiveEntry0.getLength());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        MockFile mockFile0 = new MockFile("");
        Path path0 = mockFile0.toPath();
        LinkOption[] linkOptionArray0 = new LinkOption[1];
        ArArchiveEntry arArchiveEntry0 = null;
        try {
            arArchiveEntry0 = new ArArchiveEntry(path0, "`\n", linkOptionArray0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = null;
        try {
            arArchiveEntry0 = new ArArchiveEntry("~@'k<j*V=c9b\fOH@", (-1L));
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // length must not be negative
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = null;
        try {
            arArchiveEntry0 = new ArArchiveEntry((File) null, "");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        MockFile mockFile0 = new MockFile("]Rq");
        ArArchiveEntry arArchiveEntry1 = new ArArchiveEntry(mockFile0, "");
        boolean boolean0 = arArchiveEntry0.equals(arArchiveEntry1);
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertFalse(boolean0);
        assertEquals((-1915), arArchiveEntry0.getUserId());
        assertEquals(2680L, arArchiveEntry0.getLength());
        assertEquals(33188, arArchiveEntry1.getMode());
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("']d=rZxNf/9gUI", 1914L, (-491), (-5841), 2146682647, (-491));
        boolean boolean0 = arArchiveEntry0.equals((Object) null);
        assertEquals((-491L), arArchiveEntry0.getLastModified());
        assertFalse(boolean0);
        assertEquals((-491), arArchiveEntry0.getUserId());
        assertEquals((-5841), arArchiveEntry0.getGroupId());
        assertEquals("']d=rZxNf/9gUI", arArchiveEntry0.getName());
        assertEquals(2146682647, arArchiveEntry0.getMode());
        assertEquals(1914L, arArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        boolean boolean0 = arArchiveEntry0.equals("CsK\"XVd");
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertFalse(boolean0);
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
        assertEquals((-1915), arArchiveEntry0.getUserId());
        assertEquals((-2144014368), arArchiveEntry0.getMode());
        assertEquals(2680L, arArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = null;
        try {
            arArchiveEntry0 = new ArArchiveEntry("aX`", (-750L), 2853, 2853, 2853, 2853);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // length must not be negative
            //
            verifyException("org.apache.commons.compress.archivers.ar.ArArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        MockFile mockFile0 = new MockFile("]Rq");
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry(mockFile0, "");
        long long0 = arArchiveEntry0.getLength();
        assertEquals(33188, arArchiveEntry0.getMode());
        assertEquals(0L, arArchiveEntry0.getLastModified());
        assertEquals(0, arArchiveEntry0.getGroupId());
        assertEquals(0, arArchiveEntry0.getUserId());
        assertEquals(0L, long0);
        assertEquals("", arArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        arArchiveEntry0.hashCode();
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertEquals((-2144014368), arArchiveEntry0.getMode());
        assertEquals(2680L, arArchiveEntry0.getLength());
        assertEquals((-1915), arArchiveEntry0.getUserId());
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        long long0 = arArchiveEntry0.getSize();
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals((-2144014368), arArchiveEntry0.getMode());
        assertEquals(2680L, long0);
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
        assertEquals((-1915), arArchiveEntry0.getUserId());
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        int int0 = arArchiveEntry0.getMode();
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
        assertEquals(2680L, arArchiveEntry0.getLength());
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals((-2144014368), int0);
        assertEquals((-1915), arArchiveEntry0.getUserId());
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("']d=rZxNf/9gUI", 1914L, (-491), (-5841), 2146682647, (-491));
        int int0 = arArchiveEntry0.getUserId();
        assertEquals((-491L), arArchiveEntry0.getLastModified());
        assertEquals("']d=rZxNf/9gUI", arArchiveEntry0.getName());
        assertEquals((-5841), arArchiveEntry0.getGroupId());
        assertEquals((-491), int0);
        assertEquals(2146682647, arArchiveEntry0.getMode());
        assertEquals(1914L, arArchiveEntry0.getLength());
    }
    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        long long0 = arArchiveEntry0.getLength();
        assertEquals((-2144014368), arArchiveEntry0.getMode());
        assertEquals((-2145645047), arArchiveEntry0.getGroupId());
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertEquals((-1915), arArchiveEntry0.getUserId());
        assertEquals(2680L, long0);
    }

    @Test(timeout = 4000)
    public void test34()  throws Throwable  {
        ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("CsK\"XVd", 2680L, (-1915), (-2145645047), (-2144014368), 3596L);
        int int0 = arArchiveEntry0.getGroupId();
        assertEquals("CsK\"XVd", arArchiveEntry0.getName());
        assertEquals((-1915), arArchiveEntry0.getUserId());
        assertEquals((-2144014368), arArchiveEntry0.getMode());
        assertEquals((-2145645047), int0);
        assertEquals(3596L, arArchiveEntry0.getLastModified());
        assertEquals(2680L, arArchiveEntry0.getSize());
    }

}
