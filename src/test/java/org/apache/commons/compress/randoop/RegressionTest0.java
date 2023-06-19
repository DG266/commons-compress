package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NTREC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray8 = new char[] { '#', 'a', ' ', '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "hi!", charArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a 44a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a 44a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a,  , 4, 4, a]");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.UNIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.getCompressedFilename("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".lzma" + "'", str1, ".lzma");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.STICKY));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME;
        org.junit.Assert.assertTrue("'" + nameSource0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.CPIO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "cpio" + "'", str0, "cpio");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGNAME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 76 + "'", byte0 == (byte) 76);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_DIR_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16877 + "'", int0 == 16877);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Unpacker.PROGRESS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unpack.progress" + "'", str0, "unpack.progress");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.io.File file0 = null;
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy1 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException(throwable0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PREFIXLEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 131 + "'", int0 == 131);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.BIGNUMBER_POSIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getLzma();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lzma" + "'", str0, "lzma");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("hi!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.TOKENIZATION));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.DEFLATE64;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate64" + "'", str0, "deflate64");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        char[] charArray3 = new char[] { '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, a]");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream3 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream3 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) arArchiveInputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NFS_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60012 + "'", int0 == 60012);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_MULTIVOLUME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 77 + "'", byte0 == (byte) 77);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile6 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1, "cpio", "deflate64", true, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile cpio");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CRC_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (int) (short) 0, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = null;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters4 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters5 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, false, false, true, parameters4);
        java.lang.String str6 = parameters5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true" + "'", str6, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setLevel((int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 76");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_SYMLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 50 + "'", byte0 == (byte) 50);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISGID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream1 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes(".lzma", byteArray7, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[100, 100, 1, 0, 100, 1]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = org.apache.commons.compress.compressors.lz77support.Parameters.TRUE_MIN_BACK_REFERENCE_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.buildFromLastSplitSegment(path0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray3, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding6, false, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_BLK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 52 + "'", byte0 == (byte) 52);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_OFFSET_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.io.File file0 = null;
        char[] charArray4 = new char[] { '4', ' ', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray4, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4,  , 4]");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_CTIME_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 488 + "'", int0 == 488);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Unpacker.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters.DEFAULT;
        org.junit.Assert.assertNotNull(parameters0);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.OS_2;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = zipArchiveInputStream1.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.setEncoding("");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, (int) (byte) 52, 16877, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_DIR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 53 + "'", byte0 == (byte) 53);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.io.File file0 = null;
        char[] charArray2 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.STORED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort((-1), byteArray2, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 77");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        byte[] byteArray4 = new byte[] {};
        pack200CompressorOutputStream3.write(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse7 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray4, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.IMPLODING));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs hostOs0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs();
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_FAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.io.File file0 = null;
        java.lang.Iterable<java.io.File> fileIterable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel.forFiles(file0, fileIterable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: files");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SNAPPY_FRAMED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-framed" + "'", str0, "snappy-framed");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream.DEFAULT_BLOCK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "00" + "'", str0, "00");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        boolean boolean0 = org.apache.commons.compress.compressors.brotli.BrotliUtils.isBrotliCompressionAvailable();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEVLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LONGNAMESLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.LZ4_FRAMED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4-framed" + "'", str0, "lz4-framed");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.io.File file0 = null;
        java.io.File file1 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, file1, strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.LZ4_BLOCK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4-block" + "'", str0, "lz4-block");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW_CRC;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 2 + "'", short0 == (short) 2);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = cpioArchiveEntry2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.VAX_VMS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.PASS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pass" + "'", str0, "pass");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OLDNORM;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str0 = org.apache.commons.compress.archivers.ar.ArArchiveEntry.TRAILER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "`\n" + "'", str0, "`\n");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray2 = zipShort1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unicodeCommentExtraField0, byteArray2, 488, 131, false);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 6375");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[30, -95]");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.util.Map<java.lang.String, java.lang.String> strMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.FileNameUtil fileNameUtil2 = new org.apache.commons.compress.compressors.FileNameUtil(strMap0, "`\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream13 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (long) (short) 1, parameters12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: params");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.FORMAT_OLDGNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DEFAULT_COMPRESSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getBzip2();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bzip2" + "'", str0, "bzip2");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.PRIMOS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "snappy-framed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_XSTAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream1 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile1 = new org.apache.commons.compress.archivers.tar.TarFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        boolean boolean1 = org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename("lz4-block");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = zipArchiveInputStream1.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.ATARI_ST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("hi!", byteArray2, 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray2, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB;
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB + "'", cOMPRESSION_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("true");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream5 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream1, true);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, ".lzma");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: .lzma");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.BZIP2));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.JPEG;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.JPEG + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.JPEG));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 76, byteArray4, 4, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 78");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        boolean boolean5 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray3, 32768);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 1024, byteArray3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) "snappy-framed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_GNU_SPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + " \000" + "'", str0, " \000");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_READ));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes(100L, byteArray3, 0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[48, 49, 52, 52]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
        byte[] byteArray2 = zipExtraField1.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(zipExtraField1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.io.File file0 = null;
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream3 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(16877);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16877L + "'", long1 == 16877L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap0 = org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorOutputStreamProviders();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.pathBased(path0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_PREFIX_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 345 + "'", int0 == 345);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        char[] charArray8 = new char[] { '4', ' ', '4', ' ', '#', '#' };
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, charArray8, sevenZFileOptions9);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 4 ##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 4 ##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , 4,  , #, #]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW_CRC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070702" + "'", str0, "070702");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Unpacker.DEFLATE_HINT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unpack.deflate.hint" + "'", str0, "unpack.deflate.hint");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.compress.compressors.lzma.LZMAUtils.setCacheLZMAAvailablity(true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int0 = java.util.zip.ZipEntry.DEFLATED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.WIN32;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile1 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        boolean boolean1 = org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename(" \000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.MILLIS_PER_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.FS_UFS2_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 424935705 + "'", int0 == 424935705);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
        java.lang.Object obj2 = zipShort0.clone();
        java.lang.String str3 = zipShort0.toString();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(zipExtraField1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ZipShort value: 25461");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipShort value: 25461" + "'", str3, "ZipShort value: 25461");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.GROUP_READ));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW_MASK;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 3 + "'", short0 == (short) 3);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.DEFAULT_RCDSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        byte byte0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.FILE_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISREG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32768 + "'", int0 == 32768);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.EFFORT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.effort" + "'", str0, "pack.effort");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.compress.archivers.zip.ZipFile zipFile0 = null;
        org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(zipFile0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path18 = tarArchiveEntry17.getPath();
        java.nio.file.attribute.FileTime fileTime19 = null;
        tarArchiveEntry17.setCreationTime(fileTime19);
        java.nio.file.attribute.FileTime fileTime21 = tarArchiveEntry17.getLastModifiedTime();
        boolean boolean22 = zipArchiveInputStream1.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry17);
        byte[] byteArray26 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean28 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray26, (int) (short) -1);
        boolean boolean30 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray26, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry17.parseTarHeader(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(path18);
        org.junit.Assert.assertNotNull(fileTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream1 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream(inputStream0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Input buffer is closed");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.CODE_ATTRIBUTE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.code.attribute." + "'", str0, "pack.code.attribute.");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream5 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) jarArchiveInputStream3, "`\n");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.compress.archivers.sevenz.CLI cLI0 = new org.apache.commons.compress.archivers.sevenz.CLI();
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.jar.JarFile jarFile1 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarFile1, (java.io.OutputStream) zipArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_NORMAL;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 48 + "'", byte0 == (byte) 48);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        int int5 = zipLong2.getIntValue();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray2 = zipShort1.getBytes();
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong(0L, byteArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_FILE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 33188 + "'", int0 == 33188);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        byte[] byteArray2 = new byte[] { (byte) 50, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit4 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[50, 10]");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        boolean boolean0 = org.apache.commons.compress.compressors.xz.XZUtils.isXZCompressionAvailable();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.CTIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.LBLSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField0.parseFromCentralDirectoryData(byteArray4, 100, (int) (byte) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField2 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("pack.code.attribute.", byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = jarArchiveEntry5.getUnparseableExtraFieldData();
        java.io.InputStream inputStream7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream7);
        zipArchiveInputStream8.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        zipArchiveInputStream8.close();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry5, (java.io.InputStream) zipArchiveInputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("00", (long) 16877);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("bzip2");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        boolean boolean1 = org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 50, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(100L, byteArray5, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33188");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 50, 0, 100]");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISSOCK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 49152 + "'", int0 == 49152);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.findAvailableArchiveInputStreamProviders();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(60012, true, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Alignment must be between 0 and 0x7fff, was: 60012");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 508 + "'", int0 == 508);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray5, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray5, false, extraFieldParsingBehavior9);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 32768);
        unrecognizedExtraField1.setLocalFileDataData(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField18 = extraFieldParsingMode0.onUnparseableExtraField(byteArray5, 1024, (int) (byte) 77, false, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_1 = new org.apache.commons.compress.compressors.lz4.XXHash32(1);
        long long2 = xXHash32_1.getValue();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean8 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray6, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, false, extraFieldParsingBehavior10);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, 32768);
        // The following exception was thrown during execution in test generation
        try {
            xXHash32_1.update(byteArray6, 9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 187479954L + "'", long2 == 187479954L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Block();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4-block" + "'", str0, "lz4-block");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.DEFLATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate" + "'", str0, "deflate");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_ATIME_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 476 + "'", int0 == 476);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.AMIGA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray1 = zipShort0.getBytes();
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray1, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 345");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSIONLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0, "snappy-framed");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = jarArchiveEntry4.getUnparseableExtraFieldData();
        boolean boolean6 = jarArchiveEntry4.isStreamContiguous();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        long long3 = cpioArchiveEntry2.getMode();
        cpioArchiveEntry2.setChksum(1L);
        boolean boolean6 = cpioArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32768L + "'", long3 == 32768L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.io.File file0 = null;
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer1 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap2 = packer1.properties();
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream5 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2, false, extraFieldParsingBehavior4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) 488);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray6 = zipShort5.getBytes();
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray6, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream4.write(byteArray6, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.compress.compressors.lzma.LZMAUtils.setCacheLZMAAvailablity(false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getXz();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xz" + "'", str0, "xz");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISFIFO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4096 + "'", int0 == 4096);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int int0 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.MAX_BLOCKSIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray3, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior7 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray3, false, extraFieldParsingBehavior7);
        boolean boolean10 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray3, 32768);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse12 = org.apache.commons.compress.archivers.tar.TarUtils.parseSparse(byteArray3, 424935705);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 424935705");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512;
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.SHA512));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream6 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "bzip2");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int int0 = java.util.zip.ZipEntry.STORED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, (int) (byte) 1, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = jarArchiveEntry5.getUnparseableExtraFieldData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD;
        org.junit.Assert.assertTrue("'" + nameSource0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD + "'", nameSource0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.UNICODE_EXTRA_FIELD));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU_SPARSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 504 + "'", int0 == 504);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.MAC_OS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getPack200();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack200" + "'", str0, "pack200");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_UC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 88 + "'", byte0 == (byte) 88);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        byte byte1 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte((int) (short) 100);
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 100 + "'", byte1 == (byte) 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_FILE_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 420 + "'", int0 == 420);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.JAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "jar" + "'", str0, "jar");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray4, (int) (byte) 50, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 16877);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = zipArchiveInputStream1.getNextZipEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWUSR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Framed();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "lz4-framed" + "'", str0, "lz4-framed");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.getUncompressedFilename("`\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "`\n" + "'", str1, "`\n");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path7 = tarArchiveEntry6.getPath();
        java.nio.file.attribute.FileTime fileTime8 = null;
        tarArchiveEntry6.setCreationTime(fileTime8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry6.getLastModifiedTime();
        tarArchiveEntry2.setLastAccessTime(fileTime10);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray14 = zipLong13.getBytes();
        boolean boolean16 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray14, 32768);
        boolean boolean18 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CHR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 51 + "'", byte0 == (byte) 51);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".bz2" + "'", str1, ".bz2");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream7 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream1, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5;
        int int1 = hashAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + hashAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5 + "'", hashAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.MD5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32771 + "'", int1 == 32771);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray3 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray3);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel4);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray6 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel1, seekableByteChannel4 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList7 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList7, seekableByteChannelArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel9 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The first ZIP split segment does not begin with split ZIP file signature");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray3);
        org.junit.Assert.assertNotNull(seekableByteChannel4);
        org.junit.Assert.assertNotNull(seekableByteChannelArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename("pack200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pack200.bz2" + "'", str1, "pack200.bz2");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.find((int) (short) 0);
        org.junit.Assert.assertTrue("'" + tYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN + "'", tYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.UNKNOWN));
    }

//    @Test
//    public void test0229() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test0229");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile2.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGLINK;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 75 + "'", byte0 == (byte) 75);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMin((long) 12);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setDevice((long) 476);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.Z;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "z" + "'", str0, "z");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getZ();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "z" + "'", str0, "z");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_MASK;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 12 + "'", short0 == (short) 12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        zipArchiveInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.compressors.CompressorStreamFactory.detect((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyRaw();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-raw" + "'", str0, "snappy-raw");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.GIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray3, (int) (byte) 75, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path18 = tarArchiveEntry17.getPath();
        java.nio.file.attribute.FileTime fileTime19 = null;
        tarArchiveEntry17.setCreationTime(fileTime19);
        java.nio.file.attribute.FileTime fileTime21 = tarArchiveEntry17.getLastModifiedTime();
        boolean boolean22 = zipArchiveInputStream1.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry17);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream23);
        zipArchiveInputStream24.mark((int) (byte) -1);
        long long28 = zipArchiveInputStream24.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream30 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel29);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream32 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream30, strMap31);
        byte[] byteArray33 = new byte[] {};
        pack200CompressorOutputStream32.write(byteArray33);
        int int37 = zipArchiveInputStream24.read(byteArray33, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField39 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray40 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray33, false, unparseableExtraField39);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding42 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry17.writeEntryHeader(byteArray33, zipEncoding42, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(path18);
        org.junit.Assert.assertNotNull(fileTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray40);
        org.junit.Assert.assertNotNull(zipEncoding42);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UIDLEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getBrotli();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "br" + "'", str0, "br");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.XZ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "xz" + "'", str0, "xz");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 257 + "'", int0 == 257);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_HEADERS_IN_OLDGNU_HEADER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray10, 420, 476);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 420");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.Set<java.lang.String> strSet2 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory1.createCompressorInputStream("pack.code.attribute.", (java.io.InputStream) pack200CompressorInputStream6, false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: pack.code.attribute. not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream6 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize(32771) > 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26128 + "'", int1 == 26128);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = arArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to read header. Occurred at byte: 0");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cpioArchiveInputStream7.read(byteArray8, 2, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        byte[] byteArray4 = new byte[] {};
        pack200CompressorOutputStream3.write(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong13 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream5, "snappy-framed");
        tarArchiveOutputStream8.setBigNumberMode(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream12 = archiveStreamFactory0.createArchiveOutputStream("z", (java.io.OutputStream) tarArchiveOutputStream8, "xz");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: z not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2097151L + "'", long0 == 2097151L);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.TAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar" + "'", str0, "tar");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream5, "snappy-framed");
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream11 = compressorStreamFactory0.createCompressorOutputStream("cpio", (java.io.OutputStream) tarArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: cpio not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 'a');
        int int10 = cpioArchiveEntry6.getAlignmentBoundary();
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters12 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream13 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, gzipParameters12);
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(504, false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLastModified();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209511L + "'", long3 == 1687209511L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1687209511L + "'", long5 == 1687209511L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path5 = tarArchiveEntry4.getPath();
        java.nio.file.attribute.FileTime fileTime6 = null;
        tarArchiveEntry4.setCreationTime(fileTime6);
        int int8 = tarArchiveEntry4.getUserId();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str1 = unicodeExtraFieldPolicy0.toString();
        java.lang.String str2 = unicodeExtraFieldPolicy0.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "never" + "'", str1, "never");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "never" + "'", str2, "never");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream1 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.READ_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        java.nio.file.attribute.FileTime fileTime4 = jarArchiveEntry1.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime5 = jarArchiveEntry1.getLastAccessTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry6 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(fileTime5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(0);
        short short2 = resourceAlignmentExtraField1.getAlignment();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_EXTENDED_HEADER_LC;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 120 + "'", byte0 == (byte) 120);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile5 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel0, "ZipEightByteInteger value: 0", "pack200.bz2", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int int0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.PLATFORM_UNIX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray2 = zipShort1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 76, byteArray2, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 76=114 will not fit in octal number buffer of length -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[30, -95]");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        boolean boolean3 = sevenZMethodConfiguration1.equals((java.lang.Object) 97L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(60012);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(path0, "", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_ANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "\000\000" + "'", str0, "\000\000");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getCompressedFilename("tar");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tar.bz2" + "'", str1, "tar.bz2");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.lang.String str7 = tarArchiveEntry2.getExtraPaxHeader("xz");
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream12 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream11);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray14 = zipShort13.getBytes();
        boolean boolean16 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray14, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray14, true);
        gzipCompressorOutputStream12.write(byteArray14);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding21 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray14, zipEncoding21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertNotNull(zipEncoding21);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.findAvailableArchiveOutputStreamProviders();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.GZIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gz" + "'", str0, "gz");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.io.File file0 = null;
        java.io.File file1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.compress.compressors.brotli.BrotliUtils.setCacheBrotliAvailablity(false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        char[] charArray3 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, charArray3, sevenZFileOptions4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path18 = tarArchiveEntry17.getPath();
        java.nio.file.attribute.FileTime fileTime19 = null;
        tarArchiveEntry17.setCreationTime(fileTime19);
        java.nio.file.attribute.FileTime fileTime21 = tarArchiveEntry17.getLastModifiedTime();
        boolean boolean22 = zipArchiveInputStream1.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream23 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Input is not in the .gz format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(path18);
        org.junit.Assert.assertNotNull(fileTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        long long6 = zipArchiveInputStream1.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream7 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        // The following exception was thrown during execution in test generation
        try {
            gzipParameters0.setBufferSize((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid buffer size: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.LONGFILE_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        pack200CompressorInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream5 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) pack200CompressorInputStream2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long6 = arArchiveEntry5.getLastModified();
        long long7 = arArchiveEntry5.getLength();
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry5);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write((int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1687209513L + "'", long6 == 1687209513L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0, "snappy-framed");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long6 = arArchiveEntry5.getLastModified();
        int int7 = arArchiveEntry5.getUserId();
        long long8 = arArchiveEntry5.getLength();
        int int9 = arArchiveEntry5.getMode();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.ar.ArArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1687209513L + "'", long6 == 1687209513L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 12L + "'", long8 == 12L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.MODIFICATION_TIME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.modification.time" + "'", str0, "pack.modification.time");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, ".lzma", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISDIR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16384 + "'", int0 == 16384);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        byte[] byteArray0 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray0, zipEncoding2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream2 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream(outputStream0, "snappy-framed");
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream2.putArchiveEntry(archiveEntry3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        boolean boolean3 = tarArchiveEntry1.isPaxGNUSparse();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        jarArchiveEntry1.setUnixMode((int) (byte) 51);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.LZMA;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.LZMA + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.LZMA));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.BLKDEV));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMaj((long) 'a');
        int int10 = cpioArchiveEntry6.getAlignmentBoundary();
        boolean boolean11 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray13 = zipShort12.getBytes();
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray13);
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
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.finish();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField10 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField10);
        byte[] byteArray12 = jarArchiveEntry9.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cpioArchiveInputStream7.read(byteArray12, 76, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[30, -95, 2, 0, 0, 0]");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        deflateCompressorInputStream5.close();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = deflateCompressorInputStream5.read(byteArray8, 49152, (int) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        byte[] byteArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream4.write(byteArray5, (int) (byte) 120, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 257, "UTF8");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = cpioArchiveInputStream7.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.CLASS_ATTRIBUTE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.class.attribute." + "'", str0, "pack.class.attribute.");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp7 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong8 = x5455_ExtendedTimestamp7.getAccessTime();
        byte[] byteArray9 = x5455_ExtendedTimestamp7.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = pack200CompressorInputStream6.read(byteArray9, (int) '#', 512);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertNull(zipLong8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_FIFO;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 54 + "'", byte0 == (byte) 54);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream5, "snappy-framed");
        tarArchiveOutputStream8.setBigNumberMode(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream11 = archiveStreamFactory0.createArchiveOutputStream("z", (java.io.OutputStream) tarArchiveOutputStream8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: z not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_WRITE));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort0);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize2 = null;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters7 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize2, false, false, true, parameters6);
        boolean boolean8 = zipShort0.equals((java.lang.Object) false);
        java.lang.String str9 = zipShort0.toString();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(zipExtraField1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZipShort value: 25461" + "'", str9, "ZipShort value: 25461");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        java.util.Date date7 = tarArchiveEntry2.getModTime();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField8 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean14 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray12, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior16 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray17 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12, false, extraFieldParsingBehavior16);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray12, 32768);
        unrecognizedExtraField8.setLocalFileDataData(byteArray12);
        byte[] byteArray21 = unrecognizedExtraField8.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Jun 19 23:18:35 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[10, 1, 1]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APK;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apk" + "'", str0, "apk");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.WIN95;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        boolean boolean1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isCompressedFilename("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.LINK));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.AED_SIG;
        org.junit.Assert.assertNotNull(zipLong0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(path3, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(openOptionArray4);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSE_HEADERS_IN_EXTENSION_HEADER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 21 + "'", int0 == 21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp2 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = x5455_ExtendedTimestamp2.getAccessTime();
        byte[] byteArray4 = x5455_ExtendedTimestamp2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray4, (int) (short) 1, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0]");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.io.File file0 = null;
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean4 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, 3);
        boolean boolean6 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray2, (int) (byte) 53);
        boolean boolean8 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("ZipShort value: 25461", "apk");
            org.junit.Assert.fail("Expected exception of type java.nio.file.InvalidPathException; message: Illegal char <:> at index 14: ZipShort value: 25461");
        } catch (java.nio.file.InvalidPathException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry3 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(46947589L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray3, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        zipArchiveInputStream14.mark((int) (byte) -1);
        long long18 = zipArchiveInputStream14.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel19);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream20, strMap21);
        byte[] byteArray23 = new byte[] {};
        pack200CompressorOutputStream22.write(byteArray23);
        int int27 = zipArchiveInputStream14.read(byteArray23, (int) (short) -1, (int) (byte) 50);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray23, 11, (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        long long1 = unicodeCommentExtraField0.getNameCRC32();
        byte[] byteArray2 = unicodeCommentExtraField0.getLocalFileDataData();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.compress.compressors.brotli.BrotliUtils.setCacheBrotliAvailablity(true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.SNAPPY_RAW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-raw" + "'", str0, "snappy-raw");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.VERSION_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 263 + "'", int0 == 263);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        char[] charArray6 = new char[] { 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "pack.modification.time", charArray6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "aa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "aa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, a]");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray33 = zipLong32.getBytes();
        boolean boolean35 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray33, 1024);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:18:37 CEST 2023");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:18:37 CEST 2023");
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error" + "'", str0, "error");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream3 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.PERM_MASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4095 + "'", int0 == 4095);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(file0, "z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream8 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) pack200CompressorInputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField0 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = resourceAlignmentExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipShort1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.APKM;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "apkm" + "'", str0, "apkm");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_EXEC));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.BZIP2;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bzip2" + "'", str0, "bzip2");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException1 = new org.apache.commons.compress.archivers.dump.InvalidFormatException((long) (byte) 54);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream2.getUncompressedCount();
        long long7 = zipArchiveInputStream2.skip(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream8 = compressorStreamFactory0.createCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.TripleDES168));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setLongFileMode((int) (byte) 120);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData11 = jarArchiveEntry10.getUnparseableExtraFieldData();
        boolean boolean12 = jarArchiveEntry10.isStreamContiguous();
        long long13 = jarArchiveEntry10.getDataOffset();
        boolean boolean14 = jarArchiveEntry10.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS15 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = x000A_NTFS15.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream18, strMap19);
        byte[] byteArray21 = new byte[] {};
        pack200CompressorOutputStream20.write(byteArray21);
        x000A_NTFS15.parseFromCentralDirectoryData(byteArray21, 64, 0);
        jarArchiveEntry10.setCentralDirectoryExtra(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger16);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_NEW;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) 476);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.WORLD_EXEC));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.Set<java.lang.String> strSet2 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream4);
        zipArchiveInputStream5.mark((int) (byte) -1);
        long long9 = zipArchiveInputStream5.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream11, strMap12);
        byte[] byteArray14 = new byte[] {};
        pack200CompressorOutputStream13.write(byteArray14);
        int int18 = zipArchiveInputStream5.read(byteArray14, (int) (short) -1, (int) (byte) 50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream20 = compressorStreamFactory1.createCompressorInputStream("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true", (java.io.InputStream) zipArchiveInputStream5, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(504);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(3);
        int int2 = zipMethod1.getCode();
        org.junit.Assert.assertTrue("'" + zipMethod1 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2 + "'", zipMethod1.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
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
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField17 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray18 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray11, true, unparseableExtraField17);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray11, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2 + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.EXPANDING_LEVEL_2));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, ".lzma");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.LATEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "latest" + "'", str0, "latest");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getZstandard();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zstd" + "'", str0, "zstd");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.XSTAR_MULTIVOLUME_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 464 + "'", int0 == 464);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray5 = zipLong4.getBytes();
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = pack200CompressorInputStream2.read(byteArray5, (int) (short) 0, (int) (byte) 76);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1020L + "'", long6 == 1020L);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime(33639248L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNKNOWN));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream3 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_XSTAR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "tar\000" + "'", str0, "tar\000");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.BROTLI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "br" + "'", str0, "br");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp1 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp1.getAccessTime();
        byte[] byteArray3 = x5455_ExtendedTimestamp1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 76, byteArray3, 131, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 259");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        int int5 = jarArchiveEntry1.getVersionMadeBy();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        boolean boolean5 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        boolean boolean6 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ARJ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arj" + "'", str0, "arj");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setDeflateStrategy((int) (short) 3);
        gzipParameters0.setBufferSize((int) (byte) 10);
        int int5 = gzipParameters0.getOperatingSystem();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 255 + "'", int5 == 255);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int int0 = org.apache.commons.compress.archivers.zip.ZipExtraField.EXTRAFIELD_HEADER_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        long long0 = org.apache.commons.compress.archivers.EntryStreamOffsets.OFFSET_UNKNOWN;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField8 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry7.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField8);
        byte[] byteArray10 = jarArchiveEntry7.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = arArchiveInputStream2.read(byteArray10, 345, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[30, -95, 2, 0, 0, 0]");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: 0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        tarArchiveEntry1.setNames("ustar\000", "");
        java.lang.String str7 = tarArchiveEntry1.getExtraPaxHeader("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
        tarArchiveEntry1.addPaxHeader("latest", ".bz2");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) 26128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int1 = arjArchiveEntry0.getHostOs();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG;
        boolean boolean3 = arjArchiveEntry0.equals((java.lang.Object) nameSource2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + nameSource2 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG + "'", nameSource2.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME_WITH_EFS_FLAG));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream2 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream(inputStream0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(3, false, 1);
        java.lang.Class<?> wildcardClass4 = resourceAlignmentExtraField3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        jarArchiveEntry1.setTime(16877L);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray2, 32768);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode8);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock12 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray2, 488, (int) (short) 2);
        int int13 = literalBlock12.getOffset();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 488 + "'", int13 == 488);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder5 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions6 = builder5.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "gz", sevenZFileOptions6);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(sevenZFileOptions6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort.putShort((int) (byte) 88, byteArray2, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 488");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[35, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = framedSnappyCompressorInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, 420, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream9 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) tarArchiveInputStream7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be bigger than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("br", seekableByteChannel3, file4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: br not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = tarArchiveInputStream4.getNextTarEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream11 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) jarArchiveOutputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream2 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream(outputStream0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.CHRDEV));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.CPIO_TRAILER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "TRAILER!!!" + "'", str0, "TRAILER!!!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_LINK_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 511 + "'", int0 == 511);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.PASS_FILE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.pass.file." + "'", str0, "pack.pass.file.");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, "apkm");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream15 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        tarArchiveInputStream4.mark((int) (byte) 51);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tarArchiveInputStream4.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_SPARSE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 83 + "'", byte0 == (byte) 83);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC4;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC4 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.RC4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26625 + "'", int1 == 26625);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry15 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("pack.class.attribute.");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        long long5 = cpioArchiveEntry2.getGID();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setRemoteDevice((long) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean8 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray6, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, false, extraFieldParsingBehavior10);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, 32768);
        unrecognizedExtraField2.setLocalFileDataData(byteArray6);
        byte[] byteArray15 = unrecognizedExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding17 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry((java.util.Map<java.lang.String, java.lang.String>) strMap1, byteArray15, zipEncoding17, false, (long) 26128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[10, 1, 1]");
        org.junit.Assert.assertNotNull(zipEncoding17);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ZIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zip" + "'", str0, "zip");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream4 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.SETGUI));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        boolean boolean1 = org.apache.commons.compress.compressors.gzip.GzipUtils.isCompressedFilename("apk");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration2 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0, (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DEFLATE64 method doesn't support options of type class java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData6 = jarArchiveEntry5.getUnparseableExtraFieldData();
        boolean boolean7 = jarArchiveEntry5.isStreamContiguous();
        long long8 = jarArchiveEntry5.getDataOffset();
        boolean boolean9 = jarArchiveEntry5.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS10 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = x000A_NTFS10.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel12 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream15 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream13, strMap14);
        byte[] byteArray16 = new byte[] {};
        pack200CompressorOutputStream15.write(byteArray16);
        x000A_NTFS10.parseFromCentralDirectoryData(byteArray16, 64, 0);
        jarArchiveEntry5.setCentralDirectoryExtra(byteArray16);
        byte[] byteArray22 = jarArchiveEntry5.getRawName();
        jarArchiveEntry5.setVersionMadeBy(476);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier25 = null;
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator3.addArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry5, inputStreamSupplier25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must be set on zipArchiveEntry: bzip2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(byteArray22);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream3 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Input is not in the .gz format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption openOption4 = null;
        java.nio.file.OpenOption[] openOptionArray5 = new java.nio.file.OpenOption[] { openOption4 };
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(path3, openOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(openOptionArray5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream bZip2CompressorInputStream9 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream((java.io.InputStream) cpioArchiveInputStream8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream is not in the BZip2 format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.lang.String str4 = zipArchiveOutputStream3.getEncoding();
        boolean boolean5 = zipArchiveOutputStream3.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date9 = cpioArchiveEntry8.getLastModifiedDate();
        cpioArchiveEntry8.setRemoteDeviceMaj((long) 'a');
        int int12 = cpioArchiveEntry8.getAlignmentBoundary();
        boolean boolean13 = zipArchiveOutputStream3.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry8);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator1.writeTo(zipArchiveOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod1 = org.apache.commons.compress.archivers.zip.ZipMethod.getMethodByCode(60012);
        org.junit.Assert.assertNull(zipMethod1);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.compress.compressors.lz77support.Parameters parameters0 = null;
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback callback1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor lZ77Compressor2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor(parameters0, callback1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: params");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.jar.JarFile jarFile1 = null;
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry4 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long5 = arArchiveEntry4.getLastModified();
        int int6 = arArchiveEntry4.getUserId();
        long long7 = arArchiveEntry4.getLength();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy11 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str12 = unicodeExtraFieldPolicy11.toString();
        zipArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy11);
        boolean boolean14 = arArchiveEntry4.equals((java.lang.Object) zipArchiveOutputStream9);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarFile1, (java.io.OutputStream) zipArchiveOutputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1687209524L + "'", long5 == 1687209524L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "never" + "'", str12, "never");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        byte[] byteArray6 = new byte[] {};
        pack200CompressorOutputStream5.write(byteArray6);
        x000A_NTFS0.parseFromCentralDirectoryData(byteArray6, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger11 = x000A_NTFS0.getAccessTime();
        long long12 = zipEightByteInteger11.getLongValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.DES));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "deflate64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("lz4-block");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lz4-block.xz" + "'", str1, "lz4-block.xz");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.apache.commons.compress.compressors.lz77support.Parameters parameters13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream14 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream7, parameters13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: params");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209524L + "'", long3 == 1687209524L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap0 = org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorInputStreamProviders();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream4 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = tarArchiveInputStream5.getCurrentEntry();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.deflate((java.io.InputStream) tarArchiveInputStream5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertNull(tarArchiveEntry6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean8 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray6, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior10 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, false, extraFieldParsingBehavior10);
        boolean boolean13 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray6, 32768);
        unrecognizedExtraField2.setLocalFileDataData(byteArray6);
        unrecognizedExtraField1.setCentralDirectoryData(byteArray6);
        boolean boolean17 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray6, 4096);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (byte) 0, byteArray6, 2, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = cpioArchiveEntry2.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.io.File file0 = null;
        java.io.File file1 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer7 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap8 = packer7.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream6, (java.util.Map<java.lang.String, java.lang.String>) strMap8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, file1, (java.util.Map<java.lang.String, java.lang.String>) strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.io.File file0 = null;
        java.io.File file1 = null;
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer2 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap3 = packer2.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil5 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap3, ".lzma");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, file1, (java.util.Map<java.lang.String, java.lang.String>) strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream5 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (long) 128, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.find(16);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        boolean boolean8 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromCentralDirectoryData(byteArray4, 1000, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.util.Date date2 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray5 = zipLong4.getBytes();
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1024);
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromLocalFileData(byteArray5, 424935705, (int) (byte) 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 424935709");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_1 = new org.apache.commons.compress.compressors.lz4.XXHash32(16877);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, ".bz2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        boolean boolean6 = tarArchiveInputStream3.markSupported();
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream3.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray5 = new byte[] { (byte) 50, (byte) 88, (byte) 100, (byte) 77 };
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray5, 33188, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[50, 88, 100, 77]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_GNU;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar " + "'", str0, "ustar ");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("xz");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB;
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB + "'", cOMPRESSION_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.APPLE_GS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.PAD2LEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorInputStream6.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.MODTIMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        long long6 = tarArchiveEntry2.getDataOffset();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getGzip();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gz" + "'", str0, "gz");
    }

//    @Test
//    public void test0469() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test0469");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
//        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile10.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//        org.junit.Assert.assertNotNull(charArray9);
//        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
//        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
//    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        byte[] byteArray4 = jarArchiveEntry1.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField5);
        long long7 = jarArchiveEntry1.getDataOffset();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry13 = sevenZOutputFile10.createArchiveEntry(file11, ".bz2");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.DEFAULT_DIR_PERM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 493 + "'", int0 == 493);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.TAPE));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (short) 0, 1000, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int int0 = org.apache.commons.compress.archivers.ar.ArArchiveOutputStream.LONGFILE_ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize11 = null;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters12 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters13 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize11, parameters12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream14 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream6, parameters13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker3 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray4 = jarMarker3.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray4, (int) (byte) 77, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8, byteArray1, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.NAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.file.Path path3 = null;
        java.nio.file.OpenOption[] openOptionArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(path3, openOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField5 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean11 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray9, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior13 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, false, extraFieldParsingBehavior13);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 32768);
        unrecognizedExtraField5.setLocalFileDataData(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = unrecognizedExtraField5.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = unrecognizedExtraField5.getLocalFileDataLength();
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean25 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray23, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior27 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray23, false, extraFieldParsingBehavior27);
        boolean boolean30 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray23, 32768);
        unrecognizedExtraField5.parseFromLocalFileData(byteArray23, (int) (short) 2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = tarArchiveInputStream3.read(byteArray23, 464, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 3);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray4, (int) (byte) 53);
        boolean boolean10 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode0.fill(zipExtraField2, byteArray4, (int) (short) 12, 420, true);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Failed to parse corrupt ZIP extra field of type 6375");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipExtraField2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream4 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISBLK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 24576 + "'", int0 == 24576);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.S_IFMT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 61440 + "'", int0 == 61440);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = jarArchiveEntry9.getUnparseableExtraFieldData();
        boolean boolean11 = jarArchiveEntry9.isStreamContiguous();
        long long12 = jarArchiveEntry9.getDataOffset();
        boolean boolean13 = jarArchiveEntry9.isUnixSymlink();
        int int14 = jarArchiveEntry9.getVersionRequired();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream17 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream19 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream17, true);
        int int20 = tarArchiveInputStream19.getRecordSize();
        tarArchiveInputStream19.mark((int) (byte) 51);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry9, (java.io.InputStream) tarArchiveInputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.nio.file.attribute.FileTime fileTime6 = tarArchiveEntry2.getLastModifiedTime();
        long long7 = tarArchiveEntry2.getLongGroupId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray9 = zipShort8.getBytes();
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding13 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, 3);
        java.lang.String str18 = zipEncoding13.decode(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.writeEntryHeader(byteArray9, zipEncoding13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipEncoding13);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a\000" + "'", str18, "a\000");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path7 = tarArchiveEntry6.getPath();
        java.nio.file.attribute.FileTime fileTime8 = null;
        tarArchiveEntry6.setCreationTime(fileTime8);
        long long10 = tarArchiveEntry6.getSize();
        java.io.InputStream inputStream11 = tarFile3.getInputStream(tarArchiveEntry6);
        boolean boolean12 = tarArchiveEntry6.isFile();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        byte[] byteArray4 = new byte[] {};
        pack200CompressorOutputStream3.write(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray4, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore1);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream3 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor2);
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 0, path1, "error", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        boolean boolean5 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray3, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray3, 16877, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int int0 = org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs.NEXT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "lzma");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.getUncompressedFilename("snappy-raw");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "snappy-raw" + "'", str1, "snappy-raw");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.UNKNOWN_COMPRESSED_SIZE;
        org.junit.Assert.assertNotNull(feature0);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
            org.apache.commons.compress.archivers.zip.ZipFile zipFile21 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel17, "ustar ", "070702", false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile ustar ");
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setDeflateStrategy((int) (short) 3);
        gzipParameters0.setComment("unpack.deflate.hint");
        // The following exception was thrown during execution in test generation
        try {
            gzipParameters0.setCompressionLevel((int) (byte) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid gzip compression level: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        java.lang.Object obj8 = jarArchiveEntry1.clone();
        jarArchiveEntry1.setSize((long) 345);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "bzip2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "bzip2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "bzip2");
    }
}
