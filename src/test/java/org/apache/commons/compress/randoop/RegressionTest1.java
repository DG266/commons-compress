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
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField0.setCentralDirectoryData(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 131);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray3, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 504");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((int) (short) 1);
        org.junit.Assert.assertTrue("'" + hashAlgorithm1 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32 + "'", hashAlgorithm1.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.CRC32));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer1 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        arArchiveOutputStream4.setLongFileMode((int) (short) 3);
        closeableConsumer1.accept((java.io.Closeable) arArchiveOutputStream4);
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream8, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean14 = tarArchiveInputStream13.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream13, "zip");
        closeableConsumer1.accept((java.io.Closeable) cpioArchiveInputStream16);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) cpioArchiveInputStream16, file18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker11 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray12 = jarMarker11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray12);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        unicodePathExtraField13.setUnicodeName(byteArray16);
        byte[] byteArray19 = unicodePathExtraField13.getLocalFileDataData();
        byte[] byteArray20 = unicodePathExtraField13.getUnicodeName();
        byte[] byteArray21 = unicodePathExtraField13.getUnicodeName();
        byte[] byteArray22 = unicodePathExtraField13.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField3.parseFromCentralDirectoryData(byteArray22, (int) (byte) 1, 0);
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
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("");
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream8 = archiveStreamFactory0.createArchiveOutputStream("ZipLong value: 1024", (java.io.OutputStream) arArchiveOutputStream6, "zip");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipLong value: 1024 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveInputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        long long0 = org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream9 = archiveStreamFactory0.createArchiveOutputStream("ustar ", (java.io.OutputStream) zipArchiveOutputStream6, "ar");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (byte) 55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray1, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[55, 0]");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.SEVEN_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "7z" + "'", str0, "7z");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.nio.file.Path path5 = null;
        java.nio.file.LinkOption linkOption7 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] { linkOption7 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveOutputStream4.createArchiveEntry(path5, "ZipEightByteInteger value: 0", linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("jar");
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier3 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable4 = parallelScatterZipCreator2.createCallable(zipArchiveEntryRequestSupplier3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.util.concurrent.ExecutorService executorService6 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier7 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator8 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService6, scatterGatherBackingStoreSupplier7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier9 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable10 = parallelScatterZipCreator8.createCallable(zipArchiveEntryRequestSupplier9);
        parallelScatterZipCreator5.submitStreamAwareCallable(scatterZipOutputStreamCallable10);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator2.submit(scatterZipOutputStreamCallable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable4);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        boolean boolean11 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray7, (int) (short) 1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray7, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
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
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ZipShort value: 28789", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW_CRC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070702" + "'", str0, "070702");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField14 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField14.setCentralDirectoryData(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray17, 16384, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16384");
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
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[100, 51]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = resourceAlignmentExtraField2.getHeaderId();
        short short6 = resourceAlignmentExtraField2.getAlignment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 51 + "'", short6 == (short) 51);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unicodePathExtraField3.getLocalFileDataLength();
        java.lang.Object obj5 = zipShort4.clone();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort4);
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "ZipShort value: 5");
        org.junit.Assert.assertNotNull(zipExtraField6);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 508 + "'", int0 == 508);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        int int4 = cpioArchiveOutputStream3.getCount();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger6, zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = zip64ExtendedInformationExtraField8.getDiskStartNumber();
        byte[] byteArray10 = zip64ExtendedInformationExtraField8.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(byteArray10, 420, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNull(zipLong9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        byte[] byteArray10 = unicodePathExtraField3.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray10, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream1 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray4);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray8);
        unicodePathExtraField5.setUnicodeName(byteArray8);
        byte[] byteArray11 = unicodePathExtraField5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = arArchiveInputStream1.read(byteArray11, (int) (short) 1, 26128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 64, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField3 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray10);
        unicodePathExtraField7.setUnicodeName(byteArray10);
        byte[] byteArray13 = unicodePathExtraField7.getLocalFileDataData();
        unrecognizedExtraField3.setCentralDirectoryData(byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unrecognizedExtraField3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unrecognizedExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray19 = jarMarker18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray23);
        unicodePathExtraField20.setUnicodeName(byteArray23);
        byte[] byteArray26 = unicodePathExtraField20.getLocalFileDataData();
        byte[] byteArray27 = unicodePathExtraField20.getUnicodeName();
        byte[] byteArray28 = unicodePathExtraField20.getUnicodeName();
        byte[] byteArray29 = unicodePathExtraField20.getLocalFileDataData();
        unrecognizedExtraField3.setCentralDirectoryData(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray29, 12, 51966);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort15);
        org.junit.Assert.assertNull(zipShort16);
        org.junit.Assert.assertNotNull(jarMarker18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(jarMarker22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker10 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray11 = jarMarker10.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray11);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray15 = jarMarker14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        unicodePathExtraField12.setUnicodeName(byteArray15);
        int int18 = tarArchiveInputStream7.read(byteArray15);
        unrecognizedExtraField1.setLocalFileDataData(byteArray15);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray22);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker25 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray26 = jarMarker25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray26);
        unicodePathExtraField23.setUnicodeName(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodePathExtraField23.getHeaderId();
        unrecognizedExtraField1.setHeaderId(zipShort29);
        byte[] byteArray31 = unrecognizedExtraField1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker33 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray34 = jarMarker33.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField35 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray34);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker37 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray38 = jarMarker37.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField39 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray38);
        unicodePathExtraField35.setUnicodeName(byteArray38);
        byte[] byteArray41 = unicodePathExtraField35.getLocalFileDataData();
        unrecognizedExtraField1.setCentralDirectoryData(byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField45 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("apks", byteArray41, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jarMarker10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jarMarker14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jarMarker21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(jarMarker25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(jarMarker33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(jarMarker37);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean7 = resourceAlignmentExtraField6.allowMethodChange();
        byte[] byteArray8 = resourceAlignmentExtraField6.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[51, 0]");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_SPARSE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 83 + "'", byte0 == (byte) 83);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.io.File file0 = null;
        char[] charArray5 = new char[] { '#', '4', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, 4, 4, 4]");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = null;
        boolean boolean11 = tarArchiveOutputStream9.canWriteEntryData(archiveEntry10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField0.setCentralDirectoryData(byteArray3);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream5, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean11 = tarArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        unicodePathExtraField15.setUnicodeName(byteArray18);
        int int21 = tarArchiveInputStream10.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray18, (int) (short) 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) 476, 131);
        java.lang.Throwable[] throwableArray3 = memoryLimitException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("", byteArray10, 345, (int) ' ', zipEncoding13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException2 = new org.apache.commons.compress.PasswordRequiredException("hi!");
        org.apache.commons.compress.archivers.ArchiveException archiveException3 = new org.apache.commons.compress.archivers.ArchiveException("ZipLong value: 134695760", (java.lang.Exception) passwordRequiredException2);
        java.lang.String str4 = passwordRequiredException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password." + "'", str4, "org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesUTF8ForNames();
        boolean boolean2 = generalPurposeBit0.usesDataDescriptor();
        java.lang.Object obj3 = generalPurposeBit0.clone();
        generalPurposeBit0.useStrongEncryption(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODTIMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit11 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE12 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean13 = generalPurposeBit11.equals((java.lang.Object) sEGMENT_TYPE12);
        byte[] byteArray14 = generalPurposeBit11.encode();
        byte[] byteArray15 = generalPurposeBit11.encode();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = tarArchiveInputStream5.read(byteArray15, 131, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE12 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE12.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray6 = new char[] { ' ', '#', '4', 'a', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " #4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " #4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #, 4, a, #]");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort30 = unrecognizedExtraField0.getHeaderId();
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
        org.junit.Assert.assertNotNull(zipShort30);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        arArchiveOutputStream3.setLongFileMode((int) (short) 3);
        closeableConsumer0.accept((java.io.Closeable) arArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean13 = tarArchiveInputStream12.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, "zip");
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream15);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray19 = jarMarker18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray23);
        unicodePathExtraField20.setUnicodeName(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = cpioArchiveInputStream15.read(byteArray23, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jarMarker18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(jarMarker22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        int int7 = tarArchiveInputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = tarArchiveInputStream5.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.io.File file0 = null;
        char[] charArray3 = new char[] { ' ', 'a' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions4 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray3, sevenZFileOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , a]");
        org.junit.Assert.assertNotNull(sevenZFileOptions4);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        arArchiveOutputStream3.setLongFileMode((int) (short) 3);
        closeableConsumer0.accept((java.io.Closeable) arArchiveOutputStream3);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean13 = tarArchiveInputStream12.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream12, "zip");
        closeableConsumer0.accept((java.io.Closeable) cpioArchiveInputStream15);
        long long18 = cpioArchiveInputStream15.skip(0L);
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField0.setCentralDirectoryData(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 131);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, 156, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 156");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = tarArchiveInputStream5.canReadEntryData(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tarArchiveInputStream5.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long2 = zipLong1.getValue();
        java.lang.Object obj3 = zipLong1.clone();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        boolean boolean7 = zipEightByteInteger4.equals((java.lang.Object) byteArray6);
        byte[] byteArray8 = zipEightByteInteger4.getBytes();
        java.lang.String str9 = zipEightByteInteger4.toString();
        byte[] byteArray10 = zipEightByteInteger4.getBytes();
        zipLong1.putLong(byteArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray10, 29127, 49152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "ZipLong value: -1");
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZipEightByteInteger value: 0" + "'", str9, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1, 0, 0, 0, 0]");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = cpioArchiveOutputStream3.createArchiveEntry(file4, "00");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        byte[] byteArray23 = unicodePathExtraField17.getLocalFileDataData();
        byte[] byteArray24 = unicodePathExtraField17.getUnicodeName();
        byte[] byteArray25 = unicodePathExtraField17.getUnicodeName();
        byte[] byteArray26 = unicodePathExtraField17.getLocalFileDataData();
        unrecognizedExtraField0.setCentralDirectoryData(byteArray26);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker29 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray30 = jarMarker29.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray30);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker33 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray34 = jarMarker33.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField35 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray34);
        unicodePathExtraField31.setUnicodeName(byteArray34);
        byte[] byteArray37 = unicodePathExtraField31.getLocalFileDataData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile38 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray37);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray37, 488, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(jarMarker29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
        org.junit.Assert.assertNotNull(jarMarker33);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.compress.MemoryLimitException memoryLimitException3 = new org.apache.commons.compress.MemoryLimitException((long) (byte) -1, (int) (short) 1);
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException4 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) memoryLimitException3);
        org.apache.commons.compress.archivers.ArchiveException archiveException5 = new org.apache.commons.compress.archivers.ArchiveException("apks", (java.lang.Exception) dumpArchiveException4);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_X86_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_X86_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_X86_FILTER));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("070707");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        byte[] byteArray16 = unicodePathExtraField10.getLocalFileDataData();
        byte[] byteArray17 = unicodePathExtraField10.getUnicodeName();
        byte[] byteArray18 = unicodePathExtraField10.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray18, (int) (short) 0, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode5 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode5.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unrecognizedExtraField0.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(zipShort2);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("cpio");
        java.lang.String str2 = streamingNotSupportedException1.getFormat();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cpio" + "'", str2, "cpio");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(60011);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
        byte[] byteArray11 = unicodePathExtraField4.getUnicodeName();
        byte[] byteArray12 = unicodePathExtraField4.getUnicodeName();
        byte[] byteArray13 = unicodePathExtraField4.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("ZipLong value: 1024", byteArray13, 4096, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long2 = zipLong1.getValue();
        java.lang.Object obj3 = zipLong1.clone();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        boolean boolean7 = zipEightByteInteger4.equals((java.lang.Object) byteArray6);
        byte[] byteArray8 = zipEightByteInteger4.getBytes();
        java.lang.String str9 = zipEightByteInteger4.toString();
        byte[] byteArray10 = zipEightByteInteger4.getBytes();
        zipLong1.putLong(byteArray10, (int) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray15 = jarMarker14.getCentralDirectoryData();
        boolean boolean16 = zipEightByteInteger13.equals((java.lang.Object) byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField20 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger18, zipEightByteInteger19);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField21 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger13, zipEightByteInteger19);
        byte[] byteArray22 = zip64ExtendedInformationExtraField21.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipLong1.putLong(byteArray22, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "ZipLong value: -1");
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZipEightByteInteger value: 0" + "'", str9, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger19);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getHeaderId();
        java.lang.String str2 = zipShort1.toString();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipShort value: 30837" + "'", str2, "ZipShort value: 30837");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = unparseableExtraField0.onUnparseableExtraField(byteArray1, 257, 8192, true, 464);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 257.  Block length of 464 bytes exceeds remaining data of 8188 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Always + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Always));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "7z", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray6 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = unparseableExtraField0.onUnparseableExtraField(byteArray6, 12, 4095, false, 8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        long long12 = tarArchiveOutputStream8.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        int int9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8, false);
        java.math.BigInteger bigInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray8);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 24576);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray8, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit18 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray8, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 512");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger5, zipEightByteInteger6);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger6);
        byte[] byteArray9 = zip64ExtendedInformationExtraField8.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray9, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream5, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean11 = tarArchiveInputStream10.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = tarArchiveInputStream10.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream16 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) tarArchiveInputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(tarArchiveEntry12);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISVTX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        long long4 = zipArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream2, path8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("arj", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream7.setLongFileMode((int) (short) 3);
        closeableConsumer4.accept((java.io.Closeable) arArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("arj", seekableByteChannel2, path3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream9, "not encodeable", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "070701", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        byte[] byteArray5 = new byte[] { (byte) 55, (byte) 53, (byte) 77, (byte) 54 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) (byte) 51, byteArray5, 4095, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[55, 53, 77, 54]");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField19 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField19.setCentralDirectoryData(byteArray22);
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray22, 131);
        boolean boolean27 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray22, 100);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray22, (int) (byte) 53, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "arj");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry12);
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = null;
        java.io.File file2 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.compress.archivers.Lister lister0 = new org.apache.commons.compress.archivers.Lister();
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 64, byteArray3, 12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EFS_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = jarMarker0.getHeaderId();
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField6 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray13);
        unicodePathExtraField10.setUnicodeName(byteArray13);
        byte[] byteArray16 = unicodePathExtraField10.getLocalFileDataData();
        unrecognizedExtraField6.setCentralDirectoryData(byteArray16);
        long long18 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUMLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 8192, (long) (byte) 54);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream22, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream25 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51966 + "'", int10 == 51966);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        arArchiveOutputStream2.setLongFileMode(100);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = tarArchiveOutputStream2.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream2, 0, 0, "ZipShort value: 28789");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("7z");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = null;
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor1);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream4);
        long long6 = zipArchiveOutputStream4.getBytesWritten();
        java.lang.String str7 = zipArchiveOutputStream4.getEncoding();
        zipArchiveOutputStream4.setFallbackToUTF8(false);
        zipArchiveOutputStream4.setMethod(0);
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream2.writeTo(zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = zip64ExtendedInformationExtraField3.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = zip64ExtendedInformationExtraField3.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        byte[] byteArray19 = unrecognizedExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = unrecognizedExtraField0.getCentralDirectoryLength();
        int int21 = zipShort20.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 4, byteArray11, (int) (short) 4, (int) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        zipArchiveOutputStream1.flush();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean6 = resourceAlignmentExtraField5.allowMethodChange();
        byte[] byteArray7 = resourceAlignmentExtraField5.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray7, 32782, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[51, 0]");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("UTF8", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong31 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray3 = new char[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#,  ]");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        byte[] byteArray3 = x0015_CertificateIdForFile0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        long long4 = zipArchiveOutputStream2.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, "070707");
        tarArchiveOutputStream9.setBigNumberMode(345);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(false);
        java.nio.file.Path path14 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream9, path14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream2, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) byteArray2);
        byte[] byteArray4 = zipEightByteInteger0.getBytes();
        boolean boolean6 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unicodePathExtraField3.getLocalFileDataLength();
        java.lang.Object obj5 = zipShort4.clone();
        java.lang.Object obj6 = zipShort4.clone();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "ZipShort value: 5");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "ZipShort value: 5");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 32782, byteArray10, 24576, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 32782=100016 will not fit in octal number buffer of length 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.lang.String str4 = archiveStreamFactory0.getEntryEncoding();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        long long9 = zipArchiveOutputStream7.getBytesWritten();
        boolean boolean10 = zipArchiveOutputStream7.isSeekable();
        long long11 = zipArchiveOutputStream7.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream12 = archiveStreamFactory0.createArchiveOutputStream("TRAILER!!!", (java.io.OutputStream) zipArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: TRAILER!!! not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "apks" + "'", str4, "apks");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "zip");
        long long10 = cpioArchiveInputStream8.skip((long) 263);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = cpioArchiveInputStream8.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_BLK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 52 + "'", byte0 == (byte) 52);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesUTF8ForNames();
        generalPurposeBit0.useEncryption(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        boolean boolean3 = generalPurposeBit0.usesEncryption();
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        byte[] byteArray15 = zip64ExtendedInformationExtraField14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        zip64ExtendedInformationExtraField14.setDiskStartNumber(zipLong16);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipEightByteInteger value: 10" + "'", str4, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipLong16);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unicodePathExtraField3.getLocalFileDataLength();
        unicodePathExtraField3.setNameCRC32((long) 1024);
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        long long4 = zipArchiveOutputStream2.getBytesWritten();
        java.lang.String str5 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveOutputStream2.canWriteEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, "070707");
        tarArchiveOutputStream9.setBigNumberMode(345);
        long long12 = tarArchiveOutputStream9.getBytesWritten();
        long long13 = tarArchiveOutputStream9.getBytesWritten();
        java.nio.file.Path path14 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream9, path14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_OLDGNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "7z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong19 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (int) (short) 100, 3, "\376\312");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger5, zipEightByteInteger6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = zip64ExtendedInformationExtraField7.getDiskStartNumber();
        byte[] byteArray9 = zip64ExtendedInformationExtraField7.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.write(byteArray9, 84446, 10240);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier3 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable4 = parallelScatterZipCreator2.createCallable(zipArchiveEntryRequestSupplier3);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics5 = parallelScatterZipCreator2.getStatisticsMessage();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        long long9 = zipArchiveOutputStream7.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator2.writeTo(zipArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable4);
        org.junit.Assert.assertNotNull(scatterStatistics5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getHeaderId();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray4);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField9 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray8);
        unicodePathExtraField5.setUnicodeName(byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField5.getHeaderId();
        byte[] byteArray12 = unicodePathExtraField5.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray12, 2, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        long long4 = zipArchiveOutputStream2.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        java.nio.file.Path path10 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream2, path10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_BINARY;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 8 + "'", short0 == (short) 8);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_NORMAL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 48 + "'", byte0 == (byte) 48);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.lang.String str4 = archiveStreamFactory0.getEntryEncoding();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream6, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean12 = tarArchiveInputStream11.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray15 = jarMarker14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray19 = jarMarker18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        unicodePathExtraField16.setUnicodeName(byteArray19);
        int int22 = tarArchiveInputStream11.read(byteArray19);
        tarArchiveInputStream11.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream25 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream25);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream27 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream26);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream28 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream30 = archiveStreamFactory0.createArchiveInputStream("org.apache.commons.compress.MemoryLimitException: -1 kb of memory would be needed; limit was 1 kb. If the file is not corrupt, consider increasing the memory limit.", (java.io.InputStream) zipArchiveInputStream26, "tar");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: org.apache.commons.compress.MemoryLimitException: -1 kb of memory would be needed; limit was 1 kb. If the file is not corrupt, consider increasing the memory limit. not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "apks" + "'", str4, "apks");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jarMarker14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertNotNull(jarMarker18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel0 };
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNull(seekableByteChannel2);
        org.junit.Assert.assertNull(seekableByteChannel3);
        org.junit.Assert.assertNull(seekableByteChannel4);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 26128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 26128");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray8, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean4 = resourceAlignmentExtraField3.allowMethodChange();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration5 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) resourceAlignmentExtraField3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The COPY method doesn't support options of type class org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        long long18 = streamCompressor16.getCrc32();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(51966);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry24 = null;
        boolean boolean25 = tarArchiveInputStream5.canReadEntryData(archiveEntry24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("", byteArray7, 488, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray6 = new char[] { '#', '#', ' ', 'a', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder7 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = builder7.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray6, sevenZFileOptions8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "## a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "## a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#, #,  , a, 4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry13);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = zip64ExtendedInformationExtraField3.getDiskStartNumber();
        byte[] byteArray5 = zip64ExtendedInformationExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.MemoryLimitException memoryLimitException11 = new org.apache.commons.compress.MemoryLimitException((long) (byte) -1, (int) (short) 1);
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException12 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) memoryLimitException11);
        java.lang.Throwable[] throwableArray13 = dumpArchiveException12.getSuppressed();
        boolean boolean14 = zipEightByteInteger7.equals((java.lang.Object) dumpArchiveException12);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB;
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB + "'", cOMPRESSION_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = tarArchiveInputStream19.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        boolean boolean10 = tarArchiveInputStream5.markSupported();
        boolean boolean11 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(60011);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField0.setCentralDirectoryData(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 131);
        boolean boolean8 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray3, 100);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField0.setCentralDirectoryData(byteArray3);
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 131);
        boolean boolean8 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray3, 100);
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray3, 32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("././@LongLink", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = jarArchiveInputStream21.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        java.lang.String str1 = unicodeExtraFieldPolicy0.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "always" + "'", str1, "always");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.putArchiveEntry(archiveEntry11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW_CRC;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 2 + "'", short0 == (short) 2);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, false);
        tarFile12.close();
        java.io.File file14 = null;
        expander0.expand(tarFile12, file14);
        java.nio.file.Path path16 = null;
        java.nio.file.Path path17 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path16, path17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51966 + "'", int10 == 51966);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "070702");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getUID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream7, "zip");
        long long11 = tarArchiveInputStream7.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream13 = archiveStreamFactory0.createArchiveInputStream("ustar\000", (java.io.InputStream) tarArchiveInputStream7, "ZipShort value: 30837");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        java.io.File file7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveOutputStream2.createArchiveEntry(file7, "0\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(feature0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray6 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = unparseableExtraField0.onUnparseableExtraField(byteArray6, 12, 4095, false, 8);
        int int12 = unparseableExtraField0.getKey();
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        int int9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8, false);
        java.math.BigInteger bigInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray8);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 24576);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray8, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray8, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = defaultBackingStoreSupplier4.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(155, scatterGatherBackingStore8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("ZipLong value: 134695760");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 134695760");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        long long9 = streamCompressor8.getBytesRead();
        long long10 = streamCompressor8.getTotalBytesWritten();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean17 = tarArchiveInputStream16.markSupported();
        int int18 = tarArchiveInputStream16.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor8.deflate((java.io.InputStream) tarArchiveInputStream16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 2, (int) (short) 2, "org.apache.commons.compress.MemoryLimitException: -1 kb of memory would be needed; limit was 1 kb. If the file is not corrupt, consider increasing the memory limit.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = zip64ExtendedInformationExtraField3.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        boolean boolean8 = zipEightByteInteger5.equals((java.lang.Object) byteArray7);
        byte[] byteArray9 = zipEightByteInteger5.getBytes();
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor9 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor10 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(464, scatterGatherBackingStore8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore8);
        org.junit.Assert.assertNotNull(streamCompressor9);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.flush();
        java.io.File file10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = tarArchiveOutputStream8.createArchiveEntry(file10, "\376\312");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator9 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (byte) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField10 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger8, zipEightByteInteger9);
        byte[] byteArray11 = zipEightByteInteger9.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.write(byteArray11, 100, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger9);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

//    @Test
//    public void test0689() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test0689");
//        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
//        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0015_CertificateIdForFile0.getLocalFileDataLength();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
//        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray3);
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker11 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray12 = jarMarker11.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker7, jarMarker9, jarMarker11, jarMarker13 };
//        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray14);
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, false);
//        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("7z");
//        java.lang.String str22 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray15, (int) (short) 4, 29127, zipEncoding21);
//        // The following exception was thrown during execution in test generation
//        try {
//            java.lang.String str23 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray3, (int) (short) 4, 2048, zipEncoding21);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(zipShort1);
//        org.junit.Assert.assertNotNull(jarMarker2);
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
//        org.junit.Assert.assertNotNull(jarMarker7);
//        org.junit.Assert.assertNotNull(byteArray8);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
//        org.junit.Assert.assertNotNull(jarMarker9);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
//        org.junit.Assert.assertNotNull(jarMarker11);
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
//        org.junit.Assert.assertNotNull(jarMarker13);
//        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
//        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
//        org.junit.Assert.assertNotNull(zipEncoding21);
//        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\376\312" + "'", str22, "\376\312");
//    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        boolean boolean11 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream12 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        // The following exception was thrown during execution in test generation
        try {
            long long11 = tarArchiveInputStream9.skip((long) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        int int9 = tarArchiveOutputStream8.getCount();
        tarArchiveOutputStream8.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (short) 4, (int) (byte) 52, "ZipEightByteInteger value: 10");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipEightByteInteger value: 10");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField9 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField9.setCentralDirectoryData(byteArray12);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 131);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream8.write(byteArray12, 1024, (int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int5 = tarArchiveOutputStream4.getRecordSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        long long18 = streamCompressor16.getBytesRead();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 1024, byteArray2, (int) (short) -1, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 79");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[6, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(257);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList x0019_EncryptionRecipientCertificateList0 = new org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0019_EncryptionRecipientCertificateList0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray5);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray9 = jarMarker8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray9);
        unicodePathExtraField6.setUnicodeName(byteArray9);
        byte[] byteArray12 = unicodePathExtraField6.getLocalFileDataData();
        unrecognizedExtraField2.setCentralDirectoryData(byteArray12);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unrecognizedExtraField2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unrecognizedExtraField2.getHeaderId();
        byte[] byteArray16 = unrecognizedExtraField2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0019_EncryptionRecipientCertificateList0.parseFromLocalFileData(byteArray16, 49152, (int) (byte) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNull(zipShort15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = zip64ExtendedInformationExtraField3.getLocalFileDataLength();
        int int5 = zipShort4.getValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 1024);
        java.lang.String str3 = zipLong2.toString();
        byte[] byteArray4 = zipLong2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 50, byteArray4, 3, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1024" + "'", str3, "ZipLong value: 1024");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 4, 0, 0]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        zip64ExtendedInformationExtraField13.setCompressedSize(zipEightByteInteger15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        boolean boolean23 = zipEightByteInteger20.equals((java.lang.Object) byteArray22);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger25, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger32, zipEightByteInteger33);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger37);
        java.lang.String str39 = zipEightByteInteger36.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker41 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray42 = jarMarker41.getCentralDirectoryData();
        boolean boolean43 = zipEightByteInteger40.equals((java.lang.Object) byteArray42);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger46 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField47 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger45, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger40);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger50 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker51 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray52 = jarMarker51.getCentralDirectoryData();
        boolean boolean53 = zipEightByteInteger50.equals((java.lang.Object) byteArray52);
        byte[] byteArray54 = zipEightByteInteger50.getBytes();
        java.lang.String str55 = zipEightByteInteger50.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger57 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger58 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger57, zipEightByteInteger58);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong61 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long62 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger50, zipEightByteInteger58, zipLong61);
        long long64 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger26, zipEightByteInteger30, zipEightByteInteger33, zipLong61);
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger30);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker67 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray68 = jarMarker67.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker69 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray70 = jarMarker69.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker71 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray72 = jarMarker71.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker73 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray74 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker67, jarMarker69, jarMarker71, jarMarker73 };
        byte[] byteArray75 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray74);
        int int76 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray75);
        org.apache.commons.compress.archivers.tar.TarFile tarFile78 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray75, false);
        java.math.BigInteger bigInteger79 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray75);
        byte[] byteArray80 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(bigInteger79);
        byte[] byteArray81 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(bigInteger79);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField13.parseFromCentralDirectoryData(byteArray81, (int) (byte) 50, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(zipEightByteInteger37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ZipEightByteInteger value: 10" + "'", str39, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger46);
        org.junit.Assert.assertNotNull(zipEightByteInteger50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ZipEightByteInteger value: 0" + "'", str55, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNotNull(jarMarker67);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray68), "[]");
        org.junit.Assert.assertNotNull(jarMarker69);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[]");
        org.junit.Assert.assertNotNull(jarMarker71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[]");
        org.junit.Assert.assertNotNull(jarMarker73);
        org.junit.Assert.assertNotNull(zipExtraFieldArray74);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 51966 + "'", int76 == 51966);
        org.junit.Assert.assertNotNull(bigInteger79);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray80), "[-2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray81), "[-2, -54, 0, 0, -2, -54, 0, 0]");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        long long9 = streamCompressor8.getBytesWrittenForLastEntry();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream10, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean16 = tarArchiveInputStream15.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker18 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray19 = jarMarker18.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray19);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField24 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray23);
        unicodePathExtraField20.setUnicodeName(byteArray23);
        int int26 = tarArchiveInputStream15.read(byteArray23);
        tarArchiveInputStream15.mark(0);
        int int29 = tarArchiveInputStream15.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream15, 0, "tar");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream34 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream32, true);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor8.deflate((java.io.InputStream) tarArchiveInputStream32, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jarMarker18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(jarMarker22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray1, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel0 };
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray1);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNull(seekableByteChannel2);
        org.junit.Assert.assertNull(seekableByteChannel3);
    }

//    @Test
//    public void test0709() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test0709");
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
//        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray8, false);
//        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("7z");
//        java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray8, (int) (short) 4, 29127, zipEncoding14);
//        byte[] byteArray16 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            java.lang.String str17 = zipEncoding14.decode(byteArray16);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(jarMarker0);
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
//        org.junit.Assert.assertNotNull(jarMarker2);
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
//        org.junit.Assert.assertNotNull(jarMarker4);
//        org.junit.Assert.assertNotNull(byteArray5);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
//        org.junit.Assert.assertNotNull(jarMarker6);
//        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
//        org.junit.Assert.assertNotNull(byteArray8);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
//        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
//        org.junit.Assert.assertNotNull(zipEncoding14);
//        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\376\312" + "'", str15, "\376\312");
//    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        boolean boolean12 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray10, 2);
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker17 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray18 = jarMarker17.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray18);
        unicodePathExtraField15.setUnicodeName(byteArray18);
        boolean boolean22 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray18, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray18, (int) (byte) 54, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(jarMarker17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        int int7 = tarArchiveInputStream5.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, 0);
        int int10 = tarArchiveInputStream9.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = tarArchiveInputStream9.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) byteArray2);
        byte[] byteArray4 = zipEightByteInteger0.getBytes();
        java.lang.String str5 = zipEightByteInteger0.toString();
        byte[] byteArray6 = zipEightByteInteger0.getBytes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray6);
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZipEightByteInteger value: 0" + "'", str5, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, false);
        tarFile12.close();
        java.io.File file14 = null;
        expander0.expand(tarFile12, file14);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker28 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray29 = jarMarker28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray29);
        unicodePathExtraField26.setUnicodeName(byteArray29);
        int int32 = tarArchiveInputStream21.read(byteArray29);
        tarArchiveInputStream21.mark(0);
        int int35 = tarArchiveInputStream21.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, 0, "tar");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream40 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream38, true);
        java.io.File file41 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer42 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel43 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream44 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel43);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream45 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream44);
        arArchiveOutputStream45.setLongFileMode((int) (short) 3);
        closeableConsumer42.accept((java.io.Closeable) arArchiveOutputStream45);
        java.io.InputStream inputStream49 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream54 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream49, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean55 = tarArchiveInputStream54.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream57 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream54, "zip");
        closeableConsumer42.accept((java.io.Closeable) cpioArchiveInputStream57);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) tarArchiveInputStream38, file41, closeableConsumer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51966 + "'", int10 == 51966);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(jarMarker28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(closeableConsumer42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = unrecognizedExtraField0.getCentralDirectoryLength();
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
        org.junit.Assert.assertNotNull(zipShort31);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.io.File file0 = null;
        char[] charArray5 = new char[] { '#', 'a', '#', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5, sevenZFileOptions7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#, a, #, #]");
        org.junit.Assert.assertNotNull(sevenZFileOptions7);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2, (int) (short) 1);
        java.util.concurrent.ExecutorService executorService5 = null;
        java.nio.file.Path path6 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier7 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path6);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator8 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService5, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier9 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable10 = parallelScatterZipCreator8.createCallable(zipArchiveEntryRequestSupplier9);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator4.submit(scatterZipOutputStreamCallable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("UTF8", "dump");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: UTF8");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveInputStream22.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2097151L + "'", long0 == 2097151L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1);
        org.apache.commons.compress.archivers.ArchiveException archiveException3 = new org.apache.commons.compress.archivers.ArchiveException("TRAILER!!!", (java.lang.Exception) unsupportedZipFeatureException2);
        org.junit.Assert.assertNotNull(feature1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        long long19 = streamCompressor16.getTotalBytesWritten();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse12 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray10, (int) (short) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = defaultBackingStoreSupplier4.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore9 = defaultBackingStoreSupplier4.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator11 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore8);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("070707");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        long long16 = zipArchiveOutputStream1.getBytesWritten();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "zip", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField3 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
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
        unrecognizedExtraField3.setLocalFileDataData(byteArray17);
        byte[] byteArray22 = unrecognizedExtraField3.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray22, 464, 4);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(jarMarker16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        asiExtraField0.setUserId(40960);
        int int4 = asiExtraField0.getUserId();
        java.lang.String str5 = asiExtraField0.getLinkedFile();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40960 + "'", int4 == 40960);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator7 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature4 = unsupportedZipFeatureException3.getFeature();
        org.apache.commons.compress.MemoryLimitException memoryLimitException5 = new org.apache.commons.compress.MemoryLimitException(0L, 0, (java.lang.Exception) unsupportedZipFeatureException3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = unsupportedZipFeatureException3.getEntry();
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertNotNull(feature4);
        org.junit.Assert.assertNull(zipArchiveEntry6);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setComment("tar");
        zipArchiveOutputStream1.setMethod(3);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream2.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = tarArchiveInputStream21.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, (int) (short) 1);
        java.io.File file27 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) tarArchiveInputStream21, file27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(tarArchiveEntry23);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        java.lang.Object obj2 = x7875_NewUnix0.clone();
        long long3 = x7875_NewUnix0.getGID();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1000L + "'", long3 == 1000L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = resourceAlignmentExtraField2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = resourceAlignmentExtraField2.getHeaderId();
        short short7 = resourceAlignmentExtraField2.getAlignment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 51 + "'", short7 == (short) 51);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_XSTAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar\000" + "'", str0, "tar\000");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        boolean boolean4 = zipEightByteInteger1.equals((java.lang.Object) byteArray3);
        byte[] byteArray5 = zipEightByteInteger1.getBytes();
        java.lang.String str6 = zipEightByteInteger1.toString();
        byte[] byteArray7 = zipEightByteInteger1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray7, 10240, 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 0 bytes, expected at least 4");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZipEightByteInteger value: 0" + "'", str6, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        int int4 = cpioArchiveOutputStream3.getCount();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream3.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        generalPurposeBit0.useDataDescriptor(false);
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, false);
        java.math.BigInteger bigInteger13 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray9);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(bigInteger13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51966 + "'", int10 == 51966);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-2, -54, 0, 0, -2, -54, 0, 0]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream8 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: TRAILER!!!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField1.setCentralDirectoryData(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) (short) 10, byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 51]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = tarArchiveInputStream7.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream7);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ZipShort value: 25461", (java.io.InputStream) tarArchiveInputStream7, file11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipShort value: 25461 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(tarArchiveEntry9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray23 = null;
        int int26 = zipArchiveInputStream20.read(byteArray23, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = zipArchiveInputStream20.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 83, (byte) 50, (byte) 77, (byte) 48 };
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray5, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 427");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 83, 50, 77, 48]");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apk" + "'", str0, "apk");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel0, (int) (short) 1, 10, "ZipLong value: 1024", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 1024");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        boolean boolean3 = asiExtraField0.isDirectory();
        asiExtraField0.setUserId((-1));
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID;
        java.lang.Object obj7 = null;
        boolean boolean8 = zipShort6.equals(obj7);
        byte[] byteArray9 = zipShort6.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) asiExtraField0, byteArray9, 10, (int) (byte) 75, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 756e");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[117, 112]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream1, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean7 = tarArchiveInputStream6.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream6, (int) 'a', "tar");
        boolean boolean11 = tarArchiveInputStream6.markSupported();
        tarArchiveInputStream6.mark(32);
        java.nio.file.Path path14 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) tarArchiveInputStream6, path14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("apk", "");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: apk");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger3, zipEightByteInteger4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = zip64ExtendedInformationExtraField5.getDiskStartNumber();
        byte[] byteArray7 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = unparseableExtraField1.onUnparseableExtraField(byteArray7, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("encryption", byteArray7);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField13.parseFromLocalFileData(byteArray15, 0, 493);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Unsupported version [97] for UniCode path extra data.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField1);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField12);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[97, 0]");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        long long22 = zipArchiveInputStream20.skip((long) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream1 = null;
        java.nio.file.Path path2 = null;
        java.nio.file.FileVisitOption[] fileVisitOptionArray3 = new java.nio.file.FileVisitOption[] {};
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet5 = java.util.EnumSet.noneOf(java.nio.file.FileVisitOption.class);
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.nio.file.FileVisitOption>) fileVisitOptionSet5, fileVisitOptionArray3);
        java.nio.file.LinkOption[] linkOptionArray7 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(archiveOutputStream1, path2, fileVisitOptionSet5, linkOptionArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileVisitOptionArray3);
        org.junit.Assert.assertNotNull(fileVisitOptionSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(linkOptionArray7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ar", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, (short) (byte) 77, 488, "tar");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 77");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 8, "xapk");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.nio.file.Path[] pathArray0 = new java.nio.file.Path[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        boolean boolean20 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream21 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.OFFSETLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.apache.commons.compress.archivers.zip.ZipFile zipFile16 = null;
        java.nio.file.Path path17 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile16, path17);
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
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8);
        java.nio.file.Path path13 = null;
        java.nio.file.LinkOption linkOption15 = null;
        java.nio.file.LinkOption[] linkOptionArray16 = new java.nio.file.LinkOption[] { linkOption15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry17 = cpioArchiveOutputStream12.createArchiveEntry(path13, "tar\000", linkOptionArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(linkOptionArray16);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        byte[] byteArray10 = unicodePathExtraField3.getUnicodeName();
        byte[] byteArray11 = unicodePathExtraField3.getUnicodeName();
        byte[] byteArray12 = unicodePathExtraField3.getLocalFileDataData();
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        java.nio.file.Path path9 = null;
        java.nio.file.LinkOption[] linkOptionArray11 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = cpioArchiveOutputStream8.createArchiveEntry(path9, "ZipShort value: 30837", linkOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException1 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = unsupportedZipFeatureException1.getFeature();
        java.lang.String str3 = unsupportedZipFeatureException1.toString();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException: Unsupported feature compression method used in archive." + "'", str3, "org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException: Unsupported feature compression method used in archive.");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = unparseableExtraField1.onUnparseableExtraField(byteArray3, 2, 40960, true, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalBytes((long) 8, byteArray3, 156, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 254");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipExtraField8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        long long17 = zipLong15.getValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipLong15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 33639248L + "'", long17 == 33639248L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(156, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getLocalFileDataLength();
        byte[] byteArray4 = resourceAlignmentExtraField2.getLocalFileDataData();
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-100, -128]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = null;
        java.io.InputStream inputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry(zipArchiveEntry2, inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        long long29 = zipLong26.getValue();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger34 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField35 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger33, zipEightByteInteger34);
        java.lang.String str36 = zipEightByteInteger33.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger39 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField40 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger38, zipEightByteInteger39);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = zip64ExtendedInformationExtraField40.getDiskStartNumber();
        byte[] byteArray42 = zip64ExtendedInformationExtraField40.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger44 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField40.setSize(zipEightByteInteger44);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong47 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger31, zipEightByteInteger33, zipEightByteInteger44, zipLong47);
        boolean boolean49 = zipLong26.equals((java.lang.Object) zipEightByteInteger31);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNotNull(zipEightByteInteger34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ZipEightByteInteger value: 10" + "'", str36, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger39);
        org.junit.Assert.assertNull(zipLong41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) archiveOutputStream21, "ZipEightByteInteger value: 0");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipEightByteInteger value: 0");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertNotNull(archiveOutputStream21);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray3);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray4, (int) (byte) 75, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        org.apache.commons.compress.archivers.zip.X0014_X509Certificates x0014_X509Certificates13 = new org.apache.commons.compress.archivers.zip.X0014_X509Certificates();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        byte[] byteArray23 = unicodePathExtraField17.getUnicodeName();
        x0014_X509Certificates13.setCentralDirectoryData(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray23, 257, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 257 > 256");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(jarMarker19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        int int20 = tarArchiveOutputStream13.getCount();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker23 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray24 = jarMarker23.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker25 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray26 = jarMarker25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker27 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker21, jarMarker23, jarMarker25, jarMarker27 };
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray28);
        int int30 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray29);
        org.apache.commons.compress.archivers.tar.TarFile tarFile32 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray29, false);
        java.math.BigInteger bigInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray29);
        boolean boolean35 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 24576);
        boolean boolean37 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray29, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray38 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.write(byteArray29, (int) (byte) 75, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(jarMarker21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(jarMarker23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[]");
        org.junit.Assert.assertNotNull(jarMarker25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(jarMarker27);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51966 + "'", int30 == 51966);
        org.junit.Assert.assertNotNull(bigInteger33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray38);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_OFFSET_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        boolean boolean10 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = null;
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter3 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean3 = sevenZFileOptions2.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "ustar ", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField14 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField18 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray17);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker20 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray21 = jarMarker20.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray21);
        unicodePathExtraField18.setUnicodeName(byteArray21);
        byte[] byteArray24 = unicodePathExtraField18.getLocalFileDataData();
        unrecognizedExtraField14.setCentralDirectoryData(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField13.parseFromLocalFileData(byteArray24, 3, 8);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Zip64 extended information must contain both size values in the local file header.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(jarMarker16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(jarMarker20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean4 = resourceAlignmentExtraField3.allowMethodChange();
        byte[] byteArray5 = resourceAlignmentExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray5, (int) (short) -1, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[51, 0]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.mark(24576);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, false);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream10, "dump", false, true, true);
        long long16 = tarArchiveInputStream10.getBytesRead();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger29 = zip64ExtendedInformationExtraField28.getSize();
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
        org.junit.Assert.assertNotNull(zipEightByteInteger29);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = jarMarker0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray10 = unicodePathExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            zipLong0.putLong(byteArray10, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("ZipShort value: 30837");
        java.lang.String str2 = streamingNotSupportedException1.getFormat();
        java.lang.String str3 = streamingNotSupportedException1.getFormat();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipShort value: 30837" + "'", str2, "ZipShort value: 30837");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipShort value: 30837" + "'", str3, "ZipShort value: 30837");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withTryToRecoverBrokenArchives(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb((int) (short) 100);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder4.withUseDefaultNameForUnnamedEntries(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
            tarArchiveOutputStream8.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = tarArchiveInputStream5.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            x0016_CertificateIdForCentralDirectory0.parseFromCentralDirectoryData(byteArray2, 256, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.io.File file0 = null;
        char[] charArray2 = new char[] { '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions3 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray2, sevenZFileOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertNotNull(sevenZFileOptions3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = null;
        java.nio.file.Path path17 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile16, path17);
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
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry19 = zipArchiveInputStream18.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray2, "070707");
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList6 = tarFile5.getEntries();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream8 = tarFile5.getInputStream(tarArchiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Corrupted TAR archive. Can't read entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(tarArchiveEntryList6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(128);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.lang.String str5 = archiveStreamFactory0.getEntryEncoding();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream7, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean13 = tarArchiveInputStream12.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        int int23 = tarArchiveInputStream12.read(byteArray20);
        tarArchiveInputStream12.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream26 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream12);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream26);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream28 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream27);
        long long29 = zipArchiveInputStream27.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream30 = archiveStreamFactory0.createArchiveInputStream("\000\000", (java.io.InputStream) zipArchiveInputStream27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ?? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "apks" + "'", str5, "apks");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jarMarker15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNotNull(jarMarker19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        generalPurposeBit0.useEncryption(false);
        java.lang.Object obj5 = generalPurposeBit0.clone();
        boolean boolean6 = generalPurposeBit0.usesDataDescriptor();
        java.lang.Object obj7 = generalPurposeBit0.clone();
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = asiExtraField0.getHeaderId();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        zipArchiveOutputStream1.setComment("org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream25 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) jarArchiveInputStream21, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int0 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.UFT8_NAMES_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker28 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray29 = jarMarker28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray29);
        unicodePathExtraField26.setUnicodeName(byteArray29);
        int int32 = tarArchiveInputStream21.read(byteArray29);
        tarArchiveInputStream21.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        java.io.File file36 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) tarArchiveInputStream35, file36, closeableConsumer37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: consumer");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(jarMarker28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker10 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray11 = jarMarker10.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray11);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray15 = jarMarker14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        unicodePathExtraField12.setUnicodeName(byteArray15);
        int int18 = tarArchiveInputStream7.read(byteArray15);
        unrecognizedExtraField1.setLocalFileDataData(byteArray15);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray22);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker25 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray26 = jarMarker25.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField27 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray26);
        unicodePathExtraField23.setUnicodeName(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = unicodePathExtraField23.getHeaderId();
        unrecognizedExtraField1.setHeaderId(zipShort29);
        byte[] byteArray31 = unrecognizedExtraField1.getLocalFileDataData();
        byte[] byteArray32 = unrecognizedExtraField1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray32, 2048, (int) (byte) 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jarMarker10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jarMarker14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(jarMarker21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertNotNull(jarMarker25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO;
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO + "'", cOMPRESSION_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        byte[] byteArray19 = unrecognizedExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray19, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 1, 0);
        int int4 = cpioArchiveOutputStream3.getCount();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = cpioArchiveOutputStream3.createArchiveEntry(file5, "070707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        byte[] byteArray29 = zipLong26.getBytes();
        java.lang.Object obj30 = zipLong26.clone();
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "ZipLong value: -1");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray2 = new char[] { '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder3 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray2, sevenZFileOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions4);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 26128, (long) 16);
        long long3 = tarArchiveStructSparse2.getNumbytes();
        long long4 = tarArchiveStructSparse2.getOffset();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 16L + "'", long3 == 16L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 26128L + "'", long4 == 26128L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        java.nio.file.Path path18 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer19 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        arArchiveOutputStream22.setLongFileMode((int) (short) 3);
        closeableConsumer19.accept((java.io.Closeable) arArchiveOutputStream22);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream26, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean32 = tarArchiveInputStream31.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream31, "zip");
        closeableConsumer19.accept((java.io.Closeable) cpioArchiveInputStream34);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("hi!", seekableByteChannel17, path18, closeableConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
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
        org.junit.Assert.assertNotNull(closeableConsumer19);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        long long1 = x7875_NewUnix0.getGID();
        java.lang.Object obj2 = x7875_NewUnix0.clone();
        boolean boolean4 = x7875_NewUnix0.equals((java.lang.Object) 1);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = zip64ExtendedInformationExtraField9.getDiskStartNumber();
        byte[] byteArray11 = zip64ExtendedInformationExtraField9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = unparseableExtraField5.onUnparseableExtraField(byteArray11, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP;
        int int19 = unparseableExtraField18.getKey();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true, unparseableExtraField18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x7875_NewUnix0, byteArray11, 16, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 7875");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1000L + "'", long1 == 1000L);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(unparseableExtraField5);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(unparseableExtraField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 257, "org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 257");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger3, zipEightByteInteger4);
        java.lang.String str6 = zipEightByteInteger3.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField10 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger8, zipEightByteInteger9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = zip64ExtendedInformationExtraField10.getDiskStartNumber();
        byte[] byteArray12 = zip64ExtendedInformationExtraField10.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField10.setSize(zipEightByteInteger14);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger3, zipEightByteInteger14, zipLong17);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField21 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean22 = resourceAlignmentExtraField21.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = resourceAlignmentExtraField21.getCentralDirectoryLength();
        boolean boolean24 = zipLong17.equals((java.lang.Object) resourceAlignmentExtraField21);
        byte[] byteArray25 = resourceAlignmentExtraField21.getLocalFileDataData();
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZipEightByteInteger value: 10" + "'", str6, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger9);
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[51, 0]");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        archiveStreamFactory0.setEntryEncoding("\000\000");
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream9 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        long long10 = zipArchiveOutputStream8.getBytesWritten();
        java.lang.String str11 = zipArchiveOutputStream8.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry12 = null;
        boolean boolean13 = zipArchiveOutputStream8.canWriteEntryData(archiveEntry12);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8, "070707");
        java.lang.String str16 = zipArchiveOutputStream8.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream17 = archiveStreamFactory0.createArchiveOutputStream("ZipLong value: 1024", (java.io.OutputStream) zipArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipLong value: 1024 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF8" + "'", str11, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTF8" + "'", str16, "UTF8");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        java.lang.Object obj3 = generalPurposeBit0.clone();
        generalPurposeBit0.useDataDescriptor(false);
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        java.io.File file13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveOutputStream8.createArchiveEntry(file13, "0x7875 Zip Extra Field: UID=1000 GID=1000");
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        byte[] byteArray19 = unrecognizedExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray19, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jarMarker9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        boolean boolean11 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream13 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070702");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        arArchiveOutputStream3.setLongFileMode((int) (short) 3);
        arArchiveOutputStream3.setLongFileMode(156);
        java.nio.file.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) arArchiveOutputStream3, path8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        java.io.File file18 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer19 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        arArchiveOutputStream22.setLongFileMode((int) (short) 3);
        closeableConsumer19.accept((java.io.Closeable) arArchiveOutputStream22);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream31 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream26, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean32 = tarArchiveInputStream31.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream31, "zip");
        closeableConsumer19.accept((java.io.Closeable) cpioArchiveInputStream34);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream41 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream36, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean42 = tarArchiveInputStream41.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker44 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray45 = jarMarker44.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField46 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray45);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker48 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray49 = jarMarker48.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField50 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray49);
        unicodePathExtraField46.setUnicodeName(byteArray49);
        int int52 = tarArchiveInputStream41.read(byteArray49);
        tarArchiveInputStream41.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry55 = tarArchiveInputStream41.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream57 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream41, 64);
        closeableConsumer19.accept((java.io.Closeable) tarArchiveInputStream57);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("dump", seekableByteChannel17, file18, closeableConsumer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
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
        org.junit.Assert.assertNotNull(closeableConsumer19);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jarMarker44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[]");
        org.junit.Assert.assertNotNull(jarMarker48);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray49), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry55);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream7.setLongFileMode((int) (short) 3);
        closeableConsumer4.accept((java.io.Closeable) arArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("org.apache.commons.compress.MemoryLimitException: -1 kb of memory would be needed; limit was 1 kb. If the file is not corrupt, consider increasing the memory limit.", seekableByteChannel2, path3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 1024);
        java.lang.String str3 = zipLong2.toString();
        byte[] byteArray4 = zipLong2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (-1), byteArray4, (int) (byte) 77, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 77");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipLong value: 1024" + "'", str3, "ZipLong value: 1024");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 4, 0, 0]");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort1);
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter18 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream17);
        zipEntryWriter18.close();
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        long long23 = zipArchiveOutputStream21.getBytesWritten();
        java.lang.String str24 = zipArchiveOutputStream21.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry25 = null;
        boolean boolean26 = zipArchiveOutputStream21.canWriteEntryData(archiveEntry25);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry27 = null;
        boolean boolean28 = zipArchiveOutputStream21.canWriteEntryData(archiveEntry27);
        // The following exception was thrown during execution in test generation
        try {
            zipEntryWriter18.writeNextZipEntry(zipArchiveOutputStream21);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UTF8" + "'", str24, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        int int10 = tarArchiveOutputStream9.getRecordSize();
        java.nio.file.Path path11 = null;
        java.nio.file.LinkOption linkOption13 = null;
        java.nio.file.LinkOption[] linkOptionArray14 = new java.nio.file.LinkOption[] { linkOption13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = tarArchiveOutputStream9.createArchiveEntry(path11, "not encodeable", linkOptionArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 512 + "'", int10 == 512);
        org.junit.Assert.assertNotNull(linkOptionArray14);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 60012, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 60012");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger3, zipEightByteInteger4);
        java.lang.String str6 = zipEightByteInteger3.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField10 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger8, zipEightByteInteger9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = zip64ExtendedInformationExtraField10.getDiskStartNumber();
        byte[] byteArray12 = zip64ExtendedInformationExtraField10.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField10.setSize(zipEightByteInteger14);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger3, zipEightByteInteger14, zipLong17);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField22 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = zip64ExtendedInformationExtraField22.getDiskStartNumber();
        byte[] byteArray24 = zip64ExtendedInformationExtraField22.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        zip64ExtendedInformationExtraField22.setRelativeHeaderOffset(zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong29 = new org.apache.commons.compress.archivers.zip.ZipLong((int) 'a');
        zip64ExtendedInformationExtraField22.setDiskStartNumber(zipLong29);
        zip64ExtendedInformationExtraField18.setDiskStartNumber(zipLong29);
        byte[] byteArray32 = zipLong29.getBytes();
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ZipEightByteInteger value: 10" + "'", str6, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger9);
        org.junit.Assert.assertNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNull(zipLong23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[97, 0, 0, 0]");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = null;
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor1);
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        zipArchiveOutputStream4.flush();
        long long6 = zipArchiveOutputStream4.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream2.writeTo(zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        arArchiveOutputStream2.setLongFileMode((int) (short) 3);
        arArchiveOutputStream2.setLongFileMode(156);
        arArchiveOutputStream2.setLongFileMode(100);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream2.createArchiveEntry(file9, "cpio");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter18 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream17);
        zipEntryWriter18.close();
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        long long23 = zipArchiveOutputStream21.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21);
        zipArchiveOutputStream21.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream28 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream21, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            zipEntryWriter18.writeNextZipEntry(zipArchiveOutputStream21);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long5 = tarArchiveOutputStream4.getBytesWritten();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream4.putArchiveEntry(archiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodePathExtraField3.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertNotNull(zipShort10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, false);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray9, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 10 bytes, expected at least 12");
        } catch (java.util.zip.ZipException e) {
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
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = unrecognizedExtraField0.getLocalFileDataLength();
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
        org.junit.Assert.assertNotNull(zipShort31);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        java.lang.Object obj27 = x7875_NewUnix0.clone();
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
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "0x7875 Zip Extra Field: UID=1000 GID=1000");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream11.write(60011);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 1024);
        java.lang.String str2 = zipLong1.toString();
        byte[] byteArray3 = zipLong1.getBytes();
        java.lang.String str4 = zipLong1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipLong value: 1024" + "'", str2, "ZipLong value: 1024");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 4, 0, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipLong value: 1024" + "'", str4, "ZipLong value: 1024");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("xapk", "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: xapk");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode5 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        zipArchiveOutputStream1.setUseZip64(zip64Mode5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry(archiveEntry7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + zip64Mode5 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode5.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        zip64ExtendedInformationExtraField13.setCompressedSize(zipEightByteInteger15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        boolean boolean23 = zipEightByteInteger20.equals((java.lang.Object) byteArray22);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger25, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger32, zipEightByteInteger33);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger37);
        java.lang.String str39 = zipEightByteInteger36.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker41 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray42 = jarMarker41.getCentralDirectoryData();
        boolean boolean43 = zipEightByteInteger40.equals((java.lang.Object) byteArray42);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger46 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField47 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger45, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger40);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger50 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker51 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray52 = jarMarker51.getCentralDirectoryData();
        boolean boolean53 = zipEightByteInteger50.equals((java.lang.Object) byteArray52);
        byte[] byteArray54 = zipEightByteInteger50.getBytes();
        java.lang.String str55 = zipEightByteInteger50.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger57 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger58 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger57, zipEightByteInteger58);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong61 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long62 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger50, zipEightByteInteger58, zipLong61);
        long long64 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger26, zipEightByteInteger30, zipEightByteInteger33, zipLong61);
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger30);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong67 = zip64ExtendedInformationExtraField13.getDiskStartNumber();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(zipEightByteInteger37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ZipEightByteInteger value: 10" + "'", str39, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger46);
        org.junit.Assert.assertNotNull(zipEightByteInteger50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ZipEightByteInteger value: 0" + "'", str55, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNull(zipLong67);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream17, (int) (byte) 0, (int) '4', "apks", false);
        java.io.File file23 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer24 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel25);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream27 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream26);
        arArchiveOutputStream27.setLongFileMode((int) (short) 3);
        closeableConsumer24.accept((java.io.Closeable) arArchiveOutputStream27);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("", (java.io.InputStream) tarArchiveInputStream22, file23, closeableConsumer24);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
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
        org.junit.Assert.assertNotNull(closeableConsumer24);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getLocalFileDataData();
        byte[] byteArray10 = unicodePathExtraField3.getUnicodeName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("00", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = null;
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "tar\000", "ZipShort value: 28789", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 28789");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream20 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "jar");
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("always");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        zipArchiveOutputStream1.setMethod((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) 10, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.nio.file.Path path16 = null;
        java.nio.file.LinkOption linkOption18 = null;
        java.nio.file.LinkOption[] linkOptionArray19 = new java.nio.file.LinkOption[] { linkOption18 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = zipArchiveOutputStream1.createArchiveEntry(path16, "", linkOptionArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
        org.junit.Assert.assertNotNull(linkOptionArray19);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "cpio", true, false, false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream5.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream8.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) ' ');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "jar", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        int int20 = tarArchiveOutputStream13.getCount();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream13.putArchiveEntry(archiveEntry21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISNWK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 36864 + "'", int0 == 36864);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = zip64ExtendedInformationExtraField3.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = zip64ExtendedInformationExtraField3.getRelativeHeaderOffset();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8);
        java.lang.String str10 = zipEightByteInteger7.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker12 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray13 = jarMarker12.getCentralDirectoryData();
        boolean boolean14 = zipEightByteInteger11.equals((java.lang.Object) byteArray13);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger16, zipEightByteInteger17);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField19 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger11, zipEightByteInteger17);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField20 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger11);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker22 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray23 = jarMarker22.getCentralDirectoryData();
        boolean boolean24 = zipEightByteInteger21.equals((java.lang.Object) byteArray23);
        byte[] byteArray25 = zipEightByteInteger21.getBytes();
        java.lang.String str26 = zipEightByteInteger21.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger28 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger29 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField30 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger28, zipEightByteInteger29);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long33 = zipLong32.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger21, zipEightByteInteger29, zipLong32);
        long long35 = zipLong32.getValue();
        zip64ExtendedInformationExtraField3.setDiskStartNumber(zipLong32);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = zip64ExtendedInformationExtraField3.getRelativeHeaderOffset();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker39 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray40 = jarMarker39.getCentralDirectoryData();
        boolean boolean41 = zipEightByteInteger38.equals((java.lang.Object) byteArray40);
        byte[] byteArray42 = zipEightByteInteger38.getBytes();
        boolean boolean44 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray42, 64);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField3.parseFromCentralDirectoryData(byteArray42, 32782, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(zipLong4);
        org.junit.Assert.assertNull(zipEightByteInteger5);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ZipEightByteInteger value: 10" + "'", str10, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger17);
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ZipEightByteInteger value: 0" + "'", str26, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(zipEightByteInteger37);
        org.junit.Assert.assertNotNull(zipEightByteInteger38);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.io.File file0 = null;
        char[] charArray2 = new char[] { '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder3 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions4 = builder3.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray2, sevenZFileOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions4);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.io.File file0 = null;
        char[] charArray7 = new char[] { '#', '4', 'a', '#', ' ', '#' };
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4a# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4a# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4, a, #,  , #]");
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray3);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray7);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField4.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField4.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unicodePathExtraField4.getLocalFileDataLength();
        byte[] byteArray13 = unicodePathExtraField4.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("ZipShort value: 28789", byteArray13, (int) (byte) 76, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream20, "jar");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = cpioArchiveInputStream23.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream2, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean8 = tarArchiveInputStream7.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker10 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray11 = jarMarker10.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray11);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker14 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray15 = jarMarker14.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray15);
        unicodePathExtraField12.setUnicodeName(byteArray15);
        int int18 = tarArchiveInputStream7.read(byteArray15);
        unrecognizedExtraField1.setLocalFileDataData(byteArray15);
        byte[] byteArray20 = unrecognizedExtraField1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("jar", byteArray20, (int) (short) 1, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jarMarker10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(jarMarker14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        generalPurposeBit0.useEncryption(false);
        java.lang.Object obj5 = generalPurposeBit0.clone();
        boolean boolean6 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean7 = generalPurposeBit0.usesDataDescriptor();
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "zip");
        int int9 = tarArchiveInputStream5.getRecordSize();
        int int10 = tarArchiveInputStream5.getRecordSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        zip64ExtendedInformationExtraField13.setCompressedSize(zipEightByteInteger15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        boolean boolean23 = zipEightByteInteger20.equals((java.lang.Object) byteArray22);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger25, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger32, zipEightByteInteger33);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger37);
        java.lang.String str39 = zipEightByteInteger36.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker41 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray42 = jarMarker41.getCentralDirectoryData();
        boolean boolean43 = zipEightByteInteger40.equals((java.lang.Object) byteArray42);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger46 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField47 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger45, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger40);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger50 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker51 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray52 = jarMarker51.getCentralDirectoryData();
        boolean boolean53 = zipEightByteInteger50.equals((java.lang.Object) byteArray52);
        byte[] byteArray54 = zipEightByteInteger50.getBytes();
        java.lang.String str55 = zipEightByteInteger50.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger57 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger58 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger57, zipEightByteInteger58);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong61 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long62 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger50, zipEightByteInteger58, zipLong61);
        long long64 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger26, zipEightByteInteger30, zipEightByteInteger33, zipLong61);
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger30);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger68 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger69 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField70 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger68, zipEightByteInteger69);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger71 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker72 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray73 = jarMarker72.getCentralDirectoryData();
        boolean boolean74 = zipEightByteInteger71.equals((java.lang.Object) byteArray73);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger76 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger77 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField78 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger76, zipEightByteInteger77);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField79 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger71, zipEightByteInteger77);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField80 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger69, zipEightByteInteger77);
        zip64ExtendedInformationExtraField13.setSize(zipEightByteInteger77);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(zipEightByteInteger37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ZipEightByteInteger value: 10" + "'", str39, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger46);
        org.junit.Assert.assertNotNull(zipEightByteInteger50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ZipEightByteInteger value: 0" + "'", str55, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNotNull(zipEightByteInteger69);
        org.junit.Assert.assertNotNull(zipEightByteInteger71);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger77);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        long long11 = cpioArchiveInputStream9.skip((long) 52);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker13 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray14 = jarMarker13.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField15 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray14);
        org.apache.commons.compress.archivers.tar.TarFile tarFile17 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray14, "070707");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = cpioArchiveInputStream9.read(byteArray14, (int) (short) 51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(jarMarker13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream18, "not encodeable");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: not encodeable");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        int int9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8, false);
        tarFile11.close();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList13 = tarFile11.getEntries();
        tarFile11.close();
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
        org.junit.Assert.assertNotNull(tarArchiveEntryList13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker28 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray29 = jarMarker28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray29);
        unicodePathExtraField26.setUnicodeName(byteArray29);
        int int32 = tarArchiveInputStream21.read(byteArray29);
        tarArchiveInputStream21.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream35 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream35);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream37 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream38 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream36);
        java.io.File file39 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) zipArchiveInputStream36, file39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(jarMarker28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator6.addArchiveEntry(zipArchiveEntryRequestSupplier7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        byte[] byteArray1 = unparseableExtraFieldData0.getLocalFileDataData();
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.io.File file0 = null;
        char[] charArray1 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray1);
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
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker15 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray16 = jarMarker15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField17 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray16);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker19 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray20 = jarMarker19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField21 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray20);
        unicodePathExtraField17.setUnicodeName(byteArray20);
        byte[] byteArray23 = unicodePathExtraField17.getLocalFileDataData();
        byte[] byteArray24 = unicodePathExtraField17.getUnicodeName();
        byte[] byteArray25 = unicodePathExtraField17.getUnicodeName();
        byte[] byteArray26 = unicodePathExtraField17.getLocalFileDataData();
        unrecognizedExtraField0.setCentralDirectoryData(byteArray26);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong30 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long31 = zipLong30.getValue();
        java.lang.Object obj32 = zipLong30.clone();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker34 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray35 = jarMarker34.getCentralDirectoryData();
        boolean boolean36 = zipEightByteInteger33.equals((java.lang.Object) byteArray35);
        byte[] byteArray37 = zipEightByteInteger33.getBytes();
        java.lang.String str38 = zipEightByteInteger33.toString();
        byte[] byteArray39 = zipEightByteInteger33.getBytes();
        zipLong30.putLong(byteArray39, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray39, 52, 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[1, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "ZipLong value: -1");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "ZipLong value: -1");
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ZipEightByteInteger value: 0" + "'", str38, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[-1, -1, -1, -1, 0, 0, 0, 0]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField7 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray6);
        unicodePathExtraField3.setUnicodeName(byteArray6);
        byte[] byteArray9 = unicodePathExtraField3.getUnicodeName();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = unicodePathExtraField3.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipShort10);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile1 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APKM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apkm" + "'", str0, "apkm");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = new org.apache.commons.compress.archivers.zip.ZipShort(100);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PPMD;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PPMD + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PPMD));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics2 = parallelScatterZipCreator1.getStatisticsMessage();
        long long3 = scatterStatistics2.getCompressionElapsed();
        long long4 = scatterStatistics2.getCompressionElapsed();
        java.lang.String str5 = scatterStatistics2.toString();
        org.junit.Assert.assertNotNull(scatterStatistics2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1687279828328L) + "'", long3 == (-1687279828328L));
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1687279828328L) + "'", long4 == (-1687279828328L));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "compressionElapsed=-1687279828328ms, mergingElapsed=0ms" + "'", str5, "compressionElapsed=-1687279828328ms, mergingElapsed=0ms");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray7 = new char[] { ' ', 'a', '4', '4', '#', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " a44##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " a44##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , a, 4, 4, #, #]");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry12 = null;
        java.io.InputStream inputStream13 = null;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("apks");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.lang.String str5 = archiveStreamFactory0.getEntryEncoding();
        java.util.Set<java.lang.String> strSet6 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream10 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        long long11 = zipArchiveOutputStream9.getBytesWritten();
        java.lang.String str12 = zipArchiveOutputStream9.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = null;
        boolean boolean14 = zipArchiveOutputStream9.canWriteEntryData(archiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9, "070707");
        tarArchiveOutputStream16.setBigNumberMode(345);
        int int19 = tarArchiveOutputStream16.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory0.createArchiveOutputStream("ustar\000", (java.io.OutputStream) tarArchiveOutputStream16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "apks" + "'", str5, "apks");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTF8" + "'", str12, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "ZipLong value: 1024");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipLong value: 1024");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = jarArchiveInputStream21.getNextEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry23 = jarArchiveInputStream21.getNextZipEntry();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertNull(zipArchiveEntry23);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        arArchiveOutputStream7.setLongFileMode((int) (short) 3);
        closeableConsumer4.accept((java.io.Closeable) arArchiveOutputStream7);
        java.io.InputStream inputStream11 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream11, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean17 = tarArchiveInputStream16.markSupported();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream16, "zip");
        closeableConsumer4.accept((java.io.Closeable) cpioArchiveInputStream19);
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ZipLong value: 1024", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        unicodePathExtraField3.setNameCRC32((long) 345);
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField3 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        boolean boolean2 = generalPurposeBit0.equals((java.lang.Object) sEGMENT_TYPE1);
        byte[] byteArray3 = generalPurposeBit0.encode();
        generalPurposeBit0.useEncryption(true);
        generalPurposeBit0.useUTF8ForNames(true);
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0]");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "apks", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField13 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger11, zipEightByteInteger12);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = zip64ExtendedInformationExtraField13.getDiskStartNumber();
        byte[] byteArray15 = zip64ExtendedInformationExtraField13.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = unparseableExtraField9.onUnparseableExtraField(byteArray15, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP;
        int int23 = unparseableExtraField22.getKey();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, true, unparseableExtraField22);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream8.write(byteArray15, 10240, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unparseableExtraField9);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(unparseableExtraField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray4 = new char[] { '#', '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#, 4, 4]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(3);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException2 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(feature0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        zipArchiveOutputStream1.setComment("ar");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
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
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray11, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 3 bytes, expected at least 12");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 0, 0, 0]");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveInputStream19.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "tar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: tar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        long long11 = streamCompressor10.getBytesRead();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertNotNull(streamCompressor9);
        org.junit.Assert.assertNotNull(streamCompressor10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode((int) (short) 100);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = tarArchiveOutputStream9.getBytesWritten();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9);
        java.io.File file12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = arArchiveOutputStream11.createArchiveEntry(file12, "070707");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, (-1687279817268L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("org.apache.commons.compress.PasswordRequiredException: Cannot read encrypted content from hi! without a password.", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.METHOD;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature4 = unsupportedZipFeatureException3.getFeature();
        org.apache.commons.compress.MemoryLimitException memoryLimitException5 = new org.apache.commons.compress.MemoryLimitException(0L, 0, (java.lang.Exception) unsupportedZipFeatureException3);
        long long6 = memoryLimitException5.getMemoryNeededInKb();
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertNotNull(feature4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

//    @Test
//    public void test0920() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test0920");
//        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(156, true);
//        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getLocalFileDataLength();
//        byte[] byteArray4 = resourceAlignmentExtraField2.getLocalFileDataData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray8 = jarMarker7.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker9 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        byte[] byteArray10 = jarMarker9.getCentralDirectoryData();
//        org.apache.commons.compress.archivers.zip.JarMarker jarMarker11 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker5, jarMarker7, jarMarker9, jarMarker11 };
//        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray12);
//        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13, false);
//        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("7z");
//        java.lang.String str20 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray13, (int) (short) 4, 29127, zipEncoding19);
//        // The following exception was thrown during execution in test generation
//        try {
//            resourceAlignmentExtraField2.parseFromLocalFileData(byteArray13, (int) (byte) 50, (int) ' ');
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(zipShort3);
//        org.junit.Assert.assertNotNull(byteArray4);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-100, -128]");
//        org.junit.Assert.assertNotNull(jarMarker5);
//        org.junit.Assert.assertNotNull(byteArray6);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
//        org.junit.Assert.assertNotNull(jarMarker7);
//        org.junit.Assert.assertNotNull(byteArray8);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[]");
//        org.junit.Assert.assertNotNull(jarMarker9);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
//        org.junit.Assert.assertNotNull(jarMarker11);
//        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
//        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
//        org.junit.Assert.assertNotNull(zipEncoding19);
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\376\312" + "'", str20, "\376\312");
//    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.io.File file0 = null;
        char[] charArray2 = new char[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        int int9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8, false);
        tarFile11.close();
        tarFile11.close();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream15 = tarFile11.getInputStream(tarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Corrupted TAR archive. Can't read entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withTryToRecoverBrokenArchives(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb(64);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder2.withUseDefaultNameForUnnamedEntries(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = tarArchiveOutputStream8.canWriteEntryData(archiveEntry11);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "cpio", true, false, false);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = null;
        boolean boolean7 = zipArchiveInputStream5.canReadEntryData(archiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream5, 8192);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = null;
        boolean boolean12 = zipArchiveInputStream5.canReadEntryData(archiveEntry11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger3, zipEightByteInteger4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = zip64ExtendedInformationExtraField5.getDiskStartNumber();
        byte[] byteArray7 = zip64ExtendedInformationExtraField5.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField12 = unparseableExtraField1.onUnparseableExtraField(byteArray7, 12, 4095, false, 8);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray7, (int) (byte) 51, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField1);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField2.setCentralDirectoryData(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray5, 131);
        int int11 = zipArchiveInputStream1.read(byteArray5, 504, (int) (byte) 75);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit13 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray5, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40960");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(156, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getLocalFileDataLength();
        byte[] byteArray4 = resourceAlignmentExtraField2.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-100, -128]");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel(65535);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 65535");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "not encodeable" + "'", str10, "not encodeable");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 48);
        short short2 = resourceAlignmentExtraField1.getAlignment();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 48 + "'", short2 == (short) 48);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.compress.MemoryLimitException memoryLimitException3 = new org.apache.commons.compress.MemoryLimitException((long) (byte) -1, (int) (short) 1);
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException4 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) memoryLimitException3);
        long long5 = memoryLimitException3.getMemoryNeededInKb();
        org.apache.commons.compress.archivers.ArchiveException archiveException6 = new org.apache.commons.compress.archivers.ArchiveException("zip", (java.lang.Exception) memoryLimitException3);
        int int7 = memoryLimitException3.getMemoryLimitInKb();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "encryption");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, (int) 'a', "tar");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10, 26128, 4, "apks", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = zipArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean2 = asiExtraField1.isLink();
        byte[] byteArray3 = asiExtraField1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString((long) 96, byteArray3, 257, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 259");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger5, zipEightByteInteger6);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger6);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger12, zipEightByteInteger13);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger16, zipEightByteInteger17);
        java.lang.String str19 = zipEightByteInteger16.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        boolean boolean23 = zipEightByteInteger20.equals((java.lang.Object) byteArray22);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger25, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField29 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger16, zipEightByteInteger20);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker31 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray32 = jarMarker31.getCentralDirectoryData();
        boolean boolean33 = zipEightByteInteger30.equals((java.lang.Object) byteArray32);
        byte[] byteArray34 = zipEightByteInteger30.getBytes();
        java.lang.String str35 = zipEightByteInteger30.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField39 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger37, zipEightByteInteger38);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong41 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long42 = zipLong41.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField43 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger16, zipEightByteInteger30, zipEightByteInteger38, zipLong41);
        long long44 = zipLong41.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField45 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger6, zipEightByteInteger10, zipEightByteInteger13, zipLong41);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger47 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger48 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger47, zipEightByteInteger48);
        java.lang.String str50 = zipEightByteInteger47.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger52 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger53 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField54 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger52, zipEightByteInteger53);
        java.lang.String str55 = zipEightByteInteger52.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger56 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker57 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray58 = jarMarker57.getCentralDirectoryData();
        boolean boolean59 = zipEightByteInteger56.equals((java.lang.Object) byteArray58);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger61 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger62 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger61, zipEightByteInteger62);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField64 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger56, zipEightByteInteger62);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger52, zipEightByteInteger56);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField66 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger47, zipEightByteInteger52);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger68 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger69 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField70 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger68, zipEightByteInteger69);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong71 = zip64ExtendedInformationExtraField70.getDiskStartNumber();
        byte[] byteArray72 = zip64ExtendedInformationExtraField70.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger74 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField70.setSize(zipEightByteInteger74);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong77 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 1024);
        java.lang.String str78 = zipLong77.toString();
        byte[] byteArray79 = zipLong77.getBytes();
        long long80 = zipLong77.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField81 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger6, zipEightByteInteger47, zipEightByteInteger74, zipLong77);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort82 = zip64ExtendedInformationExtraField81.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
        org.junit.Assert.assertNotNull(zipEightByteInteger17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ZipEightByteInteger value: 10" + "'", str19, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(zipEightByteInteger30);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ZipEightByteInteger value: 0" + "'", str35, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(zipEightByteInteger48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ZipEightByteInteger value: 10" + "'", str50, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ZipEightByteInteger value: 10" + "'", str55, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger56);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger62);
        org.junit.Assert.assertNotNull(zipEightByteInteger69);
        org.junit.Assert.assertNull(zipLong71);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray72), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ZipLong value: 1024" + "'", str78, "ZipLong value: 1024");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray79), "[0, 4, 0, 0]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1024L + "'", long80 == 1024L);
        org.junit.Assert.assertNotNull(zipShort82);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 51, false);
        boolean boolean4 = resourceAlignmentExtraField3.allowMethodChange();
        byte[] byteArray5 = resourceAlignmentExtraField3.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[51, 0]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean3 = sevenZFileOptions2.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "", sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier4 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable5 = parallelScatterZipCreator3.createCallable(zipArchiveEntryRequestSupplier4);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics6 = parallelScatterZipCreator3.getStatisticsMessage();
        java.util.concurrent.ExecutorService executorService7 = null;
        java.nio.file.Path path8 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier9 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path8);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator11 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService7, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier9, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier12 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable13 = parallelScatterZipCreator11.createCallable(zipArchiveEntryRequestSupplier12);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator3.submitStreamAwareCallable(scatterZipOutputStreamCallable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable5);
        org.junit.Assert.assertNotNull(scatterStatistics6);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable13);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = zip64ExtendedInformationExtraField9.getDiskStartNumber();
        byte[] byteArray11 = zip64ExtendedInformationExtraField9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = unparseableExtraField5.onUnparseableExtraField(byteArray11, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP;
        int int19 = unparseableExtraField18.getKey();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true, unparseableExtraField18);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField28 = unparseableExtraField21.onUnparseableExtraField(byteArray23, 2, 40960, true, 0);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField33 = unparseableExtraField18.onUnparseableExtraField(byteArray23, 504, 4095, false, 52);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray23, 0, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNotNull(unparseableExtraField5);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(unparseableExtraField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertNotNull(unparseableExtraField21);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipExtraField28);
        org.junit.Assert.assertNull(zipExtraField33);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = asiExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort1);
        int int3 = zipShort1.getValue();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(zipExtraField2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        boolean boolean3 = asiExtraField0.isDirectory();
        int int4 = asiExtraField0.getMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker2, jarMarker4, jarMarker6, jarMarker8 };
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeCentralDirectoryData(zipExtraFieldArray9);
        x0015_CertificateIdForFile0.setCentralDirectoryData(byteArray11);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, false);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray11, 16, 51966);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse((long) 26128, (long) 16);
        long long3 = tarArchiveStructSparse2.getNumbytes();
        java.lang.String str4 = tarArchiveStructSparse2.toString();
        long long5 = tarArchiveStructSparse2.getNumbytes();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 16L + "'", long3 == 16L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TarArchiveStructSparse{offset=26128, numbytes=16}" + "'", str4, "TarArchiveStructSparse{offset=26128, numbytes=16}");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 16L + "'", long5 == 16L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0015_CertificateIdForFile0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0015_CertificateIdForFile0.getHeaderId();
        int int3 = zipShort2.getValue();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(156, true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort3);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField9 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = zip64ExtendedInformationExtraField9.getDiskStartNumber();
        byte[] byteArray11 = zip64ExtendedInformationExtraField9.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField16 = unparseableExtraField5.onUnparseableExtraField(byteArray11, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP;
        int int19 = unparseableExtraField18.getKey();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true, unparseableExtraField18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField(zipExtraField4, byteArray11, 420, (int) (byte) 1, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 2");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipExtraField4);
        org.junit.Assert.assertNotNull(unparseableExtraField5);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNull(zipLong10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField16);
        org.junit.Assert.assertNotNull(unparseableExtraField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        boolean boolean3 = asiExtraField0.isDirectory();
        asiExtraField0.setLinkedFile("\376\312");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray6 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        zip64ExtendedInformationExtraField4.setSize(zipEightByteInteger8);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = zip64ExtendedInformationExtraField4.getRelativeHeaderOffset();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration11 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) zip64ExtendedInformationExtraField4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(zipEightByteInteger10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics3 = parallelScatterZipCreator2.getStatisticsMessage();
        org.junit.Assert.assertNotNull(scatterStatistics3);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The BCJ_ARM_FILTER method doesn't support options of type class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_FILTER));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray3 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel0, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a,  ]");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_MASK;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 12 + "'", short0 == (short) 12);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
            tarArchiveOutputStream8.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) 26128);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[16, 102, 0, 0]");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long10 = tarArchiveOutputStream9.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream9, (short) 0, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setFallbackToUTF8(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean2 = sevenZFileOptions1.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        arArchiveOutputStream3.setLongFileMode((int) (short) 3);
        closeableConsumer0.accept((java.io.Closeable) arArchiveOutputStream3);
        arArchiveOutputStream3.setLongFileMode(4096);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream3.createArchiveEntry(file9, "ZipLong value: 134695760");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = tarArchiveInputStream22.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream20);
        byte[] byteArray23 = null;
        int int26 = zipArchiveInputStream20.read(byteArray23, 0, (int) (short) -1);
        byte[] byteArray27 = null;
        int int30 = zipArchiveInputStream20.read(byteArray27, 131, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jarMarker8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(jarMarker12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor18 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream24 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream19, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean25 = tarArchiveInputStream24.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker27 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray28 = jarMarker27.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField29 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray28);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker31 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray32 = jarMarker31.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField33 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray32);
        unicodePathExtraField29.setUnicodeName(byteArray32);
        int int35 = tarArchiveInputStream24.read(byteArray32);
        tarArchiveInputStream24.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream24);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor18.deflate((java.io.InputStream) tarArchiveInputStream38, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertNotNull(streamCompressor18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jarMarker27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[]");
        org.junit.Assert.assertNotNull(jarMarker31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = jarMarker0.getCentralDirectoryLength();
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes((long) (-1));
        int int7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray5, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 65535 + "'", int7 == 65535);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("UTF8");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry7 = null;
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator6.addArchiveEntry(zipArchiveEntry7, inputStreamSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray6 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = unparseableExtraField0.onUnparseableExtraField(byteArray6, 12, 4095, false, 8);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 263);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray6, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        tarArchiveOutputStream8.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, 512, (int) (byte) 51, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        zipArchiveOutputStream1.flush();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("xapk");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray3 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray2, "xapk");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray3);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 51 };
        unrecognizedExtraField2.setCentralDirectoryData(byteArray5);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray5, 131);
        boolean boolean10 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray5, 100);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray5, (int) (short) 100, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 51]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 2048);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger2, zipEightByteInteger3);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray6 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = unparseableExtraField0.onUnparseableExtraField(byteArray6, 12, 4095, false, 8);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField15 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger13, zipEightByteInteger14);
        byte[] byteArray16 = zipEightByteInteger14.getBytes();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = unparseableExtraField0.onUnparseableExtraField(byteArray16, (int) (byte) 10, 0, true, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipExtraField11);
        org.junit.Assert.assertNotNull(zipEightByteInteger14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        long long0 = org.apache.commons.compress.archivers.EntryStreamOffsets.OFFSET_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        zipArchiveOutputStream1.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream8, (int) (byte) 48, (int) (short) 51, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray4 = jarMarker3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker7 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker1, jarMarker3, jarMarker5, jarMarker7 };
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray8);
        int int10 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, false);
        tarFile12.close();
        java.io.File file14 = null;
        expander0.expand(tarFile12, file14);
        java.io.File file17 = null;
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("00", file17, file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51966 + "'", int10 == 51966);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
        java.lang.Object obj2 = x7875_NewUnix0.clone();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "0x7875 Zip Extra Field: UID=1000 GID=1000");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        java.lang.String str4 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = null;
        boolean boolean6 = zipArchiveOutputStream1.canWriteEntryData(archiveEntry5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "070707");
        java.lang.String str9 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker11 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray12 = jarMarker11.getCentralDirectoryData();
        boolean boolean13 = zipEightByteInteger10.equals((java.lang.Object) byteArray12);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField17 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger15, zipEightByteInteger16);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField18 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger10, zipEightByteInteger16);
        byte[] byteArray19 = zip64ExtendedInformationExtraField18.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger16);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream28 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream23, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean29 = tarArchiveInputStream28.markSupported();
        int int30 = tarArchiveInputStream28.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream32 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream28, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream33 = archiveStreamFactory0.createArchiveInputStream("ZipShort value: 28789", (java.io.InputStream) tarArchiveInputStream28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipShort value: 28789 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not encodeable" + "'", str14, "not encodeable");
        org.junit.Assert.assertNotNull(archiveOutputStream21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID;
        java.lang.Object obj1 = null;
        boolean boolean2 = zipShort0.equals(obj1);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField3 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort0);
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(zipExtraField3);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream24.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter18 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream17);
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        zipArchiveOutputStream20.flush();
        long long22 = zipArchiveOutputStream20.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipEntryWriter18.writeNextZipEntry(zipArchiveOutputStream20);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore15);
        org.junit.Assert.assertNotNull(streamCompressor16);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        org.apache.commons.compress.archivers.zip.ZipShort zipShort15 = unrecognizedExtraField0.getCentralDirectoryLength();
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
        org.junit.Assert.assertNotNull(zipShort15);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore8 = defaultBackingStoreSupplier3.get();
        java.util.concurrent.ExecutorService executorService9 = null;
        java.util.concurrent.ExecutorService executorService10 = null;
        java.nio.file.Path path11 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier12 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path11);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator14 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService10, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier12, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator15 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService9, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier12);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore16 = defaultBackingStoreSupplier12.get();
        java.util.concurrent.ExecutorService executorService17 = null;
        java.util.concurrent.ExecutorService executorService18 = null;
        java.nio.file.Path path19 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier20 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path19);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator22 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService18, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier20, (int) (short) 1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator23 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService17, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier20);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore24 = defaultBackingStoreSupplier20.get();
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor25 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore24);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream26 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore16, streamCompressor25);
        long long27 = streamCompressor25.getBytesWrittenForLastEntry();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream28 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore8, streamCompressor25);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore7);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore8);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore16);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore24);
        org.junit.Assert.assertNotNull(streamCompressor25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getCentralDirectoryData();
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) byteArray2);
        java.lang.Object obj4 = null;
        boolean boolean5 = zipEightByteInteger0.equals(obj4);
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.io.InputStream inputStream16 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream21 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream16, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean22 = tarArchiveInputStream21.markSupported();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker24 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray25 = jarMarker24.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray25);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker28 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray29 = jarMarker28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField30 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray29);
        unicodePathExtraField26.setUnicodeName(byteArray29);
        int int32 = tarArchiveInputStream21.read(byteArray29);
        tarArchiveInputStream21.mark(0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = tarArchiveInputStream21.getCurrentEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream37 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream21, 64);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream37, "zip");
        java.nio.file.Path path40 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) tarArchiveInputStream37, path40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jarMarker24);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertNotNull(jarMarker28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(tarArchiveEntry35);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        boolean boolean4 = zipArchiveOutputStream1.isSeekable();
        long long5 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 2, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10, 0]");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker2 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray3 = jarMarker2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = new org.apache.commons.compress.archivers.zip.ZipExtraField[] { jarMarker0, jarMarker2, jarMarker4, jarMarker6 };
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray7);
        int int9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8, false);
        java.math.BigInteger bigInteger12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray8);
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 24576);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray8, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray8);
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(jarMarker2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(zipExtraFieldArray7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0, -2, -54, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51966 + "'", int9 == 51966);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withTryToRecoverBrokenArchives(true);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder2.withMaxMemoryLimitInKb(64);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder6 = builder2.withTryToRecoverBrokenArchives(false);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder8 = builder2.withUseDefaultNameForUnnamedEntries(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        boolean boolean1 = asiExtraField0.isLink();
        byte[] byteArray2 = asiExtraField0.getCentralDirectoryData();
        asiExtraField0.setLinkedFile("dump");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getLocalFileDataLength();
        byte[] byteArray2 = unparseableExtraFieldData0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unparseableExtraFieldData0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipShort3);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, (int) (byte) 0, (int) '4', "apks", false);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream5, "070701");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = cpioArchiveInputStream9.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("tar\000", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_LINK_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 511 + "'", int0 == 511);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker16 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray17 = jarMarker16.getCentralDirectoryData();
        boolean boolean18 = zipEightByteInteger15.equals((java.lang.Object) byteArray17);
        zip64ExtendedInformationExtraField13.setCompressedSize(zipEightByteInteger15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker21 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray22 = jarMarker21.getCentralDirectoryData();
        boolean boolean23 = zipEightByteInteger20.equals((java.lang.Object) byteArray22);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField27 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger25, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger20, zipEightByteInteger26);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(10L);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger32 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField34 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger32, zipEightByteInteger33);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField38 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger37);
        java.lang.String str39 = zipEightByteInteger36.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger40 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker41 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray42 = jarMarker41.getCentralDirectoryData();
        boolean boolean43 = zipEightByteInteger40.equals((java.lang.Object) byteArray42);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger45 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger46 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField47 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger45, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger40, zipEightByteInteger46);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger40);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger50 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker51 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray52 = jarMarker51.getCentralDirectoryData();
        boolean boolean53 = zipEightByteInteger50.equals((java.lang.Object) byteArray52);
        byte[] byteArray54 = zipEightByteInteger50.getBytes();
        java.lang.String str55 = zipEightByteInteger50.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger57 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger58 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField59 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger57, zipEightByteInteger58);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong61 = new org.apache.commons.compress.archivers.zip.ZipLong((long) (-1));
        long long62 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger50, zipEightByteInteger58, zipLong61);
        long long64 = zipLong61.getValue();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField65 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger26, zipEightByteInteger30, zipEightByteInteger33, zipLong61);
        zip64ExtendedInformationExtraField13.setRelativeHeaderOffset(zipEightByteInteger30);
        byte[] byteArray67 = zip64ExtendedInformationExtraField13.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger26);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(zipEightByteInteger37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ZipEightByteInteger value: 10" + "'", str39, "ZipEightByteInteger value: 10");
        org.junit.Assert.assertNotNull(zipEightByteInteger40);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger46);
        org.junit.Assert.assertNotNull(zipEightByteInteger50);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray54), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ZipEightByteInteger value: 0" + "'", str55, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(zipEightByteInteger58);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = new org.apache.commons.compress.archivers.zip.ZipShort((int) (byte) 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("070702", seekableByteChannel2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
