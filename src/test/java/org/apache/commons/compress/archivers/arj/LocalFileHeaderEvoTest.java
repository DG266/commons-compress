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
package org.apache.commons.compress.archivers.arj;

import org.junit.Test;
import static org.junit.Assert.*;

public class LocalFileHeaderEvoTest {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileType = (-11);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=-11, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.reserved = (-204);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=-204, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.dateTimeModified = 1294;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=1294, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.lastChapter = 340;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=340, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.dateTimeAccessed = 2;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=2, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.firstChapter = 192;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=192, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileAccessMode = (-1);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=-1, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.arjFlags = 16;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=16, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.hostOS = (-1204);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=-1204, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.minVersionToExtract = 1;
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=1, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.archiverVersionNumber = (-1328);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=-1328, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=0, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileSpecPosition = (-176);
        String string0 = localFileHeader0.toString();
        assertEquals("LocalFileHeader [archiverVersionNumber=0, minVersionToExtract=0, hostOS=0, arjFlags=0, method=0, fileType=0, reserved=0, dateTimeModified=0, compressedSize=0, originalSize=0, originalCrc32=0, fileSpecPosition=-176, fileAccessMode=0, firstChapter=0, lastChapter=0, extendedFilePosition=0, dateTimeAccessed=0, dateTimeCreated=0, originalSizeEvenForVolumes=0, name=null, comment=null, extendedHeaders=null]", string0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.extendedFilePosition = (-1165);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.extendedFilePosition = 1371;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.lastChapter = 2426;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.firstChapter = 16;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.fileAccessMode = (-2301);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.fileSpecPosition = (-1624);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.originalCrc32 = (-3227L);
        localFileHeader1.equals(localFileHeader0);
        assertFalse(localFileHeader0.equals((Object)localFileHeader1));
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.originalCrc32 = (-1889L);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.originalSize = 903L;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.compressedSize = 989L;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.dateTimeModified = 32;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.reserved = 1115;
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileType = 1284;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.method = 1;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.hostOS = (-1204);
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.hostOS = (-1300);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.archiverVersionNumber = (-259);
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.dateTimeAccessed = (-11);
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.hashCode();
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.name = "";
        localFileHeader0.hashCode();
    }

    @Test(timeout = 4000)
    public void test32()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        byte[][] byteArray0 = new byte[2][1];
        localFileHeader0.extendedHeaders = byteArray0;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        localFileHeader1.comment = "~R)M^h L";
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test34()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.name = "";
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test35()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        localFileHeader1.originalSizeEvenForVolumes = (-883);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test36()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.dateTimeCreated = (-1204);
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test37()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.dateTimeAccessed = (-1);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test38()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.extendedFilePosition = (-2267);
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test39()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.lastChapter = 2;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test40()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.firstChapter = 3;
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileAccessMode = (-1);
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test42()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.fileSpecPosition = (-176);
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test43()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.originalSize = 362L;
        localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test44()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.compressedSize = 3061L;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(boolean0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
    }

    @Test(timeout = 4000)
    public void test45()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader0.dateTimeModified = 1294;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.reserved = 3535;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.fileType = 2018;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.method = 1912;
        boolean boolean0 = localFileHeader1.equals(localFileHeader0);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader0.arjFlags = 9;
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test50()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        localFileHeader0.minVersionToExtract = 2145365814;
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test51()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        assertTrue(localFileHeader1.equals((Object)localFileHeader0));

        localFileHeader1.archiverVersionNumber = (-1328);
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertFalse(localFileHeader1.equals((Object)localFileHeader0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test52()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        Object object0 = new Object();
        boolean boolean0 = localFileHeader0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test53()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test54()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test55()  throws Throwable  {
        LocalFileHeader localFileHeader0 = new LocalFileHeader();
        LocalFileHeader localFileHeader1 = new LocalFileHeader();
        boolean boolean0 = localFileHeader0.equals(localFileHeader1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test56()  throws Throwable  {
        LocalFileHeader.Flags localFileHeader_Flags0 = new LocalFileHeader.Flags();
    }

    @Test(timeout = 4000)
    public void test57()  throws Throwable  {
        LocalFileHeader.FileTypes localFileHeader_FileTypes0 = new LocalFileHeader.FileTypes();
    }

    @Test(timeout = 4000)
    public void test58()  throws Throwable  {
        LocalFileHeader.Methods localFileHeader_Methods0 = new LocalFileHeader.Methods();
    }
}
