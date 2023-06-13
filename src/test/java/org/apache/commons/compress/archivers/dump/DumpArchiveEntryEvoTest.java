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
package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.Set;
import org.evosuite.runtime.mock.java.util.MockDate;
public class DumpArchiveEntryEvoTest {
    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
        DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("4%pUew8n49", "4%pUew8n49", 15, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
        assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
        assertEquals(0L, dumpArchiveEntry1.getOffset());
        assertFalse(boolean0);
        assertEquals("4%pUew8n49", dumpArchiveEntry1.getName());
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(15);
        assertEquals(DumpArchiveEntry.TYPE.UNKNOWN, dumpArchiveEntry_TYPE0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCdata(0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./P!wozo!LQ}c-", "./P!wozo!LQ}c-", (-1325), dumpArchiveEntry_TYPE0);
        byte[] byteArray0 = new byte[23];
        // Undeclared exception!
        try {
            dumpArchiveEntry0.update(byteArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 160
            //
            verifyException("org.apache.commons.compress.utils.ByteUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        MockDate mockDate0 = new MockDate();
        dumpArchiveEntry0.setLastModifiedDate(mockDate0);
        assertNull(dumpArchiveEntry0.toString());
    }

//    Daylight saving time problems
//    @Test(timeout = 4000)
//    public void test05()  throws Throwable  {
//        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
//        Date date0 = dumpArchiveEntry0.getLastModifiedDate();
//        dumpArchiveEntry0.setAccessTime(date0);
//        assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
//    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        byte[] byteArray0 = new byte[25];
        // Undeclared exception!
        try {
            DumpArchiveEntry.parse(byteArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 32
            //
            verifyException("org.apache.commons.compress.utils.ByteUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setName("WHITEOUT");
        String string0 = dumpArchiveEntry0.toString();
        assertEquals("WHITEOUT", string0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "'BCg.fwqPxJai\u0003", 3381, dumpArchiveEntry_TYPE0);
        String string0 = dumpArchiveEntry0.toString();
        assertEquals("'BCg.fwqPxJai\u0003", dumpArchiveEntry0.getSimpleName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
        dumpArchiveEntry0.setDeleted(true);
        boolean boolean0 = dumpArchiveEntry0.isDeleted();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setVolume(7);
        int int0 = dumpArchiveEntry0.getVolume();
        assertEquals(7, int0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((-548));
        int int0 = dumpArchiveEntry0.getVolume();
        assertEquals((-548), int0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "11[z{Ig");
        dumpArchiveEntry0.setUserId(4);
        int int0 = dumpArchiveEntry0.getUserId();
        assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        String string0 = dumpArchiveEntry0.getSimpleName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
        dumpArchiveEntry0.getSimpleName();
        assertEquals("", dumpArchiveEntry0.toString());
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("$-urD2M\"-Vi", "d7b");
        dumpArchiveEntry0.getOriginalName();
        assertEquals("d7b", dumpArchiveEntry0.getSimpleName());
        assertEquals("$-urD2M\"-Vi", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setName("");
        dumpArchiveEntry0.getOriginalName();
        assertEquals("", dumpArchiveEntry0.toString());
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "");
        dumpArchiveEntry0.setOffset(4178L);
        long long0 = dumpArchiveEntry0.getOffset();
        assertEquals(4178L, long0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setNlink(34);
        int int0 = dumpArchiveEntry0.getNlink();
        assertEquals(34, int0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setNlink((-548));
        int int0 = dumpArchiveEntry0.getNlink();
        assertEquals((-548), int0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("FILE", "FILE");
        String string0 = dumpArchiveEntry0.getName();
        assertEquals("FILE", string0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("", "./Can't read more than eight bytes into a long value", (-113699258), dumpArchiveEntry_TYPE0);
        String string0 = dumpArchiveEntry0.getName();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("./Can't read more than eight bytes into a long value", dumpArchiveEntry0.getSimpleName());
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setMode((-177196485));
        int int0 = dumpArchiveEntry0.getMode();
        assertEquals(571, int0);
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("WORLD_READ", "WORLD_READ");
        dumpArchiveEntry0.setGroupId(1635);
        int int0 = dumpArchiveEntry0.getGroupId();
        assertEquals(1635, int0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.WHITEOUT;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("\"@\bsVAs%HonR", "\"@\bsVAs%HonR", 56, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setGeneration(56);
        int int0 = dumpArchiveEntry0.getGeneration();
        assertEquals(56, int0);
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setGeneration((-644));
        int int0 = dumpArchiveEntry0.getGeneration();
        assertEquals((-644), int0);
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./BME[Ta)5dW]QF{F{8s", "wwsBB<ttyEIvQ\"gDcp:", (-112469961), dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setSize(2257L);
        long long0 = dumpArchiveEntry0.getEntrySize();
        assertEquals(2257L, dumpArchiveEntry0.getSize());
        assertEquals(2257L, long0);
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(".1#m2cwr-)MZAQo_@^", ".1#m2cwr-)MZAQo_@^");
        dumpArchiveEntry0.setSize((-3751L));
        long long0 = dumpArchiveEntry0.getEntrySize();
        assertEquals((-3751L), dumpArchiveEntry0.getSize());
        assertEquals((-3751L), long0);
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        // Undeclared exception!
        try {
            dumpArchiveEntry0.update((byte[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.ByteUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        // Undeclared exception!
        try {
            dumpArchiveEntry0.setCreationTime((Date) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        // Undeclared exception!
        try {
            DumpArchiveEntry.parse((byte[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.utils.ByteUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        // Undeclared exception!
        try {
            dumpArchiveEntry0.isSparseRecord(1431);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");

        } catch(ArrayIndexOutOfBoundsException e) {
            //
            // 1431
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$TapeSegmentHeader", e);
        }
    }

    @Test(timeout = 4000)
    public void test32()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setName("./");
        assertFalse(dumpArchiveEntry0.isDirectory());
        assertEquals("", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setName("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$PERMISSION");
        assertEquals("org.apache.commons.compress.archivers.dump.DumpArchiveEntry$PERMISSION/", dumpArchiveEntry0.toString());
    }

    @Test(timeout = 4000)
    public void test34()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setName((String) null);
        assertEquals(0L, dumpArchiveEntry0.getSize());
    }

    @Test(timeout = 4000)
    public void test35()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setName("/");
        assertEquals("/", dumpArchiveEntry0.toString());
    }

    @Test(timeout = 4000)
    public void test36()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isDirectory();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isDirectory();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("xbiCG>`fP?1-grbbZs/", dumpArchiveEntry0.toString());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test38()  throws Throwable  {
        Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(148);
        assertEquals(3, set0.size());
    }

    @Test(timeout = 4000)
    public void test39()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        int int0 = dumpArchiveEntry_TapeSegmentHeader0.getIno();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test40()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        int int0 = dumpArchiveEntry_TapeSegmentHeader0.getCount();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test41()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        dumpArchiveEntry_TapeSegmentHeader0.getType();
    }

    @Test(timeout = 4000)
    public void test42()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        String string0 = dumpArchiveEntry0.getName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test43()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        int int0 = dumpArchiveEntry_TapeSegmentHeader0.getHoles();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test44()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.SOCKET;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./Xz2wlZA3/Y^`P", "/./", (-1100427679), dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isSocket();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertTrue(boolean0);
        assertEquals("/./", dumpArchiveEntry0.getSimpleName());
        assertEquals("Xz2wlZA3/Y^`P", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test45()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rn4Rx$q,&fg%#C", ")$GnA", 273, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isSocket();
        assertEquals("rn4Rx$q,&fg%#C/", dumpArchiveEntry0.toString());
        assertEquals(")$GnA", dumpArchiveEntry0.getSimpleName());
        assertFalse(boolean0);
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

    @Test(timeout = 4000)
    public void test46()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isFile();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test47()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isFile();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FIFO;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null, (-370), dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isFifo();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test49()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isFifo();
        assertFalse(boolean0);
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("xbiCG>`fP?1-grbbZs/", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test50()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./P!wozo!LQ}c-", "CLRI", 1002, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isChrDev();
        assertEquals("CLRI", dumpArchiveEntry0.getSimpleName());
        assertTrue(boolean0);
        assertEquals("P!wozo!LQ}c-", dumpArchiveEntry0.toString());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

    @Test(timeout = 4000)
    public void test51()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isChrDev();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.BLKDEV;
        dumpArchiveEntry0.setType(dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.isBlkDev();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test53()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isBlkDev();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rn4Rx$q,&fg%#C", ")$Gn", 273, dumpArchiveEntry_TYPE0);
        long long0 = dumpArchiveEntry0.getSize();
        assertEquals(")$Gn", dumpArchiveEntry0.getSimpleName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals((-1L), long0);
        assertEquals("rn4Rx$q,&fg%#C/", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test55()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        long long0 = dumpArchiveEntry0.getSize();
        assertEquals(0L, long0);
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.getName());
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
    }

    @Test(timeout = 4000)
    public void test56()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry1.equals(dumpArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test57()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("rn4Rx$q,&fg%#C", ")$Gn", 273, dumpArchiveEntry_TYPE0);
        DumpArchiveEntry dumpArchiveEntry1 = new DumpArchiveEntry("B);ha2", "I+YH");
        boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry1);
        assertEquals("B);ha2", dumpArchiveEntry1.toString());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals(")$Gn", dumpArchiveEntry0.getSimpleName());
        assertEquals("rn4Rx$q,&fg%#C/", dumpArchiveEntry0.getName());
        assertFalse(boolean0);
        assertEquals("I+YH", dumpArchiveEntry1.getSimpleName());
        assertFalse(dumpArchiveEntry1.equals((Object)dumpArchiveEntry0));
    }

    @Test(timeout = 4000)
    public void test58()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, (String) null);
        boolean boolean0 = dumpArchiveEntry0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test59()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.equals(dumpArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test60()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        boolean boolean0 = dumpArchiveEntry0.equals("$VALUES");
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
        assertFalse(boolean0);
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.getName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

    @Test(timeout = 4000)
    public void test61()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.find(4);
        assertEquals(DumpArchiveEntry.TYPE.DIRECTORY, dumpArchiveEntry_TYPE0);
    }

    @Test(timeout = 4000)
    public void test62()  throws Throwable  {
        Set<DumpArchiveEntry.PERMISSION> set0 = DumpArchiveEntry.PERMISSION.find(0);
        assertTrue(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test63()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        dumpArchiveEntry_TapeSegmentHeader0.setIno((-2077));
        assertEquals((-2077), dumpArchiveEntry_TapeSegmentHeader0.getIno());
    }

    @Test(timeout = 4000)
    public void test64()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isSparseRecord(367);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test65()  throws Throwable  {
        DumpArchiveEntry.TapeSegmentHeader dumpArchiveEntry_TapeSegmentHeader0 = new DumpArchiveEntry.TapeSegmentHeader();
        int int0 = dumpArchiveEntry_TapeSegmentHeader0.getVolume();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test66()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.getHeaderType();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.toString());
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
    }

    @Test(timeout = 4000)
    public void test67()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        int int0 = dumpArchiveEntry0.getHeaderCount();
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
        assertEquals(0, int0);
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.getName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

//    Daylight saving time problems
//    @Test(timeout = 4000)
//    public void test68()  throws Throwable  {
//        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
//        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" O^r", " O^r", 216, dumpArchiveEntry_TYPE0);
//        Date date0 = dumpArchiveEntry0.getCreationTime();
//        assertEquals(0L, dumpArchiveEntry0.getOffset());
//        assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
//        assertEquals(" O^r", dumpArchiveEntry0.getName());
//    }

    @Test(timeout = 4000)
    public void test69()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        int int0 = dumpArchiveEntry0.getGeneration();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test70()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.CHRDEV;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("./BME[Ta)5dW]QF{F{8s", "wwsBB<ttyEIvQ\"gDcp:", (-112469961), dumpArchiveEntry_TYPE0);
        long long0 = dumpArchiveEntry0.getEntrySize();
        assertEquals("BME[Ta)5dW]QF{F{8s", dumpArchiveEntry0.toString());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals(0L, long0);
        assertEquals("wwsBB<ttyEIvQ\"gDcp:", dumpArchiveEntry0.getSimpleName());
    }

    @Test(timeout = 4000)
    public void test71()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.DIRECTORY;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("xbiCG>`fP?1-grbbZs", "xbiCG>`fP?1-grbbZs", 4, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.hashCode();
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("xbiCG>`fP?1-grbbZs/", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test72()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        int int0 = dumpArchiveEntry0.getVolume();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test73()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" O^r", " O^r", 216, dumpArchiveEntry_TYPE0);
        int int0 = dumpArchiveEntry0.getGroupId();
        assertEquals(0, int0);
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals(" O^r", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test74()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        // Undeclared exception!
        try {
            dumpArchiveEntry0.setAccessTime((Date) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test75()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "l>(W\bo*6C@-j");
        String string0 = dumpArchiveEntry0.getSimpleName();
        assertEquals("l>(W\bo*6C@-j", string0);
    }

//    Daylight saving time problems
//    @Test(timeout = 4000)
//    public void test76()  throws Throwable  {
//        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
//        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
//        Date date0 = dumpArchiveEntry0.getLastModifiedDate();
//        dumpArchiveEntry0.setCreationTime(date0);
//        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
//        assertEquals(0L, dumpArchiveEntry0.getOffset());
//        assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
//        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.getName());
//    }

    @Test(timeout = 4000)
    public void test77()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        int int0 = dumpArchiveEntry0.getUserId();
        assertEquals(0, int0);
    }

//    Daylight saving time problems
//    @Test(timeout = 4000)
//    public void test78()  throws Throwable  {
//        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
//        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" O^r", " O^r", 216, dumpArchiveEntry_TYPE0);
//        Date date0 = dumpArchiveEntry0.getAccessTime();
//        assertEquals(" O^r", dumpArchiveEntry0.toString());
//        assertEquals(0L, dumpArchiveEntry0.getOffset());
//        assertEquals("Thu Jan 01 00:00:00 GMT 1970", date0.toString());
//    }

    @Test(timeout = 4000)
    public void test79()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setUserId((-1));
        int int0 = dumpArchiveEntry0.getUserId();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test80()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setSize(508L);
        long long0 = dumpArchiveEntry0.getSize();
        assertEquals(508L, long0);
    }

    @Test(timeout = 4000)
    public void test81()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.LINK;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("'%k3>[~Tku,x3N[", "xbiCG>`fP?1-grbbZs", 3, dumpArchiveEntry_TYPE0);
        int int0 = dumpArchiveEntry0.getHeaderHoles();
        assertEquals("'%k3>[~Tku,x3N[", dumpArchiveEntry0.getName());
        assertEquals(0, int0);
        assertEquals("xbiCG>`fP?1-grbbZs", dumpArchiveEntry0.getSimpleName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

    @Test(timeout = 4000)
    public void test82()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        int int0 = dumpArchiveEntry0.getMode();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test83()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setGroupId((-151));
        int int0 = dumpArchiveEntry0.getGroupId();
        assertEquals((-151), int0);
    }

    @Test(timeout = 4000)
    public void test84()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "116z{I=");
        String string0 = dumpArchiveEntry0.toString();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test85()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        int int0 = dumpArchiveEntry0.getIno();
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.toString());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test86()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        dumpArchiveEntry0.setSimpleName("i#9NZR:ur_\"y:l");
        assertEquals(0, dumpArchiveEntry0.getIno());
    }

    @Test(timeout = 4000)
    public void test87()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" O^r", " O^r", 216, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.setOffset((-80L));
        long long0 = dumpArchiveEntry0.getOffset();
        assertEquals((-80L), long0);
    }

    @Test(timeout = 4000)
    public void test88()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        boolean boolean0 = dumpArchiveEntry0.isDeleted();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test89()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        // Undeclared exception!
        try {
            dumpArchiveEntry0.setLastModifiedDate((Date) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.archivers.dump.DumpArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test90()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        Set<DumpArchiveEntry.PERMISSION> set0 = dumpArchiveEntry0.getPermissions();
        assertEquals(0, set0.size());
    }

    @Test(timeout = 4000)
    public void test91()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.FILE;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry("!x=Q*hv&)1]W$p", "$VALUES", 653, dumpArchiveEntry_TYPE0);
        dumpArchiveEntry0.getType();
        assertEquals("!x=Q*hv&)1]W$p", dumpArchiveEntry0.getName());
        assertEquals("$VALUES", dumpArchiveEntry0.getSimpleName());
        assertEquals(0L, dumpArchiveEntry0.getOffset());
    }

    @Test(timeout = 4000)
    public void test92()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry((String) null, "l>(W\bo*6C@-j");
        String string0 = dumpArchiveEntry0.getOriginalName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test93()  throws Throwable  {
        DumpArchiveEntry.TYPE dumpArchiveEntry_TYPE0 = DumpArchiveEntry.TYPE.UNKNOWN;
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry(" O^r", " O^r", 216, dumpArchiveEntry_TYPE0);
        long long0 = dumpArchiveEntry0.getOffset();
        assertEquals(0L, long0);
        assertEquals(" O^r", dumpArchiveEntry0.getName());
    }

    @Test(timeout = 4000)
    public void test94()  throws Throwable  {
        DumpArchiveEntry dumpArchiveEntry0 = new DumpArchiveEntry();
        int int0 = dumpArchiveEntry0.getNlink();
        assertEquals(0, int0);
    }
}
