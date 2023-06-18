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
public class Regression2Test {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream1, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream5 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream3, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream8 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream5, 100L, (int) '#');
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream10);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream11.write(byteArray13);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream15 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream11);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream18 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream15, (int) 'a', false);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray22, (int) (short) 10);
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray22, byteArray27);
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray22);
        zstdCompressorOutputStream18.write(byteArray29, 1, 29127);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream18);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry37 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime38 = null;
        tarArchiveEntry37.setStatusChangeTime(fileTime38);
        tarArchiveEntry37.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry45 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean46 = tarArchiveEntry37.equals(tarArchiveEntry45);
        boolean boolean47 = zipArchiveOutputStream33.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry45);
        long long48 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cRC32VerifyingInputStream8, (long) (short) 1, (java.io.OutputStream) zipArchiveOutputStream33);
        java.nio.file.Path path49 = null;
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet50 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption;
        java.nio.file.LinkOption[] linkOptionArray51 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream33, path49, fileVisitOptionSet50, linkOptionArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(fileVisitOptionSet50);
        org.junit.Assert.assertNotNull(linkOptionArray51);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setIds(255, (int) (byte) 55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException0 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ARJ;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "arj" + "'", str0, "arj");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.nio.file.Path path0 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier1 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path0);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore2 = defaultBackingStoreSupplier1.get();
        java.io.InputStream inputStream3 = scatterGatherBackingStore2.getInputStream();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField8 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger4, zipEightByteInteger5, zipEightByteInteger6, zipLong7);
        byte[] byteArray9 = zip64ExtendedInformationExtraField8.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile11 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9, true);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream16 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream14, 10);
        long long18 = cpioArchiveInputStream16.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream20 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream16, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream21 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream20);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry22 = jarArchiveInputStream20.getNextEntry();
        byte[] byteArray23 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream20);
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, 11, (-1), byteArray23, 0, 96);
        // The following exception was thrown during execution in test generation
        try {
            scatterGatherBackingStore2.writeOut(byteArray9, (-1), 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scatterGatherBackingStore2);
        org.junit.Assert.assertNotNull(inputStream3);
        org.junit.Assert.assertNotNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(archiveEntry22);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        int int15 = closeShieldFilterInputStream13.available();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs hostOs0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry.HostOs();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        boolean boolean23 = multiReadOnlySeekableByteChannel22.isOpen();
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = multiReadOnlySeekableByteChannel22.position(134695760L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile30 = new org.apache.commons.compress.archivers.zip.ZipFile((java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel22, "deflate", "", true, true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(seekableByteChannel25);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream5 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) deflateCompressorInputStream4);
        long long6 = deflateCompressorInputStream4.getCompressedCount();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode7 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField15 = extraFieldParsingMode7.onUnparseableExtraField(byteArray10, (int) (short) 0, 84446, true, 16877);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = deflateCompressorInputStream4.read(byteArray10, 488, (int) (byte) 83);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode7 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode7.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNull(zipExtraField15);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 2048, "ar");
        tarArchiveOutputStream9.setLongFileMode(8);
        tarArchiveOutputStream9.setAddPaxHeadersForNonAsciiNames(true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = new org.apache.commons.compress.archivers.zip.ZipLong((long) 'a');
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile24 = null;
        java.nio.file.Path path25 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile24, path25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lz4-framed", (long) 345, 5, 0, 10, (long) 2);
        int int7 = arArchiveEntry6.getUserId();
        boolean boolean8 = arArchiveEntry6.isDirectory();
        long long9 = arArchiveEntry6.getSize();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 345L + "'", long9 == 345L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        jarArchiveOutputStream9.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream14);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream15.write(byteArray17);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        int int24 = jarArchiveOutputStream9.getCount();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        java.io.File file15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(file15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration sevenZMethodConfiguration1 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration(sevenZMethod0);
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod2 = sevenZMethodConfiguration1.getMethod();
        org.junit.Assert.assertNull(sevenZMethod2);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.compress.utils.InputStreamStatistics[] inputStreamStatisticsArray0 = new org.apache.commons.compress.utils.InputStreamStatistics[] {};
        java.util.HashSet<org.apache.commons.compress.utils.InputStreamStatistics> inputStreamStatisticsSet1 = org.apache.commons.compress.utils.Sets.newHashSet(inputStreamStatisticsArray0);
        org.junit.Assert.assertNotNull(inputStreamStatisticsArray0);
        org.junit.Assert.assertNotNull(inputStreamStatisticsSet1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        generalPurposeBit0.useUTF8ForNames(false);
        boolean boolean3 = generalPurposeBit0.usesDataDescriptor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str1 = org.apache.commons.compress.compressors.gzip.GzipUtils.getCompressedFilename("tar\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tar\000.gz" + "'", str1, "tar\000.gz");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        java.lang.String str6 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\000\000\n" + "'", str6, "\000\000\n");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.io.File file0 = null;
        java.io.File file1 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean5 = tarArchiveEntry4.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = tarArchiveEntry4.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil8 = new org.apache.commons.compress.compressors.FileNameUtil(strMap6, "0x5455 Zip Extra Field: Flags=0 ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200Utils.normalize(file0, file1, strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream14 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        gzipCompressorOutputStream14.flush();
        org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream16 = compressorStreamFactory1.createCompressorOutputStream("lzma", (java.io.OutputStream) gzipCompressorOutputStream14);
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters17 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream18 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) gzipCompressorOutputStream14, gzipParameters17);
        java.lang.String str19 = gzipParameters17.getFilename();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(compressorOutputStream16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            zstdCompressorOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, (int) (short) 100);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, 3);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray4);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray20, (int) (short) 10);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        boolean boolean28 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray20, false);
        boolean boolean30 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray20, 511);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unicodePathExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode10 = null;
        jarArchiveOutputStream9.setUseZip64(zip64Mode10);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream9.setLevel((int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withMaxNumberOfCandidates(2097655);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder2.tunedForCompressionRatio();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder6 = builder4.withMaxNumberOfCandidates(148);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        java.lang.String str12 = tarArchiveEntry8.getLinkName();
        int int13 = tarArchiveEntry8.getUserId();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        java.nio.file.Path path24 = null;
        java.nio.file.Path path25 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(path24, path25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean3 = tarArchiveEntry2.isGNUSparse();
        tarArchiveEntry2.clearExtraPaxHeaders();
        int int5 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.close();
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
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("\000\000", (byte) 52, false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getUncompressedFilename("bzip2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bzip2" + "'", str1, "bzip2");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.DEFLATE_HINT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.deflate.hint" + "'", str0, "pack.deflate.hint");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.REALSIZELEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean28 = tarArchiveEntry27.isPaxGNU1XSparse();
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream23.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        jarArchiveOutputStream9.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream14);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream15.write(byteArray17);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream9.setLevel(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.XZ;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.XZ + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.XZ));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream9);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream10.write(byteArray12);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream14 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray19, (int) (short) 10);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray24);
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        zipArchiveOutputStream15.writePreamble(byteArray26);
        zipArchiveOutputStream15.setMethod((int) (short) 1);
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream31 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream30);
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream31.write(byteArray33);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream35 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy37 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean49 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray47, (int) (short) 100);
        boolean boolean51 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray47, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile53 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray47, true);
        boolean boolean55 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray47, 21);
        zipArchiveOutputStream6.writePreamble(byteArray47, (int) (short) 10, 36864);
        java.io.File file59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry61 = zipArchiveOutputStream6.createArchiveEntry(file59, "dump");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy37);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        boolean boolean3 = zipEightByteInteger1.equals((java.lang.Object) 476);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream6 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy7 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy7);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream9);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream10.write(byteArray12);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream14 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream15 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream10);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean21 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray19, (int) (short) 10);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean25 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray19, byteArray24);
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray19);
        zipArchiveOutputStream15.writePreamble(byteArray26);
        zipArchiveOutputStream15.setMethod((int) (short) 1);
        java.io.OutputStream outputStream30 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream31 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream30);
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream31.write(byteArray33);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream35 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream36 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream31);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy37 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream36.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        zipArchiveOutputStream15.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        zipArchiveOutputStream6.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy37);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian((java.io.OutputStream) zipArchiveOutputStream6, (long) 32768, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy7);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy37);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters12 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream13 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2, deflateParameters12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream framedLZ4CompressorInputStream14 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a LZ4 frame stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        deflateCompressorInputStream4.close();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = deflateCompressorInputStream4.available();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap2 = compressorStreamFactory1.getCompressorInputStreamProviders();
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current entry");
        } catch (java.lang.IllegalStateException e) {
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
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream6 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream(0L, (long) (short) 3, seekableByteChannel3);
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.readFully((java.nio.channels.ReadableByteChannel) seekableByteChannel3, byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        long long23 = zipArchiveOutputStream6.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.setEncoding("`\n");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: `?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25L + "'", long23 == 25L);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        long long10 = brotliCompressorInputStream9.getBytesRead();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory11 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream13 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream12);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream13.write(byteArray15);
        x0016_CertificateIdForCentralDirectory11.setCentralDirectoryData(byteArray15);
        boolean boolean19 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray15, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock22 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray15, (int) (short) 100, 1);
        byte[] byteArray23 = literalBlock22.getData();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = brotliCompressorInputStream9.read(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 33, 0]");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        lZMACompressorOutputStream10.write(16877);
        lZMACompressorOutputStream10.finish();
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
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        byte[] byteArray4 = zipArchiveEntry1.getRawName();
        java.lang.String str5 = zipArchiveEntry1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "pack.method.attribute." + "'", str5, "pack.method.attribute.");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IWOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lz4-block", 312829200000L);
        java.lang.String str3 = arArchiveEntry2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lz4-block" + "'", str3, "lz4-block");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int1 = gzipParameters0.getCompressionLevel();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.nio.ByteBuffer byteBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multiReadOnlySeekableByteChannel23.read(byteBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters8 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream9 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) bZip2CompressorOutputStream7, parameters8);
        // The following exception was thrown during execution in test generation
        try {
            bZip2CompressorOutputStream7.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        sevenZArchiveEntry0.setDirectory(true);
        sevenZArchiveEntry0.setDirectory(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        jarArchiveOutputStream9.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream14);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream15.write(byteArray17);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy21 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream20.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        jarArchiveOutputStream9.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy21);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy21);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        char[] charArray9 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "pack.field.attribute.", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  ]");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        boolean boolean3 = zipEightByteInteger0.equals((java.lang.Object) path1);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField5 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger4);
        org.junit.Assert.assertNotNull(zipEightByteInteger0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(zipEightByteInteger4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.Set<java.lang.String> strSet1 = archiveStreamFactory0.getInputStreamArchiveNames();
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray7, 511);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("cpio.gz", byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort13 = unicodeCommentExtraField12.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory14 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory15 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream17 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream16);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream17.write(byteArray19);
        x0016_CertificateIdForCentralDirectory15.setCentralDirectoryData(byteArray19);
        x0016_CertificateIdForCentralDirectory14.parseFromLocalFileData(byteArray19, 2, (int) (short) 100);
        unicodeCommentExtraField12.setUnicodeName(byteArray19);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(zipShort13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 33, 0]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference backReference2 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference((-1), 504);
        int int3 = backReference2.getLength();
        int int4 = backReference2.getOffset();
        java.lang.String str5 = backReference2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 504 + "'", int3 == 504);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "BackReference with offset -1 and length 504" + "'", str5, "BackReference with offset -1 and length 504");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_0 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        xXHash32_0.reset();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7);
        long long13 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream4, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream7, 36864);
        int int14 = cpioArchiveInputStream4.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, "xz");
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream((java.util.zip.Checksum) xXHash32_0, (java.io.InputStream) cpioArchiveInputStream4);
        xXHash32_0.update((int) 'a');
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry28 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean29 = tarArchiveEntry28.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry33 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean34 = tarArchiveEntry28.equals(tarArchiveEntry33);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveOutputStream24.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.nio.file.Path path1 = null;
        java.nio.file.LinkOption linkOption3 = null;
        java.nio.file.LinkOption[] linkOptionArray4 = new java.nio.file.LinkOption[] { linkOption3 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) (byte) 10, path1, "pack.deflate.hint", linkOptionArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(linkOptionArray4);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC;
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField2 = extraFieldParsingMode0.createExtraField(zipShort1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.DRACONIC));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        long long6 = cpioArchiveInputStream4.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = jarArchiveInputStream8.getNextEntry();
        byte[] byteArray11 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("pack.effort", byteArray11);
        byte[] byteArray14 = unicodeCommentExtraField13.getUnicodeName();
        long long15 = unicodeCommentExtraField13.getNameCRC32();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[112, 97, 99, 107, 46, 101, 102, 102, 111, 114, 116]");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setOperatingSystem(2048);
        java.lang.String str3 = gzipParameters0.getFilename();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256;
        int int1 = encryptionAlgorithm0.getCode();
        org.junit.Assert.assertTrue("'" + encryptionAlgorithm0 + "' != '" + org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256 + "'", encryptionAlgorithm0.equals(org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.AES256));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26128 + "'", int1 == 26128);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray17, (int) (short) 100);
        boolean boolean21 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray17, 511);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = zstdCompressorInputStream10.read(byteArray17, 49152, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Requested length 53 from offset 49152 in buffer of size 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasCrc(false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.io.File file0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream8 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2, 1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters9 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream10 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) bZip2CompressorOutputStream8, parameters9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.IOUtils.copy(file0, (java.io.OutputStream) framedSnappyCompressorOutputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry23 = null;
        boolean boolean24 = zipArchiveOutputStream6.canWriteEntryData(archiveEntry23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit27 = null;
        zipArchiveEntry26.setGeneralPurposeBit(generalPurposeBit27);
        int int29 = zipArchiveEntry26.getRawFlag();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) zipArchiveEntry26);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        zipArchiveOutputStream9.writePreamble(byteArray20);
        zipArchiveOutputStream9.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry24.setInode((long) 2048);
        java.util.Date date27 = cpioArchiveEntry24.getLastModifiedDate();
        cpioArchiveEntry24.setChksum(0L);
        boolean boolean30 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean30);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong32 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        int int33 = zipLong32.getIntValue();
        x5455_ExtendedTimestamp0.setCreateTime(zipLong32);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort35 = x5455_ExtendedTimestamp0.getHeaderId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(zipLong32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 134695760 + "'", int33 == 134695760);
        org.junit.Assert.assertNotNull(zipShort35);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        org.apache.commons.compress.MemoryLimitException memoryLimitException4 = new org.apache.commons.compress.MemoryLimitException((long) (byte) -1, 148, (java.lang.Exception) unsupportedZipFeatureException3);
        long long5 = memoryLimitException4.getMemoryNeededInKb();
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        java.lang.String str13 = tarArchiveEntry3.getLinkName();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream6 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream(0L, (long) (short) 3, seekableByteChannel3);
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit7 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean8 = generalPurposeBit7.usesDataDescriptor();
        boolean boolean9 = generalPurposeBit7.usesUTF8ForNames();
        byte[] byteArray10 = generalPurposeBit7.encode();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = boundedSeekableByteChannelInputStream6.read(byteArray10, 32768, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: offset or len are out of bounds");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream6 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField9 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        byte[] byteArray10 = resourceAlignmentExtraField9.getCentralDirectoryData();
        boolean boolean12 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray10, (int) (byte) 49);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream6.write(byteArray10, 134695760, 36864);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.DELTA_FILTER));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = org.apache.commons.compress.compressors.lz77support.Parameters.builder(16384);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder1.withMaxOffset(16);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        org.apache.commons.compress.archivers.zip.ZipFile zipFile15 = null;
        java.io.File file16 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(zipFile15, file16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        char[] charArray7 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray7);
        java.nio.file.Path path9 = null;
        java.nio.file.OpenOption openOption10 = null;
        java.nio.file.OpenOption[] openOptionArray11 = new java.nio.file.OpenOption[] { openOption10 };
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile8.write(path9, openOptionArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(openOptionArray11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        java.lang.String str11 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\000\000" + "'", str11, "\n\000\000");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        byte[] byteArray11 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray4);
        boolean boolean13 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray4, (int) (short) 100);
        boolean boolean15 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray4, 3);
        boolean boolean16 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer("lz4-block", byteArray4);
        java.lang.String str17 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray4);
        boolean boolean19 = org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream.matches(byteArray4, 488);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\000\000" + "'", str17, "\n\000\000");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream4 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream1, (long) (byte) 100, (int) (short) 3);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = dumpArchiveEntry0.getHeaderType();
        dumpArchiveEntry0.setMode(16);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("apkm");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean9 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray7, (int) (short) 100);
        boolean boolean11 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray7, 511);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("cpio.gz", byteArray7);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean18 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray16, (int) (short) 10);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean22 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray16, byteArray21);
        org.apache.commons.compress.archivers.tar.TarFile tarFile24 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray16, false);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField12.parseFromLocalFileData(byteArray16, 128, 0);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: UniCode path extra data must have at least 5 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setInode((long) 2048);
        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
        long long5 = cpioArchiveEntry1.getUID();
        cpioArchiveEntry1.setChksum((long) 4);
        long long8 = cpioArchiveEntry1.getGID();
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        long long1 = x0017_StrongEncryptionHeader0.getRecordCount();
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray5, (int) (short) 10);
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean11 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray5, byteArray10);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel12 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray5, true);
        x0017_StrongEncryptionHeader0.setLocalFileDataData(byteArray5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray4, 420);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 100]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel10 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray3);
        long long11 = seekableInMemoryByteChannel10.position();
        byte[] byteArray13 = org.apache.commons.compress.utils.IOUtils.readRange((java.nio.channels.ReadableByteChannel) seekableInMemoryByteChannel10, 504);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byteArray13, 16384, 121);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't read more than eight bytes into a long value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 10]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder4.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = builder4.withMaxBackReferenceLength(9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry3 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 12, "keep", (long) 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown header type 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        tarArchiveEntry3.setUserName("error.gz");
        boolean boolean14 = tarArchiveEntry3.isGlobalPaxHeader();
        java.nio.file.attribute.FileTime fileTime15 = tarArchiveEntry3.getLastModifiedTime();
        int int16 = tarArchiveEntry3.getUserId();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29127 + "'", int16 == 29127);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        int int5 = zipLong3.getIntValue();
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 808471376 + "'", int5 == 808471376);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap4 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.lang.String str5 = archiveStreamFactory0.getEntryEncoding();
        archiveStreamFactory0.setEntryEncoding("apkm");
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream10 = archiveStreamFactory0.createArchiveOutputStream("false", outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: OutputStream must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strMap4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "apkm" + "'", str5, "apkm");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        deflateCompressorOutputStream5.finish();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry21.setInode((long) 2048);
        java.util.Date date24 = cpioArchiveEntry21.getLastModifiedDate();
        cpioArchiveEntry21.setChksum(0L);
        boolean boolean27 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
        java.util.Date date28 = cpioArchiveEntry21.getLastModifiedDate();
        cpioArchiveEntry21.setRemoteDeviceMaj((long) 3);
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
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(date28);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        long long23 = zipArchiveOutputStream6.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.finish();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: This archive has already been finished");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25L + "'", long23 == 25L);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry3.getCreationTime();
        tarArchiveEntry3.setGroupName("././@LongLink");
        long long13 = tarArchiveEntry3.getDataOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray8, (int) (short) 100);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray8, (int) (byte) 0);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel13 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray8);
        java.nio.channels.SeekableByteChannel seekableByteChannel15 = seekableInMemoryByteChannel13.position(0L);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray16 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel17 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray16);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray18 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel19 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray18);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel19);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray21 = new java.nio.channels.SeekableByteChannel[] { seekableInMemoryByteChannel13, seekableByteChannel17, seekableByteChannel19 };
        java.util.ArrayList<java.nio.channels.SeekableByteChannel> seekableByteChannelList22 = new java.util.ArrayList<java.nio.channels.SeekableByteChannel>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.nio.channels.SeekableByteChannel>) seekableByteChannelList22, seekableByteChannelArray21);
        org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel multiReadOnlySeekableByteChannel24 = new org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel((java.util.List<java.nio.channels.SeekableByteChannel>) seekableByteChannelList22);
        boolean boolean25 = multiReadOnlySeekableByteChannel24.isOpen();
        multiReadOnlySeekableByteChannel24.close();
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream27 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) (byte) 83, 2162688L, (java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel24);
        long long28 = multiReadOnlySeekableByteChannel24.position();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(seekableByteChannel15);
        org.junit.Assert.assertNotNull(seekableByteChannelArray16);
        org.junit.Assert.assertNotNull(seekableByteChannel17);
        org.junit.Assert.assertNotNull(seekableByteChannelArray18);
        org.junit.Assert.assertNotNull(seekableByteChannel19);
        org.junit.Assert.assertNotNull(seekableByteChannelArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder4.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = builder7.withNiceBackReferenceLength(84446);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getGID();
        long long6 = cpioArchiveEntry1.getUID();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

//    @Test
//    public void test1113() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest2.test1113");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        java.io.InputStream inputStream3 = null;
//        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
//        java.io.OutputStream outputStream7 = null;
//        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
//        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
//        zstdCompressorOutputStream8.write(byteArray10);
//        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
//        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
//        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile2.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
//        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
//    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("BackReference with offset -1 and length 504");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "BackReference with offset -1 and length 504.xz" + "'", str1, "BackReference with offset -1 and length 504.xz");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        char[] charArray8 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions10 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, charArray8, sevenZFileOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions10);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.io.InputStream inputStream23 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream25 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream23, 10);
        long long27 = cpioArchiveInputStream25.skip(100L);
        long long29 = cpioArchiveInputStream25.skip((long) 29127);
        byte[] byteArray30 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream25);
        org.apache.commons.compress.archivers.tar.TarFile tarFile32 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray30, "lzma");
        // The following exception was thrown during execution in test generation
        try {
            int int35 = zstdCompressorInputStream10.read(byteArray30, 2048, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Requested length 2048 from offset 2048 in buffer of size 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[]");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream7 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream4, 100L, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream8 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) cRC32VerifyingInputStream7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Not a framed Snappy stream");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier9 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable10 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier11 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable12 = parallelScatterZipCreator0.createCallable(zipArchiveEntryRequestSupplier11);
        org.apache.commons.compress.archivers.zip.ScatterStatistics scatterStatistics13 = parallelScatterZipCreator0.getStatisticsMessage();
        long long14 = scatterStatistics13.getCompressionElapsed();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable10);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable12);
        org.junit.Assert.assertNotNull(scatterStatistics13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        jarArchiveOutputStream9.setEncoding("br");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry12 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean13 = arjArchiveEntry12.isHostOsUnix();
        boolean boolean15 = arjArchiveEntry12.equals((java.lang.Object) "\000\000!\000");
        int int16 = arjArchiveEntry12.getUnixMode();
        java.lang.String str17 = arjArchiveEntry12.getName();
        boolean boolean18 = arjArchiveEntry12.isDirectory();
        int int19 = arjArchiveEntry12.getUnixMode();
        // The following exception was thrown during execution in test generation
        try {
            jarArchiveOutputStream9.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.arj.ArjArchiveEntry cannot be cast to org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.io.File file0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        char[] charArray8 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2, charArray8);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder10 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = builder10.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder13 = builder10.withMaxMemoryLimitInKb(60011);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions14 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, charArray8, sevenZFileOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(sevenZFileOptions14);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory6 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        x0016_CertificateIdForCentralDirectory6.setCentralDirectoryData(byteArray10);
        boolean boolean14 = org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byteArray10, 4095);
        org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock literalBlock17 = new org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock(byteArray10, (int) (short) 100, 1);
        byte[] byteArray18 = literalBlock17.getData();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = zstdCompressorInputStream2.read(byteArray18, 511, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Requested length 4 from offset 511 in buffer of size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 33, 0]");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.nio.file.Path path0 = null;
        java.nio.file.OpenOption[] openOptionArray1 = new java.nio.file.OpenOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, openOptionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(openOptionArray1);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream6 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel1, (int) (byte) 0);
        java.nio.ByteBuffer byteBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = fixedLengthBlockOutputStream6.write(byteBuffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        boolean boolean6 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray3, (int) (byte) -1);
        boolean boolean8 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray3, 29127);
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getLongValue(byteArray3, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String str0 = org.apache.commons.compress.archivers.tar.TarConstants.MAGIC_POSIX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ustar\000" + "'", str0, "ustar\000");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream9 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) deflateCompressorInputStream6, (long) 156, (int) (short) 0);
        long long10 = deflateCompressorInputStream6.getCompressedCount();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.compress.PasswordRequiredException passwordRequiredException1 = new org.apache.commons.compress.PasswordRequiredException("070707");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder7 = builder4.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder9 = builder7.withNiceBackReferenceLength(60012);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setInode((long) 2048);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp4 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str5 = x5455_ExtendedTimestamp4.toString();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean13 = tarArchiveEntry12.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean18 = tarArchiveEntry12.equals(tarArchiveEntry17);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime23 = null;
        tarArchiveEntry22.setStatusChangeTime(fileTime23);
        tarArchiveEntry22.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean31 = tarArchiveEntry22.equals(tarArchiveEntry30);
        java.nio.file.attribute.FileTime fileTime33 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry30.setLastModifiedTime(fileTime33);
        tarArchiveEntry17.setLastAccessTime(fileTime33);
        tarArchiveEntry8.setModTime(fileTime33);
        x5455_ExtendedTimestamp4.setCreateFileTime(fileTime33);
        cpioArchiveEntry1.setTime(fileTime33);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str5, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(fileTime33);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        long long23 = zipArchiveOutputStream6.getBytesWritten();
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory25 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream26 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream27 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream26);
        byte[] byteArray29 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream27.write(byteArray29);
        x0016_CertificateIdForCentralDirectory25.setCentralDirectoryData(byteArray29);
        boolean boolean33 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray29, 263);
        zipArchiveOutputStream6.writePreamble(byteArray29, (int) (byte) 48, 148);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 25L + "'", long23 == 25L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        boolean boolean23 = multiReadOnlySeekableByteChannel22.isOpen();
        multiReadOnlySeekableByteChannel22.close();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream27 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream25, 10);
        long long29 = cpioArchiveInputStream27.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream31 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream33 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream27, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream34 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream33);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream35 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream33);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean41 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray39, (int) (short) 10);
        byte[] byteArray44 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean45 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray39, byteArray44);
        int int46 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) zstdCompressorInputStream35, byteArray44);
        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean52 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray50, (int) (short) 10);
        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean56 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray50, byteArray55);
        byte[] byteArray57 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray50);
        int int58 = zstdCompressorInputStream35.read(byteArray57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile59 = new org.apache.commons.compress.archivers.sevenz.SevenZFile((java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel22, byteArray57);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray50), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray55), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray57), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.segment.limit", (byte) 0, false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        char[] charArray9 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean12 = sevenZFileOptions11.getUseDefaultNameForUnnamedEntries();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "gz", charArray9, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        boolean boolean12 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setUserId((int) (byte) 83);
        tarArchiveEntry3.setUserName("snappy-raw");
        boolean boolean17 = tarArchiveEntry3.isLink();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry5 = cpioArchiveInputStream2.getNextCPIOEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer8 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) framedSnappyCompressorOutputStream7);
        outputStreamByteConsumer8.accept(29127);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.delete("");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        boolean boolean23 = multiReadOnlySeekableByteChannel22.isOpen();
        multiReadOnlySeekableByteChannel22.close();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel26 = multiReadOnlySeekableByteChannel22.position((long) 53);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate64();
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate64" + "'", str0, "deflate64");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        java.io.OutputStream outputStream12 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream13 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream12);
        byte[] byteArray15 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream13.write(byteArray15);
        boolean boolean18 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray15, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField19 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("lz4-block", byteArray15);
        int int20 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) zipArchiveInputStream8, byteArray15);
        java.io.OutputStream outputStream22 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream23 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream22);
        byte[] byteArray25 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream23.write(byteArray25);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream27 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream23);
        long long28 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) zipArchiveInputStream8, (long) 33188, (java.io.OutputStream) zstdCompressorOutputStream23);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        tarArchiveInputStream9.reset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer8 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) framedSnappyCompressorOutputStream7);
        framedSnappyCompressorOutputStream7.finish();
        // The following exception was thrown during execution in test generation
        try {
            framedSnappyCompressorOutputStream7.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray6, (int) (short) 10);
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean12 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray6, byteArray11);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel13 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray6);
        long long14 = seekableInMemoryByteChannel13.position();
        byte[] byteArray16 = org.apache.commons.compress.utils.IOUtils.readRange((java.nio.channels.ReadableByteChannel) seekableInMemoryByteChannel13, 504);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray16, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 10]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = resourceAlignmentExtraField2.getHeaderId();
        byte[] byteArray4 = resourceAlignmentExtraField2.getLocalFileDataData();
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0]");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.BCJ_ARM_THUMB_FILTER));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream6 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            fixedLengthBlockOutputStream6.write(0);
            org.junit.Assert.fail("Expected exception of type java.nio.BufferOverflowException; message: null");
        } catch (java.nio.BufferOverflowException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream8 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) deflateCompressorInputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray1 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel2 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile3 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.tar.TarFile tarFile4 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel2);
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create(sevenZOutputFile5, file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray1);
        org.junit.Assert.assertNotNull(seekableByteChannel2);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean3 = tarArchiveEntry2.isFIFO();
        tarArchiveEntry2.setGroupId(121);
        boolean boolean6 = tarArchiveEntry2.isSymbolicLink();
        tarArchiveEntry2.addPaxHeader(".xz", "ISO-8859-1.lzma");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean7 = tarArchiveEntry6.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry6.equals(tarArchiveEntry11);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime17 = null;
        tarArchiveEntry16.setStatusChangeTime(fileTime17);
        tarArchiveEntry16.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean25 = tarArchiveEntry16.equals(tarArchiveEntry24);
        java.nio.file.attribute.FileTime fileTime27 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry24.setLastModifiedTime(fileTime27);
        tarArchiveEntry11.setLastAccessTime(fileTime27);
        tarArchiveEntry2.setModTime(fileTime27);
        boolean boolean31 = tarArchiveEntry2.isFIFO();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(fileTime27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        dumpArchiveEntry0.setOffset((long) 11);
        int int3 = dumpArchiveEntry0.getHeaderHoles();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = zip64ExtendedInformationExtraField4.getCentralDirectoryLength();
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean19 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray17, (int) (short) 10);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean23 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray17, byteArray22);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray17);
        zipArchiveOutputStream13.writePreamble(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            zip64ExtendedInformationExtraField4.parseFromLocalFileData(byteArray24, 84446, (int) (byte) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84453");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 0, 0]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        zipArchiveOutputStream9.writePreamble(byteArray20);
        zipArchiveOutputStream9.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry24.setInode((long) 2048);
        java.util.Date date27 = cpioArchiveEntry24.getLastModifiedDate();
        cpioArchiveEntry24.setChksum(0L);
        boolean boolean30 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean30);
        byte[] byteArray32 = x5455_ExtendedTimestamp0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong33 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        x5455_ExtendedTimestamp0.setCreateTime(zipLong33);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[0]");
        org.junit.Assert.assertNotNull(zipLong33);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.nio.channels.SeekableByteChannel seekableByteChannel0 = null;
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        char[] charArray9 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel0, "pack.effort", charArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  ]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        java.lang.String str12 = tarArchiveEntry8.getLinkName();
        tarArchiveEntry8.setSize(8589934591L);
        java.nio.file.Path path15 = tarArchiveEntry8.getPath();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(path15);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource nameSource4 = zipArchiveEntry1.getNameSource();
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + nameSource4 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME + "'", nameSource4.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.NameSource.NAME));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.BEST_EFFORT;
        org.junit.Assert.assertNotNull(extraFieldParsingMode0);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry((short) 1, " \000");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("pack.modification.time");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData0 = new org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort1 = unparseableExtraFieldData0.getHeaderId();
        byte[] byteArray2 = unparseableExtraFieldData0.getLocalFileDataData();
        org.junit.Assert.assertNotNull(zipShort1);
        org.junit.Assert.assertNull(byteArray2);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        int int8 = deflateCompressorInputStream7.available();
        long long9 = deflateCompressorInputStream7.getCompressedCount();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        long long5 = cpioArchiveEntry1.getRemoteDeviceMaj();
        cpioArchiveEntry1.setName("error.gz");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField1 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray2 = asiExtraField1.getLocalFileDataData();
        boolean boolean4 = org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream.matches(byteArray2, 121);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("\000\000!\000.gz", byteArray2);
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream8 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6, 10);
        long long10 = cpioArchiveInputStream8.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream12 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream14 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream8, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream15 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream14);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream16 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream14);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray20, (int) (short) 10);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        int int27 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) zstdCompressorInputStream16, byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            unicodeCommentExtraField5.parseFromLocalFileData(byteArray25, 156, 134695760);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 156");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode0 = org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded;
        org.junit.Assert.assertTrue("'" + zip64Mode0 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded + "'", zip64Mode0.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AsNeeded));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile27 = new org.apache.commons.compress.archivers.zip.ZipFile((java.nio.channels.SeekableByteChannel) multiReadOnlySeekableByteChannel23, "ISO-8859-1.lzma", "-       0 ", true);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: -       0 ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long9 = jarArchiveInputStream6.skip((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.compress.archivers.ArchiveStreamFactory.detect((java.io.InputStream) jarArchiveInputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField1 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField1.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = unrecognizedExtraField0.getLocalFileDataLength();
        byte[] byteArray5 = unrecognizedExtraField0.getCentralDirectoryData();
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNull(byteArray5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("pack.method.attribute.");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: pack.method.attribute.");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24, 10);
        long long28 = cpioArchiveInputStream26.skip(100L);
        long long30 = cpioArchiveInputStream26.skip((long) 29127);
        byte[] byteArray31 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream26);
        org.apache.commons.compress.archivers.tar.TarFile tarFile33 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray31, "lzma");
        java.io.File file34 = null;
        expander0.expand(tarFile33, file34);
        org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile36 = null;
        java.io.File file37 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(sevenZFile36, file37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        int int5 = dumpArchiveEntry0.getHeaderCount();
        java.util.Date date6 = dumpArchiveEntry0.getLastModifiedDate();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        int int3 = asiExtraField0.getGroupId();
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        boolean boolean10 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray7, (int) (byte) -1);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort12 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray7, (int) (short) 0);
        boolean boolean14 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray7, 134695760);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromLocalFileData(byteArray7, 9, 6);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: The length is too short, only 6 bytes, expected at least 14");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray0, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer outputStreamByteConsumer6 = new org.apache.commons.compress.utils.ByteUtils.OutputStreamByteConsumer((java.io.OutputStream) zstdCompressorOutputStream1);
        outputStreamByteConsumer6.accept((int) (byte) 77);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256 + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256));
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        int int3 = asiExtraField0.getGroupId();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray11, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L, byteArray11, 1);
        // The following exception was thrown during execution in test generation
        try {
            asiExtraField0.parseFromCentralDirectoryData(byteArray11, 256, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 0, 33, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getRemoteDeviceMaj();
        boolean boolean3 = cpioArchiveEntry1.isDirectory();
        long long4 = cpioArchiveEntry1.getGID();
        long long5 = cpioArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE5 = dumpArchiveEntry0.getHeaderType();
        dumpArchiveEntry0.setName("\n\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(sEGMENT_TYPE5);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding10 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean12 = zipEncoding10.canEncode("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray6, zipEncoding10, false, (long) (byte) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(zipEncoding10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        zstdCompressorOutputStream1.write(256);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean13 = tarArchiveEntry12.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = tarArchiveEntry12.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil16 = new org.apache.commons.compress.compressors.FileNameUtil(strMap14, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream17 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, strMap14);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray24, (int) (short) 100);
        boolean boolean28 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray24, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile30 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray24, true);
        boolean boolean32 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray24, 21);
        boolean boolean34 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray24, (-1));
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding36 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry39 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap14, byteArray24, zipEncoding36, true, (long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(zipEncoding36);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.io.OutputStream outputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream snappyCompressorOutputStream3 = new org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream(outputStream0, 2097151L, (int) (byte) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: windowSize must be a power of two");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_GNUTYPE_LONGNAME;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 76 + "'", byte0 == (byte) 76);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.nio.ByteBuffer byteBuffer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = multiReadOnlySeekableByteChannel22.write(byteBuffer23);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        java.util.Date date6 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime7 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date6);
        tarArchiveEntry3.setStatusChangeTime(fileTime7);
        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry3.getLastModifiedTime();
        boolean boolean10 = tarArchiveEntry3.isStreamContiguous();
        tarArchiveEntry3.setUserName("keep");
        boolean boolean13 = tarArchiveEntry3.isDirectory();
        boolean boolean14 = tarArchiveEntry3.isStreamContiguous();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime7);
        org.junit.Assert.assertNotNull(fileTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getAccessTime();
        boolean boolean3 = x5455_ExtendedTimestamp0.isBit1_accessTimePresent();
        java.nio.file.attribute.FileTime fileTime4 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(fileTime4);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.compress.archivers.sevenz.SevenZMethod sevenZMethod0 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA;
        org.junit.Assert.assertTrue("'" + sevenZMethod0 + "' != '" + org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA + "'", sevenZMethod0.equals(org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader1 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader1.setCentralDirectoryData(byteArray3);
        byte[] byteArray5 = x0017_StrongEncryptionHeader1.getLocalFileDataData();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean11 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray9, (int) (short) 10);
        x0017_StrongEncryptionHeader1.setCentralDirectoryData(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile13 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String str1 = org.apache.commons.compress.utils.FileNameUtils.getExtension("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.FS_UFS2_MAGIC;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 424935705 + "'", int0 == 424935705);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        long long3 = sevenZArchiveEntry0.getSize();
        sevenZArchiveEntry0.setHasStream(false);
        sevenZArchiveEntry0.setSize(116444736001000000L);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry9 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry9.setInode((long) 2048);
        java.util.Date date12 = cpioArchiveEntry9.getLastModifiedDate();
        long long13 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(date12);
        sevenZArchiveEntry0.setCreationDate(date12);
        sevenZArchiveEntry0.setHasAccessDate(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 116444736000000000L + "'", long13 == 116444736000000000L);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        zstdCompressorOutputStream1.write(256);
        org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream10 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) xZCompressorOutputStream10, (short) -1, (int) (byte) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility;
        zipArchiveOutputStream6.setUseZip64(zip64Mode23);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry26 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry26.setMethod((int) (byte) 88);
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader29 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm30 = x0017_StrongEncryptionHeader29.getHashAlgorithm();
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean36 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray34, (int) (short) 10);
        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean40 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray34, byteArray39);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel41 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray34);
        x0017_StrongEncryptionHeader29.setLocalFileDataData(byteArray34);
        zipArchiveEntry26.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) x0017_StrongEncryptionHeader29);
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField44 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField45 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort46 = unicodePathExtraField45.getHeaderId();
        unrecognizedExtraField44.setHeaderId(zipShort46);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort48 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField44.setHeaderId(zipShort48);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort50 = unrecognizedExtraField44.getCentralDirectoryLength();
        zipArchiveEntry26.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) unrecognizedExtraField44);
        java.lang.String str52 = zipArchiveEntry26.getComment();
        java.io.InputStream inputStream53 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream55 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream53, 10);
        java.io.OutputStream outputStream57 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream58 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream57);
        byte[] byteArray60 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream58.write(byteArray60);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream62 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream58);
        long long64 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream55, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream58, 36864);
        int int65 = cpioArchiveInputStream55.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream67 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream55, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream68 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream55);
        int int69 = cpioArchiveInputStream55.getCount();
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream6.addRawArchiveEntry(zipArchiveEntry26, (java.io.InputStream) cpioArchiveInputStream55);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
        org.junit.Assert.assertTrue("'" + zip64Mode23 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility + "'", zip64Mode23.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility));
        org.junit.Assert.assertNull(hashAlgorithm30);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(zipShort46);
        org.junit.Assert.assertNotNull(zipShort48);
        org.junit.Assert.assertNotNull(zipShort50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile4.finish();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_0 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        xXHash32_0.reset();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7);
        long long13 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream4, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream7, 36864);
        int int14 = cpioArchiveInputStream4.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream17 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4);
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream19 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, "xz");
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream((java.util.zip.Checksum) xXHash32_0, (java.io.InputStream) cpioArchiveInputStream4);
        int int21 = checksumCalculatingInputStream20.read();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("pack.unknown.attribute");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: pack.unknown.attribute");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize0 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters1 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters2 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters1);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry4 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry4.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime7 = zipArchiveEntry4.getCreationTime();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize8 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters9 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters10 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, parameters9);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters11 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters12 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, parameters11);
        boolean boolean13 = zipArchiveEntry4.equals((java.lang.Object) blockSize8);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder17 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder18 = builder17.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder20 = builder17.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder21 = builder20.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters22 = builder21.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters23 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize8, false, true, true, parameters22);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters24 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize0, parameters22);
        org.junit.Assert.assertTrue("'" + blockSize0 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256 + "'", blockSize0.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.K256));
        org.junit.Assert.assertNull(fileTime7);
        org.junit.Assert.assertTrue("'" + blockSize8 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize8.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(parameters22);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("lz4-block", 312829200000L);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        int int15 = cpioArchiveInputStream5.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, 2);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5);
        boolean boolean19 = arArchiveEntry2.equals((java.lang.Object) jarArchiveInputStream18);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        byte byte0 = org.apache.commons.compress.archivers.tar.TarConstants.LF_CHR;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 51 + "'", byte0 == (byte) 51);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet1 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.find(512);
        org.junit.Assert.assertNotNull(pERMISSIONSet1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO;
        org.junit.Assert.assertTrue("'" + tYPE0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO + "'", tYPE0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.FIFO));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(128);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray2 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel3 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray2);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3);
        org.apache.commons.compress.archivers.tar.TarFile tarFile5 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel3);
        char[] charArray9 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile10 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel3, charArray9);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel1, charArray9, sevenZFileOptions11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Bad 7z signature");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray2);
        org.junit.Assert.assertNotNull(seekableByteChannel3);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4,  ]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = jarArchiveInputStream6.getNextEntry();
        byte[] byteArray9 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean14 = zipEncoding12.canEncode("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray9, zipEncoding12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(zipEncoding12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        lZMACompressorOutputStream10.flush();
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        boolean boolean2 = x5455_ExtendedTimestamp0.isBit2_createTimePresent();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode0 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField1 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField2 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = unicodePathExtraField2.getHeaderId();
        unrecognizedExtraField1.setHeaderId(zipShort3);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort5 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField1.setHeaderId(zipShort5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraFieldNoDefault(zipShort5);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField8 = extraFieldParsingMode0.createExtraField(zipShort5);
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory9 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream10);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream11.write(byteArray13);
        x0016_CertificateIdForCentralDirectory9.setCentralDirectoryData(byteArray13);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort16 = x0016_CertificateIdForCentralDirectory9.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField17 = extraFieldParsingMode0.createExtraField(zipShort16);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort18 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID;
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField19 = extraFieldParsingMode0.createExtraField(zipShort18);
        boolean boolean21 = zipShort18.equals((java.lang.Object) "pack.unknown.attribute");
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode0.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(zipShort5);
        org.junit.Assert.assertNotNull(zipExtraField7);
        org.junit.Assert.assertNotNull(zipExtraField8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(zipShort16);
        org.junit.Assert.assertNotNull(zipExtraField17);
        org.junit.Assert.assertNotNull(zipShort18);
        org.junit.Assert.assertNotNull(zipExtraField19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream9 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) deflateCompressorInputStream6, (long) 156, (int) (short) 0);
        int int10 = deflateCompressorInputStream6.available();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry21.setInode((long) 2048);
        java.util.Date date24 = cpioArchiveEntry21.getLastModifiedDate();
        cpioArchiveEntry21.setChksum(0L);
        boolean boolean27 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
        cpioArchiveEntry21.setChksum((long) 84446);
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
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        java.nio.file.Path path16 = null;
        java.nio.file.LinkOption[] linkOptionArray17 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(path16, (java.nio.file.OpenOption[]) linkOptionArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(linkOptionArray17);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap2 = compressorStreamFactory1.getCompressorInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = compressorStreamFactory1.getOutputStreamCompressorNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap4 = compressorStreamFactory1.getCompressorInputStreamProviders();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray6 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel7 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray6);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel7);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream11 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream9, 10);
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream14 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream13);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream14.write(byteArray16);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream18 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream14);
        long long20 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream11, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream14, 36864);
        sevenZOutputFile8.write((java.io.InputStream) cpioArchiveInputStream11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream23 = compressorStreamFactory1.createCompressorInputStream("\000\000", (java.io.InputStream) cpioArchiveInputStream11, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: ?? not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(seekableByteChannelArray6);
        org.junit.Assert.assertNotNull(seekableByteChannel7);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream6 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel1, (int) (byte) 0);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray7 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel8 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray7);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile9 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8);
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel8);
        char[] charArray14 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel8, charArray14);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder16 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions17 = builder16.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder19 = builder16.withMaxMemoryLimitInKb(60011);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions20 = builder19.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel1, charArray14, sevenZFileOptions20);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(seekableByteChannelArray7);
        org.junit.Assert.assertNotNull(seekableByteChannel8);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(sevenZFileOptions20);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        long long3 = cpioArchiveEntry1.getGID();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream3 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream(inputStream0, 8, "UTF-16LE");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) tarArchiveInputStream3, 64, (int) (byte) 120, "pack.method.attribute.", false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream framedSnappyCompressorInputStream9 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream((java.io.InputStream) tarArchiveInputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setHasStream(false);
        java.util.Date date6 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime((long) (short) -1);
        sevenZArchiveEntry0.setLastModifiedDate(date6);
        sevenZArchiveEntry0.setHasCreationDate(false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 01 00:59:59 CET 1601");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        framedSnappyCompressorOutputStream7.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean12 = tarArchiveEntry11.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = tarArchiveEntry11.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil15 = new org.apache.commons.compress.compressors.FileNameUtil(strMap13, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream16 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream7, strMap13);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray20, (int) (short) 10);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray20);
        boolean boolean29 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray20, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding31 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(strMap13, byteArray20, zipEncoding31, false, (long) (byte) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(zipEncoding31);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesEncryption();
        boolean boolean3 = generalPurposeBit0.usesStrongEncryption();
        boolean boolean4 = generalPurposeBit0.usesUTF8ForNames();
        generalPurposeBit0.useStrongEncryption(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry8.isCharacterDevice();
        boolean boolean11 = tarArchiveEntry8.isGNULongLinkEntry();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, (short) (byte) 2, 8);
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getMode();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = cpioArchiveEntry1.getDevice();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32768L + "'", long5 == 32768L);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData unparseableExtraFieldData3 = zipArchiveEntry1.getUnparseableExtraFieldData();
        long long4 = zipArchiveEntry1.getTime();
        zipArchiveEntry1.setVersionMadeBy(10);
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNull(unparseableExtraFieldData3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier15 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) zstdCompressorInputStream10);
        int int16 = zstdCompressorInputStream10.getCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING;
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.PKWARE_IMPLODING));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.TP_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        int int3 = asiExtraField0.getGroupId();
        int int4 = asiExtraField0.getGroupId();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        boolean boolean9 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray6, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray6, 29127);
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray6, (int) (short) 8);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray6, (int) ' ', 4095);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        byte[] byteArray20 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray13);
        zipArchiveOutputStream9.writePreamble(byteArray20);
        zipArchiveOutputStream9.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry24 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry24.setInode((long) 2048);
        java.util.Date date27 = cpioArchiveEntry24.getLastModifiedDate();
        cpioArchiveEntry24.setChksum(0L);
        boolean boolean30 = zipArchiveOutputStream9.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry24);
        boolean boolean31 = x5455_ExtendedTimestamp0.equals((java.lang.Object) boolean30);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry34 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean35 = tarArchiveEntry34.isGNUSparse();
        java.util.Date date36 = tarArchiveEntry34.getModTime();
        x5455_ExtendedTimestamp0.setCreateJavaTime(date36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(date36);
// flaky:         org.junit.Assert.assertEquals(date36.toString(), "Mon Jun 19 00:08:23 CEST 2023");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit0 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean1 = generalPurposeBit0.usesDataDescriptor();
        boolean boolean2 = generalPurposeBit0.usesStrongEncryption();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        jarArchiveOutputStream9.setUseLanguageEncodingFlag(false);
        jarArchiveOutputStream9.setFallbackToUTF8(true);
        long long14 = jarArchiveOutputStream9.getBytesWritten();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        pack200CompressorOutputStream23.write((int) '#');
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long9 = jarArchiveInputStream6.skip((long) 3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = jarArchiveInputStream6.getNextJarEntry();
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream11 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) jarArchiveInputStream6);
        int int12 = closeShieldFilterInputStream11.available();
        closeShieldFilterInputStream11.close();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(jarArchiveEntry10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        int int7 = tarArchiveInputStream6.getRecordSize();
        byte[] byteArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = tarArchiveInputStream6.read(byteArray8, 60011, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        byte[] byteArray3 = resourceAlignmentExtraField2.getCentralDirectoryData();
        boolean boolean5 = org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorInputStream.matches(byteArray3, (int) (byte) 49);
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader8 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm9 = x0017_StrongEncryptionHeader8.getHashAlgorithm();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean19 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, byteArray18);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel20 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray13);
        x0017_StrongEncryptionHeader8.setLocalFileDataData(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = org.apache.commons.compress.utils.ArchiveUtils.isEqualWithNull(byteArray3, (int) (short) 3, 100, byteArray13, 9, 49152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(hashAlgorithm9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(10240);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW_CRC;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070702" + "'", str0, "070702");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(128);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray3 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel4 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray3);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile5 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel4);
        org.apache.commons.compress.archivers.tar.TarFile tarFile6 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel4);
        char[] charArray10 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile11 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel4, charArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel1, "ZipShort value: 14", charArray10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Bad 7z signature");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray3);
        org.junit.Assert.assertNotNull(seekableByteChannel4);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4,  ]");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry8 = jarArchiveInputStream6.getNextEntry();
        byte[] byteArray9 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarFile tarFile10 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray9);
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> tarArchiveEntryList11 = tarFile10.getEntries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[]");
        org.junit.Assert.assertNotNull(tarArchiveEntryList11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray6, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray6, true);
        boolean boolean14 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray6, 21);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong15 = new org.apache.commons.compress.archivers.zip.ZipLong(byteArray6);
        org.apache.commons.compress.archivers.zip.ZipLong zipLong16 = org.apache.commons.compress.archivers.zip.ZipLong.CFH_SIG;
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory17 = new org.apache.commons.compress.compressors.CompressorStreamFactory();
        boolean boolean18 = zipLong16.equals((java.lang.Object) compressorStreamFactory17);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp19 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str20 = x5455_ExtendedTimestamp19.toString();
        java.nio.file.attribute.FileTime fileTime21 = x5455_ExtendedTimestamp19.getAccessFileTime();
        java.nio.file.attribute.FileTime fileTime22 = x5455_ExtendedTimestamp19.getAccessFileTime();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger23 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger24 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger25 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger26 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong27 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField28 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger24, zipEightByteInteger25, zipEightByteInteger26, zipLong27);
        byte[] byteArray29 = zip64ExtendedInformationExtraField28.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger30 = zip64ExtendedInformationExtraField28.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger31 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField28.setRelativeHeaderOffset(zipEightByteInteger31);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger34 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField35 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger31, zipEightByteInteger34);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger36 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger37 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger38 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong39 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField40 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger36, zipEightByteInteger37, zipEightByteInteger38, zipLong39);
        byte[] byteArray41 = zip64ExtendedInformationExtraField40.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger42 = zip64ExtendedInformationExtraField40.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger43 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField40.setRelativeHeaderOffset(zipEightByteInteger43);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp45 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str46 = x5455_ExtendedTimestamp45.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong47 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp45.setModifyTime(zipLong47);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField49 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger23, zipEightByteInteger34, zipEightByteInteger43, zipLong47);
        x5455_ExtendedTimestamp19.setCreateTime(zipLong47);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger51 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger52 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger53 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong54 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField55 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger51, zipEightByteInteger52, zipEightByteInteger53, zipLong54);
        int int56 = zipLong54.getIntValue();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong57 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        byte[] byteArray58 = zipLong57.getBytes();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger59 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger60 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger61 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong62 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField63 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger59, zipEightByteInteger60, zipEightByteInteger61, zipLong62);
        int int64 = zipLong62.getIntValue();
        org.apache.commons.compress.archivers.zip.ZipLong[] zipLongArray65 = new org.apache.commons.compress.archivers.zip.ZipLong[] { zipLong15, zipLong16, zipLong47, zipLong54, zipLong57, zipLong62 };
        java.util.HashSet<org.apache.commons.compress.archivers.zip.ZipLong> zipLongSet66 = org.apache.commons.compress.utils.Sets.newHashSet(zipLongArray65);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(zipLong16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str20, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(fileTime21);
        org.junit.Assert.assertNull(fileTime22);
        org.junit.Assert.assertNotNull(zipLong27);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger30);
        org.junit.Assert.assertNotNull(zipEightByteInteger31);
        org.junit.Assert.assertNotNull(zipLong39);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger42);
        org.junit.Assert.assertNotNull(zipEightByteInteger43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str46, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong47);
        org.junit.Assert.assertNotNull(zipLong54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 808471376 + "'", int56 == 808471376);
        org.junit.Assert.assertNotNull(zipLong57);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray58), "[80, 75, 7, 8]");
        org.junit.Assert.assertNotNull(zipLong62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 808471376 + "'", int64 == 808471376);
        org.junit.Assert.assertNotNull(zipLongArray65);
        org.junit.Assert.assertNotNull(zipLongSet66);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        long long2 = zipArchiveEntry1.getCrc();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        boolean boolean23 = multiReadOnlySeekableByteChannel22.isOpen();
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = multiReadOnlySeekableByteChannel22.position(134695760L);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel27 = multiReadOnlySeekableByteChannel22.truncate((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(seekableByteChannel25);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.apache.commons.compress.archivers.zip.Zip64Mode zip64Mode23 = org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility;
        zipArchiveOutputStream6.setUseZip64(zip64Mode23);
        zipArchiveOutputStream6.setUseLanguageEncodingFlag(true);
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
        org.junit.Assert.assertTrue("'" + zip64Mode23 + "' != '" + org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility + "'", zip64Mode23.equals(org.apache.commons.compress.archivers.zip.Zip64Mode.AlwaysWithCompatibility));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        long long23 = multiReadOnlySeekableByteChannel22.size();
        java.nio.channels.SeekableByteChannel seekableByteChannel25 = multiReadOnlySeekableByteChannel22.position((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 6L + "'", long23 == 6L);
        org.junit.Assert.assertNotNull(seekableByteChannel25);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.compress.archivers.zip.ZipMethod zipMethod0 = org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING;
        int int1 = zipMethod0.getCode();
        org.junit.Assert.assertTrue("'" + zipMethod0 + "' != '" + org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING + "'", zipMethod0.equals(org.apache.commons.compress.archivers.zip.ZipMethod.UNSHRINKING));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getModifyTime();
        java.util.Date date2 = x5455_ExtendedTimestamp0.getModifyJavaTime();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNull(date2);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        byte byte3 = tarArchiveEntry2.getLinkFlag();
        tarArchiveEntry2.setDevMinor((int) 'a');
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 48 + "'", byte3 == (byte) 48);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        long long9 = jarArchiveInputStream6.skip((long) 3);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry10 = jarArchiveInputStream6.getNextJarEntry();
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream11 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream((java.io.InputStream) jarArchiveInputStream6);
        int int12 = closeShieldFilterInputStream11.available();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream14);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream15.write(byteArray17);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream20 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream15);
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean26 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray24, (int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray24, byteArray29);
        byte[] byteArray31 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray24);
        zipArchiveOutputStream20.writePreamble(byteArray31);
        zipArchiveOutputStream20.setMethod((int) (short) 1);
        long long35 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) closeShieldFilterInputStream11, (long) (short) 1, (java.io.OutputStream) zipArchiveOutputStream20);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream36 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: null");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(jarArchiveEntry10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        long long4 = cpioArchiveEntry1.getDeviceMaj();
        long long5 = cpioArchiveEntry1.getRemoteDeviceMaj();
        long long6 = cpioArchiveEntry1.getGID();
        boolean boolean7 = cpioArchiveEntry1.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getMode();
        java.nio.charset.Charset charset6 = org.apache.commons.compress.utils.Charsets.UTF_16;
        int int7 = cpioArchiveEntry1.getHeaderPadCount(charset6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32768L + "'", long5 == 32768L);
        org.junit.Assert.assertNotNull(charset6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int0 = org.apache.commons.compress.archivers.tar.TarArchiveEntry.DEFAULT_FILE_MODE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 33188 + "'", int0 == 33188);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.String str0 = org.apache.commons.compress.archivers.cpio.CpioConstants.MAGIC_NEW;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "070701" + "'", str0, "070701");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        boolean boolean1 = dumpArchiveEntry0.isDirectory();
        int int2 = dumpArchiveEntry0.getGeneration();
        boolean boolean3 = dumpArchiveEntry0.isFifo();
        boolean boolean4 = dumpArchiveEntry0.isFifo();
        java.util.Set<org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION> pERMISSIONSet5 = dumpArchiveEntry0.getPermissions();
        java.util.Date date6 = dumpArchiveEntry0.getAccessTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pERMISSIONSet5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory0 = org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton();
        java.lang.Boolean boolean1 = compressorStreamFactory0.getDecompressUntilEOF();
        org.junit.Assert.assertNotNull(compressorStreamFactory0);
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry3.isPaxHeader();
        java.lang.String str12 = tarArchiveEntry3.getExtraPaxHeader("");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry16 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime17 = null;
        tarArchiveEntry16.setStatusChangeTime(fileTime17);
        tarArchiveEntry16.setUserName("unpack.progress");
        tarArchiveEntry16.setUserId((long) 29127);
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse25 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse(1L, (long) 256);
        long long26 = tarArchiveStructSparse25.getOffset();
        long long27 = tarArchiveStructSparse25.getNumbytes();
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse30 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse(1L, (long) 256);
        long long31 = tarArchiveStructSparse30.getNumbytes();
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse tarArchiveStructSparse34 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse(1L, (long) 256);
        long long35 = tarArchiveStructSparse34.getNumbytes();
        org.apache.commons.compress.archivers.tar.TarArchiveStructSparse[] tarArchiveStructSparseArray36 = new org.apache.commons.compress.archivers.tar.TarArchiveStructSparse[] { tarArchiveStructSparse25, tarArchiveStructSparse30, tarArchiveStructSparse34 };
        java.util.ArrayList<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList37 = new java.util.ArrayList<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse>) tarArchiveStructSparseList37, tarArchiveStructSparseArray36);
        tarArchiveEntry16.setSparseHeaders((java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse>) tarArchiveStructSparseList37);
        tarArchiveEntry3.setSparseHeaders((java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse>) tarArchiveStructSparseList37);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 256L + "'", long27 == 256L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 256L + "'", long31 == 256L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 256L + "'", long35 == 256L);
        org.junit.Assert.assertNotNull(tarArchiveStructSparseArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = zip64ExtendedInformationExtraField4.getLocalFileDataLength();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        long long8 = zipEightByteInteger7.getLongValue();
        java.lang.String str9 = zipEightByteInteger7.toString();
        zip64ExtendedInformationExtraField4.setSize(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ZipEightByteInteger value: 0" + "'", str9, "ZipEightByteInteger value: 0");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        long long1 = x0017_StrongEncryptionHeader0.getRecordCount();
        long long2 = x0017_StrongEncryptionHeader0.getRecordCount();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.List<java.nio.channels.SeekableByteChannel> seekableByteChannelList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel zipSplitReadOnlySeekableByteChannel1 = new org.apache.commons.compress.archivers.zip.ZipSplitReadOnlySeekableByteChannel(seekableByteChannelList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: channels must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder1.withMaxOffset((int) '#');
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder5 = builder3.withMaxNumberOfCandidates((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = zipArchiveInputStream8.getNextEntry();
        byte[] byteArray13 = org.apache.commons.compress.utils.IOUtils.readRange((java.io.InputStream) zipArchiveInputStream8, 6);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream14 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        long long16 = skipShieldingInputStream14.skip((long) 21);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(archiveEntry11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        tarArchiveEntry2.setUserName("gz");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier3 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest4 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry1, inputStreamSupplier3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.InputStream inputStream5 = zipArchiveEntryRequest4.getPayloadStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest4);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry1.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize5 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters7 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, parameters6);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters8 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters9 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, parameters8);
        boolean boolean10 = zipArchiveEntry1.equals((java.lang.Object) blockSize5);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder14 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder15 = builder14.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder17 = builder14.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder18 = builder17.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters19 = builder18.build();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters20 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, false, true, true, parameters19);
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters24 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, true, false, true);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + blockSize5 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize5.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(parameters19);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "pack.effort", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
        tarArchiveEntry13.setUserName("keep");
        java.lang.String str17 = tarArchiveEntry13.getLinkName();
        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
        tarArchiveEntry13.setStatusChangeTime(fileTime20);
        sevenZArchiveEntry0.setCreationTime(fileTime20);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime24 = sevenZArchiveEntry0.getLastModifiedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        java.io.OutputStream outputStream4 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream5 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream4);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream5.write(byteArray7);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream5);
        long long11 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream2, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream5, 36864);
        int int12 = cpioArchiveInputStream2.read();
        long long13 = cpioArchiveInputStream2.getBytesRead();
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry14 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry14.setHasLastModifiedDate(false);
        long long17 = sevenZArchiveEntry14.getSize();
        sevenZArchiveEntry14.setHasStream(false);
        boolean boolean20 = cpioArchiveInputStream2.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) sevenZArchiveEntry14);
        long long21 = cpioArchiveInputStream2.getBytesRead();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField1 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField1.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField0.setHeaderId(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong11 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField12 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger8, zipEightByteInteger9, zipEightByteInteger10, zipLong11);
        byte[] byteArray13 = zip64ExtendedInformationExtraField12.getCentralDirectoryData();
        org.apache.commons.compress.archivers.tar.TarFile tarFile15 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray13, true);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream20 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream18, 10);
        long long22 = cpioArchiveInputStream20.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream24 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream20, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream25 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream24);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry26 = jarArchiveInputStream24.getNextEntry();
        byte[] byteArray27 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream24);
        boolean boolean30 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray13, 11, (-1), byteArray27, 0, 96);
        // The following exception was thrown during execution in test generation
        try {
            unrecognizedExtraField0.parseFromLocalFileData(byteArray27, 61440, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipLong11);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[80, 75, 48, 48]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNull(archiveEntry26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getRemoteDeviceMaj();
        boolean boolean3 = cpioArchiveEntry1.isDirectory();
        long long4 = cpioArchiveEntry1.getDeviceMin();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream11);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream12.write(byteArray14);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream12);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream19 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream20 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream22 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream20, (int) (byte) 83);
        zstdCompressorOutputStream22.write(16384);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean33 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray31, (int) (short) 100);
        boolean boolean35 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray31, 511);
        zstdCompressorOutputStream22.write(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream9.write(byteArray31, (int) (short) 3, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = zstdCompressorInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_ISCHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8192 + "'", int0 == 8192);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        boolean boolean12 = tarArchiveEntry3.isSparse();
        long long13 = tarArchiveEntry3.getLongUserId();
        long long14 = tarArchiveEntry3.getDataOffset();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 29127L + "'", long13 == 29127L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder0 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder2 = builder0.withMaxMemoryLimitInKb(508);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder0.withMaxMemoryLimitInKb((int) (byte) 51);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.nio.file.Path path25 = null;
        java.nio.file.LinkOption linkOption27 = null;
        java.nio.file.LinkOption[] linkOptionArray28 = new java.nio.file.LinkOption[] { linkOption27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry29 = cpioArchiveOutputStream24.createArchiveEntry(path25, "snappy-raw", linkOptionArray28);
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
        org.junit.Assert.assertNotNull(linkOptionArray28);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getModifyTime();
        java.nio.file.attribute.FileTime fileTime2 = x5455_ExtendedTimestamp0.getModifyFileTime();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNull(fileTime2);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        byte[] byteArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = closeShieldFilterInputStream1.read(byteArray3, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        java.lang.Object obj2 = asiExtraField0.clone();
        asiExtraField0.setGroupId((int) (byte) 76);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int1 = arjArchiveEntry0.getMode();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        boolean boolean11 = org.apache.commons.compress.compressors.xz.XZCompressorInputStream.matches(byteArray8, (int) (byte) 0);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray8);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray8, 96, 156, byteArray16, 61440, 134695760);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 96");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream7 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, parameters6);
        framedSnappyCompressorOutputStream7.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean12 = tarArchiveEntry11.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = tarArchiveEntry11.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil15 = new org.apache.commons.compress.compressors.FileNameUtil(strMap13, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream16 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream7, strMap13);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream17 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        byte[] byteArray2 = zipArchiveEntry1.getExtra();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger4 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger5 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong6 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField7 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger3, zipEightByteInteger4, zipEightByteInteger5, zipLong6);
        byte[] byteArray8 = zip64ExtendedInformationExtraField7.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = zip64ExtendedInformationExtraField7.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger10 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField7.setRelativeHeaderOffset(zipEightByteInteger10);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField14 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger10, zipEightByteInteger13);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger15 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField14.setSize(zipEightByteInteger15);
        zipArchiveEntry1.addAsFirstExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField14);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveEntry1.removeUnparseableExtraFieldData();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(byteArray2);
        org.junit.Assert.assertNotNull(zipLong6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger9);
        org.junit.Assert.assertNotNull(zipEightByteInteger10);
        org.junit.Assert.assertNotNull(zipEightByteInteger15);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream14 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        gzipCompressorOutputStream14.flush();
        org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream16 = compressorStreamFactory1.createCompressorOutputStream("lzma", (java.io.OutputStream) gzipCompressorOutputStream14);
        gzipCompressorOutputStream14.flush();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(compressorOutputStream16);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider> strMap2 = compressorStreamFactory1.getCompressorInputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = compressorStreamFactory1.getInputStreamCompressorNames();
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream5, 10);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream8 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) cpioArchiveInputStream7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.CompressorInputStream compressorInputStream10 = compressorStreamFactory1.createCompressorInputStream("ISO-8859-1", (java.io.InputStream) brotliCompressorInputStream8, true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.compressors.CompressorException; message: Compressor: ISO-8859-1 not found.");
        } catch (org.apache.commons.compress.compressors.CompressorException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry6 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry("unpack.progress", (long) 512, 0, 4, 12, 10L);
        long long7 = arArchiveEntry6.getLastModified();
        int int8 = arArchiveEntry6.getUserId();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.compress.compressors.lz4.XXHash32 xXHash32_0 = new org.apache.commons.compress.compressors.lz4.XXHash32();
        xXHash32_0.reset();
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream11 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream7);
        long long13 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream4, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream7, 36864);
        int int14 = cpioArchiveInputStream4.read();
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream16 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, 2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream((java.util.zip.Checksum) xXHash32_0, (java.io.InputStream) cpioArchiveInputStream4);
        java.io.OutputStream outputStream18 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream19 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream18);
        byte[] byteArray21 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream19.write(byteArray21);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream23 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream19);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream24 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream19);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean30 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray28, (int) (short) 10);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean34 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray28, byteArray33);
        byte[] byteArray35 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray28);
        zipArchiveOutputStream24.writePreamble(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = checksumCalculatingInputStream17.read(byteArray35, 33188, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 0, 0]");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream9 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream12 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream7, (short) (byte) 2, 8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) cpioArchiveOutputStream12, 16877, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 1);
        bZip2CompressorOutputStream7.write((int) (byte) 1);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream12, 10);
        long long16 = cpioArchiveInputStream14.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream18 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream14, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream19 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream18);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry20 = jarArchiveInputStream18.getNextEntry();
        byte[] byteArray21 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream18);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField22 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray21);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField23 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("pack.effort", byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            bZip2CompressorOutputStream7.write(byteArray21, 512, 33188);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: offs(512) + len(33188) > buf.length(0).");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(archiveEntry20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[]");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str0 = org.apache.commons.compress.compressors.CompressorStreamFactory.DEFLATE64;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "deflate64" + "'", str0, "deflate64");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray6, (int) (short) 100);
        boolean boolean10 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray6, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray6, true);
        boolean boolean14 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray6, 21);
        boolean boolean16 = org.apache.commons.compress.compressors.xz.XZUtils.matches(byteArray6, (-1));
        boolean boolean18 = org.apache.commons.compress.compressors.z.ZCompressorInputStream.matches(byteArray6, 16);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField4.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = zip64ExtendedInformationExtraField4.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(zipShort9);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean12 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel10 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray3);
        long long11 = seekableInMemoryByteChannel10.position();
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray12 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel13 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray12);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile14 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel13);
        org.apache.commons.compress.archivers.tar.TarFile tarFile15 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel13);
        char[] charArray19 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile20 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel13, charArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile21 = new org.apache.commons.compress.archivers.sevenz.SevenZFile((java.nio.channels.SeekableByteChannel) seekableInMemoryByteChannel10, charArray19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(seekableByteChannelArray12);
        org.junit.Assert.assertNotNull(seekableByteChannel13);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, 4,  ]");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        long long3 = sevenZArchiveEntry0.getSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry7 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean8 = tarArchiveEntry7.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean13 = tarArchiveEntry7.equals(tarArchiveEntry12);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime18 = null;
        tarArchiveEntry17.setStatusChangeTime(fileTime18);
        tarArchiveEntry17.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean26 = tarArchiveEntry17.equals(tarArchiveEntry25);
        java.nio.file.attribute.FileTime fileTime28 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry25.setLastModifiedTime(fileTime28);
        tarArchiveEntry12.setLastAccessTime(fileTime28);
        sevenZArchiveEntry0.setLastModifiedTime(fileTime28);
        boolean boolean32 = sevenZArchiveEntry0.getHasCreationDate();
        sevenZArchiveEntry0.setHasWindowsAttributes(true);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(fileTime28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.ISEXTENDEDLEN_GNU;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry8 = jarArchiveInputStream6.getNextJarEntry();
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry9 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        int int10 = arjArchiveEntry9.getHostOs();
        boolean boolean11 = jarArchiveInputStream6.canReadEntryData((org.apache.commons.compress.archivers.ArchiveEntry) arjArchiveEntry9);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(jarArchiveEntry8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        gzipParameters0.setOperatingSystem(2048);
        int int3 = gzipParameters0.getDeflateStrategy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        boolean boolean12 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setUserId((int) (byte) 83);
        tarArchiveEntry3.setUserName("snappy-raw");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry20 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean21 = tarArchiveEntry20.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry25 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean26 = tarArchiveEntry20.equals(tarArchiveEntry25);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry30 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime31 = null;
        tarArchiveEntry30.setStatusChangeTime(fileTime31);
        tarArchiveEntry30.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry38 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean39 = tarArchiveEntry30.equals(tarArchiveEntry38);
        java.nio.file.attribute.FileTime fileTime41 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry38.setLastModifiedTime(fileTime41);
        tarArchiveEntry25.setLastAccessTime(fileTime41);
        java.util.Date date45 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime46 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date45);
        tarArchiveEntry25.setModTime(fileTime46);
        long long48 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime46);
        tarArchiveEntry3.setLastModifiedTime(fileTime46);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(fileTime41);
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        long long3 = sevenZArchiveEntry0.getSize();
        sevenZArchiveEntry0.setAntiItem(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = sevenZArchiveEntry0.getCreationDate();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream6 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) gzipCompressorOutputStream5);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        boolean boolean13 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            gzipCompressorOutputStream5.write(byteArray10, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream2 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream(path0, (long) 508);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Zip split segment size should between 64K and 4,294,967,295");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
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
        arArchiveOutputStream22.finish();
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry28 = arArchiveOutputStream22.createArchiveEntry(file26, "cpio.gz");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
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
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry5 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime6 = null;
        tarArchiveEntry5.setStatusChangeTime(fileTime6);
        tarArchiveEntry5.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry5.equals(tarArchiveEntry13);
        java.nio.file.attribute.FileTime fileTime16 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry13.setLastModifiedTime(fileTime16);
        x5455_ExtendedTimestamp0.setModifyFileTime(fileTime16);
        java.util.Date date19 = x5455_ExtendedTimestamp0.getAccessJavaTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort20 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.lang.String str21 = zipShort20.toString();
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(zipShort20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ZipShort value: 5" + "'", str21, "ZipShort value: 5");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ar.ArArchiveEntry arArchiveEntry2 = new org.apache.commons.compress.archivers.ar.ArArchiveEntry(file0, "pack200");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        java.util.Date date6 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime7 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date6);
        tarArchiveEntry3.setStatusChangeTime(fileTime7);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry12 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean13 = tarArchiveEntry12.isPaxGNU1XSparse();
        java.util.Date date15 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime16 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date15);
        tarArchiveEntry12.setStatusChangeTime(fileTime16);
        boolean boolean18 = tarArchiveEntry3.equals(tarArchiveEntry12);
        boolean boolean19 = tarArchiveEntry3.isFile();
        boolean boolean20 = tarArchiveEntry3.isDirectory();
        byte byte21 = tarArchiveEntry3.getLinkFlag();
        boolean boolean22 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream17 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream5, "true");
        boolean boolean18 = cpioArchiveInputStream5.markSupported();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        java.nio.file.attribute.FileTime fileTime10 = tarArchiveEntry3.getCreationTime();
        tarArchiveEntry3.setGroupName("././@LongLink");
        int int13 = tarArchiveEntry3.getDevMinor();
        boolean boolean14 = tarArchiveEntry3.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(fileTime10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime28 = null;
        tarArchiveEntry27.setStatusChangeTime(fileTime28);
        tarArchiveEntry27.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean36 = tarArchiveEntry27.equals(tarArchiveEntry35);
        boolean boolean37 = zipArchiveOutputStream23.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry35);
        long long38 = tarArchiveEntry35.getDataOffset();
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode extraFieldParsingMode39 = org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT;
        byte[] byteArray41 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray42 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray41);
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField47 = extraFieldParsingMode39.onUnparseableExtraField(byteArray42, (int) (short) 0, 84446, true, 16877);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort49 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray42, (int) (byte) 4);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding51 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean53 = zipEncoding51.canEncode("lz4-block");
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry35.writeEntryHeader(byteArray42, zipEncoding51, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + extraFieldParsingMode39 + "' != '" + org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT + "'", extraFieldParsingMode39.equals(org.apache.commons.compress.archivers.zip.ZipArchiveEntry.ExtraFieldParsingMode.ONLY_PARSEABLE_STRICT));
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray41), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(zipExtraField47);
        org.junit.Assert.assertNotNull(zipEncoding51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int2 = org.apache.commons.compress.utils.ExactMath.add((int) (short) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        boolean boolean10 = tarArchiveEntry3.isPaxHeader();
        boolean boolean11 = tarArchiveEntry3.isSparse();
        tarArchiveEntry3.setName("LZ4 Parameters with BlockSize M4, withContentChecksum true, withBlockChecksum false, withBlockDependency false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters1 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int2 = gzipParameters1.getOperatingSystem();
        gzipParameters1.setBufferSize((int) (byte) 53);
        long long5 = gzipParameters1.getModificationTime();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream6 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream(outputStream0, gzipParameters1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 255 + "'", int2 == 255);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        tarArchiveEntry3.setUserId((long) 29127);
        tarArchiveEntry3.setMode(263);
        tarArchiveEntry3.setUserName("error.gz");
        boolean boolean14 = tarArchiveEntry3.isGlobalPaxHeader();
        java.nio.file.attribute.FileTime fileTime15 = tarArchiveEntry3.getLastModifiedTime();
        boolean boolean16 = tarArchiveEntry3.isDirectory();
        java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> tarArchiveStructSparseList17 = tarArchiveEntry3.getSparseHeaders();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fileTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(tarArchiveStructSparseList17);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
        tarArchiveEntry13.setUserName("keep");
        java.lang.String str17 = tarArchiveEntry13.getLinkName();
        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
        tarArchiveEntry13.setStatusChangeTime(fileTime20);
        sevenZArchiveEntry0.setCreationTime(fileTime20);
        sevenZArchiveEntry0.setHasCrc(true);
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp26 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str27 = x5455_ExtendedTimestamp26.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong28 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        x5455_ExtendedTimestamp26.setModifyTime(zipLong28);
        boolean boolean30 = x5455_ExtendedTimestamp26.isBit1_accessTimePresent();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp31 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry35 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime36 = null;
        tarArchiveEntry35.setStatusChangeTime(fileTime36);
        tarArchiveEntry35.setUserName("unpack.progress");
        tarArchiveEntry35.addPaxHeader("dump", "ISO-8859-1");
        java.util.Date date43 = tarArchiveEntry35.getModTime();
        x5455_ExtendedTimestamp31.setAccessJavaTime(date43);
        x5455_ExtendedTimestamp26.setCreateJavaTime(date43);
        java.nio.file.attribute.FileTime fileTime46 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date43);
        sevenZArchiveEntry0.setLastModifiedDate(date43);
        java.nio.file.attribute.FileTime fileTime48 = sevenZArchiveEntry0.getCreationTime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str27, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNotNull(zipLong28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(date43);
// flaky:         org.junit.Assert.assertEquals(date43.toString(), "Mon Jun 19 00:08:28 CEST 2023");
        org.junit.Assert.assertNotNull(fileTime46);
        org.junit.Assert.assertNotNull(fileTime48);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime5 = sevenZArchiveEntry0.getLastModifiedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setInode((long) 2048);
        java.util.Date date4 = cpioArchiveEntry1.getLastModifiedDate();
        long long5 = cpioArchiveEntry1.getUID();
        cpioArchiveEntry1.setTime((long) (byte) 10);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String str0 = org.apache.commons.compress.utils.CharsetNames.UTF_16;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-16" + "'", str0, "UTF-16");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        boolean boolean23 = multiReadOnlySeekableByteChannel22.isOpen();
        java.nio.ByteBuffer byteBuffer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = multiReadOnlySeekableByteChannel22.read(byteBuffer24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        boolean boolean5 = sevenZArchiveEntry0.isAntiItem();
        sevenZArchiveEntry0.setCreationDate((long) 131);
        boolean boolean8 = sevenZArchiveEntry0.getHasWindowsAttributes();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(1L);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 33, 0]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 88, (byte) 55, (byte) 48, (byte) 0, (byte) 55 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("bzip2", byteArray7);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort9 = new org.apache.commons.compress.archivers.zip.ZipShort(byteArray7);
        boolean boolean11 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray7, 26128);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 88, 55, 48, 0, 55]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.DEFAULT;
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap1 = archiveStreamFactory0.getArchiveInputStreamProviders();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap2 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.util.Set<java.lang.String> strSet3 = archiveStreamFactory0.getInputStreamArchiveNames();
        java.util.SortedMap<java.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider> strMap4 = archiveStreamFactory0.getArchiveOutputStreamProviders();
        java.lang.String str5 = archiveStreamFactory0.getEntryEncoding();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream7 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream6);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream10 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream7, (long) (byte) 100, (int) (short) 3);
        long long12 = cRC32VerifyingInputStream10.skip(0L);
        long long14 = cRC32VerifyingInputStream10.skip((long) (byte) 100);
        int int15 = cRC32VerifyingInputStream10.read();
        int int16 = cRC32VerifyingInputStream10.read();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveInputStream archiveInputStream17 = archiveStreamFactory0.createArchiveInputStream((java.io.InputStream) cRC32VerifyingInputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Mark is not supported.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(archiveStreamFactory0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "apkm" + "'", str5, "apkm");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        boolean boolean1 = org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename("false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField1 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField1.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField0.setHeaderId(zipShort4);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean11 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray9, (int) (short) 10);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean15 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray9, byteArray14);
        unrecognizedExtraField0.setLocalFileDataData(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.compress.archivers.tar.TarUtils.parseName(byteArray14, 511, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 511");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong0 = org.apache.commons.compress.archivers.zip.ZipLong.LFH_SIG;
        byte[] byteArray1 = zipLong0.getBytes();
        org.junit.Assert.assertNotNull(zipLong0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[80, 75, 3, 4]");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream4 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream2, 10);
        long long6 = cpioArchiveInputStream4.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream8 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream4, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream9 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.ArchiveEntry archiveEntry10 = jarArchiveInputStream8.getNextEntry();
        byte[] byteArray11 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) jarArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField12 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField(" \000", byteArray11);
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField13 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("pack.effort", byteArray11);
        byte[] byteArray14 = unicodeCommentExtraField13.getUnicodeName();
        boolean boolean16 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray14, 256);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(archiveEntry10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[112, 97, 99, 107, 46, 101, 102, 102, 111, 114, 116]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.SKIP;
        int int1 = unparseableExtraField0.getKey();
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        boolean boolean1 = org.apache.commons.compress.utils.TimeUtils.isUnixTime(10L);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream9 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream6, "pack.field.attribute.");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream10 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        int int4 = tarArchiveEntry2.getUserId();
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        long long13 = org.apache.commons.compress.utils.IOUtils.skip((java.io.InputStream) zipArchiveInputStream11, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream dumpArchiveInputStream15 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream((java.io.InputStream) zipArchiveInputStream11, "pack.unknown.attribute");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: unexpected EOF");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        zipArchiveOutputStream7.setFallbackToUTF8(true);
        java.nio.file.Path path22 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream7, path22);
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
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        boolean boolean12 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray3, (int) (short) 100);
        org.apache.commons.compress.archivers.tar.TarFile tarFile14 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray3, false);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry18 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean19 = tarArchiveEntry18.isPaxGNU1XSparse();
        java.util.Date date21 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime22 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date21);
        tarArchiveEntry18.setStatusChangeTime(fileTime22);
        java.nio.file.attribute.FileTime fileTime24 = tarArchiveEntry18.getLastModifiedTime();
        boolean boolean25 = tarArchiveEntry18.isStreamContiguous();
        tarArchiveEntry18.setUserName("keep");
        java.io.InputStream inputStream28 = tarFile14.getInputStream(tarArchiveEntry18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream31 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream(inputStream28, false, 0);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime22);
        org.junit.Assert.assertNotNull(fileTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(inputStream28);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray2);
        byte[] byteArray4 = x0017_StrongEncryptionHeader0.getLocalFileDataData();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean10 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray8, (int) (short) 10);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray8);
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm encryptionAlgorithm12 = x0017_StrongEncryptionHeader0.getEncryptionAlgorithm();
        java.io.OutputStream outputStream13 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream14 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream13);
        byte[] byteArray16 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream14.write(byteArray16);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream18 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream14);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream19 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream14);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray23, (int) (short) 10);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray28);
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        zipArchiveOutputStream19.writePreamble(byteArray30);
        x0017_StrongEncryptionHeader0.setLocalFileDataData(byteArray30);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean42 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray40, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime(0L, byteArray40, 1);
        x0017_StrongEncryptionHeader0.setCentralDirectoryData(byteArray40);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray4);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(encryptionAlgorithm12);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[1, 0, 0, 33, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.nio.file.attribute.FileTime fileTime1 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToFileTime((long) 16384);
        long long2 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime1);
        org.junit.Assert.assertNotNull(fileTime1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16384L + "'", long2 == 16384L);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder1 = builder0.tunedForCompressionRatio();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder3 = builder0.withMinBackReferenceLength(0);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder3.tunedForSpeed();
        org.apache.commons.compress.compressors.lz77support.Parameters parameters5 = builder4.build();
        int int6 = parameters5.getMinBackReferenceLength();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(parameters5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        zstdCompressorOutputStream8.write(4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        boolean boolean7 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = org.apache.commons.compress.archivers.tar.TarUtils.formatLongOctalOrBinaryBytes((long) 8, byteArray4, 10, 16877);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16885");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        byte[] byteArray1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        byte[] byteArray2 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray1);
        int int4 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(byteArray1, 5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream8, (int) (short) 10, "false");
        int int14 = zipArchiveInputStream8.available();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField0 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField();
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "lz4-block", true, false, true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        int int2 = zipArchiveEntry1.getVersionRequired();
        byte[] byteArray3 = zipArchiveEntry1.getExtra();
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        byte[] byteArray5 = zipArchiveEntry1.getRawName();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit6 = zipArchiveEntry1.getGeneralPurposeBit();
        int int7 = zipArchiveEntry1.getPlatform();
        long long8 = zipArchiveEntry1.getDataOffset();
        java.lang.String str9 = zipArchiveEntry1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteArray3);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertNull(byteArray5);
        org.junit.Assert.assertNotNull(generalPurposeBit6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "pack.method.attribute." + "'", str9, "pack.method.attribute.");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream23 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        java.lang.String str24 = zstdCompressorOutputStream8.toString();
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
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        tarArchiveEntry8.setUserName("keep");
        long long12 = tarArchiveEntry8.getLongUserId();
        tarArchiveEntry8.setName("snappy-framed");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile3 = new org.apache.commons.compress.archivers.zip.ZipFile(file0, "", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) (short) 0);
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger3 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger((long) 4095);
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger1, zipEightByteInteger3);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
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
        int int25 = cpioArchiveOutputStream24.getCount();
        java.io.File file26 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) cpioArchiveOutputStream24, file26);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        java.nio.file.Path path3 = tarArchiveEntry2.getPath();
        java.util.Date date4 = tarArchiveEntry2.getLastModifiedDate();
        boolean boolean5 = tarArchiveEntry2.isPaxHeader();
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp6 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str7 = x5455_ExtendedTimestamp6.toString();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry10 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean15 = tarArchiveEntry14.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry19 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean20 = tarArchiveEntry14.equals(tarArchiveEntry19);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry24 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime25 = null;
        tarArchiveEntry24.setStatusChangeTime(fileTime25);
        tarArchiveEntry24.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry32 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean33 = tarArchiveEntry24.equals(tarArchiveEntry32);
        java.nio.file.attribute.FileTime fileTime35 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry32.setLastModifiedTime(fileTime35);
        tarArchiveEntry19.setLastAccessTime(fileTime35);
        tarArchiveEntry10.setModTime(fileTime35);
        x5455_ExtendedTimestamp6.setCreateFileTime(fileTime35);
        tarArchiveEntry2.setModTime(fileTime35);
        org.junit.Assert.assertNull(path3);
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Mon Jun 19 00:08:34 CEST 2023");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str7, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(fileTime35);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getGID();
        java.lang.String str6 = cpioArchiveEntry1.getName();
        java.lang.String str7 = org.apache.commons.compress.utils.ArchiveUtils.toString((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry1);
        long long8 = cpioArchiveEntry1.getNumberOfLinks();
        boolean boolean9 = cpioArchiveEntry1.isCharacterDevice();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-       0 " + "'", str7, "-       0 ");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.nio.file.Path path3 = null;
        java.nio.file.LinkOption[] linkOptionArray5 = org.apache.commons.compress.utils.IOUtils.EMPTY_LINK_OPTIONS;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry6 = sevenZOutputFile2.createArchiveEntry(path3, "\000\000!\000", linkOptionArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(linkOptionArray5);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        lZMACompressorOutputStream10.write(12);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = null;
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream14 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) lZMACompressorOutputStream10, strMap13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorOutputStream xZCompressorOutputStream16 = new org.apache.commons.compress.compressors.xz.XZCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.tukaani.xz.UnsupportedOptionsException; message: Unsupported preset: 100");
        } catch (org.tukaani.xz.UnsupportedOptionsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        int int4 = tarArchiveEntry3.getMode();
        java.lang.String str5 = tarArchiveEntry3.getGroupName();
        tarArchiveEntry3.setModTime((long) 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33188 + "'", int4 == 33188);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        org.apache.commons.compress.compressors.deflate.DeflateParameters deflateParameters6 = new org.apache.commons.compress.compressors.deflate.DeflateParameters();
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) zstdCompressorInputStream2, deflateParameters6);
        java.lang.String str8 = zstdCompressorInputStream2.toString();
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) tarArchiveInputStream6);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream10 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) deflateCompressorInputStream7, (int) (byte) 48, "pack.effort");
        tarArchiveInputStream10.mark(14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveInputStream10.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.File file2 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("hi!", file2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        cpioArchiveEntry1.setSize((long) (short) 1);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.util.concurrent.ExecutorService executorService0 = null;
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator1 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0);
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        parallelScatterZipCreator2.writeTo(zipArchiveOutputStream9);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier zipArchiveEntryRequestSupplier11 = null;
        java.util.concurrent.Callable<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream> scatterZipOutputStreamCallable12 = parallelScatterZipCreator2.createCallable(zipArchiveEntryRequestSupplier11);
        // The following exception was thrown during execution in test generation
        try {
            parallelScatterZipCreator1.submit(scatterZipOutputStreamCallable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable12);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        java.io.OutputStream outputStream16 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream17 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream16);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream17.write(byteArray19);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream21 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream17);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream22 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream17);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean28 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray26, (int) (short) 10);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean32 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray26, byteArray31);
        byte[] byteArray33 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray26);
        zipArchiveOutputStream22.writePreamble(byteArray33);
        zipArchiveOutputStream22.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy36 = null;
        zipArchiveOutputStream22.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy36);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean46 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray44, (int) (short) 100);
        boolean boolean48 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray44, (int) (byte) 0);
        zipArchiveOutputStream22.writePreamble(byteArray44);
        boolean boolean51 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray44, 4096);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.write(byteArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current 7z entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy8 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy8);
        java.io.OutputStream outputStream10 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream10);
        byte[] byteArray13 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream11.write(byteArray13);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream15 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream11);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream16 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream11);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean22 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray20, (int) (short) 10);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean26 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray20, byteArray25);
        byte[] byteArray27 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray20);
        zipArchiveOutputStream16.writePreamble(byteArray27);
        zipArchiveOutputStream16.setMethod((int) (short) 1);
        java.io.OutputStream outputStream31 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream32 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream31);
        byte[] byteArray34 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream32.write(byteArray34);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream36 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream37 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream32);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy38 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
        zipArchiveOutputStream37.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream16.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        zipArchiveOutputStream7.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy38);
        byte[] byteArray48 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean50 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray48, (int) (short) 100);
        boolean boolean52 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray48, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile54 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray48, true);
        boolean boolean56 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray48, 21);
        zipArchiveOutputStream7.writePreamble(byteArray48, (int) (short) 10, 36864);
        zipArchiveOutputStream7.setMethod((-1));
        java.nio.file.Path path62 = null;
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry63 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        boolean boolean64 = arjArchiveEntry63.isHostOsUnix();
        boolean boolean66 = arjArchiveEntry63.equals((java.lang.Object) "\000\000!\000");
        java.util.EnumSet<java.nio.file.FileVisitOption> fileVisitOptionSet67 = org.apache.commons.compress.archivers.examples.Archiver.EMPTY_FileVisitOption;
        boolean boolean68 = arjArchiveEntry63.equals((java.lang.Object) fileVisitOptionSet67);
        java.nio.file.LinkOption[] linkOptionArray69 = new java.nio.file.LinkOption[] {};
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create((org.apache.commons.compress.archivers.ArchiveOutputStream) zipArchiveOutputStream7, path62, fileVisitOptionSet67, linkOptionArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy8);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray25), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy38);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray48), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(fileVisitOptionSet67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(linkOptionArray69);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.lang.Boolean boolean2 = compressorStreamFactory1.getDecompressUntilEOF();
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withMaxNumberOfCandidates(2097655);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters3 = builder2.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(parameters3);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        java.util.Date date6 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime7 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date6);
        tarArchiveEntry3.setStatusChangeTime(fileTime7);
        java.nio.file.attribute.FileTime fileTime9 = tarArchiveEntry3.getLastModifiedTime();
        boolean boolean10 = tarArchiveEntry3.isStreamContiguous();
        tarArchiveEntry3.setUserName("keep");
        boolean boolean13 = tarArchiveEntry3.isDirectory();
        java.io.OutputStream outputStream14 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream15 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream14);
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream15.write(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            tarArchiveEntry3.parseTarHeader(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime7);
        org.junit.Assert.assertNotNull(fileTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0, 33, 0]");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        org.apache.commons.compress.utils.SeekableInMemoryByteChannel seekableInMemoryByteChannel10 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel(byteArray3);
        byte[] byteArray11 = seekableInMemoryByteChannel10.array();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 10]");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator0 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream6 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream7 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream2);
        parallelScatterZipCreator0.writeTo(zipArchiveOutputStream7);
        // The following exception was thrown during execution in test generation
        try {
            zipArchiveOutputStream7.setLevel(255);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid compression level: 255");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, "pass");
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream8 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) jarArchiveOutputStream7);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry11 = arArchiveOutputStream8.createArchiveEntry(file9, "lz4-framed");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        closeShieldFilterInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            closeShieldFilterInputStream1.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.compress.archivers.ArchiveStreamFactory archiveStreamFactory0 = new org.apache.commons.compress.archivers.ArchiveStreamFactory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream7 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean14 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) 10);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean18 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray12, byteArray17);
        byte[] byteArray19 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray12);
        zipArchiveOutputStream8.writePreamble(byteArray19);
        zipArchiveOutputStream8.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy22 = null;
        zipArchiveOutputStream8.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy22);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream24 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream8);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream25 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) arArchiveOutputStream24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveOutputStream archiveOutputStream26 = archiveStreamFactory0.createArchiveOutputStream("", (java.io.OutputStream) deflateCompressorOutputStream25);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver:  not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, 0, 0]");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        org.apache.commons.compress.utils.BoundedInputStream boundedInputStream9 = new org.apache.commons.compress.utils.BoundedInputStream((java.io.InputStream) tarArchiveInputStream7, (long) 36864);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime14 = null;
        tarArchiveEntry13.setStatusChangeTime(fileTime14);
        tarArchiveEntry13.setUserName("unpack.progress");
        tarArchiveEntry13.setUserId((long) 29127);
        tarArchiveEntry13.setMode(263);
        tarArchiveEntry13.setUserName("error.gz");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = tarArchiveEntry13.getExtraPaxHeaders();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream25 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream((java.io.InputStream) tarArchiveInputStream7, strMap24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        zipArchiveEntry16.setComment(".xz");
        int int24 = zipArchiveEntry16.getUnixMode();
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable13);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24, 10);
        long long28 = cpioArchiveInputStream26.skip(100L);
        long long30 = cpioArchiveInputStream26.skip((long) 29127);
        byte[] byteArray31 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream26);
        org.apache.commons.compress.archivers.tar.TarFile tarFile33 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray31, "lzma");
        java.io.File file34 = null;
        expander0.expand(tarFile33, file34);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream38 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream36, 10);
        long long40 = cpioArchiveInputStream38.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream42 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream38, "pack.segment.limit");
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream43 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) jarArchiveInputStream42);
        java.nio.file.Path path44 = null;
        expander0.expand((org.apache.commons.compress.archivers.ArchiveInputStream) jarArchiveInputStream42, path44);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream50 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) jarArchiveInputStream42, 31, 10, "\000\000!\000", false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ??!?");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("0x5455 Zip Extra Field: Flags=0 ");
        zipArchiveEntry1.setComment("\000\000");
        long long4 = zipArchiveEntry1.getCompressedSize();
        long long5 = zipArchiveEntry1.getDataOffset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = zip64ExtendedInformationExtraField4.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong7 = zip64ExtendedInformationExtraField4.getDiskStartNumber();
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        java.lang.String str10 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(byteArray9);
        boolean boolean12 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray9, 476);
        // The following exception was thrown during execution in test generation
        try {
            zipLong7.putLong(byteArray9, (int) (byte) 77);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 77");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipLong7);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\000\000\000\000\000\000\000" + "'", str10, "\n\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.lang.String str1 = org.apache.commons.compress.utils.FileNameUtils.getBaseName("lz4-framed");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lz4-framed" + "'", str1, "lz4-framed");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile x0015_CertificateIdForFile0 = new org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0015_CertificateIdForFile0.getHashAlgorithm();
        int int2 = x0015_CertificateIdForFile0.getRecordCount();
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField4.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore10 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor11 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore10);
        long long12 = streamCompressor11.getCrc32();
        long long13 = streamCompressor11.getCrc32();
        long long14 = streamCompressor11.getCrc32();
        boolean boolean15 = zipEightByteInteger7.equals((java.lang.Object) long14);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore16 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore18 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor19 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore18);
        long long20 = streamCompressor19.getCrc32();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream21 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore16, streamCompressor19);
        boolean boolean22 = zipEightByteInteger7.equals((java.lang.Object) scatterZipOutputStream21);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry24 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit25 = null;
        zipArchiveEntry24.setGeneralPurposeBit(generalPurposeBit25);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray28 = zipArchiveEntry24.getExtraFields(false);
        org.apache.commons.compress.parallel.InputStreamSupplier inputStreamSupplier29 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest30 = org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest.createZipArchiveEntryRequest(zipArchiveEntry24, inputStreamSupplier29);
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream21.addArchiveEntry(zipArchiveEntryRequest30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(streamCompressor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(streamCompressor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(zipExtraFieldArray28);
        org.junit.Assert.assertNotNull(zipArchiveEntryRequest30);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        boolean boolean1 = dumpArchiveEntry0.isDirectory();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int0 = org.apache.commons.compress.compressors.lz77support.Parameters.TRUE_MIN_BACK_REFERENCE_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean4 = tarArchiveEntry3.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry3.equals(tarArchiveEntry8);
        long long10 = tarArchiveEntry8.getSize();
        tarArchiveEntry8.setGroupId((long) (byte) 48);
        long long13 = tarArchiveEntry8.getLongUserId();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry17 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean18 = tarArchiveEntry17.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean23 = tarArchiveEntry17.equals(tarArchiveEntry22);
        long long24 = tarArchiveEntry22.getDataOffset();
        boolean boolean25 = tarArchiveEntry8.equals(tarArchiveEntry22);
        boolean boolean26 = tarArchiveEntry8.isGNUSparse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp23 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str24 = x5455_ExtendedTimestamp23.toString();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry27 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("pack.effort", true);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry31 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean32 = tarArchiveEntry31.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry36 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean37 = tarArchiveEntry31.equals(tarArchiveEntry36);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry41 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime42 = null;
        tarArchiveEntry41.setStatusChangeTime(fileTime42);
        tarArchiveEntry41.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry49 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean50 = tarArchiveEntry41.equals(tarArchiveEntry49);
        java.nio.file.attribute.FileTime fileTime52 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry49.setLastModifiedTime(fileTime52);
        tarArchiveEntry36.setLastAccessTime(fileTime52);
        tarArchiveEntry27.setModTime(fileTime52);
        x5455_ExtendedTimestamp23.setCreateFileTime(fileTime52);
        zipArchiveEntry16.setTime(fileTime52);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable2);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable13);
        org.junit.Assert.assertNull(fileTime19);
        org.junit.Assert.assertNotNull(scatterZipOutputStreamCallable21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str24, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(fileTime52);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream26 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream24, 10);
        long long28 = cpioArchiveInputStream26.skip(100L);
        long long30 = cpioArchiveInputStream26.skip((long) 29127);
        byte[] byteArray31 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream26);
        org.apache.commons.compress.archivers.tar.TarFile tarFile33 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray31, "lzma");
        java.io.File file34 = null;
        expander0.expand(tarFile33, file34);
        java.io.File file36 = null;
        java.io.File file37 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(file36, file37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[]");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream18 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream5, 32768L, 0);
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.compress.archivers.zip.UnrecognizedExtraField unrecognizedExtraField0 = new org.apache.commons.compress.archivers.zip.UnrecognizedExtraField();
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField1 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = unicodePathExtraField1.getHeaderId();
        unrecognizedExtraField0.setHeaderId(zipShort2);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.HEADER_ID;
        unrecognizedExtraField0.setHeaderId(zipShort4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort6 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = unrecognizedExtraField0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort8 = unrecognizedExtraField0.getHeaderId();
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField9 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.createExtraField(zipShort8);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort4);
        org.junit.Assert.assertNotNull(zipShort6);
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(zipShort8);
        org.junit.Assert.assertNotNull(zipExtraField9);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.compress.archivers.dump.ShortFileException shortFileException0 = new org.apache.commons.compress.archivers.dump.ShortFileException();
        org.apache.commons.compress.archivers.StreamingNotSupportedException streamingNotSupportedException2 = new org.apache.commons.compress.archivers.StreamingNotSupportedException("apkm");
        java.lang.String str3 = streamingNotSupportedException2.getFormat();
        shortFileException0.addSuppressed((java.lang.Throwable) streamingNotSupportedException2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "apkm" + "'", str3, "apkm");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        java.lang.String str1 = x5455_ExtendedTimestamp0.toString();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong2 = x5455_ExtendedTimestamp0.getCreateTime();
        java.lang.Object obj3 = x5455_ExtendedTimestamp0.clone();
        x5455_ExtendedTimestamp0.setFlags((byte) 50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0x5455 Zip Extra Field: Flags=0 " + "'", str1, "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertNull(zipLong2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "0x5455 Zip Extra Field: Flags=0 ");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "0x5455 Zip Extra Field: Flags=0 ");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.utils.ByteUtils.toLittleEndian((java.io.OutputStream) pack200CompressorOutputStream10, 116444736001000000L, 0);
        pack200CompressorOutputStream10.write(488);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream18 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream10, (short) (byte) 120, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        long long12 = brotliCompressorInputStream9.getUncompressedCount();
        // The following exception was thrown during execution in test generation
        try {
            brotliCompressorInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        boolean boolean1 = org.apache.commons.compress.compressors.xz.XZUtils.isCompressedFilename("ZipEightByteInteger value: 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField5 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray4);
        byte[] byteArray6 = unicodePathExtraField5.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = unicodePathExtraField5.getLocalFileDataLength();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 100]");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -9, 4, 45, 43, 85, 84, 70, 45, 49, 54, 76, 69]");
        org.junit.Assert.assertNotNull(zipShort7);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
        tarArchiveEntry13.setUserName("keep");
        java.lang.String str17 = tarArchiveEntry13.getLinkName();
        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
        tarArchiveEntry13.setStatusChangeTime(fileTime20);
        sevenZArchiveEntry0.setCreationTime(fileTime20);
        sevenZArchiveEntry0.setHasCrc(true);
        boolean boolean26 = sevenZArchiveEntry0.getHasCrc();
        java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> wildcardIterable27 = sevenZArchiveEntry0.getContentMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.nio.file.attribute.FileTime fileTime28 = sevenZArchiveEntry0.getLastModifiedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The entry doesn't have this timestamp");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(wildcardIterable27);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int1 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.chooseBlockSize((long) 32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        byte[] byteArray2 = zipLong1.getBytes();
        byte[] byteArray3 = zipLong1.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = org.apache.commons.compress.archivers.tar.TarUtils.formatNameBytes("never", byteArray3, 53, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[80, 75, 48, 48]");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[80, 75, 48, 48]");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        boolean boolean5 = sevenZArchiveEntry0.isAntiItem();
        sevenZArchiveEntry0.setCreationDate((long) 131);
        sevenZArchiveEntry0.setDirectory(true);
        sevenZArchiveEntry0.setHasAccessDate(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        long long3 = cpioArchiveEntry1.getUID();
        long long4 = cpioArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.io.File file0 = null;
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy1 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        org.apache.commons.compress.java.util.jar.Pack200.Unpacker unpacker2 = org.apache.commons.compress.java.util.jar.Pack200.newUnpacker();
        java.util.SortedMap<java.lang.String, java.lang.String> strMap3 = unpacker2.properties();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream4 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy1, (java.util.Map<java.lang.String, java.lang.String>) strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy1);
        org.junit.Assert.assertNotNull(unpacker2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.utils.FixedLengthBlockOutputStream fixedLengthBlockOutputStream6 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream((java.nio.channels.WritableByteChannel) seekableByteChannel1, (int) (byte) 0);
        fixedLengthBlockOutputStream6.flushBlock();
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier3 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream deflateCompressorInputStream4 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream7 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) closeShieldFilterInputStream1, 128, "pack.field.attribute.");
        closeShieldFilterInputStream1.close();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField14 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = closeShieldFilterInputStream1.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[10, -1, 100]");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.compress.compressors.CompressorStreamFactory compressorStreamFactory1 = new org.apache.commons.compress.compressors.CompressorStreamFactory(false);
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream12 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream8);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream13 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream14 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream12);
        gzipCompressorOutputStream14.flush();
        org.apache.commons.compress.compressors.CompressorOutputStream compressorOutputStream16 = compressorStreamFactory1.createCompressorOutputStream("lzma", (java.io.OutputStream) gzipCompressorOutputStream14);
        // The following exception was thrown during execution in test generation
        try {
            compressorStreamFactory1.setDecompressConcatenated(true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot override the setting defined by the constructor");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(compressorOutputStream16);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "xz");
        long long19 = cpioArchiveInputStream17.skip((long) 84446);
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveInputStream17.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.compress.archivers.zip.Zip64RequiredException zip64RequiredException1 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException("pass");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.compress.archivers.examples.Archiver archiver0 = new org.apache.commons.compress.archivers.examples.Archiver();
        org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator2 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator();
        java.io.OutputStream outputStream3 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream4 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream3);
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream4.write(byteArray6);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream8 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream9 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream4);
        parallelScatterZipCreator2.writeTo(zipArchiveOutputStream9);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream11 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9);
        org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream9, (short) (byte) 2, 8);
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            archiver0.create("pack.keep.file.order", (java.io.OutputStream) cpioArchiveOutputStream14, file15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.compress.archivers.ArchiveException; message: Archiver: pack.keep.file.order not found.");
        } catch (org.apache.commons.compress.archivers.ArchiveException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 33, 0]");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader2 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader2.setCentralDirectoryData(byteArray4);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField6 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("LiteralBlock starting at 100 with length 1", byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 8, byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipFile zipFile1 = new org.apache.commons.compress.archivers.zip.ZipFile("strip");
            org.junit.Assert.fail("Expected exception of type java.nio.file.NoSuchFileException; message: strip");
        } catch (java.nio.file.NoSuchFileException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        int int12 = tarArchiveInputStream11.getRecordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.ArchiveEntry archiveEntry13 = tarArchiveInputStream11.getNextEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 512 + "'", int12 == 512);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.arj.ArjArchiveInputStream arjArchiveInputStream15 = new org.apache.commons.compress.archivers.arj.ArjArchiveInputStream((java.io.InputStream) tarArchiveInputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
        java.lang.String str2 = x7875_NewUnix0.toString();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0x7875 Zip Extra Field: UID=1000 GID=1000" + "'", str2, "0x7875 Zip Extra Field: UID=1000 GID=1000");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream6 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        arArchiveOutputStream6.finish();
        // The following exception was thrown during execution in test generation
        try {
            arArchiveOutputStream6.closeArchiveEntry();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Stream has already been finished");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        int int1 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt((byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream5 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.archivers.jar.JarArchiveOutputStream jarArchiveOutputStream7 = new org.apache.commons.compress.archivers.jar.JarArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, "pass");
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) jarArchiveOutputStream7, (int) (byte) 120, true);
        // The following exception was thrown during execution in test generation
        try {
            zstdCompressorOutputStream10.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        long long6 = cpioArchiveInputStream2.skip((long) 29127);
        byte[] byteArray7 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.matches(byteArray7, 49152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger0 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger1 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger2 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong3 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField4 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger0, zipEightByteInteger1, zipEightByteInteger2, zipLong3);
        byte[] byteArray5 = zip64ExtendedInformationExtraField4.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger6 = zip64ExtendedInformationExtraField4.getCompressedSize();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO;
        zip64ExtendedInformationExtraField4.setRelativeHeaderOffset(zipEightByteInteger7);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore10 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor11 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore10);
        long long12 = streamCompressor11.getCrc32();
        long long13 = streamCompressor11.getCrc32();
        long long14 = streamCompressor11.getCrc32();
        boolean boolean15 = zipEightByteInteger7.equals((java.lang.Object) long14);
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore16 = null;
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore18 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor19 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore18);
        long long20 = streamCompressor19.getCrc32();
        org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream21 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream(scatterGatherBackingStore16, streamCompressor19);
        boolean boolean22 = zipEightByteInteger7.equals((java.lang.Object) scatterZipOutputStream21);
        java.io.OutputStream outputStream23 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream24 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream23);
        byte[] byteArray26 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream24.write(byteArray26);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream28 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream24);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream29 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream24);
        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean35 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray33, (int) (short) 10);
        byte[] byteArray38 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean39 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray33, byteArray38);
        byte[] byteArray40 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray33);
        zipArchiveOutputStream29.writePreamble(byteArray40);
        zipArchiveOutputStream29.finish();
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy43 = null;
        zipArchiveOutputStream29.setCreateUnicodeExtraFields(unicodeExtraFieldPolicy43);
        org.apache.commons.compress.archivers.ar.ArArchiveOutputStream arArchiveOutputStream45 = new org.apache.commons.compress.archivers.ar.ArArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream29);
        long long46 = zipArchiveOutputStream29.getBytesWritten();
        // The following exception was thrown during execution in test generation
        try {
            scatterZipOutputStream21.writeTo(zipArchiveOutputStream29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipLong3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger6);
        org.junit.Assert.assertNotNull(zipEightByteInteger7);
        org.junit.Assert.assertNotNull(streamCompressor11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(streamCompressor19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray26), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 25L + "'", long46 == 25L);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry4 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean5 = tarArchiveEntry4.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry9 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean10 = tarArchiveEntry4.equals(tarArchiveEntry9);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry14 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime15 = null;
        tarArchiveEntry14.setStatusChangeTime(fileTime15);
        tarArchiveEntry14.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry22 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean23 = tarArchiveEntry14.equals(tarArchiveEntry22);
        java.nio.file.attribute.FileTime fileTime25 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry22.setLastModifiedTime(fileTime25);
        tarArchiveEntry9.setLastAccessTime(fileTime25);
        java.util.Date date29 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime30 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date29);
        tarArchiveEntry9.setModTime(fileTime30);
        boolean boolean32 = dumpArchiveEntry0.equals((java.lang.Object) fileTime30);
        java.util.Date date33 = dumpArchiveEntry0.getAccessTime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(fileTime25);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(date33);
        org.junit.Assert.assertEquals(date33.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream6 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, 263);
        int int7 = tarArchiveInputStream6.getRecordSize();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = tarArchiveInputStream6.getCurrentEntry();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 512 + "'", int7 == 512);
        org.junit.Assert.assertNull(tarArchiveEntry8);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField0 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField();
        byte[] byteArray1 = unicodePathExtraField0.getLocalFileDataData();
        long long2 = unicodePathExtraField0.getNameCRC32();
        byte[] byteArray3 = unicodePathExtraField0.getUnicodeName();
        org.junit.Assert.assertNull(byteArray1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream(inputStream0);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream5 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream2, 508, 31);
        long long6 = zstdCompressorInputStream2.getCompressedCount();
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream9 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zstdCompressorInputStream2, (long) 10240, (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian((java.io.InputStream) cRC32VerifyingInputStream9, 60011);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can't read more than eight bytes into a long value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION pERMISSION0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE;
        org.junit.Assert.assertTrue("'" + pERMISSION0 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE + "'", pERMISSION0.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.PERMISSION.USER_WRITE));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField0 = null;
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry2 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit3 = null;
        zipArchiveEntry2.setGeneralPurposeBit(generalPurposeBit3);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray6 = zipArchiveEntry2.getExtraFields(false);
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.mergeLocalFileDataData(zipExtraFieldArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField11 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.fillExtraField(zipExtraField0, byteArray7, 84446, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipExtraFieldArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[]");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        boolean boolean4 = sevenZArchiveEntry0.isAntiItem();
        int int5 = sevenZArchiveEntry0.getCrc();
        sevenZArchiveEntry0.setHasStream(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader4 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray6 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader4.setCentralDirectoryData(byteArray6);
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("LiteralBlock starting at 100 with length 1", byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            jarMarker0.parseFromLocalFileData(byteArray6, 0, 6);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: JarMarker doesn't expect any data");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 0, 0, 0, 0, 0]");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        // The following exception was thrown during execution in test generation
        try {
            framedLZ4CompressorOutputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        long long1 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(256L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 116444736002560000L + "'", long1 == 116444736002560000L);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.String str0 = org.apache.commons.compress.archivers.ArchiveStreamFactory.ZIP;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "zip" + "'", str0, "zip");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField unparseableExtraField0 = org.apache.commons.compress.archivers.zip.ExtraFieldUtils.UnparseableExtraField.THROW;
        int int1 = unparseableExtraField0.getKey();
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = new org.apache.commons.compress.archivers.zip.GeneralPurposeBit();
        boolean boolean3 = generalPurposeBit2.usesDataDescriptor();
        boolean boolean4 = generalPurposeBit2.usesUTF8ForNames();
        byte[] byteArray5 = generalPurposeBit2.encode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipExtraField zipExtraField10 = unparseableExtraField0.onUnparseableExtraField(byteArray5, (int) (byte) 55, 156, false, 21);
            org.junit.Assert.fail("Expected exception of type java.util.zip.ZipException; message: Bad extra field starting at 55.  Block length of 21 bytes exceeds remaining data of 152 bytes.");
        } catch (java.util.zip.ZipException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unparseableExtraField0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0]");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.io.File file0 = null;
        org.apache.commons.compress.compressors.pack200.Pack200Strategy pack200Strategy1 = org.apache.commons.compress.compressors.pack200.Pack200Strategy.TEMP_FILE;
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream gzipCompressorOutputStream7 = new org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream3);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters8 = null;
        org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream framedSnappyCompressorOutputStream9 = new org.apache.commons.compress.compressors.snappy.FramedSnappyCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream3, parameters8);
        framedSnappyCompressorOutputStream9.finish();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("ISO-8859-1", true);
        boolean boolean14 = tarArchiveEntry13.isGNUSparse();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = tarArchiveEntry13.getExtraPaxHeaders();
        org.apache.commons.compress.compressors.FileNameUtil fileNameUtil17 = new org.apache.commons.compress.compressors.FileNameUtil(strMap15, "0x5455 Zip Extra Field: Flags=0 ");
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream18 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) framedSnappyCompressorOutputStream9, strMap15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream pack200CompressorInputStream19 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream(file0, pack200Strategy1, strMap15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pack200Strategy1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        // The following exception was thrown during execution in test generation
        try {
            java.nio.channels.SeekableByteChannel seekableByteChannel27 = multiReadOnlySeekableByteChannel23.position((long) (byte) 48, (long) (byte) 52);
            org.junit.Assert.fail("Expected exception of type java.nio.channels.ClosedChannelException; message: null");
        } catch (java.nio.channels.ClosedChannelException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream bZip2CompressorOutputStream7 = new org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1, 1);
        bZip2CompressorOutputStream7.finish();
        bZip2CompressorOutputStream7.finish();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.io.File file0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream scatterZipOutputStream2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.fileBased(file0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.util.concurrent.ExecutorService executorService0 = null;
        java.nio.file.Path path1 = null;
        org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier defaultBackingStoreSupplier2 = new org.apache.commons.compress.archivers.zip.DefaultBackingStoreSupplier(path1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator parallelScatterZipCreator4 = new org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator(executorService0, (org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier) defaultBackingStoreSupplier2, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Compression level is expected between -1~9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 88, (byte) 55, (byte) 48, (byte) 0, (byte) 55 };
        org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField unicodeCommentExtraField8 = new org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField("bzip2", byteArray7);
        unicodeCommentExtraField8.setNameCRC32((long) 11);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 88, 55, 48, 0, 55]");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream5 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) closeShieldFilterInputStream1, false, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        zipArchiveEntry1.setMethod((int) (byte) 88);
        java.nio.file.attribute.FileTime fileTime4 = zipArchiveEntry1.getCreationTime();
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize blockSize5 = org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4;
        org.apache.commons.compress.compressors.lz77support.Parameters parameters6 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters7 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, parameters6);
        org.apache.commons.compress.compressors.lz77support.Parameters parameters8 = null;
        org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters parameters9 = new org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.Parameters(blockSize5, parameters8);
        boolean boolean10 = zipArchiveEntry1.equals((java.lang.Object) blockSize5);
        java.nio.file.attribute.FileTime fileTime11 = zipArchiveEntry1.getLastModifiedTime();
        zipArchiveEntry1.setInternalAttributes(14);
        org.junit.Assert.assertNull(fileTime4);
        org.junit.Assert.assertTrue("'" + blockSize5 + "' != '" + org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4 + "'", blockSize5.equals(org.apache.commons.compress.compressors.lz4.FramedLZ4CompressorOutputStream.BlockSize.M4));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(fileTime11);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.compress.archivers.zip.JarMarker jarMarker0 = new org.apache.commons.compress.archivers.zip.JarMarker();
        byte[] byteArray1 = jarMarker0.getLocalFileDataData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = jarMarker0.getCentralDirectoryLength();
        byte[] byteArray3 = jarMarker0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = jarMarker0.getCentralDirectoryLength();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.compress.archivers.zip.AsiExtraField asiExtraField0 = new org.apache.commons.compress.archivers.zip.AsiExtraField();
        byte[] byteArray1 = asiExtraField0.getLocalFileDataData();
        int int2 = asiExtraField0.getUserId();
        java.lang.Object obj3 = asiExtraField0.clone();
        int int4 = asiExtraField0.getMode();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[118, 104, -118, -29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        boolean boolean1 = dumpArchiveEntry0.isDirectory();
        int int2 = dumpArchiveEntry0.getGeneration();
        boolean boolean3 = dumpArchiveEntry0.isFifo();
        boolean boolean4 = dumpArchiveEntry0.isDeleted();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9, 16);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream1 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream2 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream1);
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream2.write(byteArray4);
        x0016_CertificateIdForCentralDirectory0.setCentralDirectoryData(byteArray4);
        org.apache.commons.compress.archivers.zip.ZipShort zipShort7 = x0016_CertificateIdForCentralDirectory0.getCentralDirectoryLength();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean13 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray11, (int) (short) 10);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean17 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray11, byteArray16);
        byte[] byteArray18 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        boolean boolean20 = org.apache.commons.compress.archivers.arj.ArjArchiveInputStream.matches(byteArray11, (int) (short) 100);
        x0016_CertificateIdForCentralDirectory0.setLocalFileDataData(byteArray11);
        byte[] byteArray22 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray11);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(zipShort7);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[0, 0, 10]");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp x5455_ExtendedTimestamp0 = new org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong1 = x5455_ExtendedTimestamp0.getCreateTime();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x5455_ExtendedTimestamp0.getCentralDirectoryLength();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort3 = x5455_ExtendedTimestamp0.getLocalFileDataLength();
        java.nio.file.attribute.FileTime fileTime5 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime6 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime5);
        long long7 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime6);
        x5455_ExtendedTimestamp0.setCreateFileTime(fileTime6);
        java.io.OutputStream outputStream9 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream9);
        byte[] byteArray12 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream10.write(byteArray12);
        boolean boolean15 = org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byteArray12, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray12, 29127);
        boolean boolean19 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray12, (int) (short) 8);
        boolean boolean20 = x5455_ExtendedTimestamp0.equals((java.lang.Object) (short) 8);
        java.io.OutputStream outputStream21 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream22 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream21);
        byte[] byteArray24 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream22.write(byteArray24);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream26 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream22);
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream zipArchiveOutputStream27 = new org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream((java.io.OutputStream) zstdCompressorOutputStream22);
        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean33 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray31, (int) (short) 10);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean37 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray31, byteArray36);
        byte[] byteArray38 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray31);
        zipArchiveOutputStream27.writePreamble(byteArray38);
        zipArchiveOutputStream27.finish();
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry42 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry42.setInode((long) 2048);
        java.util.Date date45 = cpioArchiveEntry42.getLastModifiedDate();
        cpioArchiveEntry42.setChksum(0L);
        boolean boolean48 = zipArchiveOutputStream27.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry42);
        java.util.Date date49 = cpioArchiveEntry42.getLastModifiedDate();
        x5455_ExtendedTimestamp0.setAccessJavaTime(date49);
        org.junit.Assert.assertNull(zipLong1);
        org.junit.Assert.assertNotNull(zipShort2);
        org.junit.Assert.assertNotNull(zipShort3);
        org.junit.Assert.assertNotNull(fileTime5);
        org.junit.Assert.assertNotNull(fileTime6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 116444741040000000L + "'", long7 == 116444741040000000L);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray31), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray36), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray38), "[10, 0, 0]");
        org.junit.Assert.assertNotNull(date45);
        org.junit.Assert.assertEquals(date45.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(date49);
        org.junit.Assert.assertEquals(date49.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.nio.file.Path path0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarFile tarFile2 = new org.apache.commons.compress.archivers.tar.TarFile(path0, "pack.unknown.attribute");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.Class<java.util.Map<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider>> strMapClass0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.utils.ServiceLoaderIterator<java.util.Map<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider>> strMapItor1 = new org.apache.commons.compress.utils.ServiceLoaderIterator<java.util.Map<java.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider>>(strMapClass0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Service interface cannot be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader0 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlgorithm1 = x0017_StrongEncryptionHeader0.getHashAlgorithm();
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader2 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray4 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader2.setCentralDirectoryData(byteArray4);
        byte[] byteArray6 = x0017_StrongEncryptionHeader2.getLocalFileDataData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean12 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray10, (int) (short) 10);
        x0017_StrongEncryptionHeader2.setCentralDirectoryData(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            x0017_StrongEncryptionHeader0.parseFromLocalFileData(byteArray10, 488, 476);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(hashAlgorithm1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream5 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        // The following exception was thrown during execution in test generation
        try {
            brotliCompressorInputStream5.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream13 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zipArchiveInputStream8, (int) (byte) 2);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry14 = zipArchiveInputStream8.getNextZipEntry();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream17 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream((java.io.InputStream) zipArchiveInputStream8, (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: blockSize must be bigger than 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNull(zipArchiveEntry14);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        java.lang.String str1 = gzipParameters0.getFilename();
        gzipParameters0.setFilename("unpack.progress");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream5 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream8 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream5, (int) (byte) 1, "false");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.compress.archivers.zip.X7875_NewUnix x7875_NewUnix0 = new org.apache.commons.compress.archivers.zip.X7875_NewUnix();
        byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort2 = x7875_NewUnix0.getHeaderId();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertNotNull(zipShort2);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        // The following exception was thrown during execution in test generation
        try {
            long long24 = brotliCompressorInputStream22.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Brotli stream decoding failed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.io.InputStream inputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.z.ZCompressorInputStream zCompressorInputStream2 = new org.apache.commons.compress.compressors.z.ZCompressorInputStream(inputStream0, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry1.setUID((long) 128);
        cpioArchiveEntry1.setUID(6L);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str0 = org.apache.commons.compress.java.util.jar.Pack200.Packer.PASS_FILE_PFX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "pack.pass.file." + "'", str0, "pack.pass.file.");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getGID();
        long long6 = cpioArchiveEntry1.getDeviceMaj();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = dumpArchiveEntry0.getHeaderType();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        dumpArchiveEntry0.setType(tYPE2);
        java.util.Date date4 = dumpArchiveEntry0.getCreationTime();
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
        org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE2.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 01:00:00 CET 1970");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        int int1 = dumpArchiveEntry0.getGroupId();
        boolean boolean2 = dumpArchiveEntry0.isBlkDev();
        dumpArchiveEntry0.setSize((long) 16877);
        boolean boolean5 = dumpArchiveEntry0.isFile();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.io.File file0 = null;
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder1 = new org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions2 = builder1.build();
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.Builder builder4 = builder1.withMaxMemoryLimitInKb(60011);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, sevenZFileOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sevenZFileOptions2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(sevenZFileOptions5);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField resourceAlignmentExtraField2 = new org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField((int) (byte) 1, false);
        byte[] byteArray3 = resourceAlignmentExtraField2.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipShort zipShort4 = resourceAlignmentExtraField2.getHeaderId();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0]");
        org.junit.Assert.assertNotNull(zipShort4);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        boolean boolean12 = brotliCompressorInputStream9.markSupported();
        long long13 = brotliCompressorInputStream9.getUncompressedCount();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        zipArchiveEntry1.setComment("apks");
        boolean boolean6 = zipArchiveEntry1.isDirectory();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger7 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger8 = null;
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger9 = null;
        org.apache.commons.compress.archivers.zip.ZipLong zipLong10 = org.apache.commons.compress.archivers.zip.ZipLong.SINGLE_SEGMENT_SPLIT_MARKER;
        org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField11 = new org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField(zipEightByteInteger7, zipEightByteInteger8, zipEightByteInteger9, zipLong10);
        byte[] byteArray12 = zip64ExtendedInformationExtraField11.getCentralDirectoryData();
        org.apache.commons.compress.archivers.zip.ZipEightByteInteger zipEightByteInteger13 = zip64ExtendedInformationExtraField11.getCompressedSize();
        zipArchiveEntry1.addExtraField((org.apache.commons.compress.archivers.zip.ZipExtraField) zip64ExtendedInformationExtraField11);
        zipArchiveEntry1.setAlignment(1024);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(zipLong10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[80, 75, 48, 48]");
        org.junit.Assert.assertNull(zipEightByteInteger13);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry6 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime7 = null;
        tarArchiveEntry6.setStatusChangeTime(fileTime7);
        tarArchiveEntry6.setUserName("unpack.progress");
        tarArchiveEntry6.setUserId((long) 29127);
        tarArchiveEntry6.setMode(263);
        boolean boolean15 = tarArchiveEntry6.isPaxGNUSparse();
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.putArchiveEntry((org.apache.commons.compress.archivers.ArchiveEntry) tarArchiveEntry6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.commons.compress.archivers.tar.TarArchiveEntry cannot be cast to org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.compress.parallel.ScatterGatherBackingStore scatterGatherBackingStore1 = null;
        org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor2 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(3, scatterGatherBackingStore1);
        streamCompressor2.close();
        org.apache.commons.compress.archivers.zip.ZipLong zipLong4 = org.apache.commons.compress.archivers.zip.ZipLong.DD_SIG;
        byte[] byteArray5 = zipLong4.getBytes();
        // The following exception was thrown during execution in test generation
        try {
            streamCompressor2.writeCounted(byteArray5, 32768, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(streamCompressor2);
        org.junit.Assert.assertNotNull(zipLong4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[80, 75, 7, 8]");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry dumpArchiveEntry0 = new org.apache.commons.compress.archivers.dump.DumpArchiveEntry();
        org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE sEGMENT_TYPE1 = dumpArchiveEntry0.getHeaderType();
        org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE tYPE2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT;
        dumpArchiveEntry0.setType(tYPE2);
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry4 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry4.setHasLastModifiedDate(false);
        long long7 = sevenZArchiveEntry4.getSize();
        sevenZArchiveEntry4.setHasStream(false);
        sevenZArchiveEntry4.setSize(116444736001000000L);
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry13 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry13.setInode((long) 2048);
        java.util.Date date16 = cpioArchiveEntry13.getLastModifiedDate();
        long long17 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(date16);
        sevenZArchiveEntry4.setCreationDate(date16);
        dumpArchiveEntry0.setCreationTime(date16);
        org.junit.Assert.assertNull(sEGMENT_TYPE1);
        org.junit.Assert.assertTrue("'" + tYPE2 + "' != '" + org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT + "'", tYPE2.equals(org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE.WHITEOUT));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 116444736000000000L + "'", long17 == 116444736000000000L);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream5 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream3, 10);
        java.io.OutputStream outputStream7 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream7);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream8.write(byteArray10);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream12 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream8);
        long long14 = org.apache.commons.compress.utils.IOUtils.copyRange((java.io.InputStream) cpioArchiveInputStream5, (long) 512, (java.io.OutputStream) zstdCompressorOutputStream8, 36864);
        sevenZOutputFile2.write((java.io.InputStream) cpioArchiveInputStream5);
        // The following exception was thrown during execution in test generation
        try {
            sevenZOutputFile2.close();
            org.junit.Assert.fail("Expected exception of type java.nio.channels.NonWritableChannelException; message: null");
        } catch (java.nio.channels.NonWritableChannelException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean4 = zipEncoding2.canEncode("");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader5 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray7 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader5.setCentralDirectoryData(byteArray7);
        byte[] byteArray9 = x0017_StrongEncryptionHeader5.getLocalFileDataData();
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean15 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray13, (int) (short) 10);
        x0017_StrongEncryptionHeader5.setCentralDirectoryData(byteArray13);
        java.lang.String str17 = zipEncoding2.decode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipLong.putLong((long) 'a', byteArray13, (int) (byte) 55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(zipEncoding2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\000\n" + "'", str17, "\000\000\n");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        int int3 = sevenZArchiveEntry0.getWindowsAttributes();
        sevenZArchiveEntry0.setHasCrc(true);
        sevenZArchiveEntry0.setAntiItem(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int0 = org.apache.commons.compress.archivers.zip.UnixStat.LINK_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 40960 + "'", int0 == 40960);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry21 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        cpioArchiveEntry21.setInode((long) 2048);
        java.util.Date date24 = cpioArchiveEntry21.getLastModifiedDate();
        cpioArchiveEntry21.setChksum(0L);
        boolean boolean27 = zipArchiveOutputStream6.canWriteEntryData((org.apache.commons.compress.archivers.ArchiveEntry) cpioArchiveEntry21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream tarArchiveOutputStream30 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream((java.io.OutputStream) zipArchiveOutputStream6, (int) (short) 10, 148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Block size must be a multiple of 512 bytes. Attempt to use set size of 10");
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
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Thu Jan 01 01:00:00 CET 1970");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream11 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) brotliCompressorInputStream9, "pass");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.z.ZCompressorInputStream zCompressorInputStream12 = new org.apache.commons.compress.compressors.z.ZCompressorInputStream((java.io.InputStream) tarArchiveInputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: No current tar entry");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy unicodeExtraFieldPolicy0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE;
        java.lang.String str1 = unicodeExtraFieldPolicy0.toString();
        org.junit.Assert.assertNotNull(unicodeExtraFieldPolicy0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "not encodeable" + "'", str1, "not encodeable");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        cpioArchiveEntry1.setUID((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            cpioArchiveEntry1.setRemoteDevice(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean5 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray3, (int) (short) 10);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean9 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray3, byteArray8);
        byte[] byteArray10 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray3);
        long long11 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = org.apache.commons.compress.archivers.tar.TarArchiveInputStream.matches(byteArray10, 345);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 257");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.compress.archivers.jar.JarArchiveEntry jarArchiveEntry1 = new org.apache.commons.compress.archivers.jar.JarArchiveEntry("!<arch>\n");
        java.util.jar.Attributes attributes2 = jarArchiveEntry1.getManifestAttributes();
        org.junit.Assert.assertNull(attributes2);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.utils.CloseShieldFilterInputStream closeShieldFilterInputStream1 = new org.apache.commons.compress.utils.CloseShieldFilterInputStream(inputStream0);
        closeShieldFilterInputStream1.close();
        closeShieldFilterInputStream1.close();
        closeShieldFilterInputStream1.close();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory5 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream6 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream7 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream6);
        byte[] byteArray9 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream7.write(byteArray9);
        x0016_CertificateIdForCentralDirectory5.setCentralDirectoryData(byteArray9);
        boolean boolean13 = org.apache.commons.compress.archivers.ar.ArArchiveInputStream.matches(byteArray9, 263);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = closeShieldFilterInputStream1.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray4 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel5 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray4);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile6 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel5);
        org.apache.commons.compress.archivers.tar.TarFile tarFile7 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel5);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream8 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) (byte) 49, (long) 256, seekableByteChannel5);
        org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream9 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream((long) 32, (long) (short) 12, seekableByteChannel5);
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray10 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel11 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray10);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile12 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel11);
        org.apache.commons.compress.archivers.tar.TarFile tarFile13 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel11);
        char[] charArray17 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile18 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel11, charArray17);
        org.apache.commons.compress.archivers.sevenz.SevenZFileOptions sevenZFileOptions19 = org.apache.commons.compress.archivers.sevenz.SevenZFileOptions.DEFAULT;
        boolean boolean20 = sevenZFileOptions19.getUseDefaultNameForUnnamedEntries();
        boolean boolean21 = sevenZFileOptions19.getUseDefaultNameForUnnamedEntries();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(seekableByteChannel5, charArray17, sevenZFileOptions19);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray4);
        org.junit.Assert.assertNotNull(seekableByteChannel5);
        org.junit.Assert.assertNotNull(seekableByteChannelArray10);
        org.junit.Assert.assertNotNull(seekableByteChannel11);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, 4,  ]");
        org.junit.Assert.assertNotNull(sevenZFileOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int0 = org.apache.commons.compress.archivers.cpio.CpioConstants.C_IXGRP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.compress.compressors.gzip.GzipParameters gzipParameters0 = new org.apache.commons.compress.compressors.gzip.GzipParameters();
        int int1 = gzipParameters0.getOperatingSystem();
        gzipParameters0.setBufferSize((int) (byte) 53);
        long long4 = gzipParameters0.getModificationTime();
        int int5 = gzipParameters0.getCompressionLevel();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 255 + "'", int1 == 255);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.compress.changes.ChangeSet changeSet0 = new org.apache.commons.compress.changes.ChangeSet();
        changeSet0.delete("hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream lZMACompressorOutputStream10 = new org.apache.commons.compress.compressors.lzma.LZMACompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        java.io.OutputStream outputStream11 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream12 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream11);
        byte[] byteArray14 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream12.write(byteArray14);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream16 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream12);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream19 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream16, (int) 'a', false);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray23, (int) (short) 10);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean29 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray23, byteArray28);
        byte[] byteArray30 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(byteArray23);
        zstdCompressorOutputStream19.write(byteArray30, 1, 29127);
        long long34 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(byteArray30);
        pack200CompressorOutputStream9.write(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger37 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(byteArray30, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 138");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray28), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[10, 0, 0]");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream11 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9, (int) (byte) 83);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream cpioArchiveOutputStream14 = new org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream((java.io.OutputStream) pack200CompressorOutputStream9, (short) 3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown format: 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry();
        sevenZArchiveEntry0.setHasLastModifiedDate(false);
        sevenZArchiveEntry0.setCreationDate((long) 61440);
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean9 = tarArchiveEntry8.isPaxGNU1XSparse();
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean14 = tarArchiveEntry8.equals(tarArchiveEntry13);
        tarArchiveEntry13.setUserName("keep");
        java.lang.String str17 = tarArchiveEntry13.getLinkName();
        java.nio.file.attribute.FileTime fileTime19 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        java.nio.file.attribute.FileTime fileTime20 = org.apache.commons.compress.utils.TimeUtils.truncateToHundredNanos(fileTime19);
        long long21 = org.apache.commons.compress.utils.TimeUtils.toNtfsTime(fileTime20);
        tarArchiveEntry13.setStatusChangeTime(fileTime20);
        sevenZArchiveEntry0.setCreationTime(fileTime20);
        sevenZArchiveEntry0.setHasCrc(true);
        boolean boolean26 = sevenZArchiveEntry0.getHasCrc();
        java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> wildcardIterable27 = sevenZArchiveEntry0.getContentMethods();
        java.util.Date date29 = org.apache.commons.compress.utils.TimeUtils.ntfsTimeToDate((long) 5);
        java.nio.file.attribute.FileTime fileTime30 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date29);
        sevenZArchiveEntry0.setAccessTime(fileTime30);
        sevenZArchiveEntry0.setCrc((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(fileTime19);
        org.junit.Assert.assertNotNull(fileTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 116444741040000000L + "'", long21 == 116444741040000000L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(wildcardIterable27);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Jan 01 01:00:00 CET 1601");
        org.junit.Assert.assertNotNull(fileTime30);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.compress.archivers.examples.Expander expander0 = new org.apache.commons.compress.archivers.examples.Expander();
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean6 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray4, (int) (short) 10);
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        boolean boolean10 = org.apache.commons.compress.utils.ArchiveUtils.isEqual(byteArray4, byteArray9);
        org.apache.commons.compress.archivers.tar.TarFile tarFile12 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray4, false);
        java.nio.file.Path path13 = null;
        expander0.expand(tarFile12, path13);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        org.apache.commons.compress.archivers.zip.UnicodePathExtraField unicodePathExtraField20 = new org.apache.commons.compress.archivers.zip.UnicodePathExtraField("UTF-16LE", byteArray19);
        org.apache.commons.compress.archivers.tar.TarFile tarFile21 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray19);
        java.io.File file22 = null;
        expander0.expand(tarFile21, file22);
        java.io.File file24 = null;
        java.io.File file25 = null;
        // The following exception was thrown during execution in test generation
        try {
            expander0.expand(file24, file25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[10, -1, 100]");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        java.nio.file.attribute.FileTime fileTime14 = org.apache.commons.compress.utils.TimeUtils.unixTimeToFileTime((long) 504);
        tarArchiveEntry11.setLastModifiedTime(fileTime14);
        long long16 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(fileTime14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(fileTime14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 504L + "'", long16 == 504L);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray12 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) zipArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = org.apache.commons.compress.compressors.zstandard.ZstdUtils.matches(byteArray12, (int) (byte) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("pack.segment.limit");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream4 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "bzip2");
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream7 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) zipArchiveInputStream4, 100L, (int) '#');
        org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier inputStreamByteSupplier8 = new org.apache.commons.compress.utils.ByteUtils.InputStreamByteSupplier((java.io.InputStream) zipArchiveInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream13 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream4, "ustar ", false, false, false);
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: ustar ");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder0 = org.apache.commons.compress.compressors.lz4.BlockLZ4CompressorOutputStream.createParameterBuilder();
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder2 = builder0.withLazyThreshold(464);
        org.apache.commons.compress.compressors.lz77support.Parameters.Builder builder4 = builder0.withNiceBackReferenceLength(96);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
        char[] charArray7 = new char[] { '#', '4', ' ' };
        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile8 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1, charArray7);
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry sevenZArchiveEntry11 = sevenZOutputFile8.createArchiveEntry(file9, "ustar ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
        org.junit.Assert.assertNotNull(seekableByteChannel1);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, 4,  ]");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.compress.archivers.arj.ArjArchiveEntry arjArchiveEntry0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry();
        java.util.Date date1 = arjArchiveEntry0.getLastModifiedDate();
        java.nio.file.attribute.FileTime fileTime2 = org.apache.commons.compress.utils.TimeUtils.toFileTime(date1);
        org.junit.Assert.assertNotNull(date1);
        org.junit.Assert.assertEquals(date1.toString(), "Fri Nov 30 00:00:00 CET 1979");
        org.junit.Assert.assertNotNull(fileTime2);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry3 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        java.nio.file.attribute.FileTime fileTime4 = null;
        tarArchiveEntry3.setStatusChangeTime(fileTime4);
        tarArchiveEntry3.setUserName("unpack.progress");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry11 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry("", (byte) -1, true);
        boolean boolean12 = tarArchiveEntry3.equals(tarArchiveEntry11);
        boolean boolean13 = tarArchiveEntry3.isPaxHeader();
        long long14 = tarArchiveEntry3.getRealSize();
        java.util.Date date16 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.ntfsTimeToJavaTime((long) (short) -1);
        tarArchiveEntry3.setModTime(date16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Mon Jan 01 00:59:59 CET 1601");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.tar.TarArchiveInputStream tarArchiveInputStream14 = new org.apache.commons.compress.archivers.tar.TarArchiveInputStream((java.io.InputStream) zstdCompressorInputStream10, 508, 263, "lzma");
        org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry15 = tarArchiveInputStream14.getNextTarEntry();
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        boolean boolean24 = org.apache.commons.compress.archivers.jar.JarArchiveInputStream.matches(byteArray22, (int) (short) 100);
        boolean boolean26 = org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byteArray22, 511);
        org.apache.commons.compress.archivers.tar.TarFile tarFile28 = new org.apache.commons.compress.archivers.tar.TarFile(byteArray22, true);
        boolean boolean30 = org.apache.commons.compress.compressors.lzma.LZMAUtils.matches(byteArray22, 21);
        int int33 = tarArchiveInputStream14.read(byteArray22, 16877, 49152);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(tarArchiveEntry15);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 0, 10, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.compress.archivers.cpio.CpioArchiveEntry cpioArchiveEntry1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry("");
        long long2 = cpioArchiveEntry1.getGID();
        java.nio.charset.Charset charset3 = org.apache.commons.compress.utils.Charsets.US_ASCII;
        int int4 = cpioArchiveEntry1.getHeaderPadCount(charset3);
        long long5 = cpioArchiveEntry1.getGID();
        long long6 = cpioArchiveEntry1.getSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(charset3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException unsupportedCompressionAlgorithmException1 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException("ustar\000");
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature feature2 = org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR;
        org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException unsupportedZipFeatureException3 = new org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException(feature2);
        unsupportedCompressionAlgorithmException1.addSuppressed((java.lang.Throwable) unsupportedZipFeatureException3);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry5 = unsupportedZipFeatureException3.getEntry();
        org.junit.Assert.assertNotNull(feature2);
        org.junit.Assert.assertNull(zipArchiveEntry5);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.lang.String str1 = org.apache.commons.compress.compressors.xz.XZUtils.getCompressedFilename("ustar\000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ustar\000.xz" + "'", str1, "ustar\000.xz");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream1 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0);
        org.apache.commons.compress.utils.CRC32VerifyingInputStream cRC32VerifyingInputStream4 = new org.apache.commons.compress.utils.CRC32VerifyingInputStream((java.io.InputStream) cpioArchiveInputStream1, (long) (byte) 100, (int) (short) 3);
        long long6 = cRC32VerifyingInputStream4.skip(0L);
        long long8 = cRC32VerifyingInputStream4.skip((long) (byte) 100);
        byte[] byteArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = org.apache.commons.compress.utils.IOUtils.readFully((java.io.InputStream) cRC32VerifyingInputStream4, byteArray9, 263, (int) (byte) 48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream zstdCompressorInputStream10 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.utils.SkipShieldingInputStream skipShieldingInputStream11 = new org.apache.commons.compress.utils.SkipShieldingInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream deflate64CompressorInputStream12 = new org.apache.commons.compress.compressors.deflate64.Deflate64CompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream lZMACompressorInputStream14 = new org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream((java.io.InputStream) deflate64CompressorInputStream12, (int) (short) 3);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: Truncated Deflate64 Stream");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry1 = new org.apache.commons.compress.archivers.zip.ZipArchiveEntry("pack.method.attribute.");
        org.apache.commons.compress.archivers.zip.GeneralPurposeBit generalPurposeBit2 = null;
        zipArchiveEntry1.setGeneralPurposeBit(generalPurposeBit2);
        org.apache.commons.compress.archivers.zip.ZipExtraField[] zipExtraFieldArray5 = zipArchiveEntry1.getExtraFields(false);
        zipArchiveEntry1.setMethod(4);
        org.junit.Assert.assertNotNull(zipExtraFieldArray5);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory0 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory x0016_CertificateIdForCentralDirectory1 = new org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory();
        java.io.OutputStream outputStream2 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream3 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream2);
        byte[] byteArray5 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream3.write(byteArray5);
        x0016_CertificateIdForCentralDirectory1.setCentralDirectoryData(byteArray5);
        x0016_CertificateIdForCentralDirectory0.parseFromLocalFileData(byteArray5, 2, (int) (short) 100);
        org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding12 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding("error.gz");
        boolean boolean14 = zipEncoding12.canEncode("");
        org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader x0017_StrongEncryptionHeader15 = new org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader();
        byte[] byteArray17 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes((long) (byte) 10);
        x0017_StrongEncryptionHeader15.setCentralDirectoryData(byteArray17);
        byte[] byteArray19 = x0017_StrongEncryptionHeader15.getLocalFileDataData();
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        boolean boolean25 = org.apache.commons.compress.archivers.dump.DumpArchiveInputStream.matches(byteArray23, (int) (short) 10);
        x0017_StrongEncryptionHeader15.setCentralDirectoryData(byteArray23);
        java.lang.String str27 = zipEncoding12.decode(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry29 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray5, zipEncoding12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 33, 0]");
        org.junit.Assert.assertNotNull(zipEncoding12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[10, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray23), "[0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\000\n" + "'", str27, "\000\000\n");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int0 = org.apache.commons.compress.archivers.tar.TarConstants.UNAMELEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

//    @Test
//    public void test1496() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest2.test1496");
//        java.nio.channels.SeekableByteChannel[] seekableByteChannelArray0 = new java.nio.channels.SeekableByteChannel[] {};
//        java.nio.channels.SeekableByteChannel seekableByteChannel1 = org.apache.commons.compress.utils.MultiReadOnlySeekableByteChannel.forSeekableByteChannels(seekableByteChannelArray0);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        org.apache.commons.compress.archivers.tar.TarFile tarFile3 = new org.apache.commons.compress.archivers.tar.TarFile(seekableByteChannel1);
//        org.apache.commons.compress.archivers.sevenz.SevenZOutputFile sevenZOutputFile4 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile(seekableByteChannel1);
//        // The following exception was thrown during execution in test generation
//        try {
//            sevenZOutputFile4.closeArchiveEntry();
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(seekableByteChannelArray0);
//        org.junit.Assert.assertNotNull(seekableByteChannel1);
//    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.io.OutputStream outputStream0 = null;
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream1 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream(outputStream0);
        byte[] byteArray3 = org.apache.commons.compress.archivers.zip.ZipUtil.toDosTime((long) 8);
        zstdCompressorOutputStream1.write(byteArray3);
        org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream deflateCompressorOutputStream5 = new org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream((java.io.OutputStream) zstdCompressorOutputStream1);
        org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream zstdCompressorOutputStream8 = new org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5, (int) 'a', false);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream9 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) deflateCompressorOutputStream5);
        org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream pack200CompressorOutputStream10 = new org.apache.commons.compress.compressors.pack200.Pack200CompressorOutputStream((java.io.OutputStream) pack200CompressorOutputStream9);
        org.apache.commons.compress.utils.ByteUtils.toLittleEndian((java.io.OutputStream) pack200CompressorOutputStream10, 116444736001000000L, 0);
        pack200CompressorOutputStream10.write(488);
        // The following exception was thrown during execution in test generation
        try {
            pack200CompressorOutputStream10.finish();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 0, 33, 0]");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        long long4 = cpioArchiveInputStream2.skip(100L);
        org.apache.commons.compress.archivers.jar.JarArchiveInputStream jarArchiveInputStream6 = new org.apache.commons.compress.archivers.jar.JarArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "pack.segment.limit");
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream8 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) cpioArchiveInputStream2, "error");
        org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream brotliCompressorInputStream9 = new org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream((java.io.InputStream) zipArchiveInputStream8);
        org.apache.commons.compress.archivers.zip.ZipArchiveEntry zipArchiveEntry10 = zipArchiveInputStream8.getNextZipEntry();
        org.apache.commons.compress.archivers.zip.ZipArchiveInputStream zipArchiveInputStream11 = new org.apache.commons.compress.archivers.zip.ZipArchiveInputStream((java.io.InputStream) zipArchiveInputStream8);
        byte[] byteArray12 = org.apache.commons.compress.utils.IOUtils.toByteArray((java.io.InputStream) zipArchiveInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.tar.TarArchiveEntry tarArchiveEntry13 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(zipArchiveEntry10);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream cpioArchiveInputStream2 = new org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream(inputStream0, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.compressors.xz.XZCompressorInputStream xZCompressorInputStream4 = new org.apache.commons.compress.compressors.xz.XZCompressorInputStream((java.io.InputStream) cpioArchiveInputStream2, true);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: null");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        // The following exception was thrown during execution in test generation
        try {
            zstdCompressorInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[0, 0, 33, 0]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }
}
