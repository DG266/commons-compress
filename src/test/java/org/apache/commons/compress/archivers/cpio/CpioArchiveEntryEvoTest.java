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
package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Date;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
public class CpioArchiveEntryEvoTest {

    @Test(timeout = 4000)
    public void test003()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        boolean boolean0 = cpioArchiveEntry0.isPipe();
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertFalse(boolean0);
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
    }
    @Test(timeout = 4000)
    public void test006()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
        assertFalse(boolean0);
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test007()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
        int int0 = cpioArchiveEntry0.getHeaderPadCount();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test008()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("W;+;T");
        int int0 = cpioArchiveEntry0.getHeaderPadCount();
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test009()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        short short0 = cpioArchiveEntry0.getFormat();
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)8, short0);
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test010()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!", 2L);
        int int0 = cpioArchiveEntry0.getDataPadCount();
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(2, int0);
        assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test011()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("80", 1689L);
        int int0 = cpioArchiveEntry0.getDataPadCount();
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("80", cpioArchiveEntry0.getName());
        assertEquals(3, int0);
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test012()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Maske(d: ");
        FileTime fileTime0 = FileTime.fromMillis((-1L));
        cpioArchiveEntry0.setTime(fileTime0);
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(" Maske(d: ", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test013()  throws Throwable  {
        LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
        MockFile mockFile0 = new MockFile((File) null, "");
        Path path0 = mockFile0.toPath();
        LinkOption[] linkOptionArray0 = new LinkOption[1];
        linkOptionArray0[0] = linkOption0;
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, path0, "", linkOptionArray0);
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(16384L, cpioArchiveEntry0.getMode());
        assertEquals("", cpioArchiveEntry0.getName());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0L, cpioArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test014()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)1, (String) null, (short)1);
        assertEquals(3, cpioArchiveEntry0.getDataPadCount());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(32768L, cpioArchiveEntry0.getMode());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test015()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)2, "141])[@TI{ejQqBN3a");
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)2, cpioArchiveEntry0.getFormat());
        assertEquals("141])[@TI{ejQqBN3a", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test017()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Cannot determine type of file ");
        cpioArchiveEntry0.setUID(1968L);
        long long0 = cpioArchiveEntry0.getUID();
        assertEquals(1968L, long0);
    }

    @Test(timeout = 4000)
    public void test018()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("+Fnj|0,W{k6");
        assertEquals(0L, cpioArchiveEntry0.getUID());

        cpioArchiveEntry0.setUID((-1L));
        long long0 = cpioArchiveEntry0.getUID();
        assertEquals((-1L), long0);
    }
    @Test(timeout = 4000)
    public void test021()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("PMWD4{!s!5+$ ^X`g@$", 1677L);
        long long0 = cpioArchiveEntry0.getSize();
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(3, cpioArchiveEntry0.getDataPadCount());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(1677L, long0);
        assertEquals("PMWD4{!s!5+$ ^X`g@$", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test022()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("O@j]#Wt)dlj#p|Xl");
        cpioArchiveEntry0.setRemoteDeviceMin(100L);
        long long0 = cpioArchiveEntry0.getRemoteDeviceMin();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals("O@j]#Wt)dlj#p|Xl", cpioArchiveEntry0.getName());
        assertEquals(100L, long0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test024()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
        cpioArchiveEntry0.setRemoteDeviceMaj(2491L);
        long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
        assertEquals(2491L, long0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals("070701", cpioArchiveEntry0.getName());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test026()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        long long0 = cpioArchiveEntry0.getRemoteDevice();
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertEquals(0L, long0);
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test027()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
        cpioArchiveEntry0.setNumberOfLinks((-3210L));
        long long0 = cpioArchiveEntry0.getNumberOfLinks();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((-3210L), long0);
        assertEquals("", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test028()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
        String string0 = cpioArchiveEntry0.getName();
        assertEquals("070701", string0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test029()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
        String string0 = cpioArchiveEntry0.getName();
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("", string0);
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
    }
    @Test(timeout = 4000)
    public void test032()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
        cpioArchiveEntry0.setGID((-835L));
        long long0 = cpioArchiveEntry0.getGID();
        assertEquals((-835L), long0);
    }

    @Test(timeout = 4000)
    public void test033()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("%");
        cpioArchiveEntry0.setDeviceMin(1150L);
        long long0 = cpioArchiveEntry0.getDeviceMin();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(1150L, long0);
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("%", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test034()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!", 2L);
        cpioArchiveEntry0.setDeviceMaj(49L);
        long long0 = cpioArchiveEntry0.getDeviceMaj();
        assertEquals(49L, long0);
        assertEquals(2, cpioArchiveEntry0.getDataPadCount());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test035()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        cpioArchiveEntry0.setDevice(2709L);
        long long0 = cpioArchiveEntry0.getDevice();
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(2709L, long0);
    }

    @Test(timeout = 4000)
    public void test036()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        cpioArchiveEntry0.setDevice((-1L));
        long long0 = cpioArchiveEntry0.getDevice();
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
        assertEquals((-1L), long0);
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
    }

    @Test(timeout = 4000)
    public void test037()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" i;");
        cpioArchiveEntry0.setChksum(1883L);
        long long0 = cpioArchiveEntry0.getChksum();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(" i;", cpioArchiveEntry0.getName());
        assertEquals(1883L, long0);
    }

    @Test(timeout = 4000)
    public void test038()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        int int0 = cpioArchiveEntry0.getAlignmentBoundary();
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, int0);
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test039()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setRemoteDeviceMin((short)4);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test040()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setRemoteDeviceMaj((short)8);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test041()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Maske(d: ");
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setRemoteDevice(0L);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test042()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setDeviceMin((short)8);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test043()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setDeviceMaj((short)4);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test044()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getRemoteDeviceMin();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test045()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getRemoteDeviceMaj();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test046()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getHeaderPadCount(4294967295L);
            fail("Expecting exception: ArithmeticException");

        } catch(ArithmeticException e) {
            //
            // integer overflow
            //
            verifyException("java.lang.Math", e);
        }
    }

    @Test(timeout = 4000)
    public void test047()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getDeviceMin();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test048()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getDeviceMaj();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test049()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Masked: ");
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getDevice();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test050()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getChksum();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test051()  throws Throwable  {
        LinkOption[] linkOptionArray0 = new LinkOption[0];
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)4, (Path) null, "rVgN.", linkOptionArray0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.nio.file.Files", e);
        }
    }

    @Test(timeout = 4000)
    public void test052()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)15303, "Mj", (short)15303);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 15303
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test053()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short) (-1831), "Cannot determine type of file ");
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type -1831
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test054()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)120, (File) null, "6!MwIyh8(");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test055()  throws Throwable  {
        MockFile mockFile0 = new MockFile("070707", "070707");
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short) (-8804), mockFile0, "070707");
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type -8804
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test056()  throws Throwable  {
        LinkOption[] linkOptionArray0 = new LinkOption[0];
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((Path) null, "BC$D1eQ8c*wkVv&\"X<", linkOptionArray0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.nio.file.Files", e);
        }
    }

    @Test(timeout = 4000)
    public void test057()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((File) null, "cQaEYI+nE[:vMr@?");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test058()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setSize((-206L));
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Invalid entry size <-206>
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test059()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("jW6*jI($B ");
        cpioArchiveEntry0.setMode((-116444736000000000L));
        long long0 = cpioArchiveEntry0.getMode();
        assertEquals((-116444736000000000L), long0);
    }

    @Test(timeout = 4000)
    public void test060()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("2a5<6$mz7x<", 1689L);
        cpioArchiveEntry0.setMode(16384L);
        assertEquals(16384L, cpioArchiveEntry0.getMode());
    }

    @Test(timeout = 4000)
    public void test061()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
        boolean boolean0 = cpioArchiveEntry0.isDirectory();
        assertFalse(boolean0);
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals("", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }
    @Test(timeout = 4000)
    public void test063()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Maske(d: ");
        int int0 = cpioArchiveEntry0.getHeaderPadCount((Charset) null);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(" Maske(d: ", cpioArchiveEntry0.getName());
        assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test064()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((String) null);
        Charset charset0 = Charset.defaultCharset();
        int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
        assertEquals(0, int0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test065()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setTime((FileTime) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.TimeUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test067()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setSize(4294967296L);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Invalid entry size <4294967296>
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test068()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry("16X\"AwVfh", (-1097L));
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Invalid entry size <-1097>
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test069()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setMode((short)4);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown mode. Full: 4 Masked: 0
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }
    @Test(timeout = 4000)
    public void test072()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Invalid entry size <", 49152L);
        cpioArchiveEntry0.setMode(49152L);
        boolean boolean0 = cpioArchiveEntry0.isSocket();
        assertEquals(49152L, cpioArchiveEntry0.getMode());
        assertTrue(boolean0);
    }
    @Test(timeout = 4000)
    public void test075()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        boolean boolean0 = cpioArchiveEntry0.isRegularFile();
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
        assertFalse(boolean0);
    }
    @Test(timeout = 4000)
    public void test081()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        boolean boolean0 = cpioArchiveEntry0.isCharacterDevice();
        assertFalse(boolean0);
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
    }

    @Test(timeout = 4000)
    public void test082()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("070701");
        cpioArchiveEntry0.setMode(24576L);
        boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
        assertEquals(24576L, cpioArchiveEntry0.getMode());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test086()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" Maske(d: ");
        long long0 = cpioArchiveEntry0.getMode();
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(32768L, long0);
        assertEquals(" Maske(d: ", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test087()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
        long long0 = cpioArchiveEntry0.getMode();
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0L, long0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }
    @Test(timeout = 4000)
    public void test090()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)8);
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertEquals(1, int0);
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
    }

    @Test(timeout = 4000)
    public void test091()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        int int0 = cpioArchiveEntry0.getHeaderPadCount((long) (short)4);
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(0, int0);
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test092()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("TRAILER!!!");
        Charset charset0 = Charset.defaultCharset();
        int int0 = cpioArchiveEntry0.getHeaderPadCount(charset0);
        assertEquals(3, int0);
        assertEquals("TRAILER!!!", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test093()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        cpioArchiveEntry0.setSize(439L);
        int int0 = cpioArchiveEntry0.getDataPadCount();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test094()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        int int0 = cpioArchiveEntry0.getDataPadCount();
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(0, int0);
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test095()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("qE&VN/Mb`t4M");
        int int0 = cpioArchiveEntry0.getDataPadCount();
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals("qE&VN/Mb`t4M", cpioArchiveEntry0.getName());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test096()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry((short)4);
        boolean boolean0 = cpioArchiveEntry1.equals(cpioArchiveEntry0);
        assertTrue(boolean0);
        assertEquals((short)4, cpioArchiveEntry1.getFormat());
        assertEquals(76, cpioArchiveEntry1.getHeaderSize());
        assertEquals(0, cpioArchiveEntry1.getAlignmentBoundary());
    }

    @Test(timeout = 4000)
    public void test097()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("O@j]#Wt)dlj#p|Xl");
        CpioArchiveEntry cpioArchiveEntry1 = new CpioArchiveEntry("O@j]#Wt)dlj#p|Xl", 2073L);
        boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry1);
        assertEquals(110, cpioArchiveEntry1.getHeaderSize());
        assertEquals("O@j]#Wt)dlj#p|Xl", cpioArchiveEntry1.getName());
        assertTrue(boolean0);
        assertEquals((short)1, cpioArchiveEntry1.getFormat());
        assertEquals(3, cpioArchiveEntry1.getDataPadCount());
    }

    @Test(timeout = 4000)
    public void test098()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        Object object0 = new Object();
        boolean boolean0 = cpioArchiveEntry0.equals(object0);
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test099()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("O@j]#Wt)dlj#p|Xl");
        boolean boolean0 = cpioArchiveEntry0.equals(cpioArchiveEntry0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("O@j]#Wt)dlj#p|Xl", cpioArchiveEntry0.getName());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test101()  throws Throwable  {
        MockFile mockFile0 = new MockFile("f].#@m'/SKO0bu");
        Path path0 = mockFile0.toPath();
        LinkOption[] linkOptionArray0 = new LinkOption[0];
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry(path0, "f].#@m'/SKO0bu", linkOptionArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Cannot determine type of file f].#@m'\\SKO0bu
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }
    @Test(timeout = 4000)
    public void test103()  throws Throwable  {
        MockFile mockFile0 = new MockFile("Xhw", "Xhw");
        LinkOption[] linkOptionArray0 = new LinkOption[0];
        Path path0 = mockFile0.toPath();
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)215, path0, "Xhw", linkOptionArray0);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 215
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test104()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)8);
        boolean boolean0 = cpioArchiveEntry0.equals((Object) null);
        assertFalse(boolean0);
        assertEquals(26, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)8, cpioArchiveEntry0.getFormat());
        assertEquals(2, cpioArchiveEntry0.getAlignmentBoundary());
    }

    @Test(timeout = 4000)
    public void test105()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)7);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 7
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test106()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)6);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 6
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test107()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)5);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 5
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test108()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = null;
        try {
            cpioArchiveEntry0 = new CpioArchiveEntry((short)3);
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // Unknown header type 3
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test109()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ov");
        cpioArchiveEntry0.hashCode();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("ov", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test110()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("qE&VN/Mb`t4M");
        cpioArchiveEntry0.setGID(36864L);
        long long0 = cpioArchiveEntry0.getGID();
        assertEquals(36864L, long0);
    }

    @Test(timeout = 4000)
    public void test111()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ov");
        cpioArchiveEntry0.setDeviceMaj((-1988L));
        long long0 = cpioArchiveEntry0.getDeviceMaj();
        assertEquals("ov", cpioArchiveEntry0.getName());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((-1988L), long0);
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test112()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(" a6*kR($B ");
        long long0 = cpioArchiveEntry0.getRemoteDeviceMaj();
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(" a6*kR($B ", cpioArchiveEntry0.getName());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test113()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        String string0 = cpioArchiveEntry0.getName();
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
        assertNull(string0);
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
    }
    @Test(timeout = 4000)
    public void test115()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("VTbq/pozR4;5~k*");
        // Undeclared exception!
        try {
            cpioArchiveEntry0.getRemoteDevice();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test116()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        long long0 = cpioArchiveEntry0.getDevice();
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(0L, long0);
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test117()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setChksum((short)4);
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test118()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("qE&VN/Mb`t4M");
        long long0 = cpioArchiveEntry0.getGID();
        assertEquals(0L, long0);
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals("qE&VN/Mb`t4M", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test122()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry((short)4);
        cpioArchiveEntry0.setRemoteDevice((short)4);
        long long0 = cpioArchiveEntry0.getRemoteDevice();
        assertEquals(76, cpioArchiveEntry0.getHeaderSize());
        assertEquals(4L, long0);
        assertEquals(0, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)4, cpioArchiveEntry0.getFormat());
    }
    @Test(timeout = 4000)
    public void test124()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("*#C");
        int int0 = cpioArchiveEntry0.getAlignmentBoundary();
        assertEquals(4, int0);
        assertEquals("*#C", cpioArchiveEntry0.getName());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

    @Test(timeout = 4000)
    public void test125()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("+Fnj|0,W{k6");
        long long0 = cpioArchiveEntry0.getUID();
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals(0L, long0);
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals("+Fnj|0,W{k6", cpioArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test126()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("Invalid entry size <", 49152L);
        cpioArchiveEntry0.setDeviceMin((-807L));
        long long0 = cpioArchiveEntry0.getDeviceMin();
        assertEquals((-807L), long0);
        assertEquals("Invalid entry size <", cpioArchiveEntry0.getName());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(49152L, cpioArchiveEntry0.getSize());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }

    @Test(timeout = 4000)
    public void test127()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("ov");
        // Undeclared exception!
        try {
            cpioArchiveEntry0.setDevice((-9L));
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test128()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("VDP<");
        long long0 = cpioArchiveEntry0.getSize();
        assertEquals(0L, long0);
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals("VDP<", cpioArchiveEntry0.getName());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
    }
    @Test(timeout = 4000)
    public void test132()  throws Throwable  {
        CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("VTbq/pozR4;5~k*");
        cpioArchiveEntry0.setName("VTbq/pozR4;5~k*");
        assertEquals("VTbq/pozR4;5~k*", cpioArchiveEntry0.getName());
        assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
        assertEquals(110, cpioArchiveEntry0.getHeaderSize());
        assertEquals((short)1, cpioArchiveEntry0.getFormat());
    }

}
