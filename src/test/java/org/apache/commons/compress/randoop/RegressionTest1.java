package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("hi!", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, "compression method");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compression method");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, "tar\000", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = cpioArchiveOutputStream4.createArchiveEntry(file6, "apk");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
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
        // The following exception was thrown during execution in test generation
        try {
            x0019_EncryptionRecipientCertificateList0.parseFromLocalFileData(byteArray30, 4095, (int) (byte) 100);
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
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
            org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            x0019_EncryptionRecipientCertificateList0.parseFromLocalFileData(byteArray2, (int) (byte) 88, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 255L + "'", long4 == 255L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.compress.archivers.ArchiveException archiveException2 = new org.apache.commons.compress.archivers.ArchiveException("hi!");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException3 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("ar", (java.lang.Throwable) archiveException2);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW_MASK;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 3 + "'", short0 == (short) 3);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISGID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "apk", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = jarArchiveEntry1.getGeneralPurposeBit();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField13 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray15 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField13, byteArray15, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = null;
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger20);
        byte[] byteArray22 = zip64ExtendedInformationExtraField13.getLocalFileDataData();
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray22);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray22);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField26 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray28 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField26, byteArray28, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = null;
        zip64ExtendedInformationExtraField26.setRelativeHeaderOffset(zipEightByteInteger33);
        byte[] byteArray35 = zip64ExtendedInformationExtraField26.getLocalFileDataData();
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray35);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField37 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray35);
        unicodeCommentExtraField24.setUnicodeName(byteArray35);
        byte[] byteArray39 = unicodeCommentExtraField24.getUnicodeName();
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            generalPurposeBit11.encode(byteArray39, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(generalPurposeBit11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray7 = new char[] { '#', 'a', '#', ' ', '#', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray7, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a# #a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a# #a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #,  , #, a]");
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray13 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11, byteArray13, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = null;
        zip64ExtendedInformationExtraField11.setRelativeHeaderOffset(zipEightByteInteger18);
        byte[] byteArray20 = zip64ExtendedInformationExtraField11.getLocalFileDataData();
        zipArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode22 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = extraFieldParsingMode22.createExtraField(zipShort23);
        byte[] byteArray25 = zipExtraField24.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField11.parseFromLocalFileData(byteArray25, 512, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 519");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(extraFieldParsingMode22);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0]");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(2048);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray4, 511, 16384);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 8]");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "070701");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile1 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0015_CertificateIdForFile1.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile1.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField18, byteArray20, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        zip64ExtendedInformationExtraField18.setRelativeHeaderOffset(zipEightByteInteger25);
        byte[] byteArray27 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray27);
        unicodeCommentExtraField16.setUnicodeName(byteArray27);
        unicodeCommentExtraField16.setNameCRC32((long) (short) -1);
        byte[] byteArray33 = unicodeCommentExtraField16.getLocalFileDataData();
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x0015_CertificateIdForFile1, byteArray33, (int) (short) -1, 5, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 15");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor4 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(84446, scatterGatherBackingStore3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream6, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream10);
        java.lang.String str12 = zipArchiveOutputStream11.getEncoding();
        parallelScatterZipCreator5.writeTo(zipArchiveOutputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream14 = archiveStreamFactory0.createArchiveOutputStream("compression method", (java.io.OutputStream) zipArchiveOutputStream11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: compression method not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find((int) (byte) 4);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse11 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray9, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        int int12 = cpioArchiveInputStream1.read(byteArray7);
        int int13 = cpioArchiveInputStream1.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream14 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        java.util.Date date3 = org.apache.commons.compress.archivers.zip.ZipUtil.fromDosTime(zipLong2);
        byte[] byteArray9 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9);
        zipLong2.putLong(byteArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[88, 0, 0, 0, 0]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory1.getArchiveInputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory1.getArchiveInputStreamProviders();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer5 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        long long9 = cpioArchiveInputStream7.skip((long) (byte) 100);
        cpioArchiveInputStream7.mark(6);
        boolean boolean12 = cpioArchiveInputStream7.markSupported();
        boolean boolean13 = cpioArchiveInputStream7.markSupported();
        closeableConsumer5.accept((java.io.Closeable) cpioArchiveInputStream7);
        long long15 = cpioArchiveInputStream7.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream18 = archiveStreamFactory1.createArchiveInputStream("!<arch>\n", (java.io.InputStream) cpioArchiveInputStream7, "ZipLong value: 11");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: !<arch>? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(closeableConsumer5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry3.setDeviceMin(156L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray0, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean8 = tarArchiveEntry7.isSparse();
        tarArchiveEntry7.setUserName("ZipLong value: 1");
        boolean boolean11 = tarArchiveEntry7.isStreamContiguous();
        tarArchiveEntry7.setSize((long) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = tarArchiveEntry7.getExtraPaxHeaders();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 312764400000L + "'", long1 == 312764400000L);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.UNIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_ZERO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0\000" + "'", str0, "0\000");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray4 = new char[] { 'a', '#', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray4, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, #,  ]");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = cpioArchiveEntry1.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, (int) (short) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList4 = tarArchiveEntry3.getOrderedSparseHeaders();
        java.lang.String str6 = tarArchiveEntry3.getExtraPaxHeader("");
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry3.setCreationTime(fileTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration9 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) tarArchiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The AES256SHA256 method doesn't support options of type class org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256));
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
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
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        // The following exception was thrown during execution in test generation
        try {
            zipLong1.putLong(byteArray17, 60011);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60011");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_FILE_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 420 + "'", int0 == 420);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_UNIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile5 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "apk", "dump", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        java.lang.Object obj3 = jarArchiveEntry1.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long7 = tarArchiveEntry6.getDataOffset();
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
        tarArchiveEntry6.setStatusChangeTime(fileTime26);
        java.util.zip.ZipEntry zipEntry30 = jarArchiveEntry1.setCreationTime(fileTime26);
        java.lang.String str31 = jarArchiveEntry1.getComment();
        java.lang.String str32 = jarArchiveEntry1.toString();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "070707");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(fileTime26);
        org.junit.Assert.assertNotNull(zipEntry30);
        org.junit.Assert.assertEquals(zipEntry30.toString(), "070707");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "070707" + "'", str32, "070707");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode6.createExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = jarArchiveEntry5.getExtraField(zipShort7);
        jarArchiveEntry5.setMethod((int) '4');
        jarArchiveEntry5.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry5);
        jarArchiveEntry5.setVersionMadeBy(508);
        boolean boolean17 = dumpArchiveEntry2.equals((java.lang.Object) 508);
        boolean boolean18 = dumpArchiveEntry2.isSocket();
        java.util.Date date19 = dumpArchiveEntry2.getLastModifiedDate();
        dumpArchiveEntry2.setOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { '4', ' ', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , a]");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray14);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (byte) -3, byteArray16, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33188");
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
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        byte[] byteArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp11.parseFromLocalFileData(byteArray23, 10, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Jun 20 13:18:09 CEST 2023");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList11 = tarArchiveEntry10.getOrderedSparseHeaders();
        boolean boolean12 = tarArchiveEntry10.isPaxGNU1XSparse();
        boolean boolean13 = tarArchiveEntry10.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry16.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry21.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList25 = tarArchiveEntry21.getOrderedSparseHeaders();
        tarArchiveEntry16.setSparseHeaders(tarArchiveStructSparseList25);
        tarArchiveEntry10.setSparseHeaders(tarArchiveStructSparseList25);
        boolean boolean28 = jarArchiveEntry1.equals((java.lang.Object) tarArchiveStructSparseList25);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList17);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList9 = tarArchiveEntry8.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry13.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry13.getOrderedSparseHeaders();
        tarArchiveEntry8.setSparseHeaders(tarArchiveStructSparseList17);
        tarArchiveEntry2.setSparseHeaders(tarArchiveStructSparseList17);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry2.getDirectoryEntries();
        boolean boolean21 = tarArchiveEntry2.isGNUSparse();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList9);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList17);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEVLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        int int4 = dumpArchiveEntry2.getHeaderHoles();
        long long5 = dumpArchiveEntry2.getOffset();
        boolean boolean7 = dumpArchiveEntry2.isSparseRecord((int) (short) 0);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry2 = cpioArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "ZipShort value: 21589");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 21589");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) -1);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("apk", byteArray3, 148, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 255L + "'", long6 == 255L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime9 = sevenZArchiveEntry0.getLastModifiedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
            long long14 = jarArchiveInputStream10.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_SPARC_FILTER;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream3, 2048);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration7 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) tarArchiveOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The BCJ_SPARC_FILTER method doesn't support options of type class org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_SPARC_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_SPARC_FILTER));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("");
        java.lang.String str2 = streamingNotSupportedException1.getFormat();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray2, (int) (short) -1);
        long long5 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray2, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 255L + "'", long5 == 255L);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        int int3 = dumpArchiveEntry2.getHeaderCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        java.io.File file0 = null;
        char[] charArray7 = new char[] { ' ', ' ', '#', '#', 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  ##a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  ##a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, #, a,  ]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        long long7 = arArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 257, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 257");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        java.nio.file.Path path11 = null;
        java.nio.file.LinkOption linkOption13 = null;
        java.nio.file.LinkOption[] linkOptionArray14 = new java.nio.file.LinkOption[] { linkOption13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveOutputStream5.createArchiveEntry(path11, "070701", linkOptionArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray14);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODTIMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.setLevel((int) (byte) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray33 = zipEightByteInteger32.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromCentralDirectoryData(byteArray33, 26127, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26127");
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
        org.junit.Assert.assertNotNull(zipEightByteInteger32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption openOption1 = null;
        java.nio.file.OpenOption[] openOptionArray2 = new java.nio.file.OpenOption[] { openOption1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, openOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray2);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 33, 0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong1);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = zip64ExtendedInformationExtraField0.getSize();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = zip64ExtendedInformationExtraField0.getHeaderId();
        org.junit.Assert.assertNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        boolean boolean4 = cpioArchiveEntry1.isRegularFile();
        cpioArchiveEntry1.setUID((long) (short) -1);
        boolean boolean7 = cpioArchiveEntry1.isDirectory();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        byte[] byteArray8 = new byte[] { (byte) -1 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray8);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray9, (int) (short) -1, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = new org.apache.commons.compress.archivers.zip.ZipShort((int) (short) 75);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        streamCompressor1.close();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField14);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.writeCounted(byteArray12, 84446, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong((int) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        boolean boolean8 = tarArchiveEntry2.isStarSparse();
        int int9 = tarArchiveEntry2.getUserId();
        boolean boolean10 = tarArchiveEntry2.isExtended();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:12 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry9 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet10 = dumpArchiveEntry9.getPermissions();
        boolean boolean11 = dumpArchiveEntry9.isChrDev();
        dumpArchiveEntry9.setGroupId(131);
        boolean boolean14 = dumpArchiveEntry9.isFile();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.dump.DumpArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(pERMISSIONSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "070707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("ustar\000", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <?> at index 5: ustar?");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        // The following exception was thrown during execution in test generation
        try {
            long long27 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
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
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        streamCompressor1.close();
        long long3 = streamCompressor1.getBytesRead();
        long long4 = streamCompressor1.getTotalBytesWritten();
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.io.File file0 = null;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray3, false);
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray3, 60012);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        dumpArchiveEntry2.setMode(84446);
        boolean boolean7 = dumpArchiveEntry2.isSocket();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APKM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apkm" + "'", str0, "apkm");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        streamCompressor1.close();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer3 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long7 = cpioArchiveInputStream5.skip((long) (byte) 100);
        cpioArchiveInputStream5.mark(6);
        boolean boolean10 = cpioArchiveInputStream5.markSupported();
        boolean boolean11 = cpioArchiveInputStream5.markSupported();
        closeableConsumer3.accept((java.io.Closeable) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        int int14 = jarArchiveInputStream13.read();
        long long15 = jarArchiveInputStream13.getUncompressedCount();
        long long16 = jarArchiveInputStream13.getUncompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.deflate((java.io.InputStream) jarArchiveInputStream13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Deflater has been closed");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertNotNull(closeableConsumer3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream6, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream10 = archiveStreamFactory0.createArchiveInputStream("apks", (java.io.InputStream) cpioArchiveInputStream8, "ustar ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: apks not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setLinkName("00");
        byte[] byteArray7 = new byte[] { (byte) 100 };
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding8 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray7, zipEncoding8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100]");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        long long13 = zipArchiveEntry10.getCrc();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(128);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\000\000" + "'", str0, "\000\000");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.setDevMajor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Major device number is out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.builder();
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        jarArchiveEntry1.setComment("ZipLong value: 11");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField10 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = asiExtraField10.getCentralDirectoryLength();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort11);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipShort11);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        boolean boolean7 = tarArchiveEntry3.isFile();
        tarArchiveEntry3.setGroupId(40960);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("ustar\000");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 75);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        arArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory0.createArchiveOutputStream("tar\000", (java.io.OutputStream) arArchiveOutputStream5, "070701");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: tar? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        boolean boolean6 = cpioArchiveEntry1.isDirectory();
        int int7 = cpioArchiveEntry1.getHeaderPadCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        long long5 = tarArchiveOutputStream4.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream1, (int) (byte) 53, 16384, "ZipShort value: 21589", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 21589");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_IA64_FILTER;
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry1 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean2 = sevenZArchiveEntry1.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray3 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry1.setContentMethods(sevenZMethodConfigurationArray3);
        java.nio.file.attribute.FileTime fileTime5 = null;
        sevenZArchiveEntry1.setLastModifiedTime(fileTime5);
        sevenZArchiveEntry1.setHasWindowsAttributes(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration9 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The BCJ_IA64_FILTER method doesn't support options of type class java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_IA64_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_IA64_FILTER));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray3);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream1 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("!<arch>\n");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <<> at index 1: !<arch>?");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.XZ;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.XZ + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.XZ));
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime1 = sevenZArchiveEntry0.getCreationTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveOutputStream5.createArchiveEntry(path6, "ustar\000", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.lang.String str1 = arjArchiveEntry0.getName();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry4 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        boolean boolean5 = arjArchiveEntry0.equals((java.lang.Object) "ustar\000");
        boolean boolean7 = arjArchiveEntry0.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = unparseableExtraField0.onUnparseableExtraField(byteArray2, 257, 6, false, 26127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 255L + "'", long4 == 255L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        byte[] byteArray14 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray14, 100, 263);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.AES_ENCRYPTED;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.AES_ENCRYPTED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.AES_ENCRYPTED));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.LZMA;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.LZMA + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.LZMA));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.io.File file0 = null;
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 33, 0]");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList19 = tarArchiveEntry11.getSparseHeaders();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream20);
        long long23 = cpioArchiveInputStream21.skip((long) (byte) 100);
        long long24 = cpioArchiveInputStream21.getBytesRead();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField25 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField25, byteArray27, 0, 0, false);
        int int32 = cpioArchiveInputStream21.read(byteArray27);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding33 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.writeEntryHeader(byteArray27, zipEncoding33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:15 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(tarArchiveStructSparseList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.lang.Iterable<java.nio.channels.SeekableByteChannel> seekableByteChannelIterable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannel0, seekableByteChannelIterable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: channels");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        tarArchiveInputStream2.reset();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, "apkm", false);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 52 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = tarArchiveInputStream2.read(byteArray9, 0, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[100, 52]");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.PRIMOS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        boolean boolean6 = tarArchiveEntry2.isOldGNUSparse();
        long long7 = tarArchiveEntry2.getLongUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) 32768, (int) (byte) 55);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile19 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode20 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = extraFieldParsingMode20.createExtraField(zipShort21);
        byte[] byteArray23 = zipExtraField22.getCentralDirectoryData();
        x0015_CertificateIdForFile19.setCentralDirectoryData(byteArray23);
        boolean boolean26 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray23, 6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray23, zipEncoding27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:16 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(extraFieldParsingMode20);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField32 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray34 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField32, byteArray34, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger39 = null;
        zip64ExtendedInformationExtraField32.setRelativeHeaderOffset(zipEightByteInteger39);
        byte[] byteArray41 = zip64ExtendedInformationExtraField32.getLocalFileDataData();
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray41);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField43 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray41);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField45 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray47 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField51 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField45, byteArray47, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger52 = null;
        zip64ExtendedInformationExtraField45.setRelativeHeaderOffset(zipEightByteInteger52);
        byte[] byteArray54 = zip64ExtendedInformationExtraField45.getLocalFileDataData();
        byte[] byteArray55 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray54);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField56 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray54);
        unicodeCommentExtraField43.setUnicodeName(byteArray54);
        byte[] byteArray58 = unicodeCommentExtraField43.getUnicodeName();
        byte[] byteArray59 = unicodeCommentExtraField43.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromLocalFileData(byteArray59, 32, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertNotNull(zipShort30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField38);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField51);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[]");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray59), "[]");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = tarArchiveInputStream6.read(byteArray10, 2048, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp3 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp3.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x5455_ExtendedTimestamp3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp3.setModifyTime(zipLong7);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = x5455_ExtendedTimestamp0.getModifyTime();
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(zipLong10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = zip64ExtendedInformationExtraField0.getCompressedSize();
        byte[] byteArray9 = new byte[] { (byte) -1 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray10, (int) (byte) 83, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1]");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setLastModifiedDate((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 11, byteArray28, (int) (byte) 54, 2162688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2162741");
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
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        dumpArchiveEntry2.setVolume(488);
        dumpArchiveEntry2.setMode(84446);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = dumpArchiveEntry2.isSparseRecord(33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33188");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveOutputStream2.createArchiveEntry(path7, "ustar\000", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IRUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isCheckSumOK();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList9 = tarArchiveEntry8.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry13.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry13.getOrderedSparseHeaders();
        tarArchiveEntry8.setSparseHeaders(tarArchiveStructSparseList17);
        tarArchiveEntry2.setSparseHeaders(tarArchiveStructSparseList17);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray20 = tarArchiveEntry2.getDirectoryEntries();
        int int21 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList9);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList17);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) cpioArchiveOutputStream2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField2 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean3 = asiExtraField2.isLink();
        int int4 = asiExtraField2.getMode();
        boolean boolean5 = asiExtraField2.isDirectory();
        byte[] byteArray6 = asiExtraField2.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "apks", byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray16, zipEncoding21, false, (long) 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:18:17 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField20);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISCHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8192 + "'", int0 == 8192);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile4 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode5 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = extraFieldParsingMode5.createExtraField(zipShort6);
        byte[] byteArray8 = zipExtraField7.getCentralDirectoryData();
        x0015_CertificateIdForFile4.setCentralDirectoryData(byteArray8);
        byte[] byteArray10 = x0015_CertificateIdForFile4.getLocalFileDataData();
        byte[] byteArray12 = new byte[] { (byte) -1 };
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray13);
        x0015_CertificateIdForFile4.setLocalFileDataData(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = arArchiveInputStream1.read(byteArray13, 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 255L + "'", long14 == 255L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        byte byte6 = tarArchiveEntry2.getLinkFlag();
        tarArchiveEntry2.setUserId((long) 9);
        long long9 = tarArchiveEntry2.getDataOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 48 + "'", byte6 == (byte) 48);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isStarSparse();
        tarArchiveEntry2.setName("");
        java.lang.Class<?> wildcardClass6 = tarArchiveEntry2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        archiveStreamFactory0.setEntryEncoding("ustar ");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer5 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        long long9 = cpioArchiveInputStream7.skip((long) (byte) 100);
        cpioArchiveInputStream7.mark(6);
        boolean boolean12 = cpioArchiveInputStream7.markSupported();
        boolean boolean13 = cpioArchiveInputStream7.markSupported();
        closeableConsumer5.accept((java.io.Closeable) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = jarArchiveInputStream15.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream17 = archiveStreamFactory0.createArchiveInputStream("ustar\000", (java.io.InputStream) jarArchiveInputStream15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(closeableConsumer5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(zipArchiveEntry16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "data descriptor");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode9.createExtraField(zipShort10);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = jarArchiveEntry8.getExtraField(zipShort10);
        jarArchiveEntry8.setMethod((int) '4');
        jarArchiveEntry8.setDiskNumberStart((long) 40960);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertNotNull(extraFieldParsingMode9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNull(zipExtraField12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        boolean boolean3 = tarArchiveInputStream2.markSupported();
        int int4 = tarArchiveInputStream2.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream2, " \000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message:  ?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 424935705);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(508);
        java.lang.String str2 = zipLong1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipLong value: 508" + "'", str2, "ZipLong value: 508");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        long long8 = tarArchiveEntry2.getDataOffset();
        boolean boolean9 = tarArchiveEntry2.isFile();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:19 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, 1000, (int) (byte) 1, "`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        boolean boolean6 = cpioArchiveEntry1.isDirectory();
        long long7 = cpioArchiveEntry1.getRemoteDeviceMaj();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray12);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField16, byteArray18, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = null;
        zip64ExtendedInformationExtraField16.setRelativeHeaderOffset(zipEightByteInteger23);
        byte[] byteArray25 = zip64ExtendedInformationExtraField16.getLocalFileDataData();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray25);
        unicodeCommentExtraField14.setUnicodeName(byteArray25);
        byte[] byteArray29 = unicodeCommentExtraField14.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray29, 26127, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj4 = jarArchiveEntry3.clone();
        int int5 = jarArchiveEntry3.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry3.setNameSource(nameSource6);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource8 = jarArchiveEntry3.getNameSource();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = extraFieldParsingMode9.createExtraField(zipShort10);
        jarArchiveEntry3.addExtraField(zipExtraField11);
        byte[] byteArray13 = jarArchiveEntry3.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromLocalFileData(byteArray13, (int) (byte) 51, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "070707");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNotNull(extraFieldParsingMode9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[85, 84, 1, 0, 0]");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.setNames("apks", "arj");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp11.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean17 = tarArchiveEntry16.isSparse();
        tarArchiveEntry16.setMode(26127);
        java.util.Date date20 = tarArchiveEntry16.getModTime();
        x5455_ExtendedTimestamp11.setModifyJavaTime(date20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort22 = x5455_ExtendedTimestamp11.getHeaderId();
        byte[] byteArray23 = x5455_ExtendedTimestamp11.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Jun 20 13:18:19 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray10, "arj");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "070702", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray30);
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
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("070701", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IROTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray14, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 270");
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        java.nio.file.Path path8 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray9 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet11 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet11, fileVisitOptionArray9);
        java.nio.file.LinkOption[] linkOptionArray13 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream6, path8, fileVisitOptionSet11, linkOptionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(fileVisitOptionArray9);
        org.junit.Assert.assertNotNull(fileVisitOptionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(linkOptionArray13);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long14 = tarArchiveEntry13.getDataOffset();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray3);
        byte[] byteArray5 = unicodePathExtraField4.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 4.  Block length of 28777 bytes exceeds remaining data of 13 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 0, -1, 90, 105, 112, 76, 111, 110, 103, 32, 118, 97, 108, 117, 101, 58, 32, 49]");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_DIR_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16877 + "'", int0 == 16877);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 5, 29127);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp8 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp8.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField12, byteArray14, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = null;
        zip64ExtendedInformationExtraField12.setRelativeHeaderOffset(zipEightByteInteger19);
        byte[] byteArray21 = zip64ExtendedInformationExtraField12.getLocalFileDataData();
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray21);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray21);
        boolean boolean24 = x5455_ExtendedTimestamp8.equals((java.lang.Object) unicodeCommentExtraField23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = x5455_ExtendedTimestamp8.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long29 = tarArchiveEntry28.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry37.setNames("", "ZipLong value: 1");
        int int41 = tarArchiveEntry37.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry44 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean45 = tarArchiveEntry44.isSparse();
        tarArchiveEntry44.setMode(26127);
        java.nio.file.attribute.FileTime fileTime48 = tarArchiveEntry44.getLastModifiedTime();
        tarArchiveEntry37.setModTime(fileTime48);
        cpioArchiveEntry33.setTime(fileTime48);
        tarArchiveEntry28.setStatusChangeTime(fileTime48);
        x5455_ExtendedTimestamp8.setModifyFileTime(fileTime48);
        java.util.zip.ZipEntry zipEntry53 = jarArchiveEntry1.setLastAccessTime(fileTime48);
        java.lang.String str54 = jarArchiveEntry1.getComment();
        jarArchiveEntry1.setComment("ZipShort value: 21589");
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(fileTime48);
        org.junit.Assert.assertNotNull(zipEntry53);
        org.junit.Assert.assertEquals(zipEntry53.toString(), "070707");
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        long long10 = cpioArchiveInputStream2.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = cpioArchiveInputStream11.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 263");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        java.lang.String str4 = tarArchiveEntry2.getName();
        int int5 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodeCommentExtraField12.getLocalFileDataLength();
        byte[] byteArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromCentralDirectoryData(byteArray30, 128, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(zipShort29);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_FAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize must be bigger than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        byte[] byteArray7 = jarArchiveEntry1.getRawName();
        jarArchiveEntry1.setVersionRequired(4095);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField12 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = resourceAlignmentExtraField12.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = jarArchiveEntry1.getExtraField(zipShort13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNull(zipExtraField14);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray3 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField6 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField6, byteArray8, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = null;
        zip64ExtendedInformationExtraField6.setRelativeHeaderOffset(zipEightByteInteger13);
        byte[] byteArray15 = zip64ExtendedInformationExtraField6.getLocalFileDataData();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray15);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray15);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField19 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray21 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField19, byteArray21, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = null;
        zip64ExtendedInformationExtraField19.setRelativeHeaderOffset(zipEightByteInteger26);
        byte[] byteArray28 = zip64ExtendedInformationExtraField19.getLocalFileDataData();
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray28);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray28);
        unicodeCommentExtraField17.setUnicodeName(byteArray28);
        unicodeCommentExtraField17.setNameCRC32((long) (short) -1);
        byte[] byteArray34 = unicodeCommentExtraField17.getLocalFileDataData();
        byte[] byteArray35 = unicodeCommentExtraField17.getLocalFileDataData();
        byte[] byteArray36 = unicodeCommentExtraField17.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray36, 32, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField25);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.nio.file.attribute.FileTime fileTime2 = jarArchiveEntry1.getLastAccessTime();
        jarArchiveEntry1.setMethod(424935705);
        jarArchiveEntry1.setExternalAttributes((long) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp0.setModifyTime(zipLong4);
        java.nio.file.attribute.FileTime fileTime6 = x5455_ExtendedTimestamp0.getModifyFileTime();
        java.util.Date date7 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        java.util.Date date8 = null;
        x5455_ExtendedTimestamp0.setModifyJavaTime(date8);
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "ustar\000", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        // The following exception was thrown during execution in test generation
        try {
            long long29 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray23, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 0 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        asiExtraField0.setUserId((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry3.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList7 = tarArchiveEntry3.getOrderedSparseHeaders();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField10 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray11 = resourceAlignmentExtraField10.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[2, -128]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier6 = null;
        parallelScatterZipCreator5.addArchiveEntry(zipArchiveEntryRequestSupplier6);
        java.util.concurrent.ExecutorService executorService8 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator9 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService8);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = extraFieldParsingMode12.createExtraField(zipShort13);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = jarArchiveEntry11.getExtraField(zipShort13);
        jarArchiveEntry11.setMethod((int) '4');
        jarArchiveEntry11.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry20 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry11);
        zipArchiveEntry20.setTime((long) (byte) 1);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier23 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable24 = parallelScatterZipCreator9.createCallable(zipArchiveEntry20, inputStreamSupplier23);
        parallelScatterZipCreator5.submitStreamAwareCallable(scatterZipOutputStreamCallable24);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator4.submit(scatterZipOutputStreamCallable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
        org.junit.Assert.assertNotNull(extraFieldParsingMode12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNull(zipExtraField15);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable24);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("ustar\000");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp12 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp12.setFlags((byte) 75);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField16 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray18 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField16, byteArray18, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = null;
        zip64ExtendedInformationExtraField16.setRelativeHeaderOffset(zipEightByteInteger23);
        byte[] byteArray25 = zip64ExtendedInformationExtraField16.getLocalFileDataData();
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray25);
        boolean boolean28 = x5455_ExtendedTimestamp12.equals((java.lang.Object) unicodeCommentExtraField27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = x5455_ExtendedTimestamp12.getCentralDirectoryLength();
        java.nio.file.attribute.FileTime fileTime30 = x5455_ExtendedTimestamp12.getModifyFileTime();
        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) x5455_ExtendedTimestamp12);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode32 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = extraFieldParsingMode32.createExtraField(zipShort33);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp35 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp35.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry40 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean41 = tarArchiveEntry40.isSparse();
        tarArchiveEntry40.setMode(26127);
        java.util.Date date44 = tarArchiveEntry40.getModTime();
        x5455_ExtendedTimestamp35.setModifyJavaTime(date44);
        byte[] byteArray47 = new byte[] { (byte) -1 };
        byte[] byteArray48 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray47);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = extraFieldParsingMode32.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp35, byteArray48, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime53 = null;
        x5455_ExtendedTimestamp35.setAccessFileTime(fileTime53);
        java.lang.Object obj55 = x5455_ExtendedTimestamp35.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp56 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp56.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry61 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean62 = tarArchiveEntry61.isSparse();
        tarArchiveEntry61.setMode(26127);
        java.util.Date date65 = tarArchiveEntry61.getModTime();
        x5455_ExtendedTimestamp56.setModifyJavaTime(date65);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong67 = x5455_ExtendedTimestamp56.getCreateTime();
        byte[] byteArray68 = x5455_ExtendedTimestamp56.getLocalFileDataData();
        byte byte69 = x5455_ExtendedTimestamp56.getFlags();
        java.util.Date date70 = x5455_ExtendedTimestamp56.getModifyJavaTime();
        x5455_ExtendedTimestamp35.setModifyJavaTime(date70);
        x5455_ExtendedTimestamp12.setCreateJavaTime(date70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:22 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, -2, -118, -111, 100]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNull(fileTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(extraFieldParsingMode32);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(date44);
// flaky:         org.junit.Assert.assertEquals(date44.toString(), "Tue Jun 20 13:18:22 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField52);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(date65);
// flaky:         org.junit.Assert.assertEquals(date65.toString(), "Tue Jun 20 13:18:22 CEST 2023");
        org.junit.Assert.assertNull(zipLong67);
        org.junit.Assert.assertNotNull(byteArray68);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[1, -2, -118, -111, 100]");
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 75 + "'", byte69 == (byte) 75);
        org.junit.Assert.assertNotNull(date70);
// flaky:         org.junit.Assert.assertEquals(date70.toString(), "Tue Jun 20 13:18:22 CEST 2023");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile1 = null;
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(sevenZOutputFile1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray2, false);
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 60012);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        long long3 = cpioArchiveEntry1.getDeviceMin();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO;
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO + "'", cOMPRESSION_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGNAME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 76 + "'", byte0 == (byte) 76);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("data descriptor");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("compressionElapsed=-1687259893320ms, mergingElapsed=0ms", byteArray24, (int) (short) 12, 4);
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
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        int int11 = tarArchiveEntry3.getDevMinor();
        long long12 = tarArchiveEntry3.getSize();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(16384);
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray4, (int) (byte) 12, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 64]");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray5 = new byte[] { (byte) 88, (byte) 50, (byte) -1, (byte) 88, (byte) 75 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray5, (int) (byte) -3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[88, 50, -1, 88, 75]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("ar");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: ar");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("hi!");
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        arArchiveOutputStream5.finish();
        arArchiveOutputStream5.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream5, "070701");
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory1.createArchiveOutputStream("tar", (java.io.OutputStream) cpioArchiveOutputStream9, "UTF8");
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream15 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream13);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream13, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream13);
        tarArchiveOutputStream18.setLongFileMode(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream21 = archiveStreamFactory1.createArchiveOutputStream("compression method", (java.io.OutputStream) tarArchiveOutputStream18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: compression method not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveOutputStream11);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        jarArchiveEntry1.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = jarArchiveEntry1.getGeneralPurposeBit();
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
        org.junit.Assert.assertNotNull(generalPurposeBit11);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        java.lang.String str1 = sevenZArchiveEntry0.getName();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry4 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.util.Date date5 = arjArchiveEntry4.getLastModifiedDate();
        sevenZArchiveEntry0.setLastModifiedDate(date5);
        boolean boolean7 = sevenZArchiveEntry0.getHasWindowsAttributes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(67324752L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean7 = tarArchiveEntry6.isSparse();
        tarArchiveEntry6.setUserId((int) ' ');
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean13 = tarArchiveEntry6.isDescendent(tarArchiveEntry12);
        boolean boolean14 = tarArchiveInputStream3.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry12);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry16 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray18 = new byte[] { (byte) -1 };
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray18);
        boolean boolean21 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray19, (int) (short) -1);
        jarArchiveEntry16.setExtra(byteArray19);
        byte[] byteArray23 = jarArchiveEntry16.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = tarArchiveInputStream3.read(byteArray23, 33188, 511);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 0, "ZipShort value: 21589");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode11 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = extraFieldParsingMode11.createExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = jarArchiveEntry10.getExtraField(zipShort12);
        jarArchiveEntry10.setMethod((int) '4');
        jarArchiveEntry10.setMethod((int) (byte) 100);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier19 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator0.addArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry10, inputStreamSupplier19);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException; message: Task java.util.concurrent.FutureTask@7875cd9e rejected from java.util.concurrent.ThreadPoolExecutor@3cb67815[Terminated, pool size = 0, active threads = 0, queued tasks = 0, completed tasks = 0]");
        } catch (java.util.concurrent.RejectedExecutionException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertNotNull(extraFieldParsingMode11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNull(zipExtraField14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        byte[] byteArray1 = unparseableExtraFieldData0.getCentralDirectoryData();
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromLocalFileData(byteArray5, 64, 511);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray1, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setUserName("ZipLong value: 1");
        boolean boolean13 = tarArchiveEntry9.isStreamContiguous();
        boolean boolean14 = tarArchiveEntry9.isStreamContiguous();
        long long15 = tarArchiveEntry9.getLongGroupId();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find(156);
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(2048);
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromLocalFileData(byteArray2, (int) (byte) -3, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 8]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature21 = null;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException22 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature21);
        org.apache.commons.compress.MemoryLimitException memoryLimitException23 = new org.apache.commons.compress.MemoryLimitException((long) 100, 10, (java.lang.Exception) unsupportedZipFeatureException22);
        boolean boolean24 = tarArchiveEntry2.equals((java.lang.Object) unsupportedZipFeatureException22);
        tarArchiveEntry2.setUserId((long) 11);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:24 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "arj", false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream12 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset9 = null;
        int int10 = cpioArchiveEntry8.getHeaderPadCount(charset9);
        cpioArchiveEntry8.setGID((long) 156);
        long long13 = cpioArchiveEntry8.getRemoteDeviceMaj();
        long long14 = cpioArchiveEntry8.getGID();
        long long15 = cpioArchiveEntry8.getDeviceMin();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 156L + "'", long14 == 156L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        // The following exception was thrown during execution in test generation
        try {
            int int31 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 48, byteArray28, (int) (byte) 10, 2162688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2162695");
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
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(10);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        byte[] byteArray0 = null;
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray0, false, unparseableExtraField2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField2);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator2.submit(scatterZipOutputStreamCallable20);
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, 1024, 1, "0\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 0?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray14);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(11L, byteArray16, 16384, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18430");
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
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = x5455_ExtendedTimestamp0.getCreateTime();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        x5455_ExtendedTimestamp0.setFlags((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:25 CEST 2023");
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, -117, -111, 100]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = tarArchiveEntry2.getExtraPaxHeaders();
        byte[] byteArray5 = new byte[] { (byte) -1 };
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray6, (int) (short) -1);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap3, byteArray6, zipEncoding10, false, (long) 256);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 255L + "'", long9 == 255L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.DEFLATED;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.DEFLATED + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.DEFLATED));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "data descriptor", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
            zipArchiveOutputStream5.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode11 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode11.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("ZipShort value: 21589", byteArray11, 29127, (int) (short) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray5 = new char[] { '4', '#', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "zip", charArray5, sevenZFileOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #, a]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, 3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("00", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipLong value: 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream6, file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveOutputStream5.createArchiveEntry(path6, "tar", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.ACCESS_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 2 + "'", byte0 == (byte) 2);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getUID();
        long long5 = cpioArchiveEntry1.getGID();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode(133317334738600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 1d9a368db7f0040 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        cpioArchiveEntry1.setGID((long) 156);
        long long6 = cpioArchiveEntry1.getRemoteDeviceMaj();
        long long7 = cpioArchiveEntry1.getGID();
        long long8 = cpioArchiveEntry1.getDeviceMin();
        cpioArchiveEntry1.setName("././@LongLink");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 156L + "'", long7 == 156L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "never", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.nio.file.attribute.FileTime fileTime2 = jarArchiveEntry1.getLastAccessTime();
        jarArchiveEntry1.setMethod(424935705);
        jarArchiveEntry1.setExternalAttributes((long) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = extraFieldParsingMode7.createExtraField(zipShort8);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp10 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp10.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean16 = tarArchiveEntry15.isSparse();
        tarArchiveEntry15.setMode(26127);
        java.util.Date date19 = tarArchiveEntry15.getModTime();
        x5455_ExtendedTimestamp10.setModifyJavaTime(date19);
        byte[] byteArray22 = new byte[] { (byte) -1 };
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray22);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField27 = extraFieldParsingMode7.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp10, byteArray23, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime28 = null;
        x5455_ExtendedTimestamp10.setAccessFileTime(fileTime28);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = x5455_ExtendedTimestamp10.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap34 = tarArchiveEntry33.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime35 = tarArchiveEntry33.getLastModifiedTime();
        x5455_ExtendedTimestamp10.setModifyFileTime(fileTime35);
        java.util.zip.ZipEntry zipEntry37 = jarArchiveEntry1.setCreationTime(fileTime35);
        java.lang.String str38 = zipEntry37.getComment();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNotNull(extraFieldParsingMode7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Tue Jun 20 13:18:26 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField27);
        org.junit.Assert.assertNull(zipLong30);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNotNull(fileTime35);
        org.junit.Assert.assertNotNull(zipEntry37);
        org.junit.Assert.assertEquals(zipEntry37.toString(), "070707");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = jarMarker5.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = jarMarker5.getLocalFileDataLength();
        byte[] byteArray8 = jarMarker5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray8, 2048, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tarArchiveInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean4 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setMode(26127);
        java.util.Date date7 = tarArchiveEntry3.getModTime();
        sevenZArchiveEntry0.setLastModifiedDate(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Tue Jun 20 13:18:27 CEST 2023");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore4 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore4);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
            org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MULTIVOLUME_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 464 + "'", int0 == 464);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "compressionElapsed=-1687259892275ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.pathBased(path0, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("ustar ");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x5455_ExtendedTimestamp0.getHeaderId();
        byte[] byteArray12 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit14 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray12, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 131");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:28 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 4, -117, -111, 100]");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        dumpArchiveEntry2.setOffset((long) (byte) 51);
        long long5 = dumpArchiveEntry2.getSize();
        boolean boolean6 = dumpArchiveEntry2.isBlkDev();
        long long7 = dumpArchiveEntry2.getOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 51L + "'", long7 == 51L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        long long6 = tarArchiveOutputStream5.getBytesWritten();
        tarArchiveOutputStream5.setBigNumberMode(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream5, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, (short) (byte) 103, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 103");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod3 = sevenZMethodConfiguration1.getMethod();
        java.lang.Object obj4 = null;
        boolean boolean5 = sevenZMethodConfiguration1.equals(obj4);
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + sevenZMethod3 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod3.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        byte[] byteArray3 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 511, 67324752, zipEncoding6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 511");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
        byte[] byteArray11 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile12 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode13 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode13.createExtraField(zipShort14);
        byte[] byteArray16 = zipExtraField15.getCentralDirectoryData();
        x0015_CertificateIdForFile12.setCentralDirectoryData(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray16, 21, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(extraFieldParsingMode13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipExtraField15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0]");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.io.File file0 = null;
        char[] charArray7 = new char[] { '#', '4', ' ', '#', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 #a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 #a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  , #, a, #]");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream6);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveOutputStream6.createArchiveEntry(file11, "dump");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("apk");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (byte) 103, byteArray3, 464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 464");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 255L + "'", long4 == 255L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getCreateTime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:29 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 5, -117, -111, 100]");
        org.junit.Assert.assertNull(zipLong12);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("ustar ");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("ZipShort value: 0");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray5 = new char[] { 'a', '4', '#', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray5, sevenZFileOptions6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, 4, #, a]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 16, byteArray31, (int) (short) 2, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setName("ustar ");
        sevenZArchiveEntry0.setCrc(131);
        boolean boolean5 = sevenZArchiveEntry0.getHasCreationDate();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime6 = sevenZArchiveEntry0.getCreationTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0015_CertificateIdForFile0.getHashAlgorithm();
        int int4 = x0015_CertificateIdForFile0.getRecordCount();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray14, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(1024);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream7 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        long long5 = cpioArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        tarArchiveEntry2.setNames("arj", "arj");
        tarArchiveEntry2.clearExtraPaxHeaders();
        boolean boolean9 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream6.getNextEntry();
        boolean boolean8 = tarArchiveInputStream6.markSupported();
        boolean boolean9 = tarArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = tarArchiveInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        int int16 = dumpArchiveEntry2.getVolume();
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:18:30 CEST 2023");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 488 + "'", int16 == 488);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField0.getLocalFileDataLength();
        byte[] byteArray11 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getCrcValue();
        sevenZArchiveEntry0.setCreationDate((long) (byte) 88);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry11 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean12 = sevenZArchiveEntry11.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray13 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry11.setContentMethods(sevenZMethodConfigurationArray13);
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray13);
        boolean boolean16 = sevenZArchiveEntry0.isDirectory();
        boolean boolean17 = sevenZArchiveEntry0.getHasWindowsAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime18 = sevenZArchiveEntry0.getAccessTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException3 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("TRAILER!!!");
        org.apache.commons.compress.MemoryLimitException memoryLimitException4 = new org.apache.commons.compress.MemoryLimitException((long) (-1), 33188, (java.lang.Exception) dumpArchiveException3);
        int int5 = memoryLimitException4.getMemoryLimitInKb();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING));
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        long long4 = tarArchiveEntry2.getRealSize();
        java.lang.String str5 = tarArchiveEntry2.getGroupName();
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.io.File[] fileArray0 = new java.io.File[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray0);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker32 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort33 = jarMarker32.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort34 = jarMarker32.getLocalFileDataLength();
        byte[] byteArray35 = jarMarker32.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField12, byteArray35, 131, 2162688, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 6375");
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
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(jarMarker32);
        org.junit.Assert.assertNotNull(zipShort33);
        org.junit.Assert.assertNotNull(zipShort34);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        short short4 = resourceAlignmentExtraField2.getAlignment();
        byte[] byteArray5 = resourceAlignmentExtraField2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray5, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 75 + "'", short4 == (short) 75);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[75, -128]");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        cpioArchiveEntry1.setRemoteDeviceMin((long) 40960);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "7z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = tarArchiveEntry2.getExtraPaxHeaders();
        java.nio.file.attribute.FileTime fileTime4 = tarArchiveEntry2.getLastModifiedTime();
        boolean boolean5 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setUserId((long) (byte) 103);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(fileTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = jarArchiveInputStream10.getCompressedCount();
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
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator4.addArchiveEntry(zipArchiveEntryRequestSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        int int7 = tarArchiveEntry3.getGroupId();
        tarArchiveEntry3.addPaxHeader("hi!", "compression method");
        java.lang.String str11 = tarArchiveEntry3.getName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = extraFieldParsingMode12.createExtraField(zipShort13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode15 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode15.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = extraFieldParsingMode12.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature19 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        java.lang.String str20 = feature19.toString();
        boolean boolean21 = zipShort16.equals((java.lang.Object) feature19);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry23 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj24 = jarArchiveEntry23.clone();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException25 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature19, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry23);
        java.util.Date date26 = jarArchiveEntry23.getLastModifiedDate();
        tarArchiveEntry3.setModTime(date26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray30 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField28, byteArray30, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger35 = null;
        zip64ExtendedInformationExtraField28.setRelativeHeaderOffset(zipEightByteInteger35);
        byte[] byteArray37 = zip64ExtendedInformationExtraField28.getLocalFileDataData();
        boolean boolean39 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray37, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding40 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray37, zipEncoding40, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(extraFieldParsingMode12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNotNull(extraFieldParsingMode15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertNotNull(feature19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "compression method" + "'", str20, "compression method");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "070707");
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField34);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getSize();
        long long9 = sevenZArchiveEntry0.getCrcValue();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        long long14 = jarArchiveInputStream10.skip((long) 1000);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, "data descriptor");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: data descriptor");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp9.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean15 = tarArchiveEntry14.isSparse();
        tarArchiveEntry14.setMode(26127);
        java.util.Date date18 = tarArchiveEntry14.getModTime();
        x5455_ExtendedTimestamp9.setModifyJavaTime(date18);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = x5455_ExtendedTimestamp9.getCreateTime();
        byte[] byteArray21 = x5455_ExtendedTimestamp9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray21, 345, 1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Tue Jun 20 13:18:32 CEST 2023");
        org.junit.Assert.assertNull(zipLong20);
        org.junit.Assert.assertNotNull(byteArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 8, -117, -111, 100]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        java.lang.String str4 = tarArchiveEntry2.getName();
        boolean boolean5 = tarArchiveEntry2.isSparse();
        byte[] byteArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getRecordSize();
        int int7 = tarArchiveOutputStream5.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getCrcValue();
        sevenZArchiveEntry0.setCreationDate((long) (byte) 88);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry11 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean12 = sevenZArchiveEntry11.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray13 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry11.setContentMethods(sevenZMethodConfigurationArray13);
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray13);
        boolean boolean16 = sevenZArchiveEntry0.isDirectory();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry17 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean21 = tarArchiveEntry20.isSparse();
        tarArchiveEntry20.setMode(26127);
        java.util.Date date24 = tarArchiveEntry20.getModTime();
        sevenZArchiveEntry17.setLastModifiedDate(date24);
        sevenZArchiveEntry0.setAccessDate(date24);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime27 = sevenZArchiveEntry0.getCreationTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Jun 20 13:18:32 CEST 2023");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.lang.String str7 = tarArchiveEntry2.getUserName();
        tarArchiveEntry2.setGroupName("apks");
        boolean boolean10 = tarArchiveEntry2.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile11 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField14 = extraFieldParsingMode12.createExtraField(zipShort13);
        byte[] byteArray15 = zipExtraField14.getCentralDirectoryData();
        x0015_CertificateIdForFile11.setCentralDirectoryData(byteArray15);
        byte[] byteArray17 = x0015_CertificateIdForFile11.getLocalFileDataData();
        byte[] byteArray19 = new byte[] { (byte) -1 };
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        long long21 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray20);
        x0015_CertificateIdForFile11.setLocalFileDataData(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:32 CEST 2023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(extraFieldParsingMode12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipExtraField14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0]");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 255L + "'", long21 == 255L);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "dump");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0015_CertificateIdForFile0.getHashAlgorithm();
        int int4 = x0015_CertificateIdForFile0.getRecordCount();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray14, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray7 = new char[] { '4', '#', '#', ' ', '#', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray7, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4## ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4## ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, #,  , #, #]");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipShort value: 0", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int2 = cpioArchiveEntry1.getHeaderSize();
        cpioArchiveEntry1.setGID((long) 4096);
        long long5 = cpioArchiveEntry1.getRemoteDeviceMin();
        boolean boolean6 = cpioArchiveEntry1.isSymbolicLink();
        cpioArchiveEntry1.setGID((long) (byte) 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile1 = new org.apache.commons.compress.archivers.tar.TarFile(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setUserId((int) ' ');
        boolean boolean6 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        long long10 = cpioArchiveInputStream2.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = cpioArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize must be bigger than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = cpioArchiveInputStream1.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong1);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = zip64ExtendedInformationExtraField0.getSize();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = zip64ExtendedInformationExtraField4.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField15, byteArray17, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = null;
        zip64ExtendedInformationExtraField15.setRelativeHeaderOffset(zipEightByteInteger22);
        byte[] byteArray24 = zip64ExtendedInformationExtraField15.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = zip64ExtendedInformationExtraField15.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray27 = zipEightByteInteger26.getBytes();
        java.lang.String str28 = zipEightByteInteger26.toString();
        zip64ExtendedInformationExtraField15.setCompressedSize(zipEightByteInteger26);
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger26);
        zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger26);
        org.junit.Assert.assertNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger25);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ZipEightByteInteger value: 0" + "'", str28, "ZipEightByteInteger value: 0");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("apkm", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile5 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "compressionElapsed=-1687259893320ms, mergingElapsed=0ms", "ZipLong value: 508", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 508");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException2 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("arj");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException3 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("ar", (java.lang.Throwable) streamingNotSupportedException2);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0, (int) '4', (int) '4', "dump", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        int int6 = tarArchiveOutputStream5.getRecordSize();
        int int7 = tarArchiveOutputStream5.getCount();
        tarArchiveOutputStream5.flush();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = tarArchiveOutputStream5.createArchiveEntry(file9, "././@LongLink");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 512 + "'", int6 == 512);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField1 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray3 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField1, byteArray3, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        zip64ExtendedInformationExtraField1.setRelativeHeaderOffset(zipEightByteInteger8);
        byte[] byteArray10 = zip64ExtendedInformationExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField12 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField12);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray10, (int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 16877, 131, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter10 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: C:\\Users\\Daniele\\AppData\\Local\\Temp\\parallelscatter3057922977752786004n1");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor6);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(512);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 512L + "'", long1 == 512L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        streamCompressor1.close();
        long long3 = streamCompressor1.getTotalBytesWritten();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4);
        long long7 = cpioArchiveInputStream5.skip((long) (byte) 100);
        long long8 = cpioArchiveInputStream5.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = tarArchiveInputStream10.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.deflate((java.io.InputStream) tarArchiveInputStream10, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Deflater has been closed");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(archiveEntry11);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray3 = new byte[] { (byte) -1 };
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) -1);
        jarArchiveEntry1.setExtra(byteArray4);
        jarArchiveEntry1.setComment("ZipLong value: 11");
        java.util.Date date10 = jarArchiveEntry1.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField13 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 75, true);
        short short14 = resourceAlignmentExtraField13.getAlignment();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = resourceAlignmentExtraField13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = jarArchiveEntry1.getExtraField(zipShort15);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 75 + "'", short14 == (short) 75);
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(zipExtraField16);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
            java.math.BigInteger bigInteger21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = jarArchiveInputStream10.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream10, "compression method", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compression method");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(archiveEntry14);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream6.getNextEntry();
        boolean boolean8 = tarArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream9 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode3.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = jarArchiveEntry2.getExtraField(zipShort4);
        jarArchiveEntry2.setMethod((int) '4');
        jarArchiveEntry2.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry2);
        jarArchiveEntry2.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource15 = jarArchiveEntry14.getNameSource();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry16 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry14);
        byte[] byteArray17 = jarArchiveEntry14.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 88, byteArray17, (int) (byte) 88, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + nameSource15 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource15.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField18, byteArray20, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        zip64ExtendedInformationExtraField18.setRelativeHeaderOffset(zipEightByteInteger25);
        byte[] byteArray27 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray27);
        unicodeCommentExtraField16.setUnicodeName(byteArray27);
        unicodeCommentExtraField16.setNameCRC32((long) (short) -1);
        byte[] byteArray33 = unicodeCommentExtraField16.getLocalFileDataData();
        byte[] byteArray34 = unicodeCommentExtraField16.getLocalFileDataData();
        byte[] byteArray35 = unicodeCommentExtraField16.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.writeEntryHeader(byteArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[0, 0, 0, 0, 0]");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream3, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream7);
        java.lang.String str9 = zipArchiveOutputStream8.getEncoding();
        parallelScatterZipCreator2.writeTo(zipArchiveOutputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8, (short) (byte) 4);
        java.io.File file13 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer14 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream15);
        long long18 = cpioArchiveInputStream16.skip((long) (byte) 100);
        cpioArchiveInputStream16.mark(6);
        boolean boolean21 = cpioArchiveInputStream16.markSupported();
        boolean boolean22 = cpioArchiveInputStream16.markSupported();
        closeableConsumer14.accept((java.io.Closeable) cpioArchiveInputStream16);
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("compressionElapsed=-1687259892275ms, mergingElapsed=0ms", (java.io.OutputStream) zipArchiveOutputStream8, file13, closeableConsumer14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: compressionElapsed=-1687259892275ms, mergingElapsed=0ms not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNotNull(closeableConsumer14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        byte byte19 = tarArchiveEntry2.getLinkFlag();
        tarArchiveEntry2.clearExtraPaxHeaders();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:34 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 48 + "'", byte19 == (byte) 48);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) -3, "apks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type -3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.io.File file0 = null;
        byte[] byteArray2 = new byte[] { (byte) -1 };
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray2);
        long long4 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 255L + "'", long4 == 255L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        int int5 = tarArchiveEntry2.getMode();
        boolean boolean6 = tarArchiveEntry2.isPaxGNUSparse();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33188 + "'", int5 == 33188);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.FILE_TYPE_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 61440 + "'", int0 == 61440);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        long long9 = cpioArchiveInputStream1.skip(1L);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(156L);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cpioArchiveInputStream1.read(byteArray11, 128, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-100, 0, 0, 0]");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getCrcValue();
        sevenZArchiveEntry0.setCreationDate((long) (byte) 88);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry11 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean12 = sevenZArchiveEntry11.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray13 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry11.setContentMethods(sevenZMethodConfigurationArray13);
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray13);
        java.util.Date date16 = null;
        sevenZArchiveEntry0.setCreationDate(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = sevenZArchiveEntry0.getLastModifiedDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray13);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070701");
        java.nio.file.Path path11 = null;
        java.nio.file.LinkOption[] linkOptionArray13 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = zipArchiveOutputStream5.createArchiveEntry(path11, "compressionElapsed=-1687259892275ms, mergingElapsed=0ms", linkOptionArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertNotNull(linkOptionArray13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = extraFieldParsingMode4.createExtraField(zipShort5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = jarArchiveEntry3.getExtraField(zipShort5);
        jarArchiveEntry3.setMethod((int) '4');
        jarArchiveEntry3.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry3);
        byte[] byteArray13 = zipArchiveEntry12.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "zip", byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNull(zipExtraField7);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, "0\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile28 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray23, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray28, zipEncoding29, true, (long) (byte) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "compressionElapsed=-1687259893320ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compressionElapsed=-1687259893320ms, mergingElapsed=0ms");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "././@LongLink");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix1 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        x7875_NewUnix1.setGID((long) 'a');
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField4, byteArray6, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = null;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField15 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13, true, unparseableExtraField15);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13);
        x7875_NewUnix1.parseFromCentralDirectoryData(byteArray13, 40960, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = unparseableExtraField0.onUnparseableExtraField(byteArray13, 64, 110, false, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        boolean boolean6 = arArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry7 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean11 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setMode(26127);
        java.util.Date date14 = tarArchiveEntry10.getModTime();
        sevenZArchiveEntry7.setLastModifiedDate(date14);
        long long16 = sevenZArchiveEntry7.getCrcValue();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry cannot be cast to org.apache.commons.compress.archivers.ar.ArArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Tue Jun 20 13:18:35 CEST 2023");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 1, false);
        tarArchiveEntry3.addPaxHeader("tar\000", "");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList7 = tarArchiveEntry3.getOrderedSparseHeaders();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList8 = tarArchiveEntry3.getOrderedSparseHeaders();
        java.lang.String str9 = tarArchiveEntry3.getUserName();
        boolean boolean10 = tarArchiveEntry3.isDirectory();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList7);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) arArchiveInputStream1, "00", true);
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile7 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm8 = x0015_CertificateIdForFile7.getHashAlgorithm();
        byte[] byteArray9 = x0015_CertificateIdForFile7.getLocalFileDataData();
        byte[] byteArray11 = new byte[] { (byte) -1 };
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        long long13 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField15);
        x0015_CertificateIdForFile7.parseFromLocalFileData(byteArray12, (int) (short) 0, 36864);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arArchiveInputStream1.read(byteArray12, (int) (short) 2, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm8);
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 255L + "'", long13 == 255L);
        org.junit.Assert.assertNotNull(unparseableExtraField15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, "070701");
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream6, file12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = zip64ExtendedInformationExtraField0.getCompressedSize();
        byte[] byteArray11 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
        byte[] byteArray14 = new byte[] { (byte) -1 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile19 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray15, false);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray15, (int) (byte) 1, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream2, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream6);
        java.lang.String str8 = zipArchiveOutputStream7.getEncoding();
        parallelScatterZipCreator1.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, (short) (byte) 4);
        java.nio.file.Path path12 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray13 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet15 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet15, fileVisitOptionArray13);
        java.nio.file.LinkOption linkOption17 = null;
        java.nio.file.LinkOption[] linkOptionArray18 = new java.nio.file.LinkOption[] { linkOption17 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream7, path12, fileVisitOptionSet15, linkOptionArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(fileVisitOptionArray13);
        org.junit.Assert.assertNotNull(fileVisitOptionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(linkOptionArray18);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = tarArchiveInputStream3.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        long long7 = jarArchiveEntry1.getDataOffset();
        int int8 = jarArchiveEntry1.getMethod();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.CPIO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cpio" + "'", str0, "cpio");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        java.util.Date date6 = tarArchiveEntry2.getModTime();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = tarArchiveEntry2.getExtraPaxHeaders();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode10 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = extraFieldParsingMode10.createExtraField(zipShort11);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = jarArchiveEntry9.getExtraField(zipShort11);
        jarArchiveEntry9.setMethod((int) '4');
        jarArchiveEntry9.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry9);
        byte[] byteArray19 = zipArchiveEntry18.getLocalFileDataExtra();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap7, byteArray19, zipEncoding20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Tue Jun 20 13:18:36 CEST 2023");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(extraFieldParsingMode10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        int int19 = tarArchiveEntry2.getDevMinor();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:36 CEST 2023");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        boolean boolean27 = generalPurposeBit25.usesDataDescriptor();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (byte) 1);
        x5455_ExtendedTimestamp0.setAccessTime(zipLong2);
        java.lang.String str4 = x5455_ExtendedTimestamp0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x5455 Zip Extra Field: Flags=10  Access:[Thu Jan 01 01:00:01 CET 1970] " + "'", str4, "0x5455 Zip Extra Field: Flags=10  Access:[Thu Jan 01 01:00:01 CET 1970] ");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray4 = resourceAlignmentExtraField3.getLocalFileDataData();
        x0019_EncryptionRecipientCertificateList0.setCentralDirectoryData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false);
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[2, -128]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(256);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime(84446L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(511, false);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2, true);
        byte[] byteArray6 = resourceAlignmentExtraField5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromLocalFileData(byteArray6, (int) (byte) 54, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[2, -128]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        arArchiveOutputStream2.setLongFileMode(4095);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ZipShort value: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        jarArchiveEntry1.setMethod((int) '4');
        java.util.Date date8 = jarArchiveEntry1.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime9 = jarArchiveEntry1.getLastModifiedTime();
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNull(fileTime9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.find(100);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long21 = tarArchiveEntry20.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry29.setNames("", "ZipLong value: 1");
        int int33 = tarArchiveEntry29.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean37 = tarArchiveEntry36.isSparse();
        tarArchiveEntry36.setMode(26127);
        java.nio.file.attribute.FileTime fileTime40 = tarArchiveEntry36.getLastModifiedTime();
        tarArchiveEntry29.setModTime(fileTime40);
        cpioArchiveEntry25.setTime(fileTime40);
        tarArchiveEntry20.setStatusChangeTime(fileTime40);
        x5455_ExtendedTimestamp0.setModifyFileTime(fileTime40);
        byte[] byteArray46 = new byte[] { (byte) -1 };
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray46);
        boolean boolean49 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray47, (int) (short) -1);
        long long50 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray47);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray47, (int) (byte) 12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: X5455_ExtendedTimestamp too short, only -1 bytes");
        } catch (java.util.zip.ZipException e) {
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileTime40);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[-1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 255L + "'", long50 == 255L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.lang.Class<?> wildcardClass67 = zip64ExtendedInformationExtraField66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        int int8 = tarArchiveOutputStream5.getRecordSize();
        java.nio.file.Path path9 = null;
        java.nio.file.LinkOption linkOption11 = null;
        java.nio.file.LinkOption[] linkOptionArray12 = new java.nio.file.LinkOption[] { linkOption11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveOutputStream5.createArchiveEntry(path9, "070702", linkOptionArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 512 + "'", int8 == 512);
        org.junit.Assert.assertNotNull(linkOptionArray12);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        long long14 = jarArchiveInputStream10.skip((long) 1000);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream15 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) jarArchiveInputStream10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        byte[] byteArray37 = unicodeCommentExtraField13.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("jar", byteArray37, 64, (int) (byte) 12);
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
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0, 0, 0, 0, -1]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream4);
        zipArchiveOutputStream5.flush();
        zipArchiveOutputStream5.setUseLanguageEncodingFlag(true);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray11 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField9, byteArray11, 0, 0, false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray11, 60012, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField15);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.nio.file.attribute.FileTime fileTime1 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime3 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 0);
        x5455_ExtendedTimestamp0.setCreateTime(zipLong5);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = zip64ExtendedInformationExtraField7.getRelativeHeaderOffset();
        byte[] byteArray18 = zip64ExtendedInformationExtraField7.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipLong5.putLong(byteArray18, (int) (short) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(fileTime3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "cpio", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = jarArchiveInputStream10.getNextEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = jarArchiveInputStream10.getNextJarEntry();
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(archiveEntry14);
        org.junit.Assert.assertNull(jarArchiveEntry15);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode6.createExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = jarArchiveEntry5.getExtraField(zipShort7);
        jarArchiveEntry5.setMethod((int) '4');
        jarArchiveEntry5.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry5);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp15.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean21 = tarArchiveEntry20.isSparse();
        tarArchiveEntry20.setMode(26127);
        java.util.Date date24 = tarArchiveEntry20.getModTime();
        x5455_ExtendedTimestamp15.setModifyJavaTime(date24);
        zipArchiveEntry14.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp15);
        byte[] byteArray29 = new byte[] { (byte) -1 };
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray29);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray30);
        org.apache.commons.compress.archivers.tar.TarFile tarFile32 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray30);
        boolean boolean33 = x5455_ExtendedTimestamp15.equals((java.lang.Object) byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = arArchiveInputStream1.read(byteArray30, (int) (short) 10, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date24);
// flaky:         org.junit.Assert.assertEquals(date24.toString(), "Tue Jun 20 13:18:38 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "0x5455 Zip Extra Field: Flags=10  Access:[Thu Jan 01 01:00:01 CET 1970] ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream6.getNextEntry();
        boolean boolean8 = tarArchiveInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 0, path1, "070702", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        int int3 = cpioArchiveEntry1.getHeaderPadCount((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long4 = cpioArchiveEntry1.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.findAvailableArchiveInputStreamProviders();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("\001\004");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry2 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("`\n", "070707");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet3 = dumpArchiveEntry2.getPermissions();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode6 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode6.createExtraField(zipShort7);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = jarArchiveEntry5.getExtraField(zipShort7);
        jarArchiveEntry5.setMethod((int) '4');
        jarArchiveEntry5.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry5);
        jarArchiveEntry5.setVersionMadeBy(508);
        boolean boolean17 = dumpArchiveEntry2.equals((java.lang.Object) 508);
        boolean boolean18 = dumpArchiveEntry2.isSocket();
        java.lang.String str19 = dumpArchiveEntry2.getName();
        boolean boolean20 = dumpArchiveEntry2.isBlkDev();
        dumpArchiveEntry2.setNlink((int) (byte) 77);
        org.junit.Assert.assertNotNull(pERMISSIONSet3);
        org.junit.Assert.assertNotNull(extraFieldParsingMode6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNull(zipExtraField9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "`\n" + "'", str19, "`\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = extraFieldParsingMode2.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        long long7 = jarArchiveEntry1.getDataOffset();
        jarArchiveEntry1.setSize((long) (short) 100);
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OLDNORM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, "apks");
        int int4 = tarArchiveInputStream3.getRecordSize();
        tarArchiveInputStream3.reset();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = jarArchiveInputStream6.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 512 + "'", int4 == 512);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        jarArchiveEntry1.setDiskNumberStart((long) (byte) 10);
        jarArchiveEntry1.setCrc((long) (byte) 75);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = jarArchiveEntry1.getExtraFields(false);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        jarArchiveEntry1.setGeneralPurposeBit(generalPurposeBit9);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray14 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField12, byteArray14, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = null;
        zip64ExtendedInformationExtraField12.setRelativeHeaderOffset(zipEightByteInteger19);
        byte[] byteArray21 = zip64ExtendedInformationExtraField12.getLocalFileDataData();
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray21);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray21);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField25 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray27 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField25, byteArray27, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = null;
        zip64ExtendedInformationExtraField25.setRelativeHeaderOffset(zipEightByteInteger32);
        byte[] byteArray34 = zip64ExtendedInformationExtraField25.getLocalFileDataData();
        byte[] byteArray35 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray34);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField36 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray34);
        unicodeCommentExtraField23.setUnicodeName(byteArray34);
        unicodeCommentExtraField23.setNameCRC32((long) (short) -1);
        byte[] byteArray40 = unicodeCommentExtraField23.getLocalFileDataData();
        byte[] byteArray41 = unicodeCommentExtraField23.getLocalFileDataData();
        byte[] byteArray42 = unicodeCommentExtraField23.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            generalPurposeBit9.encode(byteArray42, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField18);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField31);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList19 = tarArchiveEntry18.getOrderedSparseHeaders();
        boolean boolean20 = tarArchiveEntry18.isPaxGNU1XSparse();
        int int21 = tarArchiveEntry18.getMode();
        java.util.Date date22 = tarArchiveEntry18.getModTime();
        dumpArchiveEntry2.setLastModifiedDate(date22);
        dumpArchiveEntry2.setDeleted(true);
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:18:39 CEST 2023");
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33188 + "'", int21 == 33188);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Jun 20 13:18:39 CEST 2023");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, (long) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean11 = tarArchiveEntry10.isSparse();
        tarArchiveEntry10.setUserName("ZipLong value: 1");
        boolean boolean14 = tarArchiveEntry10.isStreamContiguous();
        java.util.Date date15 = tarArchiveEntry10.getLastModifiedDate();
        sevenZArchiveEntry0.setLastModifiedDate(date15);
        sevenZArchiveEntry0.setDirectory(false);
        boolean boolean19 = sevenZArchiveEntry0.hasStream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Tue Jun 20 13:18:39 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2);
        long long5 = cpioArchiveInputStream3.skip((long) (byte) 100);
        java.io.File file6 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ustar ", (java.io.InputStream) cpioArchiveInputStream3, file6, closeableConsumer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: consumer");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry4 = arArchiveInputStream1.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray1, sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix23 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = x7875_NewUnix23.getLocalFileDataLength();
        x7875_NewUnix23.setUID(255L);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 52 };
        org.apache.commons.compress.archivers.tar.TarFile tarFile30 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField34 = extraFieldParsingMode15.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x7875_NewUnix23, byteArray29, 8192, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[100, 52]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512;
        int int1 = hashAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32782 + "'", int1 == 32782);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        byte[] byteArray2 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        byte[] byteArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0015_CertificateIdForFile0.parseFromLocalFileData(byteArray4, 60012, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        jarArchiveEntry1.setDiskNumberStart((long) (byte) 10);
        jarArchiveEntry1.setSize(0L);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray9 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField7, byteArray9, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = null;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger14);
        byte[] byteArray16 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = zip64ExtendedInformationExtraField7.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = zip64ExtendedInformationExtraField7.getHeaderId();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort18);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipShort18);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.XAPK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xapk" + "'", str0, "xapk");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode3.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = jarArchiveEntry2.getExtraField(zipShort4);
        jarArchiveEntry2.setMethod((int) '4');
        jarArchiveEntry2.setDiskNumberStart((long) 40960);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry11 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry2);
        jarArchiveEntry2.setVersionMadeBy(508);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry14 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource15 = jarArchiveEntry14.getNameSource();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry16 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry14);
        byte[] byteArray17 = jarArchiveEntry14.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) -1, byteArray17, (int) (byte) 52, 84446);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84495");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + nameSource15 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource15.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean1 = sevenZArchiveEntry0.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray2);
        java.nio.file.attribute.FileTime fileTime4 = null;
        sevenZArchiveEntry0.setLastModifiedTime(fileTime4);
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        long long8 = sevenZArchiveEntry0.getCrcValue();
        sevenZArchiveEntry0.setCreationDate((long) (byte) 88);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry11 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        boolean boolean12 = sevenZArchiveEntry11.getHasLastModifiedDate();
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray13 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] {};
        sevenZArchiveEntry11.setContentMethods(sevenZMethodConfigurationArray13);
        sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = sevenZArchiveEntry0.getAccessDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sevenZMethodConfigurationArray13);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        byte[] byteArray25 = new byte[] { (byte) -1 };
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray25);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipLong value: 1", byteArray26);
        org.apache.commons.compress.archivers.tar.TarFile tarFile28 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray26);
        boolean boolean29 = x5455_ExtendedTimestamp11.equals((java.lang.Object) byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray26, 2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Tue Jun 20 13:18:40 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-1]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1);
        int int5 = cpioArchiveInputStream1.available();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(4);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = arArchiveOutputStream2.createArchiveEntry(path7, "xapk", linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0);
        tarArchiveOutputStream5.setLongFileMode(0);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray11 = new byte[] { (byte) -1 };
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        boolean boolean14 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) -1);
        jarArchiveEntry9.setExtra(byteArray12);
        jarArchiveEntry9.setComment("ZipLong value: 11");
        java.util.Date date18 = jarArchiveEntry9.getLastModifiedDate();
        java.util.Date date19 = jarArchiveEntry9.getLastModifiedDate();
        jarArchiveEntry9.setComment("070701");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 00:59:59 CET 1970");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean3 = tarArchiveEntry2.isSparse();
        tarArchiveEntry2.setMode(26127);
        int int6 = tarArchiveEntry2.getGroupId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
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
            x000A_NTFS0.parseFromCentralDirectoryData(byteArray12, 32782, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32786");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
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
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray30, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 12");
        } catch (java.util.zip.ZipException e) {
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, "070707");
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry6 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.lang.String str7 = arjArchiveEntry6.getName();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry10 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry("070707", "ustar\000");
        boolean boolean11 = arjArchiveEntry6.equals((java.lang.Object) "ustar\000");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.arj.ArjArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "ZipLong value: 508");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setNameSource(nameSource4);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        byte[] byteArray7 = jarArchiveEntry1.getRawName();
        jarArchiveEntry1.setVersionRequired(4095);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.nio.file.attribute.FileTime fileTime2 = jarArchiveEntry1.getLastAccessTime();
        jarArchiveEntry1.setMethod(424935705);
        jarArchiveEntry1.setVersionRequired((int) (byte) 52);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry7.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        asiExtraField0.setLinkedFile("");
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray5, (int) (short) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile9 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5, false);
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 60012);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray5, 4096, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: The length is too short, only 10 bytes, expected at least 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("");
        java.lang.Throwable[] throwableArray2 = streamingNotSupportedException1.getSuppressed();
        java.lang.String str3 = streamingNotSupportedException1.getFormat();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("never");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 'a');
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.JPEG;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode3 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = extraFieldParsingMode3.createExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = jarArchiveEntry2.getExtraField(zipShort4);
        jarArchiveEntry2.setMethod((int) '4');
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException9 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry2);
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile10 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode11 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = extraFieldParsingMode11.createExtraField(zipShort12);
        byte[] byteArray14 = zipExtraField13.getCentralDirectoryData();
        x0015_CertificateIdForFile10.setCentralDirectoryData(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x0015_CertificateIdForFile10.getLocalFileDataLength();
        jarArchiveEntry2.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x0015_CertificateIdForFile10);
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.JPEG + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.JPEG));
        org.junit.Assert.assertNotNull(extraFieldParsingMode3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
        org.junit.Assert.assertNull(zipExtraField6);
        org.junit.Assert.assertNotNull(extraFieldParsingMode11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0]");
        org.junit.Assert.assertNotNull(zipShort16);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        // The following exception was thrown during execution in test generation
        try {
            int int29 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm4 = x0015_CertificateIdForFile0.getHashAlgorithm();
        byte[] byteArray5 = x0015_CertificateIdForFile0.getCentralDirectoryData();
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertNull(hashAlgorithm4);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.io.File file0 = null;
        char[] charArray2 = new char[] { ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray2, sevenZFileOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "apks", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField3, byteArray5, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        long long14 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray12);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF8", byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "7z", byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField9);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        boolean boolean3 = asiExtraField0.isLink();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray7 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField5, byteArray7, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = null;
        zip64ExtendedInformationExtraField5.setRelativeHeaderOffset(zipEightByteInteger12);
        byte[] byteArray14 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray14);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray14);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray20 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField18, byteArray20, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        zip64ExtendedInformationExtraField18.setRelativeHeaderOffset(zipEightByteInteger25);
        byte[] byteArray27 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray27);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray27);
        unicodeCommentExtraField16.setUnicodeName(byteArray27);
        unicodeCommentExtraField16.setNameCRC32((long) (short) -1);
        byte[] byteArray33 = unicodeCommentExtraField16.getLocalFileDataData();
        byte[] byteArray34 = unicodeCommentExtraField16.getLocalFileDataData();
        byte[] byteArray35 = unicodeCommentExtraField16.getCentralDirectoryData();
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray36, 21, 67324752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry4 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "ustar ", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ustar\000", (byte) 54);
        boolean boolean6 = arArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry5);
        java.nio.file.Path path7 = null;
        java.nio.file.LinkOption linkOption9 = null;
        java.nio.file.LinkOption[] linkOptionArray10 = new java.nio.file.LinkOption[] { linkOption9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream2.createArchiveEntry(path7, "dump", linkOptionArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(linkOptionArray10);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA384;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA384 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA384));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) arArchiveInputStream1, 11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = arArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(8192);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode1 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = extraFieldParsingMode1.createExtraField(zipShort2);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp4.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean10 = tarArchiveEntry9.isSparse();
        tarArchiveEntry9.setMode(26127);
        java.util.Date date13 = tarArchiveEntry9.getModTime();
        x5455_ExtendedTimestamp4.setModifyJavaTime(date13);
        byte[] byteArray16 = new byte[] { (byte) -1 };
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = extraFieldParsingMode1.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp4, byteArray17, 0, 32768, true);
        // The following exception was thrown during execution in test generation
        try {
            x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray17, (int) (byte) 88, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(extraFieldParsingMode1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipExtraField3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Tue Jun 20 13:18:42 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField21);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isGNULongNameEntry();
        tarArchiveEntry2.setUserName("ar");
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp0.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean6 = tarArchiveEntry5.isSparse();
        tarArchiveEntry5.setMode(26127);
        java.util.Date date9 = tarArchiveEntry5.getModTime();
        x5455_ExtendedTimestamp0.setModifyJavaTime(date9);
        byte[] byteArray11 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Tue Jun 20 13:18:42 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 18, -117, -111, 100]");
        org.junit.Assert.assertNotNull(zipShort12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray2 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField0, byteArray2, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        zip64ExtendedInformationExtraField0.setSize(zipEightByteInteger10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        byte[] byteArray13 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger14 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(11);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, "arj", false, true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream11.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        arArchiveOutputStream2.finish();
        arArchiveOutputStream2.flush();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2526, (int) (byte) 103, "never");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 2526");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj3 = jarArchiveEntry2.clone();
        java.lang.Object obj4 = jarArchiveEntry2.clone();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        long long8 = tarArchiveEntry7.getDataOffset();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 8, "ZipLong value: 11", (long) 10240);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry16.setNames("", "ZipLong value: 1");
        int int20 = tarArchiveEntry16.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean24 = tarArchiveEntry23.isSparse();
        tarArchiveEntry23.setMode(26127);
        java.nio.file.attribute.FileTime fileTime27 = tarArchiveEntry23.getLastModifiedTime();
        tarArchiveEntry16.setModTime(fileTime27);
        cpioArchiveEntry12.setTime(fileTime27);
        tarArchiveEntry7.setStatusChangeTime(fileTime27);
        java.util.zip.ZipEntry zipEntry31 = jarArchiveEntry2.setCreationTime(fileTime27);
        java.lang.String str32 = jarArchiveEntry2.getComment();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField33 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray35 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField39 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField33, byteArray35, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = null;
        zip64ExtendedInformationExtraField33.setRelativeHeaderOffset(zipEightByteInteger40);
        byte[] byteArray42 = zip64ExtendedInformationExtraField33.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField44 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray45 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray42, true, unparseableExtraField44);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray46 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray42);
        byte[] byteArray47 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray46);
        jarArchiveEntry2.setExtraFields(zipExtraFieldArray46);
        byte[] byteArray49 = jarArchiveEntry2.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(1687259903L, byteArray49, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "070707");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "070707");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertNotNull(zipEntry31);
        org.junit.Assert.assertEquals(zipEntry31.toString(), "070707");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField39);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray45);
        org.junit.Assert.assertNotNull(zipExtraFieldArray46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[]");
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_DIR_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 493 + "'", int0 == 493);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        byte[] byteArray4 = new byte[] { (byte) -1 };
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) -1);
        jarArchiveEntry2.setExtra(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(2097151L, byteArray5, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find(464);
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FILE));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        boolean boolean5 = tarArchiveEntry2.isCheckSumOK();
        boolean boolean6 = tarArchiveEntry2.isStreamContiguous();
        tarArchiveEntry2.setName("ZipLong value: 508");
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        // The following exception was thrown during execution in test generation
        try {
            long long12 = jarArchiveInputStream10.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipArchiveEntry11);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
        java.lang.String str1 = feature0.toString();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unknown compressed size" + "'", str1, "unknown compressed size");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList3 = tarArchiveEntry2.getOrderedSparseHeaders();
        boolean boolean4 = tarArchiveEntry2.isPaxGNU1XSparse();
        long long5 = tarArchiveEntry2.getSize();
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getMode();
        asiExtraField0.setMode(10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = asiExtraField0.getHeaderId();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipShort6);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 424935705, byteArray30, 2526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2526");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[-1, -1, -1, -1, 1]");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray0, 60011);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        boolean boolean5 = cpioArchiveEntry1.isDirectory();
        boolean boolean6 = cpioArchiveEntry1.isPipe();
        long long7 = cpioArchiveEntry1.getTime();
        boolean boolean8 = cpioArchiveEntry1.isPipe();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISBLK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24576 + "'", int0 == 24576);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        // The following exception was thrown during execution in test generation
        try {
            long long33 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray30, (int) 'a', (int) (byte) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray1);
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 255L + "'", long3 == 255L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = tarArchiveInputStream6.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream8 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry7);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apks");
        java.nio.charset.Charset charset2 = null;
        int int3 = cpioArchiveEntry1.getHeaderPadCount(charset2);
        boolean boolean4 = cpioArchiveEntry1.isBlockDevice();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = cpioArchiveEntry1.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_ASCII;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 4 + "'", short0 == (short) 4);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0015_CertificateIdForFile0.getHashAlgorithm();
        int int4 = x0015_CertificateIdForFile0.getRecordCount();
        byte[] byteArray5 = x0015_CertificateIdForFile0.getCentralDirectoryData();
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(" \000");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        long long4 = cpioArchiveInputStream1.getBytesRead();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 100);
        int int7 = tarArchiveInputStream6.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream8 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x000A_NTFS0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS3 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_LENIENT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = extraFieldParsingMode4.createExtraField(zipShort5);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp7.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean13 = tarArchiveEntry12.isSparse();
        tarArchiveEntry12.setMode(26127);
        java.util.Date date16 = tarArchiveEntry12.getModTime();
        x5455_ExtendedTimestamp7.setModifyJavaTime(date16);
        byte[] byteArray19 = new byte[] { (byte) -1 };
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = extraFieldParsingMode4.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp7, byteArray20, 0, 32768, true);
        java.nio.file.attribute.FileTime fileTime25 = null;
        x5455_ExtendedTimestamp7.setAccessFileTime(fileTime25);
        java.lang.Object obj27 = x5455_ExtendedTimestamp7.clone();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp28 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp28.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean34 = tarArchiveEntry33.isSparse();
        tarArchiveEntry33.setMode(26127);
        java.util.Date date37 = tarArchiveEntry33.getModTime();
        x5455_ExtendedTimestamp28.setModifyJavaTime(date37);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = x5455_ExtendedTimestamp28.getCreateTime();
        byte[] byteArray40 = x5455_ExtendedTimestamp28.getLocalFileDataData();
        byte byte41 = x5455_ExtendedTimestamp28.getFlags();
        java.util.Date date42 = x5455_ExtendedTimestamp28.getModifyJavaTime();
        x5455_ExtendedTimestamp7.setModifyJavaTime(date42);
        x000A_NTFS3.setModifyJavaTime(date42);
        x000A_NTFS0.setAccessJavaTime(date42);
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(extraFieldParsingMode4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Jun 20 13:18:44 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[-1]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1]");
        org.junit.Assert.assertNotNull(zipExtraField24);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Tue Jun 20 13:18:44 CEST 2023");
        org.junit.Assert.assertNull(zipLong39);
        org.junit.Assert.assertNotNull(byteArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 20, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 75 + "'", byte41 == (byte) 75);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Tue Jun 20 13:18:44 CEST 2023");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = null;
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong1);
        zip64ExtendedInformationExtraField0.reparseCentralDirectoryData(false, true, true, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray1, (int) ' ', 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream(outputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, 2048);
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray5, 420, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ar", seekableByteChannel2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ar");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder3 = builder1.withMaxMemoryLimitInKb(0);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder5 = builder1.withUseDefaultNameForUnnamedEntries(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder7 = builder5.withUseDefaultNameForUnnamedEntries(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder9 = builder5.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions10 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(sevenZFileOptions10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1);
        long long4 = cpioArchiveInputStream2.skip((long) (byte) 100);
        cpioArchiveInputStream2.mark(6);
        boolean boolean7 = cpioArchiveInputStream2.markSupported();
        boolean boolean8 = cpioArchiveInputStream2.markSupported();
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream2);
        long long10 = cpioArchiveInputStream2.getBytesRead();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream13 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) cpioArchiveInputStream11, "data descriptor");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: data descriptor");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        long long3 = cpioArchiveInputStream1.skip((long) (byte) 100);
        cpioArchiveInputStream1.mark(6);
        boolean boolean6 = cpioArchiveInputStream1.markSupported();
        boolean boolean7 = cpioArchiveInputStream1.markSupported();
        long long9 = cpioArchiveInputStream1.skip(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream1, 424935705, (int) (short) 100, "compression method");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: compression method");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry3.setNames("", "ZipLong value: 1");
        boolean boolean7 = tarArchiveEntry3.isFile();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE8 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV;
        boolean boolean9 = tarArchiveEntry3.equals((java.lang.Object) tYPE8);
        long long10 = tarArchiveEntry3.getRealSize();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + tYPE8 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV + "'", tYPE8.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("`\n", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.compress.archivers.zip.X0014_X509Certificates x0014_X509Certificates0 = new org.apache.commons.compress.archivers.zip.X0014_X509Certificates();
        byte[] byteArray1 = x0014_X509Certificates0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0014_X509Certificates0.getHeaderId();
        java.lang.String str3 = zipShort2.toString();
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipShort value: 20" + "'", str3, "ZipShort value: 20");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("dump", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray29);
        boolean boolean32 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray30, 60012);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray30, 16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[-1, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
            int int17 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path1 = null;
        java.nio.file.Path path2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path1, path2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("070707");
        java.lang.Object obj2 = jarArchiveEntry1.clone();
        jarArchiveEntry1.setDiskNumberStart((long) (byte) 10);
        jarArchiveEntry1.setCrc((long) (byte) 75);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        x5455_ExtendedTimestamp7.setFlags((byte) 75);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean13 = tarArchiveEntry12.isSparse();
        tarArchiveEntry12.setMode(26127);
        java.util.Date date16 = tarArchiveEntry12.getModTime();
        x5455_ExtendedTimestamp7.setModifyJavaTime(date16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong18 = x5455_ExtendedTimestamp7.getCreateTime();
        byte[] byteArray19 = x5455_ExtendedTimestamp7.getLocalFileDataData();
        byte byte20 = x5455_ExtendedTimestamp7.getFlags();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) 0, false);
        tarArchiveEntry24.setNames("", "ZipLong value: 1");
        int int28 = tarArchiveEntry24.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", true);
        boolean boolean32 = tarArchiveEntry31.isSparse();
        tarArchiveEntry31.setMode(26127);
        java.nio.file.attribute.FileTime fileTime35 = tarArchiveEntry31.getLastModifiedTime();
        tarArchiveEntry24.setModTime(fileTime35);
        x5455_ExtendedTimestamp7.setCreateFileTime(fileTime35);
        java.util.zip.ZipEntry zipEntry38 = jarArchiveEntry1.setLastAccessTime(fileTime35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry39 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "070707");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "070707");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "070707");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Tue Jun 20 13:18:46 CEST 2023");
        org.junit.Assert.assertNull(zipLong18);
        org.junit.Assert.assertNotNull(byteArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 22, -117, -111, 100]");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 75 + "'", byte20 == (byte) 75);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(fileTime35);
        org.junit.Assert.assertNotNull(zipEntry38);
        org.junit.Assert.assertEquals(zipEntry38.toString(), "070707");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x5455_ExtendedTimestamp3.getHeaderId();
        byte[] byteArray15 = x5455_ExtendedTimestamp3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode0.onUnparseableExtraField(byteArray15, 5, 345, false, 31);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField22 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray24 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField22, byteArray24, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger29 = null;
        zip64ExtendedInformationExtraField22.setRelativeHeaderOffset(zipEightByteInteger29);
        byte[] byteArray31 = zip64ExtendedInformationExtraField22.getLocalFileDataData();
        byte[] byteArray32 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray31);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray31);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField35 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray37 = new byte[] { (byte) 1 };
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField35, byteArray37, 0, 0, false);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger42 = null;
        zip64ExtendedInformationExtraField35.setRelativeHeaderOffset(zipEightByteInteger42);
        byte[] byteArray44 = zip64ExtendedInformationExtraField35.getLocalFileDataData();
        byte[] byteArray45 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray44);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField46 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar\000", byteArray44);
        unicodeCommentExtraField33.setUnicodeName(byteArray44);
        byte[] byteArray48 = unicodeCommentExtraField33.getUnicodeName();
        long long49 = unicodeCommentExtraField33.getNameCRC32();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = unicodeCommentExtraField33.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField51 = extraFieldParsingMode0.createExtraField(zipShort50);
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Jun 20 13:18:46 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 22, -117, -111, 100]");
        org.junit.Assert.assertNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1]");
        org.junit.Assert.assertNotNull(zipExtraField41);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[]");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNotNull(zipExtraField51);
    }
}
