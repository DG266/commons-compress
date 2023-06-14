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
package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.PriorityQueue;
public class SevenZArchiveEntryEvoTest {


    @Test(timeout = 4000)
    public void test000()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        sevenZArchiveEntry1.setCrcValue((-1L));
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertEquals((-1L), sevenZArchiveEntry1.getCrcValue());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test001()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setWindowsAttributes(2073432487);
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertEquals(2073432487, sevenZArchiveEntry0.getWindowsAttributes());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test002()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZMethodConfiguration[] sevenZMethodConfigurationArray0 = new SevenZMethodConfiguration[1];
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray0);
        assertFalse(sevenZArchiveEntry0.getHasWindowsAttributes());
    }
    @Test(timeout = 4000)
    public void test005()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setDirectory(true);
        boolean boolean0 = sevenZArchiveEntry0.isDirectory();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test006()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setAntiItem(true);
        boolean boolean0 = sevenZArchiveEntry0.isAntiItem();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test007()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setWindowsAttributes((-1306));
        int int0 = sevenZArchiveEntry0.getWindowsAttributes();
        assertEquals((-1306), int0);
    }

    @Test(timeout = 4000)
    public void test008()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setSize(1L);
        long long0 = sevenZArchiveEntry0.getSize();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test009()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setSize((-116444736000000000L));
        long long0 = sevenZArchiveEntry0.getSize();
        assertEquals((-116444736000000000L), long0);
    }

    @Test(timeout = 4000)
    public void test010()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("R(##j5l?!RP'.nR#i");
        String string0 = sevenZArchiveEntry0.getName();
        assertEquals("R(##j5l?!RP'.nR#i", string0);
    }

    @Test(timeout = 4000)
    public void test011()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("");
        String string0 = sevenZArchiveEntry0.getName();
        assertEquals("", string0);
    }
    @Test(timeout = 4000)
    public void test015()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasCrc(true);
        boolean boolean0 = sevenZArchiveEntry0.getHasCrc();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test016()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasAccessDate(true);
        boolean boolean0 = sevenZArchiveEntry0.getHasAccessDate();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test020()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCrcValue(1L);
        long long0 = sevenZArchiveEntry0.getCrcValue();
        assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test021()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCrcValue((-306L));
        long long0 = sevenZArchiveEntry0.getCrcValue();
        assertEquals((-306L), long0);
    }

    @Test(timeout = 4000)
    public void test022()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCrcValue(3258L);
        int int0 = sevenZArchiveEntry0.getCrc();
        assertEquals(3258, int0);
    }

    @Test(timeout = 4000)
    public void test023()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCrc((-682));
        int int0 = sevenZArchiveEntry0.getCrc();
        assertEquals((-682), int0);
    }

    @Test(timeout = 4000)
    public void test024()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        PriorityQueue<SevenZMethodConfiguration> priorityQueue0 = new PriorityQueue<SevenZMethodConfiguration>();
        sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) priorityQueue0);
        Iterable<? extends SevenZMethodConfiguration> iterable0 = sevenZArchiveEntry0.getContentMethods();
        assertNotNull(iterable0);
    }

    @Test(timeout = 4000)
    public void test025()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedSize(585L);
        long long0 = sevenZArchiveEntry0.getCompressedSize();
        assertEquals(585L, long0);
    }

    @Test(timeout = 4000)
    public void test026()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedSize((-116444736000000000L));
        long long0 = sevenZArchiveEntry0.getCompressedSize();
        assertEquals((-116444736000000000L), long0);
    }

    @Test(timeout = 4000)
    public void test027()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedCrc(1696);
        long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
        assertEquals(1696L, long0);
    }

    @Test(timeout = 4000)
    public void test028()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedCrc((-1562));
        long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
        assertEquals((-1562L), long0);
    }

    @Test(timeout = 4000)
    public void test029()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedCrc(11);
        int int0 = sevenZArchiveEntry0.getCompressedCrc();
        assertEquals(11, int0);
    }

    @Test(timeout = 4000)
    public void test030()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedCrc((-1));
        int int0 = sevenZArchiveEntry0.getCompressedCrc();
        assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test036()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        // Undeclared exception!
        try {
            sevenZArchiveEntry0.getLastModifiedTime();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // The entry doesn't have this timestamp
            //
            verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test037()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        // Undeclared exception!
        try {
            sevenZArchiveEntry0.getCreationTime();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // The entry doesn't have this timestamp
            //
            verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
        }
    }

    @Test(timeout = 4000)
    public void test038()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        // Undeclared exception!
        try {
            sevenZArchiveEntry0.getAccessTime();
            fail("Expecting exception: UnsupportedOperationException");

        } catch(UnsupportedOperationException e) {
            //
            // The entry doesn't have this timestamp
            //
            verifyException("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry", e);
        }
    }
    @Test(timeout = 4000)
    public void test042()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) null);
        assertFalse(sevenZArchiveEntry0.getHasLastModifiedDate());
    }

     @Test(timeout = 4000)
    public void test044()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.hashCode();
    }

    @Test(timeout = 4000)
    public void test051()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        PriorityQueue<SevenZMethodConfiguration> priorityQueue0 = new PriorityQueue<SevenZMethodConfiguration>();
        sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) priorityQueue0);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test052()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        PriorityQueue<SevenZMethodConfiguration> priorityQueue0 = new PriorityQueue<SevenZMethodConfiguration>();
        sevenZArchiveEntry0.setContentMethods((Iterable<? extends SevenZMethodConfiguration>) priorityQueue0);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test053()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setSize((-28L));
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertEquals((-28L), sevenZArchiveEntry0.getSize());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test054()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        assertTrue(sevenZArchiveEntry1.equals((Object)sevenZArchiveEntry0));

        sevenZArchiveEntry1.setCompressedCrc((-2234));
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test055()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        sevenZArchiveEntry1.setWindowsAttributes(1557);
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertEquals(1557, sevenZArchiveEntry1.getWindowsAttributes());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test056()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        sevenZArchiveEntry1.setHasWindowsAttributes(true);
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertTrue(sevenZArchiveEntry1.getHasWindowsAttributes());
        assertFalse(boolean0);
    }
    @Test(timeout = 4000)
    public void test063()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        sevenZArchiveEntry1.setName("Z9ziJ(");
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertFalse(boolean0);
    }
    @Test(timeout = 4000)
    public void test065()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test067()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test069()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasWindowsAttributes(true);
        boolean boolean0 = sevenZArchiveEntry0.getHasWindowsAttributes();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test070()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        long long0 = sevenZArchiveEntry0.getCompressedSize();
        assertEquals(0L, long0);
    }
    @Test(timeout = 4000)
    public void test072()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.getHasCrc();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test073()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setDirectory(true);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertTrue(sevenZArchiveEntry0.isDirectory());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test074()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.hasStream();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test075()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.getHasLastModifiedDate();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test076()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setAntiItem(true);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertTrue(sevenZArchiveEntry0.isAntiItem());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test078()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        int int0 = sevenZArchiveEntry0.getWindowsAttributes();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test079()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        int int0 = sevenZArchiveEntry0.getCrc();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test080()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        Iterable<? extends SevenZMethodConfiguration> iterable0 = sevenZArchiveEntry0.getContentMethods();
        assertNull(iterable0);
    }

    @Test(timeout = 4000)
    public void test081()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        int int0 = sevenZArchiveEntry0.getCompressedCrc();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test082()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        // Undeclared exception!
        try {
            sevenZArchiveEntry0.setContentMethods((SevenZMethodConfiguration[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.Objects", e);
        }
    }

    @Test(timeout = 4000)
    public void test083()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        String string0 = sevenZArchiveEntry0.getName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test084()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCrcValue((-1L));
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry1.equals(sevenZArchiveEntry0);
        assertEquals((-1L), sevenZArchiveEntry0.getCrcValue());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test086()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setWindowsAttributes(14);
        int int0 = sevenZArchiveEntry0.getWindowsAttributes();
        assertEquals(14, int0);
    }

    @Test(timeout = 4000)
    public void test087()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.getHasCreationDate();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test088()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.getHasAccessDate();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test089()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasStream(true);
        boolean boolean0 = sevenZArchiveEntry0.hasStream();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test090()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedCrcValue((-1593L));
        assertFalse(sevenZArchiveEntry0.getHasWindowsAttributes());
    }
    @Test(timeout = 4000)
    public void test092()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        long long0 = sevenZArchiveEntry0.getCompressedCrcValue();
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test093()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        long long0 = sevenZArchiveEntry0.getCrcValue();
        assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test094()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("");
        sevenZArchiveEntry0.hashCode();
    }

    @Test(timeout = 4000)
    public void test095()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasCrc(true);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertTrue(sevenZArchiveEntry0.getHasCrc());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test096()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        sevenZArchiveEntry0.setCompressedSize(1493L);
        SevenZArchiveEntry sevenZArchiveEntry1 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.equals(sevenZArchiveEntry1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test097()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.isAntiItem();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test098()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.getHasWindowsAttributes();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test100()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        boolean boolean0 = sevenZArchiveEntry0.isDirectory();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test101()  throws Throwable  {
        SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
        long long0 = sevenZArchiveEntry0.getSize();
        assertEquals(0L, long0);
    }


}
