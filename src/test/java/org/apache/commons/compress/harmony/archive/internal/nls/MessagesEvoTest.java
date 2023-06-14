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
package org.apache.commons.compress.harmony.archive.internal.nls;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessagesEvoTest {


    @Test(timeout = 4000)
    public void test00()  throws Throwable  {
        Object object0 = new Object();
        String string0 = Messages.getString("OPf@l{2xgD$\"9QyX", object0);
        assertEquals("OPf@l{2xgD$\"9QyX", string0);
    }

    @Test(timeout = 4000)
    public void test01()  throws Throwable  {
        String string0 = Messages.getString("HKoCBxi\">Aw{wJ{p_M", (Object) "HKoCBxi\">Aw{wJ{p_M", (Object) "HKoCBxi\">Aw{wJ{p_M");
        assertEquals("HKoCBxi\">Aw{wJ{p_M", string0);
    }

    @Test(timeout = 4000)
    public void test02()  throws Throwable  {
        Locale locale0 = Locale.KOREAN;
        ResourceBundle resourceBundle0 = Messages.setLocale(locale0, "^");
        assertNull(resourceBundle0);
    }

    @Test(timeout = 4000)
    public void test03()  throws Throwable  {
        Object[] objectArray0 = new Object[3];
        String string0 = Messages.getString("yA\"~f", objectArray0);
        assertEquals("yA\"~f", string0);
    }

    @Test(timeout = 4000)
    public void test04()  throws Throwable  {
        Object[] objectArray0 = new Object[1];
        String string0 = Messages.getString("", objectArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test05()  throws Throwable  {
        Object object0 = new Object();
        String string0 = Messages.getString("", object0, (Object) "");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test06()  throws Throwable  {
        String string0 = Messages.getString("", (Object) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test07()  throws Throwable  {
        String string0 = Messages.getString("<null>", 834);
        assertEquals("<null>", string0);
    }

    @Test(timeout = 4000)
    public void test08()  throws Throwable  {
        String string0 = Messages.getString("", (-4837));
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test09()  throws Throwable  {
        String string0 = Messages.getString("", 'o');
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        String string0 = Messages.getString((String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        String string0 = Messages.getString("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test12()  throws Throwable  {
        Object[] objectArray0 = new Object[1];
        String string0 = Messages.format("", objectArray0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test13()  throws Throwable  {
        Object object0 = new Object();
        // Undeclared exception!
        try {
            Messages.getString((String) null, (Object) null, object0);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test14()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.getString((String) null, (Object) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test15()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.getString((String) null, '+');
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test16()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.format("uEN2Ps", (Object[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test17()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.getString("/:9I.&r", (Object[]) null);
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test18()  throws Throwable  {
        Object[] objectArray0 = new Object[2];
        String string0 = Messages.format("{0,[;@/e?]8R!3U", objectArray0);
        assertEquals("{0,[;@/e?]8R!3U", string0);
    }

    @Test(timeout = 4000)
    public void test19()  throws Throwable  {
        Object[] objectArray0 = new Object[0];
        String string0 = Messages.format("{en:s]", objectArray0);
        assertEquals("{en:s]", string0);
    }

    @Test(timeout = 4000)
    public void test20()  throws Throwable  {
        Object[] objectArray0 = new Object[0];
        String string0 = Messages.format("\"{", objectArray0);
        assertEquals("\"{", string0);
    }

    @Test(timeout = 4000)
    public void test21()  throws Throwable  {
        String string0 = Messages.getString("\"{");
        assertEquals("\"{", string0);
    }

    @Test(timeout = 4000)
    public void test22()  throws Throwable  {
        Messages messages0 = new Messages();
    }

    @Test(timeout = 4000)
    public void test23()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.getString((String) null, (-6));
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.compress.harmony.archive.internal.nls.Messages", e);
        }
    }

    @Test(timeout = 4000)
    public void test24()  throws Throwable  {
        // Undeclared exception!
        try {
            Messages.setLocale((Locale) null, "");
            fail("Expecting exception: NullPointerException");

        } catch(NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.ResourceBundle", e);
        }
    }

    @Test(timeout = 4000)
    public void test25()  throws Throwable  {
        String string0 = Messages.getString("3KJcFgaC3E~?'{&q", '0');
        assertEquals("3KJcFgaC3E~?'{&q", string0);
    }
}
