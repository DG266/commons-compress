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
package org.apache.commons.compress.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression4Test {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long4 = zipArchiveEntry1.getTime();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields(false);
        int int7 = zipArchiveEntry1.getRawFlag();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry(zipArchiveEntry1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ZIP compression method can not be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withMaxNumberOfCandidates(2097655);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder2.withMaxBackReferenceLength((int) (byte) 49);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, 10);
        long long14 = cpioArchiveInputStream12.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream17 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream16.getNextEntry();
        byte[] byteArray19 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream16);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, 11, (-1), byteArray19, 0, 96);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(byteArray19, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) (byte) 52);
        boolean boolean3 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray1, (int) (byte) 88);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 1);
        bZip2CompressorOutputStream7.finish();
        bZip2CompressorOutputStream7.close();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, 10);
        long long14 = cpioArchiveInputStream12.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream18 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream19 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream18);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream20 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream18);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy21 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime26 = null;
        tarArchiveEntry25.setStatusChangeTime(fileTime26);
        tarArchiveEntry25.setUserName("unpack.progress");
        tarArchiveEntry25.setUserId((long) 29127);
        tarArchiveEntry25.setMode(263);
        tarArchiveEntry25.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = tarArchiveEntry25.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream37 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream20, pack200Strategy21, strMap36);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream38 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) bZip2CompressorOutputStream7, pack200Strategy21);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy21);
        org.junit.Assert.assertNotNull(strMap36);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) 10);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray17);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        zstdCompressorOutputStream8.write(byteArray19, 1, 29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        org.apache.commons.compress.utils.CountingOutputStream countingOutputStream24 = new org.apache.commons.compress.utils.CountingOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        java.io.OutputStream outputStream25 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream26 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream25);
        byte[] byteArray28 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream26.write(byteArray28);
        boolean boolean31 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray28, (int) (byte) -1);
        boolean boolean33 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray28, 29127);
        boolean boolean35 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray28, 33188);
        countingOutputStream24.write(byteArray28);
        countingOutputStream24.write((int) (byte) 4);
        // The following exception was thrown during execution in test generation
        try {
            countingOutputStream24.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        tarArchiveEntry3.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = tarArchiveEntry3.getExtraPaxHeaders();
        long long15 = tarArchiveEntry3.getDataOffset();
        boolean boolean16 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel11 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = seekableInMemoryByteChannel11.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray14 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray14);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray16 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray16);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel17);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray19 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel11, seekableByteChannel15, seekableByteChannel17 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList20 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList20, seekableByteChannelArray19);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel22 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList20);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel23 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList20);
        multiReadOnlySeekableByteChannel23.close();
        long long25 = multiReadOnlySeekableByteChannel23.position();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(seekableByteChannelArray14);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNotNull(seekableByteChannelArray16);
        org.junit.Assert.assertNotNull(seekableByteChannel17);
        org.junit.Assert.assertNotNull(seekableByteChannelArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesUTF8ForNames();
        boolean boolean3 = generalPurposeBit0.usesStrongEncryption();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy11 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime16 = null;
        tarArchiveEntry15.setStatusChangeTime(fileTime16);
        tarArchiveEntry15.setUserName("unpack.progress");
        tarArchiveEntry15.setUserId((long) 29127);
        tarArchiveEntry15.setMode(263);
        tarArchiveEntry15.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = tarArchiveEntry15.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream27 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) zstdCompressorInputStream10, pack200Strategy11, strMap26);
        org.apache.commons.compress.compressors.snappy.FramedSnappyDialect framedSnappyDialect29 = org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream30 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) zstdCompressorInputStream10, 155, framedSnappyDialect29);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream32 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream31);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream32.write(byteArray34);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream36 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy38 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream37.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        java.io.OutputStream outputStream40 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream41 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream40);
        byte[] byteArray43 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream41.write(byteArray43);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream45 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream41);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream46 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream41);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean52 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray50, (int) (short) 10);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray55);
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray50);
        zipArchiveOutputStream46.writePreamble(byteArray57);
        zipArchiveOutputStream46.setMethod((int) (short) 1);
        java.io.OutputStream outputStream61 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream62 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream61);
        byte[] byteArray64 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream62.write(byteArray64);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream66 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream62);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream67 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream62);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy68 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream67.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy68);
        zipArchiveOutputStream46.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy68);
        zipArchiveOutputStream37.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy68);
        byte[] byteArray78 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean80 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray78, (int) (short) 100);
        boolean boolean82 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray78, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile84 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray78, true);
        boolean boolean86 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray78, 21);
        zipArchiveOutputStream37.writePreamble(byteArray78, (int) (short) 10, 36864);
        int int92 = framedSnappyCompressorInputStream30.read(byteArray78, (int) (byte) 52, (int) (byte) 76);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(pack200Strategy11);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + framedSnappyDialect29 + "' != '" + org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE + "'", framedSnappyDialect29.equals(org.apache.commons.compress.compressors.snappy.FramedSnappyDialect.IWORK_ARCHIVE));
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray43), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy68);
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray78), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream11 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        lZMACompressorOutputStream10.flush();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream framedLZ4CompressorOutputStream13 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode14 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField15 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField16 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort17 = unicodePathExtraField16.getHeaderId();
        unrecognizedExtraField15.setHeaderId(zipShort17);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort19 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField15.setHeaderId(zipShort19);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField21 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort19);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField22 = extraFieldParsingMode14.createExtraField(zipShort19);
        byte[] byteArray23 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY;
        org.apache.commons.compress.archivers.tar.TarFile tarFile24 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray23);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField29 = extraFieldParsingMode14.onUnparseableExtraField(byteArray23, (int) '4', 0, false, (int) (byte) 55);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry31 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit32 = null;
        zipArchiveEntry31.setGeneralPurposeBit(generalPurposeBit32);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray35 = zipArchiveEntry31.getExtraFields(false);
        byte[] byteArray36 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray35);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField41 = extraFieldParsingMode14.onUnparseableExtraField(byteArray36, 1024, 60011, true, 420);
        // The following exception was thrown during execution in test generation
        try {
            framedLZ4CompressorOutputStream13.write(byteArray36, (int) (byte) 1, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode14 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode14.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(zipShort17);
        org.junit.Assert.assertNotNull(zipShort19);
        org.junit.Assert.assertNotNull(zipExtraField21);
        org.junit.Assert.assertNotNull(zipExtraField22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertNull(zipExtraField29);
        org.junit.Assert.assertNotNull(zipExtraFieldArray35);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[]");
        org.junit.Assert.assertNull(zipExtraField41);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier1 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable2 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        parallelScatterZipCreator3.writeTo(zipArchiveOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier12 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable13 = parallelScatterZipCreator3.createCallable(zipArchiveEntryRequestSupplier12);
        parallelScatterZipCreator0.submitStreamAwareCallable(scatterZipOutputStreamCallable13);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics15 = parallelScatterZipCreator0.getStatisticsMessage();
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable13);
        org.junit.Assert.assertNotNull(scatterStatistics15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        boolean boolean8 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray4, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock11 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray4, (int) (short) 100, 1);
        int int12 = literalBlock11.getLength();
        int int13 = literalBlock11.getOffset();
        int int14 = literalBlock11.getLength();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream4, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream6, "bzip2");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream10 = archiveStreamFactory0.createArchiveInputStream("cpio.gz", (java.io.InputStream) zipArchiveInputStream8, "z");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: cpio.gz not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = null;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream24 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream23);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) xZCompressorOutputStream24);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader2 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader2.setCentralDirectoryData(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray4, (int) (short) -1, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        boolean boolean1 = org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename("z");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory1 = new org.apache.commons.compress.archivers.ArchiveStreamFactory("cpio.gz");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        long long5 = cpioArchiveEntry1.getInode();
        cpioArchiveEntry1.setSize((long) '#');
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry13.setStatusChangeTime(fileTime14);
        tarArchiveEntry13.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry21 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean22 = tarArchiveEntry13.equals(tarArchiveEntry21);
        java.nio.file.attribute.FileTime fileTime24 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry21.setLastModifiedTime(fileTime24);
        tarArchiveEntry8.setLastAccessTime(fileTime24);
        java.util.Date date28 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime29 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date28);
        tarArchiveEntry8.setModTime(fileTime29);
        int int31 = tarArchiveEntry8.getDevMinor();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean36 = tarArchiveEntry35.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry40 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean41 = tarArchiveEntry35.equals(tarArchiveEntry40);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry45 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime46 = null;
        tarArchiveEntry45.setStatusChangeTime(fileTime46);
        tarArchiveEntry45.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry53 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean54 = tarArchiveEntry45.equals(tarArchiveEntry53);
        java.nio.file.attribute.FileTime fileTime56 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry53.setLastModifiedTime(fileTime56);
        tarArchiveEntry40.setLastAccessTime(fileTime56);
        java.util.Date date60 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime61 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date60);
        tarArchiveEntry40.setModTime(fileTime61);
        java.util.Date date63 = tarArchiveEntry40.getLastModifiedDate();
        boolean boolean64 = tarArchiveEntry8.isDescendent(tarArchiveEntry40);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(fileTime56);
        org.junit.Assert.assertNotNull(date60);
        org.junit.Assert.assertEquals(date60.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime61);
        org.junit.Assert.assertNotNull(date63);
        org.junit.Assert.assertEquals(date63.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = null;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream22, "jar");
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) cpioArchiveOutputStream24, (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) 10);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        zipArchiveOutputStream7.writePreamble(byteArray18);
        zipArchiveOutputStream7.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry22 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry22.setInode((long) 2048);
        java.util.Date date25 = cpioArchiveEntry22.getLastModifiedDate();
        cpioArchiveEntry22.setChksum(0L);
        boolean boolean28 = zipArchiveOutputStream7.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry22);
        java.io.File file29 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream7, file29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(date25);
        org.junit.Assert.assertEquals(date25.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore3 = defaultBackingStoreSupplier1.get();
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(scatterGatherBackingStore3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) 10);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray17);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        zstdCompressorOutputStream8.write(byteArray19, 1, 29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream23 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        org.apache.commons.compress.utils.CountingOutputStream countingOutputStream24 = new org.apache.commons.compress.utils.CountingOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField25 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField26 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort27 = unicodePathExtraField26.getHeaderId();
        unrecognizedExtraField25.setHeaderId(zipShort27);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort29 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField25.setHeaderId(zipShort29);
        byte[] byteArray35 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean37 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray35, (int) (short) 10);
        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean41 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray35, byteArray40);
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray35);
        boolean boolean44 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray35, (int) (short) 100);
        boolean boolean46 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray35, 3);
        boolean boolean47 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray35);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean53 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray51, (int) (short) 10);
        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean57 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray51, byteArray56);
        boolean boolean59 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray35, byteArray51, false);
        unrecognizedExtraField25.setCentralDirectoryData(byteArray51);
        countingOutputStream24.write(byteArray51);
        long long62 = countingOutputStream24.getBytesWritten();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(zipShort27);
        org.junit.Assert.assertNotNull(zipShort29);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray51), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 3L + "'", long62 == 3L);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("ZipShort value: 14", (long) (byte) 76, (int) (byte) 54, (int) (byte) 88, (int) (short) 12, (long) (byte) 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean16 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray14, (int) (short) 10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray14, byteArray19);
        int int21 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) zstdCompressorInputStream10, byteArray19);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream22 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zstdCompressorInputStream10);
        org.apache.commons.compress.archivers.ar.ArArchiveInputStream arArchiveInputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveInputStream((java.io.InputStream) brotliCompressorInputStream22);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime19 = null;
        tarArchiveEntry18.setStatusChangeTime(fileTime19);
        tarArchiveEntry18.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry26 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean27 = tarArchiveEntry18.equals(tarArchiveEntry26);
        java.nio.file.attribute.FileTime fileTime29 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry26.setLastModifiedTime(fileTime29);
        tarArchiveEntry13.setLastAccessTime(fileTime29);
        tarArchiveEntry4.setModTime(fileTime29);
        x5455_ExtendedTimestamp0.setCreateFileTime(fileTime29);
        long long34 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(fileTime29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(fileTime29);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 504L + "'", long34 == 504L);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField4.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger10);
        byte[] byteArray12 = zipEightByteInteger10.getBytes();
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream13 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) zstdCompressorInputStream12);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream14 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) closeShieldFilterInputStream13);
        long long15 = deflate64CompressorInputStream14.getCompressedCount();
        deflate64CompressorInputStream14.close();
        int int17 = deflate64CompressorInputStream14.available();
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream blockLZ4CompressorInputStream18 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream((java.io.InputStream) deflate64CompressorInputStream14);
        int int19 = blockLZ4CompressorInputStream18.available();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData4 = zipArchiveEntry1.getUnparseableExtraFieldData();
        boolean boolean5 = zipArchiveEntry1.isStreamContiguous();
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry1.getExtraFields();
        boolean boolean7 = zipArchiveEntry1.isStreamContiguous();
        int int8 = zipArchiveEntry1.getRawFlag();
        zipArchiveEntry1.setExternalAttributes(1L);
        org.junit.Assert.assertNull(unparseableExtraFieldData4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) 10);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        zipArchiveOutputStream7.writePreamble(byteArray18);
        zipArchiveOutputStream7.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = null;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        long long24 = zipArchiveOutputStream7.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory26 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream27 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream28 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream27);
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream28.write(byteArray30);
        x0016_CertificateIdForCentralDirectory26.setCentralDirectoryData(byteArray30);
        boolean boolean34 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray30, 263);
        zipArchiveOutputStream7.writePreamble(byteArray30, (int) (byte) 48, 148);
        org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 49152, byteArray30, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray30, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 25L + "'", long24 == 25L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[0, -64, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray5);
        java.lang.String str7 = zipLong6.toString();
        long long8 = zipLong6.getValue();
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZipLong value: 808471376" + "'", str7, "ZipLong value: 808471376");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 808471376L + "'", long8 == 808471376L);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        lZMACompressorOutputStream10.write(16877);
        lZMACompressorOutputStream10.write((int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setHasStream(false);
        boolean boolean5 = sevenZArchiveEntry0.hasStream();
        sevenZArchiveEntry0.setSize((long) 0);
        boolean boolean8 = sevenZArchiveEntry0.getHasCrc();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1, 10);
        java.io.OutputStream outputStream5 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream6 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream5);
        byte[] byteArray8 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream6.write(byteArray8);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream10 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream6);
        long long12 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream3, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream6, 36864);
        int int13 = cpioArchiveInputStream3.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream15 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, 2);
        byte[] byteArray17 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) cpioArchiveInputStream3, 12);
        // The following exception was thrown during execution in test generation
        try {
            x7875_NewUnix0.parseFromLocalFileData(byteArray17, (int) (short) 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField4.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField4.getLocalFileDataData();
        zip64ExtendedInformationExtraField4.reparseCentralDirectoryData(true, false, true, false);
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException1 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("apkm");
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException2 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) streamingNotSupportedException1);
        org.apache.commons.compress.archivers.dump.DumpArchiveException dumpArchiveException3 = new org.apache.commons.compress.archivers.dump.DumpArchiveException((java.lang.Throwable) dumpArchiveException2);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier scatterGatherBackingStoreSupplier1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, scatterGatherBackingStoreSupplier1, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream blockLZ4CompressorOutputStream11 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10);
        // The following exception was thrown during execution in test generation
        try {
            lZMACompressorOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy20 = null;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy20);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream22 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream23 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream24 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream23);
        xZCompressorOutputStream24.finish();
        // The following exception was thrown during execution in test generation
        try {
            xZCompressorOutputStream24.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry3 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str5 = x5455_ExtendedTimestamp4.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp4.setModifyTime(zipLong6);
        boolean boolean8 = x5455_ExtendedTimestamp4.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp9 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry13.setStatusChangeTime(fileTime14);
        tarArchiveEntry13.setUserName("unpack.progress");
        tarArchiveEntry13.addPaxHeader("dump", "ISO-8859-1");
        java.util.Date date21 = tarArchiveEntry13.getModTime();
        x5455_ExtendedTimestamp9.setAccessJavaTime(date21);
        x5455_ExtendedTimestamp4.setCreateJavaTime(date21);
        java.nio.file.attribute.FileTime fileTime24 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date21);
        java.util.zip.ZipEntry zipEntry25 = zipArchiveEntry3.setLastAccessTime(fileTime24);
        boolean boolean26 = sevenZMethodConfiguration1.equals((java.lang.Object) zipArchiveEntry3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Mon Jun 19 00:09:37 CEST 2023");
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertNotNull(zipEntry25);
        org.junit.Assert.assertEquals(zipEntry25.toString(), "pack.method.attribute.");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.Always + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.Always));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream23 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) arArchiveOutputStream23, (short) (byte) 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 54");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str1 = org.apache.commons.compress.utils.FileNameUtils.getExtension("deflate");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        long long3 = tarArchiveEntry2.getSize();
        boolean boolean4 = tarArchiveEntry2.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\n\000\000", false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry1 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.unknown.attribute");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        boolean boolean3 = resourceAlignmentExtraField2.allowMethodChange();
        boolean boolean4 = resourceAlignmentExtraField2.allowMethodChange();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong5 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray6 = zipLong5.getBytes();
        byte[] byteArray7 = zipLong5.getBytes();
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel8 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray7);
        byte[] byteArray9 = seekableInMemoryByteChannel8.array();
        // The following exception was thrown during execution in test generation
        try {
            resourceAlignmentExtraField2.parseFromLocalFileData(byteArray9, (int) (short) 12, 134695760);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(zipLong5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[80, 75, 48, 48]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray2);
        byte[] byteArray4 = x0017_StrongEncryptionHeader0.getLocalFileDataData();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray8, (int) (short) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry tarArchiveSparseEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.util.concurrent.ExecutorService executorService1 = null;
        java.nio.file.Path path2 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier3 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path2);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService1, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator6 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier3, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, 10);
        long long14 = cpioArchiveInputStream12.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream16 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream12, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream17 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream16);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry18 = jarArchiveInputStream16.getNextEntry();
        byte[] byteArray19 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream16);
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, 11, (-1), byteArray19, 0, 96);
        boolean boolean24 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray5, 16);
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(archiveEntry18);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry1.setMethod((int) (byte) 88);
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader4 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm5 = x0017_StrongEncryptionHeader4.getHashAlgorithm();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean11 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray9, (int) (short) 10);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, byteArray14);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel16 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray9);
        x0017_StrongEncryptionHeader4.setLocalFileDataData(byteArray9);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x0017_StrongEncryptionHeader4);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField19 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort21 = unicodePathExtraField20.getHeaderId();
        unrecognizedExtraField19.setHeaderId(zipShort21);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort23 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField19.setHeaderId(zipShort23);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort25 = unrecognizedExtraField19.getCentralDirectoryLength();
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unrecognizedExtraField19);
        java.nio.file.attribute.FileTime fileTime27 = zipArchiveEntry1.getLastAccessTime();
        org.junit.Assert.assertNull(hashAlgorithm5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(zipShort21);
        org.junit.Assert.assertNotNull(zipShort23);
        org.junit.Assert.assertNotNull(zipShort25);
        org.junit.Assert.assertNull(fileTime27);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.io.File file0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream9 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream6, (int) 'a', false);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        zstdCompressorOutputStream9.write(byteArray20, 1, 29127);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream9);
        org.apache.commons.compress.utils.CountingOutputStream countingOutputStream25 = new org.apache.commons.compress.utils.CountingOutputStream((java.io.OutputStream) zstdCompressorOutputStream9);
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream27 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream26);
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream27.write(byteArray29);
        boolean boolean32 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray29, (int) (byte) -1);
        boolean boolean34 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray29, 29127);
        boolean boolean36 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray29, 33188);
        countingOutputStream25.write(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(file0, (java.io.OutputStream) countingOutputStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource commentSource6 = zipArchiveEntry1.getCommentSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertTrue("'" + commentSource6 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT + "'", commentSource6.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource.COMMENT));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 88, (byte) 55, (byte) 48, (byte) 0, (byte) 55 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("bzip2", byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = unicodeCommentExtraField8.getHeaderId();
        java.io.InputStream inputStream10 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream10, 10);
        long long14 = cpioArchiveInputStream12.skip(100L);
        long long16 = cpioArchiveInputStream12.skip((long) 29127);
        byte[] byteArray17 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream12);
        org.apache.commons.compress.archivers.tar.TarFile tarFile19 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray17, "lzma");
        unicodeCommentExtraField8.setUnicodeName(byteArray17);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 88, 55, 48, 0, 55]");
        org.junit.Assert.assertNotNull(zipShort9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(file0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.compress.changes.ChangeSetResults changeSetResults0 = new org.apache.commons.compress.changes.ChangeSetResults();
        java.util.List<java.lang.String> strList1 = changeSetResults0.getAddedFromStream();
        java.util.List<java.lang.String> strList2 = changeSetResults0.getAddedFromChangeSet();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean1 = arjArchiveEntry0.isHostOsUnix();
        boolean boolean3 = arjArchiveEntry0.equals((java.lang.Object) "\000\000!\000");
        long long4 = arjArchiveEntry0.getSize();
        long long5 = arjArchiveEntry0.getSize();
        int int6 = arjArchiveEntry0.getMode();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        boolean boolean1 = org.apache.commons.compress.archivers.zip.ZipUtil.isDosTime((long) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 76, path1, "lz4-block", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap2 = compressorStreamFactory1.getCompressorOutputStreamProviders();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int1 = gzipParameters0.getOperatingSystem();
        gzipParameters0.setBufferSize((int) (byte) 53);
        long long4 = gzipParameters0.getModificationTime();
        java.lang.String str5 = gzipParameters0.getComment();
        java.lang.String str6 = gzipParameters0.getComment();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier1 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable2 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier1);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator3 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream10 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        parallelScatterZipCreator3.writeTo(zipArchiveOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier12 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable13 = parallelScatterZipCreator3.createCallable(zipArchiveEntryRequestSupplier12);
        parallelScatterZipCreator0.submitStreamAwareCallable(scatterZipOutputStreamCallable13);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry16 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry16.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime19 = zipArchiveEntry16.getCreationTime();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier20 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable21 = parallelScatterZipCreator0.createCallable(zipArchiveEntry16, inputStreamSupplier20);
        long long22 = zipArchiveEntry16.getDataOffset();
        long long23 = zipArchiveEntry16.getDataOffset();
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable13);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        boolean boolean2 = cpioArchiveEntry1.isPipe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("pack.unknown.attribute");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        int int12 = cpioArchiveInputStream2.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream15 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream blockLZ4CompressorInputStream16 = new org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            zstdCompressorInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer7 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2, 2048, "ar");
        tarArchiveOutputStream10.setLongFileMode(8);
        tarArchiveOutputStream10.finish();
        tarArchiveOutputStream10.setBigNumberMode((int) (byte) 49);
        java.nio.file.Path path16 = null;
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry17 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean18 = arjArchiveEntry17.isHostOsUnix();
        boolean boolean20 = arjArchiveEntry17.equals((java.lang.Object) "\000\000!\000");
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet21 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption;
        boolean boolean22 = arjArchiveEntry17.equals((java.lang.Object) fileVisitOptionSet21);
        java.nio.file.LinkOption linkOption23 = null;
        java.nio.file.LinkOption[] linkOptionArray24 = new java.nio.file.LinkOption[] { linkOption23 };
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) tarArchiveOutputStream10, path16, fileVisitOptionSet21, linkOptionArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(fileVisitOptionSet21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(linkOptionArray24);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray10, byteArray15);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray10);
        zipArchiveOutputStream6.writePreamble(byteArray17);
        zipArchiveOutputStream6.finish();
        zipArchiveOutputStream6.setLevel(4);
        zipArchiveOutputStream6.setFallbackToUTF8(true);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Trying to close non-existent entry");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
    }
}
