package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        zipArchiveOutputStream6.setMethod(16384);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream6.createArchiveEntry(file13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        byte[] byteArray11 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray13 = zipEightByteInteger12.getBytes();
        java.lang.String str14 = zipEightByteInteger12.toString();
        zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger12);
        byte[] byteArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray16, 148, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ZipEightByteInteger value: 0" + "'", str14, "ZipEightByteInteger value: 0");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        boolean boolean6 = cpioArchiveEntry1.isPipe();
        cpioArchiveEntry1.setRemoteDeviceMaj((long) 9);
        boolean boolean9 = cpioArchiveEntry1.isPipe();
        cpioArchiveEntry1.setTime((long) 155);
        cpioArchiveEntry1.setRemoteDeviceMaj((long) 424935705);
        java.nio.charset.Charset charset14 = null;
        int int15 = cpioArchiveEntry1.getHeaderPadCount(charset14);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode((long) 424935705);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 19540119 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str3 = zipLong2.toString();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray6 = zipEightByteInteger5.getBytes();
        java.lang.String str7 = zipEightByteInteger5.toString();
        zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger5);
        java.lang.String str9 = zipEightByteInteger5.toString();
        java.lang.String str10 = zipEightByteInteger5.toString();
        java.lang.String str11 = zipEightByteInteger5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1" + "'", str3, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZipEightByteInteger value: 0" + "'", str7, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZipEightByteInteger value: 0" + "'", str9, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZipEightByteInteger value: 0" + "'", str10, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZipEightByteInteger value: 0" + "'", str11, "ZipEightByteInteger value: 0");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.lang.String str3 = dumpArchiveEntry2.getName();
        dumpArchiveEntry2.setName("ustar\000");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet6 = dumpArchiveEntry2.getPermissions();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE7 = dumpArchiveEntry2.getType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "`\n" + "'", str3, "`\n");
        org.junit.Assert.assertNotNull(pERMISSIONSet6);
        org.junit.Assert.assertTrue("'" + tYPE7 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE7.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp1.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean7 = tarArchiveEntry6.isSparse();
        tarArchiveEntry6.setMode(26127);
        java.util.Date date10 = tarArchiveEntry6.getModTime();
        x5455_ExtendedTimestamp1.setModifyJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp1.getCreateTime();
        byte[] byteArray13 = x5455_ExtendedTimestamp1.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(1687259903L, byteArray13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Jun 20 13:18:46 CEST 2023");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 22, -117, -111, 100]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream1 = null;
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(archiveOutputStream1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort3);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream5.setUseZip64(zip64Mode11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel((int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveOutputStream5.createArchiveEntry(file6, "tar");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0, (int) (byte) 103, (int) (byte) 54, "ZipShort value: 20", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 20");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(" \000", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveOutputStream5.createArchiveEntry(path7, "0x5455 Zip Extra Field: Flags=10  Access:[Thu Jan 01 01:00:01 CET 1970] ", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        boolean boolean6 = arArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, (short) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("ustar ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(21);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.nio.file.Path path13 = null;
        java.nio.file.LinkOption[] linkOptionArray15 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = arArchiveOutputStream12.createArchiveEntry(path13, "070702", linkOptionArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertNotNull(linkOptionArray15);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.TP_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10, "070702");
        java.nio.file.Path path13 = null;
        java.nio.file.LinkOption[] linkOptionArray15 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = cpioArchiveOutputStream10.createArchiveEntry(path13, "ZipShort value: 20", linkOptionArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, path1, "ZipLong value: 508", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray23);
        unicodeCommentExtraField12.setUnicodeName(byteArray23);
        unicodeCommentExtraField12.setNameCRC32((long) (short) -1);
        byte[] byteArray29 = unicodeCommentExtraField12.getLocalFileDataData();
        byte[] byteArray30 = unicodeCommentExtraField12.getLocalFileDataData();
        byte[] byteArray31 = unicodeCommentExtraField12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry33 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj34 = jarArchiveEntry33.clone();
        java.lang.Object obj35 = jarArchiveEntry33.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long39 = tarArchiveEntry38.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry43 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry47 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry47.setNames("", "ZipLong value: 1");
        int int51 = tarArchiveEntry47.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry54 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean55 = tarArchiveEntry54.isSparse();
        tarArchiveEntry54.setMode(26127);
        java.nio.file.attribute.FileTime fileTime58 = tarArchiveEntry54.getLastModifiedTime();
        tarArchiveEntry47.setModTime(fileTime58);
        cpioArchiveEntry43.setTime(fileTime58);
        tarArchiveEntry38.setStatusChangeTime(fileTime58);
        java.util.zip.ZipEntry zipEntry62 = jarArchiveEntry33.setCreationTime(fileTime58);
        java.lang.String str63 = jarArchiveEntry33.getComment();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField64 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray66 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField70 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField64, byteArray66, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger71 = null;
        zip64ExtendedInformationExtraField64.setRelativeHeaderOffset(zipEightByteInteger71);
        byte[] byteArray73 = zip64ExtendedInformationExtraField64.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField75 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray76 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray73, true, unparseableExtraField75);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray77 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray73);
        byte[] byteArray78 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray77);
        jarArchiveEntry33.setExtraFields(zipExtraFieldArray77);
        byte[] byteArray80 = jarArchiveEntry33.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromCentralDirectoryData(byteArray80, 21, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "070707");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "070707");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(fileTime58);
        org.junit.Assert.assertNotNull(zipEntry62);
        org.junit.Assert.assertEquals(zipEntry62.toString(), "070707");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField70);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray76);
        org.junit.Assert.assertNotNull(zipExtraFieldArray77);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[]");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        boolean boolean3 = asiExtraField0.isDirectory();
        byte[] byteArray4 = asiExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray7, 12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: The length is too short, only -1 bytes, expected at least 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        boolean boolean4 = cpioArchiveEntry1.isBlockDevice();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        cpioArchiveEntry1.setRemoteDeviceMin((long) 488);
        java.util.Date date8 = cpioArchiveEntry1.getLastModifiedDate();
        long long9 = cpioArchiveEntry1.getSize();
        short short10 = cpioArchiveEntry1.getFormat();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveOutputStream4.createArchiveEntry(path5, "tar", linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream2, 11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) arArchiveInputStream2, "00", true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration8 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The BCJ_PPC_FILTER method doesn't support options of type class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find((int) (short) 1);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.setUserName("hi!");
        java.lang.String str9 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean4 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setMode(26127);
        java.util.Date date7 = tarArchiveEntry3.getModTime();
        sevenZArchiveEntry0.setLastModifiedDate(date7);
        long long9 = sevenZArchiveEntry0.getCrcValue();
        boolean boolean10 = sevenZArchiveEntry0.hasStream();
        sevenZArchiveEntry0.setCreationDate((long) 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Jun 20 13:18:48 CEST 2023");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile15 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:48 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 24, -117, -111, 100]");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 409L + "'", long13 == 409L);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setTime((long) (byte) 1);
        int int13 = zipArchiveEntry10.getInternalAttributes();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = extraFieldParsingMode16.createExtraField(zipShort17);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = jarArchiveEntry15.getExtraField(zipShort17);
        jarArchiveEntry15.setMethod((int) '4');
        jarArchiveEntry15.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry15);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = jarArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry10.setGeneralPurposeBit(generalPurposeBit25);
        long long27 = zipArchiveEntry10.getDiskNumberStart();
        long long28 = zipArchiveEntry10.getSize();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(extraFieldParsingMode16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertNull(zipExtraField19);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "jar", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        tarArchiveEntry3.setName("apks");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long16 = tarArchiveEntry15.getDataOffset();
        boolean boolean17 = tarArchiveEntry3.isDescendent(tarArchiveEntry15);
        long long18 = tarArchiveEntry15.getLongGroupId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        int int4 = dumpArchiveEntry2.getHeaderHoles();
        long long5 = dumpArchiveEntry2.getOffset();
        boolean boolean6 = dumpArchiveEntry2.isFifo();
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getCentralDirectoryLength();
        byte[] byteArray4 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        scatterZipOutputStream7.close();
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream9, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream13);
        java.lang.String str15 = zipArchiveOutputStream14.getEncoding();
        zipArchiveOutputStream14.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream7.writeTo(zipArchiveOutputStream14);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: C:\\Users\\Daniele\\AppData\\Local\\Temp\\parallelscatter1073298206096778562n1");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTF8" + "'", str15, "UTF8");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        jarArchiveEntry1.setComment("ZipLong value: 11");
        java.util.Date date10 = jarArchiveEntry1.getLastModifiedDate();
        java.util.Date date11 = jarArchiveEntry1.getLastModifiedDate();
        jarArchiveEntry1.setComment("070701");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray24);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField28, byteArray30, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger35 = null;
        zip64ExtendedInformationExtraField28.setRelativeHeaderOffset(zipEightByteInteger35);
        byte[] byteArray37 = zip64ExtendedInformationExtraField28.getLocalFileDataData();
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray37);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray37);
        unicodeCommentExtraField26.setUnicodeName(byteArray37);
        unicodeCommentExtraField26.setNameCRC32((long) (short) -1);
        byte[] byteArray43 = unicodeCommentExtraField26.getLocalFileDataData();
        byte[] byteArray44 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray43);
        boolean boolean46 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray44, 60012);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray44);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData48 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        byte[] byteArray49 = unparseableExtraFieldData48.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = unparseableExtraFieldData48.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField51 = jarArchiveEntry1.getExtraField(zipShort50);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(byteArray49);
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNull(zipExtraField51);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.setBigNumberMode(0);
        long long9 = tarArchiveOutputStream5.getBytesWritten();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = tarArchiveOutputStream5.createArchiveEntry(file10, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        java.nio.file.Path path11 = null;
        java.nio.file.LinkOption linkOption13 = null;
        java.nio.file.LinkOption[] linkOptionArray14 = new java.nio.file.LinkOption[] { linkOption13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream6.createArchiveEntry(path11, "", linkOptionArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray14);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, (int) (byte) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65535 + "'", int1 == 65535);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        short short4 = resourceAlignmentExtraField2.getAlignment();
        short short5 = resourceAlignmentExtraField2.getAlignment();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = resourceAlignmentExtraField2.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp7.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean13 = tarArchiveEntry12.isSparse();
        tarArchiveEntry12.setMode(26127);
        java.util.Date date16 = tarArchiveEntry12.getModTime();
        x5455_ExtendedTimestamp7.setModifyJavaTime(date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp7.getCreateTime();
        byte[] byteArray19 = x5455_ExtendedTimestamp7.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromCentralDirectoryData(byteArray19, (int) (byte) 53, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 75 + "'", short5 == (short) 75);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Jun 20 13:18:49 CEST 2023");
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 25, -117, -111, 100]");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray23);
        unicodeCommentExtraField12.setUnicodeName(byteArray23);
        unicodeCommentExtraField12.setNameCRC32((long) (short) -1);
        byte[] byteArray29 = unicodeCommentExtraField12.getLocalFileDataData();
        byte[] byteArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromCentralDirectoryData(byteArray30, (int) (byte) 4, 2);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long3 = tarArchiveEntry2.getDataOffset();
        tarArchiveEntry2.setDataOffset((long) 257);
        java.nio.file.Path path6 = tarArchiveEntry2.getPath();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertNull(path6);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory1.getInputStreamArchiveNames();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        java.lang.String str12 = zipArchiveOutputStream11.getEncoding();
        parallelScatterZipCreator5.writeTo(zipArchiveOutputStream11);
        zipArchiveOutputStream11.setFallbackToUTF8(true);
        zipArchiveOutputStream11.setMethod(16384);
        zipArchiveOutputStream11.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory1.createArchiveOutputStream("ZipShort value: 21589", (java.io.OutputStream) zipArchiveOutputStream11, "00");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipShort value: 21589 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = zip64ExtendedInformationExtraField11.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray23 = zipEightByteInteger22.getBytes();
        java.lang.String str24 = zipEightByteInteger22.toString();
        zip64ExtendedInformationExtraField11.setCompressedSize(zipEightByteInteger22);
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger22);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField27, byteArray29, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger34 = null;
        zip64ExtendedInformationExtraField27.setRelativeHeaderOffset(zipEightByteInteger34);
        byte[] byteArray36 = zip64ExtendedInformationExtraField27.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = zip64ExtendedInformationExtraField27.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField44 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField38, byteArray40, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = null;
        zip64ExtendedInformationExtraField38.setRelativeHeaderOffset(zipEightByteInteger45);
        byte[] byteArray47 = zip64ExtendedInformationExtraField38.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger48 = zip64ExtendedInformationExtraField38.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger49 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray50 = zipEightByteInteger49.getBytes();
        java.lang.String str51 = zipEightByteInteger49.toString();
        zip64ExtendedInformationExtraField38.setCompressedSize(zipEightByteInteger49);
        zip64ExtendedInformationExtraField27.setRelativeHeaderOffset(zipEightByteInteger49);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger55 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((-1L));
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger56 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray57 = zipEightByteInteger56.getBytes();
        java.lang.String str58 = zipEightByteInteger56.toString();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger55, zipEightByteInteger56);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField60 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong62 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str63 = zipLong62.toString();
        zip64ExtendedInformationExtraField60.setDiskStartNumber(zipLong62);
        byte[] byteArray65 = zipLong62.getBytes();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField66 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger22, zipEightByteInteger49, zipEightByteInteger56, zipLong62);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort67 = zip64ExtendedInformationExtraField66.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry69 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj70 = jarArchiveEntry69.clone();
        int int71 = jarArchiveEntry69.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource72 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry69.setNameSource(nameSource72);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource74 = jarArchiveEntry69.getNameSource();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode75 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort76 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField77 = extraFieldParsingMode75.createExtraField(zipShort76);
        jarArchiveEntry69.addExtraField(zipExtraField77);
        byte[] byteArray79 = jarArchiveEntry69.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField66.parseFromCentralDirectoryData(byteArray79, (int) (byte) 52, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(zipEightByteInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ZipEightByteInteger value: 0" + "'", str24, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger48);
        org.junit.Assert.assertNotNull(zipEightByteInteger49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ZipEightByteInteger value: 0" + "'", str51, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ZipEightByteInteger value: 0" + "'", str58, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ZipLong value: 1" + "'", str63, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort67);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "070707");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + nameSource72 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource72.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource74 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource74.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(extraFieldParsingMode75);
        org.junit.Assert.assertNotNull(zipShort76);
        org.junit.Assert.assertNotNull(zipExtraField77);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[85, 84, 1, 0, 0]");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, "00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore8);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream10 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor9);
        streamCompressor9.close();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertNotNull(streamCompressor9);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = zip64ExtendedInformationExtraField1.getRelativeHeaderOffset();
        byte[] byteArray12 = zip64ExtendedInformationExtraField1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile1 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        byte[] byteArray5 = zipExtraField4.getCentralDirectoryData();
        x0015_CertificateIdForFile1.setCentralDirectoryData(byteArray5);
        byte[] byteArray7 = x0015_CertificateIdForFile1.getLocalFileDataData();
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        x0015_CertificateIdForFile1.setLocalFileDataData(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = unparseableExtraField0.onUnparseableExtraField(byteArray10, 512, 60011, false, 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 512.  Block length of 3 bytes exceeds remaining data of 60007 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0]");
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 255L + "'", long11 == 255L);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "070701", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(0L);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray10);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField15.parseFromLocalFileData(byteArray17, 110, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry4 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray3 = resourceAlignmentExtraField2.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[2, -128]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        boolean boolean4 = cpioArchiveEntry3.isSocket();
        cpioArchiveEntry3.setTime((long) (byte) 55);
        boolean boolean7 = cpioArchiveEntry3.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        cpioArchiveEntry1.setNumberOfLinks((long) 511);
        int int7 = cpioArchiveEntry1.getAlignmentBoundary();
        long long8 = cpioArchiveEntry1.getNumberOfLinks();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 511L + "'", long8 == 511L);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer15 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        long long19 = cpioArchiveInputStream17.skip((long) (byte) 100);
        cpioArchiveInputStream17.mark(6);
        boolean boolean22 = cpioArchiveInputStream17.markSupported();
        boolean boolean23 = cpioArchiveInputStream17.markSupported();
        closeableConsumer15.accept((java.io.Closeable) cpioArchiveInputStream17);
        java.io.File file25 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) cpioArchiveInputStream17, file25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNotNull(closeableConsumer15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = tarArchiveOutputStream5.createArchiveEntry(path7, "ar", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.LINK_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40960 + "'", int0 == 40960);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1);
        long long7 = tarArchiveOutputStream6.getBytesWritten();
        tarArchiveOutputStream6.flush();
        java.nio.file.Path path9 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray10 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet12 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet12, fileVisitOptionArray10);
        java.nio.file.LinkOption linkOption14 = null;
        java.nio.file.LinkOption[] linkOptionArray15 = new java.nio.file.LinkOption[] { linkOption14 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream6, path9, fileVisitOptionSet12, linkOptionArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(fileVisitOptionArray10);
        org.junit.Assert.assertNotNull(fileVisitOptionSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(linkOptionArray15);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int0 = java.util.zip.ZipEntry.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isCheckSumOK();
        long long6 = tarArchiveEntry2.getLongUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean8 = tarArchiveEntry2.isStarSparse();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("zip", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) (byte) 50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics3 = parallelScatterZipCreator2.getStatisticsMessage();
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode8.createExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = jarArchiveEntry7.getExtraField(zipShort9);
        jarArchiveEntry7.setMethod((int) '4');
        jarArchiveEntry7.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry7);
        zipArchiveEntry16.setTime((long) (byte) 1);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier19 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable20 = parallelScatterZipCreator5.createCallable(zipArchiveEntry16, inputStreamSupplier19);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier21 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator2.addArchiveEntry(zipArchiveEntry16, inputStreamSupplier21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterStatistics3);
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable20);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile7 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode8.createExtraField(zipShort9);
        byte[] byteArray11 = zipExtraField10.getCentralDirectoryData();
        x0015_CertificateIdForFile7.setCentralDirectoryData(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x0015_CertificateIdForFile7.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = jarArchiveEntry1.getExtraField(zipShort13);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = null;
        jarArchiveEntry1.setExtraFields(zipExtraFieldArray15);
        jarArchiveEntry1.setVersionRequired(29127);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipExtraField14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        long long5 = streamCompressor4.getBytesWrittenForLastEntry();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile6 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm7 = x0015_CertificateIdForFile6.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x0015_CertificateIdForFile6.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm9 = x0015_CertificateIdForFile6.getHashAlgorithm();
        int int10 = x0015_CertificateIdForFile6.getRecordCount();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        x0015_CertificateIdForFile6.setCentralDirectoryData(byteArray20);
        streamCompressor4.writeCounted(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray20, 60012);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertNotNull(streamCompressor4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(hashAlgorithm7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(hashAlgorithm9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("ustar ");
        sevenZArchiveEntry0.setCrc(131);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean8 = tarArchiveEntry7.isSparse();
        tarArchiveEntry7.setUserName("ZipLong value: 1");
        boolean boolean11 = tarArchiveEntry7.isStreamContiguous();
        boolean boolean12 = tarArchiveEntry7.isStreamContiguous();
        tarArchiveEntry7.setDataOffset((long) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry18.setNames("", "ZipLong value: 1");
        int int22 = tarArchiveEntry18.getGroupId();
        tarArchiveEntry18.setNames("apks", "arj");
        boolean boolean26 = tarArchiveEntry7.isDescendent(tarArchiveEntry18);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean30 = tarArchiveEntry29.isSparse();
        tarArchiveEntry29.setMode(26127);
        java.nio.file.attribute.FileTime fileTime33 = tarArchiveEntry29.getLastModifiedTime();
        tarArchiveEntry7.setCreationTime(fileTime33);
        sevenZArchiveEntry0.setLastModifiedTime(fileTime33);
        boolean boolean36 = sevenZArchiveEntry0.getHasCrc();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date37 = sevenZArchiveEntry0.getAccessDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fileTime33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        tarArchiveEntry2.setGroupId(257);
        java.lang.String str10 = tarArchiveEntry2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:52 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = jarArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = jarArchiveInputStream10.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry16.getOrderedSparseHeaders();
        java.lang.String str19 = tarArchiveEntry16.getExtraPaxHeader("");
        java.nio.file.attribute.FileTime fileTime20 = null;
        tarArchiveEntry16.setCreationTime(fileTime20);
        boolean boolean22 = jarArchiveInputStream10.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry16);
        long long24 = jarArchiveInputStream10.skip(312764400000L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream25 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) jarArchiveInputStream10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 148, 2526, "apkm", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, 8192, "UTF8");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        zipArchiveOutputStream6.setMethod(16384);
        java.nio.file.Path path13 = null;
        java.nio.file.LinkOption linkOption15 = null;
        java.nio.file.LinkOption[] linkOptionArray16 = new java.nio.file.LinkOption[] { linkOption15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = zipArchiveOutputStream6.createArchiveEntry(path13, "`\n", linkOptionArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray16);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 21);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = jarArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = jarArchiveInputStream10.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry16.getOrderedSparseHeaders();
        java.lang.String str19 = tarArchiveEntry16.getExtraPaxHeader("");
        java.nio.file.attribute.FileTime fileTime20 = null;
        tarArchiveEntry16.setCreationTime(fileTime20);
        boolean boolean22 = jarArchiveInputStream10.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry16);
        long long24 = jarArchiveInputStream10.skip(312764400000L);
        long long25 = jarArchiveInputStream10.getUncompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveInputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        java.io.OutputStream outputStream8 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream8, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream12);
        java.lang.String str14 = zipArchiveOutputStream13.getEncoding();
        zipArchiveOutputStream13.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream13, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode19 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream13.setUseZip64(zip64Mode19);
        zipArchiveOutputStream5.setUseZip64(zip64Mode19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTF8" + "'", str14, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode19 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode19.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream5.setEncoding("070701");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel(345);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 345");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        long long6 = cpioArchiveEntry1.getRemoteDeviceMaj();
        long long7 = cpioArchiveEntry1.getGID();
        long long8 = cpioArchiveEntry1.getChksum();
        cpioArchiveEntry1.setNumberOfLinks((long) 24576);
        long long11 = cpioArchiveEntry1.getTime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 156L + "'", long7 == 156L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1);
        tarArchiveOutputStream6.setLongFileMode(0);
        java.nio.file.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream6, path9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int1 = arjArchiveEntry0.getUnixMode();
        int int2 = arjArchiveEntry0.getHostOs();
        int int3 = arjArchiveEntry0.getHostOs();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("ZipLong value: 1");
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        boolean boolean7 = tarArchiveEntry2.isStreamContiguous();
        tarArchiveEntry2.setDataOffset((long) (short) 100);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry13.setNames("", "ZipLong value: 1");
        int int17 = tarArchiveEntry13.getGroupId();
        tarArchiveEntry13.setNames("apks", "arj");
        boolean boolean21 = tarArchiveEntry2.isDescendent(tarArchiveEntry13);
        boolean boolean22 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:52 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 28, -117, -111, 100]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.lang.String str8 = zipArchiveOutputStream7.getEncoding();
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, "070701");
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("unknown compressed size", (java.io.OutputStream) zipArchiveOutputStream7, file13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: unknown compressed size not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("././@LongLink", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray10, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        java.io.File file8 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer9 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ZipLong value: 508", outputStream2, file8, closeableConsumer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: OutputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer9);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.pathBased(path0, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort((int) '4', byteArray14, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("070707", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray4 = resourceAlignmentExtraField3.getLocalFileDataData();
        x0019_EncryptionRecipientCertificateList0.setCentralDirectoryData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = x0019_EncryptionRecipientCertificateList0.getLocalFileDataLength();
        byte[] byteArray8 = new byte[] { (byte) -1 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            x0019_EncryptionRecipientCertificateList0.parseFromCentralDirectoryData(byteArray8, 96, 16877);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[2, -128]");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        byte byte6 = tarArchiveEntry2.getLinkFlag();
        long long7 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 48 + "'", byte6 == (byte) 48);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp3.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry8.isSparse();
        tarArchiveEntry8.setMode(26127);
        java.util.Date date12 = tarArchiveEntry8.getModTime();
        x5455_ExtendedTimestamp3.setModifyJavaTime(date12);
        byte[] byteArray15 = new byte[] { (byte) -1 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp3, byteArray16, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime21 = null;
        x5455_ExtendedTimestamp3.setAccessFileTime(fileTime21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = x5455_ExtendedTimestamp3.getCreateTime();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = x5455_ExtendedTimestamp3.getCentralDirectoryData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:18:53 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNull(zipLong23);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream5.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.lang.String str8 = zipArchiveOutputStream7.getEncoding();
        zipArchiveOutputStream7.setUseLanguageEncodingFlag(false);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("tar", (java.io.OutputStream) zipArchiveOutputStream7, file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ustar ", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        java.lang.String str1 = sevenZArchiveEntry0.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField14);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray12, 40960, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3, false, (long) 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_LINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 49 + "'", byte0 == (byte) 49);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("070707", (long) '4');
        int int3 = arArchiveEntry2.getGroupId();
        java.lang.String str4 = arArchiveEntry2.getName();
        java.lang.String str5 = arArchiveEntry2.getName();
        long long6 = arArchiveEntry2.getLastModified();
        long long7 = arArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "070707" + "'", str4, "070707");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1687259934L + "'", long6 == 1687259934L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, true, unparseableExtraField11);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray13);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray15, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = cpioArchiveOutputStream5.createArchiveEntry(path6, "070707", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        jarArchiveEntry1.setComment("ZipLong value: 11");
        java.util.Date date10 = jarArchiveEntry1.getLastModifiedDate();
        java.util.Date date11 = jarArchiveEntry1.getLastModifiedDate();
        jarArchiveEntry1.setInternalAttributes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:59:59 CET 1970");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource3 = jarArchiveEntry1.getNameSource();
        java.lang.String str4 = jarArchiveEntry1.getComment();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + nameSource3 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource3.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        sevenZArchiveEntry0.setHasLastModifiedDate(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        tarArchiveEntry2.setNames("arj", "arj");
        tarArchiveEntry2.clearExtraPaxHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean12 = tarArchiveEntry11.isSparse();
        tarArchiveEntry11.setMode(26127);
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        java.lang.String str16 = tarArchiveEntry11.getUserName();
        boolean boolean17 = tarArchiveEntry11.isSparse();
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry11);
        boolean boolean19 = tarArchiveEntry11.isStreamContiguous();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:54 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "never", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp3.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry8.isSparse();
        tarArchiveEntry8.setMode(26127);
        java.util.Date date12 = tarArchiveEntry8.getModTime();
        x5455_ExtendedTimestamp3.setModifyJavaTime(date12);
        byte[] byteArray15 = new byte[] { (byte) -1 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp3, byteArray16, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime21 = null;
        x5455_ExtendedTimestamp3.setAccessFileTime(fileTime21);
        java.lang.Object obj23 = x5455_ExtendedTimestamp3.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp24 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp24.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean30 = tarArchiveEntry29.isSparse();
        tarArchiveEntry29.setMode(26127);
        java.util.Date date33 = tarArchiveEntry29.getModTime();
        x5455_ExtendedTimestamp24.setModifyJavaTime(date33);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong35 = x5455_ExtendedTimestamp24.getCreateTime();
        byte[] byteArray36 = x5455_ExtendedTimestamp24.getLocalFileDataData();
        byte byte37 = x5455_ExtendedTimestamp24.getFlags();
        java.util.Date date38 = x5455_ExtendedTimestamp24.getModifyJavaTime();
        x5455_ExtendedTimestamp3.setModifyJavaTime(date38);
        byte byte40 = x5455_ExtendedTimestamp3.getFlags();
        java.lang.Object obj41 = x5455_ExtendedTimestamp3.clone();
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:18:54 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Tue Jun 20 13:18:54 CEST 2023");
        org.junit.Assert.assertNull(zipLong35);
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 30, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 75 + "'", byte37 == (byte) 75);
        org.junit.Assert.assertNotNull(date38);
// flaky:         org.junit.Assert.assertEquals(date38.toString(), "Tue Jun 20 13:18:54 CEST 2023");
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -3 + "'", byte40 == (byte) -3);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray6, (int) (short) -1);
        jarArchiveEntry3.setExtra(byteArray6);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray6);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse14 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray6, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry9 = arArchiveInputStream8.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        java.nio.channels.SeekableByteChannel seekableByteChannel16 = null;
        java.io.File file17 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ZipEightByteInteger value: 0", seekableByteChannel16, file17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The BCJ_ARM_FILTER method doesn't support options of type class java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp11.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean17 = tarArchiveEntry16.isSparse();
        tarArchiveEntry16.setMode(26127);
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        x5455_ExtendedTimestamp11.setModifyJavaTime(date20);
        zipArchiveEntry10.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp11);
        zipArchiveEntry10.setTime((long) 488);
        java.lang.Object obj25 = zipArchiveEntry10.clone();
        zipArchiveEntry10.setTime((long) 493);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource28 = zipArchiveEntry10.getNameSource();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Jun 20 13:18:55 CEST 2023");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "070707");
        org.junit.Assert.assertTrue("'" + nameSource28 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource28.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField18 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray16, true, unparseableExtraField18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray19);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream6.write(byteArray20, (int) (byte) 2, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date2 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.setModifyJavaTime(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: X5455 timestamps must fit in a signed 32 bit integer: -11644473600");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Mon Jan 01 01:00:00 CET 1601");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        long long6 = cpioArchiveEntry1.getRemoteDeviceMaj();
        cpioArchiveEntry1.setDeviceMaj(0L);
        long long9 = cpioArchiveEntry1.getDeviceMaj();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "0x7875 Zip Extra Field: UID=1000 GID=1000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        int int8 = tarArchiveOutputStream5.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray10 = zipEightByteInteger9.getBytes();
        zip64ExtendedInformationExtraField2.setCompressedSize(zipEightByteInteger9);
        byte[] byteArray12 = zip64ExtendedInformationExtraField2.getCentralDirectoryData();
        x0016_CertificateIdForCentralDirectory1.parseFromCentralDirectoryData(byteArray12, 1, 12);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray12, 155, 26127);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(zipEightByteInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream2 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream(inputStream0, " \000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode1.createExtraField(zipShort2);
        byte[] byteArray4 = zipExtraField3.getCentralDirectoryData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray4);
        byte[] byteArray6 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm7 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = zip64ExtendedInformationExtraField8.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromCentralDirectoryData(byteArray9, 64, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(hashAlgorithm7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        java.util.concurrent.ExecutorService executorService4 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode8.createExtraField(zipShort9);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = jarArchiveEntry7.getExtraField(zipShort9);
        jarArchiveEntry7.setMethod((int) '4');
        jarArchiveEntry7.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry7);
        zipArchiveEntry16.setTime((long) (byte) 1);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier19 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable20 = parallelScatterZipCreator5.createCallable(zipArchiveEntry16, inputStreamSupplier19);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator3.submitStreamAwareCallable(scatterZipOutputStreamCallable20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode8);
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNull(zipExtraField11);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable20);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray5 = new char[] { ' ', '4', '#', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " 4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " 4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , 4, #, a]");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        jarArchiveEntry1.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry13 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource14 = jarArchiveEntry13.getNameSource();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry13);
        byte[] byteArray16 = jarArchiveEntry13.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + nameSource14 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource14.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream2);
        tarArchiveOutputStream7.setLongFileMode(0);
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("UTF8", (java.io.OutputStream) tarArchiveOutputStream7, file10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: UTF8 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(2526);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        long long3 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = null;
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("compressionElapsed=-1687259892275ms, mergingElapsed=0ms");
        int int2 = cpioArchiveEntry1.getDataPadCount();
        long long3 = cpioArchiveEntry1.getRemoteDeviceMin();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder0.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder4.withUseDefaultNameForUnnamedEntries(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder4.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder10 = builder4.withUseDefaultNameForUnnamedEntries(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder12 = builder10.withTryToRecoverBrokenArchives(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "arj", false, true);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        long long14 = cpioArchiveInputStream1.skip((long) 464);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray23);
        unicodeCommentExtraField12.setUnicodeName(byteArray23);
        byte[] byteArray27 = unicodeCommentExtraField12.getUnicodeName();
        byte[] byteArray28 = unicodeCommentExtraField12.getUnicodeName();
        byte[] byteArray30 = new byte[] { (byte) -1 };
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        long long32 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray30);
        boolean boolean34 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray30, 0);
        unicodeCommentExtraField12.setUnicodeName(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray30, zipEncoding36, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1]");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 255L + "'", long32 == 255L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray13);
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) unicodeCommentExtraField15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = new org.apache.commons.compress.archivers.zip.ZipLong(11);
        java.lang.String str19 = zipLong18.toString();
        x5455_ExtendedTimestamp0.setAccessTime(zipLong18);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ZipLong value: 11" + "'", str19, "ZipLong value: 11");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("apks", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        long long9 = cpioArchiveInputStream1.skip((long) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix1 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix1.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = resourceAlignmentExtraField6.getHeaderId();
        short short8 = resourceAlignmentExtraField6.getAlignment();
        short short9 = resourceAlignmentExtraField6.getAlignment();
        byte[] byteArray10 = resourceAlignmentExtraField6.getCentralDirectoryData();
        x7875_NewUnix1.parseFromCentralDirectoryData(byteArray10, (int) (short) -1, 148);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 6, byteArray10, 60011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60011");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 75 + "'", short8 == (short) 75);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 75 + "'", short9 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[75, -128]");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        dumpArchiveEntry2.setOffset((long) (byte) 51);
        long long5 = dumpArchiveEntry2.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode6.createExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode9.createExtraField(zipShort10);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = extraFieldParsingMode6.createExtraField(zipShort10);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature13 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        java.lang.String str14 = feature13.toString();
        boolean boolean15 = zipShort10.equals((java.lang.Object) feature13);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj18 = jarArchiveEntry17.clone();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException19 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature13, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry17);
        java.util.Date date20 = jarArchiveEntry17.getLastModifiedDate();
        dumpArchiveEntry2.setAccessTime(date20);
        int int22 = dumpArchiveEntry2.getHeaderHoles();
        dumpArchiveEntry2.setGeneration((int) (byte) 75);
        java.util.Date date25 = dumpArchiveEntry2.getAccessTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(extraFieldParsingMode9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(feature13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "compression method" + "'", str14, "compression method");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "070707");
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 00:59:59 CET 1970");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream1);
        long long7 = tarArchiveOutputStream6.getBytesWritten();
        tarArchiveOutputStream6.flush();
        tarArchiveOutputStream6.setLongFileMode(257);
        java.nio.file.Path path11 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream6, path11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray4 = new char[] { ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "!<arch>\n", charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong1);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = zip64ExtendedInformationExtraField0.getSize();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray7 = resourceAlignmentExtraField6.getLocalFileDataData();
        byte[] byteArray8 = resourceAlignmentExtraField6.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray8, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[2, -128]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[2, -128]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("070702");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.find(424935705);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { ' ', '#', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray4, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , #, #]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (byte) 12);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        tarArchiveEntry2.setSize((long) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        boolean boolean6 = arArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.nio.file.attribute.FileTime fileTime9 = jarArchiveEntry8.getLastAccessTime();
        jarArchiveEntry8.setMethod(424935705);
        jarArchiveEntry8.setExternalAttributes((long) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(fileTime9);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.zip.ZipFile zipFile15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean4 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setMode(26127);
        java.util.Date date7 = tarArchiveEntry3.getModTime();
        sevenZArchiveEntry0.setLastModifiedDate(date7);
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        boolean boolean11 = sevenZArchiveEntry0.getHasCreationDate();
        boolean boolean12 = sevenZArchiveEntry0.isDirectory();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime13 = sevenZArchiveEntry0.getLastModifiedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Jun 20 13:18:57 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        arArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory1.createArchiveOutputStream("tar", (java.io.OutputStream) cpioArchiveOutputStream9, "UTF8");
        java.util.Set<java.lang.String> strSet12 = archiveStreamFactory1.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(archiveOutputStream11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.setLongFileMode(2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean8 = tarArchiveEntry7.isSparse();
        tarArchiveEntry7.setMode(26127);
        boolean boolean11 = tarArchiveEntry7.isOldGNUSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry15.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList19 = tarArchiveEntry15.getOrderedSparseHeaders();
        tarArchiveEntry7.setSparseHeaders(tarArchiveStructSparseList19);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList19);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        java.util.Date date2 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong1);
        byte[] byteArray8 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile9 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8);
        zipLong1.putLong(byteArray8, (int) (byte) 1);
        java.lang.Object obj12 = zipLong1.clone();
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[88, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "ZipLong value: 0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "ZipLong value: 0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "ZipLong value: 0");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp7.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean13 = tarArchiveEntry12.isSparse();
        tarArchiveEntry12.setMode(26127);
        java.util.Date date16 = tarArchiveEntry12.getModTime();
        x5455_ExtendedTimestamp7.setModifyJavaTime(date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp7.getCreateTime();
        byte[] byteArray19 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray19, 16384, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Jun 20 13:18:57 CEST 2023");
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 33, -117, -111, 100]");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("070707", (long) '4');
        int int3 = arArchiveEntry2.getGroupId();
        long long4 = arArchiveEntry2.getSize();
        long long5 = arArchiveEntry2.getLength();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        arArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory1.createArchiveOutputStream("tar", (java.io.OutputStream) cpioArchiveOutputStream9, "UTF8");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream9.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveOutputStream11);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp3.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp3.setModifyTime(zipLong7);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode10 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = extraFieldParsingMode10.createExtraField(zipShort11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode13 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode13.createExtraField(zipShort14);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = extraFieldParsingMode10.createExtraField(zipShort14);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature17 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        java.lang.String str18 = feature17.toString();
        boolean boolean19 = zipShort14.equals((java.lang.Object) feature17);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry21 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj22 = jarArchiveEntry21.clone();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException23 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature17, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry21);
        int int24 = jarArchiveEntry21.getUnixMode();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp25 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp25.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean31 = tarArchiveEntry30.isSparse();
        tarArchiveEntry30.setMode(26127);
        java.util.Date date34 = tarArchiveEntry30.getModTime();
        x5455_ExtendedTimestamp25.setModifyJavaTime(date34);
        byte[] byteArray36 = x5455_ExtendedTimestamp25.getLocalFileDataData();
        boolean boolean37 = x5455_ExtendedTimestamp25.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry39 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode40 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort41 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField42 = extraFieldParsingMode40.createExtraField(zipShort41);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField43 = jarArchiveEntry39.getExtraField(zipShort41);
        jarArchiveEntry39.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp46 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp46.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField50 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray52 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField56 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField50, byteArray52, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger57 = null;
        zip64ExtendedInformationExtraField50.setRelativeHeaderOffset(zipEightByteInteger57);
        byte[] byteArray59 = zip64ExtendedInformationExtraField50.getLocalFileDataData();
        byte[] byteArray60 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray59);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField61 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray59);
        boolean boolean62 = x5455_ExtendedTimestamp46.equals((java.lang.Object) unicodeCommentExtraField61);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort63 = x5455_ExtendedTimestamp46.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry66 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long67 = tarArchiveEntry66.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry71 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry75 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry75.setNames("", "ZipLong value: 1");
        int int79 = tarArchiveEntry75.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry82 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean83 = tarArchiveEntry82.isSparse();
        tarArchiveEntry82.setMode(26127);
        java.nio.file.attribute.FileTime fileTime86 = tarArchiveEntry82.getLastModifiedTime();
        tarArchiveEntry75.setModTime(fileTime86);
        cpioArchiveEntry71.setTime(fileTime86);
        tarArchiveEntry66.setStatusChangeTime(fileTime86);
        x5455_ExtendedTimestamp46.setModifyFileTime(fileTime86);
        java.util.zip.ZipEntry zipEntry91 = jarArchiveEntry39.setLastAccessTime(fileTime86);
        x5455_ExtendedTimestamp25.setAccessFileTime(fileTime86);
        java.util.zip.ZipEntry zipEntry93 = jarArchiveEntry21.setLastAccessTime(fileTime86);
        x5455_ExtendedTimestamp0.setModifyFileTime(fileTime86);
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(extraFieldParsingMode10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(extraFieldParsingMode13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(feature17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "compression method" + "'", str18, "compression method");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "070707");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Tue Jun 20 13:18:57 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, 33, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(extraFieldParsingMode40);
        org.junit.Assert.assertNotNull(zipShort41);
        org.junit.Assert.assertNotNull(zipExtraField42);
        org.junit.Assert.assertNull(zipExtraField43);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField56);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(zipShort63);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(fileTime86);
        org.junit.Assert.assertNotNull(zipEntry91);
        org.junit.Assert.assertEquals(zipEntry91.toString(), "070707");
        org.junit.Assert.assertNotNull(zipEntry93);
        org.junit.Assert.assertEquals(zipEntry93.toString(), "070707");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream5.createArchiveEntry(file7, "zip");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF8", byteArray10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unicodePathExtraField13.getCentralDirectoryLength();
        unicodePathExtraField13.setNameCRC32((long) (-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        boolean boolean4 = dumpArchiveEntry2.isChrDev();
        dumpArchiveEntry2.setGeneration(508);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.util.Date date1 = arjArchiveEntry0.getLastModifiedDate();
        long long2 = arjArchiveEntry0.getSize();
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        jarArchiveEntry1.setComment("ZipLong value: 11");
        java.util.Date date10 = jarArchiveEntry1.getLastModifiedDate();
        java.util.Date date11 = jarArchiveEntry1.getLastModifiedDate();
        jarArchiveEntry1.setComment("070701");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray24);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField28, byteArray30, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger35 = null;
        zip64ExtendedInformationExtraField28.setRelativeHeaderOffset(zipEightByteInteger35);
        byte[] byteArray37 = zip64ExtendedInformationExtraField28.getLocalFileDataData();
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray37);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray37);
        unicodeCommentExtraField26.setUnicodeName(byteArray37);
        unicodeCommentExtraField26.setNameCRC32((long) (short) -1);
        byte[] byteArray43 = unicodeCommentExtraField26.getLocalFileDataData();
        byte[] byteArray44 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray43);
        boolean boolean46 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray44, 60012);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray44);
        java.lang.String str48 = jarArchiveEntry1.getName();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "070707" + "'", str48, "070707");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setMethod((int) (byte) 100);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry10 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean14 = tarArchiveEntry13.isSparse();
        tarArchiveEntry13.setMode(26127);
        java.util.Date date17 = tarArchiveEntry13.getModTime();
        sevenZArchiveEntry10.setLastModifiedDate(date17);
        sevenZArchiveEntry10.setHasLastModifiedDate(false);
        boolean boolean21 = sevenZArchiveEntry10.getHasCreationDate();
        boolean boolean22 = sevenZArchiveEntry10.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry26.setNames("", "ZipLong value: 1");
        int int30 = tarArchiveEntry26.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean34 = tarArchiveEntry33.isSparse();
        tarArchiveEntry33.setMode(26127);
        java.nio.file.attribute.FileTime fileTime37 = tarArchiveEntry33.getLastModifiedTime();
        tarArchiveEntry26.setModTime(fileTime37);
        sevenZArchiveEntry10.setCreationTime(fileTime37);
        java.util.zip.ZipEntry zipEntry40 = jarArchiveEntry1.setLastAccessTime(fileTime37);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Jun 20 13:18:58 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(fileTime37);
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "070707");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream3);
        tarArchiveInputStream5.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "apkm", false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream12 = archiveStreamFactory0.createArchiveInputStream("070707", (java.io.InputStream) tarArchiveInputStream5, "`\n");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070707 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> wildcardIterable2 = sevenZArchiveEntry0.getContentMethods();
        sevenZArchiveEntry0.setHasAccessDate(true);
        boolean boolean5 = sevenZArchiveEntry0.getHasLastModifiedDate();
        sevenZArchiveEntry0.setDirectory(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(wildcardIterable2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("never", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        asiExtraField0.setUserId((int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setGroupId(3);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(path0, "ar", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("hi!", (long) 420);
        int int3 = arArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        zipArchiveOutputStream5.setEncoding("070701");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry13 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj14 = jarArchiveEntry13.clone();
        int int15 = jarArchiveEntry13.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry13.setNameSource(nameSource16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource18 = jarArchiveEntry13.getNameSource();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode19 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = extraFieldParsingMode19.createExtraField(zipShort20);
        jarArchiveEntry13.addExtraField(zipExtraField21);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "never" + "'", str8, "never");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "070707");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + nameSource16 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource16.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource18 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource18.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(extraFieldParsingMode19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(zipExtraField21);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.util.Date date1 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.lang.String str3 = zipEightByteInteger2.toString();
        x000A_NTFS0.setModifyTime(zipEightByteInteger2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray8 = new byte[] { (byte) -1 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray8);
        boolean boolean11 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray9, (int) (short) -1);
        jarArchiveEntry6.setExtra(byteArray9);
        jarArchiveEntry6.setComment("ZipLong value: 11");
        java.util.Date date15 = jarArchiveEntry6.getLastModifiedDate();
        x000A_NTFS0.setModifyJavaTime(date15);
        byte[] byteArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromLocalFileData(byteArray17, 464, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:59:59 CET 1970");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 464, "xapk");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 464");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.lang.String str2 = archiveStreamFactory0.getEntryEncoding();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream17 = archiveStreamFactory0.createArchiveOutputStream("`\n", (java.io.OutputStream) zipArchiveOutputStream10, "0x7875 Zip Extra Field: UID=1000 GID=1000");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: `? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        long long8 = jarArchiveEntry1.getTime();
        long long9 = jarArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode10 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = extraFieldParsingMode10.onUnparseableExtraField(byteArray11, 512, 0, false, 3);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix17 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x7875_NewUnix17.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = extraFieldParsingMode10.createExtraField(zipShort18);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = jarArchiveEntry1.getExtraFields((org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode10);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix21 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x7875_NewUnix21.getLocalFileDataLength();
        byte[] byteArray23 = x7875_NewUnix21.getLocalFileDataData();
        java.lang.String str24 = x7875_NewUnix21.toString();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField25 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField25, byteArray27, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = null;
        zip64ExtendedInformationExtraField25.setRelativeHeaderOffset(zipEightByteInteger32);
        byte[] byteArray34 = zip64ExtendedInformationExtraField25.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField36 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray37 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray34, true, unparseableExtraField36);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField42 = extraFieldParsingMode10.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x7875_NewUnix21, byteArray34, 2162688, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(extraFieldParsingMode10);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 2, -24, 3, 2, -24, 3]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str24, "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray37);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream6.setUseZip64(zip64Mode11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (short) -1, 64, true, 16384);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNull(zipExtraField8);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:59 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 35, -117, -111, 100]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF8", byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray10, 26127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray4 = new char[] { 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , #]");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("compressionElapsed=-1687259938604ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687259938604ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) -1, "ustar ", (long) 420);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "apkm", "compressionElapsed=-1687259893320ms, mergingElapsed=0ms", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687259893320ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { 'a', ' ', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean6 = sevenZFileOptions5.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray4, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , a]");
        org.junit.Assert.assertNotNull(sevenZFileOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CRC_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str3 = zipLong2.toString();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        byte[] byteArray5 = zipLong2.getBytes();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding6, false, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1" + "'", str3, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0]");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder2.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder6.withUseDefaultNameForUnnamedEntries(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder10 = builder6.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray1, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(sevenZFileOptions11);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("7z", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { 'a', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a,  , a]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.setAddPaxHeadersForNonAsciiNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (short) (byte) 83, (int) (byte) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find((int) (byte) 88);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(4);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) cpioArchiveInputStream2, file7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod3 = sevenZMethodConfiguration1.getMethod();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration4 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod3);
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + sevenZMethod3 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod3.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        long long11 = cpioArchiveInputStream3.skip((long) (byte) 2);
        java.nio.file.Path path12 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer13 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("apkm", (java.io.InputStream) cpioArchiveInputStream3, path12, closeableConsumer13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: apkm not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(closeableConsumer13);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "00");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "compressionElapsed=-1687259933216ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687259933216ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = tarArchiveEntry2.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime4 = tarArchiveEntry2.getLastModifiedTime();
        long long5 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile1 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0015_CertificateIdForFile1.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile1.getHeaderId();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        boolean boolean15 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, (int) (byte) -1);
        x0015_CertificateIdForFile1.setLocalFileDataData(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 128, byteArray13, 256, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 128=200 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        long long5 = tarArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, true, unparseableExtraField11);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray13);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.io.File file0 = null;
        char[] charArray7 = new char[] { ' ', ' ', ' ', 'a', '#', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean9 = sevenZFileOptions8.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray7, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "   a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "   a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  ,  , a, #, a]");
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.lang.String str5 = dumpArchiveEntry2.getSimpleName();
        boolean boolean6 = dumpArchiveEntry2.isSocket();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray10 = new byte[] { (byte) -1 };
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) -1);
        jarArchiveEntry8.setExtra(byteArray11);
        jarArchiveEntry8.setComment("ZipLong value: 11");
        java.util.Date date17 = jarArchiveEntry8.getLastModifiedDate();
        java.util.Date date18 = jarArchiveEntry8.getLastModifiedDate();
        dumpArchiveEntry2.setAccessTime(date18);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp20 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp20.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField24 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField24, byteArray26, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = null;
        zip64ExtendedInformationExtraField24.setRelativeHeaderOffset(zipEightByteInteger31);
        byte[] byteArray33 = zip64ExtendedInformationExtraField24.getLocalFileDataData();
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray33);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField35 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray33);
        boolean boolean36 = x5455_ExtendedTimestamp20.equals((java.lang.Object) unicodeCommentExtraField35);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = x5455_ExtendedTimestamp20.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort38 = x5455_ExtendedTimestamp20.getLocalFileDataLength();
        x5455_ExtendedTimestamp20.setFlags((byte) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = x5455_ExtendedTimestamp20.getAccessTime();
        boolean boolean42 = dumpArchiveEntry2.equals((java.lang.Object) zipLong41);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(zipShort38);
        org.junit.Assert.assertNull(zipLong41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = jarArchiveEntry1.getExtraFields();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.setCrc((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid entry crc-32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp1.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        boolean boolean17 = x5455_ExtendedTimestamp1.equals((java.lang.Object) unicodeCommentExtraField16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp1.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = extraFieldParsingMode0.createExtraField(zipShort18);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField20 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = asiExtraField20.getCentralDirectoryLength();
        byte[] byteArray22 = asiExtraField20.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField23 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray25 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField23, byteArray25, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = null;
        zip64ExtendedInformationExtraField23.setRelativeHeaderOffset(zipEightByteInteger30);
        byte[] byteArray32 = zip64ExtendedInformationExtraField23.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField36 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField20, byteArray32, 128, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField29);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setNames("apks", "arj");
        tarArchiveEntry3.setDevMajor(464);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray6 = new char[] { 'a', 'a', 'a', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions7 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipLong value: 508", charArray6, sevenZFileOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "aaa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "aaa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, a, a, 4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions7);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        boolean boolean7 = jarArchiveEntry1.isStreamContiguous();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry5 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet6 = dumpArchiveEntry5.getPermissions();
        java.util.Date date7 = dumpArchiveEntry5.getAccessTime();
        boolean boolean8 = jarArchiveEntry1.equals((java.lang.Object) dumpArchiveEntry5);
        dumpArchiveEntry5.setOffset(1687259913L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertNotNull(pERMISSIONSet6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        tarArchiveInputStream3.reset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream3.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isGNULongNameEntry();
        long long6 = tarArchiveEntry2.getDataOffset();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        cpioArchiveEntry1.setDeviceMin(133317334738600000L);
        long long4 = cpioArchiveEntry1.getInode();
        java.util.Date date5 = cpioArchiveEntry1.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipShort value: 0", byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse(0L, 1687259929L);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        cpioArchiveEntry1.setDeviceMin(133317334738600000L);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray3);
        byte[] byteArray5 = unicodePathExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = unicodePathExtraField4.getCentralDirectoryLength();
        byte[] byteArray8 = new byte[] { (byte) -1 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray8);
        boolean boolean11 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray9, (int) (short) -1);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField4.parseFromLocalFileData(byteArray9, 424935705, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 424935705");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, -1, 90, 105, 112, 76, 111, 110, 103, 32, 118, 97, 108, 117, 101, 58, 32, 49]");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 255L + "'", long12 == 255L);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getVersionRequired();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        boolean boolean2 = asiExtraField0.isLink();
        java.lang.Object obj3 = asiExtraField0.clone();
        asiExtraField0.setMode((int) (short) 2);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 52, true);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("ZipLong value: 508");
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = null;
        java.nio.file.Path path16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile15, path16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) 508, (int) (byte) 75);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("zip", byteArray10, 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, "apkm", false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) cpioArchiveInputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray11);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray24);
        unicodeCommentExtraField13.setUnicodeName(byteArray24);
        byte[] byteArray28 = unicodeCommentExtraField13.getUnicodeName();
        byte[] byteArray29 = unicodeCommentExtraField13.getUnicodeName();
        byte[] byteArray31 = new byte[] { (byte) -1 };
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray31);
        long long33 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray31);
        boolean boolean35 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray31, 0);
        unicodeCommentExtraField13.setUnicodeName(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(1, byteArray31, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 255L + "'", long33 == 255L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070701", (long) 511);
        long long3 = cpioArchiveEntry2.getSize();
        cpioArchiveEntry2.setChksum((long) 110);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 511L + "'", long3 == 511L);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode15 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode15.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode18 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode18.createExtraField(zipShort19);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = extraFieldParsingMode15.createExtraField(zipShort19);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode15);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField25 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = resourceAlignmentExtraField25.getHeaderId();
        short short27 = resourceAlignmentExtraField25.getAlignment();
        short short28 = resourceAlignmentExtraField25.getAlignment();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str32 = zipLong31.toString();
        zip64ExtendedInformationExtraField29.setDiskStartNumber(zipLong31);
        byte[] byteArray34 = zip64ExtendedInformationExtraField29.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = extraFieldParsingMode15.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField25, byteArray34, 257, (int) (byte) -3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 257 > 254");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(extraFieldParsingMode15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(extraFieldParsingMode18);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 75 + "'", short27 == (short) 75);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 75 + "'", short28 == (short) 75);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ZipLong value: 1" + "'", str32, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode3.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = extraFieldParsingMode0.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = zipExtraField6.getHeaderId();
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertNotNull(extraFieldParsingMode3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveInputStreamProviders();
        java.lang.String str3 = archiveStreamFactory1.getEntryEncoding();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream10.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream18 = archiveStreamFactory1.createArchiveOutputStream("compressionElapsed=-1687259892275ms, mergingElapsed=0ms", (java.io.OutputStream) zipArchiveOutputStream10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: compressionElapsed=-1687259892275ms, mergingElapsed=0ms not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "never" + "'", str15, "never");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("ZipLong value: 1");
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        boolean boolean7 = tarArchiveEntry2.isStreamContiguous();
        tarArchiveEntry2.setDataOffset((long) (short) 100);
        java.lang.String str10 = tarArchiveEntry2.getUserName();
        java.lang.String str11 = tarArchiveEntry2.getName();
        long long12 = tarArchiveEntry2.getDataOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZipLong value: 1" + "'", str10, "ZipLong value: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isStarSparse();
        java.util.Date date4 = tarArchiveEntry2.getModTime();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Tue Jun 20 13:19:03 CEST 2023");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        jarArchiveEntry1.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData13 = jarArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNull(unparseableExtraFieldData13);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.nio.file.Path path0 = null;
        java.lang.Iterable<java.nio.file.Path> pathIterable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forPaths(path0, pathIterable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: paths");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong(11);
        java.lang.String str3 = zipLong2.toString();
        byte[] byteArray4 = zipLong2.getBytes();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("TRAILER!!!", byteArray4, 2048, (int) ' ', zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 11" + "'", str3, "ZipLong value: 11");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[11, 0, 0, 0]");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "data descriptor", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 75, file1, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        boolean boolean6 = cpioArchiveEntry1.isPipe();
        cpioArchiveEntry1.setRemoteDeviceMaj((long) 9);
        boolean boolean9 = cpioArchiveEntry1.isPipe();
        cpioArchiveEntry1.setTime((long) 155);
        int int12 = cpioArchiveEntry1.getHeaderPadCount();
        int int13 = cpioArchiveEntry1.getHeaderSize();
        boolean boolean14 = cpioArchiveEntry1.isRegularFile();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 110 + "'", int13 == 110);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("UTF8");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix4 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj5 = x7875_NewUnix4.clone();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField6 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField6, byteArray8, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = null;
        zip64ExtendedInformationExtraField6.setRelativeHeaderOffset(zipEightByteInteger13);
        byte[] byteArray15 = zip64ExtendedInformationExtraField6.getLocalFileDataData();
        x7875_NewUnix4.parseFromCentralDirectoryData(byteArray15, (int) (byte) 76, (int) (byte) 88);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream1.read(byteArray15, 8, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:04 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 40, -117, -111, 100]");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 148, 2526, "apkm", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 103);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream13 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry2.getPermissions();
        dumpArchiveEntry2.setGeneration(0);
        long long8 = dumpArchiveEntry2.getSize();
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        int int11 = tarArchiveEntry3.getDevMajor();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.setDataOffset((-1687259938604L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The offset can not be smaller than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.WIN95;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray13);
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) unicodeCommentExtraField15);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = new org.apache.commons.compress.archivers.zip.ZipLong(11);
        java.lang.String str19 = zipLong18.toString();
        x5455_ExtendedTimestamp0.setAccessTime(zipLong18);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp21.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean27 = tarArchiveEntry26.isSparse();
        tarArchiveEntry26.setMode(26127);
        java.util.Date date30 = tarArchiveEntry26.getModTime();
        x5455_ExtendedTimestamp21.setModifyJavaTime(date30);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = x5455_ExtendedTimestamp21.getCreateTime();
        byte[] byteArray33 = x5455_ExtendedTimestamp21.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = x5455_ExtendedTimestamp21.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong36 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        java.util.Date date37 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong36);
        x5455_ExtendedTimestamp21.setAccessTime(zipLong36);
        x5455_ExtendedTimestamp0.setCreateTime(zipLong36);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix40 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix40.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField45 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = resourceAlignmentExtraField45.getHeaderId();
        short short47 = resourceAlignmentExtraField45.getAlignment();
        short short48 = resourceAlignmentExtraField45.getAlignment();
        byte[] byteArray49 = resourceAlignmentExtraField45.getCentralDirectoryData();
        x7875_NewUnix40.parseFromCentralDirectoryData(byteArray49, (int) (short) -1, 148);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray49, (int) (byte) 10, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ZipLong value: 11" + "'", str19, "ZipLong value: 11");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Tue Jun 20 13:19:04 CEST 2023");
        org.junit.Assert.assertNull(zipLong32);
        org.junit.Assert.assertNotNull(byteArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 40, -117, -111, 100]");
        org.junit.Assert.assertNotNull(zipShort34);
        org.junit.Assert.assertNotNull(date37);
        org.junit.Assert.assertEquals(date37.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 75 + "'", short47 == (short) 75);
        org.junit.Assert.assertTrue("'" + short48 + "' != '" + (short) 75 + "'", short48 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[75, -128]");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(84446, byteArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 255L + "'", long4 == 255L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "compressionElapsed=-1687259938604ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = jarArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = jarArchiveInputStream10.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = jarArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15, "ar");
        boolean boolean18 = cpioArchiveInputStream17.markSupported();
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(archiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(61440);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can only convert non-negative integers between [0,255] to byte: [61440]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isSparse();
        long long10 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:19:05 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("hi!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, 64, 2526);
        int int7 = tarArchiveInputStream6.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = tarArchiveInputStream6.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2526 + "'", int7 == 2526);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        int int1 = x0016_CertificateIdForCentralDirectory0.getRecordCount();
        int int2 = x0016_CertificateIdForCentralDirectory0.getRecordCount();
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0016_CertificateIdForCentralDirectory0.parseFromCentralDirectoryData(byteArray3, (int) (byte) -3, (int) (short) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory1.getInputStreamArchiveNames();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream5);
        long long11 = tarArchiveOutputStream10.getBytesWritten();
        tarArchiveOutputStream10.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream13 = archiveStreamFactory1.createArchiveOutputStream("jar", (java.io.OutputStream) tarArchiveOutputStream10);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = resourceAlignmentExtraField5.getHeaderId();
        short short7 = resourceAlignmentExtraField5.getAlignment();
        short short8 = resourceAlignmentExtraField5.getAlignment();
        byte[] byteArray9 = resourceAlignmentExtraField5.getCentralDirectoryData();
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, (int) (short) -1, 148);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField13 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField13, byteArray15, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = null;
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger20);
        byte[] byteArray22 = zip64ExtendedInformationExtraField13.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray22, true, unparseableExtraField24);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray22, 26127, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 75 + "'", short7 == (short) 75);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 75 + "'", short8 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[75, -128]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16);
        boolean boolean19 = tarArchiveInputStream18.markSupported();
        java.nio.file.Path path20 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer21 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream22);
        long long25 = cpioArchiveInputStream23.skip((long) (byte) 100);
        cpioArchiveInputStream23.mark(6);
        boolean boolean28 = cpioArchiveInputStream23.markSupported();
        boolean boolean29 = cpioArchiveInputStream23.markSupported();
        closeableConsumer21.accept((java.io.Closeable) cpioArchiveInputStream23);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("apks", (java.io.InputStream) tarArchiveInputStream18, path20, closeableConsumer21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: apks not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(closeableConsumer21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        java.util.concurrent.ExecutorService executorService2 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode6.createExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = jarArchiveEntry5.getExtraField(zipShort7);
        jarArchiveEntry5.setMethod((int) '4');
        jarArchiveEntry5.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry5);
        zipArchiveEntry14.setTime((long) (byte) 1);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier17 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable18 = parallelScatterZipCreator3.createCallable(zipArchiveEntry14, inputStreamSupplier17);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator1.submit(scatterZipOutputStreamCallable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable18);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel((int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField14);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray12, 40960, (int) (short) 3);
        x7875_NewUnix0.setGID(1687259927021L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("././@LongLink", (long) 5);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("ZipLong value: 1");
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        boolean boolean7 = tarArchiveEntry2.isStreamContiguous();
        long long8 = tarArchiveEntry2.getDataOffset();
        boolean boolean9 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray20);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray20);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField24 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray26 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField24, byteArray26, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = null;
        zip64ExtendedInformationExtraField24.setRelativeHeaderOffset(zipEightByteInteger31);
        byte[] byteArray33 = zip64ExtendedInformationExtraField24.getLocalFileDataData();
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray33);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField35 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray33);
        unicodeCommentExtraField22.setUnicodeName(byteArray33);
        unicodeCommentExtraField22.setNameCRC32((long) (short) -1);
        byte[] byteArray39 = unicodeCommentExtraField22.getLocalFileDataData();
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField30);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp0.setModifyTime(zipLong4);
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray6, 67324752, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.zip.ZipFile zipFile15 = null;
        java.nio.file.Path path16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile15, path16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = zip64ExtendedInformationExtraField11.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray23 = zipEightByteInteger22.getBytes();
        java.lang.String str24 = zipEightByteInteger22.toString();
        zip64ExtendedInformationExtraField11.setCompressedSize(zipEightByteInteger22);
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger22);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray29 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField27, byteArray29, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger34 = null;
        zip64ExtendedInformationExtraField27.setRelativeHeaderOffset(zipEightByteInteger34);
        byte[] byteArray36 = zip64ExtendedInformationExtraField27.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort37 = zip64ExtendedInformationExtraField27.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray40 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField44 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField38, byteArray40, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = null;
        zip64ExtendedInformationExtraField38.setRelativeHeaderOffset(zipEightByteInteger45);
        byte[] byteArray47 = zip64ExtendedInformationExtraField38.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger48 = zip64ExtendedInformationExtraField38.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger49 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray50 = zipEightByteInteger49.getBytes();
        java.lang.String str51 = zipEightByteInteger49.toString();
        zip64ExtendedInformationExtraField38.setCompressedSize(zipEightByteInteger49);
        zip64ExtendedInformationExtraField27.setRelativeHeaderOffset(zipEightByteInteger49);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger55 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((-1L));
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger56 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray57 = zipEightByteInteger56.getBytes();
        java.lang.String str58 = zipEightByteInteger56.toString();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger55, zipEightByteInteger56);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField60 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong62 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str63 = zipLong62.toString();
        zip64ExtendedInformationExtraField60.setDiskStartNumber(zipLong62);
        byte[] byteArray65 = zipLong62.getBytes();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField66 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger22, zipEightByteInteger49, zipEightByteInteger56, zipLong62);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort67 = zip64ExtendedInformationExtraField66.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort68 = zip64ExtendedInformationExtraField66.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(zipEightByteInteger22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ZipEightByteInteger value: 0" + "'", str24, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField33);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(zipShort37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField44);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger48);
        org.junit.Assert.assertNotNull(zipEightByteInteger49);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ZipEightByteInteger value: 0" + "'", str51, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ZipEightByteInteger value: 0" + "'", str58, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ZipLong value: 1" + "'", str63, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray65), "[1, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort67);
        org.junit.Assert.assertNotNull(zipShort68);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream16, 11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) arArchiveInputStream16, "00", true);
        java.io.File file22 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) zipArchiveInputStream21, file22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getRecordSize();
        int int7 = tarArchiveOutputStream5.getCount();
        long long8 = tarArchiveOutputStream5.getBytesWritten();
        java.nio.file.Path path9 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = tarArchiveOutputStream5.createArchiveEntry(path9, " \000", linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream6.setUseZip64(zip64Mode11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        boolean boolean12 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField15 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = resourceAlignmentExtraField15.getHeaderId();
        short short17 = resourceAlignmentExtraField15.getAlignment();
        byte[] byteArray18 = resourceAlignmentExtraField15.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp0, byteArray18, 31, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 5455");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:06 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 42, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 75 + "'", short17 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[75, -128]");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        zipArchiveOutputStream6.setMethod(16384);
        zipArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.setLevel(256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 256");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory1.getInputStreamArchiveNames();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5);
        long long8 = cpioArchiveInputStream6.skip((long) (byte) 100);
        cpioArchiveInputStream6.mark(6);
        boolean boolean11 = cpioArchiveInputStream6.markSupported();
        boolean boolean12 = cpioArchiveInputStream6.markSupported();
        closeableConsumer4.accept((java.io.Closeable) cpioArchiveInputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream14, 29127, 60011, "dump", true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream20 = archiveStreamFactory1.createArchiveInputStream((java.io.InputStream) jarArchiveInputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(closeableConsumer4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        long long12 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF8", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger24 = null;
        zip64ExtendedInformationExtraField14.setSize(zipEightByteInteger24);
        byte[] byteArray26 = zip64ExtendedInformationExtraField14.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField13.parseFromCentralDirectoryData(byteArray26, 4096, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker1.getLocalFileDataLength();
        byte[] byteArray3 = jarMarker1.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, (int) (byte) 100, (int) (short) 100, false, (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 100.  Block length of 48 bytes exceeds remaining data of 96 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC));
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj3 = jarArchiveEntry2.clone();
        jarArchiveEntry2.setDiskNumberStart((long) (byte) 10);
        jarArchiveEntry2.setCrc((long) (byte) 75);
        java.nio.file.attribute.FileTime fileTime8 = jarArchiveEntry2.getCreationTime();
        byte[] byteArray9 = jarArchiveEntry2.getExtra();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException10 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry2);
        jarArchiveEntry2.setRawFlag((int) (byte) 103);
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "070707");
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(byteArray9);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setCompressedSize((long) (byte) 100);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.lang.String str5 = dumpArchiveEntry2.getSimpleName();
        boolean boolean6 = dumpArchiveEntry2.isSocket();
        int int7 = dumpArchiveEntry2.getHeaderHoles();
        boolean boolean8 = dumpArchiveEntry2.isBlkDev();
        dumpArchiveEntry2.setSize((long) 0);
        dumpArchiveEntry2.setVolume(32782);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        tarArchiveEntry2.setMode((int) ' ');
        java.lang.String str8 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        asiExtraField0.setUserId((int) (byte) 77);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IRGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        short short4 = resourceAlignmentExtraField2.getAlignment();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime6 = x5455_ExtendedTimestamp5.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x5455_ExtendedTimestamp5.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime8 = x5455_ExtendedTimestamp5.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = new org.apache.commons.compress.archivers.zip.ZipLong(0);
        int int11 = zipLong10.getIntValue();
        x5455_ExtendedTimestamp5.setAccessTime(zipLong10);
        byte[] byteArray13 = zipLong10.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromCentralDirectoryData(byteArray13, (int) (byte) 103, (int) (byte) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 0, 0]");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime(636L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setTime((long) (byte) 1);
        int int13 = zipArchiveEntry10.getInternalAttributes();
        boolean boolean14 = zipArchiveEntry10.isUnixSymlink();
        zipArchiveEntry10.setUnixMode(32);
        boolean boolean18 = zipArchiveEntry10.equals((java.lang.Object) "ustar ");
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry10.setAlignment((int) (byte) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid value for alignment, must be power of two and no bigger than 65535 but is 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        long long6 = zipArchiveOutputStream5.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_LC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 120 + "'", byte0 == (byte) 120);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "compressionElapsed=-1687259938604ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        java.lang.String str9 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setEncoding("070702");
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream5.createArchiveEntry(file12, "xapk");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getLocalFileDataLength();
        byte[] byteArray2 = x7875_NewUnix0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 2, -24, 3, 2, -24, 3]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserName("ZipLong value: 1");
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        boolean boolean7 = tarArchiveEntry2.isStreamContiguous();
        tarArchiveEntry2.setDataOffset((long) (short) 100);
        java.lang.String str10 = tarArchiveEntry2.getUserName();
        java.lang.String str11 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry15.setNames("", "ZipLong value: 1");
        int int19 = tarArchiveEntry15.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean23 = tarArchiveEntry22.isSparse();
        tarArchiveEntry22.setMode(26127);
        java.nio.file.attribute.FileTime fileTime26 = tarArchiveEntry22.getLastModifiedTime();
        tarArchiveEntry15.setModTime(fileTime26);
        tarArchiveEntry2.setModTime(fileTime26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZipLong value: 1" + "'", str10, "ZipLong value: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fileTime26);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.compress.archivers.dump.ShortFileException shortFileException1 = new org.apache.commons.compress.archivers.dump.ShortFileException();
        org.apache.commons.compress.archivers.ArchiveException archiveException2 = new org.apache.commons.compress.archivers.ArchiveException("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ", (java.lang.Exception) shortFileException1);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder2.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder2.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions9 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray1, sevenZFileOptions9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(sevenZFileOptions9);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = extraFieldParsingMode4.createExtraField(zipShort5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = jarArchiveEntry3.getExtraField(zipShort5);
        jarArchiveEntry3.setMethod((int) '4');
        jarArchiveEntry3.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry3);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp13.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean19 = tarArchiveEntry18.isSparse();
        tarArchiveEntry18.setMode(26127);
        java.util.Date date22 = tarArchiveEntry18.getModTime();
        x5455_ExtendedTimestamp13.setModifyJavaTime(date22);
        zipArchiveEntry12.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp13);
        byte[] byteArray27 = new byte[] { (byte) -1 };
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray28);
        org.apache.commons.compress.archivers.tar.TarFile tarFile30 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray28);
        boolean boolean31 = x5455_ExtendedTimestamp13.equals((java.lang.Object) byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile32 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "", byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Jun 20 13:19:08 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("070701", (long) 511);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setRemoteDevice(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        java.lang.String str11 = tarArchiveEntry3.getName();
        boolean boolean12 = tarArchiveEntry3.isExtended();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile13 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm14 = x0015_CertificateIdForFile13.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = x0015_CertificateIdForFile13.getHeaderId();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField16, byteArray18, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = null;
        zip64ExtendedInformationExtraField16.setRelativeHeaderOffset(zipEightByteInteger23);
        byte[] byteArray25 = zip64ExtendedInformationExtraField16.getLocalFileDataData();
        boolean boolean27 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray25, (int) (byte) -1);
        x0015_CertificateIdForFile13.setLocalFileDataData(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(hashAlgorithm14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray11 = zipArchiveEntry10.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find((int) (short) 4);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, "!<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: !<arch>?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "././@LongLink", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(0);
        int int2 = zipLong1.getIntValue();
        byte[] byteArray3 = zipLong1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray3, 26127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0]");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "arj", false, true);
        byte[] byteArray16 = new byte[] { (byte) 52, (byte) 54, (byte) 100, (byte) 51 };
        int int19 = zipArchiveInputStream11.read(byteArray16, (int) '#', (int) (short) 0);
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry22 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        dumpArchiveEntry22.setOffset((long) (byte) 51);
        long long25 = dumpArchiveEntry22.getSize();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode26 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = extraFieldParsingMode26.createExtraField(zipShort27);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode29 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = extraFieldParsingMode29.createExtraField(zipShort30);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField32 = extraFieldParsingMode26.createExtraField(zipShort30);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature33 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        java.lang.String str34 = feature33.toString();
        boolean boolean35 = zipShort30.equals((java.lang.Object) feature33);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry37 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj38 = jarArchiveEntry37.clone();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException39 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature33, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry37);
        java.util.Date date40 = jarArchiveEntry37.getLastModifiedDate();
        dumpArchiveEntry22.setAccessTime(date40);
        int int42 = dumpArchiveEntry22.getHeaderHoles();
        dumpArchiveEntry22.setGeneration((int) (byte) 75);
        boolean boolean45 = zipArchiveInputStream11.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream48 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, 60012, "\001\004");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[52, 54, 100, 51]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(extraFieldParsingMode26);
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNotNull(extraFieldParsingMode29);
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(zipExtraField31);
        org.junit.Assert.assertNotNull(zipExtraField32);
        org.junit.Assert.assertNotNull(feature33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "compression method" + "'", str34, "compression method");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "070707");
        org.junit.Assert.assertNotNull(date40);
        org.junit.Assert.assertEquals(date40.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        byte[] byteArray11 = zipArchiveEntry10.getLocalFileDataExtra();
        long long12 = zipArchiveEntry10.getExternalAttributes();
        zipArchiveEntry10.setCompressedSize((long) 424935705);
        int int15 = zipArchiveEntry10.getRawFlag();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 4, file1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        long long5 = streamCompressor4.getBytesWrittenForLastEntry();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile6 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm7 = x0015_CertificateIdForFile6.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x0015_CertificateIdForFile6.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm9 = x0015_CertificateIdForFile6.getHashAlgorithm();
        int int10 = x0015_CertificateIdForFile6.getRecordCount();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        x0015_CertificateIdForFile6.setCentralDirectoryData(byteArray20);
        streamCompressor4.writeCounted(byteArray20);
        streamCompressor4.close();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertNotNull(streamCompressor4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(hashAlgorithm7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(hashAlgorithm9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setName("");
        java.nio.file.attribute.FileTime fileTime6 = null;
        tarArchiveEntry2.setCreationTime(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray8 = zipEightByteInteger7.getBytes();
        zip64ExtendedInformationExtraField0.setCompressedSize(zipEightByteInteger7);
        byte[] byteArray10 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = zip64ExtendedInformationExtraField0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(zipEightByteInteger11);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode1.createExtraField(zipShort2);
        byte[] byteArray4 = zipExtraField3.getCentralDirectoryData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, 6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray4, 61440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 61440");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        int int12 = cpioArchiveInputStream1.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream13 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("data descriptor");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.flush();
        int int8 = tarArchiveOutputStream5.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, (short) (byte) 0, 9, "apk");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.lang.String str1 = zipEightByteInteger0.toString();
        java.math.BigInteger bigInteger2 = zipEightByteInteger0.getValue();
        java.math.BigInteger bigInteger3 = zipEightByteInteger0.getValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZipEightByteInteger value: 0" + "'", str1, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger3);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str3 = zipLong2.toString();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        byte[] byteArray5 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1" + "'", str3, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(zipShort6);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = jarArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = jarArchiveInputStream10.canReadEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = jarArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream15, "ar");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry18 = cpioArchiveInputStream17.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(archiveEntry14);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x000A_NTFS0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        java.lang.String str6 = zipLong5.toString();
        zip64ExtendedInformationExtraField3.setDiskStartNumber(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray9 = zipEightByteInteger8.getBytes();
        java.lang.String str10 = zipEightByteInteger8.toString();
        zip64ExtendedInformationExtraField3.setCompressedSize(zipEightByteInteger8);
        java.lang.String str12 = zipEightByteInteger8.toString();
        x000A_NTFS0.setAccessTime(zipEightByteInteger8);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray24);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray24, true);
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromCentralDirectoryData(byteArray24, (int) (byte) 51, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZipLong value: 1" + "'", str6, "ZipLong value: 1");
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZipEightByteInteger value: 0" + "'", str10, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ZipEightByteInteger value: 0" + "'", str12, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource10 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT;
        jarArchiveEntry1.setCommentSource(commentSource10);
        int int12 = jarArchiveEntry1.getUnixMode();
        java.nio.file.attribute.FileTime fileTime13 = jarArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime14 = jarArchiveEntry1.getCreationTime();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + commentSource10 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource10.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNull(fileTime14);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        boolean boolean4 = dumpArchiveEntry2.isDeleted();
        dumpArchiveEntry2.setOffset((long) (short) 3);
        int int7 = dumpArchiveEntry2.getUserId();
        dumpArchiveEntry2.setDeleted(true);
        dumpArchiveEntry2.setVolume(84446);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.io.File file0 = null;
        char[] charArray5 = new char[] { 'a', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a44a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a44a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, 4, 4, a]");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = zip64ExtendedInformationExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray12);
        byte[] byteArray14 = unicodeCommentExtraField13.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 8, byteArray14, 5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 8=10 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 0, 0, 0, 116, 97, 114, 0]");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 504 + "'", int0 == 504);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.setEncoding("0x5455 Zip Extra Field: Flags=1  Modify:[Sat Feb 19 06:19:12 CET 1972] ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 0x5455 Zip Extra Field: Flags=1  Modify:[Sat Feb 19 06:19:12 CET 1972] ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.flush();
        tarArchiveOutputStream5.setLongFileMode(257);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setTime((long) (byte) 1);
        int int13 = zipArchiveEntry10.getInternalAttributes();
        boolean boolean14 = zipArchiveEntry10.isUnixSymlink();
        zipArchiveEntry10.setDiskNumberStart((long) (byte) 53);
        java.lang.String str17 = zipArchiveEntry10.getComment();
        long long18 = zipArchiveEntry10.getSize();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("compressionElapsed=-1687259929102ms, mergingElapsed=0ms", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        byte[] byteArray17 = zip64ExtendedInformationExtraField7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = tarArchiveInputStream3.read(byteArray17, (int) (short) 2, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        boolean boolean6 = cpioArchiveEntry1.isPipe();
        long long7 = cpioArchiveEntry1.getGID();
        cpioArchiveEntry1.setTime(84446L);
        java.nio.charset.Charset charset10 = null;
        int int11 = cpioArchiveEntry1.getHeaderPadCount(charset10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setDevice((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, "apkm", false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream2);
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cpioArchiveInputStream7.read(byteArray10, 3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        tarArchiveEntry2.setMode(65535);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        int int11 = jarArchiveInputStream10.read();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = jarArchiveInputStream10.canReadEntryData(archiveEntry12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, "compressionElapsed=-1687259929102ms, mergingElapsed=0ms", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687259929102ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        short short4 = resourceAlignmentExtraField3.getAlignment();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = resourceAlignmentExtraField3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort5);
        byte[] byteArray7 = zipShort5.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) (short) 8, byteArray7, 67324752, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67324782");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[2, 0]");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("jar", (long) (byte) 0, (int) (byte) 48, 4, (int) (short) 1, 0L);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "arj", false, true);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = jarArchiveInputStream12.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray3 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(2048);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray6, 24576, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 8]");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.lang.String str2 = archiveStreamFactory0.getEntryEncoding();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream5, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream9);
        java.lang.String str11 = zipArchiveOutputStream10.getEncoding();
        zipArchiveOutputStream10.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream10.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream17 = archiveStreamFactory0.createArchiveOutputStream("ZipShort value: 21589", (java.io.OutputStream) zipArchiveOutputStream10, "compressionElapsed=-1687259939172ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipShort value: 21589 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("`\n");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.tar.TarFile tarFile16 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray14, "arj");
        streamCompressor3.writeCounted(byteArray14);
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer18 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream19);
        long long22 = cpioArchiveInputStream20.skip((long) (byte) 100);
        cpioArchiveInputStream20.mark(6);
        boolean boolean25 = cpioArchiveInputStream20.markSupported();
        boolean boolean26 = cpioArchiveInputStream20.markSupported();
        closeableConsumer18.accept((java.io.Closeable) cpioArchiveInputStream20);
        long long28 = cpioArchiveInputStream20.getBytesRead();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor3.deflate((java.io.InputStream) arArchiveInputStream29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(closeableConsumer18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray4 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = null;
        zip64ExtendedInformationExtraField5.setSize(zipEightByteInteger15);
        byte[] byteArray17 = zip64ExtendedInformationExtraField5.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromLocalFileData(byteArray17, 21, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp1.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean7 = tarArchiveEntry6.isSparse();
        tarArchiveEntry6.setMode(26127);
        java.util.Date date10 = tarArchiveEntry6.getModTime();
        x5455_ExtendedTimestamp1.setModifyJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp1.getCreateTime();
        byte[] byteArray13 = x5455_ExtendedTimestamp1.getLocalFileDataData();
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 60012, byteArray13, 33188, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66373");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Jun 20 13:19:10 CEST 2023");
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(byteArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 46, -117, -111, 100]");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 431L + "'", long14 == 431L);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        java.lang.String str5 = tarArchiveEntry2.getExtraPaxHeader("");
        tarArchiveEntry2.setNames("ZipShort value: 20", "data descriptor");
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveOutputStreamProviders();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer3 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long7 = cpioArchiveInputStream5.skip((long) (byte) 100);
        cpioArchiveInputStream5.mark(6);
        boolean boolean10 = cpioArchiveInputStream5.markSupported();
        boolean boolean11 = cpioArchiveInputStream5.markSupported();
        closeableConsumer3.accept((java.io.Closeable) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = jarArchiveInputStream13.getNextZipEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = null;
        boolean boolean16 = jarArchiveInputStream13.canReadEntryData(archiveEntry15);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList20 = tarArchiveEntry19.getOrderedSparseHeaders();
        java.lang.String str22 = tarArchiveEntry19.getExtraPaxHeader("");
        java.nio.file.attribute.FileTime fileTime23 = null;
        tarArchiveEntry19.setCreationTime(fileTime23);
        boolean boolean25 = jarArchiveInputStream13.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry19);
        long long27 = jarArchiveInputStream13.skip(312764400000L);
        long long29 = jarArchiveInputStream13.skip(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream30 = archiveStreamFactory1.createArchiveInputStream((java.io.InputStream) jarArchiveInputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(closeableConsumer3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(zipArchiveEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray13);
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) unicodeCommentExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry20 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry20.setVolume(488);
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet23 = dumpArchiveEntry20.getPermissions();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry24 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean28 = tarArchiveEntry27.isSparse();
        tarArchiveEntry27.setMode(26127);
        java.util.Date date31 = tarArchiveEntry27.getModTime();
        sevenZArchiveEntry24.setLastModifiedDate(date31);
        dumpArchiveEntry20.setAccessTime(date31);
        x5455_ExtendedTimestamp0.setAccessJavaTime(date31);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(pERMISSIONSet23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Tue Jun 20 13:19:11 CEST 2023");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime3 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry6.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime8 = tarArchiveEntry6.getLastModifiedTime();
        boolean boolean9 = tarArchiveEntry6.isGlobalPaxHeader();
        boolean boolean10 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry15.setNames("", "ZipLong value: 1");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry22.setNames("", "ZipLong value: 1");
        int int26 = tarArchiveEntry22.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean30 = tarArchiveEntry29.isSparse();
        tarArchiveEntry29.setMode(26127);
        java.nio.file.attribute.FileTime fileTime33 = tarArchiveEntry29.getLastModifiedTime();
        tarArchiveEntry22.setModTime(fileTime33);
        tarArchiveEntry15.setModTime(fileTime33);
        x5455_ExtendedTimestamp0.setModifyFileTime(fileTime33);
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(fileTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(fileTime33);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.lang.String str3 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setGroupId(1L);
        boolean boolean6 = tarArchiveEntry2.isDirectory();
        java.nio.file.attribute.FileTime fileTime7 = tarArchiveEntry2.getLastAccessTime();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ustar\000" + "'", str3, "ustar\000");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(fileTime7);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions1);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile11 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = extraFieldParsingMode12.createExtraField(zipShort13);
        byte[] byteArray15 = zipExtraField14.getCentralDirectoryData();
        x0015_CertificateIdForFile11.setCentralDirectoryData(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray15, 2162688, 84446);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2162688");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:11 CEST 2023");
        org.junit.Assert.assertNotNull(extraFieldParsingMode12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, "ZipShort value: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry2.getPermissions();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry6 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setMode(26127);
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        sevenZArchiveEntry6.setLastModifiedDate(date13);
        dumpArchiveEntry2.setAccessTime(date13);
        dumpArchiveEntry2.setSize((long) (short) -1);
        dumpArchiveEntry2.setName("!<arch>\n");
        dumpArchiveEntry2.setOffset((long) 493);
        int int22 = dumpArchiveEntry2.getGroupId();
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:19:11 CEST 2023");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        jarArchiveEntry1.setCrc((long) 16384);
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField12 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean13 = asiExtraField12.isLink();
        int int14 = asiExtraField12.getMode();
        asiExtraField12.setMode(10);
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField12);
        long long18 = jarArchiveEntry1.getSize();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        java.nio.file.attribute.FileTime fileTime6 = jarArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry7 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry15.setNames("", "ZipLong value: 1");
        int int19 = tarArchiveEntry15.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean23 = tarArchiveEntry22.isSparse();
        tarArchiveEntry22.setMode(26127);
        java.nio.file.attribute.FileTime fileTime26 = tarArchiveEntry22.getLastModifiedTime();
        tarArchiveEntry15.setModTime(fileTime26);
        cpioArchiveEntry11.setTime(fileTime26);
        sevenZArchiveEntry7.setAccessTime(fileTime26);
        java.util.zip.ZipEntry zipEntry30 = jarArchiveEntry1.setLastModifiedTime(fileTime26);
        byte[] byteArray31 = jarArchiveEntry1.getExtra();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fileTime26);
        org.junit.Assert.assertNotNull(zipEntry30);
        org.junit.Assert.assertEquals(zipEntry30.toString(), "070707");
        org.junit.Assert.assertNotNull(byteArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[85, 84, 5, 0, 1, 47, -117, -111, 100, 10, 0, 32, 0, 0, 0, 0, 0, 1, 0, 24, 0, -112, 82, -32, 9, 105, -93, -39, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        boolean boolean4 = dumpArchiveEntry2.isChrDev();
        boolean boolean5 = dumpArchiveEntry2.isChrDev();
        boolean boolean6 = dumpArchiveEntry2.isDirectory();
        long long7 = dumpArchiveEntry2.getOffset();
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "compressionElapsed=-1687259929102ms, mergingElapsed=0ms", charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("\000\000");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <?> at index 0: ??");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("compression method", (long) 131);
        boolean boolean3 = arArchiveEntry2.isDirectory();
        int int4 = arArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33188 + "'", int4 == 33188);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        long long7 = arArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("UTF8");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray1, (int) (byte) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(" \000");
        long long2 = zipArchiveEntry1.getCompressedSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj5 = jarArchiveEntry4.clone();
        int int6 = jarArchiveEntry4.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry4.setNameSource(nameSource7);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = jarArchiveEntry4.getExtraFields();
        jarArchiveEntry4.setExternalAttributes((long) (short) 2);
        java.lang.String str12 = jarArchiveEntry4.getName();
        jarArchiveEntry4.setExternalAttributes((long) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode15 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode15.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp18 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp18.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean24 = tarArchiveEntry23.isSparse();
        tarArchiveEntry23.setMode(26127);
        java.util.Date date27 = tarArchiveEntry23.getModTime();
        x5455_ExtendedTimestamp18.setModifyJavaTime(date27);
        byte[] byteArray30 = new byte[] { (byte) -1 };
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField35 = extraFieldParsingMode15.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp18, byteArray31, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime36 = null;
        x5455_ExtendedTimestamp18.setAccessFileTime(fileTime36);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong38 = x5455_ExtendedTimestamp18.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap42 = tarArchiveEntry41.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime43 = tarArchiveEntry41.getLastModifiedTime();
        x5455_ExtendedTimestamp18.setModifyFileTime(fileTime43);
        java.util.zip.ZipEntry zipEntry45 = jarArchiveEntry4.setLastAccessTime(fileTime43);
        java.util.zip.ZipEntry zipEntry46 = zipArchiveEntry1.setCreationTime(fileTime43);
        java.lang.String str47 = zipArchiveEntry1.toString();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "070707");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + nameSource7 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource7.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "070707" + "'", str12, "070707");
        org.junit.Assert.assertNotNull(extraFieldParsingMode15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Tue Jun 20 13:19:12 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField35);
        org.junit.Assert.assertNull(zipLong38);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(fileTime43);
        org.junit.Assert.assertNotNull(zipEntry45);
        org.junit.Assert.assertEquals(zipEntry45.toString(), "070707");
        org.junit.Assert.assertNotNull(zipEntry46);
        org.junit.Assert.assertEquals(zipEntry46.toString(), " \000");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + " \000" + "'", str47, " \000");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder3 = builder1.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder5 = builder1.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder7 = builder1.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory1.getInputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory1.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 16384, "`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream5.setUseZip64(zip64Mode11);
        java.lang.String str13 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, (short) (byte) 0, (int) (byte) 100, "compressionElapsed=-1687259938604ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, (int) (short) 0, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray12, 11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:12 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 48, -117, -111, 100]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0010" + "'", str15, "\0010");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        asiExtraField0.setMode(10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField0.getLocalFileDataLength();
        asiExtraField0.setMode(131);
        asiExtraField0.setLinkedFile("ZipShort value: 20");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = extraFieldParsingMode12.createExtraField(zipShort13);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = jarArchiveEntry11.getExtraField(zipShort13);
        jarArchiveEntry11.setMethod((int) '4');
        jarArchiveEntry11.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField22 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray23 = resourceAlignmentExtraField22.getLocalFileDataData();
        jarArchiveEntry11.setExtra(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField0, byteArray23, 2, 512, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 756e");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(extraFieldParsingMode12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[2, -128]");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix1 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x7875_NewUnix1.getLocalFileDataLength();
        byte[] byteArray3 = x7875_NewUnix1.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray3, 131, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only -1 bytes, expected at least 12");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 2, -24, 3, 2, -24, 3]");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = asiExtraField1.getCentralDirectoryLength();
        byte[] byteArray3 = asiExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField1.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode0.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField8 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray9 = resourceAlignmentExtraField8.getLocalFileDataData();
        byte[] byteArray10 = resourceAlignmentExtraField8.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode0.onUnparseableExtraField(byteArray10, 31, (int) ' ', false, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[2, -128]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[2, -128]");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray3);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("070707", true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        java.lang.String str9 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setEncoding("070702");
        zipArchiveOutputStream5.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("ZipShort value: 0", (long) (short) 10);
        java.nio.charset.Charset charset3 = null;
        int int4 = cpioArchiveEntry2.getHeaderPadCount(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean2 = sevenZFileOptions1.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISSOCK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 49152 + "'", int0 == 49152);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        java.lang.String str3 = jarArchiveEntry1.getName();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = zip64ExtendedInformationExtraField4.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = zip64ExtendedInformationExtraField4.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = zip64ExtendedInformationExtraField4.getLocalFileDataLength();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort16);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "070707" + "'", str3, "070707");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNotNull(zipShort16);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb(345);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder2.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder6.withTryToRecoverBrokenArchives(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean11 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setMode(26127);
        java.nio.file.attribute.FileTime fileTime14 = tarArchiveEntry10.getLastModifiedTime();
        tarArchiveEntry3.setModTime(fileTime14);
        boolean boolean16 = tarArchiveEntry3.isStarSparse();
        boolean boolean17 = tarArchiveEntry3.isGNULongLinkEntry();
        boolean boolean18 = tarArchiveEntry3.isPaxHeader();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fileTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        long long5 = dumpArchiveEntry2.getOffset();
        int int6 = dumpArchiveEntry2.getMode();
        dumpArchiveEntry2.setSize((long) 11);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter8 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream7);
        scatterZipOutputStream7.close();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream7.addArchiveEntry(zipArchiveEntryRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "TRAILER!!!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 5, 29127);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm2 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField3 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean4 = asiExtraField3.isLink();
        int int5 = asiExtraField3.getMode();
        boolean boolean6 = asiExtraField3.isLink();
        boolean boolean7 = asiExtraField3.isDirectory();
        byte[] byteArray8 = asiExtraField3.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray8, 155, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 155 > 154");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(encryptionAlgorithm1);
        org.junit.Assert.assertNull(encryptionAlgorithm2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode13 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode13.createExtraField(zipShort14);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = jarArchiveEntry12.getExtraField(zipShort14);
        jarArchiveEntry12.setMethod((int) '4');
        jarArchiveEntry12.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry12);
        jarArchiveEntry12.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry24 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource25 = jarArchiveEntry24.getNameSource();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry26 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry24);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(extraFieldParsingMode13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertTrue("'" + nameSource25 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource25.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 148, byteArray10, (int) (short) 4, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24577");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray23);
        unicodeCommentExtraField12.setUnicodeName(byteArray23);
        byte[] byteArray27 = unicodeCommentExtraField12.getUnicodeName();
        byte[] byteArray28 = unicodeCommentExtraField12.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodeCommentExtraField12.getHeaderId();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix30 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = x7875_NewUnix30.getHeaderId();
        long long32 = x7875_NewUnix30.getGID();
        byte[] byteArray33 = x7875_NewUnix30.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromLocalFileData(byteArray33, 11, 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(zipShort31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1000L + "'", long32 == 1000L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, 2, -24, 3, 2, -24, 3]");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray11, 26127, 60011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore8);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream10 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor9);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter11 = scatterZipOutputStream10.zipEntryWriter();
        zipEntryWriter11.close();
        zipEntryWriter11.close();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertNotNull(streamCompressor9);
        org.junit.Assert.assertNotNull(zipEntryWriter11);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getCentralDirectoryLength();
        boolean boolean4 = resourceAlignmentExtraField2.allowMethodChange();
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        boolean boolean4 = dumpArchiveEntry2.isChrDev();
        boolean boolean5 = dumpArchiveEntry2.isFile();
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory0.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.File file1 = null;
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(file1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 1, byteArray1, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "apks", "ustar ", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isSparse();
        boolean boolean9 = tarArchiveEntry2.isSparse();
        boolean boolean10 = tarArchiveEntry2.isSymbolicLink();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode13 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode13.createExtraField(zipShort14);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = jarArchiveEntry12.getExtraField(zipShort14);
        jarArchiveEntry12.setMethod((int) '4');
        jarArchiveEntry12.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry21 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry12);
        jarArchiveEntry12.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry24 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource25 = jarArchiveEntry24.getNameSource();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry26 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry24);
        byte[] byteArray27 = jarArchiveEntry24.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:19:14 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(extraFieldParsingMode13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNull(zipExtraField16);
        org.junit.Assert.assertTrue("'" + nameSource25 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource25.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = extraFieldParsingMode7.createExtraField(zipShort8);
        jarArchiveEntry1.addExtraField(zipExtraField9);
        java.nio.file.attribute.FileTime fileTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.zip.ZipEntry zipEntry12 = jarArchiveEntry1.setLastAccessTime(fileTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: lastAccessTime");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(extraFieldParsingMode7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(zipExtraField9);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        boolean boolean4 = dumpArchiveEntry2.isFile();
        int int5 = dumpArchiveEntry2.getMode();
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        boolean boolean4 = cpioArchiveEntry3.isSocket();
        long long5 = cpioArchiveEntry3.getGID();
        cpioArchiveEntry3.setGID((long) 1024);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isStarSparse();
        long long9 = tarArchiveEntry2.getDataOffset();
        byte[] byteArray11 = new byte[] { (byte) -1 };
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray11);
        boolean boolean15 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray11, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:19:14 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 255L + "'", long13 == 255L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        cpioArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, 29127, 60011, "dump", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = tarArchiveInputStream15.getNextTarEntry();
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tarArchiveEntry16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 148, 2526, "apkm", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, (int) (byte) 103);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str3 = feature2.toString();
        boolean boolean4 = sevenZMethodConfiguration1.equals((java.lang.Object) str3);
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "data descriptor" + "'", str3, "data descriptor");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp5.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean11 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setMode(26127);
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        x5455_ExtendedTimestamp5.setModifyJavaTime(date14);
        byte[] byteArray17 = new byte[] { (byte) -1 };
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray17);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = extraFieldParsingMode2.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp5, byteArray18, 0, 32768, true);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray18, 1, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Jun 20 13:19:14 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField22);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = jarArchiveInputStream9.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        int int2 = zipLong1.getIntValue();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray6 = new byte[] { (byte) -1 };
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray6);
        boolean boolean9 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray7, (int) (short) -1);
        jarArchiveEntry4.setExtra(byteArray7);
        jarArchiveEntry4.setComment("ZipLong value: 11");
        java.util.Date date13 = jarArchiveEntry4.getLastModifiedDate();
        java.util.Date date14 = jarArchiveEntry4.getLastModifiedDate();
        jarArchiveEntry4.setComment("070701");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField18, byteArray20, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        zip64ExtendedInformationExtraField18.setRelativeHeaderOffset(zipEightByteInteger25);
        byte[] byteArray27 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray27);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField31 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray33 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField31, byteArray33, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = null;
        zip64ExtendedInformationExtraField31.setRelativeHeaderOffset(zipEightByteInteger38);
        byte[] byteArray40 = zip64ExtendedInformationExtraField31.getLocalFileDataData();
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray40);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField42 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray40);
        unicodeCommentExtraField29.setUnicodeName(byteArray40);
        unicodeCommentExtraField29.setNameCRC32((long) (short) -1);
        byte[] byteArray46 = unicodeCommentExtraField29.getLocalFileDataData();
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray46);
        boolean boolean49 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray47, 60012);
        jarArchiveEntry4.setCentralDirectoryExtra(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            zipLong1.putLong(byteArray47, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField37);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime3 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray10 = new byte[] { (byte) -1 };
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) -1);
        jarArchiveEntry8.setExtra(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray11, (int) (byte) 83, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream5.setMethod(0);
        zipArchiveOutputStream5.setLevel(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, (int) (byte) 120, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray1 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = zip64ExtendedInformationExtraField0.getSize();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger2);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str1 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str2 = unicodeExtraFieldPolicy0.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "never" + "'", str1, "never");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "never" + "'", str2, "never");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("");
            org.junit.Assert.fail("Expected exception of type java.nio.file.AccessDeniedException; message: ");
        } catch (java.nio.file.AccessDeniedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix0.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField3 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        int int4 = unparseableExtraField3.getKey();
        boolean boolean5 = x7875_NewUnix0.equals((java.lang.Object) int4);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray16);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField20 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray22 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField26 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField20, byteArray22, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger27 = null;
        zip64ExtendedInformationExtraField20.setRelativeHeaderOffset(zipEightByteInteger27);
        byte[] byteArray29 = zip64ExtendedInformationExtraField20.getLocalFileDataData();
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray29);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray29);
        unicodeCommentExtraField18.setUnicodeName(byteArray29);
        byte[] byteArray33 = unicodeCommentExtraField18.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray33, 424935705, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 424935705");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField26);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = jarArchiveInputStream11.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) jarArchiveInputStream11, 61440, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNull(archiveEntry15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray12, "arj");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        byte[] byteArray18 = new byte[] { (byte) -1 };
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray18);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = extraFieldParsingMode16.onUnparseableExtraField(byteArray19, (int) (short) -1, 64, true, 16384);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile26 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "data descriptor", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(extraFieldParsingMode16);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertNull(zipExtraField24);
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray4 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList6 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField9 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray10 = resourceAlignmentExtraField9.getLocalFileDataData();
        x0019_EncryptionRecipientCertificateList6.setCentralDirectoryData(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromLocalFileData(byteArray10, (int) '4', 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[2, -128]");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.lang.String str1 = arjArchiveEntry0.getName();
        long long2 = arjArchiveEntry0.getSize();
        long long3 = arjArchiveEntry0.getSize();
        java.util.Date date4 = arjArchiveEntry0.getLastModifiedDate();
        boolean boolean5 = arjArchiveEntry0.isHostOsUnix();
        long long6 = arjArchiveEntry0.getSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = jarArchiveInputStream10.getNextZipEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, (int) (byte) -3, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tarArchiveInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = new org.apache.commons.compress.archivers.zip.ZipShort((int) (byte) 53);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.lang.String str13 = zipArchiveOutputStream5.getEncoding();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTF8" + "'", str13, "UTF8");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[76, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        boolean boolean2 = asiExtraField0.isLink();
        byte[] byteArray3 = asiExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "compressionElapsed=-1687259933216ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime3 = x5455_ExtendedTimestamp2.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x5455_ExtendedTimestamp2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp2.setModifyTime(zipLong6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp2.getLocalFileDataLength();
        byte[] byteArray9 = x5455_ExtendedTimestamp2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipLong value: 1", byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.util.Date date1 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.lang.String str3 = zipEightByteInteger2.toString();
        x000A_NTFS0.setModifyTime(zipEightByteInteger2);
        byte[] byteArray5 = x000A_NTFS0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5, (int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x5455_ExtendedTimestamp0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        java.util.Date date16 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong15);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong15);
        java.util.Date date18 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:16 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 52, -117, -111, 100]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Fri Nov 30 00:00:00 CET 1979");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("compressionElapsed=-1687259929102ms, mergingElapsed=0ms", 0L, 0, 4, 10, (-1687259933216L));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        zipArchiveOutputStream5.setMethod(0);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream13 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream11);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream11, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream15);
        java.lang.String str17 = zipArchiveOutputStream16.getEncoding();
        boolean boolean18 = zipArchiveOutputStream16.isSeekable();
        java.io.OutputStream outputStream19 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream21 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream19);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream19, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream23);
        java.lang.String str25 = zipArchiveOutputStream24.getEncoding();
        zipArchiveOutputStream24.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream29 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream24, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode30 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream24.setUseZip64(zip64Mode30);
        zipArchiveOutputStream16.setUseZip64(zip64Mode30);
        zipArchiveOutputStream5.setUseZip64(zip64Mode30);
        java.nio.file.Path path34 = null;
        java.nio.file.LinkOption linkOption36 = null;
        java.nio.file.LinkOption[] linkOptionArray37 = new java.nio.file.LinkOption[] { linkOption36 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry38 = zipArchiveOutputStream5.createArchiveEntry(path34, "compressionElapsed=-1687259938604ms, mergingElapsed=0ms", linkOptionArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTF8" + "'", str17, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "UTF8" + "'", str25, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode30 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode30.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
        org.junit.Assert.assertNotNull(linkOptionArray37);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = asiExtraField1.getCentralDirectoryLength();
        byte[] byteArray3 = asiExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField1.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode0.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime7 = x5455_ExtendedTimestamp6.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp6.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime10 = x5455_ExtendedTimestamp9.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp9.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp9.setModifyTime(zipLong13);
        x5455_ExtendedTimestamp6.setAccessTime(zipLong13);
        x5455_ExtendedTimestamp6.setFlags((byte) 88);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode20 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = extraFieldParsingMode20.createExtraField(zipShort21);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField23 = jarArchiveEntry19.getExtraField(zipShort21);
        jarArchiveEntry19.setMethod((int) '4');
        java.util.Date date26 = jarArchiveEntry19.getLastModifiedDate();
        x5455_ExtendedTimestamp6.setAccessJavaTime(date26);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix28 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = x7875_NewUnix28.getLocalFileDataLength();
        byte[] byteArray30 = x7875_NewUnix28.getLocalFileDataData();
        java.lang.String str31 = x7875_NewUnix28.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry33 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj34 = jarArchiveEntry33.clone();
        int int35 = jarArchiveEntry33.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource36 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry33.setNameSource(nameSource36);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource38 = jarArchiveEntry33.getNameSource();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode39 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort40 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = extraFieldParsingMode39.createExtraField(zipShort40);
        jarArchiveEntry33.addExtraField(zipExtraField41);
        byte[] byteArray43 = jarArchiveEntry33.getCentralDirectoryExtra();
        x7875_NewUnix28.parseFromCentralDirectoryData(byteArray43, 4095, 4096);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp6, byteArray43, (int) (short) 12, 12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(extraFieldParsingMode20);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNull(zipExtraField23);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 2, -24, 3, 2, -24, 3]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str31, "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "070707");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + nameSource36 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource36.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource38 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource38.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(extraFieldParsingMode39);
        org.junit.Assert.assertNotNull(zipShort40);
        org.junit.Assert.assertNotNull(zipExtraField41);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[85, 84, 1, 0, 0]");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((int) (byte) 103);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.lang.String str5 = dumpArchiveEntry2.getSimpleName();
        boolean boolean6 = dumpArchiveEntry2.isSocket();
        int int7 = dumpArchiveEntry2.getHeaderHoles();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE8 = dumpArchiveEntry2.getHeaderType();
        dumpArchiveEntry2.setSize(636L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "070707" + "'", str5, "070707");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(sEGMENT_TYPE8);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14, byteArray16, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = null;
        zip64ExtendedInformationExtraField14.setRelativeHeaderOffset(zipEightByteInteger21);
        byte[] byteArray23 = zip64ExtendedInformationExtraField14.getLocalFileDataData();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField25 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray23);
        unicodeCommentExtraField12.setUnicodeName(byteArray23);
        unicodeCommentExtraField12.setNameCRC32((long) (short) -1);
        byte[] byteArray29 = unicodeCommentExtraField12.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = unicodeCommentExtraField12.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = unicodeCommentExtraField12.getHeaderId();
        long long32 = unicodeCommentExtraField12.getNameCRC32();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(zipShort31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("ar", "compressionElapsed=-1687259939172ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: ar");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.util.Date date1 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.junit.Assert.assertNull(date1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore5);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream7 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore2, streamCompressor6);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter8 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream7);
        zipEntryWriter8.close();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream10);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream10, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream14);
        java.lang.String str16 = zipArchiveOutputStream15.getEncoding();
        boolean boolean17 = zipArchiveOutputStream15.isSeekable();
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream20 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream18);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream18, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream22);
        java.lang.String str24 = zipArchiveOutputStream23.getEncoding();
        zipArchiveOutputStream23.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream23, "070701");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode29 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream23.setUseZip64(zip64Mode29);
        zipArchiveOutputStream15.setUseZip64(zip64Mode29);
        // The following exception was thrown during execution in test generation
        try {
            zipEntryWriter8.writeNextZipEntry(zipArchiveOutputStream15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF8" + "'", str24, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode29 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode29.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = zip64ExtendedInformationExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray11);
        byte[] byteArray13 = unicodeCommentExtraField12.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray13, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0, 116, 97, 114, 0]");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("zip");
        int int2 = jarArchiveEntry1.getMethod();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        java.lang.String str10 = tarArchiveEntry5.getUserName();
        tarArchiveEntry5.setGroupName("apks");
        boolean boolean13 = tarArchiveEntry5.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp14 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime15 = x5455_ExtendedTimestamp14.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x5455_ExtendedTimestamp14.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp14.setModifyTime(zipLong18);
        java.nio.file.attribute.FileTime fileTime20 = x5455_ExtendedTimestamp14.getModifyFileTime();
        tarArchiveEntry5.setStatusChangeTime(fileTime20);
        java.util.zip.ZipEntry zipEntry22 = jarArchiveEntry1.setCreationTime(fileTime20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:19:16 CEST 2023");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertNotNull(zipEntry22);
        org.junit.Assert.assertEquals(zipEntry22.toString(), "zip");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        boolean boolean5 = cpioArchiveInputStream1.markSupported();
        long long7 = cpioArchiveInputStream1.skip((long) (byte) 54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("UTF8");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj12 = jarArchiveEntry11.clone();
        java.lang.Object obj13 = jarArchiveEntry11.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long17 = tarArchiveEntry16.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry25.setNames("", "ZipLong value: 1");
        int int29 = tarArchiveEntry25.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean33 = tarArchiveEntry32.isSparse();
        tarArchiveEntry32.setMode(26127);
        java.nio.file.attribute.FileTime fileTime36 = tarArchiveEntry32.getLastModifiedTime();
        tarArchiveEntry25.setModTime(fileTime36);
        cpioArchiveEntry21.setTime(fileTime36);
        tarArchiveEntry16.setStatusChangeTime(fileTime36);
        java.util.zip.ZipEntry zipEntry40 = jarArchiveEntry11.setCreationTime(fileTime36);
        byte[] byteArray41 = jarArchiveEntry11.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry8.writeEntryHeader(byteArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "070707");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "070707");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fileTime36);
        org.junit.Assert.assertNotNull(zipEntry40);
        org.junit.Assert.assertEquals(zipEntry40.toString(), "070707");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(2048);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("compressionElapsed=-1687259939172ms, mergingElapsed=0ms", byteArray2, (int) 'a', 32778, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 8]");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 55);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry2.getPermissions();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry6 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setMode(26127);
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        sevenZArchiveEntry6.setLastModifiedDate(date13);
        dumpArchiveEntry2.setAccessTime(date13);
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE17 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(2162688);
        dumpArchiveEntry2.setType(tYPE17);
        boolean boolean19 = dumpArchiveEntry2.isDirectory();
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:19:17 CEST 2023");
        org.junit.Assert.assertTrue("'" + tYPE17 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE17.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer9 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10);
        long long13 = cpioArchiveInputStream11.skip((long) (byte) 100);
        cpioArchiveInputStream11.mark(6);
        boolean boolean16 = cpioArchiveInputStream11.markSupported();
        boolean boolean17 = cpioArchiveInputStream11.markSupported();
        closeableConsumer9.accept((java.io.Closeable) cpioArchiveInputStream11);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = jarArchiveInputStream19.getNextZipEntry();
        long long22 = jarArchiveInputStream19.skip((long) 148);
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix23 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray24 = x7875_NewUnix23.getCentralDirectoryData();
        int int25 = jarArchiveInputStream19.read(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode27 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray24, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode27);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.writePreamble(byteArray24, 2526, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(closeableConsumer9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(zipArchiveEntry20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(extraFieldParsingMode27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { '#', ' ', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean6 = sevenZFileOptions5.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray4, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#,  , #]");
        org.junit.Assert.assertNotNull(sevenZFileOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        long long6 = cpioArchiveEntry1.getSize();
        long long7 = cpioArchiveEntry1.getGID();
        long long8 = cpioArchiveEntry1.getInode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("dump", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ZipShort value: 20", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getCreateTime();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField13 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true, unparseableExtraField13);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray15);
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromLocalFileData(byteArray16, 0, 424935705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        java.lang.Object obj1 = asiExtraField0.clone();
        asiExtraField0.setUserId((int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.io.File file0 = null;
        char[] charArray6 = new char[] { 'a', '4', '#', 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #, a, 4]");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, "apkm", false, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) -1);
        jarArchiveEntry2.setExtra(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 16877, byteArray5, 263, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 274");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "7z", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        zipArchiveEntry10.setTime((long) (byte) 1);
        int int13 = zipArchiveEntry10.getInternalAttributes();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode16 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = extraFieldParsingMode16.createExtraField(zipShort17);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = jarArchiveEntry15.getExtraField(zipShort17);
        jarArchiveEntry15.setMethod((int) '4');
        jarArchiveEntry15.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry15);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = jarArchiveEntry15.getGeneralPurposeBit();
        zipArchiveEntry10.setGeneralPurposeBit(generalPurposeBit25);
        long long27 = zipArchiveEntry10.getDiskNumberStart();
        int int28 = zipArchiveEntry10.getInternalAttributes();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(extraFieldParsingMode16);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertNull(zipExtraField19);
        org.junit.Assert.assertNotNull(generalPurposeBit25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (short) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, "!<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: !<arch>?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        int int8 = tarArchiveOutputStream5.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.write(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, "apkm", false, false);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tarArchiveInputStream3.read(byteArray10, (int) (short) 3, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray13);
        boolean boolean16 = x5455_ExtendedTimestamp0.equals((java.lang.Object) unicodeCommentExtraField15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray21, (int) (byte) 12, (int) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 10]");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode11 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream6.setUseZip64(zip64Mode11);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray10);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray10, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField2 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = asiExtraField2.getCentralDirectoryLength();
        byte[] byteArray4 = asiExtraField2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray4, 1024, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        boolean boolean4 = cpioArchiveEntry3.isNetwork();
        boolean boolean5 = cpioArchiveEntry3.isRegularFile();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = cpioArchiveEntry3.getDeviceMaj();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField2 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField2, byteArray4, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        zip64ExtendedInformationExtraField2.setRelativeHeaderOffset(zipEightByteInteger9);
        byte[] byteArray11 = zip64ExtendedInformationExtraField2.getLocalFileDataData();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray11);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray24);
        unicodeCommentExtraField13.setUnicodeName(byteArray24);
        unicodeCommentExtraField13.setNameCRC32((long) (short) -1);
        byte[] byteArray30 = unicodeCommentExtraField13.getLocalFileDataData();
        byte[] byteArray31 = unicodeCommentExtraField13.getLocalFileDataData();
        byte[] byteArray32 = unicodeCommentExtraField13.getCentralDirectoryData();
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("070702", byteArray32, (int) '4', 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry2.getPermissions();
        dumpArchiveEntry2.setGeneration(0);
        boolean boolean8 = dumpArchiveEntry2.isChrDev();
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile5 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "0x000A Zip Extra Field: Modify:[null]  Access:[1979-11-29T23:00:00Z]  Create:[1970-01-01T00:00:00Z] ", "ustar\000", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "0x5455 Zip Extra Field: Flags=1  Modify:[Sat Feb 19 06:19:12 CET 1972] ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        cpioArchiveInputStream3.mark(6);
        boolean boolean8 = cpioArchiveInputStream3.markSupported();
        boolean boolean9 = cpioArchiveInputStream3.markSupported();
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = jarArchiveInputStream11.getNextZipEntry();
        java.io.File file13 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream11, file13);
        byte[] byteArray20 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray20);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList22 = tarFile21.getEntries();
        java.nio.file.Path path23 = null;
        expander0.expand(tarFile21, path23);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25);
        long long28 = cpioArchiveInputStream26.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream29 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream26, 148, 2526, "apkm", false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream26);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream35, 8192, "UTF8");
        java.io.File file39 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer40 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream41 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream41);
        long long44 = cpioArchiveInputStream42.skip((long) (byte) 100);
        cpioArchiveInputStream42.mark(6);
        boolean boolean47 = cpioArchiveInputStream42.markSupported();
        boolean boolean48 = cpioArchiveInputStream42.markSupported();
        closeableConsumer40.accept((java.io.Closeable) cpioArchiveInputStream42);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) tarArchiveInputStream38, file39, closeableConsumer40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(zipArchiveEntry12);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[88, 50, -1, 88, 75]");
        org.junit.Assert.assertNotNull(tarArchiveEntryList22);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(closeableConsumer40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = zip64ExtendedInformationExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray11);
        long long13 = unicodeCommentExtraField12.getNameCRC32();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile14 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode15 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode15.createExtraField(zipShort16);
        byte[] byteArray18 = zipExtraField17.getCentralDirectoryData();
        x0015_CertificateIdForFile14.setCentralDirectoryData(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromLocalFileData(byteArray18, (int) (byte) 2, (int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(extraFieldParsingMode15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0]");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        long long4 = tarArchiveEntry2.getRealSize();
        java.lang.String str5 = tarArchiveEntry2.getName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean9 = tarArchiveEntry8.isSparse();
        tarArchiveEntry8.setMode(26127);
        java.util.Date date12 = tarArchiveEntry8.getModTime();
        boolean boolean13 = tarArchiveEntry8.isPaxHeader();
        tarArchiveEntry8.setDevMinor((int) (short) 2);
        java.nio.file.attribute.FileTime fileTime16 = tarArchiveEntry8.getStatusChangeTime();
        java.util.Date date17 = tarArchiveEntry8.getModTime();
        boolean boolean18 = tarArchiveEntry2.isDescendent(tarArchiveEntry8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:19:19 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Tue Jun 20 13:19:19 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("never", false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = arArchiveOutputStream12.createArchiveEntry(file13, "!<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(4096);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 0, "`\n", (long) 65535);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.util.Date date1 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.lang.String str3 = zipEightByteInteger2.toString();
        x000A_NTFS0.setModifyTime(zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = x000A_NTFS0.getModifyTime();
        org.junit.Assert.assertNull(date1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        tarArchiveEntry2.setNames("arj", "arj");
        tarArchiveEntry2.clearExtraPaxHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean12 = tarArchiveEntry11.isSparse();
        tarArchiveEntry11.setMode(26127);
        java.util.Date date15 = tarArchiveEntry11.getModTime();
        java.lang.String str16 = tarArchiveEntry11.getUserName();
        boolean boolean17 = tarArchiveEntry11.isSparse();
        boolean boolean18 = tarArchiveEntry2.equals(tarArchiveEntry11);
        java.lang.String str19 = tarArchiveEntry11.getName();
        boolean boolean20 = tarArchiveEntry11.isStreamContiguous();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:19:19 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 12L + "'", long1 == 12L);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        cpioArchiveEntry1.setDeviceMaj((long) (byte) 52);
        java.util.Date date5 = cpioArchiveEntry1.getLastModifiedDate();
        boolean boolean6 = cpioArchiveEntry1.isNetwork();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        int int5 = tarArchiveEntry2.getMode();
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        tarArchiveEntry2.setUserName("0x5455 Zip Extra Field: Flags=10  Access:[Thu Jan 01 01:00:01 CET 1970] ");
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:19:20 CEST 2023");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        int int11 = jarArchiveInputStream10.read();
        long long12 = jarArchiveInputStream10.getUncompressedCount();
        long long13 = jarArchiveInputStream10.getBytesRead();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = jarArchiveInputStream10.getNextJarEntry();
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(jarArchiveEntry14);
    }
}
