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
package org.apache.commons.compress.harmony.pack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

public class IntListEvoTest {

    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1, 1);
        IntList intList1 = new IntList();
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList0.add(1, 1);
        intList0.toArray();
        assertEquals(11, intList0.size());
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1, 1);
        IntList intList1 = new IntList();
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList0.add(1, 1);
        int int0 = intList0.remove(1);
        assertEquals(10, intList0.size());
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1, 1);
        boolean boolean0 = intList0.add(1);
        assertTrue(boolean0);

        intList0.add(1, 1270);
        int int0 = intList0.remove(1);
        assertEquals(1270, int0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(2, 1);
        IntList intList1 = new IntList();
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList0.addAll(intList1);
        int int0 = intList0.remove(12);
        assertEquals(14, intList0.size());
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        IntList intList0 = new IntList(1);
        boolean boolean0 = intList0.add(1);
        assertTrue(boolean0);

        intList0.add(0, 1);
        intList0.add(1, (-1999));
        int int0 = intList0.remove(1);
        assertEquals((-1999), int0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.remove(1270);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0, 0);
        // Undeclared exception!
        try {
            intList0.remove((-119));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0, 0);
        intList0.increment(0);
        assertEquals(1, intList0.size());
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        IntList intList0 = new IntList(0);
        // Undeclared exception!
        try {
            intList0.increment(0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        IntList intList1 = new IntList();
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList1.addAll(intList0);
        intList1.addAll(intList0);
        assertFalse(intList0.isEmpty());

        intList1.add(1, (-3434));
        assertEquals(31, intList1.size());
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        IntList intList0 = new IntList(2);
        intList0.add(2);
        intList0.add(0, (-1074));
        intList0.add(1, 10);
        assertEquals(3, intList0.size());
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1);
        intList0.add(1);
        intList0.add(0, 1);
        IntList intList1 = new IntList(1);
        intList1.addAll(intList0);
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList1.addAll(intList0);
        assertEquals(18, intList0.size());

        intList1.add(0, 0);
        assertEquals(31, intList1.size());
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        IntList intList0 = new IntList(2);
        intList0.add(2);
        intList0.add(0, (-1074));
        intList0.add(0, 1);
        assertEquals(3, intList0.size());
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        IntList intList1 = new IntList(1);
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList0.addAll(intList1);
        intList0.addAll(intList1);
        assertEquals(12, intList0.size());
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.get(1952);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // 1952
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(2, 1);
        assertEquals(4, intList0.size());
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.add((-1941), (-1941));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0);
        int int0 = intList0.size();
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0);
        int int0 = intList0.remove(0);
        assertTrue(intList0.isEmpty());
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        IntList intList0 = new IntList(1);
        intList0.add(1);
        intList0.add(1, (-1999));
        int int0 = intList0.remove(1);
        assertEquals(1, intList0.size());
        assertEquals((-1999), int0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        IntList intList0 = new IntList();
        boolean boolean0 = intList0.add(1);
        assertTrue(boolean0);

        intList0.add(1, 1);
        int int0 = intList0.get(1);
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1052);
        intList0.remove(0);
        intList0.add((-702));
        int int0 = intList0.get(0);
        assertEquals(1, intList0.size());
        assertEquals((-702), int0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.addAll((IntList) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        IntList intList0 = new IntList(0);
        boolean boolean0 = intList0.add(0);
        assertTrue(boolean0);

        int int0 = intList0.get(0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.clear();
        assertEquals(0, intList0.size());
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        IntList intList0 = new IntList(0);
        int int0 = intList0.size();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test26()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.remove(1);
        intList0.add(1, 1);
        assertEquals(4, intList0.size());
    }

    @Test(timeout = 4000)
    public void test27()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        int int0 = intList0.remove(0);
        assertFalse(intList0.isEmpty());
        assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test28()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.remove(0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test29()  throws Throwable  {
        IntList intList0 = new IntList();
        boolean boolean0 = intList0.isEmpty();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test30()  throws Throwable  {
        IntList intList0 = new IntList();
        assertTrue(intList0.isEmpty());

        intList0.add(1);
        boolean boolean0 = intList0.isEmpty();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test31()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.increment(1);
        assertEquals(2, intList0.size());
    }

    @Test(timeout = 4000)
    public void test32()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.increment(1);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // 1
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test33()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.increment((-791));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // -791
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test34()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1);
        intList0.add(1, 1);
        IntList intList1 = new IntList();
        intList1.addAll(intList0);
        intList1.addAll(intList0);
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList0.add(2, 1);
        assertEquals(25, intList0.size());
    }

    @Test(timeout = 4000)
    public void test35()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        assertFalse(intList0.isEmpty());

        intList0.add(1, 1);
        intList0.add(1);
        intList0.add(1);
        intList0.add(1);
        IntList intList1 = new IntList(1);
        intList1.addAll(intList0);
        intList1.addAll(intList0);
        intList0.addAll(intList1);
        intList1.addAll(intList0);
        intList1.add(0, 0);
        assertEquals(26, intList1.size());
    }

    @Test(timeout = 4000)
    public void test36()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.get(0);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test37()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.get((-1257));
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // -1257
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test38()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(1);
        assertFalse(intList0.isEmpty());

        intList0.clear();
        assertEquals(0, intList0.size());
    }

    @Test(timeout = 4000)
    public void test39()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.addAll(intList0);
        assertEquals(0, intList0.size());
    }

    @Test(timeout = 4000)
    public void test40()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0, 0);
        intList0.add(0, 0);
        assertEquals(2, intList0.size());
    }

    @Test(timeout = 4000)
    public void test41()  throws Throwable  {
        IntList intList0 = new IntList(0);
        intList0.add(0);
        intList0.add(0, 0);
        intList0.add(0);
        intList0.add(0, 0);
        intList0.add(1, 1);
        assertEquals(5, intList0.size());
    }

    @Test(timeout = 4000)
    public void test42()  throws Throwable  {
        IntList intList0 = new IntList();
        // Undeclared exception!
        try {
            intList0.add(1, 1);
            fail("Expecting exception: IndexOutOfBoundsException");

        } catch(IndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test43()  throws Throwable  {
        IntList intList0 = new IntList();
        intList0.add(0, 1);
        intList0.add(0);
        assertFalse(intList0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test44()  throws Throwable  {
        IntList intList0 = null;
        try {
            intList0 = new IntList((-2099));
            fail("Expecting exception: IllegalArgumentException");

        } catch(IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.pack200.IntList", e);
        }
    }

    @Test(timeout = 4000)
    public void test45()  throws Throwable  {
        IntList intList0 = new IntList();
        int[] intArray0 = intList0.toArray();
        assertEquals(0, intArray0.length);
    }
}
