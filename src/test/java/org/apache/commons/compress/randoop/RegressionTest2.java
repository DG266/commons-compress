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
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort4);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNotNull(zipExtraField6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        boolean boolean0 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isLZMACompressionAvailable();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream(outputStream0, pack200Strategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "LiteralBlock starting at 488 with length 2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = org.apache.commons.compress.archivers.zip.GeneralPurposeBit.parse(byteArray1, 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jarMarker0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.compress.archivers.Lister lister0 = new org.apache.commons.compress.archivers.Lister();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray3, (int) (short) -1);
        boolean boolean7 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctal(byteArray3, (int) (byte) 48, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType0 = org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD;
        org.junit.Assert.assertTrue("'" + blockType0 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD + "'", blockType0.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.EOD));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = arArchiveInputStream2.getNextArEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Failed to read header. Occurred at byte: 0");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry3 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int4 = dumpArchiveEntry3.getNlink();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        java.nio.file.attribute.FileTime fileTime11 = tarArchiveEntry7.getLastModifiedTime();
        tarArchiveEntry7.setMode((int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path17 = tarArchiveEntry16.getPath();
        java.nio.file.attribute.FileTime fileTime18 = null;
        tarArchiveEntry16.setCreationTime(fileTime18);
        int int20 = tarArchiveEntry16.getUserId();
        java.util.Date date21 = tarArchiveEntry16.getModTime();
        tarArchiveEntry7.setModTime(date21);
        dumpArchiveEntry3.setLastModifiedDate(date21);
        x000A_NTFS0.setModifyJavaTime(date21);
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry27 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long28 = arArchiveEntry27.getLastModified();
        long long29 = arArchiveEntry27.getLength();
        java.util.Date date30 = arArchiveEntry27.getLastModifiedDate();
        x000A_NTFS0.setAccessJavaTime(date30);
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertNotNull(fileTime11);
        org.junit.Assert.assertNull(path17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Jun 19 23:19:31 CEST 2023");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1687209571L + "'", long28 == 1687209571L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 12L + "'", long29 == 12L);
        org.junit.Assert.assertNotNull(date30);
// flaky:         org.junit.Assert.assertEquals(date30.toString(), "Mon Jun 19 23:19:31 CEST 2023");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        generalPurposeBit0.useEncryption(false);
        generalPurposeBit0.useStrongEncryption(true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((int) (byte) 120);
        java.lang.String str3 = dumpArchiveEntry0.getSimpleName();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date11 = cpioArchiveEntry10.getLastModifiedDate();
        cpioArchiveEntry10.setRemoteDeviceMaj((long) 'a');
        int int14 = cpioArchiveEntry10.getAlignmentBoundary();
        boolean boolean15 = zipArchiveOutputStream5.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
        cpioArchiveEntry10.setDeviceMin((long) 26128);
        boolean boolean18 = cpioArchiveEntry10.isSocket();
        java.util.Date date19 = cpioArchiveEntry10.getLastModifiedDate();
        dumpArchiveEntry0.setAccessTime(date19);
        dumpArchiveEntry0.setGeneration(36864);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, (int) (short) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        byte[] byteArray2 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = jarMarker0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField4 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray7 = zipLong6.getBytes();
        boolean boolean9 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray7, 32768);
        boolean boolean11 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode13 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode13);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock17 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray7, 488, (int) (short) 2);
        unicodePathExtraField4.setUnicodeName(byteArray7);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean22 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray20, 3);
        boolean boolean24 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray20, (int) (byte) 53);
        long long27 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray20, 1, 476);
        boolean boolean29 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray20, 16877);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray30 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray20);
        unicodePathExtraField4.setUnicodeName(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromCentralDirectoryData(byteArray20, 256, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode13 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode13.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray30);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean7 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray5, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior9 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray5, false, extraFieldParsingBehavior9);
        boolean boolean12 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray5, 32768);
        unrecognizedExtraField1.setLocalFileDataData(byteArray5);
        byte[] byteArray14 = unrecognizedExtraField1.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 464, byteArray14, 24576);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24576");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[10, 1, 1]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        int int10 = tarArchiveOutputStream6.getCount();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj12 = x5455_ExtendedTimestamp11.clone();
        byte[] byteArray13 = x5455_ExtendedTimestamp11.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray13, (int) (short) 0, 256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        byte[] byteArray12 = x000A_NTFS0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = x000A_NTFS0.getAccessTime();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS14 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray16, 3);
        x000A_NTFS14.parseFromLocalFileData(byteArray16, 8, (int) (short) 2);
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromCentralDirectoryData(byteArray16, 257, 511);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 261");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
            int int13 = framedSnappyCompressorInputStream3.read();
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean5 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray3, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean11 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 3);
        java.lang.String str12 = zipEncoding7.decode(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray3, zipEncoding7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a\000" + "'", str12, "a\000");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 120, path1, "tar", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = null;
        unrecognizedExtraField0.setHeaderId(zipShort1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        boolean boolean8 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray6, 32768);
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 0);
        unrecognizedExtraField0.setCentralDirectoryData(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipShort13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.BIGNUMBER_STAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        arArchiveOutputStream18.setLongFileMode((int) (byte) 52);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray22 = zipShort21.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream18.write(byteArray22, 155, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[30, -95]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("tar.bz2");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 48, path1, "latest", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder8 = builder6.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters9 = builder8.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters10 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, true, false, false, parameters9);
        java.lang.String str11 = parameters10.toString();
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(parameters9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "LZ4 Parameters with BlockSize M1, withContentChecksum true, withBlockChecksum false, withBlockDependency false" + "'", str11, "LZ4 Parameters with BlockSize M1, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        tarArchiveInputStream4.mark(263);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) tarArchiveInputStream4, "hi!", true, false, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0017_StrongEncryptionHeader0.getLocalFileDataLength();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean6 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray4, 3);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray4, (int) (byte) 53);
        boolean boolean10 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, 128);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray4, (int) (byte) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters0 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        boolean boolean1 = deflateParameters0.withZlibHeader();
        deflateParameters0.setCompressionLevel(8);
        // The following exception was thrown during execution in test generation
        try {
            deflateParameters0.setCompressionLevel(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Deflate compression level: 4095");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, 420, 32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = jarArchiveInputStream4.getNextEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream11 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) jarArchiveInputStream4, false, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry8);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(file0, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray5 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel6 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray5);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel6);
        char[] charArray9 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel6, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder11 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions12 = builder11.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder14 = builder11.withMaxMemoryLimitInKb(4096);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions15 = builder11.build();
        int int16 = sevenZFileOptions15.getMaxMemoryLimitInKb();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile17 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "pass", charArray9, sevenZFileOptions15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray5);
        org.junit.Assert.assertNotNull(seekableByteChannel6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertNotNull(sevenZFileOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(sevenZFileOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4096 + "'", int16 == 4096);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
            zipArchiveOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209573L + "'", long3 == 1687209573L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        byte[] byteArray13 = unrecognizedExtraField0.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray13, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(".lzma");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 3);
        boolean boolean16 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray12, 3);
        boolean boolean18 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray12, 511);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream10.write(byteArray12, 128, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException0 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(1024);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream1 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream4 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int5 = zipArchiveInputStream1.read();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.compress.compressors.CompressorStreamFactory.detect((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("a\000");
        long long2 = zipArchiveEntry1.getCrc();
        long long3 = zipArchiveEntry1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        long long0 = org.apache.commons.compress.archivers.tar.TarConstants.MAXSIZE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 8589934591L + "'", long0 == 8589934591L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption linkOption2 = null;
        java.nio.file.LinkOption[] linkOptionArray3 = new java.nio.file.LinkOption[] { linkOption2 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(path0, "LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true", linkOptionArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream8 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNull(tarArchiveEntry6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str1 = x000A_NTFS0.toString();
        java.lang.String str2 = x000A_NTFS0.toString();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = x000A_NTFS0.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        java.nio.file.attribute.FileTime fileTime11 = tarArchiveEntry7.getLastModifiedTime();
        tarArchiveEntry7.addPaxHeader("pack.modification.time", "lz4-block.xz");
        java.util.Date date15 = tarArchiveEntry7.getModTime();
        x000A_NTFS0.setCreateJavaTime(date15);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger17 = x000A_NTFS0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = x000A_NTFS0.getCentralDirectoryLength();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str1, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertNotNull(fileTime11);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Mon Jun 19 23:19:34 CEST 2023");
        org.junit.Assert.assertNotNull(zipEightByteInteger17);
        org.junit.Assert.assertNotNull(zipShort18);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        boolean boolean6 = zipArchiveOutputStream1.isSeekable();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1, "data descriptor");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: data descriptor");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        long long7 = cpioArchiveEntry2.getUID();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setMode((long) 257);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 101 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyFramed();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "snappy-framed" + "'", str0, "snappy-framed");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        boolean boolean5 = zipArchiveOutputStream1.isSeekable();
        java.nio.file.Path path6 = null;
        java.nio.file.LinkOption[] linkOptionArray8 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = zipArchiveOutputStream1.createArchiveEntry(path6, "tar", linkOptionArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(linkOptionArray8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IRGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.UNKNOWN_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.unknown.attribute" + "'", str0, "pack.unknown.attribute");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        short short0 = org.apache.commons.compress.archivers.cpio.CpioConstants.FORMAT_OLD_BINARY;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 8 + "'", short0 == (short) 8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource3 = jarArchiveEntry1.getCommentSource();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + commentSource3 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource3.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        org.apache.commons.compress.changes.ChangeSet changeSet5 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet5.deleteDir("hi!");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField10 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField10);
        java.nio.file.attribute.FileTime fileTime12 = jarArchiveEntry9.getLastAccessTime();
        java.io.InputStream inputStream13 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream13);
        zipArchiveInputStream14.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream17.getNextEntry();
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = jarArchiveInputStream17.getNextEntry();
        changeSet5.add((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry9, (java.io.InputStream) jarArchiveInputStream17);
        boolean boolean21 = zipArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream22 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream23 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertNull(archiveEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Never + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Never));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray1, 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8199");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream3, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        // The following exception was thrown during execution in test generation
        try {
            blockLZ4CompressorOutputStream19.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        byte[] byteArray13 = unrecognizedExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        tarArchiveInputStream4.mark(263);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = tarArchiveInputStream4.read(byteArray9, 0, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.find(493);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode4 = null;
        zipArchiveOutputStream3.setUseZip64(zip64Mode4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, 84446);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize(84446) > 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((int) (byte) 120);
        java.lang.String str3 = dumpArchiveEntry0.getSimpleName();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date11 = cpioArchiveEntry10.getLastModifiedDate();
        cpioArchiveEntry10.setRemoteDeviceMaj((long) 'a');
        int int14 = cpioArchiveEntry10.getAlignmentBoundary();
        boolean boolean15 = zipArchiveOutputStream5.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
        cpioArchiveEntry10.setDeviceMin((long) 26128);
        boolean boolean18 = cpioArchiveEntry10.isSocket();
        java.util.Date date19 = cpioArchiveEntry10.getLastModifiedDate();
        dumpArchiveEntry0.setAccessTime(date19);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp21 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj22 = x5455_ExtendedTimestamp21.clone();
        boolean boolean23 = dumpArchiveEntry0.equals(obj22);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) jarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a framed Snappy stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        zip64ExtendedInformationExtraField0.setDiskStartNumber(zipLong2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = zip64ExtendedInformationExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField0.getSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = zip64ExtendedInformationExtraField0.getRelativeHeaderOffset();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNull(zipEightByteInteger7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) (byte) 10, byteArray11, 26625, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26633");
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.find(100);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unrecognizedExtraField0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unrecognizedExtraField0.getLocalFileDataLength();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean20 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray18, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior22 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray23 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray18, false, extraFieldParsingBehavior22);
        boolean boolean25 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray18, 32768);
        unrecognizedExtraField0.parseFromLocalFileData(byteArray18, (int) (short) 2, (int) (byte) 100);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray29 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel30 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray29);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream31 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel30);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream33 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream31, (short) (byte) 1);
        byte[] byteArray35 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray35);
        cpioArchiveOutputStream33.write(byteArray35, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromCentralDirectoryData(byteArray35, (int) (byte) 48, 504);
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(seekableByteChannelArray29);
        org.junit.Assert.assertNotNull(seekableByteChannel30);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[97, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray36);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.lang.String str4 = tarArchiveEntry2.getName();
        long long5 = tarArchiveEntry2.getSize();
        java.lang.String str7 = tarArchiveEntry2.getExtraPaxHeader("apk");
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "deflate64" + "'", str4, "deflate64");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
            long long20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray18, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 83");
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withNiceBackReferenceLength(1000);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder6.tunedForSpeed();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        pack200CompressorInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) pack200CompressorInputStream2, "\000\000", false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField2 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = null;
        unrecognizedExtraField2.setHeaderId(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = unrecognizedExtraField2.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray8 = zipLong7.getBytes();
        boolean boolean10 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray8, 32768);
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, 0);
        unrecognizedExtraField2.setCentralDirectoryData(byteArray8);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = unrecognizedExtraField2.getLocalFileDataLength();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unrecognizedExtraField2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zipShort14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.io.File file0 = null;
        char[] charArray5 = new char[] { ' ', '#', '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, 4,  ]");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream gzipCompressorInputStream21 = new org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream((java.io.InputStream) framedSnappyCompressorInputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNull(path10);
        org.junit.Assert.assertNotNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + framedSnappyDialect19 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect19.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference(84446, 508);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType3 = backReference2.getType();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType4 = backReference2.getType();
        java.lang.String str5 = backReference2.toString();
        org.junit.Assert.assertTrue("'" + blockType3 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE + "'", blockType3.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE));
        org.junit.Assert.assertTrue("'" + blockType4 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE + "'", blockType4.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.BACK_REFERENCE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BackReference with offset 84446 and length 508" + "'", str5, "BackReference with offset 84446 and length 508");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = brotliCompressorInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        zipArchiveOutputStream1.setUseLanguageEncodingFlag(false);
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream11 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, strMap10);
        byte[] byteArray12 = new byte[] {};
        pack200CompressorOutputStream11.write(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.writePreamble(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = tarArchiveInputStream4.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI;
        org.junit.Assert.assertTrue("'" + sEGMENT_TYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI + "'", sEGMENT_TYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(1000, true, 16877);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix21 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray22 = x7875_NewUnix21.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField27 = extraFieldParsingMode0.onUnparseableExtraField(byteArray22, (int) ' ', 156, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        java.io.File file11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry13 = sevenZOutputFile10.createArchiveEntry(file11, "");
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy13 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream12, pack200Strategy13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream19 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream18);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer20 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap21 = packer20.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream19, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, pack200Strategy13, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream24 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = deflate64CompressorInputStream24.read();
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy13);
        org.junit.Assert.assertNotNull(packer20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        zipArchiveOutputStream2.setUseLanguageEncodingFlag(true);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS1.getModifyTime();
        java.util.Date date3 = x000A_NTFS1.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = x000A_NTFS1.getModifyTime();
        zip64ExtendedInformationExtraField0.setRelativeHeaderOffset(zipEightByteInteger4);
        long long6 = zipEightByteInteger4.getLongValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        java.lang.String str1 = dumpArchiveEntry0.getName();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.nio.file.Path path12 = null;
        java.nio.file.LinkOption linkOption14 = null;
        java.nio.file.LinkOption[] linkOptionArray15 = new java.nio.file.LinkOption[] { linkOption14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry16 = tarArchiveOutputStream6.createArchiveEntry(path12, "0x7875 Zip Extra Field: UID=1000 GID=1000", linkOptionArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(linkOptionArray15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        java.nio.file.attribute.FileTime fileTime6 = jarArchiveEntry1.getLastAccessTime();
        boolean boolean7 = jarArchiveEntry1.isDirectory();
        jarArchiveEntry1.setVersionMadeBy(40960);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        boolean boolean1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isCompressedFilename("xz");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        java.io.InputStream inputStream20 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream21 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream20);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream23 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream21, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy24 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream26 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream21, pack200Strategy24, strMap25);
        int int27 = pack200CompressorInputStream26.read();
        java.io.File file28 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("ustar ", (java.io.InputStream) pack200CompressorInputStream26, file28);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: ustar  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pack200Strategy24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 80 + "'", int27 == 80);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        java.lang.String str31 = tarArchiveEntry11.getLinkName();
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(3);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.parseTarHeader(byteArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:19:38 CEST 2023");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:19:38 CEST 2023");
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[3, 0]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        pack200CompressorOutputStream3.flush();
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("deflate64");
        int int2 = cpioArchiveEntry1.getAlignmentBoundary();
        cpioArchiveEntry1.setName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.nio.file.Path path15 = null;
        java.nio.file.LinkOption linkOption17 = null;
        java.nio.file.LinkOption[] linkOptionArray18 = new java.nio.file.LinkOption[] { linkOption17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry19 = tarArchiveOutputStream6.createArchiveEntry(path15, "\000\000", linkOptionArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(linkOptionArray18);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        tarArchiveOutputStream6.setBigNumberMode(100);
        java.io.File file18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = tarArchiveOutputStream6.createArchiveEntry(file18, "xz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = tarArchiveInputStream4.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current ar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream1 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream(outputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ATIMELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream4 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = zipArchiveInputStream1.getCompressedCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        java.lang.String str4 = brotliCompressorInputStream3.toString();
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        cpioArchiveEntry6.setUID(29L);
        int int17 = cpioArchiveEntry6.getHeaderPadCount();
        int int19 = cpioArchiveEntry6.getHeaderPadCount((long) 12);
        boolean boolean20 = cpioArchiveEntry6.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry23 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path24 = tarArchiveEntry23.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path28 = tarArchiveEntry27.getPath();
        java.nio.file.attribute.FileTime fileTime29 = null;
        tarArchiveEntry27.setCreationTime(fileTime29);
        java.nio.file.attribute.FileTime fileTime31 = tarArchiveEntry27.getLastModifiedTime();
        tarArchiveEntry23.setLastAccessTime(fileTime31);
        boolean boolean33 = tarArchiveEntry23.isGNULongNameEntry();
        java.nio.file.attribute.FileTime fileTime34 = tarArchiveEntry23.getLastModifiedTime();
        cpioArchiveEntry6.setTime(fileTime34);
        long long36 = cpioArchiveEntry6.getMode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNull(path28);
        org.junit.Assert.assertNotNull(fileTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fileTime34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32768L + "'", long36 == 32768L);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean6 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray4, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior8 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, extraFieldParsingBehavior8);
        boolean boolean11 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 32768);
        unrecognizedExtraField0.setLocalFileDataData(byteArray4);
        byte[] byteArray13 = unrecognizedExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray13, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("data descriptor");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.lang.String str7 = zipArchiveOutputStream6.getEncoding();
        boolean boolean8 = zipArchiveOutputStream6.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date12 = cpioArchiveEntry11.getLastModifiedDate();
        cpioArchiveEntry11.setRemoteDeviceMaj((long) 'a');
        int int15 = cpioArchiveEntry11.getAlignmentBoundary();
        boolean boolean16 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry11);
        zipArchiveOutputStream6.setComment("pack.code.attribute.");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream20 = archiveStreamFactory0.createArchiveOutputStream("LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false", (java.io.OutputStream) zipArchiveOutputStream6, "arj");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTF8" + "'", str7, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(path0, "apkm", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (short) 100);
        boolean boolean2 = resourceAlignmentExtraField1.allowMethodChange();
        short short3 = resourceAlignmentExtraField1.getAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withMaxNumberOfCandidates(40960);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters7 = builder6.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(parameters7);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (short) 100);
        byte[] byteArray3 = resourceAlignmentExtraField2.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 0]");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.setComment("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        long long6 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        byte[] byteArray2 = x0017_StrongEncryptionHeader0.getCentralDirectoryData();
        long long3 = x0017_StrongEncryptionHeader0.getRecordCount();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = x0017_StrongEncryptionHeader0.getHeaderId();
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
        byte[] byteArray23 = jarArchiveEntry6.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray23, 128, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 128");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(unparseableExtraFieldData7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS6 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = x000A_NTFS6.getModifyTime();
        java.util.Date date8 = x000A_NTFS6.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        java.nio.file.attribute.FileTime fileTime13 = null;
        tarArchiveEntry11.setCreationTime(fileTime13);
        int int15 = tarArchiveEntry11.getUserId();
        java.util.Date date16 = tarArchiveEntry11.getModTime();
        x000A_NTFS6.setCreateJavaTime(date16);
        java.util.Date date18 = x000A_NTFS6.getCreateJavaTime();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS6);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS20 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger21 = x000A_NTFS20.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel22);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream23, strMap24);
        byte[] byteArray26 = new byte[] {};
        pack200CompressorOutputStream25.write(byteArray26);
        x000A_NTFS20.parseFromCentralDirectoryData(byteArray26, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = x000A_NTFS20.getAccessTime();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry34 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date35 = cpioArchiveEntry34.getLastModifiedDate();
        x000A_NTFS20.setModifyJavaTime(date35);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry39 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path40 = tarArchiveEntry39.getPath();
        java.lang.String str41 = tarArchiveEntry39.getName();
        boolean boolean42 = tarArchiveEntry39.isFile();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp43 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong44 = x5455_ExtendedTimestamp43.getAccessTime();
        byte[] byteArray45 = x5455_ExtendedTimestamp43.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry48 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path49 = tarArchiveEntry48.getPath();
        java.nio.file.attribute.FileTime fileTime50 = null;
        tarArchiveEntry48.setCreationTime(fileTime50);
        java.nio.file.attribute.FileTime fileTime52 = tarArchiveEntry48.getLastModifiedTime();
        x5455_ExtendedTimestamp43.setAccessFileTime(fileTime52);
        tarArchiveEntry39.setLastModifiedTime(fileTime52);
        x000A_NTFS20.setModifyFileTime(fileTime52);
        x000A_NTFS6.setModifyFileTime(fileTime52);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:19:40 CEST 2023");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Mon Jun 19 23:19:40 CEST 2023");
        org.junit.Assert.assertNotNull(zipEightByteInteger21);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger31);
        org.junit.Assert.assertNotNull(date35);
        org.junit.Assert.assertEquals(date35.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNull(path40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "deflate64" + "'", str41, "deflate64");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(zipLong44);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray45), "[0]");
        org.junit.Assert.assertNull(path49);
        org.junit.Assert.assertNotNull(fileTime52);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong(10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap1 = compressorStreamFactory0.getCompressorOutputStreamProviders();
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream4, strMap5);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream7 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream8 = compressorStreamFactory0.createCompressorOutputStream("`\n", (java.io.OutputStream) pack200CompressorOutputStream6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: `? not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str2 = x000A_NTFS1.toString();
        java.lang.String str3 = x000A_NTFS1.toString();
        java.lang.String str4 = x000A_NTFS1.toString();
        byte[] byteArray5 = x000A_NTFS1.getCentralDirectoryData();
        int int7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray5, 21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField10 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("", byteArray5, (int) (byte) 53, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str3, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str4, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.FILE_TYPE_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 61440 + "'", int0 == 61440);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("data descriptor");
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap3 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.lang.String str4 = archiveStreamFactory0.getEntryEncoding();
        java.io.InputStream inputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream8 = archiveStreamFactory0.createArchiveInputStream("tar\000", inputStream6, "apkm.xz");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: InputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "data descriptor" + "'", str4, "data descriptor");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("false");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        arArchiveInputStream2.close();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, (int) '#', 257);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry9 = arArchiveInputStream2.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: The stream is closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry10 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int11 = arjArchiveEntry10.getHostOs();
        boolean boolean12 = arjArchiveEntry10.isDirectory();
        org.apache.commons.compress.archivers.examples.Expander expander13 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray14 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray14);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.tar.TarFile tarFile17 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path21 = tarArchiveEntry20.getPath();
        java.nio.file.attribute.FileTime fileTime22 = null;
        tarArchiveEntry20.setCreationTime(fileTime22);
        long long24 = tarArchiveEntry20.getSize();
        java.io.InputStream inputStream25 = tarFile17.getInputStream(tarArchiveEntry20);
        java.nio.file.Path path26 = null;
        expander13.expand(tarFile17, path26);
        boolean boolean28 = arjArchiveEntry10.equals((java.lang.Object) tarFile17);
        java.nio.file.Path path29 = null;
        expander0.expand(tarFile17, path29);
        java.nio.file.Path path31 = null;
        java.nio.file.Path path32 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path31, path32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(seekableByteChannelArray14);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNull(path21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry5.setCreationTime(fileTime7);
        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry5.getLastModifiedTime();
        x5455_ExtendedTimestamp0.setAccessFileTime(fileTime9);
        boolean boolean11 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp0.getAccessTime();
        java.util.Date date13 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean19 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray17, (int) (short) -1);
        boolean boolean21 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray17, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromCentralDirectoryData(byteArray17, 131, 67324752);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 131");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertNotNull(fileTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(zipLong12);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Mon Jun 19 23:19:40 CEST 2023");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getSize();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray0, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getOutputStreamArchiveNames();
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        boolean boolean1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.isCompressedFilename("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.math.BigInteger bigInteger12 = zipEightByteInteger11.getValue();
        java.math.BigInteger bigInteger13 = zipEightByteInteger11.getValue();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS2 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = x000A_NTFS2.getModifyTime();
        java.lang.String str4 = zipEightByteInteger3.toString();
        byte[] byteArray5 = zipEightByteInteger3.getBytes();
        byte[] byteArray6 = zipEightByteInteger3.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ZipEightByteInteger value: 0" + "'", str4, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 51, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry6 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry6);
        java.io.File file8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveOutputStream1.createArchiveEntry(file8, "apkm.xz");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream6 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream2, true, 16877);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile("070702", "LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: 070702");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy13 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream12, pack200Strategy13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream19 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream18);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer20 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap21 = packer20.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream19, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, pack200Strategy13, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters24 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters24.setWithZlibHeader(false);
        int int27 = deflateParameters24.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream28 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, deflateParameters24);
        int int29 = pack200CompressorInputStream6.available();
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy13);
        org.junit.Assert.assertNotNull(packer20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "pack.code.attribute..lzma");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.compress.changes.ChangeSetResults changeSetResults0 = new org.apache.commons.compress.changes.ChangeSetResults();
        java.util.List<java.lang.String> strList1 = changeSetResults0.getDeleted();
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil3 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap1, ".lzma");
        java.lang.String str5 = fileNameUtil3.getCompressedFilename(".bz2");
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ".bz2.lzma" + "'", str5, ".bz2.lzma");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 155, (int) (byte) 52, "apk", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile12 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile unknown archive");
        } catch (java.io.IOException e) {
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
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        tarArchiveEntry2.setMode(131);
        java.lang.String str6 = tarArchiveEntry2.getName();
        int int7 = tarArchiveEntry2.getUserId();
        boolean boolean8 = tarArchiveEntry2.isCheckSumOK();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "deflate64" + "'", str6, "deflate64");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.util.zip.ZipEntry zipEntry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(zipEntry0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        tarArchiveOutputStream6.setBigNumberMode(263);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = x000A_NTFS0.getAccessTime();
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            x000A_NTFS0.parseFromCentralDirectoryData(byteArray14, 2048, 488);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Mon Jun 19 23:19:42 CEST 2023");
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Jun 19 23:19:42 CEST 2023");
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        java.nio.file.attribute.FileTime fileTime6 = jarArchiveEntry1.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource7 = jarArchiveEntry1.getCommentSource();
        int int8 = jarArchiveEntry1.getUnixMode();
        long long9 = jarArchiveEntry1.getCrc();
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertTrue("'" + commentSource7 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource7.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream(outputStream0, (short) (byte) 49, 65536);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        byte[] byteArray12 = x000A_NTFS0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipShort11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS0.getModifyTime();
        byte[] byteArray3 = x000A_NTFS0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.FIELD_ATTRIBUTE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.field.attribute." + "'", str0, "pack.field.attribute.");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str2 = feature1.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long5 = jarArchiveEntry4.getDataOffset();
        byte[] byteArray6 = jarArchiveEntry4.getRawName();
        jarArchiveEntry4.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException9 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField12 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry11.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField12);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException14 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry11);
        org.apache.commons.compress.compressors.CompressorException compressorException15 = new org.apache.commons.compress.compressors.CompressorException(".bz2.lzma", (java.lang.Throwable) unsupportedZipFeatureException14);
        org.junit.Assert.assertNotNull(feature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "data descriptor" + "'", str2, "data descriptor");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder8 = builder6.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters9 = builder8.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters10 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, true, false, false, parameters9);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters11 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters12 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(parameters9);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        java.lang.String str5 = zipArchiveOutputStream1.getEncoding();
        zipArchiveOutputStream1.setEncoding("lz4-block.xz");
        int int8 = zipArchiveOutputStream1.getCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        long long5 = cpioArchiveEntry2.getGID();
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        boolean boolean7 = cpioArchiveEntry2.isSocket();
        cpioArchiveEntry2.setInode((long) 12);
        cpioArchiveEntry2.setChksum(156L);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream4);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.io.File file20 = null;
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("0x7875 Zip Extra Field: UID=1000 GID=1000", file20, file21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_1 = new org.apache.commons.compress.compressors.lz4.XXHash32(1);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField2 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray5 = zipLong4.getBytes();
        boolean boolean7 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray5, 32768);
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray5, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode11 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray5, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode11);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock15 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray5, 488, (int) (short) 2);
        unicodePathExtraField2.setUnicodeName(byteArray5);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean20 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray18, 3);
        boolean boolean22 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray18, (int) (byte) 53);
        long long25 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray18, 1, 476);
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray18, 16877);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray18);
        unicodePathExtraField2.setUnicodeName(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            xXHash32_1.update(byteArray18, (int) (short) 2, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode11 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode11.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray7 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray7);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        char[] charArray11 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8, charArray11);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray11);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile13.write(40960);
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
        org.junit.Assert.assertNotNull(seekableByteChannelArray7);
        org.junit.Assert.assertNotNull(seekableByteChannel8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = jarArchiveEntry2.getExtraFields(true);
        boolean boolean5 = jarArchiveEntry2.isUnixSymlink();
        boolean boolean6 = generalPurposeBit0.equals((java.lang.Object) boolean5);
        boolean boolean7 = generalPurposeBit0.usesEncryption();
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = builder1.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, sevenZFileOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setDeflateStrategy((int) (short) 3);
        gzipParameters0.setBufferSize((int) (byte) 10);
        gzipParameters0.setDeflateStrategy((int) (byte) 1);
        gzipParameters0.setDeflateStrategy(0);
        gzipParameters0.setDeflateStrategy((int) (byte) 100);
        gzipParameters0.setFilename(".bz2.lzma");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        int int7 = jarArchiveInputStream4.getCount();
        long long9 = jarArchiveInputStream4.skip(97L);
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("ZipEightByteInteger value: 0", 0L, 488, 1000, (int) (byte) 52, (long) 1024);
        boolean boolean7 = arArchiveEntry6.isDirectory();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        boolean boolean4 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        boolean boolean6 = tarArchiveEntry2.isGNULongNameEntry();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse2 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse(0L, (long) 476);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField5 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry4.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField5);
        byte[] byteArray7 = jarArchiveEntry4.getCentralDirectoryExtra();
        int int8 = jarArchiveEntry4.getVersionMadeBy();
        java.lang.Object obj9 = jarArchiveEntry4.clone();
        boolean boolean10 = jarArchiveEntry4.isDirectory();
        long long11 = jarArchiveEntry4.getExternalAttributes();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS13 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = x000A_NTFS13.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        byte[] byteArray19 = new byte[] {};
        pack200CompressorOutputStream18.write(byteArray19);
        x000A_NTFS13.parseFromCentralDirectoryData(byteArray19, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort24 = x000A_NTFS13.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField25 = extraFieldParsingMode12.createExtraField(zipShort24);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField26 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray27 = unrecognizedExtraField26.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort28 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray29 = zipShort28.getBytes();
        java.lang.Object obj30 = zipShort28.clone();
        unrecognizedExtraField26.setHeaderId(zipShort28);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField32 = extraFieldParsingMode12.createExtraField(zipShort28);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong34 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray35 = zipLong34.getBytes();
        boolean boolean37 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray35, 32768);
        boolean boolean39 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray35, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode41 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray42 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray35, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode41);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock45 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray35, 488, (int) (short) 2);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField50 = extraFieldParsingMode12.onUnparseableExtraField(byteArray35, 0, 32768, false, (int) (byte) 54);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray51 = jarArchiveEntry4.getExtraFields((org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode12);
        boolean boolean52 = tarArchiveStructSparse2.equals((java.lang.Object) jarArchiveEntry4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "bzip2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "bzip2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "bzip2");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode12 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode12.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipEightByteInteger14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertNotNull(zipShort24);
        org.junit.Assert.assertNotNull(zipExtraField25);
        org.junit.Assert.assertNull(byteArray27);
        org.junit.Assert.assertNotNull(zipShort28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[30, -95]");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "ZipShort value: 41246");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "ZipShort value: 41246");
        org.junit.Assert.assertNotNull(zipExtraField32);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode41 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode41.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray42);
        org.junit.Assert.assertNotNull(zipExtraField50);
        org.junit.Assert.assertNotNull(zipExtraFieldArray51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        long long3 = cpioArchiveEntry2.getMode();
        cpioArchiveEntry2.setSize((long) 8192);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32768L + "'", long3 == 32768L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.util.Date date2 = x000A_NTFS0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod4 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        boolean boolean5 = zipEightByteInteger3.equals((java.lang.Object) sevenZMethod4);
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters6 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters6.setDeflateStrategy((int) (short) 3);
        gzipParameters6.setBufferSize((int) (byte) 10);
        gzipParameters6.setDeflateStrategy((int) (byte) 1);
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration13 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod4, (java.lang.Object) (byte) 1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray15 = zipShort14.getBytes();
        boolean boolean17 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray15, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray19 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray15, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration20 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod4, (java.lang.Object) zipExtraFieldArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DEFLATE64 method doesn't support options of type class [Lorg.apache.commons.compress.archivers.zip.ZipExtraField;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(zipEightByteInteger3);
        org.junit.Assert.assertTrue("'" + sevenZMethod4 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod4.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray19);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long4 = zipArchiveInputStream1.getUncompressedCount();
        long long6 = zipArchiveInputStream1.skip(0L);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 0, (int) (byte) 50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = zipArchiveInputStream1.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.PACK200;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack200" + "'", str0, "pack200");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(inputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream14 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream(inputStream11, 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        long long4 = jarArchiveEntry1.getDataOffset();
        boolean boolean5 = jarArchiveEntry1.isUnixSymlink();
        java.nio.file.attribute.FileTime fileTime6 = jarArchiveEntry1.getLastAccessTime();
        java.lang.String str7 = jarArchiveEntry1.getName();
        jarArchiveEntry1.setMethod(7);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(fileTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bzip2" + "'", str7, "bzip2");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) framedSnappyCompressorInputStream3, 100, 508);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream7 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) tarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField2);
        byte[] byteArray4 = jarArchiveEntry1.getCentralDirectoryExtra();
        long long5 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(byteArray4);
        long long6 = org.apache.commons.compress.archivers.tar.TarUtils.computeCheckSum(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 172318L + "'", long5 == 172318L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 193L + "'", long6 == 193L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte4 = tarArchiveEntry3.getLinkFlag();
        tarArchiveEntry3.setModTime((long) (byte) 76);
        tarArchiveEntry3.setGroupId(64);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray9 = tarArchiveEntry3.getDirectoryEntries();
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry3);
        boolean boolean11 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 48 + "'", byte4 == (byte) 48);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry(path0, "`\n", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) deflateCompressorOutputStream16, "TRAILER!!!");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: TRAILER!!!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        unicodeCommentExtraField0.setNameCRC32((long) 12);
        byte[] byteArray3 = unicodeCommentExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray5 = jarMarker4.getLocalFileDataData();
        byte[] byteArray6 = jarMarker4.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField0.parseFromLocalFileData(byteArray6, 65535, (int) (short) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65535");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = cpioArchiveOutputStream4.createArchiveEntry(file5, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-19T21:19:20.457Z] ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.dosToJavaTime((long) 263);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 312764894000L + "'", long1 == 312764894000L);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream5, "snappy-framed");
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream8, "deflate64");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream14 = archiveStreamFactory0.createArchiveOutputStream("bzip2", (java.io.OutputStream) jarArchiveOutputStream12, "070707");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: bzip2 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor3 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore2);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream4 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore1, streamCompressor3);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream5 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor3);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray6 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8, (short) (byte) 1);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray12);
        cpioArchiveOutputStream10.write(byteArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor3.writeCounted(byteArray12, 100, (int) (short) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor3);
        org.junit.Assert.assertNotNull(seekableByteChannelArray6);
        org.junit.Assert.assertNotNull(seekableByteChannel7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[97, 0]");
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setChksum(0L);
        boolean boolean6 = cpioArchiveEntry2.isSocket();
        cpioArchiveEntry2.setRemoteDeviceMaj(1687209545L);
        boolean boolean9 = cpioArchiveEntry2.isSocket();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray11, 3);
        boolean boolean15 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray11, (int) (byte) 53);
        boolean boolean17 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray11, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarFile tarFile18 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray11);
        java.io.File file19 = null;
        expander0.expand(tarFile18, file19);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream21);
        zipArchiveInputStream22.mark((int) (byte) -1);
        java.io.File file25 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) zipArchiveInputStream22, file25);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        pack200CompressorInputStream2.mark((int) '4');
        boolean boolean5 = pack200CompressorInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream7 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) pack200CompressorInputStream2, true);
            org.junit.Assert.fail("Expected exception of type org.tukaani.xz.XZFormatException; message: Input is not in the XZ format");
        } catch (org.tukaani.xz.XZFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean3 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray1, 3);
        boolean boolean5 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray1, (int) (byte) 53);
        boolean boolean7 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.archivers.tar.TarUtils.parseBoolean(byteArray1, (int) (byte) 50);
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        boolean boolean4 = tarArchiveEntry2.isGlobalPaxHeader();
        boolean boolean5 = tarArchiveEntry2.isDirectory();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray6 = tarArchiveEntry2.getDirectoryEntries();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray6);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray1, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("BackReference with offset 84446 and length 508", (long) 1024);
        java.lang.String str3 = arArchiveEntry2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "BackReference with offset 84446 and length 508" + "'", str3, "BackReference with offset 84446 and length 508");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        boolean boolean3 = zipArchiveOutputStream1.isSeekable();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.flush();
        zipArchiveOutputStream1.setMethod((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField10 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry9.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField10);
        java.nio.file.attribute.FileTime fileTime12 = jarArchiveEntry9.getLastAccessTime();
        java.nio.file.attribute.FileTime fileTime13 = jarArchiveEntry9.getLastAccessTime();
        long long14 = jarArchiveEntry9.getDataOffset();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream19 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream16);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy20 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream21 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream19, pack200Strategy20);
        int int22 = jarArchiveInputStream19.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.addRawArchiveEntry((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry9, (java.io.InputStream) jarArchiveInputStream19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(fileTime12);
        org.junit.Assert.assertNull(fileTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(pack200Strategy20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        archiveStreamFactory0.setEntryEncoding("data descriptor");
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.Set<java.lang.String> strSet4 = archiveStreamFactory0.getOutputStreamArchiveNames();
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        byte[] byteArray3 = jarArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        boolean boolean8 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray6, (int) (byte) 76);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = jarArchiveEntry1.getExtraField(zipShort9);
        java.util.jar.Attributes attributes11 = jarArchiveEntry1.getManifestAttributes();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(zipExtraField10);
        org.junit.Assert.assertNull(attributes11);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.String str18 = tarArchiveEntry9.getName();
        long long19 = tarArchiveEntry9.getRealSize();
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertNull(path10);
        org.junit.Assert.assertNotNull(fileTime13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "deflate64" + "'", str18, "deflate64");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        java.lang.Object obj1 = zipShort0.clone();
        int int2 = zipShort0.getValue();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "ZipShort value: 25461");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25461 + "'", int2 == 25461);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        byte[] byteArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            framedLZ4CompressorOutputStream18.write(byteArray19, 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockSize8 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize8.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        java.lang.Object obj1 = zipShort0.clone();
        java.lang.Object obj2 = zipShort0.clone();
        org.junit.Assert.assertNotNull(zipShort0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "ZipShort value: 25461");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "ZipShort value: 25461");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "ZipShort value: 25461");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = builder1.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder1.withMaxMemoryLimitInKb(4096);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = builder1.build();
        int int6 = sevenZFileOptions5.getMaxMemoryLimitInKb();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sevenZFileOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4096 + "'", int6 == 4096);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        java.nio.file.Path path19 = null;
        java.nio.file.LinkOption[] linkOptionArray21 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = arArchiveOutputStream18.createArchiveEntry(path19, "", linkOptionArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(linkOptionArray21);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        int int9 = tarArchiveOutputStream6.getRecordSize();
        int int10 = tarArchiveOutputStream6.getCount();
        tarArchiveOutputStream6.setBigNumberMode(4096);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream13 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        java.nio.file.Path path19 = null;
        java.nio.file.LinkOption linkOption21 = null;
        java.nio.file.LinkOption[] linkOptionArray22 = new java.nio.file.LinkOption[] { linkOption21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = arArchiveOutputStream18.createArchiveEntry(path19, "false", linkOptionArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(linkOptionArray22);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (short) 100);
        byte[] byteArray2 = resourceAlignmentExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        zip64ExtendedInformationExtraField3.setDiskStartNumber(zipLong5);
        byte[] byteArray8 = zipLong5.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField1.parseFromLocalFileData(byteArray8, 156, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Too short content for ResourceAlignmentExtraField (0xa11e): 0");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
            org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 488);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) tarArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = tarArchiveInputStream5.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream2, strMap3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream4);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream4, "snappy-framed");
        tarArchiveOutputStream7.setLongFileMode((int) (byte) 120);
        tarArchiveOutputStream7.setAddPaxHeadersForNonAsciiNames(false);
        java.nio.file.Path path12 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream7, path12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLength();
        boolean boolean6 = arArchiveEntry2.isDirectory();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209587L + "'", long3 == 1687209587L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm1 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(257);
        org.junit.Assert.assertNull(encryptionAlgorithm1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField();
        unicodeCommentExtraField0.setNameCRC32((long) 12);
        byte[] byteArray3 = unicodeCommentExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unicodeCommentExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = unicodeCommentExtraField0.getCentralDirectoryLength();
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters3 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        boolean boolean4 = deflateParameters3.withZlibHeader();
        deflateParameters3.setCompressionLevel(8);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zipArchiveInputStream1, deflateParameters3);
        int int8 = deflateParameters3.getCompressionLevel();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray21 = zipLong20.getBytes();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray21, 0);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream18.write(byteArray21, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        boolean boolean6 = cpioArchiveEntry2.isBlockDevice();
        long long7 = cpioArchiveEntry2.getNumberOfLinks();
        boolean boolean8 = cpioArchiveEntry2.isCharacterDevice();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.changes.ChangeSetPerformer changeSetPerformer1 = new org.apache.commons.compress.changes.ChangeSetPerformer(changeSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer16 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap17 = packer16.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil19 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap17, ".lzma");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, (java.util.Map<java.lang.String, java.lang.String>) strMap17);
        int int21 = pack200CompressorInputStream20.read();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(packer16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 80 + "'", int21 == 80);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        byte[] byteArray0 = null;
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        boolean boolean6 = zipEncoding4.canEncode("a\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray0, 24576, 16384, zipEncoding4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile4 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "lz4-block.xz", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.BLOCK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 512 + "'", int0 == 512);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64");
        java.nio.file.attribute.FileTime fileTime2 = tarArchiveEntry1.getLastAccessTime();
        long long3 = tarArchiveEntry1.getLongGroupId();
        byte byte4 = tarArchiveEntry1.getLinkFlag();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField5 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean11 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray9, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior13 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray14 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray9, false, extraFieldParsingBehavior13);
        boolean boolean16 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray9, 32768);
        unrecognizedExtraField5.setLocalFileDataData(byteArray9);
        byte[] byteArray18 = unrecognizedExtraField5.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding19 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.parseTarHeader(byteArray18, zipEncoding19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 48 + "'", byte4 == (byte) 48);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 1, 1]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark((int) (byte) -1);
        long long20 = zipArchiveInputStream16.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream22, strMap23);
        byte[] byteArray25 = new byte[] {};
        pack200CompressorOutputStream24.write(byteArray25);
        int int29 = zipArchiveInputStream16.read(byteArray25, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField31 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray25, false, unparseableExtraField31);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream14.write(byteArray25, (int) (short) -1, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters4 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, true, true, false);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters8 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, false, false, true);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        int int14 = cpioArchiveEntry13.getHeaderPadCount();
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry13);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = zipArchiveOutputStream1.createArchiveEntry(file16, "cpio");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException1 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = unsupportedZipFeatureException1.getFeature();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = unsupportedZipFeatureException1.getEntry();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertNull(zipArchiveEntry3);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, "unpack.progress");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(path0, "\000\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 255);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream6 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream6, 1000, ".lzma");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: .lzma");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.io.File file0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy6 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream5, pack200Strategy6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0, "pack.class.attribute.");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getCrc();
        java.lang.Object obj3 = jarArchiveEntry1.clone();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "bzip2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "bzip2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "bzip2");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "0x5455 Zip Extra Field: Flags=0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 1, path1, "UTF8", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        long long7 = tarArchiveEntry2.getRealSize();
        tarArchiveEntry2.setGroupId((int) ' ');
        boolean boolean10 = tarArchiveEntry2.isGNUSparse();
        boolean boolean11 = tarArchiveEntry2.isBlockDevice();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64");
        java.nio.file.attribute.FileTime fileTime2 = tarArchiveEntry1.getLastAccessTime();
        long long3 = tarArchiveEntry1.getLongGroupId();
        tarArchiveEntry1.setUserName("never");
        byte byte6 = tarArchiveEntry1.getLinkFlag();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 48 + "'", byte6 == (byte) 48);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.apache.commons.compress.archivers.tar.TarUtils.verifyCheckSum(byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 148");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(inputStream11);
        org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) pack200CompressorInputStream12, 26625);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 24576);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = lZMACompressorInputStream14.read(byteArray16, (int) (byte) 48, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray11 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel12 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel12);
        char[] charArray20 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel12, charArray20);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel12);
        org.apache.commons.compress.archivers.tar.TarFile tarFile23 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel12);
        java.io.File file24 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("jar", seekableByteChannel12, file24);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: data descriptor");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(seekableByteChannelArray11);
        org.junit.Assert.assertNotNull(seekableByteChannel12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4, a,  , a, #, 4]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.compress.archivers.dump.ShortFileException shortFileException1 = new org.apache.commons.compress.archivers.dump.ShortFileException();
        org.apache.commons.compress.archivers.ArchiveException archiveException2 = new org.apache.commons.compress.archivers.ArchiveException("pack.method.attribute.", (java.lang.Exception) shortFileException1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray3 = zipShort2.getBytes();
        boolean boolean5 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byteArray3, (int) 'a');
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("tar", byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) 60012, byteArray3, 263, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 764");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2, (short) (byte) 1);
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = cpioArchiveOutputStream4.createArchiveEntry(file5, "pack.field.attribute.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        long long5 = cpioArchiveEntry2.getGID();
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        cpioArchiveEntry2.setSize((long) 32768);
        long long9 = cpioArchiveEntry2.getRemoteDeviceMaj();
        boolean boolean10 = cpioArchiveEntry2.isCharacterDevice();
        long long11 = cpioArchiveEntry2.getGID();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1, inputStreamSupplier3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry1.removeExtraField(zipShort5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier3 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable4 = parallelScatterZipCreator2.createCallable(zipArchiveEntryRequestSupplier3);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator1.submitStreamAwareCallable(scatterZipOutputStreamCallable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable4);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore0);
        long long2 = streamCompressor1.getTotalBytesWritten();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField3 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean9 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray7, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior11 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray12 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray7, false, extraFieldParsingBehavior11);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray7, 32768);
        unrecognizedExtraField3.setLocalFileDataData(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor1.writeCounted(byteArray7, 80, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        long long9 = pack200CompressorInputStream6.skip(1687209505L);
        int int10 = pack200CompressorInputStream6.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream12 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, (int) (byte) 88);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = jarArchiveEntry2.getUnparseableExtraFieldData();
        boolean boolean4 = jarArchiveEntry2.isStreamContiguous();
        long long5 = jarArchiveEntry2.getDataOffset();
        boolean boolean6 = jarArchiveEntry2.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS7 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = x000A_NTFS7.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream10, strMap11);
        byte[] byteArray13 = new byte[] {};
        pack200CompressorOutputStream12.write(byteArray13);
        x000A_NTFS7.parseFromCentralDirectoryData(byteArray13, 64, 0);
        jarArchiveEntry2.setCentralDirectoryExtra(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(133316831493050000L, byteArray13, (int) (byte) 49, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 36912");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        x5455_ExtendedTimestamp0.setModifyTime(zipLong2);
        java.lang.String str5 = zipLong2.toString();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ZipLong value: -1" + "'", str5, "ZipLong value: -1");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray4 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray7 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray7);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        char[] charArray11 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8, charArray11);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile15 = new org.apache.commons.compress.archivers.zip.ZipFile(seekableByteChannel1, "keep");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Error on ZipFile unknown archive");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertNotNull(seekableByteChannelArray7);
        org.junit.Assert.assertNotNull(seekableByteChannel8);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withLazyThreshold(6);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withNiceBackReferenceLength(65536);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer16 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap17 = packer16.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil19 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap17, ".lzma");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, (java.util.Map<java.lang.String, java.lang.String>) strMap17);
        long long21 = zipArchiveInputStream1.getBytesRead();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream22 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a framed Snappy stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(packer16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        long long6 = tarArchiveEntry2.getSize();
        boolean boolean7 = tarArchiveEntry2.isCheckSumOK();
        java.nio.file.attribute.FileTime fileTime8 = tarArchiveEntry2.getLastAccessTime();
        java.io.File file9 = tarArchiveEntry2.getFile();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(fileTime8);
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        arArchiveOutputStream18.setLongFileMode((int) (byte) 52);
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
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        boolean boolean1 = org.apache.commons.compress.compressors.bzip2.BZip2Utils.isCompressedFilename("jar");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str1 = feature0.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long4 = jarArchiveEntry3.getDataOffset();
        byte[] byteArray5 = jarArchiveEntry3.getRawName();
        jarArchiveEntry3.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException8 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry3);
        java.lang.String str9 = jarArchiveEntry3.getName();
        int int10 = jarArchiveEntry3.getVersionMadeBy();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "data descriptor" + "'", str1, "data descriptor");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "bzip2" + "'", str9, "bzip2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 26625, 511, "pack.effort", true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 257, 4095, "LZ4 Parameters with BlockSize M1, withContentChecksum true, withBlockChecksum false, withBlockDependency false", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: LZ4 Parameters with BlockSize M1, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(504);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-8, 1]");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream5 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream3, strMap4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream5, "snappy-framed");
        tarArchiveOutputStream8.setAddPaxHeadersForNonAsciiNames(false);
        int int11 = tarArchiveOutputStream8.getRecordSize();
        int int12 = tarArchiveOutputStream8.getCount();
        tarArchiveOutputStream8.finish();
        java.io.File file14 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("00", (java.io.OutputStream) tarArchiveOutputStream8, file14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: 00 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 512 + "'", int11 == 512);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS11 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = x000A_NTFS11.getModifyTime();
        java.util.Date date13 = x000A_NTFS11.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = x000A_NTFS11.getModifyTime();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod15 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        boolean boolean16 = zipEightByteInteger14.equals((java.lang.Object) sevenZMethod15);
        sevenZOutputFile10.setContentCompression(sevenZMethod15);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date21 = cpioArchiveEntry20.getLastModifiedDate();
        cpioArchiveEntry20.setRemoteDeviceMin((long) 12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path27 = tarArchiveEntry26.getPath();
        java.nio.file.attribute.FileTime fileTime28 = null;
        tarArchiveEntry26.setCreationTime(fileTime28);
        java.nio.file.attribute.FileTime fileTime30 = tarArchiveEntry26.getLastModifiedTime();
        cpioArchiveEntry20.setTime(fileTime30);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile10.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cannot be cast to org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(zipEightByteInteger14);
        org.junit.Assert.assertTrue("'" + sevenZMethod15 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod15.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNull(path27);
        org.junit.Assert.assertNotNull(fileTime30);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(488, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Padding must not be negative, was: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = jarArchiveEntry7.getUnparseableExtraFieldData();
        jarArchiveEntry7.setCompressedSize((long) 64);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature11 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException12 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature11);
        boolean boolean13 = jarArchiveEntry7.equals((java.lang.Object) unsupportedZipFeatureException12);
        boolean boolean14 = tarArchiveInputStream4.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry7);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveEntry7.setAlignment(4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid value for alignment, must be power of two and no bigger than 65535 but is 4095");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNotNull(feature11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        framedSnappyCompressorOutputStream4.finish();
        framedSnappyCompressorOutputStream4.finish();
        framedSnappyCompressorOutputStream4.finish();
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel8);
        java.lang.String str10 = zipArchiveOutputStream9.getEncoding();
        boolean boolean11 = zipArchiveOutputStream9.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date15 = cpioArchiveEntry14.getLastModifiedDate();
        cpioArchiveEntry14.setRemoteDeviceMaj((long) 'a');
        int int18 = cpioArchiveEntry14.getAlignmentBoundary();
        boolean boolean19 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry14);
        zipArchiveOutputStream9.setComment("pack.code.attribute.");
        java.io.InputStream inputStream22 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream22);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream25 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream23, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy26 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream28 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream23, pack200Strategy26, strMap27);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream30 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream9, pack200Strategy26, strMap29);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream31 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream4, pack200Strategy26);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS32 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger33 = x000A_NTFS32.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel34);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream37 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream35, strMap36);
        byte[] byteArray38 = new byte[] {};
        pack200CompressorOutputStream37.write(byteArray38);
        x000A_NTFS32.parseFromCentralDirectoryData(byteArray38, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort43 = x000A_NTFS32.getHeaderId();
        byte[] byteArray44 = x000A_NTFS32.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort45 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray44);
        pack200CompressorOutputStream31.write(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger48 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger(byteArray44, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 135");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF8" + "'", str10, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(pack200Strategy26);
        org.junit.Assert.assertNotNull(zipEightByteInteger33);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[]");
        org.junit.Assert.assertNotNull(zipShort43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        long long1 = org.apache.commons.compress.archivers.zip.ZipUtil.adjustToLong((int) (byte) 51);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 51L + "'", long1 == 51L);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        byte[] byteArray18 = jarArchiveEntry1.getLocalFileDataExtra();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setChksum(0L);
        boolean boolean6 = cpioArchiveEntry2.isSocket();
        long long7 = cpioArchiveEntry2.getDeviceMaj();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
            jarArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
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
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry(path0, ".bz2.lzma", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        cpioArchiveEntry6.setUID(29L);
        java.lang.String str17 = cpioArchiveEntry6.getName();
        boolean boolean18 = cpioArchiveEntry6.isBlockDevice();
        long long19 = cpioArchiveEntry6.getSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        long long9 = pack200CompressorInputStream6.skip(1687209505L);
        int int10 = pack200CompressorInputStream6.available();
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean14 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray12, 3);
        boolean boolean16 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray12, (int) (short) 2);
        int int17 = pack200CompressorInputStream6.read(byteArray12);
        boolean boolean19 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray12, 12);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger20 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        zipArchiveInputStream1.mark((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream26 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.util.jar.JarEntry jarEntry0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(jarEntry0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: entry");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(256);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry0 = null;
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest2 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry0, inputStreamSupplier1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray2 = zipLong1.getBytes();
        boolean boolean4 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray2, 32768);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray2, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray2, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode8);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock12 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray2, 488, (int) (short) 2);
        java.lang.String str13 = literalBlock12.toString();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType14 = literalBlock12.getType();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType blockType15 = literalBlock12.getType();
        byte[] byteArray16 = literalBlock12.getData();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray16, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "LiteralBlock starting at 488 with length 2" + "'", str13, "LiteralBlock starting at 488 with length 2");
        org.junit.Assert.assertTrue("'" + blockType14 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL + "'", blockType14.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL));
        org.junit.Assert.assertTrue("'" + blockType15 + "' != '" + org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL + "'", blockType15.equals(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.BlockType.LITERAL));
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        packer0.addPropertyChangeListener(propertyChangeListener2);
        java.util.jar.JarInputStream jarInputStream4 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6, strMap7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date12 = cpioArchiveEntry11.getLastModifiedDate();
        cpioArchiveEntry11.setRemoteDeviceMin((long) 12);
        boolean boolean15 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry11);
        long long16 = zipArchiveOutputStream6.getBytesWritten();
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters17 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters17.setWithZlibHeader(false);
        int int20 = deflateParameters17.getCompressionLevel();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream21 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6, deflateParameters17);
        deflateCompressorOutputStream21.write(511);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream24 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream21);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarInputStream4, (java.io.OutputStream) blockLZ4CompressorOutputStream24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setDeleted(false);
        dumpArchiveEntry0.setDeleted(false);
        int int5 = dumpArchiveEntry0.getVolume();
        boolean boolean6 = dumpArchiveEntry0.isFifo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream4 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, "snappy-framed");
        tarArchiveOutputStream6.setAddPaxHeadersForNonAsciiNames(false);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream10 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, "deflate64");
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream10, "cpio");
        jarArchiveOutputStream10.flush();
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        zipArchiveInputStream2.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream5 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry6 = jarArchiveInputStream5.getNextEntry();
        int int7 = jarArchiveInputStream5.getCount();
        java.io.File file8 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream5, file8);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry10 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int11 = arjArchiveEntry10.getHostOs();
        boolean boolean12 = arjArchiveEntry10.isDirectory();
        org.apache.commons.compress.archivers.examples.Expander expander13 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray14 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray14);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.tar.TarFile tarFile17 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path21 = tarArchiveEntry20.getPath();
        java.nio.file.attribute.FileTime fileTime22 = null;
        tarArchiveEntry20.setCreationTime(fileTime22);
        long long24 = tarArchiveEntry20.getSize();
        java.io.InputStream inputStream25 = tarFile17.getInputStream(tarArchiveEntry20);
        java.nio.file.Path path26 = null;
        expander13.expand(tarFile17, path26);
        boolean boolean28 = arjArchiveEntry10.equals((java.lang.Object) tarFile17);
        java.nio.file.Path path29 = null;
        expander0.expand(tarFile17, path29);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream32 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream31);
        zipArchiveInputStream32.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream35 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream32);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream38 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream35, 420, 32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry39 = jarArchiveInputStream35.getNextEntry();
        long long41 = jarArchiveInputStream35.skip(46947589L);
        jarArchiveInputStream35.close();
        java.io.File file43 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer44 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) jarArchiveInputStream35, file43, closeableConsumer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(seekableByteChannelArray14);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNull(path21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(inputStream25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(archiveEntry39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(closeableConsumer44);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getUncompressedFilename("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
            zipArchiveOutputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 2);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setRemoteDevice(1687209506L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile2 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "apkm");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        long long7 = cpioArchiveEntry2.getUID();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = cpioArchiveEntry2.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField15 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean21 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray19, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior23 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray19, false, extraFieldParsingBehavior23);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 32768);
        unrecognizedExtraField15.setLocalFileDataData(byteArray19);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream14.write(byteArray19, 16384, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        long long4 = arArchiveEntry2.getLength();
        java.util.Date date5 = arArchiveEntry2.getLastModifiedDate();
        int int6 = arArchiveEntry2.getMode();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209593L + "'", long3 == 1687209593L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Jun 19 23:19:53 CEST 2023");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 33188 + "'", int6 == 33188);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarUtils.formatUnsignedOctalString(0L, byteArray11, 155, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 411");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray6 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray6);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel7);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray10 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray10);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel11);
        org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel11);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray14 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray14);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile16 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray18 = new java.nio.channels.SeekableByteChannel[] { seekableByteChannel3, seekableByteChannel7, seekableByteChannel11, seekableByteChannel15 };
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray18);
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray18);
        java.io.File file21 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("tar.bz2", seekableByteChannel20, file21);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: tar.bz2 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(seekableByteChannelArray6);
        org.junit.Assert.assertNotNull(seekableByteChannel7);
        org.junit.Assert.assertNotNull(seekableByteChannelArray10);
        org.junit.Assert.assertNotNull(seekableByteChannel11);
        org.junit.Assert.assertNotNull(seekableByteChannelArray14);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNotNull(seekableByteChannelArray18);
        org.junit.Assert.assertNotNull(seekableByteChannel19);
        org.junit.Assert.assertNotNull(seekableByteChannel20);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        tarArchiveEntry1.setModTime((long) (byte) 76);
        tarArchiveEntry1.setGroupId(64);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry[] tarArchiveEntryArray7 = tarArchiveEntry1.getDirectoryEntries();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData10 = jarArchiveEntry9.getUnparseableExtraFieldData();
        boolean boolean11 = jarArchiveEntry9.isStreamContiguous();
        long long12 = jarArchiveEntry9.getDataOffset();
        boolean boolean13 = jarArchiveEntry9.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS14 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = x000A_NTFS14.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel16 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream17 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel16);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream19 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream17, strMap18);
        byte[] byteArray20 = new byte[] {};
        pack200CompressorOutputStream19.write(byteArray20);
        x000A_NTFS14.parseFromCentralDirectoryData(byteArray20, 64, 0);
        jarArchiveEntry9.setCentralDirectoryExtra(byteArray20);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding27 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean31 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 3);
        java.lang.String str32 = zipEncoding27.decode(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry1.writeEntryHeader(byteArray20, zipEncoding27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertNotNull(tarArchiveEntryArray7);
        org.junit.Assert.assertNull(unparseableExtraFieldData10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[]");
        org.junit.Assert.assertNotNull(zipEncoding27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "a\000" + "'", str32, "a\000");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.SPARSELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry5 = jarArchiveInputStream4.getNextEntry();
        int int6 = jarArchiveInputStream4.getCount();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = jarArchiveInputStream4.getNextJarEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream8 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) jarArchiveInputStream4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jarArchiveEntry7);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        long long16 = tarArchiveOutputStream6.getBytesWritten();
        java.io.InputStream inputStream17 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream17);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect19 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream20 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream17, framedSnappyDialect19);
        int int21 = framedSnappyCompressorInputStream20.available();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS22 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = x000A_NTFS22.getModifyTime();
        java.util.Date date24 = x000A_NTFS22.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = x000A_NTFS22.getModifyTime();
        byte[] byteArray26 = x000A_NTFS22.getCentralDirectoryData();
        int int29 = framedSnappyCompressorInputStream20.read(byteArray26, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray26, (int) (byte) 50, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Request to write '8' bytes exceeds size in header of '0' bytes for entry 'deflate64'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 512L + "'", long16 == 512L);
        org.junit.Assert.assertTrue("'" + framedSnappyDialect19 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect19.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(zipEightByteInteger23);
        org.junit.Assert.assertNull(date24);
        org.junit.Assert.assertNotNull(zipEightByteInteger25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        tarArchiveEntry1.setNames("ustar\000", "");
        java.lang.String str7 = tarArchiveEntry1.getExtraPaxHeader("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
        boolean boolean8 = tarArchiveEntry1.isOldGNUSparse();
        boolean boolean9 = tarArchiveEntry1.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = x000A_NTFS0.getModifyTime();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField3 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS4 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = x000A_NTFS4.getModifyTime();
        java.util.Date date6 = x000A_NTFS4.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = x000A_NTFS4.getModifyTime();
        zip64ExtendedInformationExtraField3.setRelativeHeaderOffset(zipEightByteInteger7);
        x000A_NTFS0.setCreateTime(zipEightByteInteger7);
        java.nio.file.attribute.FileTime fileTime10 = x000A_NTFS0.getAccessFileTime();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNull(fileTime10);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
        java.lang.Throwable[] throwableArray2 = dumpArchiveException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS;
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long4 = brotliCompressorInputStream3.getCompressedCount();
        java.lang.String str5 = brotliCompressorInputStream3.toString();
        long long6 = brotliCompressorInputStream3.getCompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) brotliCompressorInputStream3, "LiteralBlock starting at 488 with length 2", true, false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: LiteralBlock starting at 488 with length 2");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find((int) (short) 2);
        org.junit.Assert.assertTrue("'" + cOMPRESSION_TYPE1 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO + "'", cOMPRESSION_TYPE1.equals(org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        boolean boolean19 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray10, 26625);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        generalPurposeBit0.useEncryption(false);
        boolean boolean3 = generalPurposeBit0.usesEncryption();
        boolean boolean4 = generalPurposeBit0.usesStrongEncryption();
        boolean boolean5 = generalPurposeBit0.usesStrongEncryption();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm3 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker4 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray5 = jarMarker4.getLocalFileDataData();
        byte[] byteArray6 = jarMarker4.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFileFormat(byteArray6, 256, 3);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader is too short, only 3 bytes, expected at least 4");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(hashAlgorithm3);
        org.junit.Assert.assertNotNull(jarMarker4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream4, 420, 32);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = jarArchiveInputStream4.getNextEntry();
        long long10 = jarArchiveInputStream4.skip(46947589L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream12 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy13 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream12, pack200Strategy13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream19 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream18);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer20 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap21 = packer20.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream19, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, pack200Strategy13, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream24 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream25 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy13);
        org.junit.Assert.assertNotNull(packer20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setNlink(131);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 103 + "'", byte0 == (byte) 103);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        long long4 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.write(26625);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
            jarArchiveOutputStream10.setEncoding("ustar\000");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream4 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, (int) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray4 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        char[] charArray13 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel5, charArray13);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder15 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions16 = builder15.build();
        int int17 = sevenZFileOptions16.getMaxMemoryLimitInKb();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, charArray13, sevenZFileOptions16);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray4);
        org.junit.Assert.assertNotNull(seekableByteChannel5);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(sevenZFileOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_PPC_FILTER));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        boolean boolean13 = arArchiveEntry2.isDirectory();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209595L + "'", long3 == 1687209595L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTF8" + "'", str8, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "never" + "'", str10, "never");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        long long31 = tarArchiveEntry2.getRealSize();
        java.nio.file.attribute.FileTime fileTime32 = tarArchiveEntry2.getStatusChangeTime();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:19:55 CEST 2023");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:19:55 CEST 2023");
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(fileTime32);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream7 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream2, pack200Strategy5, strMap6);
        long long8 = pack200CompressorInputStream7.getBytesRead();
        long long10 = pack200CompressorInputStream7.skip(1687209505L);
        int int11 = pack200CompressorInputStream7.available();
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 3);
        boolean boolean17 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray13, (int) (short) 2);
        int int18 = pack200CompressorInputStream7.read(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 32, byteArray13, 493, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 574");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 29L + "'", long10 == 29L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long6 = arArchiveEntry5.getLastModified();
        long long7 = arArchiveEntry5.getLength();
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry5);
        java.lang.String str9 = arArchiveEntry5.getName();
        java.lang.String str10 = arArchiveEntry5.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1687209595L + "'", long6 == 1687209595L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "lzma" + "'", str9, "lzma");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "lzma" + "'", str10, "lzma");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS12 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = x000A_NTFS12.getModifyTime();
        java.util.Date date14 = x000A_NTFS12.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = x000A_NTFS12.getModifyTime();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod16 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        boolean boolean17 = zipEightByteInteger15.equals((java.lang.Object) sevenZMethod16);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry19 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData20 = jarArchiveEntry19.getUnparseableExtraFieldData();
        boolean boolean21 = jarArchiveEntry19.isStreamContiguous();
        long long22 = jarArchiveEntry19.getDataOffset();
        boolean boolean23 = jarArchiveEntry19.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS24 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = x000A_NTFS24.getModifyTime();
        java.util.Date date26 = x000A_NTFS24.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path30 = tarArchiveEntry29.getPath();
        java.nio.file.attribute.FileTime fileTime31 = null;
        tarArchiveEntry29.setCreationTime(fileTime31);
        int int33 = tarArchiveEntry29.getUserId();
        java.util.Date date34 = tarArchiveEntry29.getModTime();
        x000A_NTFS24.setCreateJavaTime(date34);
        java.util.Date date36 = x000A_NTFS24.getCreateJavaTime();
        jarArchiveEntry19.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS24);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = x000A_NTFS24.getModifyTime();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry41 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date42 = cpioArchiveEntry41.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong43 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date42);
        byte[] byteArray44 = zipLong43.getBytes();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField45 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger11, zipEightByteInteger15, zipEightByteInteger38, zipLong43);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry47 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long48 = jarArchiveEntry47.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource49 = jarArchiveEntry47.getCommentSource();
        java.util.Date date50 = jarArchiveEntry47.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS51 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger52 = x000A_NTFS51.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel53 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream54 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel53);
        java.util.Map<java.lang.String, java.lang.String> strMap55 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream56 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream54, strMap55);
        byte[] byteArray57 = new byte[] {};
        pack200CompressorOutputStream56.write(byteArray57);
        x000A_NTFS51.parseFromCentralDirectoryData(byteArray57, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort62 = x000A_NTFS51.getHeaderId();
        byte[] byteArray63 = x000A_NTFS51.getLocalFileDataData();
        jarArchiveEntry47.setExtra(byteArray63);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong66 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray63, 0);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField45.parseFromCentralDirectoryData(byteArray63, 424935705, 2162688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger11);
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
        org.junit.Assert.assertNull(date14);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
        org.junit.Assert.assertTrue("'" + sevenZMethod16 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod16.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger25);
        org.junit.Assert.assertNull(date26);
        org.junit.Assert.assertNull(path30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(date34);
// flaky:         org.junit.Assert.assertEquals(date34.toString(), "Mon Jun 19 23:19:55 CEST 2023");
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Jun 19 23:19:55 CEST 2023");
        org.junit.Assert.assertNotNull(zipEightByteInteger38);
        org.junit.Assert.assertNotNull(date42);
        org.junit.Assert.assertEquals(date42.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNotNull(zipLong43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + commentSource49 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource49.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertNotNull(date50);
        org.junit.Assert.assertEquals(date50.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(zipEightByteInteger52);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[]");
        org.junit.Assert.assertNotNull(zipShort62);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray63), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.REALSIZELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean3 = jarArchiveEntry1.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField5 = jarArchiveEntry1.getExtraField(zipShort4);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path9 = tarArchiveEntry8.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path13 = tarArchiveEntry12.getPath();
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry12.setCreationTime(fileTime14);
        java.nio.file.attribute.FileTime fileTime16 = tarArchiveEntry12.getLastModifiedTime();
        tarArchiveEntry8.setLastAccessTime(fileTime16);
        long long18 = tarArchiveEntry8.getDataOffset();
        boolean boolean19 = zipShort4.equals((java.lang.Object) long18);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(zipExtraField5);
        org.junit.Assert.assertNull(path9);
        org.junit.Assert.assertNull(path13);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = jarMarker0.getHeaderId();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream2);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField6 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry5.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField6);
        byte[] byteArray8 = jarArchiveEntry5.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField9 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry5.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField9);
        byte[] byteArray11 = resourceAlignmentExtraField9.getLocalFileDataData();
        int int14 = zipArchiveInputStream3.read(byteArray11, 1000, 493);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray11, 263, 504);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path7 = tarArchiveEntry6.getPath();
        java.nio.file.attribute.FileTime fileTime8 = null;
        tarArchiveEntry6.setCreationTime(fileTime8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry6.getLastModifiedTime();
        tarArchiveEntry2.setLastAccessTime(fileTime10);
        boolean boolean12 = tarArchiveEntry2.isGNULongNameEntry();
        boolean boolean13 = tarArchiveEntry2.isOldGNUSparse();
        tarArchiveEntry2.addPaxHeader("UTF8", "bzip2");
        boolean boolean17 = tarArchiveEntry2.isLink();
        boolean boolean18 = tarArchiveEntry2.isLink();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry20 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData21 = jarArchiveEntry20.getUnparseableExtraFieldData();
        boolean boolean22 = jarArchiveEntry20.isStreamContiguous();
        long long23 = jarArchiveEntry20.getDataOffset();
        boolean boolean24 = jarArchiveEntry20.isUnixSymlink();
        int int25 = jarArchiveEntry20.getVersionRequired();
        java.nio.file.attribute.FileTime fileTime26 = jarArchiveEntry20.getLastAccessTime();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry28 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField29 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry28.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField29);
        byte[] byteArray31 = jarArchiveEntry28.getCentralDirectoryExtra();
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField32 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry28.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField32);
        byte[] byteArray34 = resourceAlignmentExtraField32.getLocalFileDataData();
        jarArchiveEntry20.setCentralDirectoryExtra(byteArray34);
        byte[] byteArray37 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean39 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray37, 3);
        boolean boolean41 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray37, (int) (byte) 53);
        boolean boolean43 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray37, (int) ' ');
        jarArchiveEntry20.setExtra(byteArray37);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding46 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry2.parseTarHeader(byteArray37, zipEncoding46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertNotNull(fileTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(fileTime26);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[30, -95, 2, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0]");
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray37), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(zipEncoding46);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy13 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream12, pack200Strategy13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream19 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream18);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer20 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap21 = packer20.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream19, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, pack200Strategy13, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer24 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap25 = packer24.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil27 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap25, ".lzma");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream28 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, (java.util.Map<java.lang.String, java.lang.String>) strMap25);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream29 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
        boolean boolean30 = pack200CompressorInputStream6.markSupported();
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy13);
        org.junit.Assert.assertNotNull(packer20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(packer24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        boolean boolean5 = sevenZArchiveEntry0.getHasCrc();
        boolean boolean6 = sevenZArchiveEntry0.getHasCrc();
        sevenZArchiveEntry0.setDirectory(true);
        sevenZArchiveEntry0.setCrcValue(1687209574L);
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore1);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream3 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor2);
        long long4 = streamCompressor2.getTotalBytesWritten();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream5);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream7 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = tarArchiveInputStream8.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor2.deflate((java.io.InputStream) tarArchiveInputStream8, 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry9);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream3 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream4 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream3);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters5 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters5.setWithZlibHeader(false);
        deflateParameters5.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream4, deflateParameters5);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream(inputStream0, deflateParameters5);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = deflateCompressorInputStream11.skip((long) 26121);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.compress.java.util.jar.Pack200.Unpacker unpacker0 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker();
        java.io.File file1 = null;
        java.util.jar.JarOutputStream jarOutputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unpacker0.unpack(file1, jarOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpacker0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap2 = packer0.properties();
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix3 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.String str4 = x7875_NewUnix3.toString();
        byte[] byteArray5 = x7875_NewUnix3.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding7 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lzma");
        boolean boolean9 = zipEncoding7.canEncode("a\000");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry((java.util.Map<java.lang.String, java.lang.String>) strMap2, byteArray5, zipEncoding7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str4, "0x7875 Zip Extra Field: UID=1000 GID=1000");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
        org.junit.Assert.assertNotNull(zipEncoding7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        brotliCompressorInputStream3.mark((int) (byte) 76);
        brotliCompressorInputStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = brotliCompressorInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Can't decompress after close");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        long long7 = pack200CompressorInputStream6.getBytesRead();
        long long9 = pack200CompressorInputStream6.skip(1687209505L);
        int int10 = pack200CompressorInputStream6.available();
        int int11 = pack200CompressorInputStream6.available();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream13 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature1 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str2 = feature1.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long5 = jarArchiveEntry4.getDataOffset();
        byte[] byteArray6 = jarArchiveEntry4.getRawName();
        jarArchiveEntry4.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException9 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry4);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry11 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField12 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
        jarArchiveEntry11.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) resourceAlignmentExtraField12);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException14 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature1, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry11);
        org.apache.commons.compress.compressors.CompressorException compressorException15 = new org.apache.commons.compress.compressors.CompressorException("0x7875 Zip Extra Field: UID=1000 GID=1000", (java.lang.Throwable) unsupportedZipFeatureException14);
        org.junit.Assert.assertNotNull(feature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "data descriptor" + "'", str2, "data descriptor");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("lz4-framed", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) bZip2CompressorOutputStream5, (short) (byte) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        char[] charArray5 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray8 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        char[] charArray12 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9, charArray12);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray12);
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
        org.junit.Assert.assertNotNull(seekableByteChannelArray8);
        org.junit.Assert.assertNotNull(seekableByteChannel9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getNlink();
        int int2 = dumpArchiveEntry0.getUserId();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE3 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET;
        dumpArchiveEntry0.setType(tYPE3);
        int int5 = dumpArchiveEntry0.getHeaderHoles();
        long long6 = dumpArchiveEntry0.getSize();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + tYPE3 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET + "'", tYPE3.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.SOCKET));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        cpioArchiveEntry6.setUID(29L);
        cpioArchiveEntry6.setNumberOfLinks((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = cpioArchiveEntry6.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 488);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        tarArchiveInputStream5.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean1 = org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename("bzip2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(3, false, 1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField3.getHeaderId();
        org.apache.commons.compress.changes.ChangeSet changeSet5 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet5.deleteDir("lz4-block");
        boolean boolean8 = zipShort4.equals((java.lang.Object) changeSet5);
        changeSet5.deleteDir("data descriptor");
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        tarArchiveEntry1.setGroupId((long) (short) 2);
        int int4 = tarArchiveEntry1.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.lang.String str9 = tarArchiveEntry7.getName();
        boolean boolean10 = tarArchiveEntry7.isFile();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp11 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong12 = x5455_ExtendedTimestamp11.getAccessTime();
        byte[] byteArray13 = x5455_ExtendedTimestamp11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path17 = tarArchiveEntry16.getPath();
        java.nio.file.attribute.FileTime fileTime18 = null;
        tarArchiveEntry16.setCreationTime(fileTime18);
        java.nio.file.attribute.FileTime fileTime20 = tarArchiveEntry16.getLastModifiedTime();
        x5455_ExtendedTimestamp11.setAccessFileTime(fileTime20);
        tarArchiveEntry7.setLastModifiedTime(fileTime20);
        tarArchiveEntry1.setLastModifiedTime(fileTime20);
        java.lang.String str24 = tarArchiveEntry1.getName();
        java.nio.file.attribute.FileTime fileTime25 = tarArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "deflate64" + "'", str9, "deflate64");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(zipLong12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0]");
        org.junit.Assert.assertNull(path17);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "`\n" + "'", str24, "`\n");
        org.junit.Assert.assertNull(fileTime25);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        java.lang.String str7 = tarArchiveEntry2.getExtraPaxHeader("xz");
        boolean boolean8 = tarArchiveEntry2.isExtended();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte11 = tarArchiveEntry10.getLinkFlag();
        tarArchiveEntry10.setNames("ustar\000", "");
        java.lang.String str16 = tarArchiveEntry10.getExtraPaxHeader("LZ4 Parameters with BlockSize null, withContentChecksum false, withBlockChecksum false, withBlockDependency true");
        boolean boolean17 = tarArchiveEntry10.isOldGNUSparse();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList18 = tarArchiveEntry10.getOrderedSparseHeaders();
        tarArchiveEntry2.setSparseHeaders(tarArchiveStructSparseList18);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path23 = tarArchiveEntry22.getPath();
        java.nio.file.attribute.FileTime fileTime24 = null;
        tarArchiveEntry22.setCreationTime(fileTime24);
        int int26 = tarArchiveEntry22.getUserId();
        java.util.Date date27 = tarArchiveEntry22.getModTime();
        long long28 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.javaTimeToNtfsTime(date27);
        tarArchiveEntry2.setModTime(date27);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 48 + "'", byte11 == (byte) 48);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseList18);
        org.junit.Assert.assertNull(path23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(date27);
// flaky:         org.junit.Assert.assertEquals(date27.toString(), "Mon Jun 19 23:19:57 CEST 2023");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 133316831977220000L + "'", long28 == 133316831977220000L);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        sevenZArchiveEntry0.setHasWindowsAttributes(true);
        boolean boolean5 = sevenZArchiveEntry0.getHasCreationDate();
        int int6 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean7 = sevenZArchiveEntry0.hasStream();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS1 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str2 = x000A_NTFS1.toString();
        java.lang.String str3 = x000A_NTFS1.toString();
        java.util.Date date4 = x000A_NTFS1.getModifyJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path8 = tarArchiveEntry7.getPath();
        java.nio.file.attribute.FileTime fileTime9 = null;
        tarArchiveEntry7.setCreationTime(fileTime9);
        java.nio.file.attribute.FileTime fileTime11 = tarArchiveEntry7.getLastModifiedTime();
        tarArchiveEntry7.setMode((int) (short) 2);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path17 = tarArchiveEntry16.getPath();
        java.nio.file.attribute.FileTime fileTime18 = null;
        tarArchiveEntry16.setCreationTime(fileTime18);
        int int20 = tarArchiveEntry16.getUserId();
        java.util.Date date21 = tarArchiveEntry16.getModTime();
        tarArchiveEntry7.setModTime(date21);
        x000A_NTFS1.setCreateJavaTime(date21);
        sevenZArchiveEntry0.setLastModifiedDate(date21);
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration[] sevenZMethodConfigurationArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            sevenZArchiveEntry0.setContentMethods(sevenZMethodConfigurationArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str3, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(path8);
        org.junit.Assert.assertNotNull(fileTime11);
        org.junit.Assert.assertNull(path17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Jun 19 23:19:58 CEST 2023");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy5 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream4, pack200Strategy5);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = jarArchiveInputStream4.getNextJarEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry8 = jarArchiveInputStream4.getNextZipEntry();
        org.junit.Assert.assertNotNull(pack200Strategy5);
        org.junit.Assert.assertNull(jarArchiveEntry7);
        org.junit.Assert.assertNull(zipArchiveEntry8);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField0 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray1 = zip64ExtendedInformationExtraField0.getLocalFileDataData();
        byte[] byteArray2 = zip64ExtendedInformationExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = zip64ExtendedInformationExtraField0.getSize();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS4 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = x000A_NTFS4.getModifyTime();
        java.util.Date date6 = x000A_NTFS4.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = x000A_NTFS4.getModifyTime();
        byte[] byteArray8 = x000A_NTFS4.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField0.parseFromLocalFileData(byteArray8, 493, 84446);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 500");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
        org.junit.Assert.assertNull(zipEightByteInteger3);
        org.junit.Assert.assertNotNull(zipEightByteInteger5);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("z", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream snappyCompressorInputStream5 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorInputStream((java.io.InputStream) zipArchiveInputStream1, 512);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream reading size");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        boolean boolean23 = tarArchiveEntry17.isCheckSumOK();
        boolean boolean24 = tarArchiveEntry17.isFile();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(path18);
        org.junit.Assert.assertNotNull(fileTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-19T21:19:20.457Z] ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-19T21:19:20.457Z] .xz" + "'", str1, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-19T21:19:20.457Z] .xz");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        org.apache.commons.compress.archivers.zip.ZipLong zipLong20 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray21 = zipLong20.getBytes();
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray21, 1024);
        deflateCompressorOutputStream16.write(byteArray21, 0, 2);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x0017_StrongEncryptionHeader0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm3 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
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
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField20 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray14, false, unparseableExtraField20);
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray21);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseCentralDirectoryFormat(byteArray22, (int) (short) 8, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNull(encryptionAlgorithm3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray21);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[]");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        java.nio.file.attribute.FileTime fileTime3 = null;
        sevenZArchiveEntry0.setAccessTime(fileTime3);
        boolean boolean5 = sevenZArchiveEntry0.getHasWindowsAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime6 = sevenZArchiveEntry0.getAccessTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1, inputStreamSupplier3);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = jarArchiveEntry1.getExtraFields();
        int int6 = jarArchiveEntry1.getInternalAttributes();
        long long7 = jarArchiveEntry1.getSize();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray8 = jarArchiveEntry1.getExtraFields();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry9 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry((java.util.zip.ZipEntry) jarArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long4 = brotliCompressorInputStream3.getCompressedCount();
        java.lang.String str5 = brotliCompressorInputStream3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream6 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.compress.archivers.ArchiveException archiveException1 = new org.apache.commons.compress.archivers.ArchiveException("zstd");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream18 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 21);
            org.junit.Assert.fail("Expected exception of type org.tukaani.xz.UnsupportedOptionsException; message: Unsupported preset: 21");
        } catch (org.tukaani.xz.UnsupportedOptionsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(inputStream11);
        org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) pack200CompressorInputStream12, 26625);
        long long15 = lZMACompressorInputStream14.getCompressedCount();
        lZMACompressorInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = lZMACompressorInputStream14.skip(133316831493050000L);
            org.junit.Assert.fail("Expected exception of type org.tukaani.xz.XZIOException; message: Stream closed");
        } catch (org.tukaani.xz.XZIOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 18L + "'", long15 == 18L);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        long long5 = zipArchiveInputStream1.skip((long) 16877);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream7 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 11 kb. If the file is not corrupt, consider increasing the memory limit.");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        short short4 = cpioArchiveEntry2.getFormat();
        long long5 = cpioArchiveEntry2.getGID();
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        int int7 = cpioArchiveEntry2.getHeaderPadCount();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 1 + "'", short4 == (short) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        boolean boolean12 = tarArchiveEntry6.isCharacterDevice();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNull(path7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(inputStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) 29127);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str1 = org.apache.commons.compress.compressors.lzma.LZMAUtils.getCompressedFilename("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false.lzma" + "'", str1, "false.lzma");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream18 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) lZMACompressorOutputStream14, 84446, 2147483647, "arj");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 84446");
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

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.lang.String str3 = zipArchiveOutputStream2.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy4 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str5 = unicodeExtraFieldPolicy4.toString();
        zipArchiveOutputStream2.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy4);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry7 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean8 = zipArchiveOutputStream2.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry7);
        java.nio.file.Path path9 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream2, path9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF8" + "'", str3, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "never" + "'", str5, "never");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory2 = new org.apache.commons.compress.compressors.CompressorStreamFactory(true, 1024);
        java.io.InputStream inputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream6 = compressorStreamFactory2.createCompressorInputStream("0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[2023-06-19T21:19:20.457Z] ", inputStream4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compressor name and stream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand("pack.effort", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry2 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray4 = jarArchiveEntry2.getExtraFields(true);
        boolean boolean5 = jarArchiveEntry2.isUnixSymlink();
        boolean boolean6 = generalPurposeBit0.equals((java.lang.Object) boolean5);
        boolean boolean7 = generalPurposeBit0.usesUTF8ForNames();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder8 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder10 = builder8.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder12 = builder10.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder14 = builder10.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder16 = builder14.withNiceBackReferenceLength(8);
        boolean boolean17 = generalPurposeBit0.equals((java.lang.Object) 8);
        org.junit.Assert.assertNotNull(zipExtraFieldArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel3);
        char[] charArray6 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile7 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray6);
        org.apache.commons.compress.archivers.tar.TarFile tarFile8 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray9 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        char[] charArray13 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel10, charArray13);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray13);
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("deflate64", seekableByteChannel3, file16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: deflate64 not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertNotNull(seekableByteChannelArray9);
        org.junit.Assert.assertNotNull(seekableByteChannel10);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry21 = arArchiveOutputStream18.createArchiveEntry(file19, "BackReference with offset 84446 and length 508");
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        java.lang.String str4 = unicodeExtraFieldPolicy3.toString();
        zipArchiveOutputStream1.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy3);
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry6 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean7 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream10 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, 1687209501L, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "never" + "'", str4, "never");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        int int1 = asiExtraField0.getMode();
        boolean boolean2 = asiExtraField0.isDirectory();
        asiExtraField0.setUserId(1024);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp5 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = x5455_ExtendedTimestamp5.getAccessTime();
        byte[] byteArray7 = x5455_ExtendedTimestamp5.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray7, 77, 5);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: The length is too short, only 5 bytes, expected at least 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0]");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 29, "070702");
        long long7 = cpioArchiveInputStream5.skip((long) (short) 4);
        int int8 = cpioArchiveInputStream5.available();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x7875_NewUnix0.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray4 = zipLong3.getBytes();
        boolean boolean6 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray4, (int) (byte) 76);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray4, 1000, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        boolean boolean6 = cpioArchiveEntry2.isBlockDevice();
        boolean boolean7 = cpioArchiveEntry2.isDirectory();
        long long8 = cpioArchiveEntry2.getDeviceMaj();
        long long9 = cpioArchiveEntry2.getDeviceMin();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str1 = x000A_NTFS0.toString();
        java.lang.String str2 = x000A_NTFS0.toString();
        java.lang.String str3 = x000A_NTFS0.toString();
        java.nio.file.attribute.FileTime fileTime4 = x000A_NTFS0.getAccessFileTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str1, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str2, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str3, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNull(fileTime4);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, (int) (short) 4, 512, "pass", false);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 11, (int) (byte) 4, "keep", true);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID;
        byte[] byteArray15 = zipShort14.getBytes();
        boolean boolean17 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byteArray15, (int) 'a');
        org.apache.commons.compress.archivers.tar.TarFile tarFile18 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile19 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "pack.modification.time", byteArray15);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder4.withMaxOffset((int) (short) 2);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = builder7.withLazyMatching(true);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder11 = builder7.withLazyMatching(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize6 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder10 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder12 = builder10.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder14 = builder12.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters15 = builder14.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters16 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize6, true, false, false, parameters15);
        int int17 = parameters15.getNiceBackReferenceLength();
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream18 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3, parameters15);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp19 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong21 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray22 = zipLong21.getBytes();
        x5455_ExtendedTimestamp19.setModifyTime(zipLong21);
        boolean boolean24 = x5455_ExtendedTimestamp19.isBit2_createTimePresent();
        byte[] byteArray25 = x5455_ExtendedTimestamp19.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorOutputStream18.write(byteArray25, (int) (byte) 76, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockSize6 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize6.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(parameters15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[1, -1, -1, -1, -1]");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier1 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable2 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier1);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = jarArchiveEntry4.getUnparseableExtraFieldData();
        boolean boolean6 = jarArchiveEntry4.isStreamContiguous();
        long long7 = jarArchiveEntry4.getDataOffset();
        boolean boolean8 = jarArchiveEntry4.isUnixSymlink();
        java.nio.file.attribute.FileTime fileTime9 = jarArchiveEntry4.getLastAccessTime();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource10 = jarArchiveEntry4.getCommentSource();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable12 = parallelScatterZipCreator0.createCallable((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry4, inputStreamSupplier11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must be set on zipArchiveEntry: bzip2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable2);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(fileTime9);
        org.junit.Assert.assertTrue("'" + commentSource10 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource10.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        int int0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW_KEY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = x000A_NTFS0.getModifyTime();
        java.lang.String str2 = zipEightByteInteger1.toString();
        java.lang.String str3 = zipEightByteInteger1.toString();
        org.junit.Assert.assertNotNull(zipEightByteInteger1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZipEightByteInteger value: 0" + "'", str2, "ZipEightByteInteger value: 0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ZipEightByteInteger value: 0" + "'", str3, "ZipEightByteInteger value: 0");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream15);
        zipArchiveInputStream16.mark((int) (byte) -1);
        long long20 = zipArchiveInputStream16.skip((long) 16877);
        java.nio.channels.SeekableByteChannel seekableByteChannel21 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream24 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream22, strMap23);
        byte[] byteArray25 = new byte[] {};
        pack200CompressorOutputStream24.write(byteArray25);
        int int29 = zipArchiveInputStream16.read(byteArray25, (int) (short) -1, (int) (byte) 50);
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField31 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray32 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray25, false, unparseableExtraField31);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream14.write(byteArray25, 2147483647, 49152);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(zipExtraFieldArray32);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        long long3 = cpioArchiveEntry2.getMode();
        cpioArchiveEntry2.setChksum(1L);
        boolean boolean6 = cpioArchiveEntry2.isBlockDevice();
        long long7 = cpioArchiveEntry2.getInode();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = cpioArchiveEntry2.getRemoteDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32768L + "'", long3 == 32768L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters0 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        int int1 = deflateParameters0.getCompressionLevel();
        // The following exception was thrown during execution in test generation
        try {
            deflateParameters0.setCompressionLevel(255);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Deflate compression level: 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray3 = zipLong2.getBytes();
        boolean boolean5 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray3, 32768);
        boolean boolean7 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray3, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode9 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray10 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray3, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode9);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock13 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray3, 488, (int) (short) 2);
        java.lang.String str14 = literalBlock13.toString();
        byte[] byteArray15 = literalBlock13.getData();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) (short) 1, byteArray15, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32771");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode9 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode9.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "LiteralBlock starting at 488 with length 2" + "'", str14, "LiteralBlock starting at 488 with length 2");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters0 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters0.setWithZlibHeader(false);
        deflateParameters0.setWithZlibHeader(true);
        deflateParameters0.setWithZlibHeader(true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature5 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException6 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature5);
        boolean boolean7 = jarArchiveEntry1.equals((java.lang.Object) unsupportedZipFeatureException6);
        byte[] byteArray8 = jarArchiveEntry1.getRawName();
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertNotNull(feature5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setVolume((int) (byte) 120);
        java.lang.String str3 = dumpArchiveEntry0.getSimpleName();
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel4);
        java.lang.String str6 = zipArchiveOutputStream5.getEncoding();
        boolean boolean7 = zipArchiveOutputStream5.isSeekable();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date11 = cpioArchiveEntry10.getLastModifiedDate();
        cpioArchiveEntry10.setRemoteDeviceMaj((long) 'a');
        int int14 = cpioArchiveEntry10.getAlignmentBoundary();
        boolean boolean15 = zipArchiveOutputStream5.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry10);
        cpioArchiveEntry10.setDeviceMin((long) 26128);
        boolean boolean18 = cpioArchiveEntry10.isSocket();
        java.util.Date date19 = cpioArchiveEntry10.getLastModifiedDate();
        dumpArchiveEntry0.setAccessTime(date19);
        long long21 = dumpArchiveEntry0.getOffset();
        boolean boolean22 = dumpArchiveEntry0.isBlkDev();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTF8" + "'", str6, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField3 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(0, false, 9);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = new org.apache.commons.compress.archivers.zip.ZipLong((int) (short) -1);
        byte[] byteArray6 = zipLong5.getBytes();
        boolean boolean8 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray6, 32768);
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, 0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode12 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray13 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray6, true, (org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior) extraFieldParsingMode12);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock16 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray6, 488, (int) (short) 2);
        java.lang.String str17 = literalBlock16.toString();
        byte[] byteArray18 = literalBlock16.getData();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField3.parseFromCentralDirectoryData(byteArray18, 255, 493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 255");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode12 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS + "'", extraFieldParsingMode12.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.STRICT_FOR_KNOW_EXTRA_FIELDS));
        org.junit.Assert.assertNotNull(zipExtraFieldArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LiteralBlock starting at 488 with length 2" + "'", str17, "LiteralBlock starting at 488 with length 2");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, -1, -1, -1]");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile11.write(511);
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
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        int int19 = tarArchiveOutputStream6.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream20 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(fileTime15);
        org.junit.Assert.assertNull(fileTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 512 + "'", int19 == 512);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(scatterGatherBackingStore1);
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream3 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore0, streamCompressor2);
        long long4 = streamCompressor2.getTotalBytesWritten();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS5 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = x000A_NTFS5.getModifyTime();
        java.util.Date date7 = x000A_NTFS5.getCreateJavaTime();
        byte[] byteArray8 = x000A_NTFS5.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor2.writeCounted(byteArray8, (int) (byte) 49, 77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(zipEightByteInteger6);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(file0, 29L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("jar", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unparseableExtraFieldData0.getCentralDirectoryLength();
        java.lang.Object obj3 = zipShort2.clone();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "ZipShort value: 0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "ZipShort value: 0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "ZipShort value: 0");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS0 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        java.lang.String str1 = x000A_NTFS0.toString();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x000A_NTFS0.getHeaderId();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS3 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = x000A_NTFS3.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream8 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6, strMap7);
        byte[] byteArray9 = new byte[] {};
        pack200CompressorOutputStream8.write(byteArray9);
        x000A_NTFS3.parseFromCentralDirectoryData(byteArray9, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = x000A_NTFS3.getAccessTime();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS15 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger16 = x000A_NTFS15.getModifyTime();
        java.util.Date date17 = x000A_NTFS15.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger18 = x000A_NTFS15.getModifyTime();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod19 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        boolean boolean20 = zipEightByteInteger18.equals((java.lang.Object) sevenZMethod19);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry22 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData23 = jarArchiveEntry22.getUnparseableExtraFieldData();
        boolean boolean24 = jarArchiveEntry22.isStreamContiguous();
        long long25 = jarArchiveEntry22.getDataOffset();
        boolean boolean26 = jarArchiveEntry22.isUnixSymlink();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS27 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger28 = x000A_NTFS27.getModifyTime();
        java.util.Date date29 = x000A_NTFS27.getCreateJavaTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path33 = tarArchiveEntry32.getPath();
        java.nio.file.attribute.FileTime fileTime34 = null;
        tarArchiveEntry32.setCreationTime(fileTime34);
        int int36 = tarArchiveEntry32.getUserId();
        java.util.Date date37 = tarArchiveEntry32.getModTime();
        x000A_NTFS27.setCreateJavaTime(date37);
        java.util.Date date39 = x000A_NTFS27.getCreateJavaTime();
        jarArchiveEntry22.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x000A_NTFS27);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger41 = x000A_NTFS27.getModifyTime();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry44 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date45 = cpioArchiveEntry44.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong46 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(date45);
        byte[] byteArray47 = zipLong46.getBytes();
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField48 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger14, zipEightByteInteger18, zipEightByteInteger41, zipLong46);
        x000A_NTFS0.setAccessTime(zipEightByteInteger14);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] " + "'", str1, "0x000A Zip Extra Field: Modify:[null]  Access:[null]  Create:[null] ");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipEightByteInteger14);
        org.junit.Assert.assertNotNull(zipEightByteInteger16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(zipEightByteInteger18);
        org.junit.Assert.assertTrue("'" + sevenZMethod19 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod19.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger28);
        org.junit.Assert.assertNull(date29);
        org.junit.Assert.assertNull(path33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(date37);
// flaky:         org.junit.Assert.assertEquals(date37.toString(), "Mon Jun 19 23:20:02 CEST 2023");
        org.junit.Assert.assertNotNull(date39);
// flaky:         org.junit.Assert.assertEquals(date39.toString(), "Mon Jun 19 23:20:02 CEST 2023");
        org.junit.Assert.assertNotNull(zipEightByteInteger41);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertNotNull(zipLong46);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[0, 0, 33, 0]");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 1);
        long long2 = cpioArchiveEntry1.getInode();
        long long3 = cpioArchiveEntry1.getTime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        int int3 = jarArchiveEntry1.getInternalAttributes();
        byte[] byteArray4 = jarArchiveEntry1.getRawName();
        long long5 = jarArchiveEntry1.getDataOffset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasWindowsAttributes(false);
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        boolean boolean5 = sevenZArchiveEntry0.getHasCrc();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path9 = tarArchiveEntry8.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path13 = tarArchiveEntry12.getPath();
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry12.setCreationTime(fileTime14);
        java.nio.file.attribute.FileTime fileTime16 = tarArchiveEntry12.getLastModifiedTime();
        tarArchiveEntry8.setLastAccessTime(fileTime16);
        boolean boolean18 = tarArchiveEntry8.isGNULongNameEntry();
        java.nio.file.attribute.FileTime fileTime19 = tarArchiveEntry8.getLastModifiedTime();
        sevenZArchiveEntry0.setCreationTime(fileTime19);
        sevenZArchiveEntry0.setDirectory(true);
        sevenZArchiveEntry0.setName("org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit.");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date25 = sevenZArchiveEntry0.getLastModifiedDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(path9);
        org.junit.Assert.assertNull(path13);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(fileTime19);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.util.Date date15 = cpioArchiveEntry6.getLastModifiedDate();
        long long16 = cpioArchiveEntry6.getSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile3.close();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.nio.file.Path path0 = null;
        java.nio.file.LinkOption[] linkOptionArray2 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry3 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(path0, "ZipLong value: 33639248", linkOptionArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray2);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField1 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (short) 100);
        byte[] byteArray2 = resourceAlignmentExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField1.getCentralDirectoryLength();
        byte[] byteArray4 = resourceAlignmentExtraField1.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding6 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        boolean boolean8 = zipEncoding6.canEncode("pack.modification.time");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray4, zipEncoding6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0]");
        org.junit.Assert.assertNotNull(zipEncoding6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3);
        long long8 = cpioArchiveInputStream6.skip((long) 40960);
        long long10 = cpioArchiveInputStream6.skip((long) 1024);
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream2 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        int int3 = pack200CompressorInputStream2.available();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream4 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream blockLZ4CompressorInputStream5 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream((java.io.InputStream) zipArchiveInputStream1);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 3);
        boolean boolean12 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray8, (int) (byte) 53);
        long long15 = org.apache.commons.compress.archivers.tar.TarUtils.parseOctalOrBinary(byteArray8, 1, 476);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField(".bz2", byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = blockLZ4CompressorInputStream5.read(byteArray8, (int) (short) 3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Premature end of stream while looking for next block");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        pack200CompressorInputStream6.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.z.ZCompressorInputStream zCompressorInputStream15 = new org.apache.commons.compress.compressors.z.ZCompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, 60012);
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: C:\\Users\\Daniele\\AppData\\Local\\Temp\\commons-compress7609533799575110344packtemp");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 29L + "'", long9 == 29L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64");
        java.nio.file.attribute.FileTime fileTime2 = tarArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry5.setCreationTime(fileTime7);
        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry5.getLastModifiedTime();
        tarArchiveEntry1.setCreationTime(fileTime9);
        java.lang.String str12 = tarArchiveEntry1.getExtraPaxHeader("latest");
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertNotNull(fileTime9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters0 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters0.setWithZlibHeader(true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1, 26625, 511, "pack.effort", true);
        char[] charArray9 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder10 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = builder10.build();
        int int12 = sevenZFileOptions11.getMaxMemoryLimitInKb();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, "cpio.lzma", charArray9, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(sevenZFileOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        java.lang.Object obj2 = sevenZMethodConfiguration1.getOptions();
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.COPY));
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(file0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.compress.archivers.dump.InvalidFormatException invalidFormatException2 = new org.apache.commons.compress.archivers.dump.InvalidFormatException();
        org.apache.commons.compress.MemoryLimitException memoryLimitException3 = new org.apache.commons.compress.MemoryLimitException((long) 7, 26128, (java.lang.Exception) invalidFormatException2);
        java.lang.String str4 = memoryLimitException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit." + "'", str4, "org.apache.commons.compress.MemoryLimitException: 7 kb of memory would be needed; limit was 26128 kb. If the file is not corrupt, consider increasing the memory limit.");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unicodePathExtraField0.getLocalFileDataLength();
        byte[] byteArray2 = unicodePathExtraField0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry4 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long5 = jarArchiveEntry4.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource6 = jarArchiveEntry4.getCommentSource();
        java.util.Date date7 = jarArchiveEntry4.getLastModifiedDate();
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS8 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = x000A_NTFS8.getModifyTime();
        java.nio.channels.SeekableByteChannel seekableByteChannel10 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel10);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream11, strMap12);
        byte[] byteArray14 = new byte[] {};
        pack200CompressorOutputStream13.write(byteArray14);
        x000A_NTFS8.parseFromCentralDirectoryData(byteArray14, 64, 0);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = x000A_NTFS8.getHeaderId();
        byte[] byteArray20 = x000A_NTFS8.getLocalFileDataData();
        jarArchiveEntry4.setExtra(byteArray20);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong23 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray20, 0);
        // The following exception was thrown during execution in test generation
        try {
            unicodePathExtraField0.parseFromLocalFileData(byteArray20, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + commentSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:59:59 CET 1970");
        org.junit.Assert.assertNotNull(zipEightByteInteger9);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 0, 0, 1, 0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        byte[] byteArray4 = new byte[] { (byte) 51, (byte) 103, (byte) 103, (byte) 88 };
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField6 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray4, false, unparseableExtraField6);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 0.  Block length of 22631 bytes exceeds remaining data of 0 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[51, 103, 103, 88]");
        org.junit.Assert.assertNotNull(unparseableExtraField6);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        bZip2CompressorOutputStream5.finish();
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean10 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray8, 3);
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, 3);
        // The following exception was thrown during execution in test generation
        try {
            bZip2CompressorOutputStream5.write(byteArray8, 32, 26121);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: offs(32) + len(26121) > buf.length(2).");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getNlink();
        long long2 = dumpArchiveEntry0.getOffset();
        java.lang.String str3 = dumpArchiveEntry0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 29, "070702");
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path10 = tarArchiveEntry9.getPath();
        java.nio.file.attribute.FileTime fileTime11 = null;
        tarArchiveEntry9.setCreationTime(fileTime11);
        int int13 = tarArchiveEntry9.getUserId();
        long long14 = tarArchiveEntry9.getRealSize();
        boolean boolean15 = tarArchiveEntry9.isBlockDevice();
        java.lang.String str16 = tarArchiveEntry9.getGroupName();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = tarArchiveEntry9.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) cpioArchiveInputStream5, strMap17);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp19 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.Object obj20 = x5455_ExtendedTimestamp19.clone();
        byte[] byteArray21 = x5455_ExtendedTimestamp19.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding23 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean27 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray25, 3);
        java.lang.String str28 = zipEncoding23.decode(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap17, byteArray21, zipEncoding23, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0]");
        org.junit.Assert.assertNotNull(zipEncoding23);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "a\000" + "'", str28, "a\000");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField31 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField();
        byte[] byteArray32 = zip64ExtendedInformationExtraField31.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding34 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry11.writeEntryHeader(byteArray32, zipEncoding34, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Jun 19 23:20:04 CEST 2023");
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Mon Jun 19 23:20:04 CEST 2023");
        org.junit.Assert.assertNull(path20);
        org.junit.Assert.assertNull(path24);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[]");
        org.junit.Assert.assertNotNull(zipEncoding34);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry2.setCreationTime(fileTime4);
        int int6 = tarArchiveEntry2.getUserId();
        long long7 = tarArchiveEntry2.getRealSize();
        java.lang.String str8 = tarArchiveEntry2.getName();
        int int9 = tarArchiveEntry2.getMode();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "deflate64" + "'", str8, "deflate64");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33188 + "'", int9 == 33188);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.BASE_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.file.Path path2 = null;
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("pack.unknown.attribute", path2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource8 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD;
        jarArchiveEntry1.setCommentSource(commentSource8);
        byte[] byteArray10 = jarArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry12 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long13 = jarArchiveEntry12.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier14 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest15 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry12, inputStreamSupplier14);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray16 = jarArchiveEntry12.getExtraFields();
        jarArchiveEntry1.setExtraFields(zipExtraFieldArray16);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + commentSource8 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD + "'", commentSource8.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.UNICODE_EXTRA_FIELD));
        org.junit.Assert.assertNull(byteArray10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest15);
        org.junit.Assert.assertNotNull(zipExtraFieldArray16);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.deleteDir("hi!");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry3 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry3.setHasWindowsAttributes(false);
        sevenZArchiveEntry3.setHasLastModifiedDate(false);
        boolean boolean8 = sevenZArchiveEntry3.getHasCrc();
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream9);
        zipArchiveInputStream10.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream13 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream10);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy14 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream15 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream13, pack200Strategy14);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) pack200CompressorInputStream15);
        changeSet0.add((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry3, (java.io.InputStream) tarArchiveInputStream16);
        java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> wildcardIterable18 = sevenZArchiveEntry3.getContentMethods();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(pack200Strategy14);
        org.junit.Assert.assertNull(wildcardIterable18);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        java.nio.file.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream2, path3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize(1687209590L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap1 = compressorStreamFactory0.getCompressorOutputStreamProviders();
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream3);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream4, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy7 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream4, pack200Strategy7, strMap8);
        long long10 = pack200CompressorInputStream9.getBytesRead();
        long long12 = pack200CompressorInputStream9.skip(1687209505L);
        int int13 = pack200CompressorInputStream9.available();
        int int14 = pack200CompressorInputStream9.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream15 = compressorStreamFactory0.createCompressorInputStream("0x000A Zip Extra Field: Modify:[2023-06-19T21:19:55.787Z]  Access:[null]  Create:[null] ", (java.io.InputStream) pack200CompressorInputStream9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: 0x000A Zip Extra Field: Modify:[2023-06-19T21:19:55.787Z]  Access:[null]  Create:[null]  not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(pack200Strategy7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 29L + "'", long12 == 29L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature0 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str1 = feature0.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry3 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long4 = jarArchiveEntry3.getDataOffset();
        byte[] byteArray5 = jarArchiveEntry3.getRawName();
        jarArchiveEntry3.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException8 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature0, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry3);
        java.lang.String str9 = jarArchiveEntry3.toString();
        org.junit.Assert.assertNotNull(feature0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "data descriptor" + "'", str1, "data descriptor");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "bzip2" + "'", str9, "bzip2");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        brotliCompressorInputStream3.mark((int) (byte) 76);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes((int) 'a');
        boolean boolean15 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray13, 3);
        boolean boolean17 = org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream.matches(byteArray13, (int) (byte) 53);
        boolean boolean19 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray13, (int) ' ');
        org.apache.commons.compress.archivers.tar.TarFile tarFile20 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = brotliCompressorInputStream3.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[97, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy4 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream1, pack200Strategy4, strMap5);
        int int7 = pack200CompressorInputStream6.read();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream8);
        zipArchiveInputStream9.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream9);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy13 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream12, pack200Strategy13);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream16, strMap17);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream19 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream18);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer20 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap21 = packer20.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream22 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream19, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6, pack200Strategy13, (java.util.Map<java.lang.String, java.lang.String>) strMap21);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream24 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) pack200CompressorInputStream6);
        long long25 = deflate64CompressorInputStream24.getCompressedCount();
        org.junit.Assert.assertNotNull(pack200Strategy4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 80 + "'", int7 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy13);
        org.junit.Assert.assertNotNull(packer20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long3 = arArchiveEntry2.getLastModified();
        int int4 = arArchiveEntry2.getUserId();
        long long5 = arArchiveEntry2.getLength();
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters6 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters6.setDeflateStrategy((int) (short) 3);
        int int9 = gzipParameters6.getDeflateStrategy();
        gzipParameters6.setModificationTime((long) 60012);
        boolean boolean12 = arArchiveEntry2.equals((java.lang.Object) 60012);
        int int13 = arArchiveEntry2.getMode();
        java.lang.String str14 = arArchiveEntry2.getName();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1687209605L + "'", long3 == 1687209605L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 33188 + "'", int13 == 33188);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "lzma" + "'", str14, "lzma");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer0 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap1 = packer0.properties();
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        packer0.addPropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        packer0.addPropertyChangeListener(propertyChangeListener4);
        java.util.jar.JarInputStream jarInputStream6 = null;
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream8, strMap9);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream11 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream10);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream12 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream10);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream13 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream10);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize15 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder19 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder21 = builder19.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder23 = builder21.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters24 = builder23.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters25 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize15, true, false, false, parameters24);
        int int26 = parameters24.getNiceBackReferenceLength();
        int int27 = parameters24.getMaxCandidates();
        org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream28 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream13, 18L, parameters24);
        // The following exception was thrown during execution in test generation
        try {
            packer0.pack(jarInputStream6, (java.io.OutputStream) snappyCompressorOutputStream28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must specify both input and output streams");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(packer0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + blockSize15 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize15.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(parameters24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 512 + "'", int27 == 512);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setDeleted(false);
        boolean boolean3 = dumpArchiveEntry0.isFile();
        dumpArchiveEntry0.setDeleted(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getAccessTime();
        byte[] byteArray2 = x5455_ExtendedTimestamp0.getCentralDirectoryData();
        java.lang.String str3 = x5455_ExtendedTimestamp0.toString();
        java.util.Date date4 = x5455_ExtendedTimestamp0.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker5 = org.apache.commons.compress.archivers.zip.JarMarker.getInstance();
        byte[] byteArray6 = jarMarker5.getLocalFileDataData();
        // The following exception was thrown during execution in test generation
        try {
            x5455_ExtendedTimestamp0.parseFromLocalFileData(byteArray6, 10, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str3, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(jarMarker5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        int int6 = parameters5.getNiceBackReferenceLength();
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback callback7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz77support.LZ77Compressor lZ77Compressor8 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor(parameters5, callback7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: callback");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.lang.Object obj1 = null;
        boolean boolean2 = x7875_NewUnix0.equals(obj1);
        byte[] byteArray3 = x7875_NewUnix0.getLocalFileDataData();
        long long4 = x7875_NewUnix0.getGID();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 2, -24, 3, 2, -24, 3]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1000L + "'", long4 == 1000L);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel17);
        java.io.File file19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry21 = sevenZOutputFile18.createArchiveEntry(file19, "BackReference with offset 88 and length 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel2);
        char[] charArray5 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray8 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel9 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel9);
        char[] charArray12 = new char[] {};
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel9, charArray12);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(file0, charArray12);
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
        org.junit.Assert.assertNotNull(seekableByteChannelArray8);
        org.junit.Assert.assertNotNull(seekableByteChannel9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        byte byte2 = tarArchiveEntry1.getLinkFlag();
        tarArchiveEntry1.setModTime((long) (byte) 76);
        boolean boolean5 = tarArchiveEntry1.isCheckSumOK();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 48 + "'", byte2 == (byte) 48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 1);
        long long2 = cpioArchiveEntry1.getInode();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setMode((long) 131);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown mode. Full: 83 Masked: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64");
        java.nio.file.attribute.FileTime fileTime2 = tarArchiveEntry1.getCreationTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path6 = tarArchiveEntry5.getPath();
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry5.setCreationTime(fileTime7);
        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry5.getLastModifiedTime();
        tarArchiveEntry1.setCreationTime(fileTime9);
        java.lang.String str11 = tarArchiveEntry1.getGroupName();
        org.junit.Assert.assertNull(fileTime2);
        org.junit.Assert.assertNull(path6);
        org.junit.Assert.assertNotNull(fileTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setBufferSize((int) (byte) 4);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = x0017_StrongEncryptionHeader0.getCentralDirectoryLength();
        long long2 = x0017_StrongEncryptionHeader0.getRecordCount();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) 7);
        boolean boolean6 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray4, 256);
        boolean boolean8 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, 255);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromCentralDirectoryData(byteArray4, 512, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[7, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192;
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES192));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.util.concurrent.ExecutorService executorService2 = null;
        java.nio.file.Path path3 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier4 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path3);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator5 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService2, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator8 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier4, (int) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("true");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        int int6 = deflateCompressorInputStream5.available();
        int int7 = deflateCompressorInputStream5.available();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) deflateCompressorInputStream5);
        long long9 = deflateCompressorInputStream8.getCompressedCount();
        org.junit.Assert.assertNull(tarArchiveEntry4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) -1, path1, "pack200.bz2", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream12.write(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current CPIO entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 33, 0]");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData5 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCrc((long) 2147483647);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertNull(unparseableExtraFieldData5);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        tarArchiveEntry2.setMode(131);
        tarArchiveEntry2.setSize(10L);
        org.junit.Assert.assertNull(path3);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "ZipShort value: 25461", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        int int2 = zipArchiveOutputStream1.getCount();
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry5 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lzma", (long) 12);
        long long6 = arArchiveEntry5.getLastModified();
        long long7 = arArchiveEntry5.getLength();
        boolean boolean8 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arArchiveEntry5);
        long long9 = arArchiveEntry5.getSize();
        long long10 = arArchiveEntry5.getSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1687209606L + "'", long6 == 1687209606L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 12L + "'", long9 == 12L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 12L + "'", long10 == 12L);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        zipArchiveInputStream1.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1, 488);
        boolean boolean6 = tarArchiveInputStream5.markSupported();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = tarArchiveInputStream5.getNextTarEntry();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = tarArchiveInputStream5.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(tarArchiveEntry7);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.SEGMENT_LIMIT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.segment.limit" + "'", str0, "pack.segment.limit");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '#', '4' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray9);
        org.apache.commons.compress.archivers.zip.X000A_NTFS x000A_NTFS11 = new org.apache.commons.compress.archivers.zip.X000A_NTFS();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger12 = x000A_NTFS11.getModifyTime();
        java.util.Date date13 = x000A_NTFS11.getCreateJavaTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger14 = x000A_NTFS11.getModifyTime();
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod15 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64;
        boolean boolean16 = zipEightByteInteger14.equals((java.lang.Object) sevenZMethod15);
        sevenZOutputFile10.setContentCompression(sevenZMethod15);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile10.close();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a a#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a,  , a, #, 4]");
        org.junit.Assert.assertNotNull(zipEightByteInteger12);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(zipEightByteInteger14);
        org.junit.Assert.assertTrue("'" + sevenZMethod15 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64 + "'", sevenZMethod15.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DEFLATE64));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0016_CertificateIdForCentralDirectory0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        java.lang.String str3 = feature2.toString();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry5 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long6 = jarArchiveEntry5.getDataOffset();
        byte[] byteArray7 = jarArchiveEntry5.getRawName();
        jarArchiveEntry5.setInternalAttributes(1024);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException10 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2, (org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry5);
        byte[] byteArray11 = jarArchiveEntry5.getRawName();
        byte[] byteArray12 = jarArchiveEntry5.getCentralDirectoryExtra();
        // The following exception was thrown during execution in test generation
        try {
            x0016_CertificateIdForCentralDirectory0.parseFromCentralDirectoryData(byteArray12, 32768, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32768");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "data descriptor" + "'", str3, "data descriptor");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(byteArray7);
        org.junit.Assert.assertNull(byteArray11);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.Set<java.lang.String> strSet2 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap3 = compressorStreamFactory1.getCompressorOutputStreamProviders();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE cOMPRESSION_TYPE1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find((int) '4');
        org.junit.Assert.assertNull(cOMPRESSION_TYPE1);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.deleteDir("hi!");
        changeSet0.deleteDir("lz4-framed");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData2 = jarArchiveEntry1.getUnparseableExtraFieldData();
        jarArchiveEntry1.setCompressedSize((long) 64);
        int int5 = jarArchiveEntry1.getRawFlag();
        jarArchiveEntry1.setExternalAttributes((long) (byte) 51);
        java.lang.Object obj8 = jarArchiveEntry1.clone();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit9 = jarArchiveEntry1.getGeneralPurposeBit();
        jarArchiveEntry1.setTime((long) 32768);
        org.junit.Assert.assertNull(unparseableExtraFieldData2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "bzip2");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "bzip2");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "bzip2");
        org.junit.Assert.assertNotNull(generalPurposeBit9);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getDataOffset();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest((org.apache.commons.compress.archivers.zip.ZipArchiveEntry) jarArchiveEntry1, inputStreamSupplier3);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = jarArchiveEntry1.getExtraFields();
        int int6 = jarArchiveEntry1.getInternalAttributes();
        boolean boolean7 = jarArchiveEntry1.isUnixSymlink();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.compress.archivers.zip.ZipShort zipShort0 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        org.junit.Assert.assertNotNull(zipShort0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(closeableConsumer0);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[30, -95]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        long long2 = zipArchiveOutputStream1.getBytesWritten();
        zipArchiveOutputStream1.setEncoding("deflate64");
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry7 = zipArchiveOutputStream1.createArchiveEntry(file5, "ZipEightByteInteger value: 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) tarArchiveOutputStream6, (int) (byte) 83, 26625, "0x7875 Zip Extra Field: UID=1000 GID=1000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 83");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 512 + "'", int9 == 512);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = tarArchiveInputStream3.getCurrentEntry();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream3);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, 4095);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.z.ZCompressorInputStream zCompressorInputStream9 = new org.apache.commons.compress.compressors.z.ZCompressorInputStream((java.io.InputStream) cpioArchiveInputStream7, (int) (short) 8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Input is not in .Z format");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tarArchiveEntry4);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray19 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel20 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray19);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel20);
        org.apache.commons.compress.archivers.tar.TarFile tarFile22 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel20);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path26 = tarArchiveEntry25.getPath();
        java.nio.file.attribute.FileTime fileTime27 = null;
        tarArchiveEntry25.setCreationTime(fileTime27);
        long long29 = tarArchiveEntry25.getSize();
        java.io.InputStream inputStream30 = tarFile22.getInputStream(tarArchiveEntry25);
        java.io.File file31 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(inputStream30, file31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(seekableByteChannelArray19);
        org.junit.Assert.assertNotNull(seekableByteChannel20);
        org.junit.Assert.assertNull(path26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(inputStream30);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        tarArchiveOutputStream3.flush();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setDeflateStrategy((int) (short) 3);
        int int3 = gzipParameters0.getDeflateStrategy();
        gzipParameters0.setBufferSize(32768);
        gzipParameters0.setModificationTime(312764894000L);
        // The following exception was thrown during execution in test generation
        try {
            gzipParameters0.setCompressionLevel(256);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid gzip compression level: 256");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters4 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        deflateParameters4.setWithZlibHeader(false);
        deflateParameters4.setWithZlibHeader(true);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) brotliCompressorInputStream3, deflateParameters4);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream12 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) deflateCompressorInputStream9, "zip", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream15 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) zipArchiveInputStream12, true, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) 7);
        boolean boolean5 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray3, 256);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray3, 263, 16384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 263");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1, 2, -24, 3, 2, -24, 3]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[7, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date3 = cpioArchiveEntry2.getLastModifiedDate();
        cpioArchiveEntry2.setRemoteDeviceMaj((long) 'a');
        int int6 = cpioArchiveEntry2.getAlignmentBoundary();
        long long7 = cpioArchiveEntry2.getRemoteDeviceMaj();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry2.setRemoteDevice((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream3 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream2);
        tarArchiveInputStream4.close();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) tarArchiveInputStream4, file6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        java.io.InputStream inputStream19 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream19);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream22 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream20, "pass");
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy23 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zipArchiveInputStream20, pack200Strategy23, strMap24);
        int int26 = pack200CompressorInputStream25.read();
        java.io.InputStream inputStream27 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream28 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream27);
        zipArchiveInputStream28.mark((int) (byte) -1);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream31 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) zipArchiveInputStream28);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy32 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream33 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) jarArchiveInputStream31, pack200Strategy32);
        java.nio.channels.SeekableByteChannel seekableByteChannel34 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream35 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel34);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream37 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream35, strMap36);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream38 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream37);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer39 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap40 = packer39.properties();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream41 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream38, (java.util.Map<java.lang.String, java.lang.String>) strMap40);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream42 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream25, pack200Strategy32, (java.util.Map<java.lang.String, java.lang.String>) strMap40);
        org.apache.commons.compress.java.util.jar.Pack200.Packer packer43 = org.apache.commons.compress.java.util.jar.Pack200.newPacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap44 = packer43.properties();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil46 = new org.apache.commons.compress.compressors.FileNameUtil((java.util.Map<java.lang.String, java.lang.String>) strMap44, ".lzma");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream47 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) pack200CompressorInputStream25, (java.util.Map<java.lang.String, java.lang.String>) strMap44);
        long long49 = pack200CompressorInputStream25.skip((long) 2162688);
        java.io.File file50 = null;
        org.apache.commons.compress.archivers.examples.CloseableConsumer closeableConsumer51 = org.apache.commons.compress.archivers.examples.CloseableConsumer.NULL_CONSUMER;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand((java.io.InputStream) pack200CompressorInputStream25, file50, closeableConsumer51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(archiveEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(pack200Strategy23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 80 + "'", int26 == 80);
        org.junit.Assert.assertNotNull(pack200Strategy32);
        org.junit.Assert.assertNotNull(packer39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(packer43);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(closeableConsumer51);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream.matches(byteArray0, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect2 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream3 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream(inputStream0, framedSnappyDialect2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) framedSnappyCompressorInputStream3, 100, 508);
        long long7 = framedSnappyCompressorInputStream3.getCompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = framedSnappyCompressorInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + framedSnappyDialect2 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect2.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str4 = jarArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream3);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path9 = tarArchiveEntry8.getPath();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path13 = tarArchiveEntry12.getPath();
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry12.setCreationTime(fileTime14);
        java.nio.file.attribute.FileTime fileTime16 = tarArchiveEntry12.getLastModifiedTime();
        tarArchiveEntry8.setLastAccessTime(fileTime16);
        java.lang.String str18 = tarArchiveEntry8.getName();
        java.lang.String str19 = tarArchiveEntry8.getLinkName();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream3.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
        org.junit.Assert.assertNull(path9);
        org.junit.Assert.assertNull(path13);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "deflate64" + "'", str18, "deflate64");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getCompressedFilename("apkm");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "apkm.gz" + "'", str1, "apkm.gz");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64");
        boolean boolean2 = tarArchiveEntry1.isBlockDevice();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unicodePathExtraField0.getLocalFileDataLength();
        byte[] byteArray2 = unicodePathExtraField0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        java.util.Date date7 = cpioArchiveEntry6.getLastModifiedDate();
        cpioArchiveEntry6.setRemoteDeviceMin((long) 12);
        boolean boolean10 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("hi!", (long) '4');
        int int14 = cpioArchiveEntry13.getHeaderPadCount();
        boolean boolean15 = zipArchiveOutputStream1.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry13);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry17 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData18 = jarArchiveEntry17.getUnparseableExtraFieldData();
        jarArchiveEntry17.setCompressedSize((long) 64);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray22 = jarArchiveEntry17.getExtraFields(false);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream1.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(unparseableExtraFieldData18);
        org.junit.Assert.assertNotNull(zipExtraFieldArray22);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = brotliCompressorInputStream3.skip(1687209600L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.lang.String str2 = zipArchiveOutputStream1.getEncoding();
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream3 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream1);
        java.lang.String str4 = jarArchiveOutputStream3.getEncoding();
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream5 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream3);
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream5.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: No current entry to close");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF8" + "'", str2, "UTF8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF8" + "'", str4, "UTF8");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream2.finish();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = x000A_NTFS1.getModifyTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort14 = x000A_NTFS1.getHeaderId();
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField15 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        boolean boolean21 = org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream.matches(byteArray19, (int) (short) -1);
        org.apache.commons.compress.archivers.zip.ExtraFieldParsingBehavior extraFieldParsingBehavior23 = null;
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray24 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.parse(byteArray19, false, extraFieldParsingBehavior23);
        boolean boolean26 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray19, 32768);
        unrecognizedExtraField15.setLocalFileDataData(byteArray19);
        x000A_NTFS1.parseFromLocalFileData(byteArray19, 1000, (int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.compress.archivers.tar.TarUtils.formatOctalBytes((long) (short) 10, byteArray19, 263, 32771);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33031");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEightByteInteger2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
        org.junit.Assert.assertNotNull(zipShort12);
        org.junit.Assert.assertNotNull(zipEightByteInteger13);
        org.junit.Assert.assertNotNull(zipShort14);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        int int1 = asiExtraField0.getMode();
        boolean boolean2 = asiExtraField0.isDirectory();
        asiExtraField0.setLinkedFile("error");
        asiExtraField0.setLinkedFile("pack.effort");
        java.lang.Object obj7 = asiExtraField0.clone();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = asiExtraField0.getLocalFileDataLength();
        asiExtraField0.setUserId((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(zipShort8);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream3 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream2);
        long long4 = brotliCompressorInputStream3.getCompressedCount();
        java.lang.String str5 = brotliCompressorInputStream3.toString();
        // The following exception was thrown during execution in test generation
        try {
            brotliCompressorInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(seekableByteChannel0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream3 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream1, strMap2);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream4 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream5 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream6 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream3);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize8 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1;
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder12 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder14 = builder12.withNiceBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder16 = builder14.withMaxBackReferenceLength(80);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters17 = builder16.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters18 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, true, false, false, parameters17);
        int int19 = parameters17.getNiceBackReferenceLength();
        int int20 = parameters17.getMaxCandidates();
        org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream21 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream6, 18L, parameters17);
        // The following exception was thrown during execution in test generation
        try {
            snappyCompressorOutputStream21.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + blockSize8 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1 + "'", blockSize8.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M1));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(parameters17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 512 + "'", int20 == 512);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream1 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream(inputStream0);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream2 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) zipArchiveInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream4 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) arArchiveInputStream2, true);
        int int5 = tarArchiveInputStream4.getRecordSize();
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry7 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData8 = jarArchiveEntry7.getUnparseableExtraFieldData();
        jarArchiveEntry7.setCompressedSize((long) 64);
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature11 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException12 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature11);
        boolean boolean13 = jarArchiveEntry7.equals((java.lang.Object) unsupportedZipFeatureException12);
        boolean boolean14 = tarArchiveInputStream4.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) jarArchiveEntry7);
        boolean boolean15 = jarArchiveEntry7.isDirectory();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 512 + "'", int5 == 512);
        org.junit.Assert.assertNull(unparseableExtraFieldData8);
        org.junit.Assert.assertNotNull(feature11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
        tarArchiveOutputStream6.setBigNumberMode(100);
        byte[] byteArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveOutputStream6.write(byteArray18, 26128, 25461);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Request to write '25461' bytes exceeds size in header of '0' bytes for entry 'deflate64'");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        int int1 = asiExtraField0.getMode();
        boolean boolean2 = asiExtraField0.isDirectory();
        byte[] byteArray3 = asiExtraField0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = asiExtraField0.getHeaderId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField(2162688, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Alignment must be between 0 and 0x7fff, was: 2162688");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("bzip2");
        long long2 = jarArchiveEntry1.getCrc();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource3 = jarArchiveEntry1.getCommentSource();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("`\n");
        tarArchiveEntry5.setGroupId((long) (short) 2);
        int int8 = tarArchiveEntry5.getGroupId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path12 = tarArchiveEntry11.getPath();
        java.lang.String str13 = tarArchiveEntry11.getName();
        boolean boolean14 = tarArchiveEntry11.isFile();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp15 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = x5455_ExtendedTimestamp15.getAccessTime();
        byte[] byteArray17 = x5455_ExtendedTimestamp15.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("deflate64", (byte) 77);
        java.nio.file.Path path21 = tarArchiveEntry20.getPath();
        java.nio.file.attribute.FileTime fileTime22 = null;
        tarArchiveEntry20.setCreationTime(fileTime22);
        java.nio.file.attribute.FileTime fileTime24 = tarArchiveEntry20.getLastModifiedTime();
        x5455_ExtendedTimestamp15.setAccessFileTime(fileTime24);
        tarArchiveEntry11.setLastModifiedTime(fileTime24);
        tarArchiveEntry5.setLastModifiedTime(fileTime24);
        java.util.zip.ZipEntry zipEntry28 = jarArchiveEntry1.setCreationTime(fileTime24);
        int int29 = jarArchiveEntry1.getMethod();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + commentSource3 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource3.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(path12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "deflate64" + "'", str13, "deflate64");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(zipLong16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0]");
        org.junit.Assert.assertNull(path21);
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertNotNull(zipEntry28);
        org.junit.Assert.assertEquals(zipEntry28.toString(), "bzip2");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        pack200CompressorOutputStream7.write(0);
        pack200CompressorOutputStream7.write(65536);
        org.junit.Assert.assertNotNull(packer5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException("\000\000");
    }
}
