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
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 0, path1, "pack200.bz2", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        byte[] byteArray0 = null;
        boolean boolean2 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        zipArchiveInputStream3.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, 420, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream11 = compressorStreamFactory0.createCompressorInputStream("UTF8", (java.io.InputStream) tarArchiveInputStream9, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: UTF8 not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry7 = cpioArchiveInputStream6.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream12 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 60012);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize(60012) > 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.io.InputStream inputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream4 = archiveStreamFactory0.createArchiveInputStream("unpack.deflate.hint", inputStream2, "error");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: InputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = null;
        unrecognizedExtraField1.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unrecognizedExtraField1.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray7 = zipLong6.getBytes();
        boolean boolean9 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray7, 32768);
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 0);
        unrecognizedExtraField1.setCentralDirectoryData(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray7, 16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        byte[] byteArray5 = new byte[] {};
        pack200CompressorOutputStream4.write(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes(1687209507L, byteArray5, (int) (byte) 10, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33195");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream2 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream(inputStream0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISCHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8192 + "'", int0 == 8192);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("ustar ", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        deflateCompressorInputStream5.close();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = deflateCompressorInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.Path path4 = tarArchiveEntry2.getPath();
        tarArchiveEntry2.setUserId((int) (byte) 52);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(path4);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField5 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean11 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray9, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior13 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, false, extraFieldParsingBehavior13);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 32768);
        unrecognizedExtraField5.setLocalFileDataData(byteArray9);
        byte[] byteArray18 = unrecognizedExtraField5.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = arArchiveInputStream2.read(byteArray18, 156, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1, 1]");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream7 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream10 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream1, false, 8192);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.ZSTANDARD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zstd" + "'", str0, "zstd");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = tarArchiveInputStream5.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream5);
        int int8 = deflateCompressorInputStream7.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream11 = compressorStreamFactory1.createCompressorInputStream((java.io.InputStream) cpioArchiveInputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "0x5455 Zip Extra Field: Flags=0 ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 0x5455 Zip Extra Field: Flags=0 ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer5 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap6 = packer5.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, (java.util.Map<java.lang.String, java.lang.String>) strMap6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 3);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream7.write(byteArray9, (int) (short) 3, (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(1687209507L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1902610146000L + "'", long1 == 1902610146000L);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile3.finish();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        framedSnappyCompressorOutputStream4.finish();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorOutputStream4.write(byteArray7, 76, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(0);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore fileBasedScatterGatherBackingStore1 = new org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray0, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.MIN_BLOCKSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray2, 32768);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray2, 32768);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_READ;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_READ + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_READ));
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        int int10 = tarArchiveOutputStream6.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream11 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException3 = new org.apache.commons.compress.archivers.dump.InvalidFormatException();
        org.apache.commons.compress.MemoryLimitException memoryLimitException4 = new org.apache.commons.compress.MemoryLimitException((long) 7, 26128, (java.lang.Exception) invalidFormatException3);
        org.apache.commons.compress.archivers.ArchiveException archiveException5 = new org.apache.commons.compress.archivers.ArchiveException("snappy-framed", (java.lang.Exception) memoryLimitException4);
        java.lang.String str6 = memoryLimitException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit." + "'", str6, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit.");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        byte[] byteArray2 = x0017_StrongEncryptionHeader0.getCentralDirectoryData();
        long long3 = x0017_StrongEncryptionHeader0.getRecordCount();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        boolean boolean8 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray6, 32768);
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray6, 257, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException1 = new org.apache.commons.compress.archivers.dump.InvalidFormatException((long) '4');
        long long2 = invalidFormatException1.getOffset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Unpacker.KEEP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "keep" + "'", str0, "keep");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG;
        int int1 = zipLong0.getIntValue();
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67324752 + "'", int1 == 67324752);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp1.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray5 = zipLong4.getBytes();
        x5455_ExtendedTimestamp1.setModifyTime(zipLong4);
        byte byte7 = x5455_ExtendedTimestamp1.getFlags();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 3);
        boolean boolean13 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray9, (int) (byte) 53);
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x5455_ExtendedTimestamp1, byteArray9, (int) (byte) 50, (int) (byte) 76, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 5455");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        boolean boolean5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray3, 1024);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = extraFieldParsingMode0.onUnparseableExtraField(byteArray3, 100, 0, false, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        boolean boolean1 = org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename("pack200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS1.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, strMap5);
        byte[] byteArray7 = new byte[] {};
        pack200CompressorOutputStream6.write(byteArray7);
        x000A_NTFS1.parseFromCentralDirectoryData(byteArray7, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x000A_NTFS1.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = extraFieldParsingMode0.createExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField14 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray15 = unrecognizedExtraField14.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray17 = zipShort16.getBytes();
        java.lang.Object obj18 = zipShort16.clone();
        unrecognizedExtraField14.setHeaderId(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode0.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS21 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger22 = x000A_NTFS21.getModifyTime();
        java.util.Date date23 = x000A_NTFS21.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong25 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray26 = zipLong25.getBytes();
        boolean boolean28 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray26, 32768);
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray26, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode32 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray33 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray26, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField37 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS21, byteArray26, 16384, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type a");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[30, -95]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "ZipShort value: 41246");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(zipEightByteInteger22);
        org.junit.Assert.assertNull(date23);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode32 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode32.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray33);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.CREATE_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 4 + "'", byte0 == (byte) 4);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.DEFLATE_HINT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.deflate.hint" + "'", str0, "pack.deflate.hint");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
        org.junit.Assert.assertNull(zipLong1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS1.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, strMap5);
        byte[] byteArray7 = new byte[] {};
        pack200CompressorOutputStream6.write(byteArray7);
        x000A_NTFS1.parseFromCentralDirectoryData(byteArray7, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x000A_NTFS1.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField13 = extraFieldParsingMode0.createExtraField(zipShort12);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField14 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray15 = unrecognizedExtraField14.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray17 = zipShort16.getBytes();
        java.lang.Object obj18 = zipShort16.clone();
        unrecognizedExtraField14.setHeaderId(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField20 = extraFieldParsingMode0.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong22 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray23 = zipLong22.getBytes();
        boolean boolean25 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray23, 32768);
        boolean boolean27 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray23, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode29 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray23, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode29);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock33 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray23, 488, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField38 = extraFieldParsingMode0.onUnparseableExtraField(byteArray23, 0, 32768, false, (int) (byte) 54);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode39 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS40 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger41 = x000A_NTFS40.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel42 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream43 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel42);
        java.util.Map<java.lang.String, java.lang.String> strMap44 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream45 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream43, strMap44);
        byte[] byteArray46 = new byte[] {};
        pack200CompressorOutputStream45.write(byteArray46);
        x000A_NTFS40.parseFromCentralDirectoryData(byteArray46, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort51 = x000A_NTFS40.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField52 = extraFieldParsingMode39.createExtraField(zipShort51);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField53 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray54 = unrecognizedExtraField53.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort55 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray56 = zipShort55.getBytes();
        java.lang.Object obj57 = zipShort55.clone();
        unrecognizedExtraField53.setHeaderId(zipShort55);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField59 = extraFieldParsingMode39.createExtraField(zipShort55);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong61 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray62 = zipLong61.getBytes();
        boolean boolean64 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray62, 32768);
        boolean boolean66 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray62, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode68 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray69 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray62, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode68);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock72 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray62, 488, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField77 = extraFieldParsingMode39.onUnparseableExtraField(byteArray62, 0, 32768, false, (int) (byte) 54);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry79 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField80 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry79.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField80);
        byte[] byteArray82 = jarArchiveEntry79.getCentralDirectoryExtra();
        long long83 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray82);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField87 = extraFieldParsingMode0.fill(zipExtraField77, byteArray82, 504, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type acc1");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipExtraField13);
        org.junit.Assert.assertNull(byteArray15);
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[30, -95]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "ZipShort value: 41246");
        org.junit.Assert.assertNotNull(zipExtraField20);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode29 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode29.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
        org.junit.Assert.assertNotNull(zipExtraField38);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode39 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode39.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipEightByteInteger41);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[]");
        org.junit.Assert.assertNotNull(zipShort51);
        org.junit.Assert.assertNotNull(zipExtraField52);
        org.junit.Assert.assertNull(byteArray54);
        org.junit.Assert.assertNotNull(zipShort55);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[30, -95]");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "ZipShort value: 41246");
        org.junit.Assert.assertNotNull(zipExtraField59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode68 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode68.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray69);
        org.junit.Assert.assertNotNull(zipExtraField77);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 172318L + "'", long83 == 172318L);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "a\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("pack200");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) archiveException1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = cpioArchiveInputStream8.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        java.lang.String str1 = zipLong0.toString();
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZipLong value: 33639248" + "'", str1, "ZipLong value: 33639248");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PPMD;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PPMD + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PPMD));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long6 = zipLong5.getValue();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray9 = zipShort8.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray9, 16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33639248L + "'", long6 == 33639248L);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[30, -95]");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "lz4-block.xz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = resourceAlignmentExtraField1.getCentralDirectoryLength();
        byte[] byteArray3 = zipShort2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray3, (int) (byte) 51, 512);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[2, 0]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream6 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        framedSnappyCompressorOutputStream6.finish();
        java.io.File file8 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer9 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ", (java.io.OutputStream) framedSnappyCompressorOutputStream6, file8, closeableConsumer9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null]  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.CHECKSUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 84446 + "'", int0 == 84446);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISUID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate64();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate64" + "'", str0, "deflate64");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) (short) 0);
        boolean boolean3 = arArchiveEntry2.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long4 = brotliCompressorInputStream3.getCompressedCount();
        java.lang.String str5 = brotliCompressorInputStream3.toString();
        boolean boolean6 = brotliCompressorInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 10, path1, "pack200", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        java.lang.String str6 = unicodeExtraFieldPolicy3.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "never" + "'", str6, "never");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getAccessTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray4 = zipLong3.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong3);
        byte byte6 = x5455_ExtendedTimestamp0.getFlags();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray9 = zipLong8.getBytes();
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray9, 10, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1020L + "'", long10 == 1020L);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 312764420000L + "'", long1 == 312764420000L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETUID));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream8 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (short) 100, 0, "z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        long long11 = tarArchiveEntry7.getSize();
        java.io.InputStream inputStream12 = tarFile4.getInputStream(tarArchiveEntry7);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile4, path13);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray16 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray16);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        char[] charArray25 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile26 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel17, charArray25);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel17);
        java.nio.file.Path path28 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer29 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel30);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream33 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream31, strMap32);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream34 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream33);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray36 = zipShort35.getBytes();
        boolean boolean38 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray36, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray36, true);
        gzipCompressorOutputStream34.write(byteArray36);
        closeableConsumer29.accept((java.io.Closeable) gzipCompressorOutputStream34);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("pack.modification.time", seekableByteChannel17, path28, closeableConsumer29);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: pack.modification.time not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
        org.junit.Assert.assertNotNull(seekableByteChannelArray16);
        org.junit.Assert.assertNotNull(seekableByteChannel17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(closeableConsumer29);
        org.junit.Assert.assertNotNull(zipShort35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.flush();
        // The following exception was thrown during execution in test generation
        try {
            deflateCompressorOutputStream16.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        int int6 = jarArchiveEntry1.getVersionRequired();
        java.nio.file.attribute.FileTime fileTime7 = jarArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField10 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField10);
        byte[] byteArray12 = jarArchiveEntry9.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField13 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField13);
        byte[] byteArray15 = resourceAlignmentExtraField13.getLocalFileDataData();
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry17 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        byte[] byteArray4 = jarArchiveEntry1.getCentralDirectoryExtra();
        int int5 = jarArchiveEntry1.getVersionMadeBy();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource6 = jarArchiveEntry1.getNameSource();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField7 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean13 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray11, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior15 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, false, extraFieldParsingBehavior15);
        boolean boolean18 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray11, 32768);
        unrecognizedExtraField7.setLocalFileDataData(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unrecognizedExtraField7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + nameSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream6 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray7 = zipShort6.getBytes();
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true);
        gzipCompressorOutputStream5.write(byteArray7);
        closeableConsumer0.accept((java.io.Closeable) gzipCompressorOutputStream5);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 3);
        boolean boolean19 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray15, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream5.write(byteArray15, 24576, 26128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        int int7 = deflateCompressorInputStream5.available();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray10 = zipLong9.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = deflateCompressorInputStream5.read(byteArray10, 1024, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISVTX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        zipArchiveInputStream3.mark((int) (byte) -1);
        long long7 = zipArchiveInputStream3.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        byte[] byteArray12 = new byte[] {};
        pack200CompressorOutputStream11.write(byteArray12);
        int int16 = zipArchiveInputStream3.read(byteArray12, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField18 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, true, unparseableExtraField18);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray12, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.KEEP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "keep" + "'", str0, "keep");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "lzma");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        zipArchiveInputStream3.mark((int) (byte) -1);
        long long6 = zipArchiveInputStream3.getUncompressedCount();
        long long8 = zipArchiveInputStream3.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream3, 0, (int) (byte) 50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream13 = archiveStreamFactory0.createArchiveInputStream("snappy-framed", (java.io.InputStream) zipArchiveInputStream3, "snappy-raw");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: snappy-framed not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        byte[] byteArray6 = new byte[] {};
        pack200CompressorOutputStream5.write(byteArray6);
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray6, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x000A_NTFS0.getHeaderId();
        byte[] byteArray12 = zipShort11.getBytes();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        boolean boolean16 = zipEncoding14.canEncode("a\000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray12, zipEncoding14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0]");
        org.junit.Assert.assertNotNull(zipEncoding14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        long long7 = tarArchiveEntry2.getRealSize();
        boolean boolean8 = tarArchiveEntry2.isBlockDevice();
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 3);
        boolean boolean14 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray10, (int) (byte) 53);
        boolean boolean16 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray10, 0);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding18 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        boolean boolean20 = zipEncoding18.canEncode("a\000");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray10, zipEncoding18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipEncoding18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        byte[] byteArray1 = unicodeCommentExtraField0.getUnicodeName();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean8 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray6, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, false, extraFieldParsingBehavior10);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, 32768);
        unrecognizedExtraField2.setLocalFileDataData(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField0.parseFromLocalFileData(byteArray6, 2, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod2 = sevenZMethodConfiguration1.getMethod();
        java.lang.Object obj3 = sevenZMethodConfiguration1.getOptions();
        boolean boolean5 = sevenZMethodConfiguration1.equals((java.lang.Object) 488);
        org.junit.Assert.assertNull(sevenZMethod2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date9 = cpioArchiveEntry8.getLastModifiedDate();
        cpioArchiveEntry8.setRemoteDeviceMin((long) 12);
        boolean boolean12 = zipArchiveOutputStream3.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
        long long13 = zipArchiveOutputStream3.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters14 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters14.setWithZlibHeader(false);
        int int17 = deflateParameters14.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream18 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, deflateParameters14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory0.createArchiveOutputStream(" \000", (java.io.OutputStream) deflateCompressorOutputStream18, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  ? not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_4));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.flush();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS18 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = x000A_NTFS18.getModifyTime();
        java.lang.String str20 = zipEightByteInteger19.toString();
        byte[] byteArray21 = zipEightByteInteger19.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            deflateCompressorOutputStream16.write(byteArray21, 8, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(zipEightByteInteger19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ZipEightByteInteger value: 0" + "'", str20, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod2 = sevenZMethodConfiguration1.getMethod();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = jarArchiveEntry4.getUnparseableExtraFieldData();
        boolean boolean6 = jarArchiveEntry4.isStreamContiguous();
        long long7 = jarArchiveEntry4.getDataOffset();
        long long8 = jarArchiveEntry4.getExternalAttributes();
        boolean boolean9 = sevenZMethodConfiguration1.equals((java.lang.Object) long8);
        org.junit.Assert.assertNull(sevenZMethod2);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.compress.MemoryLimitException memoryLimitException4 = new org.apache.commons.compress.MemoryLimitException((long) 'a', 508);
        int int5 = memoryLimitException4.getMemoryLimitInKb();
        org.apache.commons.compress.archivers.dump.UnrecognizedFormatException unrecognizedFormatException6 = new org.apache.commons.compress.archivers.dump.UnrecognizedFormatException();
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException7 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) unrecognizedFormatException6);
        memoryLimitException4.addSuppressed((java.lang.Throwable) unrecognizedFormatException6);
        org.apache.commons.compress.MemoryLimitException memoryLimitException9 = new org.apache.commons.compress.MemoryLimitException((long) 4, 8192, (java.lang.Exception) unrecognizedFormatException6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 508 + "'", int5 == 508);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 10);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray1, false, unparseableExtraField3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray5 = zipShort4.getBytes();
        boolean boolean7 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byteArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray5, 476, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.lang.String str1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.getCompressedFilename("pack.code.attribute.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pack.code.attribute..lzma" + "'", str1, "pack.code.attribute..lzma");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 77);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 77 + "'", int1 == 77);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1, inputStreamSupplier3);
        int int5 = zipArchiveEntryRequest4.getMethod();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        packer0.removePropertyChangeListener(propertyChangeListener2);
        java.util.jar.JarFile jarFile4 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6, strMap7);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream9 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream8, "snappy-framed");
        tarArchiveOutputStream11.setLongFileMode((int) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarFile4, (java.io.OutputStream) tarArchiveOutputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore fileBasedScatterGatherBackingStore1 = new org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        long long11 = tarArchiveEntry7.getSize();
        java.io.InputStream inputStream12 = tarFile4.getInputStream(tarArchiveEntry7);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile4, path13);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer5 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap6 = packer5.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, (java.util.Map<java.lang.String, java.lang.String>) strMap6);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField8 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField9 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean15 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray13, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior17 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13, false, extraFieldParsingBehavior17);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 32768);
        unrecognizedExtraField9.setLocalFileDataData(byteArray13);
        unrecognizedExtraField8.setCentralDirectoryData(byteArray13);
        pack200CompressorOutputStream7.write(byteArray13);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS24 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = x000A_NTFS24.getModifyTime();
        java.util.Date date26 = x000A_NTFS24.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger27 = x000A_NTFS24.getModifyTime();
        byte[] byteArray28 = x000A_NTFS24.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream7.write(byteArray28, (int) '#', 511);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNotNull(zipEightByteInteger27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.SPLITTING;
        org.junit.Assert.assertNotNull(feature0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean12 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray10, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, extraFieldParsingBehavior14);
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 508);
        int int20 = jarArchiveInputStream4.read(byteArray10, (int) (byte) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream21 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) jarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray5, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray5, false, extraFieldParsingBehavior9);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 32768);
        unrecognizedExtraField1.setLocalFileDataData(byteArray5);
        unrecognizedExtraField0.setCentralDirectoryData(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.lang.String str7 = tarArchiveEntry2.getExtraPaxHeader("xz");
        boolean boolean8 = tarArchiveEntry2.isExtended();
        java.lang.String str9 = tarArchiveEntry2.getGroupName();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, 3);
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 3);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray6, 263, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.ACCESS_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 2 + "'", byte0 == (byte) 2);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APKS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apks" + "'", str0, "apks");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 120);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        long long0 = org.apache.commons.compress.archivers.ArchiveEntry.SIZE_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.compress.compressors.CompressorException compressorException1 = new org.apache.commons.compress.compressors.CompressorException("pack.code.attribute..lzma");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        long long5 = cpioArchiveEntry2.getGID();
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setRemoteDevice((long) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(4096);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS1.getModifyTime();
        java.lang.String str3 = zipEightByteInteger2.toString();
        byte[] byteArray4 = zipEightByteInteger2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 80, byteArray4, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES128));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
        arArchiveInputStream2.close();
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("tar\000");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1, "tar");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile unknown archive");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pack200");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream10 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        byte[] byteArray6 = jarArchiveEntry1.getExtra();
        jarArchiveEntry1.setCompressedSize((long) 156);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData9 = jarArchiveEntry1.getUnparseableExtraFieldData();
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNull(unparseableExtraFieldData9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(path0, " \000", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile(".lzma");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: .lzma");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray5 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        char[] charArray14 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel6, charArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "pack.class.attribute.", charArray14);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray5);
        org.junit.Assert.assertNotNull(seekableByteChannel6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = cpioArchiveOutputStream4.createArchiveEntry(file5, "jar");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.EFS_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean5 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray3, 3);
        boolean boolean7 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray3, (int) (byte) 53);
        long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray3, 1, 476);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField11 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField(".bz2", byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray3, (int) (byte) 0, 1000);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE;
        org.junit.Assert.assertTrue("'" + blockType0 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE + "'", blockType0.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = null;
        jarArchiveEntry1.setGeneralPurposeBit(generalPurposeBit3);
        jarArchiveEntry1.setMethod(1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, (int) '#', 257);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream11 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = tarArchiveInputStream12.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream14 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream12);
        int int15 = deflateCompressorInputStream14.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream14, (int) (byte) 100);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer18 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap19 = packer18.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream17, (java.util.Map<java.lang.String, java.lang.String>) strMap19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream21 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream8, (java.util.Map<java.lang.String, java.lang.String>) strMap19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(packer18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setDeflateStrategy((int) (short) 3);
        int int3 = gzipParameters0.getDeflateStrategy();
        java.lang.String str4 = gzipParameters0.getComment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.OFFSETLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        boolean boolean6 = cpioArchiveEntry2.isBlockDevice();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = cpioArchiveEntry2.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, (short) 12, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = null;
        unrecognizedExtraField0.setHeaderId(zipShort1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 3);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray4, (int) (byte) 53);
        boolean boolean10 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray4, 128, 512);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 3);
        boolean boolean15 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray11, (int) (byte) 53);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = deflateCompressorInputStream9.read(byteArray11, (int) (short) 10, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        java.util.Date date7 = tarArchiveEntry2.getModTime();
        int int8 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Jun 19 23:19:02 CEST 2023");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33188 + "'", int8 == 33188);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((int) (byte) 120);
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry3 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry3.setVolume((int) (byte) 120);
        java.lang.String str6 = dumpArchiveEntry3.getSimpleName();
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        java.lang.String str9 = zipArchiveOutputStream8.getEncoding();
        boolean boolean10 = zipArchiveOutputStream8.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date14 = cpioArchiveEntry13.getLastModifiedDate();
        cpioArchiveEntry13.setRemoteDeviceMaj((long) 'a');
        int int17 = cpioArchiveEntry13.getAlignmentBoundary();
        boolean boolean18 = zipArchiveOutputStream8.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry13);
        cpioArchiveEntry13.setDeviceMin((long) 26128);
        boolean boolean21 = cpioArchiveEntry13.isSocket();
        java.util.Date date22 = cpioArchiveEntry13.getLastModifiedDate();
        dumpArchiveEntry3.setAccessTime(date22);
        dumpArchiveEntry0.setLastModifiedDate(date22);
        java.lang.Class<?> wildcardClass25 = dumpArchiveEntry0.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF8" + "'", str9, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(date22);
        org.junit.Assert.assertEquals(date22.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("deflate64");
        cpioArchiveEntry1.setUID(1687209505L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename("snappy-raw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "snappy-raw" + "'", str1, "snappy-raw");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 3, file1, "lzma");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 488);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        long long6 = zipArchiveInputStream1.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 0, (int) (byte) 50);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = zipArchiveInputStream1.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray6 = zipShort5.getBytes();
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, true);
        gzipCompressorOutputStream4.write(byteArray6);
        gzipCompressorOutputStream4.finish();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize13 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters17 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters18 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize13, true, true, true, parameters17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream19 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, parameters18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write more data, the end of the compressed data stream has been reached");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertTrue("'" + blockSize13 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize13.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray3 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray3);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        char[] charArray7 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel4, charArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "lz4-block", charArray7);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray3);
        org.junit.Assert.assertNotNull(seekableByteChannel4);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        int int10 = tarArchiveOutputStream6.getCount();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) pack200CompressorInputStream6, "pack200", false, false);
        int int11 = pack200CompressorInputStream6.available();
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "pack200.bz2", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 255);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = zipArchiveInputStream1.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate" + "'", str0, "deflate");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray2, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "lz4-block");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap1 = compressorStreamFactory0.getCompressorOutputStreamProviders();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        zipArchiveInputStream3.mark((int) (byte) -1);
        long long7 = zipArchiveInputStream3.skip((long) 16877);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory0.createCompressorInputStream((java.io.InputStream) zipArchiveInputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        boolean boolean13 = tarArchiveEntry11.isCheckSumOK();
        tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry11);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode((int) (byte) 88);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        boolean boolean5 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray1, (int) (byte) 53);
        long long8 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray1, 1, 476);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, 16877);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.io.File file0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        long long6 = zipArchiveInputStream2.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream8, strMap9);
        byte[] byteArray11 = new byte[] {};
        pack200CompressorOutputStream10.write(byteArray11);
        int int15 = zipArchiveInputStream2.read(byteArray11, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer17 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap18 = packer17.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil20 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap18, ".lzma");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream21 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream2, (java.util.Map<java.lang.String, java.lang.String>) strMap18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, (java.util.Map<java.lang.String, java.lang.String>) strMap18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(packer17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K64;
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K64 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K64));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp5.getAccessTime();
        byte[] byteArray7 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path11 = tarArchiveEntry10.getPath();
        java.nio.file.attribute.FileTime fileTime12 = null;
        tarArchiveEntry10.setCreationTime(fileTime12);
        java.nio.file.attribute.FileTime fileTime14 = tarArchiveEntry10.getLastModifiedTime();
        x5455_ExtendedTimestamp5.setAccessFileTime(fileTime14);
        boolean boolean16 = x5455_ExtendedTimestamp5.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong17 = x5455_ExtendedTimestamp5.getAccessTime();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry20 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long21 = arArchiveEntry20.getLastModified();
        long long22 = arArchiveEntry20.getLength();
        java.util.Date date23 = arArchiveEntry20.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong24 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date23);
        x5455_ExtendedTimestamp5.setModifyTime(zipLong24);
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong24);
        byte[] byteArray30 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean32 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray30, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior34 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray30, false, extraFieldParsingBehavior34);
        boolean boolean37 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray30, 32768);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray30, (int) (byte) 53, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
        org.junit.Assert.assertNull(path11);
        org.junit.Assert.assertNotNull(fileTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(zipLong17);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1687209544L + "'", long21 == 1687209544L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 12L + "'", long22 == 12L);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Jun 19 23:19:04 CEST 2023");
        org.junit.Assert.assertNotNull(zipLong24);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(zipExtraField1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        int int7 = deflateCompressorInputStream5.available();
        long long8 = deflateCompressorInputStream5.getCompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = deflateCompressorInputStream5.skip((long) 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        tarFile6.close();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, "apkm");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path16 = tarArchiveEntry15.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path20 = tarArchiveEntry19.getPath();
        java.nio.file.attribute.FileTime fileTime21 = null;
        tarArchiveEntry19.setCreationTime(fileTime21);
        java.nio.file.attribute.FileTime fileTime23 = tarArchiveEntry19.getLastModifiedTime();
        tarArchiveEntry15.setLastAccessTime(fileTime23);
        boolean boolean25 = tarArchiveEntry15.isGNULongNameEntry();
        long long26 = tarArchiveEntry15.getLongUserId();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream12.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path16);
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNotNull(fileTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        java.io.File file6 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer7 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("LiteralBlock starting at 488 with length 2", seekableByteChannel3, file6, closeableConsumer7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: LiteralBlock starting at 488 with length 2 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(closeableConsumer7);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path10 = tarArchiveEntry9.getPath();
        java.nio.file.attribute.FileTime fileTime11 = null;
        tarArchiveEntry9.setCreationTime(fileTime11);
        java.nio.file.attribute.FileTime fileTime13 = tarArchiveEntry9.getLastModifiedTime();
        tarArchiveEntry9.setNames(" \000", "UTF8");
        boolean boolean17 = tarArchiveInputStream3.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry9);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect19 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream20 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) tarArchiveInputStream3, (int) (byte) 1, framedSnappyDialect19);
        byte[] byteArray23 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean25 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray23, 3);
        boolean boolean27 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray23, (int) (byte) 53);
        long long30 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray23, 1, 476);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField31 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField(".bz2", byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = framedSnappyCompressorInputStream20.read(byteArray23, 84446, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNull(path10);
        org.junit.Assert.assertNotNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + framedSnappyDialect19 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect19.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.METHOD_ATTRIBUTE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.method.attribute." + "'", str0, "pack.method.attribute.");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        boolean boolean5 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray1, (int) (byte) 53);
        boolean boolean7 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray1, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(255);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withMaxMemoryLimitInKb(26128);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        byte[] byteArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray2, 1000, 424935705);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 3);
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray9, 3);
        jarArchiveEntry1.setExtra(byteArray9);
        jarArchiveEntry1.setVersionRequired((int) (byte) 4);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("pack200.bz2", "0x7875 Zip Extra Field: UID=1000 GID=1000");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: pack200.bz2");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        tarArchiveEntry2.setNames(" \000", "UTF8");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path13 = tarArchiveEntry12.getPath();
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry12.setCreationTime(fileTime14);
        int int16 = tarArchiveEntry12.getUserId();
        java.util.Date date17 = tarArchiveEntry12.getModTime();
        tarArchiveEntry2.setModTime(date17);
        long long19 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(date17);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNull(path13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(date17);
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Mon Jun 19 23:19:05 CEST 2023");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 133316831452240000L + "'", long19 == 133316831452240000L);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("070702", (byte) 120);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("lz4-framed", "tar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: lz4-framed");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.io.File file0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream2, pack200Strategy5, strMap6);
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream12 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream11);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream11, "snappy-framed");
        tarArchiveOutputStream14.setAddPaxHeadersForNonAsciiNames(false);
        int int17 = tarArchiveOutputStream14.getRecordSize();
        int int18 = tarArchiveOutputStream14.getCount();
        tarArchiveOutputStream14.setBigNumberMode(1);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer21 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap22 = packer21.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream14, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy5, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 512 + "'", int17 == 512);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(packer21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField4 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry3.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField4);
        byte[] byteArray6 = jarArchiveEntry3.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField7 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry3.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField7);
        byte[] byteArray9 = resourceAlignmentExtraField7.getLocalFileDataData();
        int int12 = zipArchiveInputStream1.read(byteArray9, 1000, 493);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

//    @Test
//    public void test0692() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest1.test0692");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile3.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        jarArchiveEntry1.setRawFlag(0);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        long long0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier3.get();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor6 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(511, scatterGatherBackingStore5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.SEVEN_Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "7z" + "'", str0, "7z");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 476);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData7 = jarArchiveEntry6.getUnparseableExtraFieldData();
        boolean boolean8 = jarArchiveEntry6.isStreamContiguous();
        long long9 = jarArchiveEntry6.getDataOffset();
        boolean boolean10 = jarArchiveEntry6.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS11 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = x000A_NTFS11.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream16 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream14, strMap15);
        byte[] byteArray17 = new byte[] {};
        pack200CompressorOutputStream16.write(byteArray17);
        x000A_NTFS11.parseFromCentralDirectoryData(byteArray17, 64, 0);
        jarArchiveEntry6.setCentralDirectoryExtra(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray17, (int) (byte) 77, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = jarArchiveEntry2.getUnparseableExtraFieldData();
        jarArchiveEntry2.setCompressedSize((long) 64);
        int int6 = jarArchiveEntry2.getRawFlag();
        jarArchiveEntry2.setExternalAttributes((long) (byte) 51);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean12 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray10, 3);
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 3);
        jarArchiveEntry2.setExtra(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (short) 100, byteArray10, (int) '#', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("\000\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\000\000.xz" + "'", str1, "\000\000.xz");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = null;
        java.nio.file.Path path11 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile10, path11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.compress.compressors.CompressorException compressorException1 = new org.apache.commons.compress.compressors.CompressorException("");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        long long7 = tarArchiveEntry2.getRealSize();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        java.nio.file.attribute.FileTime fileTime13 = null;
        tarArchiveEntry11.setCreationTime(fileTime13);
        int int15 = tarArchiveEntry11.getUserId();
        java.util.Date date16 = tarArchiveEntry11.getModTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path20 = tarArchiveEntry19.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path24 = tarArchiveEntry23.getPath();
        java.nio.file.attribute.FileTime fileTime25 = null;
        tarArchiveEntry23.setCreationTime(fileTime25);
        java.nio.file.attribute.FileTime fileTime27 = tarArchiveEntry23.getLastModifiedTime();
        tarArchiveEntry19.setLastAccessTime(fileTime27);
        tarArchiveEntry11.setModTime(fileTime27);
        boolean boolean30 = tarArchiveEntry2.equals(tarArchiveEntry11);
        java.lang.String str31 = tarArchiveEntry11.getGroupName();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray32 = tarArchiveEntry11.getDirectoryEntries();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:19:06 CEST 2023");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:19:06 CEST 2023");
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(tarArchiveEntryArray32);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "arj");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = jarArchiveEntry5.getUnparseableExtraFieldData();
        boolean boolean7 = jarArchiveEntry5.isStreamContiguous();
        long long8 = jarArchiveEntry5.getDataOffset();
        boolean boolean9 = jarArchiveEntry5.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS10 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = x000A_NTFS10.getModifyTime();
        java.util.Date date12 = x000A_NTFS10.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path16 = tarArchiveEntry15.getPath();
        java.nio.file.attribute.FileTime fileTime17 = null;
        tarArchiveEntry15.setCreationTime(fileTime17);
        int int19 = tarArchiveEntry15.getUserId();
        java.util.Date date20 = tarArchiveEntry15.getModTime();
        x000A_NTFS10.setCreateJavaTime(date20);
        java.util.Date date22 = x000A_NTFS10.getCreateJavaTime();
        jarArchiveEntry5.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS10);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.jar.JarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNull(date12);
        org.junit.Assert.assertNull(path16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon Jun 19 23:19:06 CEST 2023");
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Jun 19 23:19:06 CEST 2023");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        tarArchiveEntry1.setNames("ustar\000", "");
        java.lang.String str7 = tarArchiveEntry1.getExtraPaxHeader("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
        long long8 = tarArchiveEntry1.getLongUserId();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.setEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Unpacker.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = zip64ExtendedInformationExtraField0.getDiskStartNumber();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray8 = zipLong7.getBytes();
        boolean boolean10 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray8, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray8, (int) (byte) 2, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore1);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream3 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter4 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor2);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker6 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray7 = jarMarker6.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile5.write(byteArray7, (int) (byte) 77, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(jarMarker6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding5 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        boolean boolean7 = zipEncoding5.canEncode("a\000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray2, zipEncoding5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1020L + "'", long3 == 1020L);
        org.junit.Assert.assertNotNull(zipEncoding5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) pack200CompressorInputStream6, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.compress.compressors.CompressorException compressorException1 = new org.apache.commons.compress.compressors.CompressorException("tar");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = tarArchiveInputStream8.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream8);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path15 = tarArchiveEntry14.getPath();
        java.nio.file.attribute.FileTime fileTime16 = null;
        tarArchiveEntry14.setCreationTime(fileTime16);
        java.nio.file.attribute.FileTime fileTime18 = tarArchiveEntry14.getLastModifiedTime();
        tarArchiveEntry14.setNames(" \000", "UTF8");
        boolean boolean22 = tarArchiveInputStream8.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry14);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(tarArchiveEntry9);
        org.junit.Assert.assertNull(path15);
        org.junit.Assert.assertNotNull(fileTime18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "apks");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6, strMap7);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream9 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort10 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray11 = zipShort10.getBytes();
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true);
        gzipCompressorOutputStream9.write(byteArray11);
        closeableConsumer4.accept((java.io.Closeable) gzipCompressorOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ustar ", inputStream2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: InputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
        org.junit.Assert.assertNotNull(zipShort10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 3, "ustar\000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        boolean boolean4 = jarArchiveEntry1.equals((java.lang.Object) unicodeExtraFieldPolicy3);
        jarArchiveEntry1.setTime(1687209510L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator8 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray6, 67324752, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0]");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cpioArchiveInputStream7.read(byteArray9, (-1), 464);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = tarArchiveInputStream4.read(byteArray6, 26128, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0]");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream6 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: The stream is closed");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLength();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        java.lang.String str8 = zipArchiveOutputStream7.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean12 = arArchiveEntry2.equals((java.lang.Object) zipArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, 4096, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Tar record size must always be 512 bytes. Attempt to set size of 155");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209548L + "'", long3 == 1687209548L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long6 = zipLong5.getValue();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        java.util.Date date8 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS9 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = x000A_NTFS9.getModifyTime();
        java.lang.String str11 = zipEightByteInteger10.toString();
        byte[] byteArray12 = zipEightByteInteger10.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray12, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: X5455_ExtendedTimestamp too short, only 0 bytes");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33639248L + "'", long6 == 33639248L);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZipEightByteInteger value: 0" + "'", str11, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int0 = org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.LONGFILE_BSD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream7, strMap8);
        byte[] byteArray10 = new byte[] {};
        pack200CompressorOutputStream9.write(byteArray10);
        int int14 = zipArchiveInputStream1.read(byteArray10, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, unparseableExtraField16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.lang.String str4 = tarArchiveEntry2.getName();
        boolean boolean5 = tarArchiveEntry2.isFile();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = x5455_ExtendedTimestamp6.getAccessTime();
        byte[] byteArray8 = x5455_ExtendedTimestamp6.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        java.nio.file.attribute.FileTime fileTime13 = null;
        tarArchiveEntry11.setCreationTime(fileTime13);
        java.nio.file.attribute.FileTime fileTime15 = tarArchiveEntry11.getLastModifiedTime();
        x5455_ExtendedTimestamp6.setAccessFileTime(fileTime15);
        tarArchiveEntry2.setLastModifiedTime(fileTime15);
        java.lang.String str18 = tarArchiveEntry2.getUserName();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deflate64" + "'", str4, "deflate64");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0]");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream5, (int) (byte) 100);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer9 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap10 = packer9.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream8, (java.util.Map<java.lang.String, java.lang.String>) strMap10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream13 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) cpioArchiveInputStream8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(packer9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        short short6 = cpioArchiveEntry2.getFormat();
        long long7 = cpioArchiveEntry2.getDeviceMaj();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder11 = builder9.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder13 = builder11.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters14 = builder13.build();
        int int15 = parameters14.getLazyMatchingThreshold();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream16 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (long) (byte) 75, parameters14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(parameters14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil3 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap1, ".lzma");
        java.lang.String str5 = fileNameUtil3.getUncompressedFilename("TRAILER!!!");
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "TRAILER!!!" + "'", str5, "TRAILER!!!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_TRUNCATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray12 = zipLong11.getBytes();
        boolean boolean14 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray12, 32768);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = brotliCompressorInputStream3.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("br", seekableByteChannel2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: br");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        tarArchiveEntry1.setGroupId((long) (short) 2);
        tarArchiveEntry1.setUserId(0);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime((long) 156);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 312764696000L + "'", long1 == 312764696000L);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream6 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.io.File file0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream2, pack200Strategy5, strMap6);
        int int8 = pack200CompressorInputStream7.read();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy14 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream15 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream13, pack200Strategy14);
        java.nio.channels.SeekableByteChannel seekableByteChannel16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream19 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream17, strMap18);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream20 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream19);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer21 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap22 = packer21.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream20, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream7, pack200Strategy14, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry25 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry25.setGroupId(0);
        java.lang.String str28 = dumpArchiveEntry25.getSimpleName();
        boolean boolean29 = dumpArchiveEntry25.isDirectory();
        java.io.InputStream inputStream30 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream30);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream33 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream31, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy34 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream36 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream31, pack200Strategy34, strMap35);
        int int37 = pack200CompressorInputStream36.read();
        java.io.InputStream inputStream38 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream39 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream38);
        zipArchiveInputStream39.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream42 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream39);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy43 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream44 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream42, pack200Strategy43);
        java.nio.channels.SeekableByteChannel seekableByteChannel45 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel45);
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream48 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream46, strMap47);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream49 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream48);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer50 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap51 = packer50.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream52 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream49, (java.util.Map<java.lang.String, java.lang.String>) strMap51);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream53 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream36, pack200Strategy43, (java.util.Map<java.lang.String, java.lang.String>) strMap51);
        boolean boolean54 = dumpArchiveEntry25.equals((java.lang.Object) strMap51);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream55 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy14, (java.util.Map<java.lang.String, java.lang.String>) strMap51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 80 + "'", int8 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy14);
        org.junit.Assert.assertNotNull(packer21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(pack200Strategy34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 80 + "'", int37 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy43);
        org.junit.Assert.assertNotNull(packer50);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        int int7 = deflateCompressorInputStream5.available();
        int int8 = deflateCompressorInputStream5.getCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) deflateCompressorInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = deflateCompressorInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISNWK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 36864 + "'", int0 == 36864);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.nio.file.Path path0 = null;
        java.nio.file.Path[] pathArray1 = new java.nio.file.Path[] { path0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forPaths(pathArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pathArray1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long1 = zipLong0.getValue();
        java.lang.String str2 = zipLong0.toString();
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 33639248L + "'", long1 == 33639248L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipLong value: 33639248" + "'", str2, "ZipLong value: 33639248");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        byte[] byteArray3 = jarArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField4 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        unrecognizedExtraField4.setHeaderId(zipShort5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = unrecognizedExtraField4.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong9 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray10 = zipLong9.getBytes();
        boolean boolean12 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray10, 32768);
        boolean boolean14 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 0);
        unrecognizedExtraField4.setCentralDirectoryData(byteArray10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = unrecognizedExtraField4.getLocalFileDataLength();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort16);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipShort16);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.util.Date date2 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry5.setCreationTime(fileTime7);
        int int9 = tarArchiveEntry5.getUserId();
        java.util.Date date10 = tarArchiveEntry5.getModTime();
        x000A_NTFS0.setCreateJavaTime(date10);
        java.util.Date date12 = x000A_NTFS0.getCreateJavaTime();
        long long13 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(date12);
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Jun 19 23:19:09 CEST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Jun 19 23:19:09 CEST 2023");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 133316831493050000L + "'", long13 == 133316831493050000L);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        org.junit.Assert.assertNotNull(zipLong0);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 'a');
        int int10 = cpioArchiveEntry6.getAlignmentBoundary();
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        cpioArchiveEntry6.setDeviceMin((long) 26128);
        boolean boolean14 = cpioArchiveEntry6.isSocket();
        int int15 = cpioArchiveEntry6.getAlignmentBoundary();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_ASCII;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 4 + "'", short0 == (short) 4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "0x7875 Zip Extra Field: UID=1000 GID=1000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        long long6 = zipArchiveInputStream1.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 0, (int) (byte) 50);
        tarArchiveInputStream9.mark(511);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy12 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream9, pack200Strategy12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = jarArchiveEntry2.getUnparseableExtraFieldData();
        boolean boolean4 = jarArchiveEntry2.isStreamContiguous();
        long long5 = jarArchiveEntry2.getDataOffset();
        boolean boolean6 = jarArchiveEntry2.isUnixSymlink();
        byte[] byteArray7 = jarArchiveEntry2.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException8 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(zipMethod0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        boolean boolean7 = tarArchiveEntry2.isSparse();
        long long8 = tarArchiveEntry2.getLongGroupId();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        long long3 = cpioArchiveEntry2.getMode();
        cpioArchiveEntry2.setChksum(1L);
        long long6 = cpioArchiveEntry2.getChksum();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32768L + "'", long3 == 32768L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 488);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry7 = arArchiveInputStream6.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        java.util.jar.JarFile jarFile2 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, strMap5);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarFile2, (java.io.OutputStream) zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        byte[] byteArray6 = new byte[] {};
        pack200CompressorOutputStream5.write(byteArray6);
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray6, 64, 0);
        java.nio.file.attribute.FileTime fileTime11 = x000A_NTFS0.getAccessFileTime();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore4 = defaultBackingStoreSupplier2.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore6 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor7 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore6);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream8 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore5, streamCompressor7);
        long long9 = streamCompressor7.getTotalBytesWritten();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream10 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore4, streamCompressor7);
        long long11 = streamCompressor7.getCrc32();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore4);
        org.junit.Assert.assertNotNull(streamCompressor7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray3, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior7 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray3, false, extraFieldParsingBehavior7);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray3, 32768);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLength();
        int int6 = arArchiveEntry2.getGroupId();
        long long7 = arArchiveEntry2.getSize();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209550L + "'", long3 == 1687209550L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 'a');
        int int10 = cpioArchiveEntry6.getAlignmentBoundary();
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        cpioArchiveEntry6.setDeviceMin((long) 26128);
        boolean boolean14 = cpioArchiveEntry6.isSocket();
        cpioArchiveEntry6.setRemoteDeviceMaj(0L);
        long long17 = cpioArchiveEntry6.getInode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int0 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.UFT8_NAMES_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.compress.MemoryLimitException memoryLimitException2 = new org.apache.commons.compress.MemoryLimitException((long) 7, 11);
        java.lang.String str3 = memoryLimitException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit." + "'", str3, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        int int4 = framedSnappyCompressorInputStream3.available();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS5 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = x000A_NTFS5.getModifyTime();
        java.util.Date date7 = x000A_NTFS5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = x000A_NTFS5.getModifyTime();
        byte[] byteArray9 = x000A_NTFS5.getCentralDirectoryData();
        int int12 = framedSnappyCompressorInputStream3.read(byteArray9, 3, 0);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField13 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean19 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray17, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17, false, extraFieldParsingBehavior21);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 32768);
        unrecognizedExtraField13.setLocalFileDataData(byteArray17);
        byte[] byteArray26 = unrecognizedExtraField13.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            int int29 = framedSnappyCompressorInputStream3.read(byteArray26, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1, 1]");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long6 = zipLong5.getValue();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.Object obj9 = zipShort8.clone();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33639248L + "'", long6 == 33639248L);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "ZipShort value: 5");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "ZipShort value: 5");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "keep", false, true);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        long long1 = zipEightByteInteger0.getLongValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1, inputStreamSupplier3);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = jarArchiveEntry1.getExtraFields();
        java.nio.file.attribute.FileTime fileTime6 = jarArchiveEntry1.getLastModifiedTime();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm7 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN;
        boolean boolean8 = jarArchiveEntry1.equals((java.lang.Object) encryptionAlgorithm7);
        long long9 = jarArchiveEntry1.getTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm7 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN + "'", encryptionAlgorithm7.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.UNKNOWN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DIR_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(3);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        int int7 = deflateCompressorInputStream5.available();
        long long8 = deflateCompressorInputStream5.getCompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = deflateCompressorInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, 420, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream9 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters1 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        java.lang.String str2 = parameters1.toString();
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false" + "'", str2, "LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray2, (int) 'a', 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 33, 0]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(80);
        org.junit.Assert.assertNull(hashAlgorithm1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((int) (byte) 120);
        boolean boolean3 = dumpArchiveEntry0.isDeleted();
        java.util.Date date4 = dumpArchiveEntry0.getCreationTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getNlink();
        dumpArchiveEntry0.setMode((-1));
        int int4 = dumpArchiveEntry0.getGeneration();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str1 = x000A_NTFS0.toString();
        java.lang.String str2 = x000A_NTFS0.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = x000A_NTFS0.getCreateTime();
        java.math.BigInteger bigInteger5 = zipEightByteInteger4.getValue();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str1, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0, "snappy-framed");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("", (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream3.setUseZip64(zip64Mode4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy12 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream9, pack200Strategy12, strMap13);
        long long15 = pack200CompressorInputStream14.getBytesRead();
        long long17 = pack200CompressorInputStream14.skip(1687209505L);
        int int18 = pack200CompressorInputStream14.available();
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 3);
        boolean boolean24 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray20, (int) (short) 2);
        int int25 = pack200CompressorInputStream14.read(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry7, (java.io.InputStream) pack200CompressorInputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(pack200Strategy12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 29L + "'", long17 == 29L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMin((long) 12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path9 = tarArchiveEntry8.getPath();
        java.nio.file.attribute.FileTime fileTime10 = null;
        tarArchiveEntry8.setCreationTime(fileTime10);
        java.nio.file.attribute.FileTime fileTime12 = tarArchiveEntry8.getLastModifiedTime();
        cpioArchiveEntry2.setTime(fileTime12);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = cpioArchiveEntry2.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNull(path9);
        org.junit.Assert.assertNotNull(fileTime12);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "a\000", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry4.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField5);
        byte[] byteArray7 = jarArchiveEntry4.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95, 2, 0, 0, 0]");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUMLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.io.File file0 = null;
        java.io.File[] fileArray1 = new java.io.File[] { file0 };
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forFiles(fileArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray1);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField13 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry12.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField13);
        byte[] byteArray15 = jarArchiveEntry12.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField16 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry12.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField16);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long20 = jarArchiveEntry19.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource21 = jarArchiveEntry19.getCommentSource();
        jarArchiveEntry12.setCommentSource(commentSource21);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Padding must not be negative, was: -45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + commentSource21 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource21.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray5 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "pass", charArray5);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a,  ]");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find((int) (short) 3);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.deleteDir("hi!");
        changeSet0.delete("ZipShort value: 25461");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry5 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry5.setGroupId(0);
        java.lang.String str8 = dumpArchiveEntry5.getSimpleName();
        boolean boolean9 = dumpArchiveEntry5.isDirectory();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy14 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream16 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream11, pack200Strategy14, strMap15);
        int int17 = pack200CompressorInputStream16.read();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream18);
        zipArchiveInputStream19.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream19);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy23 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream22, pack200Strategy23);
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel25);
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream28 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream26, strMap27);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream29 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream28);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer30 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap31 = packer30.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream32 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream29, (java.util.Map<java.lang.String, java.lang.String>) strMap31);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream33 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream16, pack200Strategy23, (java.util.Map<java.lang.String, java.lang.String>) strMap31);
        boolean boolean34 = dumpArchiveEntry5.equals((java.lang.Object) strMap31);
        java.io.InputStream inputStream35 = null;
        // The following exception was thrown during execution in test generation
        try {
            changeSet0.add((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry5, inputStream35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(pack200Strategy14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 80 + "'", int17 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy23);
        org.junit.Assert.assertNotNull(packer30);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.LINK_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40960 + "'", int0 == 40960);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        long long6 = zipArchiveInputStream1.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 0, (int) (byte) 50);
        tarArchiveInputStream9.mark(511);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream14 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = tarArchiveInputStream15.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream17 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream15);
        int int18 = deflateCompressorInputStream17.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream17, (int) (byte) 100);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer21 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap22 = packer21.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream20, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream9, (java.util.Map<java.lang.String, java.lang.String>) strMap22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(packer21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        long long4 = arArchiveEntry2.getLength();
        java.util.Date date5 = arArchiveEntry2.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date5);
        java.lang.Object obj7 = zipLong6.clone();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209552L + "'", long3 == 1687209552L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Jun 19 23:19:12 CEST 2023");
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "ZipLong value: 1456716390");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "ZipLong value: 1456716390");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "ZipLong value: 1456716390");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        long long7 = tarArchiveEntry2.getRealSize();
        java.util.Date date8 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean9 = tarArchiveEntry2.isLink();
        java.lang.String str10 = tarArchiveEntry2.getName();
        tarArchiveEntry2.setSize((long) 128);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:19:12 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "deflate64" + "'", str10, "deflate64");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.compress.compressors.xz.XZUtils.setCacheXZAvailablity(true);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "pack.code.attribute..lzma", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream2 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream(inputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "tar.bz2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.LZMA;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lzma" + "'", str0, "lzma");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveInputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename("error");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error.bz2" + "'", str1, "error.bz2");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        byte[] byteArray4 = new byte[] {};
        pack200CompressorOutputStream3.write(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray4, 511);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream4.createArchiveEntry(file5, "pack.code.attribute.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        boolean boolean13 = tarArchiveEntry11.isCheckSumOK();
        tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry11);
        tarArchiveOutputStream6.flush();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive contains unclosed entries.");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        long long3 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 0.  Block length of 65535 bytes exceeds remaining data of 0 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1020L + "'", long3 == 1020L);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        boolean boolean6 = cpioArchiveEntry2.isBlockDevice();
        cpioArchiveEntry2.setMode((long) 16877);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setDevice(1687209548L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile10.write(64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.Exception exception2 = null;
        org.apache.commons.compress.MemoryLimitException memoryLimitException3 = new org.apache.commons.compress.MemoryLimitException((long) 257, (int) (short) 2, exception2);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_ZERO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "0\000" + "'", str0, "0\000");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet2 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream5, strMap6);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream8 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream7);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream7, "snappy-framed");
        tarArchiveOutputStream10.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream14 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream10, "deflate64");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream15 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) jarArchiveOutputStream14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_0 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        long long1 = xXHash32_0.getValue();
        xXHash32_0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46947589L + "'", long1 == 46947589L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find(64);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = null;
        unrecognizedExtraField0.setHeaderId(zipShort1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        boolean boolean8 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray6, 32768);
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 0);
        unrecognizedExtraField0.setCentralDirectoryData(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("ZipEightByteInteger value: 0", (long) 345, 26128, 504, (int) (short) -1, (long) 1024);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize4 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder8 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder10 = builder8.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder12 = builder10.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters13 = builder12.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters14 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize4, true, false, false, parameters13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream15 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (long) (byte) 88, parameters13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + blockSize4 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize4.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(parameters13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("ZipShort value: 25461");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 25461");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream6 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime(1687209497L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1902610130000L + "'", long1 == 1902610130000L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date9 = cpioArchiveEntry8.getLastModifiedDate();
        cpioArchiveEntry8.setRemoteDeviceMin((long) 12);
        boolean boolean12 = zipArchiveOutputStream3.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
        long long13 = zipArchiveOutputStream3.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters14 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters14.setWithZlibHeader(false);
        int int17 = deflateParameters14.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream18 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, deflateParameters14);
        java.io.File file19 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer20 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream22, strMap23);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream25 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream24);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray27 = zipShort26.getBytes();
        boolean boolean29 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray27, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray31 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray27, true);
        gzipCompressorOutputStream25.write(byteArray27);
        closeableConsumer20.accept((java.io.Closeable) gzipCompressorOutputStream25);
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("\000\000.xz", (java.io.OutputStream) deflateCompressorOutputStream18, file19, closeableConsumer20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ??.xz not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(closeableConsumer20);
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray31);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream18.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean12 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray10, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, extraFieldParsingBehavior14);
        boolean boolean17 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, 508);
        int int20 = jarArchiveInputStream4.read(byteArray10, (int) (byte) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream21 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) jarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream12);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect14 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream15 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream12, framedSnappyDialect14);
        int int16 = framedSnappyCompressorInputStream15.available();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS17 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = x000A_NTFS17.getModifyTime();
        java.util.Date date19 = x000A_NTFS17.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger20 = x000A_NTFS17.getModifyTime();
        byte[] byteArray21 = x000A_NTFS17.getCentralDirectoryData();
        int int24 = framedSnappyCompressorInputStream15.read(byteArray21, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "zip", byteArray21);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertTrue("'" + framedSnappyDialect14 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect14.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(zipEightByteInteger18);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipEightByteInteger20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long6 = zipLong5.getValue();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong5);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray8 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        boolean boolean12 = x5455_ExtendedTimestamp0.equals((java.lang.Object) seekableByteChannel9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        long long14 = zipLong13.getValue();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 33639248L + "'", long6 == 33639248L);
        org.junit.Assert.assertNotNull(seekableByteChannelArray8);
        org.junit.Assert.assertNotNull(seekableByteChannel9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipLong13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 33639248L + "'", long14 == 33639248L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray6 = zipShort5.getBytes();
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, true);
        gzipCompressorOutputStream4.write(byteArray6);
        gzipCompressorOutputStream4.finish();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding14 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 3);
        java.lang.String str19 = zipEncoding14.decode(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream4.write(byteArray16, (int) (byte) 10, 263);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write more data, the end of the compressed data stream has been reached");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertNotNull(zipEncoding14);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a\000" + "'", str19, "a\000");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer5 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap6 = packer5.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, (java.util.Map<java.lang.String, java.lang.String>) strMap6);
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker8 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray9 = jarMarker8.getLocalFileDataData();
        byte[] byteArray10 = jarMarker8.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream7.write(byteArray10, (int) (byte) 83, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IRUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(zipShort1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        byte[] byteArray4 = jarArchiveEntry1.getCentralDirectoryExtra();
        long long5 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit7 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray4, 464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 464");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 172318L + "'", long5 == 172318L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.WAVPACK));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_OLD_ASCII;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070707" + "'", str0, "070707");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("deflate64");
        int int2 = cpioArchiveEntry1.getAlignmentBoundary();
        cpioArchiveEntry1.setName(".bz2");
        int int5 = cpioArchiveEntry1.getAlignmentBoundary();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        tarArchiveEntry2.setNames(" \000", "UTF8");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray10 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField7 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry6.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField7);
        byte[] byteArray9 = jarArchiveEntry6.getCentralDirectoryExtra();
        gzipCompressorOutputStream4.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, (int) (byte) -1, 26128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[30, -95, 2, 0, 0, 0]");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(21, true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Padding must not be negative, was: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.deleteDir("hi!");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry4.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField5);
        java.nio.file.attribute.FileTime fileTime7 = jarArchiveEntry4.getLastAccessTime();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = jarArchiveInputStream12.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry14 = jarArchiveInputStream12.getNextEntry();
        changeSet0.add((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry4, (java.io.InputStream) jarArchiveInputStream12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream16 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) jarArchiveInputStream12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertNull(archiveEntry13);
        org.junit.Assert.assertNull(archiveEntry14);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray4 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel5);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray8 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel9);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray12 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray12);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel13);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel13);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray16 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel1, seekableByteChannel5, seekableByteChannel9, seekableByteChannel13 };
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel18 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forOrderedSeekableByteChannels(seekableByteChannelArray16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The first ZIP split segment does not begin with split ZIP file signature");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray4);
        org.junit.Assert.assertNotNull(seekableByteChannel5);
        org.junit.Assert.assertNotNull(seekableByteChannelArray8);
        org.junit.Assert.assertNotNull(seekableByteChannel9);
        org.junit.Assert.assertNotNull(seekableByteChannelArray12);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(seekableByteChannelArray16);
        org.junit.Assert.assertNotNull(seekableByteChannel17);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray4 = zipLong3.getBytes();
        x5455_ExtendedTimestamp1.setModifyTime(zipLong3);
        boolean boolean6 = x5455_ExtendedTimestamp1.isBit2_createTimePresent();
        byte[] byteArray7 = x5455_ExtendedTimestamp1.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray0, (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA256;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA256 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA256));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        byte[] byteArray2 = jarMarker0.getCentralDirectoryData();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 3);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray4, (int) (byte) 53);
        long long11 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray4, 1, 476);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 16877);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray4, 8, (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        byte byte1 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte((int) (short) 1);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 1 + "'", byte1 == (byte) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray1 = zipShort0.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray1, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 162");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[30, -95]");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        java.nio.file.attribute.FileTime fileTime4 = jarArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime5 = jarArchiveEntry1.getLastAccessTime();
        long long6 = jarArchiveEntry1.getDataOffset();
        long long7 = jarArchiveEntry1.getDataOffset();
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(fileTime5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 'a');
        int int10 = cpioArchiveEntry6.getAlignmentBoundary();
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        zipArchiveOutputStream1.setComment("pack.code.attribute.");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream15 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        java.lang.String str1 = zipShort0.toString();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZipShort value: 25461" + "'", str1, "ZipShort value: 25461");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path7 = tarArchiveEntry6.getPath();
        java.nio.file.attribute.FileTime fileTime8 = null;
        tarArchiveEntry6.setCreationTime(fileTime8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry6.getLastModifiedTime();
        tarArchiveEntry2.setLastAccessTime(fileTime10);
        boolean boolean12 = tarArchiveEntry2.isGNULongLinkEntry();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry13 = sevenZOutputFile10.createArchiveEntry(file11, "pack.code.attribute.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.write(511);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream19 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry21 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField22 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry21.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField22);
        byte[] byteArray24 = jarArchiveEntry21.getCentralDirectoryExtra();
        long long25 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            blockLZ4CompressorOutputStream19.write(byteArray24, 4095, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 172318L + "'", long25 == 172318L);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream9 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream7, strMap8);
        byte[] byteArray10 = new byte[] {};
        pack200CompressorOutputStream9.write(byteArray10);
        int int14 = zipArchiveInputStream1.read(byteArray10, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, unparseableExtraField16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray17);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray18, 131, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Length 1 must be at least 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("apkm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apkm.xz" + "'", str1, "apkm.xz");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        int int1 = asiExtraField0.getMode();
        boolean boolean2 = asiExtraField0.isDirectory();
        asiExtraField0.setLinkedFile("error");
        asiExtraField0.setLinkedFile("pack.effort");
        java.lang.Object obj7 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = asiExtraField0.getHeaderId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_LINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 49 + "'", byte0 == (byte) 49);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        long long2 = x0017_StrongEncryptionHeader0.getRecordCount();
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray3, 10, 16877);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer6 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap7 = packer6.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5, (java.util.Map<java.lang.String, java.lang.String>) strMap7);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField9 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField10 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean16 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray14, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior18 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray14, false, extraFieldParsingBehavior18);
        boolean boolean21 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray14, 32768);
        unrecognizedExtraField10.setLocalFileDataData(byteArray14);
        unrecognizedExtraField9.setCentralDirectoryData(byteArray14);
        pack200CompressorOutputStream8.write(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) (byte) 75, byteArray14, 67324752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67324752");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, 3);
        boolean boolean6 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray2, (int) (byte) 53);
        long long9 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray2, 1, 476);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField(".bz2", byteArray2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = unicodePathExtraField10.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(zipShort11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize17 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters21 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize17, true, true, false);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters22 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream23 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, parameters22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + blockSize17 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize17.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        byte[] byteArray6 = new byte[] {};
        pack200CompressorOutputStream5.write(byteArray6);
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray6, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort11 = x000A_NTFS0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp13 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong14 = x5455_ExtendedTimestamp13.getAccessTime();
        byte[] byteArray15 = x5455_ExtendedTimestamp13.getCentralDirectoryData();
        boolean boolean17 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray15, 77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS0, byteArray15, (int) (byte) 0, 8, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type a");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNull(zipLong14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils extraFieldUtils0 = new org.apache.commons.compress.archivers.zip.ExtraFieldUtils();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, 1687209550L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.file.Path path12 = null;
        java.nio.file.LinkOption linkOption14 = null;
        java.nio.file.LinkOption[] linkOptionArray15 = new java.nio.file.LinkOption[] { linkOption14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry16 = sevenZOutputFile11.createArchiveEntry(path12, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ", linkOptionArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(linkOptionArray15);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField13 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry12.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField13);
        java.nio.file.attribute.FileTime fileTime15 = jarArchiveEntry12.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime16 = jarArchiveEntry12.getLastAccessTime();
        long long17 = jarArchiveEntry12.getDataOffset();
        boolean boolean18 = tarArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry12);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = tarArchiveOutputStream6.createArchiveEntry(file19, "0\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SIZELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        bZip2CompressorOutputStream5.finish();
        // The following exception was thrown during execution in test generation
        try {
            bZip2CompressorOutputStream5.write(4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray2 = jarMarker1.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry9 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int10 = dumpArchiveEntry9.getNlink();
        long long11 = dumpArchiveEntry9.getOffset();
        boolean boolean12 = dumpArchiveEntry9.isFile();
        java.lang.String str13 = dumpArchiveEntry9.toString();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) dumpArchiveEntry9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.dump.DumpArchiveEntry cannot be cast to org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS6 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = x000A_NTFS6.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        byte[] byteArray12 = new byte[] {};
        pack200CompressorOutputStream11.write(byteArray12);
        x000A_NTFS6.parseFromCentralDirectoryData(byteArray12, 64, 0);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray12, 36864, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36864");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray7 = zipShort6.getBytes();
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true);
        gzipCompressorOutputStream5.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(464, byteArray7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, 4095);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = cpioArchiveInputStream7.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_OLD_BINARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 29127 + "'", int0 == 29127);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker1 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray2 = jarMarker1.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2, false, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray2, (int) (byte) 77, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100=144 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("jar", (byte) 48);
        long long3 = tarArchiveEntry2.getRealSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        tarArchiveEntry2.setMode((int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        java.nio.file.attribute.FileTime fileTime13 = null;
        tarArchiveEntry11.setCreationTime(fileTime13);
        int int15 = tarArchiveEntry11.getUserId();
        java.util.Date date16 = tarArchiveEntry11.getModTime();
        tarArchiveEntry2.setModTime(date16);
        boolean boolean18 = tarArchiveEntry2.isBlockDevice();
        java.lang.String str19 = tarArchiveEntry2.getLinkName();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:19:21 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream3.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray7 = zipShort6.getBytes();
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true);
        gzipCompressorOutputStream5.write(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = unparseableExtraField0.onUnparseableExtraField(byteArray7, 255, 7, true, 424935705);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 255.  Block length of 424935705 bytes exceeds remaining data of 3 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        boolean boolean4 = jarArchiveEntry1.equals((java.lang.Object) unicodeExtraFieldPolicy3);
        jarArchiveEntry1.setTime(1687209510L);
        int int7 = jarArchiveEntry1.getVersionMadeBy();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray9 = zipShort8.getBytes();
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, true);
        jarArchiveEntry1.setExtraFields(zipExtraFieldArray13);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        long long11 = tarArchiveEntry7.getSize();
        java.io.InputStream inputStream12 = tarFile4.getInputStream(tarArchiveEntry7);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile4, path13);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = null;
        java.nio.file.Path path16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile15, path16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.write(511);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream19 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS20 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = x000A_NTFS20.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream23, strMap24);
        byte[] byteArray26 = new byte[] {};
        pack200CompressorOutputStream25.write(byteArray26);
        x000A_NTFS20.parseFromCentralDirectoryData(byteArray26, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort31 = x000A_NTFS20.getHeaderId();
        byte[] byteArray32 = zipShort31.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            deflateCompressorOutputStream16.write(byteArray32, 4095, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(zipShort31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 0]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer7 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap8 = packer7.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream6, (java.util.Map<java.lang.String, java.lang.String>) strMap8);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField10 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField11 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean17 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray15, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior19 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray20 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, false, extraFieldParsingBehavior19);
        boolean boolean22 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 32768);
        unrecognizedExtraField11.setLocalFileDataData(byteArray15);
        unrecognizedExtraField10.setCentralDirectoryData(byteArray15);
        pack200CompressorOutputStream9.write(byteArray15);
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("pass", (java.io.OutputStream) pack200CompressorOutputStream9, file26);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: pass not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore5 = defaultBackingStoreSupplier3.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore6 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore7 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor8 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore7);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream9 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore6, streamCompressor8);
        long long10 = streamCompressor8.getTotalBytesWritten();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream11 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore5, streamCompressor8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor12 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(76, scatterGatherBackingStore5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore5);
        org.junit.Assert.assertNotNull(streamCompressor8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS2 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 3);
        x000A_NTFS2.parseFromLocalFileData(byteArray4, 8, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            unparseableExtraFieldData0.parseFromCentralDirectoryData(byteArray4, 493, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile unknown archive");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setCommentSource(commentSource8);
        jarArchiveEntry1.setTime((long) 16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path15 = tarArchiveEntry14.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path19 = tarArchiveEntry18.getPath();
        java.nio.file.attribute.FileTime fileTime20 = null;
        tarArchiveEntry18.setCreationTime(fileTime20);
        java.nio.file.attribute.FileTime fileTime22 = tarArchiveEntry18.getLastModifiedTime();
        tarArchiveEntry14.setLastAccessTime(fileTime22);
        boolean boolean24 = tarArchiveEntry14.isGNULongNameEntry();
        java.nio.file.attribute.FileTime fileTime25 = tarArchiveEntry14.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry26 = jarArchiveEntry1.setLastAccessTime(fileTime25);
        java.nio.file.attribute.FileTime fileTime27 = jarArchiveEntry1.getLastAccessTime();
        long long28 = jarArchiveEntry1.getTime();
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + commentSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD + "'", commentSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(path15);
        org.junit.Assert.assertNull(path19);
        org.junit.Assert.assertNotNull(fileTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fileTime25);
        org.junit.Assert.assertNotNull(zipEntry26);
        org.junit.Assert.assertEquals(zipEntry26.toString(), "bzip2");
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 16L + "'", long28 == 16L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        boolean boolean4 = tarArchiveEntry2.isGlobalPaxHeader();
        tarArchiveEntry2.setNames("pass", "\000\000.xz");
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        gzipCompressorOutputStream4.flush();
        gzipCompressorOutputStream4.write(464);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize8 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters12 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters13 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, true, true, true, parameters12);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters17 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, true, true, true);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream18 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, parameters17);
        // The following exception was thrown during execution in test generation
        try {
            framedLZ4CompressorOutputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockSize8 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize8.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS15 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = x000A_NTFS15.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream18, strMap19);
        byte[] byteArray21 = new byte[] {};
        pack200CompressorOutputStream20.write(byteArray21);
        x000A_NTFS15.parseFromCentralDirectoryData(byteArray21, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = x000A_NTFS15.getHeaderId();
        byte[] byteArray27 = x000A_NTFS15.getLocalFileDataData();
        unrecognizedExtraField0.setLocalFileDataData(byteArray27);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField29 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        byte[] byteArray30 = resourceAlignmentExtraField29.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray30, (int) (byte) 48, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 48 > 47");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipEightByteInteger16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, 0]");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) framedSnappyCompressorInputStream3, 100, 508);
        long long7 = framedSnappyCompressorInputStream3.getCompressedCount();
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = framedSnappyCompressorInputStream3.read(byteArray8, 512, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, (int) (short) 4, 512, "pass", false);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray9 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        char[] charArray18 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel10, charArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "latest", charArray18);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray9);
        org.junit.Assert.assertNotNull(seekableByteChannel10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream9 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) jarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.util.Date date2 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry5.setCreationTime(fileTime7);
        int int9 = tarArchiveEntry5.getUserId();
        java.util.Date date10 = tarArchiveEntry5.getModTime();
        x000A_NTFS0.setCreateJavaTime(date10);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = x000A_NTFS0.getHeaderId();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        zipArchiveInputStream14.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy18 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream19 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream17, pack200Strategy18);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean25 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray23, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior27 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray23, false, extraFieldParsingBehavior27);
        boolean boolean30 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray23, 508);
        int int33 = jarArchiveInputStream17.read(byteArray23, (int) (byte) -1, 4);
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromCentralDirectoryData(byteArray23, 1024, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1028");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Jun 19 23:19:22 CEST 2023");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(pack200Strategy18);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.write(511);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream19 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            blockLZ4CompressorOutputStream19.write(byteArray21, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 33, 0]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        int int4 = framedSnappyCompressorInputStream3.available();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS5 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = x000A_NTFS5.getModifyTime();
        java.util.Date date7 = x000A_NTFS5.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = x000A_NTFS5.getModifyTime();
        byte[] byteArray9 = x000A_NTFS5.getCentralDirectoryData();
        int int12 = framedSnappyCompressorInputStream3.read(byteArray9, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.io.File file0 = null;
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer1 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap2 = packer1.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil4 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap2, ".lzma");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, (java.util.Map<java.lang.String, java.lang.String>) strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray7 = zipShort6.getBytes();
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true);
        gzipCompressorOutputStream5.write(byteArray7);
        closeableConsumer0.accept((java.io.Closeable) gzipCompressorOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray16 = zipLong15.getBytes();
        boolean boolean18 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray16, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream5.write(byteArray16, 84446, 424935705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        int int10 = tarArchiveOutputStream6.getCount();
        tarArchiveOutputStream6.finish();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray10);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder12 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions13 = builder12.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder15 = builder12.withMaxMemoryLimitInKb(4096);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions16 = builder12.build();
        boolean boolean17 = sevenZFileOptions16.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray10, sevenZFileOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(sevenZFileOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream4 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore1, streamCompressor3);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream5 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter6 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter(scatterZipOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor3);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = resourceAlignmentExtraField1.getCentralDirectoryLength();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.fill((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField1, byteArray4, 49152, 64, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type a11e");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC));
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[35, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        char[] charArray5 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES192));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26121 + "'", int1 == 26121);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        boolean boolean4 = jarArchiveEntry1.equals((java.lang.Object) unicodeExtraFieldPolicy3);
        jarArchiveEntry1.setTime(1687209510L);
        int int7 = jarArchiveEntry1.getVersionMadeBy();
        byte[] byteArray8 = jarArchiveEntry1.getRawName();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = zipArchiveOutputStream1.createArchiveEntry(path3, "pack200", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray2, 32768);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray2, (int) (byte) 51, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        long long9 = pack200CompressorInputStream6.skip(1687209505L);
        boolean boolean10 = pack200CompressorInputStream6.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream12 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) pack200CompressorInputStream6, "bzip2");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream13 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray5 = zipShort4.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = brotliCompressorInputStream3.read(byteArray5, 420, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Buffer overflow: 548 > 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[30, -95]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        boolean boolean1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isCompressedFilename("pack.code.attribute..lzma");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS6 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = x000A_NTFS6.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        byte[] byteArray12 = new byte[] {};
        pack200CompressorOutputStream11.write(byteArray12);
        x000A_NTFS6.parseFromCentralDirectoryData(byteArray12, 64, 0);
        jarArchiveEntry1.setCentralDirectoryExtra(byteArray12);
        byte[] byteArray18 = jarArchiveEntry1.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger19 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CHKSUM_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 148 + "'", int0 == 148);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator3.addArchiveEntry(zipArchiveEntryRequestSupplier4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO));
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) deflateCompressorInputStream5, (int) (byte) 100);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer9 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap10 = packer9.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream8, (java.util.Map<java.lang.String, java.lang.String>) strMap10);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 3);
        java.lang.String str18 = zipEncoding13.decode(byteArray15);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding20 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry((java.util.Map<java.lang.String, java.lang.String>) strMap10, byteArray15, zipEncoding20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(packer9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(zipEncoding13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a\000" + "'", str18, "a\000");
        org.junit.Assert.assertNotNull(zipEncoding20);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.String str1 = x7875_NewUnix0.toString();
        byte[] byteArray2 = x7875_NewUnix0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray2, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str1, "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        long long13 = zipArchiveInputStream9.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream17 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream15, strMap16);
        byte[] byteArray18 = new byte[] {};
        pack200CompressorOutputStream17.write(byteArray18);
        int int22 = zipArchiveInputStream9.read(byteArray18, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField24 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray25 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray18, false, unparseableExtraField24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = cpioArchiveInputStream7.read(byteArray18, 4096, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray25);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLength();
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        java.lang.String str8 = zipArchiveOutputStream7.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy9 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str10 = unicodeExtraFieldPolicy9.toString();
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy9);
        boolean boolean12 = arArchiveEntry2.equals((java.lang.Object) zipArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream13 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209565L + "'", long3 == 1687209565L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setCommentSource(commentSource8);
        jarArchiveEntry1.setTime((long) 16);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path15 = tarArchiveEntry14.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path19 = tarArchiveEntry18.getPath();
        java.nio.file.attribute.FileTime fileTime20 = null;
        tarArchiveEntry18.setCreationTime(fileTime20);
        java.nio.file.attribute.FileTime fileTime22 = tarArchiveEntry18.getLastModifiedTime();
        tarArchiveEntry14.setLastAccessTime(fileTime22);
        boolean boolean24 = tarArchiveEntry14.isGNULongNameEntry();
        java.nio.file.attribute.FileTime fileTime25 = tarArchiveEntry14.getLastModifiedTime();
        java.util.zip.ZipEntry zipEntry26 = jarArchiveEntry1.setLastAccessTime(fileTime25);
        java.nio.file.attribute.FileTime fileTime27 = zipEntry26.getLastModifiedTime();
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + commentSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD + "'", commentSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(path15);
        org.junit.Assert.assertNull(path19);
        org.junit.Assert.assertNotNull(fileTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(fileTime25);
        org.junit.Assert.assertNotNull(zipEntry26);
        org.junit.Assert.assertEquals(zipEntry26.toString(), "bzip2");
        org.junit.Assert.assertNotNull(fileTime27);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream10);
        zipArchiveInputStream11.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, 488);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream16 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream15);
        java.nio.file.Path path17 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) tarArchiveInputStream15, path17);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = null;
        java.io.File file20 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile19, file20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        byte[] byteArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile11.write(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField6 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean12 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray10, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior14 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray15 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, false, extraFieldParsingBehavior14);
        boolean boolean17 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 32768);
        unrecognizedExtraField6.setLocalFileDataData(byteArray10);
        byte[] byteArray19 = unrecognizedExtraField6.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 1]");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(4);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("UTF8");
        java.lang.Throwable[] throwableArray2 = unsupportedCompressionAlgorithmException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_EXEC));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 29, "070702");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream6 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) cpioArchiveInputStream5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy6 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy11 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream8, pack200Strategy11, strMap12);
        int int14 = pack200CompressorInputStream13.read();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy20 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream21 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream19, pack200Strategy20);
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream23, strMap24);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream26 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream25);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer27 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap28 = packer27.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream29 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream26, (java.util.Map<java.lang.String, java.lang.String>) strMap28);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream30 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream13, pack200Strategy20, (java.util.Map<java.lang.String, java.lang.String>) strMap28);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream31 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream4, pack200Strategy6, (java.util.Map<java.lang.String, java.lang.String>) strMap28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(pack200Strategy6);
        org.junit.Assert.assertNotNull(pack200Strategy11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy20);
        org.junit.Assert.assertNotNull(packer27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream4.write(byteArray5, 26121, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream7, strMap8);
        byte[] byteArray10 = new byte[] {};
        pack200CompressorOutputStream9.write(byteArray10);
        int int14 = zipArchiveInputStream1.read(byteArray10, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray10, true, unparseableExtraField16);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        long long3 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream4 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        tarArchiveOutputStream6.setBigNumberMode(32771);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream5, strMap6);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream8 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream7);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer9 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap10 = packer9.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream8, (java.util.Map<java.lang.String, java.lang.String>) strMap10);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField12 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField13 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean19 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray17, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior21 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray17, false, extraFieldParsingBehavior21);
        boolean boolean24 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray17, 32768);
        unrecognizedExtraField13.setLocalFileDataData(byteArray17);
        unrecognizedExtraField12.setCentralDirectoryData(byteArray17);
        pack200CompressorOutputStream11.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream3.write(byteArray17, 1, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit.");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <:> at index 48: org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit.");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap1 = compressorStreamFactory0.getCompressorOutputStreamProviders();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.lang.String str5 = zipArchiveOutputStream4.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy6 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str7 = unicodeExtraFieldPolicy6.toString();
        zipArchiveOutputStream4.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy6);
        zipArchiveOutputStream4.setUseLanguageEncodingFlag(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream11 = compressorStreamFactory0.createCompressorOutputStream("apkm.xz", (java.io.OutputStream) zipArchiveOutputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: apkm.xz not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "never" + "'", str7, "never");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        tarArchiveEntry2.setMode((int) (short) 2);
        tarArchiveEntry2.setModTime(0L);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream4 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore1, streamCompressor3);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream5 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor3);
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream5.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor3);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = jarArchiveEntry2.getUnparseableExtraFieldData();
        boolean boolean4 = jarArchiveEntry2.isStreamContiguous();
        long long5 = jarArchiveEntry2.getDataOffset();
        boolean boolean6 = jarArchiveEntry2.isUnixSymlink();
        byte[] byteArray7 = jarArchiveEntry2.getExtra();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable9 = parallelScatterZipCreator0.createCallable((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry2, inputStreamSupplier8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must be set on zipArchiveEntry: bzip2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteArray7);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.String str1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.getCompressedFilename("ZipLong value: 808471376");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ZipLong value: 808471376.lzma" + "'", str1, "ZipLong value: 808471376.lzma");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, 3);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatCheckSumOctalBytes((long) 33188, byteArray2, 80, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 33188=100644 will not fit in octal number buffer of length -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str1 = feature0.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long4 = jarArchiveEntry3.getDataOffset();
        byte[] byteArray5 = jarArchiveEntry3.getRawName();
        jarArchiveEntry3.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException8 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField11 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry10.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField11);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException13 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry10);
        java.lang.String str14 = feature0.toString();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "data descriptor" + "'", str1, "data descriptor");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "data descriptor" + "'", str14, "data descriptor");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("ZipShort value: 25461");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ZipShort value: 25461");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = jarArchiveEntry7.getUnparseableExtraFieldData();
        boolean boolean9 = jarArchiveEntry7.isStreamContiguous();
        long long10 = jarArchiveEntry7.getDataOffset();
        boolean boolean11 = jarArchiveEntry7.isUnixSymlink();
        int int12 = jarArchiveEntry7.getVersionRequired();
        java.nio.file.attribute.FileTime fileTime13 = jarArchiveEntry7.getLastAccessTime();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry15 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField16 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry15.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField16);
        byte[] byteArray18 = jarArchiveEntry15.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField19 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry15.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField19);
        byte[] byteArray21 = resourceAlignmentExtraField19.getLocalFileDataData();
        jarArchiveEntry7.setCentralDirectoryExtra(byteArray21);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable24 = parallelScatterZipCreator5.createCallable((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry7, inputStreamSupplier23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must be set on zipArchiveEntry: bzip2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0]");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setCommentSource(commentSource8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + commentSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD + "'", commentSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        java.nio.file.attribute.FileTime fileTime4 = jarArchiveEntry1.getLastAccessTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime4);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile14 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1, "TarArchiveStructSparse{offset=100, numbytes=156}", ".lzma", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: .lzma");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        long long11 = zipArchiveOutputStream1.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters12.setWithZlibHeader(false);
        int int15 = deflateParameters12.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, deflateParameters12);
        deflateCompressorOutputStream16.flush();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream18 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = arArchiveOutputStream18.createArchiveEntry(file19, "snappy-raw");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "LiteralBlock starting at 488 with length 2", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        java.lang.Object obj8 = jarArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = jarArchiveEntry1.getGeneralPurposeBit();
        generalPurposeBit9.useDataDescriptor(false);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "bzip2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "bzip2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "bzip2");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream7 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = deflate64CompressorInputStream7.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Invalid Deflate64 input");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNull(tarArchiveEntry6);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("deflate");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        byte[] byteArray6 = new byte[] {};
        pack200CompressorOutputStream5.write(byteArray6);
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray6, 64, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 0, 84446, "", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS15 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = x000A_NTFS15.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream18, strMap19);
        byte[] byteArray21 = new byte[] {};
        pack200CompressorOutputStream20.write(byteArray21);
        x000A_NTFS15.parseFromCentralDirectoryData(byteArray21, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort26 = x000A_NTFS15.getHeaderId();
        byte[] byteArray27 = x000A_NTFS15.getLocalFileDataData();
        unrecognizedExtraField0.setLocalFileDataData(byteArray27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray30 = zipShort29.getBytes();
        boolean boolean32 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byteArray30, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarFile tarFile33 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray30, 16877, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(zipEightByteInteger16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
        org.junit.Assert.assertNotNull(zipShort26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, 4095);
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cpioArchiveInputStream7.read(byteArray8, 3, 40960);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer5 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap6 = packer5.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream4, (java.util.Map<java.lang.String, java.lang.String>) strMap6);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField8 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField9 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean15 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray13, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior17 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray13, false, extraFieldParsingBehavior17);
        boolean boolean20 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray13, 32768);
        unrecognizedExtraField9.setLocalFileDataData(byteArray13);
        unrecognizedExtraField8.setCentralDirectoryData(byteArray13);
        pack200CompressorOutputStream7.write(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream26 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream7, (long) 6, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getUncompressedFilename("keep");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "keep" + "'", str1, "keep");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream5 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream7 = compressorStreamFactory0.createCompressorInputStream("br", (java.io.InputStream) brotliCompressorInputStream5, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Could not create CompressorInputStream.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, (int) '#', 257);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) tarArchiveInputStream8, "false");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.compress.compressors.CompressorStreamFactory.detect((java.io.InputStream) jarArchiveInputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        java.io.File file3 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer4 = org.apache.commons.compress.archivers.examples.CloseableConsumer.CLOSING_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("", seekableByteChannel2, file3, closeableConsumer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: \"ch\" is null!");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer4);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unicodeCommentExtraField0.getLocalFileDataLength();
        int int2 = zipShort1.getValue();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, strMap5);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date10 = cpioArchiveEntry9.getLastModifiedDate();
        cpioArchiveEntry9.setRemoteDeviceMin((long) 12);
        boolean boolean13 = zipArchiveOutputStream4.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry9);
        long long14 = zipArchiveOutputStream4.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters15 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters15.setWithZlibHeader(false);
        int int18 = deflateParameters15.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, deflateParameters15);
        deflateCompressorOutputStream19.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream22 = archiveStreamFactory0.createArchiveOutputStream("070702", (java.io.OutputStream) deflateCompressorOutputStream19, "LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 070702 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        gzipCompressorOutputStream4.flush();
        gzipCompressorOutputStream4.write(464);
        gzipCompressorOutputStream4.finish();
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream4.write(16384);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Cannot write more data, the end of the compressed data stream has been reached");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        boolean boolean5 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray1, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray1, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray11);
        java.nio.file.Path path13 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("apk", seekableByteChannel3, path13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: apk");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        int int8 = pack200CompressorInputStream6.read();
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 75 + "'", int8 == 75);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC2pre52));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) framedSnappyCompressorInputStream3, 100, 508);
        long long7 = framedSnappyCompressorInputStream3.getCompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) framedSnappyCompressorInputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_1 = new org.apache.commons.compress.compressors.lz4.XXHash32(512);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.Set<java.lang.String> strSet2 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream5);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream7 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream6);
        long long8 = brotliCompressorInputStream7.getCompressedCount();
        java.lang.String str9 = brotliCompressorInputStream7.toString();
        long long10 = brotliCompressorInputStream7.getCompressedCount();
        brotliCompressorInputStream7.mark(128);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream14 = compressorStreamFactory1.createCompressorInputStream("true", (java.io.InputStream) brotliCompressorInputStream7, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: true not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("deflate64");
        int int2 = cpioArchiveEntry1.getAlignmentBoundary();
        cpioArchiveEntry1.setInode((long) 3);
        cpioArchiveEntry1.setDeviceMin(1687209525L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("data descriptor");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getOutputStreamArchiveNames();
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory0.createArchiveOutputStream("ZipShort value: 25461", (java.io.OutputStream) jarArchiveOutputStream8, "deflate64");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ZipShort value: 25461 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "bzip2", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("lz4-block.xz");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream8 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF8" + "'", str5, "UTF8");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.io.File file0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream2, pack200Strategy5, strMap6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = zipArchiveInputStream1.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "`\n", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getNlink();
        int int2 = dumpArchiveEntry0.getUserId();
        boolean boolean3 = dumpArchiveEntry0.isChrDev();
        int int4 = dumpArchiveEntry0.getHeaderHoles();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry6 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField7 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry6.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField7);
        byte[] byteArray9 = jarArchiveEntry6.getCentralDirectoryExtra();
        gzipCompressorOutputStream4.write(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit12 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray9, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 504");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[30, -95, 2, 0, 0, 0]");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT;
        org.junit.Assert.assertTrue("'" + commentSource0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        framedSnappyCompressorOutputStream4.finish();
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorOutputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        char[] charArray5 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder7 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions8 = builder7.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder10 = builder7.withMaxMemoryLimitInKb(4096);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = builder7.build();
        boolean boolean12 = sevenZFileOptions11.getTryToRecoverBrokenArchives();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray5, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(sevenZFileOptions8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(sevenZFileOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (short) 100);
        byte[] byteArray2 = resourceAlignmentExtraField1.getCentralDirectoryData();
        boolean boolean3 = resourceAlignmentExtraField1.allowMethodChange();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setBigNumberMode(4);
        tarArchiveOutputStream6.setBigNumberMode(32771);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream13 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream6, 1687209497L, 476);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        long long11 = tarArchiveEntry7.getSize();
        java.io.InputStream inputStream12 = tarFile4.getInputStream(tarArchiveEntry7);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile4, path13);
        java.nio.file.Path path15 = null;
        java.nio.file.Path path16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path15, path16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(inputStream12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream4 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = brotliCompressorInputStream4.skip(193L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer0 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray7 = zipShort6.getBytes();
        boolean boolean9 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray7, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true);
        gzipCompressorOutputStream5.write(byteArray7);
        closeableConsumer0.accept((java.io.Closeable) gzipCompressorOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) gzipCompressorOutputStream5, 7, (int) (short) 2, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }
}
