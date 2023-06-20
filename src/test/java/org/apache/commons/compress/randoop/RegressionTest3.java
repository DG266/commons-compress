package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream21 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = zip64ExtendedInformationExtraField3.getDiskStartNumber();
        byte[] byteArray5 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = zip64ExtendedInformationExtraField3.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = zip64ExtendedInformationExtraField3.getCentralDirectoryLength();
        int int11 = zipShort10.getValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 24 + "'", int11 == 24);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "compressionElapsed=-1687279828328ms, mergingElapsed=0ms");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile6.finish();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

//    @Test
//    public void test1505() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1505");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        char[] charArray4 = new char[] { ' ', ' ' };
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile5.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//        org.junit.Assert.assertNotNull(charArray4);
//        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
//        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
//    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        byte[] byteArray1 = zipEightByteInteger0.getBytes();
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        char[] charArray6 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray6);
        java.io.File file8 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer9 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream12 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream11);
        arArchiveOutputStream12.setLongFileMode((int) (short) 3);
        closeableConsumer9.accept((java.io.Closeable) arArchiveOutputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, "zip");
        closeableConsumer9.accept((java.io.Closeable) cpioArchiveInputStream24);
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("00", seekableByteChannel3, file8, closeableConsumer9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 00 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ,  ]");
        org.junit.Assert.assertNotNull(closeableConsumer9);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        int int1 = x0015_CertificateIdForFile0.getRecordCount();
        byte[] byteArray2 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile0.getCentralDirectoryLength();
        byte[] byteArray4 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField3.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier4 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable5 = parallelScatterZipCreator3.createCallable(zipArchiveEntryRequestSupplier4);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics6 = parallelScatterZipCreator3.getStatisticsMessage();
        long long7 = scatterStatistics6.getCompressionElapsed();
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable5);
        org.junit.Assert.assertNotNull(scatterStatistics6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1687279858485L) + "'", long7 == (-1687279858485L));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(24576);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "dump", false, true, true);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, (int) (byte) 120, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str8 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str9 = unicodeExtraFieldPolicy7.toString();
        java.lang.String str10 = unicodeExtraFieldPolicy7.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "not encodeable" + "'", str8, "not encodeable");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "not encodeable" + "'", str9, "not encodeable");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        boolean boolean10 = tarArchiveInputStream5.markSupported();
        boolean boolean11 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream13 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "cpio");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, 26128, 4, "apks", false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        char[] charArray12 = new char[] { 'a', '4', '#', '4', ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray12);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions14 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean15 = sevenZFileOptions14.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, sevenZFileOptions14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4,  ,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream7.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(52, false);
        byte[] byteArray3 = resourceAlignmentExtraField2.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[52, 0]");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        char[] charArray5 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(sevenZOutputFile7, path8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator4.addArchiveEntry(zipArchiveEntryRequestSupplier5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean7 = tarArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray10);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        unicodePathExtraField11.setUnicodeName(byteArray14);
        int int17 = tarArchiveInputStream6.read(byteArray14);
        unrecognizedExtraField0.setLocalFileDataData(byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray21 = jarMarker20.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray21);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        unicodePathExtraField22.setUnicodeName(byteArray25);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unicodePathExtraField22.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort28);
        byte[] byteArray30 = unrecognizedExtraField0.getLocalFileDataData();
        byte[] byteArray31 = unrecognizedExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort32 = unrecognizedExtraField0.getCentralDirectoryLength();
        byte[] byteArray33 = unrecognizedExtraField0.getLocalFileDataData();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(jarMarker20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(zipShort32);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod2 = sevenZMethodConfiguration1.getMethod();
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
        org.junit.Assert.assertTrue("'" + sevenZMethod2 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod2.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore9 = defaultBackingStoreSupplier3.get();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore8);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        int int9 = tarArchiveOutputStream8.getCount();
        int int10 = tarArchiveOutputStream8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile8 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1, "ZipShort value: 21");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 21");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = cpioArchiveOutputStream14.createArchiveEntry(file15, "dump");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(24576);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "dump", false, true, true);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, (int) (byte) 54);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry18 = zipArchiveInputStream15.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField3.getLocalFileDataLength();
        byte[] byteArray12 = unicodePathExtraField3.getCentralDirectoryData();
        long long13 = unicodePathExtraField3.getNameCRC32();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unicodePathExtraField3.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipExtraField5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long2 = zipLong1.getValue();
        java.lang.Object obj3 = zipLong1.clone();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        byte[] byteArray5 = zipLong4.getBytes();
        boolean boolean6 = zipLong1.equals((java.lang.Object) zipLong4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "ZipLong value: -1");
        org.junit.Assert.assertNotNull(zipLong4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 7, 8]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, 16384, (int) '#');
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker13, jarMarker15, jarMarker17, jarMarker19 };
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray20);
        int int22 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray21);
        org.apache.commons.compress.archivers.tar.TarFile tarFile24 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray21, false);
        java.math.BigInteger bigInteger25 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray21);
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray21, 24576);
        boolean boolean29 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray21, 4095);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray21, 36864, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36864");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(jarMarker19);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51966 + "'", int22 == 51966);
        org.junit.Assert.assertNotNull(bigInteger25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, 16384, (int) '#');
        long long13 = x7875_NewUnix0.getUID();
        byte[] byteArray14 = x7875_NewUnix0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1000L + "'", long13 == 1000L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.setBigNumberMode(345);
        int int11 = tarArchiveOutputStream8.getCount();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.write(156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesUTF8ForNames();
        generalPurposeBit0.useDataDescriptor(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "", true, true, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        long long11 = cpioArchiveInputStream9.skip((long) 52);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9);
        int int13 = cpioArchiveInputStream12.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField3.getHeaderId();
        byte[] byteArray10 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField11 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        unicodePathExtraField15.setUnicodeName(byteArray18);
        byte[] byteArray21 = unicodePathExtraField15.getLocalFileDataData();
        unrecognizedExtraField11.setCentralDirectoryData(byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = unrecognizedExtraField11.getLocalFileDataLength();
        byte[] byteArray24 = unrecognizedExtraField11.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker26 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray27 = jarMarker26.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker30 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray31 = jarMarker30.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray31);
        unicodePathExtraField28.setUnicodeName(byteArray31);
        byte[] byteArray34 = unicodePathExtraField28.getLocalFileDataData();
        byte[] byteArray35 = unicodePathExtraField28.getUnicodeName();
        org.apache.commons.compress.archivers.tar.TarFile tarFile37 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray35, false);
        unrecognizedExtraField11.setCentralDirectoryData(byteArray35);
        unicodePathExtraField3.setUnicodeName(byteArray35);
        unicodePathExtraField3.setNameCRC32((long) (short) -1);
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(jarMarker26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(jarMarker30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("7z");
        java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, 4, 0, zipEncoding6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 345, byteArray2, (int) (short) -1, (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        unicodePathExtraField3.setNameCRC32((long) 1024);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField11 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        unicodePathExtraField15.setUnicodeName(byteArray18);
        byte[] byteArray21 = unicodePathExtraField15.getLocalFileDataData();
        unrecognizedExtraField11.setCentralDirectoryData(byteArray21);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray21, (int) (byte) 51);
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField3.parseFromCentralDirectoryData(byteArray21, (int) (byte) 1, (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        char[] charArray12 = new char[] { 'a', '4', '#', '4', ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray12);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = null;
        sevenZOutputFile13.putArchiveEntry(archiveEntry14);
        java.nio.file.Path path16 = null;
        java.nio.file.OpenOption openOption17 = null;
        java.nio.file.OpenOption[] openOptionArray18 = new java.nio.file.OpenOption[] { openOption17 };
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile13.write(path16, openOptionArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4,  ,  ]");
        org.junit.Assert.assertNotNull(openOptionArray18);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) 8, 2048, "UTF8");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream15.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("compressionElapsed=-1687279828328ms, mergingElapsed=0ms");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean4 = resourceAlignmentExtraField3.allowMethodChange();
        byte[] byteArray5 = resourceAlignmentExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray5, 51966);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 16, byteArray5, 10240, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10730");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[51, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "arj", false, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream17 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getLocalFileDataLength();
        byte[] byteArray11 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        boolean boolean15 = zipEightByteInteger12.equals((java.lang.Object) byteArray14);
        byte[] byteArray16 = zipEightByteInteger12.getBytes();
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray16, 64);
        unicodePathExtraField3.setUnicodeName(byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray21 = jarMarker20.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker26 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker20, jarMarker22, jarMarker24, jarMarker26 };
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray27);
        int int29 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray28);
        org.apache.commons.compress.archivers.tar.TarFile tarFile31 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray28, false);
        java.math.BigInteger bigInteger32 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray28);
        unicodePathExtraField3.setUnicodeName(byteArray28);
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jarMarker20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(jarMarker22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(jarMarker26);
        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 51966 + "'", int29 == 51966);
        org.junit.Assert.assertNotNull(bigInteger32);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm2 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean6 = resourceAlignmentExtraField5.allowMethodChange();
        byte[] byteArray7 = resourceAlignmentExtraField5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray7, (int) (byte) 49, 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNull(hashAlgorithm2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[51, 0]");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        int int19 = tarArchiveInputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 0, "tar");
        tarArchiveInputStream5.reset();
        boolean boolean24 = tarArchiveInputStream5.markSupported();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("ZipLong value: 1024");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        java.util.concurrent.ExecutorService executorService6 = null;
        java.util.concurrent.ExecutorService executorService7 = null;
        java.nio.file.Path path8 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier9 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path8);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator11 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService7, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier9, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator12 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService6, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier9);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore13 = defaultBackingStoreSupplier9.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor14 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore13);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        byte[] byteArray19 = zipEightByteInteger15.getBytes();
        streamCompressor14.writeCounted(byteArray19);
        x0015_CertificateIdForFile0.setLocalFileDataData(byteArray19);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField24 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean25 = resourceAlignmentExtraField24.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = resourceAlignmentExtraField24.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = resourceAlignmentExtraField24.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = resourceAlignmentExtraField24.getHeaderId();
        byte[] byteArray29 = resourceAlignmentExtraField24.getCentralDirectoryData();
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray29);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore13);
        org.junit.Assert.assertNotNull(streamCompressor14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[51, 0]");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray2 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray4 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(24576);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "dump", false, true, true);
        boolean boolean16 = tarArchiveInputStream10.markSupported();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getLocalFileDataLength();
        byte[] byteArray11 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        boolean boolean15 = zipEightByteInteger12.equals((java.lang.Object) byteArray14);
        byte[] byteArray16 = zipEightByteInteger12.getBytes();
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray16, 64);
        unicodePathExtraField3.setUnicodeName(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = unicodePathExtraField3.getHeaderId();
        java.lang.Object obj21 = zipShort20.clone();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "ZipShort value: 28789");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "ZipShort value: 28789");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "ZipShort value: 28789");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setLevel(0);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode14 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream1.setUseZip64(zip64Mode14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + zip64Mode14 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode14.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ZipEightByteInteger value: 10", seekableByteChannel3, file4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipEightByteInteger value: 10 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        boolean boolean3 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean4 = generalPurposeBit0.usesDataDescriptor();
        generalPurposeBit0.useEncryption(true);
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        boolean boolean2 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) (byte) 51, (int) (byte) 83);
        long long20 = tarArchiveInputStream5.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.setBigNumberMode(345);
        int int11 = tarArchiveOutputStream8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.setBigNumberMode(345);
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        long long13 = tarArchiveOutputStream8.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream22 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) zipArchiveInputStream20, "hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        int int4 = asiExtraField0.getUserId();
        int int5 = asiExtraField0.getGroupId();
        int int6 = asiExtraField0.getGroupId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40960 + "'", int4 == 40960);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        arArchiveOutputStream2.setLongFileMode(100);
        arArchiveOutputStream2.setLongFileMode((int) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (int) (short) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        byte[] byteArray4 = resourceAlignmentExtraField2.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray4);
        boolean boolean7 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, 51966);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray4, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 263");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[51, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        int int1 = x0015_CertificateIdForFile0.getRecordCount();
        byte[] byteArray2 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm4 = x0015_CertificateIdForFile0.getHashAlgorithm();
        int int5 = x0015_CertificateIdForFile0.getRecordCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(hashAlgorithm4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("");
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        long long7 = zipArchiveOutputStream5.getBytesWritten();
        java.lang.String str8 = zipArchiveOutputStream5.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream5.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str14 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream5.setLevel((int) (byte) 1);
        zipArchiveOutputStream5.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream21 = archiveStreamFactory0.createArchiveOutputStream("tar", (java.io.OutputStream) zipArchiveOutputStream5, "ar");
        java.lang.String str22 = zipArchiveOutputStream5.getEncoding();
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) 24576);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream5.write(byteArray24, (int) (byte) 120, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertNotNull(archiveOutputStream21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTF8" + "'", str22, "UTF8");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 96, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setLinkedFile("070702");
        java.lang.String str7 = asiExtraField0.getLinkedFile();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker10 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray11 = jarMarker10.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker8, jarMarker10, jarMarker12, jarMarker14 };
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray15);
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray16, 8);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray16, (int) (byte) 50, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "070702" + "'", str7, "070702");
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(jarMarker14);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.flush();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "apk");
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore6 = defaultBackingStoreSupplier3.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor7 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(24, scatterGatherBackingStore6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore6);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField11 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean12 = resourceAlignmentExtraField11.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = resourceAlignmentExtraField11.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = resourceAlignmentExtraField11.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger16, zipEightByteInteger17);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = zip64ExtendedInformationExtraField18.getDiskStartNumber();
        byte[] byteArray20 = zip64ExtendedInformationExtraField18.getLocalFileDataData();
        byte[] byteArray21 = zip64ExtendedInformationExtraField18.getCentralDirectoryData();
        resourceAlignmentExtraField11.parseFromCentralDirectoryData(byteArray21, 6, 12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipEightByteInteger17);
        org.junit.Assert.assertNull(zipLong19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        java.lang.String str4 = zipEightByteInteger1.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        boolean boolean8 = zipEightByteInteger5.equals((java.lang.Object) byteArray7);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger10, zipEightByteInteger11);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField13 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger5, zipEightByteInteger11);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger5);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        byte[] byteArray19 = zipEightByteInteger15.getBytes();
        java.lang.String str20 = zipEightByteInteger15.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField24 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger22, zipEightByteInteger23);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong26 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long27 = zipLong26.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger15, zipEightByteInteger23, zipLong26);
        byte[] byteArray29 = zip64ExtendedInformationExtraField28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField33 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger31, zipEightByteInteger32);
        byte[] byteArray34 = zipEightByteInteger32.getBytes();
        zip64ExtendedInformationExtraField28.setSize(zipEightByteInteger32);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipEightByteInteger value: 10" + "'", str4, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ZipEightByteInteger value: 0" + "'", str20, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipEightByteInteger32);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        boolean boolean7 = zipArchiveOutputStream1.isSeekable();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        long long11 = zipArchiveOutputStream9.getBytesWritten();
        java.lang.String str12 = zipArchiveOutputStream9.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode13 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream9.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setUseZip64(zip64Mode13);
        zipArchiveOutputStream1.setComment("ustar ");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode13 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode13.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

//    @Test
//    public void test1574() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest3.test1574");
//        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
//        unicodePathExtraField4.setUnicodeName(byteArray7);
//        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
//        unrecognizedExtraField0.setCentralDirectoryData(byteArray10);
//        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unrecognizedExtraField0.getLocalFileDataLength();
//        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getHeaderId();
//        byte[] byteArray14 = unrecognizedExtraField0.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker23 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker17, jarMarker19, jarMarker21, jarMarker23 };
//        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray24);
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray27 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray25, false);
//        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("7z");
//        java.lang.String str32 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray25, (int) (short) 4, 29127, zipEncoding31);
//        java.nio.ByteBuffer byteBuffer34 = zipEncoding31.encode("arj");
//        // The following exception was thrown during execution in test generation
//        try {
//            java.lang.String str35 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 493, (int) (byte) 48, zipEncoding31);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 493");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(jarMarker2);
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
//        org.junit.Assert.assertNotNull(jarMarker6);
//        org.junit.Assert.assertNotNull(byteArray7);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
//        org.junit.Assert.assertNotNull(zipShort12);
//        org.junit.Assert.assertNull(zipShort13);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 0, 0, 0]");
//        org.junit.Assert.assertNotNull(jarMarker17);
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
//        org.junit.Assert.assertNotNull(jarMarker19);
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
//        org.junit.Assert.assertNotNull(jarMarker21);
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
//        org.junit.Assert.assertNotNull(jarMarker23);
//        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
//        org.junit.Assert.assertNotNull(byteArray25);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
//        org.junit.Assert.assertNotNull(zipExtraFieldArray27);
//        org.junit.Assert.assertNotNull(zipEncoding31);
//        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\376\312" + "'", str32, "\376\312");
//        org.junit.Assert.assertNotNull(byteBuffer34);
//    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 55, 464, "ZipEightByteInteger value: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        boolean boolean7 = zipEightByteInteger4.equals((java.lang.Object) byteArray6);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger9, zipEightByteInteger10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger4, zipEightByteInteger10);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField13 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = zip64ExtendedInformationExtraField13.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        zip64ExtendedInformationExtraField13.setDiskStartNumber(zipLong15);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = zip64ExtendedInformationExtraField13.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipLong15);
        org.junit.Assert.assertNotNull(zipShort17);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tarArchiveInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean7 = tarArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream6.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, "070701");
        long long12 = cpioArchiveInputStream10.skip((long) (byte) 0);
        java.nio.file.Path path13 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) cpioArchiveInputStream10, path13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(tarArchiveEntry8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = unparseableExtraField0.onUnparseableExtraField(byteArray2, 2, 40960, true, 0);
        int int8 = unparseableExtraField0.getKey();
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        java.util.concurrent.ExecutorService executorService8 = null;
        java.util.concurrent.ExecutorService executorService9 = null;
        java.nio.file.Path path10 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier11 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path10);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator13 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService9, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier11, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator14 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService8, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier11);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore15 = defaultBackingStoreSupplier11.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor16 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore15);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream17 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore7, streamCompressor16);
        long long18 = streamCompressor16.getBytesWrittenForLastEntry();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField22 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = zip64ExtendedInformationExtraField22.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger24 = zip64ExtendedInformationExtraField22.getRelativeHeaderOffset();
        byte[] byteArray25 = zip64ExtendedInformationExtraField22.getLocalFileDataData();
        streamCompressor16.writeCounted(byteArray25);
        long long27 = streamCompressor16.getBytesRead();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNull(zipLong23);
        org.junit.Assert.assertNull(zipEightByteInteger24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream19);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream21 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry22 = jarArchiveInputStream21.getNextJarEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = jarArchiveInputStream21.canReadEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry25 = jarArchiveInputStream21.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = jarArchiveInputStream21.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(jarArchiveEntry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jarArchiveEntry25);
        org.junit.Assert.assertNull(zipArchiveEntry26);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        char[] charArray12 = new char[] { 'a', '4', '#', '4', ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile18 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 0, 263, "", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4,  ,  ]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        int int1 = x0015_CertificateIdForFile0.getRecordCount();
        byte[] byteArray2 = x0015_CertificateIdForFile0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x0015_CertificateIdForFile0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x0015_CertificateIdForFile0.getHeaderId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray2 = unparseableExtraFieldData0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean1 = sevenZFileOptions0.getUseDefaultNameForUnnamedEntries();
        org.junit.Assert.assertNotNull(sevenZFileOptions0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find((int) (byte) 83);
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = zip64ExtendedInformationExtraField3.getDiskStartNumber();
        byte[] byteArray5 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        byte[] byteArray6 = zip64ExtendedInformationExtraField3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker11 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray12 = jarMarker11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker7, jarMarker9, jarMarker11, jarMarker13 };
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
        int int16 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray15);
        org.apache.commons.compress.archivers.tar.TarFile tarFile18 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray15, false);
        java.math.BigInteger bigInteger19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray15);
        boolean boolean21 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 24576);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray15, 4095);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField3.parseFromLocalFileData(byteArray15, 493, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 51966 + "'", int16 == 51966);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        int int2 = asiExtraField0.getGroupId();
        java.lang.Object obj3 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray10);
        unicodePathExtraField7.setUnicodeName(byteArray10);
        byte[] byteArray13 = unicodePathExtraField7.getLocalFileDataData();
        byte[] byteArray14 = unicodePathExtraField7.getUnicodeName();
        byte[] byteArray15 = unicodePathExtraField7.getUnicodeName();
        byte[] byteArray16 = unicodePathExtraField7.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray16, 4096, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4096");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray4);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray8);
        unicodePathExtraField5.setUnicodeName(byteArray8);
        byte[] byteArray11 = unicodePathExtraField5.getLocalFileDataData();
        unrecognizedExtraField1.setCentralDirectoryData(byteArray11);
        long long13 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ZipEightByteInteger value: 10", byteArray11);
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        boolean boolean11 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray7, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray7, false);
        java.io.File file14 = null;
        expander0.expand(tarFile13, file14);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray17 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel18 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray17);
        java.nio.file.Path path19 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer20 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel21);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream22);
        arArchiveOutputStream23.setLongFileMode((int) (short) 3);
        closeableConsumer20.accept((java.io.Closeable) arArchiveOutputStream23);
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream27, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean33 = tarArchiveInputStream32.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream35 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream32, "zip");
        closeableConsumer20.accept((java.io.Closeable) cpioArchiveInputStream35);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("070701", seekableByteChannel18, path19, closeableConsumer20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070701 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(seekableByteChannelArray17);
        org.junit.Assert.assertNotNull(seekableByteChannel18);
        org.junit.Assert.assertNotNull(closeableConsumer20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray2 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort3);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNull(zipExtraField4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        boolean boolean11 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        boolean boolean3 = asiExtraField0.isDirectory();
        boolean boolean4 = asiExtraField0.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField6);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
        unrecognizedExtraField0.setCentralDirectoryData(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unrecognizedExtraField0.getLocalFileDataLength();
        byte[] byteArray13 = unrecognizedExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        byte[] byteArray23 = unicodePathExtraField17.getLocalFileDataData();
        byte[] byteArray24 = unicodePathExtraField17.getUnicodeName();
        org.apache.commons.compress.archivers.tar.TarFile tarFile26 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray24, false);
        unrecognizedExtraField0.setCentralDirectoryData(byteArray24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(byteArray13);
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(jarMarker19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(zipShort28);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("");
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        long long7 = zipArchiveOutputStream5.getBytesWritten();
        java.lang.String str8 = zipArchiveOutputStream5.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        boolean boolean10 = zipArchiveOutputStream5.canWriteEntryData(archiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy13 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str14 = unicodeExtraFieldPolicy13.toString();
        zipArchiveOutputStream5.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy13);
        zipArchiveOutputStream5.setLevel((int) (byte) 1);
        zipArchiveOutputStream5.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream21 = archiveStreamFactory0.createArchiveOutputStream("tar", (java.io.OutputStream) zipArchiveOutputStream5, "ar");
        long long22 = zipArchiveOutputStream5.getBytesWritten();
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertNotNull(archiveOutputStream21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        int int4 = asiExtraField0.getUserId();
        java.lang.Object obj5 = asiExtraField0.clone();
        asiExtraField0.setMode(511);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40960 + "'", int4 == 40960);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(493);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long9 = zipLong8.getValue();
        java.lang.Object obj10 = zipLong8.clone();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        boolean boolean14 = zipEightByteInteger11.equals((java.lang.Object) byteArray13);
        byte[] byteArray15 = zipEightByteInteger11.getBytes();
        java.lang.String str16 = zipEightByteInteger11.toString();
        byte[] byteArray17 = zipEightByteInteger11.getBytes();
        zipLong8.putLong(byteArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "ZipLong value: -1");
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ZipEightByteInteger value: 0" + "'", str16, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[-1, -1, -1, -1, 0, 0, 0, 0]");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
        unrecognizedExtraField0.setCentralDirectoryData(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getHeaderId();
        byte[] byteArray14 = unrecognizedExtraField0.getCentralDirectoryData();
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, 51966);
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, 16384, (int) '#');
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x7875_NewUnix0.getHeaderId();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = unicodePathExtraField17.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = unicodePathExtraField17.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = unicodePathExtraField17.getLocalFileDataLength();
        boolean boolean26 = x7875_NewUnix0.equals((java.lang.Object) zipShort25);
        long long27 = x7875_NewUnix0.getGID();
        byte[] byteArray28 = x7875_NewUnix0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(jarMarker19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1000L + "'", long27 == 1000L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[1, 2, -24, 3, 2, -24, 3]");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "zip");
        long long9 = tarArchiveInputStream5.getBytesRead();
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        int int11 = arArchiveInputStream10.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry12 = arArchiveInputStream10.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "arj");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        sevenZOutputFile6.putArchiveEntry(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile6.write(24576);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        byte[] byteArray6 = new byte[] { (byte) 53, (byte) 75, (byte) 53, (byte) -1, (byte) 51 };
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 51966);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray6, 155);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 148, byteArray6, 488, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 641");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[53, 75, 53, -1, 51]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.setBigNumberMode(345);
        int int11 = tarArchiveOutputStream8.getCount();
        int int12 = tarArchiveOutputStream8.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (short) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor10 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor11 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        long long12 = streamCompressor11.getBytesRead();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertNotNull(streamCompressor9);
        org.junit.Assert.assertNotNull(streamCompressor10);
        org.junit.Assert.assertNotNull(streamCompressor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(156, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = resourceAlignmentExtraField6.getLocalFileDataLength();
        byte[] byteArray8 = resourceAlignmentExtraField6.getLocalFileDataData();
        byte[] byteArray9 = resourceAlignmentExtraField6.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9, 5, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-100, -128]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-100, -128]");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "cpio", true, false, false);
        long long7 = zipArchiveInputStream5.skip(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = zipArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField3.getHeaderId();
        byte[] byteArray10 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField11 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        unicodePathExtraField15.setUnicodeName(byteArray18);
        byte[] byteArray21 = unicodePathExtraField15.getLocalFileDataData();
        unrecognizedExtraField11.setCentralDirectoryData(byteArray21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = unrecognizedExtraField11.getLocalFileDataLength();
        byte[] byteArray24 = unrecognizedExtraField11.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker26 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray27 = jarMarker26.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField28 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray27);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker30 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray31 = jarMarker30.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField32 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray31);
        unicodePathExtraField28.setUnicodeName(byteArray31);
        byte[] byteArray34 = unicodePathExtraField28.getLocalFileDataData();
        byte[] byteArray35 = unicodePathExtraField28.getUnicodeName();
        org.apache.commons.compress.archivers.tar.TarFile tarFile37 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray35, false);
        unrecognizedExtraField11.setCentralDirectoryData(byteArray35);
        unicodePathExtraField3.setUnicodeName(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray35, (int) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNull(byteArray24);
        org.junit.Assert.assertNotNull(jarMarker26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(jarMarker30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField6 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger4, zipEightByteInteger5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = zip64ExtendedInformationExtraField6.getLocalFileDataLength();
        boolean boolean8 = zipShort2.equals((java.lang.Object) zip64ExtendedInformationExtraField6);
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        tarArchiveInputStream7.mark(24576);
        int int11 = tarArchiveInputStream7.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream12 = archiveStreamFactory0.createArchiveInputStream("", (java.io.InputStream) tarArchiveInputStream7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray8 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray8);
        char[] charArray12 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9, charArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "", charArray12);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
        org.junit.Assert.assertNotNull(seekableByteChannelArray8);
        org.junit.Assert.assertNotNull(seekableByteChannel9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  ]");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException();
        org.apache.commons.compress.MemoryLimitException memoryLimitException3 = new org.apache.commons.compress.MemoryLimitException((long) 64, 0, (java.lang.Exception) dumpArchiveException2);
        java.lang.String str4 = dumpArchiveException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.compress.archivers.dump.DumpArchiveException" + "'", str4, "org.apache.commons.compress.archivers.dump.DumpArchiveException");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        boolean boolean11 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray7, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray7, false);
        java.io.File file14 = null;
        expander0.expand(tarFile13, file14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray19 = jarMarker18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray21 = jarMarker20.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker16, jarMarker18, jarMarker20, jarMarker22 };
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray23);
        int int25 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray24);
        org.apache.commons.compress.archivers.tar.TarFile tarFile27 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray24, false);
        tarFile27.close();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList29 = tarFile27.getEntries();
        java.nio.file.Path path30 = null;
        expander0.expand(tarFile27, path30);
        java.io.File file32 = null;
        java.io.File file33 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(file32, file33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jarMarker16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(jarMarker18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(jarMarker20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(jarMarker22);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 51966 + "'", int25 == 51966);
        org.junit.Assert.assertNotNull(tarArchiveEntryList29);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        java.util.concurrent.ExecutorService executorService12 = null;
        java.util.concurrent.ExecutorService executorService13 = null;
        java.nio.file.Path path14 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier15 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path14);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator17 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService13, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier15, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator18 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService12, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier15);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore19 = defaultBackingStoreSupplier15.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor20 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore19);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        boolean boolean24 = zipEightByteInteger21.equals((java.lang.Object) byteArray23);
        byte[] byteArray25 = zipEightByteInteger21.getBytes();
        streamCompressor20.writeCounted(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = tarArchiveInputStream11.read(byteArray25, 3, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore19);
        org.junit.Assert.assertNotNull(streamCompressor20);
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException1 = new org.apache.commons.compress.archivers.dump.InvalidFormatException((long) (byte) 0);
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) invalidFormatException1);
        long long3 = invalidFormatException1.getOffset();
        long long4 = invalidFormatException1.getOffset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getLocalFileDataLength();
        byte[] byteArray11 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        boolean boolean15 = zipEightByteInteger12.equals((java.lang.Object) byteArray14);
        byte[] byteArray16 = zipEightByteInteger12.getBytes();
        boolean boolean18 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray16, 64);
        unicodePathExtraField3.setUnicodeName(byteArray16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = unicodePathExtraField3.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipShort20);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        java.lang.Object obj3 = sevenZMethodConfiguration1.getOptions();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) (byte) 51, (int) (byte) 83);
        tarArchiveInputStream5.mark(16384);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = tarArchiveInputStream5.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry22);
        org.junit.Assert.assertNull(tarArchiveEntry23);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry12, inputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        int int11 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "ar");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy14 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str15 = unicodeExtraFieldPolicy14.toString();
        java.lang.String str16 = unicodeExtraFieldPolicy14.toString();
        java.lang.String str17 = unicodeExtraFieldPolicy14.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "not encodeable" + "'", str15, "not encodeable");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "not encodeable" + "'", str16, "not encodeable");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "not encodeable" + "'", str17, "not encodeable");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11, 10, 26128, "cpio");
        int int16 = tarArchiveInputStream15.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26128 + "'", int16 == 26128);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray4 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        char[] charArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, charArray7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ]");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, 16384, (int) '#');
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x7875_NewUnix0.getHeaderId();
        long long14 = x7875_NewUnix0.getGID();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1000L + "'", long14 == 1000L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 4095, (long) '#');
        long long3 = tarArchiveStructSparse2.getOffset();
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException4 = new org.apache.commons.compress.archivers.dump.DumpArchiveException();
        boolean boolean5 = tarArchiveStructSparse2.equals((java.lang.Object) dumpArchiveException4);
        long long6 = tarArchiveStructSparse2.getOffset();
        java.lang.String str7 = tarArchiveStructSparse2.toString();
        java.lang.String str8 = tarArchiveStructSparse2.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4095L + "'", long3 == 4095L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4095L + "'", long6 == 4095L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "TarArchiveStructSparse{offset=4095, numbytes=35}" + "'", str7, "TarArchiveStructSparse{offset=4095, numbytes=35}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "TarArchiveStructSparse{offset=4095, numbytes=35}" + "'", str8, "TarArchiveStructSparse{offset=4095, numbytes=35}");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        x7875_NewUnix0.parseFromCentralDirectoryData(byteArray9, 16384, (int) '#');
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = x7875_NewUnix0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort13);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.setBigNumberMode(345);
        long long11 = tarArchiveOutputStream8.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, 26128, "ar");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream25, "encryption", true, true, true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry19);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField9 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean10 = resourceAlignmentExtraField9.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = resourceAlignmentExtraField9.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = resourceAlignmentExtraField9.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = resourceAlignmentExtraField9.getHeaderId();
        byte[] byteArray14 = resourceAlignmentExtraField9.getCentralDirectoryData();
        byte[] byteArray15 = resourceAlignmentExtraField9.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray15, 49152, 29127);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[51, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[51, 0]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(256);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(24576);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "dump", false, true, true);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream15, "ZipLong value: 1024", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 1024");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 2048, 476);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = tarArchiveInputStream8.getCurrentEntry();
        org.junit.Assert.assertNull(tarArchiveEntry9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, 4095L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        byte[] byteArray1 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryData();
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream1, (short) (byte) 1, 0);
        int int5 = cpioArchiveOutputStream4.getCount();
        java.nio.file.Path path6 = null;
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet7 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption;
        java.nio.file.LinkOption linkOption8 = null;
        java.nio.file.LinkOption[] linkOptionArray9 = new java.nio.file.LinkOption[] { linkOption8 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) cpioArchiveOutputStream4, path6, fileVisitOptionSet7, linkOptionArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(fileVisitOptionSet7);
        org.junit.Assert.assertNotNull(linkOptionArray9);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        java.util.concurrent.ExecutorService executorService10 = null;
        java.util.concurrent.ExecutorService executorService11 = null;
        java.nio.file.Path path12 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier13 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path12);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator15 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService11, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier13, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator16 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService10, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier13);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore17 = defaultBackingStoreSupplier13.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor18 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore17);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray21 = jarMarker20.getCentralDirectoryData();
        boolean boolean22 = zipEightByteInteger19.equals((java.lang.Object) byteArray21);
        byte[] byteArray23 = zipEightByteInteger19.getBytes();
        streamCompressor18.writeCounted(byteArray23);
        long long25 = streamCompressor18.getBytesWrittenForLastEntry();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream26 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore7, streamCompressor18);
        long long27 = streamCompressor18.getBytesWrittenForLastEntry();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertNotNull(streamCompressor9);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore17);
        org.junit.Assert.assertNotNull(streamCompressor18);
        org.junit.Assert.assertNotNull(zipEightByteInteger19);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 8L + "'", long25 == 8L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 8L + "'", long27 == 8L);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unicodePathExtraField3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = unicodePathExtraField3.getHeaderId();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        byte[] byteArray3 = generalPurposeBit0.encode();
        byte[] byteArray4 = generalPurposeBit0.encode();
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        long long8 = zipArchiveOutputStream6.getBytesWritten();
        java.lang.String str9 = zipArchiveOutputStream6.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry10);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, "070707");
        tarArchiveOutputStream13.setBigNumberMode(345);
        int int16 = tarArchiveOutputStream13.getCount();
        tarArchiveOutputStream13.setAddPaxHeadersForNonAsciiNames(true);
        boolean boolean19 = generalPurposeBit0.equals((java.lang.Object) tarArchiveOutputStream13);
        boolean boolean20 = generalPurposeBit0.usesStrongEncryption();
        boolean boolean21 = generalPurposeBit0.usesUTF8ForNames();
        generalPurposeBit0.useDataDescriptor(true);
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1;
        int int1 = zipMethod0.getCode();
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        zipArchiveOutputStream1.setLevel((int) (byte) 1);
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) 8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream17);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        boolean boolean3 = asiExtraField0.isDirectory();
        boolean boolean4 = asiExtraField0.isDirectory();
        java.lang.String str5 = asiExtraField0.getLinkedFile();
        java.lang.String str6 = asiExtraField0.getLinkedFile();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = asiExtraField0.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.flush();
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        int int16 = tarArchiveInputStream5.read(byteArray13);
        tarArchiveInputStream5.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 64);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, 26128, "ar");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream24, "7z", true, false, true);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger32, zipEightByteInteger33);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong35 = zip64ExtendedInformationExtraField34.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = zip64ExtendedInformationExtraField34.getRelativeHeaderOffset();
        byte[] byteArray37 = zip64ExtendedInformationExtraField34.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger39 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField41 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger39, zipEightByteInteger40);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger42 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker43 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray44 = jarMarker43.getCentralDirectoryData();
        boolean boolean45 = zipEightByteInteger42.equals((java.lang.Object) byteArray44);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger47 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger48 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger47, zipEightByteInteger48);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField50 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger42, zipEightByteInteger48);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField51 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger48);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong52 = zip64ExtendedInformationExtraField51.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger53 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker54 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray55 = jarMarker54.getCentralDirectoryData();
        boolean boolean56 = zipEightByteInteger53.equals((java.lang.Object) byteArray55);
        zip64ExtendedInformationExtraField51.setCompressedSize(zipEightByteInteger53);
        java.lang.String str58 = zipEightByteInteger53.toString();
        zip64ExtendedInformationExtraField34.setCompressedSize(zipEightByteInteger53);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger60 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField34.setCompressedSize(zipEightByteInteger60);
        byte[] byteArray62 = zip64ExtendedInformationExtraField34.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int65 = cpioArchiveInputStream24.read(byteArray62, 51966, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry19);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNull(zipLong35);
        org.junit.Assert.assertNull(zipEightByteInteger36);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipEightByteInteger40);
        org.junit.Assert.assertNotNull(zipEightByteInteger42);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger48);
        org.junit.Assert.assertNull(zipLong52);
        org.junit.Assert.assertNotNull(zipEightByteInteger53);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ZipEightByteInteger value: 0" + "'", str58, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger60);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.lang.String str2 = archiveStreamFactory0.getEntryEncoding();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream4, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean10 = tarArchiveInputStream9.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray17);
        unicodePathExtraField14.setUnicodeName(byteArray17);
        int int20 = tarArchiveInputStream9.read(byteArray17);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream23 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream9, (int) (byte) 51, (int) (byte) 83);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream23, (int) (byte) 55, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream27 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(jarMarker16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setLinkedFile("070702");
        asiExtraField0.setLinkedFile("org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.");
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 2048, 476);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        java.lang.Object obj2 = x7875_NewUnix0.clone();
        boolean boolean4 = x7875_NewUnix0.equals((java.lang.Object) 1);
        long long5 = x7875_NewUnix0.getUID();
        java.lang.Object obj6 = x7875_NewUnix0.clone();
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.setGID((-1687279817268L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative longs < -2^31 not permitted: [-1687279817268]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1000L + "'", long5 == 1000L);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0x7875 Zip Extra Field: UID=1000 GID=1000");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        char[] charArray5 = new char[] { ' ', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions7 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean8 = sevenZFileOptions7.getTryToRecoverBrokenArchives();
        boolean boolean9 = sevenZFileOptions7.getUseDefaultNameForUnnamedEntries();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5, sevenZFileOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}
